-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.
-- Oracle
-- GROUP BY

SELECT B.HOUR, COUNT(A.ANIMAL_ID) COUNT
FROM ANIMAL_OUTS A
    RIGHT OUTER JOIN
    (
        SELECT (LEVEL - 1) AS HOUR
        FROM DUAL
        CONNECT BY LEVEL >= 0 AND LEVEL <= 24
    ) B
    ON TO_CHAR(A.DATETIME, 'HH24') = B.HOUR
GROUP BY B.HOUR
ORDER BY B.HOUR
;
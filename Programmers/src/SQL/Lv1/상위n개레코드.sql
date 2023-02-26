-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.
-- Oracle
-- SELECT

SELECT
    NAME
FROM
    (
        SELECT
             *
         FROM
             ANIMAL_INS
         ORDER BY
             DATETIME ASC
     )
WHERE
    ROWNUM = 1;
-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 대여 시작일을 기준으로 2022년 8월부터 2022년 10월까지 총 대여 횟수가 5회 이상인 자동차들에 대해서 해당 기간 동안의 월별 자동차 ID 별 총 대여 횟수(컬럼명: RECORDS) 리스트를 출력하는 SQL문을 작성해주세요. 결과는 월을 기준으로 오름차순 정렬하고, 월이 같다면 자동차 ID를 기준으로 내림차순 정렬해주세요. 특정 월의 총 대여 횟수가 0인 경우에는 결과에서 제외해주세요.
-- Oracle
-- GROUP BY

SELECT MONTH, CAR_ID, RECORDS
FROM
(
    SELECT
        MONTH,
        CAR_ID,
        COUNT(CAR_ID) OVER (PARTITION BY MONTH, CAR_ID) AS RECORDS,
        COUNT(CAR_ID) OVER (PARTITION BY CAR_ID) AS ALL_RECORDS
    FROM
    (
        SELECT
            HISTORY_ID,
            TO_NUMBER(LTRIM(TO_CHAR(START_DATE,'MM'), '0')) AS MONTH,
            CAR_ID,
            START_DATE
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE START_DATE >= TO_DATE('20220801','YYYY-MM-DD')
    )
)
WHERE ALL_RECORDS >= 5
GROUP BY MONTH, CAR_ID, RECORDS
ORDER BY MONTH, CAR_ID DESC
;
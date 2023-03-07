-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요. 결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 자동차 종류를 기준으로 오름차순 정렬, 자동차 종류까지 같은 경우 자동차 ID를 기준으로 내림차순 정렬해주세요.
-- Oracle
-- JOIN

SELECT CAR_ID, CAR_TYPE, FEE
FROM
    (
        SELECT C.CAR_ID, C.CAR_TYPE, DAILY_FEE * (100 - DISCOUNT_RATE) * 0.01 * 30 AS FEE
        FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN P, CAR_RENTAL_COMPANY_CAR C,
        (
            SELECT CAR_ID
            FROM
            (
                SELECT CAR_ID,
                    CASE WHEN TO_CHAR(END_DATE, 'YYYY-MM') < '2022-11' OR TO_CHAR(START_DATE, 'YYYY-MM') > '2022-11'
                    THEN 0 ELSE 1 END AS P
                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
            )
            GROUP BY CAR_ID
            HAVING MAX(P) = 0
            ORDER BY CAR_ID DESC
        ) H2
        WHERE P.CAR_TYPE = C.CAR_TYPE
            AND H2.CAR_ID = C.CAR_ID
            AND P.CAR_TYPE IN ('세단','SUV')
            AND P.DURATION_TYPE = '30일 이상'
    )
WHERE FEE BETWEEN 500000 AND 1999999
ORDER BY 3 DESC, 2, 1 DESC
;
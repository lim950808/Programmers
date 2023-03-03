-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 자동차 종류가 '세단'인 자동차들 중 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트를 출력하는 SQL문을 작성해주세요. 자동차 ID 리스트는 중복이 없어야 하며, 자동차 ID를 기준으로 내림차순 정렬해주세요.
-- Oracle
-- String, Date

SELECT C.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR C
WHERE C.CAR_TYPE = '세단'
AND EXISTS (
            SELECT 1 FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
            WHERE TO_CHAR(H.START_DATE,'YYYY-MM') = '2022-10'
            AND H.CAR_ID = C.CAR_ID
           )
ORDER BY 1 DESC
;
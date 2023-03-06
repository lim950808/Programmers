-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
-- Oracle
-- JOIN

SELECT FLAVOR
FROM (
        SELECT F.FLAVOR, (F.TOTAL_ORDER + J.JULY_TOT) AS TOTAL_ORDER
        FROM FIRST_HALF F,
            (
                SELECT FLAVOR, SUM(TOTAL_ORDER) AS JULY_TOT
                FROM JULY
                GROUP BY FLAVOR
            ) J
        WHERE J.FLAVOR = F.FLAVOR
        ORDER BY 2 DESC
     )
WHERE ROWNUM <= 3
;
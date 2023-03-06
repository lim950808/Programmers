-- 데이터 분석 팀에서는 우유(Milk)와 요거트(Yogurt)를 동시에 구입한 장바구니가 있는지 알아보려 합니다. 우유와 요거트를 동시에 구입한 장바구니의 아이디를 조회하는 SQL 문을 작성해주세요. 이때 결과는 장바구니의 아이디 순으로 나와야 합니다.
-- Oracle
-- Summer/Winter Coding(2019)

SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME = 'Yogurt'
INTERSECT
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME = 'Milk'
ORDER BY CART_ID
;
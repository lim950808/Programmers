-- MEMBER_PROFILE와 REST_REVIEW 테이블에서 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회하는 SQL문을 작성해주세요. 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력되도록 작성해주시고, 결과는 리뷰 작성일을 기준으로 오름차순, 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순 정렬해주세요.
-- Oracle
-- JOIN

SELECT b.MEMBER_NAME, a.REVIEW_TEXT, TO_CHAR(a.REVIEW_DATE,'yyyy-mm-dd') AS REVIEW_DATE
FROM REST_REVIEW a
    RIGHT OUTER JOIN MEMBER_PROFILE b
    ON a.MEMBER_ID = b.MEMBER_ID
WHERE a.MEMBER_ID || 1 IN
(
    SELECT MEMBER_ID || RANK() OVER (ORDER BY COUNT(* ) DESC)
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
)
ORDER BY a.REVIEW_DATE, a.REVIEW_TEXT
;
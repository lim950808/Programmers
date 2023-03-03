-- 이 서비스에서는 공간을 둘 이상 등록한 사람을 "헤비 유저"라고 부릅니다. 헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회하는 SQL문을 작성해주세요.
-- Oracle
-- 2021 Dev-Matching: 웹 백엔드 개발자(상반기)

SELECT A.ID, A.NAME, A.HOST_ID
FROM PLACES A,
     (
         SELECT COUNT(*) AS CNT, HOST_ID
         FROM PLACES
         GROUP BY HOST_ID
     ) B
WHERE B.CNT >= 2 AND B.HOST_ID = A.HOST_ID
ORDER BY A.ID
;
-- [SQL] 실습5 : JOIN 실습 문제
-- [ 문제 ] 아래 SQL JOIN 관련 문제를 해결하시오.
-- [ 제출방법 ] 각 문제의 요구사항에 맞는 SQL 코드를 작성하여 제출하시오.
-- [사전 준비] 실습용 데이터베이스 및 테이블, 데이터 생성
-- 아래 SQL 코드를 전체 복사하여 MySQL Workbench에서 실행(Ctrl+Shift+Enter)한 후 문제를 풀어주세요.
-- ==================== 실습 환경 구축 ====================
DROP DATABASE IF EXISTS exam5;
CREATE DATABASE exam5;
USE exam5;
-- 1. 카테고리 테이블
CREATE TABLE pcategory(
    카테고리번호_pk INT UNSIGNED AUTO_INCREMENT,
    카테고리명 VARCHAR(10) NOT NULL,
    PRIMARY KEY(카테고리번호_pk)
);
-- 2. 제품 테이블
CREATE TABLE product(
    제품번호_pk INT UNSIGNED AUTO_INCREMENT,
    제품명 VARCHAR(100) NOT NULL,
    제품가격 INT UNSIGNED NOT NULL,
    카테고리번호_fk INT UNSIGNED,
    PRIMARY KEY(제품번호_pk),
    FOREIGN KEY(카테고리번호_fk) REFERENCES pcategory(카테고리번호_pk)
);
-- 3. 재고 테이블
CREATE TABLE stock(
    재고번호_pk INT UNSIGNED AUTO_INCREMENT,
    재고수량 INT,
    재고등록날짜 DATETIME DEFAULT NOW(),
    제품번호_fk INT UNSIGNED,
    PRIMARY KEY(재고번호_pk),
    FOREIGN KEY(제품번호_fk) REFERENCES product(제품번호_pk)
);

-- 샘플 데이터 삽입
INSERT INTO pcategory(카테고리명) VALUES('노트북'), ('스마트폰'), ('의류'), ('도서');
INSERT INTO product(제품명, 제품가격, 카테고리번호_fk) VALUES
('그램 15인치', 1500000, 1), ('맥북 프로 16인치', 3000000, 1),
('갤럭시 S23', 1200000, 2), ('아이폰 14 Pro', 1550000, 2),
('반팔 티셔츠', 30000, 3), ('청바지', 80000, 3),
('혼공 SQL', 22000, 4);
INSERT INTO stock(재고수량, 제품번호_fk) VALUES (10, 1), (5, 2), (20, 3), (15, 4), (100, 5), (50, 6),(5, 1), (2, 3);

-- ========================================================
-- [문제 1] 모든 제품의 제품명과 해당 제품의 카테고리명을 함께 조회하세요. (조회결과: 7개 레코드)
-- JOIN 필요한이유 : 제품명 과 카테고리명 은 서로 다른 테이블에 존재한다. 즉] 서로 다른 테이블을 하나로 집합이 필요하다. 
-- !! JOIN 조건 : 서로 다른 테이블간의 동일한 속성값이 필요하다. 주로] PK와 FK 속성이 주로 같은 값을 갖는다. 
SELECT * FROM product p; 				-- 1. '제품명'이 존재하는 테이블 조회 
SELECT * FROM pcategory pc; 			-- 2. '카테고리명'이 존재하는 테이블 조회 
SELECT * FROM product p , pcategory pc;	-- *. 서로 다른 두 테이블를 한번에 조회 ( 교집합 X )
-- 3. 교집합 ( 두 집합[테이블] 간의 공통 , 주로 pk와fk )
SELECT * FROM product p INNER JOIN pcategory pc ON p.카테고리번호_fk = pc.카테고리번호_pk;
-- 4. 교집합 이후 원하는 속성명 추출 
SELECT p.제품명 , pc.카테고리명 
	FROM product p INNER JOIN pcategory pc 
		ON p.카테고리번호_fk = pc.카테고리번호_pk;
	
-- [문제 2] '노트북' 카테고리에 속하는 모든 제품의 제품명과 제품가격을 조회하세요. (조회결과: 2개 레코드)
-- 제품명과 제품가격은 product 테이블 존재한다. 조건에 필요한 카테고리명은 pcategory 존재한다.
-- 1. product 와 pcatrgory 테이블 JOIN 하기 
SELECT * FROM product p INNER JOIN pcategory pc ON p.카테고리번호_fk = pc.카테고리번호_pk;
-- 2. where , 
SELECT p.제품명 , p.제품가격 
	FROM product p INNER JOIN pcategory pc ON p.카테고리번호_fk = pc.카테고리번호_pk
	WHERE pc.카테고리명 = '노트북';

-- [문제 3] 모든 제품의 제품명과 등록된 재고수량을 함께 조회하세요. (조회결과: 8개 레코드)
-- 제품명 product / 재고수량 : stock / 교집합 : 제품번호pk-fk 
SELECT p.제품명 , s.재고수량 FROM product p INNER JOIN stock s ON p.제품번호_pk = s.제품번호_fk;

-- [문제 4] '그램 15인치' 제품의 모든 재고등록날짜와 재고수량을 조회하세요. (조회결과: 2개 레코드)
-- '그램15인치'제품명 : prodcut / 재고등록날짜,재고수량 : stock / 교집합 : 제품번호pk-fk
SELECT s.재고등록날짜 , s.재고수량 FROM product p INNER JOIN stock s ON p.제품번호_pk = s.제품번호_fk 
    WHERE p.제품명 = '그램 15인치';

-- [문제 5] 모든 제품의 제품명, 카테고리명, 재고수량을 한 번에 조회하세요. (3개 테이블 조인) (조회결과: 8개 레코드)
-- 3개이상의 테이블 조인 : 테이블A INNER JOIN 테이블B ON 테이블A_PK = 테이블B_FK INNER JOIN 테이블C ON 테이블B_PK = 테이블C_FK
-- 제품명 : product / 카테고리명 : pcategory / 재고수량 : stock / 교집합 : 카테고리pk-fk , 제품번호pk-fk
SELECT p.제품명 , pc.카테고리명 , s.재고수량 FROM pcategory pc 
	INNER JOIN product p ON pc.카테고리번호_pk = p.카테고리번호_fk
    INNER JOIN stock s ON p.제품번호_pk = s.제품번호_fk;



-- [문제 6] 모든 카테고리의 카테고리명과 해당 카테고리에 속한 제품명을 조회하세요. 만약 카테고리에 속한 제품이 없더라도 카테고리명은 모두 표시되도록 하세요. (조회결과: 7개 레코드)

-- [문제 7] 재고가 한 번도 등록되지 않은 제품의 제품명을 조회하세요. (조회결과: 1개 레코드)

-- [문제 8] 각 카테고리별로 총 재고 수량의 합계를 카테고리명과 함께 조회하세요. (조회결과: 3개 레코드)

-- [문제 9] 각 제품별로 총 재고 수량을 조회하고, 총 재고 수량이 많은 순서대로 정렬하여 제품명과 총재고수량을 표시하세요. (조회결과: 6개 레코드)









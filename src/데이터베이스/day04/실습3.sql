-- 아래 샘플 SQL 전체 실행 : ctrl+shift+enter
DROP DATABASE IF EXISTS exam3;
CREATE DATABASE exam3;
USE exam3;

-- 1. 도서 테이블
CREATE TABLE books (
    book_id      INT NOT NULL,                   -- 도서번호
    title        VARCHAR(50) NOT NULL,           -- 제목
    author       VARCHAR(20) NOT NULL,           -- 저자
    genre        VARCHAR(10) NOT NULL,           -- 장르
    price        INT NOT NULL,                   -- 가격
    stock        INT,                            -- 재고
    pub_date     DATE,                           -- 출판일
    CONSTRAINT PRIMARY KEY (book_id)           -- 기본키 제약조건
);

-- 2. 주문 테이블
CREATE TABLE orders (
    order_id     INT AUTO_INCREMENT,             -- 주문번호
    book_id      INT NOT NULL,                   -- 도서번호 (FK)
    customer     VARCHAR(20) NOT NULL,           -- 고객명
    order_qty    INT NOT NULL,                   -- 주문수량
    order_date   DATE,                           -- 주문일
    CONSTRAINT PRIMARY KEY (order_id),         -- 기본키 제약조건
    CONSTRAINT FOREIGN KEY (book_id) REFERENCES books(book_id) -- 외래키 제약조건
);

-- 샘플 데이터 삽입
INSERT INTO books VALUES(1001, '혼공 SQL', '우재남', '컴퓨터', 22000, 15, '2020-01-01');
INSERT INTO books VALUES(1002, '이것이 자바다', '신용권', '컴퓨터', 30000, 30, '2018-05-20');
INSERT INTO books VALUES(1003, '불편한 편의점', '김호연', '소설', 14000, 5, '2021-04-20');
INSERT INTO books VALUES(1004, '달러구트 꿈 백화점', '이미예', '소설', 13800, 25, '2020-07-08');
INSERT INTO books VALUES(1005, '트렌드 코리아 2023', '김난도', '경제', 19000, 50, '2022-10-05');
INSERT INTO books VALUES(1006, '원씽(The One Thing)', '게리 켈러', '자기계발', 14000, 12, '2013-08-20');
INSERT INTO books VALUES(1007, '역사의 쓸모', '최태성', '역사', 16000, 0, '2018-11-26');
INSERT INTO books VALUES(1008, '파친코', '이민진', '소설', 15800, 3, '2022-07-14');
INSERT INTO books VALUES(1009, 'Do it! 점프 투 파이썬', '박응용', '컴퓨터', 18800, NULL, '2019-06-20');
INSERT INTO books VALUES(1010, '코스모스', '칼 세이건', '과학', 19500, 8, '2006-12-20');
INSERT INTO books VALUES(1011, '혼공 JAVA', '우재남', '컴퓨터', 24000, 17, '2019-01-01');

INSERT INTO orders VALUES(NULL, 1001, '김민준', 2, '2023-01-15');
INSERT INTO orders VALUES(NULL, 1002, '이서연', 1, '2023-01-18');
INSERT INTO orders VALUES(NULL, 1003, '박지훈', 1, '2023-02-01');
INSERT INTO orders VALUES(NULL, 1004, '김민준', 3, '2023-02-05');
INSERT INTO orders VALUES(NULL, 1005, '최수아', 1, '2023-02-11');
INSERT INTO orders VALUES(NULL, 1001, '박지훈', 1, '2023-02-12');
INSERT INTO orders VALUES(NULL, 1008, '이서연', 2, '2023-03-02');
INSERT INTO orders VALUES(NULL, 1009, '정현우', 5, '2023-03-05');
INSERT INTO orders VALUES(NULL, 1002, '김민준', 2, '2023-03-10');
INSERT INTO orders VALUES(NULL, 1006, '최수아', 1, '2023-04-01');
INSERT INTO orders VALUES(NULL, 1003, '박지훈', 3, '2023-04-02');
INSERT INTO orders VALUES(NULL, 1001, '이서연', 1, '2023-04-08');
INSERT INTO orders VALUES(NULL, 1005, '김민준', 2, '2023-04-15');
INSERT INTO orders VALUES(NULL, 1004, '정현우', 1, '2023-04-20');
INSERT INTO orders VALUES(NULL, 1008, '최수아', 1, '2023-05-01');
INSERT INTO orders VALUES(NULL, 1010, '박지훈', 2, '2023-05-05');
INSERT INTO orders VALUES(NULL, 1002, '최수아', 1, '2023-05-12');
INSERT INTO orders VALUES(NULL, 1006, '이서연', 2, '2023-05-20');
INSERT INTO orders VALUES(NULL, 1009, '김민준', 1, '2023-06-01');
INSERT INTO orders VALUES(NULL, 1001, '정현우', 3, '2023-06-07');
INSERT INTO orders VALUES(NULL, 1003, '이서연', 2, '2023-06-15');
INSERT INTO orders VALUES(NULL, 1005, '박지훈', 1, '2023-07-01');
INSERT INTO orders VALUES(NULL, 1010, '김민준', 1, '2023-07-03');
INSERT INTO orders VALUES(NULL, 1004, '최수아', 2, '2023-07-10');
-- =======================================================================

-- [문제 1] books 테이블에서 가격(price)이 20000원 이상인 도서의 title과 price를 조회하세요.
# 조회하세요. --> select 
# books 테이블에서 -->  select * from books
# 가격(price)이 20000원 이상인 --> 조건(where) , select * from books where price >= 20000;
# 도서의 title과 price를 --> 
select title , price from books where price >= 20000;

-- [문제 2] books 테이블에서 장르(genre)가 '소설'이 아닌 도서의 모든 정보를 조회하세요.
# select * from books; # 1. 
select * from books where genre != '소설'; 	# 2. 장르(genre)가 '소설'이 아닌

-- [문제 3] books 테이블에서 가격(price)이 15000원 이상이고, 재고(stock)가 10권 이상인 도서의 title, price, stock을 조회하세요.
# select * from books; # 1. 
# select * from books where price >= 15000 and stock >= 10; # 2. 가격(price)이 15000원 이상이고, 재고(stock)가 10권 이상인
select title , price , stock from books where price >= 15000 and stock >= 10; # 3. 도서의 title, price, stock

-- [문제 4] books 테이블에서 장르가 '컴퓨터' 이거나 '경제'인 도서의 title과 genre를 조회하세요. (IN 연산자 사용)
# select title , genre from books where genre = '컴퓨터' or genre = '경제'; 	# 방법1) OR 연산자 사용 
select title , genre from books where genre in( '컴퓨터' , '경제' ); 			# 방법2) IN 연산자 사용

-- [문제 5] books 테이블에서 재고(stock) 정보가 없는(NULL) 도서의 title을 조회하세요.
select title from books where stock is null;	# = null 대신에 is null 사용하자. 

-- [문제 6] books 테이블에서 도서명(title)에 '코리아' 라는 단어가 포함된 도서를 조회하세요. (LIKE 사용)
# select * from books where title = '코리아'; 	# (1) title = '코리아' 		: title이 코리아 이면  
select * from books where title like '%코리아%';	# (2) title like '%코리아%'   : title이 코리아 가 포함된  

-- [문제 7] books 테이블에서 저자명(author)이 '김'으로 시작하는 3글자인 도서의 title과 author를 조회하세요. (LIKE 사용)
# select * from books where author like '김%'; 	# 김으로 시작하는 N글자 # % : 모든 문자 대응(글자수 상관) 
select title, author from books where author like '김__'; 	# 김으로 시작하는 3글자 # _ : 모든 문자 대응(_개수만큼 대응)

-- [문제 8] books 테이블의 모든 도서 정보를 가격(price)이 비싼 순(내림차순)으로 정렬하여 조회하세요.
select * from books order by price desc; # order by 속성명 asc(오름차순)/desc(내림차순)

-- [문제 9] books 테이블의 모든 도서 정보를 출판일(pub_date)이 오래된 순(오름차순)으로 정렬하되, 출판일이 같다면 제목(title)의 가나다순(오름차순)으로 정렬하세요.
select * from books order by pub_date asc , title asc;

-- [문제 10] books 테이블에서 가격이 가장 저렴한 도서 3개의 title과 price를 조회하세요. ( limit )
# select * from books order by price asc; # 1. 가격을 오름차순(낮은순) 으로 정렬 
select title , price from books order by price asc limit 3; # 2. 정렬후 위에서 3개만 제한


 



-- [문제 11] books 테이블에서 가격(price)이 14000원에서 18000원 사이인 도서의 title과 price를 조회하세요. (BETWEEN 연산자 사용)
-- [문제 12] books 테이블에서 도서명(title)에 '자' 라는 글자가 포함된 도서의 title과 author를 조회하세요.
-- [문제 13] books 테이블에서 장르(genre)가 '소설'과 '역사'가 아닌 도서들의 모든 정보를 조회하세요. (NOT IN 사용)
-- [문제 14] books 테이블에서 장르가 '컴퓨터'이고 가격이 20000원 미만이며, 재고가 20권 이상인 도서의 title을 조회하세요. (*레코드 결과 0개* )
-- [문제 15] books 테이블의 모든 도서 정보를 장르(genre)의 가나다순(오름차순)으로 정렬하되, 같은 장르 내에서는 가격(price)이 비싼 순(내림차순)으로 정렬하세요.
-- [문제 16] books 테이블에서 저자명(author)이 '이'씨가 아닌 도서의 title과 author를 조회하세요.
-- [문제 17] books 테이블에서 재고(stock) 정보가 있는(NULL이 아닌) 도서의 title과 stock을 조회하세요.
-- [문제 18] books 테이블에서 출판일(pub_date)이 가장 최신인 도서부터 4번째에서 6번째까지의 도서 3개의 title과 pub_date를 조회하세요. (LIMIT 오프셋 사용)
-- [문제 19] books 테이블에서 저자가 '김호연'이거나 장르가 '과학'인 도서의 모든 정보를 조회하세요.
-- [문제 20] books 테이블에서 도서명(title)이 '점'으로 끝나는 도서의 title과 genre를 조회하세요.



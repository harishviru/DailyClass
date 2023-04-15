--- For Reference   :: https://livesql.oracle.com/apex/livesql/file/content_O5AEB2HE08PYEPTGCFLZU9YCV.html

--- SQL SELECT Statement:
 
  ---#01 : For getting all specfic column

      SELECT COLUMN1,COLUMN2,COLUMN3,......,COLUMNn FROM [table_name];

----#02  : For getting all columns
 
     SELECT * FROM [TABLE_NAME];


--- Constraints : rules  like (unique,not-null ,primary key ,foreaign key...etc)

--- CREATE  Table
---(for checking data types)
----https://docs.oracle.com/cd/E19501-01/819-3659/gcmaz/

CREATE TABLE table_name(
column1 datatype(size),
column2 datatype(size),
column3 datatype(size),
.....
columnN datatype(size),
PRIMARY KEY( one or more columns )
);

---example

create table dept(   
  deptno     number(2,0),   
  dname      varchar2(14),   
  loc        varchar2(13),   
  constraint pk_dept primary key (deptno)   
)

create table emp(   
  empno    number(4,0),   
  ename    varchar2(10),   
  job      varchar2(9),   
  mgr      number(4,0),   
  hiredate date,   
  sal      number(7,2),   
  comm     number(7,2),   
  deptno   number(2,0),   
  constraint pk_emp primary key (empno),   
  constraint fk_deptno foreign key (deptno) references dept (deptno)   
)

--- Constraints:

ADD CONSTRAINT PK_Person PRIMARY KEY (column_name); 

--- insert 

INSERT INTO table_name( column1, column2....columnN)
VALUES ( value1, value2....valueN);

---ex :
insert into DEPT (DEPTNO, DNAME, LOC) 
values(10, 'ACCOUNTING', 'NEW YORK')

INSERT INTO table_name
VALUES ( value1, value2....valueN);

--ex :
insert into dept   
values(20, 'RESEARCH', 'DALLAS')


--- update

UPDATE table_name
SET column1 = value1, column2 = value2....columnN=valueN
[ WHERE CONDITION]

UPDATE emp 
SET ename ='Sai'
WHERE empno=7902;

---Delete
DELETE FROM table_name
WHERE {CONDITION};

DELETE FROM emp WHERE ename='Sai';







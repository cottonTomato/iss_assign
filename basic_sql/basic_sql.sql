-- CREATE DATABASE is used to create a new Database which
-- will later contain multiple tables.
CREATE DATABASE demo_db;
USE demo_db;

/*
Here we create new tables for the example.
Each column in table come with some kind of constraint.
This is done to improve data integrity.

*/

/*
student
- student_id : Primary Key, Auto Increment
- name       : Not Null, Unique
- age        : Check constraint
- dept_id    : Foreign Key
*/
CREATE TABLE student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    age INT CHECK (age >= 18),
    dept_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);

/*
department
- dept_id   : Primary Key
- dept_name : Not Null, Unique 
*/
CREATE TABLE department ( 
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) UNIQUE NOT NULL
);

-- INSERT statement is used to insert data in tables.
INSERT INTO department VALUES
(1, 'CSE'),
(2, 'ECE'),
(3, 'ME');

-- INSERT statement can also specify the columns to 
-- insert data in.
INSERT INTO student (name, age, dept_id) VALUES
('Abhinav', 21, 1),
('Drishti', 19, 2),
('Pulkit', 22, 1),
('Gayatri', 20, 3);

-- SELECT is used to query data.
-- This select query returns all rows from student
-- table.
SELECT * FROM student;

-- This SELECT query returns all unique values of
-- dept_id in student table.
SELECT DISTINCT dept_id FROM student;

-- In this statement a WHERE clause is used to 
-- filter data based on some condition.
SELECT * FROM student
WHERE age > 20 AND dept_id = 1;

SELECT * FROM student
WHERE dept_id = 1 OR dept_id = 2;

-- SELECT can also have additional clauses that
-- affects the way statements are returned.
-- ORDER BY sorts the row based on a column.
SELECT name AS student_name, age
FROM student
ORDER BY age DESC;

-- Wildcards are used to match textual column
-- based on some pattern.
SELECT * FROM student
WHERE name LIKE 'A%';   -- starts with A

-- IN is a test of membership.
SELECT * FROM student
WHERE age IN (20, 22);

-- BETWEEN keyword is used for easier range
-- comparisons.
SELECT * FROM student
WHERE age BETWEEN 20 AND 22;

-- UPDATE statement is used to update a value
-- of some row.
UPDATE student
SET age = 24
WHERE name = 'Abhinav';

-- DELETE statement is used to delete row based
-- on WHERE clause.
DELETE FROM student
WHERE name = 'Drishti';

-- Inner join is used to get the rows that have 
-- matching values in both tables
SELECT s.name, d.dept_name
FROM student s
INNER JOIN department d
ON s.dept_id = d.dept_id;

-- Left join is used to returns all rows from 
-- the left table and matching rows from the 
-- right table; non-matches are NULL.
SELECT s.name, d.dept_name
FROM student s
LEFT JOIN department d
ON s.dept_id = d.dept_id;

-- Right join is used to returns all rows from 
-- the right table and matching rows from the 
-- left table; non-matches are NULL.
SELECT s.name, d.dept_name
FROM student s
RIGHT JOIN department d
ON s.dept_id = d.dept_id;

-- Full join: Returns all rows from both tables, 
-- with NULL where there is no match.
-- In Mysql we have to use UNION keyword to get
-- full joins.
SELECT s.name, d.dept_name
FROM student s
LEFT JOIN department d ON s.dept_id = d.dept_id
UNION
SELECT s.name, d.dept_name
FROM student s
RIGHT JOIN department d ON s.dept_id = d.dept_id;

-- Group by is used to aggregate rows based on
-- specified column. Aggregate functions operate
-- on aggregated rows.
SELECT dept_id, COUNT(*) AS student_count
FROM student
GROUP BY dept_id
HAVING COUNT(*) > 1;

-- NULL values can be handled by IFNULL
-- It returns a default value if NULL found.
SELECT name, IFNULL(dept_id, 0) AS dept_id
FROM student;

-- UNION is used to concatanate results of
-- 2 SELECT queries.
SELECT name FROM student
UNION
SELECT dept_name FROM department;

-- SELECT INTO statement is used to copy
-- a table.
CREATE TABLE student_backup
SELECT * FROM student;

-- INSERT + SELECT is used to insert the
-- result of a SELECT statement into a 
-- table.
INSERT INTO student_backup
SELECT * FROM student;

-- Index is a specialized data structure
-- created using a column to help make 
-- queries using that particular column
-- faster.
CREATE INDEX idx_student_name ON student(name);

-- VIEWS are stored SELECT queries that
-- are available to use as if a table.
CREATE VIEW student_view AS
SELECT name, age FROM student;

-- ALTER TABLE statement modifies the 
-- table schema.
ALTER TABLE student ADD email VARCHAR(50);

-- DROP statement is used to delete 
-- tables, views, stored procedures.
DROP VIEW student_view;

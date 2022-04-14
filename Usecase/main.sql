CREATE TABLE attendance(id INTEGER PRIMARY KEY,name TEXT,email TEXT,presenty INTEGER,attendance_time REAL);
INSERT INTO attendance VALUES(1,"ABC","ABC@gmail.com",0,0);
INSERT INTO attendance VALUES(2,"ABCD","ABCD@gmail.com",0,0);
INSERT INTO attendance VALUES(3,"ABCDE","ABCDE@gmail.com",0,0);
INSERT INTO attendance VALUES(4,"ABCDEF","ABCDEF@gmail.com",0,0);

SELECT * FROM attendance;
UPDATE attendance 
SET attendance_time = 1.5
WHERE id%2=0;

UPDATE attendance 
SET presenty = 1
WHERE attendance_time=1.5;

SELECT * FROM attendance;

DELETE FROM attendance WHERE presenty = 0;
SELECT * FROM attendance;
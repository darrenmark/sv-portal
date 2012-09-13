CREATE TABLE login_user(
id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL,
login_id VARCHAR(100) NOT NULL,
password VARCHAR(100) NOT NULL,
CONSTRAINT primary_key PRIMARY KEY (id));

INSERT INTO login_user(first_name, last_name, email, login_id, password) values('Darren' , 'Mark','myemail@mark.com','darren', 'darren123');
CREATE TABLE employees
(
    employee_id   NUMERIC       NOT NULL,
    first_name    VARCHAR(1000) NOT NULL,
    last_name     VARCHAR(1000) NOT NULL,
    date_of_birth DATE,
    phone_number  VARCHAR(1000) NOT NULL,
    junk          CHAR(1000),
    CONSTRAINT employees_pk PRIMARY KEY (employee_id)
);

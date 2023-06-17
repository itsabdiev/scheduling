CREATE TABLE IF NOT EXISTS books (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(255),
                       isbn VARCHAR(255)
);
CREATE SEQUENCE IF NOT EXISTS books_seq
    START WITH 1
    INCREMENT BY 50;
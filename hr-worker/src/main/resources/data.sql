CREATE TABLE tb_worker (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    daily_Income NUMERIC(20,1)
);

INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0);
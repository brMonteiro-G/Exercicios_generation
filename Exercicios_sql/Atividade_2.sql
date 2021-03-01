CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos (
id INT(10) AUTO_INCREMENT,
Nome VARCHAR(30) NOT NULL,
Preço INT(10) NOT NULL, 
Marca VARCHAR(30) NOT NULL, 
Estoque BOOLEAN , 
Desconto INT(10) ,
PRIMARY KEY (id)
);

SELECT * FROM tb_produtos ;

ALTER TABLE  tb_produtos MODIFY
 Preço VARCHAR(10) NOT NULL;

SELECT * FROM tb_produtos ;
INSERT INTO tb_produtos (Nome, Preço, Marca, Estoque, Desconto) 
VALUES ("Arduíno UNO", "R$69,00", "Arduíno", true, 20),
 ("Inversor de potência 12v", "R$1290,00", "Green", false, 40),
 ("Caixa de Som ", "R$578,00", "JBL", true, 30),
 ("Capacitor Eletrolítico", "R$4,90", "KMG", false, 10);


SELECT * FROM tb_produtos WHERE Estoque = true; 
SELECT * FROM tb_produtos WHERE Estoque = false;

UPDATE tb_produtos SET Estoque = false WHERE id = 1;
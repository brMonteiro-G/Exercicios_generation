SELECT * FROM db_farmacia_do_bem.produto;

SELECT * FROM db_farmacia_do_bem.produto WHERE Preço > 50.00;

SELECT * FROM db_farmacia_do_bem.produto WHERE Preço BETWEEN 3 AND 60 ; 

SELECT * FROM db_farmacia_do_bem.produto WHERE Nome LIKE 'b%';


SELECT db_farmacia_do_bem.produto.Nome AS NOME, categoria.Setor AS SETOR
 FROM produto
 INNER JOIN categoria 
 ON produto.categoria_id_categoria = id_categoria; 
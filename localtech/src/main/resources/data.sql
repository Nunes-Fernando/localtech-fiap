CREATE TABLE veiculos (
	
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	marca VARCHAR (255),
	modelo VARCHAR (255),
	placa VARCHAR (255),
	ano INT,
	cor VARCHAR (255),
	valor_diaria DECIMAL (10, 2)
	
);

INSERT INTO veiculos (marca, modelo, placa, ano, cor, valor_diaria) VALUES
('gol', 'Quadrado', 'ABC1234', 2000, 'vermelho', 150.00),
('fiat', 'Uno', 'XYZ5678', 2010, 'prata', 120.00);
	
	

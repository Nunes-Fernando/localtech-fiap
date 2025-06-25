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
	
	
CREATE TABLE pessoa (
	
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR (255),
	cpf VARCHAR (11),
	telefone VARCHAR (20),
	email VARCHAR (255),
	
);

INSERT INTO pessoa (nome, cpf, telefone, email) VALUES
('João Silva', '12345678901', '(11) 91234-5678', 'joao.silva@email.com'),
('Maria Souza', '98765432100', '(21) 99876-5432', 'maria.souza@email.com'),
('Carlos Lima', '11122233344', '(31) 93456-7890', 'carlos.lima@email.com');
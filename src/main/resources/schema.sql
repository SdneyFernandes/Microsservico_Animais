CREATE TABLE animal (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome_provisorio VARCHAR(255) NOT NULL,
	idade_estimada INT NOT NULL,
	raca VARCHAR(255) NOT NULL,
	data_entrada DATE NOT NULL,
	data_adocao DATE,
	condicoes_chegada VARCHAR(255) NOT NULL,
	nome_recebedor VARCHAR(255) NOT NULL,
	data_obito DATE,
	porte VARCHAR(255) NOT NULL
);
CREATE DATABASE `fiscalizacao`;

CREATE TABLE onibus(
    id_onibus INT PRIMARY KEY AUTO_INCREMENT,
    numeroDoOnibus VARCHAR(7) NOT NULL,
    numeracaoDaRoleta VARCHAR(4) NOT NULL,
    quilometragem DOUBLE NOT NULL
);

CREATE TABLE pessoa(
    id_pessoa INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(70) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(20) NOT NULL,
    telefone VARCHAR(14) NOT NULL,
    idade INT NOT NULL,
    cargo VARCHAR(20) NOT NULL
 );

CREATE TABLE motorista(
    id_motorista INT PRIMARY KEY AUTO_INCREMENT,
    carteiraDeMotorista VARCHAR(9) NOT NULL,
    registro VARCHAR(11) NOT NULL,
    id_pessoa INT,
    id_onibus INT,
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)
);

CREATE TABLE cobrador(
	id_cobrador INT PRIMARY KEY AUTO_INCREMENT,
    id_pessoa INT,
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)
);

CREATE TABLE fiscal(
	id_fiscal INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_pessoa INT,
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)
);

CREATE TABLE fiscalDeGaragem(
	id_fiscalGaragem INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_pessoa INT,
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)
);

CREATE TABLE viagem(
    id_viagem INT PRIMARY KEY AUTO_INCREMENT,
    horarioDeChegada TIME NOT NULL,
    horarioDeSaida TIME NOT NULL,
    diaHora TIMESTAMP NOT NULL,
    id_onibus INT,
    id_motorista INT,
    id_cobrador INT,
    FOREIGN KEY (id_cobrador) REFERENCES cobrador(id_cobrador),
    FOREIGN KEY (id_onibus) REFERENCES onibus(id_onibus),
    FOREIGN KEY (id_motorista) REFERENCES motorista(id_motorista)
);

CREATE TABLE ocorrencia(
    id_ocorrencia INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(70) NOT NULL,
    diaHora TIMESTAMP NOT NULL,
    id_viagem INT,
    reclamacaoDoUsuario VARCHAR(70) NOT NULL,
    FOREIGN KEY (id_viagem) REFERENCES viagem(id_viagem)
);

CREATE TABLE registroFinal(
    id_registroFinal INT PRIMARY KEY AUTO_INCREMENT,
    id_fiscalGaragem INT,
    id_viagem INT,
    FOREIGN KEY (id_viagem) REFERENCES viagem(id_viagem),
    FOREIGN KEY (id_fiscalGaragem) REFERENCES fiscalDeGaragem(id_fiscalGaragem)
);
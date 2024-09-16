CREATE DATABASE cartola;

CREATE TABLE "Team" (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    "Nome" VARCHAR(100) NOT NULL,
    "NomeDonoTime" VARCHAR(100) NOT NULL,
    "DataFundacao" DATE NOT NULL,
    "Patrimonio" DECIMAL(10,2) NOT NULL

    constraint 'PK_Team' PRIMARY KEY ('ID')
);

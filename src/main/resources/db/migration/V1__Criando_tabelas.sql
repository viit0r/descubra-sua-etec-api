CREATE TABLE IF NOT EXISTS `curso` (
    `id_curso` int NOT NULL UNIQUE AUTO_INCREMENT,
    `nome` varchar(255) NOT NULL,
    `descricao` varchar (255),
    `tipo` varchar(255),
    `link` varchar(255) NOT NULL,
    PRIMARY KEY (`id_curso`)
);

CREATE TABLE IF NOT EXISTS `unidade_endereco` (
    `id_endereco` int NOT NULL UNIQUE AUTO_INCREMENT,
    `tipo` int(2) NOT NULL,
    `logradouro` varchar(255) NOT NULL,
    `numero` varchar(10) NOT NULL,
    `bairro` varchar(255) NOT NULL,
    `cep` varchar(9) NOT NULL,
    `estado` varchar(255) NOT NULL,
    `uf` char(2) NOT NULL,
    PRIMARY KEY (`id_endereco`)
);

CREATE TABLE IF NOT EXISTS `unidade` (
  `id_unidade` int NOT NULL UNIQUE AUTO_INCREMENT,
  `id_endereco` int NOT NULL,
  `nome` varchar(255) NOT NULL,
  `etim` tinyint(1),
  `site` varchar(255) NOT NULL,
  `telefone` char(11),
  PRIMARY KEY (`id_unidade`),
  FOREIGN KEY (`id_endereco`) REFERENCES unidade_endereco(`id_endereco`)
);

CREATE TABLE IF NOT EXISTS `relacao_unidade_curso` (
    `id_relacao` int NOT NULL UNIQUE AUTO_INCREMENT,
    `id_unidade` int NOT NULL,
    `id_curso` int NOT NULL,
    PRIMARY KEY (`id_relacao`),
    FOREIGN KEY (`id_unidade`) REFERENCES unidade(`id_unidade`),
    FOREIGN KEY (`id_curso`) REFERENCES curso(`id_curso`)
);
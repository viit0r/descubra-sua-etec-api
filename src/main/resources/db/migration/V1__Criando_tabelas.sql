CREATE TABLE IF NOT EXISTS `curso` (
    `id_curso` bigint NOT NULL UNIQUE AUTO_INCREMENT,
    `nome` varchar(255) NOT NULL,
    `descricao` varchar(3000),
    `carga_horaria` int,
    `duracao_semestre` int,
    `eixo_tecnologico` varchar(255),
    `link` varchar(255) NOT NULL,
    `pre_requisitos` varchar(700),
    PRIMARY KEY (`id_curso`)
);

CREATE TABLE IF NOT EXISTS `unidade_endereco` (
    `id_endereco` bigint NOT NULL UNIQUE AUTO_INCREMENT,
    `tipo` int NOT NULL,
    `logradouro` varchar(255) NOT NULL,
    `numero` varchar(10) NOT NULL,
    `complemento` varchar(50),
    `bairro` varchar(255) NOT NULL,
    `cep` varchar(9) NOT NULL,
    `estado` varchar(255) NOT NULL,
    `uf` char(2) NOT NULL,
    PRIMARY KEY (`id_endereco`)
);

CREATE TABLE IF NOT EXISTS `unidade` (
  `id_unidade` bigint NOT NULL UNIQUE AUTO_INCREMENT,
  `id_endereco` bigint NOT NULL,
  `nome` varchar(255) NOT NULL,
  `descricao` varchar(800),
  `site` varchar(255) NOT NULL,
  `telefone` char(11),
  PRIMARY KEY (`id_unidade`),
  FOREIGN KEY (`id_endereco`) REFERENCES unidade_endereco(`id_endereco`)
);

CREATE TABLE IF NOT EXISTS `relacao_unidade_curso` (
    `id_relacao` bigint NOT NULL UNIQUE AUTO_INCREMENT,
    `id_unidade` bigint NOT NULL,
    `id_curso` bigint NOT NULL,
    `presencial` tinyint,
    `semipresencial` tinyint,
    `online` tinyint,
    `etim` tinyint,
    `especializacao` tinyint,
    PRIMARY KEY (`id_relacao`),
    FOREIGN KEY (`id_unidade`) REFERENCES unidade(`id_unidade`),
    FOREIGN KEY (`id_curso`) REFERENCES curso(`id_curso`)
);
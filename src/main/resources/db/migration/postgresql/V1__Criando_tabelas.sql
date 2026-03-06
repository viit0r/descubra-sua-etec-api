create table if not exists curso (
    id_curso bigserial not null,
    carga_horaria integer,
    descricao varchar(3000),
    duracao_semestre integer,
    eixo_tecnologico varchar(255),
    link varchar(255) not null,
    nome varchar(255) not null,
    pre_requisitos varchar(700),
    primary key (id_curso)
);

create table if not exists unidade_endereco (
    id_endereco bigserial not null,
    bairro varchar(255) not null,
    cep varchar(9) not null,
    complemento varchar(50),
    estado varchar(255) not null,
    logradouro varchar(255) not null,
    numero varchar(10) not null,
    tipo integer not null,
    uf varchar(2) not null,
    primary key (id_endereco)
);

create table if not exists unidade (
    id_unidade bigserial not null,
    descricao varchar(800),
    email varchar(25),
    nome varchar(255) not null,
    site varchar(255) not null,
    telefone varchar(30),
    id_endereco bigint not null,
    primary key (id_unidade)
);

create table if not exists relacao_unidade_curso (
    id_relacao bigserial not null,
    especializacao boolean,
    etim boolean,
    online boolean,
    presencial boolean,
    semipresencial boolean,
    id_curso bigint not null,
    id_unidade bigint not null,
    primary key (id_relacao)
);
## Descubra a sua ETEC - API

API desenvolvida em Spring para se comunicar ao banco e recuperar informações das ETECs da cidade de São Paulo

## Sumário
- [Informações importantes](#informações-importantes)
- [Unidades](#unidades)
  - [Buscar todas as unidades](#buscar-todas-as-unidades)
  - [Buscar uma unidade](#buscar-uma-unidade)
  - [Buscar unidades baseado em um filtro](#buscar-unidades-baseado-em-um-filtro)
- [Cursos](#cursos)
  - [Buscar todos os cursos](#buscar-todos-os-cursos)
  - [Buscar um curso](#buscar-um-curso)
  - [Buscar cursos baseado em um filtro](#buscar-cursos-baseado-em-um-filtro)
- [Erros](#erros)
- [Códigos de retorno](#códigos-de-retorno)

## Informações importantes
Para se comunicar com a API, você deverá:
- Ter o serviço do MySQL instalado e rodando na sua máquina.
- Efetuar um clone do projeto.
- Configurar as credenciais do banco de dados (username e password) no arquivo [application.yml](src/main/resources/application.yml).
- Criar um banco com o nome *descubra_sua_etec_db*.
- Executar o projeto.

Após isso, poderá utilizar alguma ferramenta ou o próprio navegador para testar as requisições. 😉

A URL base para todas as requisições será *http://localhost:8080*.


## Unidades
### Buscar todas as unidades
Efetua a busca e retorna todas as unidades disponíveis na cidade de São Paulo.

GET - [/v1/unidade]

**Response status** - 200 OK

**Response body**
```
{
    "cdRetorno": string,
    "sucesso": boolean,
    "unidades": [
        {
            "idUnidade": long,
            "nome": "string",
            "descricao": "string",
            "telefone": "string",
            "site": "string",
            "email": "string",
            "unidadeEndereco": {
                "idEndereco": long,
                "tipo": int,
                "logradouro": "string",
                "numero": "string",
                "complemento": "string",
                "bairro": "string",
                "cep": "string",
                "estado": "string",
                "uf": "string"
            },
            "unidadeCursos": [
                {
                    "curso": {
                        "idCurso": long,
                        "nome": "string",
                        "descricao": "string",
                        "cargaHoraria": int,
                        "duracaoSemestre": int,
                        "eixoTecnologico": "string",
                        "link": "string",
                        "preRequisitos": "string"
                    },
                    "modalidadePresencial": boolean,
                    "modalidadeSemipresencial": boolean,
                    "modalidadeOnline": boolean,
                    "modalidadeEtim": boolean,
                    "modalidadeEspecializacao": boolean
                }
            ]
        }
    ]
}
```

### Buscar uma unidade
Efetua a busca e retorna a unidade com o id especificado no parâmetro.

GET - [/v1/unidade/{id}]

**Response status** - 200 OK

**Response body**
```
"cdRetorno": "string",
    "sucesso": boolean,
    "unidade": {
        "idUnidade": long,
        "nome": "string",
        "descricao": "string",
        "telefone": "string",
        "site": "string",
        "email": "string",
        "unidadeEndereco": {
            "idEndereco": long,
            "tipo": int,
            "logradouro": "string",
            "numero": "string",
            "complemento": "string",
            "bairro": "string",
            "cep": "string",
            "estado": "string",
            "uf": "string"
        },
        "unidadeCursos": [
            {
                "curso": {
                    "idCurso": long,
                    "nome": "string",
                    "descricao": "string",
                    "cargaHoraria": int,
                    "duracaoSemestre": int,
                    "eixoTecnologico": "string",
                    "link": "string",
                    "preRequisitos": "string"
                },
                "modalidadePresencial": boolean,
                "modalidadeSemipresencial": boolean,
                "modalidadeOnline": boolean,
                "modalidadeEtim": boolean,
                "modalidadeEspecializacao": boolean
            }
        ]
    }
}
```

### Buscar unidades baseado em um filtro
Efetua a busca e retorna todas as unidades da cidade de São Paulo que possuem o filtro aplicado.

GET - [/v1/unidade]

**Request body**
```
{
    "filtro": "string"
}
```

**Response status** - 200 OK

**Response body**
```
{
    "cdRetorno": "string",
    "sucesso": boolean,
    "unidades": [
        {
            "idUnidade": long,
            "nome": "string",
            "descricao": "string",
            "telefone": "string",
            "site": "string",
            "email": "string",
            "unidadeEndereco": {
                "idEndereco": long,
                "tipo": int,
                "logradouro": "string",
                "numero": "string",
                "complemento": "string",
                "bairro": "string",
                "cep": "string",
                "estado": "string",
                "uf": "string"
            },
            "unidadeCursos": [
                {
                    "curso": {
                        "idCurso": long,
                        "nome": "string",
                        "descricao": "string",
                        "cargaHoraria": int,
                        "duracaoSemestre": int,
                        "eixoTecnologico": "string",
                        "link": "string",
                        "preRequisitos": "string"
                    },
                    "modalidadePresencial": boolean,
                    "modalidadeSemipresencial": boolean,
                    "modalidadeOnline": boolean,
                    "modalidadeEtim": boolean,
                    "modalidadeEspecializacao": boolean
                }
            ]
        }
    ]
}
```

## Cursos

### Buscar todos os cursos
Efetua a busca e retorna todos os cursos disponíveis nas ETECs da cidade de São Paulo.

GET - [/v1/curso]

**Response status** - 200 OK

**Response body**
```
{
    "cdRetorno": "string",
    "sucesso": boolean,
    "cursos": [
        {
            "idCurso": long,
            "nome": "string",
            "descricao": "string",
            "cargaHoraria": int,
            "duracaoSemestre": int,
            "eixoTecnologico": "string",
            "link": "string",
            "preRequisitos": "string",
            "cursoUnidades": [
                {
                    "unidade": {
                        "idUnidade": long,
                        "nome": "string",
                        "descricao": "string",
                        "telefone": "string",
                        "site": "string",
                        "email": "string",
                        "idEndereco": {
                            "idEndereco": long,
                            "tipo": int,
                            "logradouro": "string",
                            "numero": "string",
                            "complemento": "string",
                            "bairro": "string",
                            "cep": "string",
                            "estado": "string",
                            "uf": "string"
                        }
                    },
                    "modalidadePresencial": boolean,
                    "modalidadeSemipresencial": boolean,
                    "modalidadeOnline": boolean,
                    "modalidadeEtim": boolean,
                    "modalidadeEspecializacao": boolean
                }
            ]
        }
    ]
}
```

### Buscar um curso
Efetua a busca e retorna o curso com o id especificado no parâmetro.

GET - [/v1/curso/{id}]

**Response status** - 200 OK

**Response body**
```
{
    "cdRetorno": "string",
    "sucesso": boolean,
    "curso": {
        "idCurso": long,
        "nome": "string",
        "descricao": "string",
        "cargaHoraria": int,
        "duracaoSemestre": int,
        "eixoTecnologico": "string",
        "link": "string",
        "preRequisitos": "string",
        "cursoUnidades": [
            {
                "unidade": {
                    "idUnidade": long,
                    "nome": "string",
                    "descricao": "string",
                    "telefone": "string",
                    "site": "string",
                    "email": "string",
                    "idEndereco": {
                        "idEndereco": long,
                        "tipo": int,
                        "logradouro": "string",
                        "numero": "string",
                        "complemento": "string",
                        "bairro": "string",
                        "cep": "string",
                        "estado": "string",
                        "uf": "string"
                    }
                },
                "modalidadePresencial": boolean,
                "modalidadeSemipresencial": boolean,
                "modalidadeOnline": boolean,
                "modalidadeEtim": boolean,
                "modalidadeEspecializacao": boolean
            }
        ]
    }
}
```

### Buscar cursos baseado em um filtro
Efetua a busca e retorna todos os cursos da cidade de São Paulo que possuem o filtro aplicado.

GET - [/v1/curso]

**Request body**
```
{
    "filtro": "string"
}
```
**Response status** - 200 OK

**Response body**
```
{
    "cdRetorno": "string",
    "sucesso": boolean,
    "cursos": [
        {
            "idCurso": long,
            "nome": "string",
            "descricao": "string",
            "cargaHoraria": int,
            "duracaoSemestre": int,
            "eixoTecnologico": "string",
            "link": "string",
            "preRequisitos": "string",
            "cursoUnidades": [
                {
                    "unidade": {
                        "idUnidade": long,
                        "nome": "string",
                        "descricao": "string",
                        "telefone": "string",
                        "site": "string",
                        "email": "string",
                        "idEndereco": {
                            "idEndereco": long,
                            "tipo": int,
                            "logradouro": "string",
                            "numero": "string",
                            "complemento": "string",
                            "bairro": "string",
                            "cep": "string",
                            "estado": "string",
                            "uf": "string"
                        },
                    },
                    "modalidadePresencial": boolean,
                    "modalidadeSemipresencial": boolean,
                    "modalidadeOnline": boolean,
                    "modalidadeEtim": boolean,
                    "modalidadeEspecializacao": boolean
                }
            ]
        }
    ]
}
```

## Erros
Caso ocorra algum erro na requisição ou durante o processamento das informações, a API retornará algumas informações em um padrão específico:
```
{
    "cdRetorno": "string",
    "sucesso": boolean,
    "descricao": "string"
}
```
Onde irá conter:
- cdRetorno: Código de erro. Verifique mais sobre em [Códigos de retorno](#códigos-de-retorno).
- sucesso: false
- descricao: Mensagem descritiva do motivo do erro.

## Códigos de retorno
Abaixo contém a tabela com os possíveis códigos de retorno retornados no campo *cdRetorno*:

|            **cdRetorno**             |   **Mensagem**    |
|:------------------------------------:|:-----------------:|
|                 1000                 | Sucesso ao enviar |
|                 5000                 | Erro de servidor  |
|                 4004                 |  Não encontrado   |
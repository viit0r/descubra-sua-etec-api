## Descubra a sua ETEC - API

API desenvolvida em Spring para se comunicar ao banco e recuperar informações das ETECs da cidade de São Paulo

### ⏯ Começando

Para executar o projeto, será necessário baixar e instalar os seguintes programas:

- [JDK 19](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html): Para a compilação do projeto
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows): Para desenvolvimento e execução do projeto
- [MySQL](https://dev.mysql.com/downloads/mysql/): Para conectar ao banco de dados
- [Git](https://git-scm.com/downloads): Para clonar o repositório na sua máquina

### 📢 Para testar você deve:

1. Baixar e instalar os programas acima
2. Executar o serviço do MySQL Server 8.0 caso não tenha executado
3. Criar um banco de dados no MySQL Workbench com o nome que quiser (lembrando de trocar o nome do banco de dados e as credenciais de acesso no arquivo [application.properties](src/main/resources/application.yml)
4. Clone o repositório: 
```shell
git clone https://github.com/viit0r/crud-basico-spring.git
```
5. Abra a pasta na IDE
6. Execute o projeto
7. Pronto 😉

#### Para realizar os testes de requisição via Postman clique no botão abaixo

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/16988600-b25d87a0-9a23-443c-a26d-44b00d5479d1?action=collection%2Ffork&collection-url=entityId%3D16988600-b25d87a0-9a23-443c-a26d-44b00d5479d1%26entityType%3Dcollection%26workspaceId%3D372b42be-1232-4939-a544-d2979fce9a12)

### 📚 Recursos utilizados 

- Spring Boot/Web
- JPA/Hibernate
- Injeção de dependência
- Lombok
- Data Transfer Object (DTO)
- Exception Handler
- Serialização (Jackson)
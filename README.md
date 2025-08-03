LocalTech - Gerenciamento de Veículos

Projeto desenvolvido na Pós-Tech FIAP focado em Spring MVC para gerenciamento básico de veículos. Implementa um sistema CRUD simples com acesso a dados via JDBC Template e banco de dados em memória H2.

Funcionalidades
Listagem paginada de veículos

Busca de veículo por ID

Cadastro, atualização e exclusão de veículos

Console web do banco H2 para visualização dos dados

Tecnologias Utilizadas
Java 21

Spring Boot 3 (Spring MVC)

JDBC Template

H2 Database (banco em memória)

Maven

Postman (testes de API)

Banco de Dados
H2 (em memória)

Console disponível em http://localhost:9090/h2-console

Configuração padrão:

Usuário: sa

Senha: password

URL: jdbc:h2:mem:localtech

Como Executar
Clone o repositório

Entre na pasta do projeto

Execute mvn spring-boot:run (Java 21 deve estar instalado)


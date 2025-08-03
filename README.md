LocalTech é um sistema de gerenciamento de veículos desenvolvido durante a Pós-Tech FIAP com foco em Spring MVC. O projeto apresenta uma arquitetura simples para reforçar conceitos básicos do desenvolvimento backend com Java e Spring Boot.

Funcionalidades Implementadas
CRUD completo para gerenciamento de Veículos

CRUD completo para gerenciamento de Pessoas

Banco de dados em memória H2 com scripts automáticos para criação e popular dados

Paginação para listagem de veículos e pessoas

Acesso ao console web do H2 para visualização dos dados

Funcionalidades em Desenvolvimento
Módulo de Aluguel (em desenvolvimento)

Tecnologias Utilizadas
Java 21

Spring Boot 3 (Spring MVC)

JDBC Template

Banco H2 (em memória)

Maven

Docker (para containerização)

Postman (para testes da API)

Banco de Dados
H2 Database em memória

Console acessível via http://localhost:9090/h2-console (porta configurável)

Credenciais padrão:

Usuário: sa

Senha: password

URL: jdbc:h2:mem:loctech

Como Executar
Clone o repositório

Navegue até a pasta do projeto

Execute mvn spring-boot:run para rodar localmente

Ou utilize o Docker:

docker build -t localtech-app .

docker run -p 8080:8080 localtech-app

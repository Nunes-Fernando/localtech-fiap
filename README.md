🚗 LocalTech - Gerenciamento de Veículos
Este é o primeiro projeto desenvolvido durante a Pós-Tech FIAP, com foco em Spring MVC. O projeto simula um sistema de gerenciamento de veículos, utilizando uma arquitetura simples para reforçar os conceitos básicos do desenvolvimento backend com Java e Spring.

📌 Tecnologias utilizadas
Java 21

Spring Boot 3 (Spring MVC)

JDBC Template

H2 Database (banco em memória)

Maven

Postman (para testes da API)

⚙ Funcionalidades
✅ Listagem de veículos com paginação
✅ Busca de veículo por ID
✅ Cadastro de novos veículos
✅ Atualização de dados de um veículo
✅ Exclusão de veículos
✅ Acesso ao console do H2 Database

💾 Banco de Dados
Banco: H2 (em memória)

Console web disponível em: http://localhost:9090/h2-console.
Obs: Você pode configurar a porta de sua preferência, no arquivo properties.

Usuário padrão: sa

Senha: password

URL: jdbc:h2:mem:loctech

🚀 Como rodar o projeto
1️⃣ Clone o repositório

bash
Copiar
Editar
git clone https://github.com/Nunes-Fernando/localtech.git
2️⃣ Navegue até a pasta do projeto

bash
Copiar
Editar
cd localtech
3️⃣ Compile e execute

bash
Copiar
Editar
mvn spring-boot:run
💡 Pré-requisito: Java 21 instalado e configurado na sua máquina.

📝 Scripts e dados
Na inicialização do projeto:

O banco H2 é criado automaticamente.

O arquivo data.sql popula o banco com dados de exemplo.

📌 Objetivo
Este projeto tem como objetivo:

Praticar os conceitos fundamentais do Spring MVC.

Compreender o uso do JDBC Template para acesso a dados.

Implementar um CRUD básico em uma arquitetura MVC.

Utilizar banco de dados em memória com o H2.

👨‍💻 Sobre
Desenvolvido como parte do primeiro desafio da Pós-Tech FIAP - Java & Spring.



# 🎮 DSList - Catálogo de Jogos

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2_Database-437299?style=for-the-badge&logo=h2&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![REST API](https://img.shields.io/badge/REST_API-005C9C?style=for-the-badge&logo=rest-api&logoColor=white)

Este é um projeto **Java Spring Boot** que desenvolvi como parte do meu aprendizado em construção de APIs REST, com foco em boas práticas de arquitetura em camadas, uso de DTOs, ORM com JPA e deploy profissional. O sistema consiste em um backend para um catálogo de jogos, onde é possível listar games organizados em listas com ordenação por posição.

---

## 💼 Sobre o projeto

Este projeto foi parte de um estudo prático de backend com Java. Além de solidificar conceitos técnicos, também aprendi:

- Organização de projetos reais
- Preparação para entrevistas técnicas
- Boas práticas de escrita de código limpo
- Como documentar e expor um projeto no GitHub de forma profissional

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database (ambiente dev)**
- **PostgreSQL (ambiente de produção)**
- **Docker e Docker Compose**
- **Maven**
- **Lombok**
- **Spring Web**
- **Modelagem de dados UML**
- **CI/CD e versionamento de ambientes com profiles**
- **Postman para testes de API**

## 🧠 O que aprendi com esse projeto

### 📚 Conceitos abordados:
- Funcionamento de **sistemas web**: requisições HTTP, JSON, cliente-servidor
- **Padrão REST** para APIs
- **Arquitetura em camadas** (Controller → Service → Repository)
- **DTO (Data Transfer Object)** para desacoplamento da entidade e comunicação segura
- **ORM com JPA/Hibernate**
- **Projections** para consultas otimizadas
- **Relacionamentos N-N** com chave composta (Embedded ID)
- **Database Seeding** com script `import.sql`
- **Deploy com Docker e CI/CD**
- Configuração de **CORS** para acesso por frontend

### ⚙️ Estrutura do Projeto

![Screenshot 2025-05-27 113648](https://github.com/user-attachments/assets/8f14a993-f38b-4dfb-aec7-b6175a9ffbe7)

```
dslist
├── config
│   └── WebConfig.java
├── controllers
│   ├── GameController.java
│   └── GameListController.java
├── dto
│   ├── GameDTO.java
│   ├── GameListDTO.java
│   ├── GameMinDTO.java
│   └── ReplacementDTO.java
├── entities
│   ├── Belonging.java
│   ├── BelongingPK.java
│   ├── Game.java
│   └── GameList.java
├── projections
│   └── GameMinProjection.java
├── repositories
│   ├── GameListRepository.java
│   └── GameRepository.java
└── services
    ├── GameListService.java
    └── GameService.java
```

![Screenshot 2025-05-27 112354](https://github.com/user-attachments/assets/8ce39b9b-d27f-4b65-8a21-dc961a1dfec0)

- **Game**: entidade principal com informações detalhadas do jogo
- **GameList**: listas que agrupam jogos
- **Belonging**: entidade associativa que representa o relacionamento entre `Game` e `GameList` com posição ordenável


### 🌐 Endpoints (Exemplos)

- `GET /games` → Lista todos os jogos
- `GET /games/{id}` → Retorna os detalhes de um jogo
- `GET /lists` → Lista todas as listas de jogos
- `GET /lists/{listId}/games` → Retorna os jogos daquela lista, em ordem
- `POST /lists/{listId}/replacement`: Reordena um jogo dentro de uma lista (requer um corpo de requisição com `sourceIndex` e `destinationIndex`).

## 🛠️ Como rodar o projeto

```bash
# Clone o repositório
git clone https://github.com/seuusuario/dslist.git
cd dslist

# Execute com Spring Boot
./mvnw spring-boot:run
```

A aplicação roda por padrão em: `http://localhost:8080`

Banco de dados em memória H2 acessível em:  
`http://localhost:8080/h2-console`

## 📦 Importação e Seed

O arquivo `import.sql` faz a inserção inicial no banco de dados para facilitar testes e demonstrações da API.

---

## 🤝 Conecte-se comigo

Se quiser trocar ideias ou tiver dúvidas:

Desenvolvido por **[Seu Nome Completo]**

-   GitHub: [Link para o seu perfil GitHub](https://github.com/wesleyjao)
-   LinkedIn: [Link para o seu perfil LinkedIn](https://linkedin.com/in/wesley-joão-458b51359)
-   Email: wesleyy.dev2@gmail.com

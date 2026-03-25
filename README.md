# TaskFlow API

API REST desenvolvida com Java e Spring Boot para gerenciamento de usuários e tarefas, com autenticação JWT, controle de acesso por roles e integração com PostgreSQL.

## Tecnologias
- Java 17
- Spring Boot
- Spring Security
- JWT
- JPA / Hibernate
- PostgreSQL
- Docker
- Swagger

## Funcionalidades
- Registro e login de usuários
- Autenticação com JWT
- Proteção de endpoints
- CRUD de tarefas
- Tarefas vinculadas ao usuário autenticado
- Controle de acesso por perfil
- Documentação com Swagger
- Tratamento global de erros

## Endpoints principais

### Auth
- `POST /auth/register`
- `POST /auth/login`

### Tasks
- `GET /tasks`
- `GET /tasks/{id}`
- `POST /tasks`
- `PUT /tasks/{id}`
- `DELETE /tasks/{id}`

## Segurança
- Senhas criptografadas com BCrypt
- Autenticação stateless com JWT
- Usuário só pode acessar as próprias tarefas
- Rotas ADMIN protegidas por role

## Como rodar localmente

### Banco
```bash
docker compose up -d
Aplicação
./mvnw spring-boot:run
Swagger

Acesse:
/swagger-ui.html

Autor

Jackson De lima

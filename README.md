# Sistema Academia API

API REST para gerenciamento de uma academia.

## Tecnologias
Java 17, Spring Boot, Spring Data JPA, PostgreSQL, Maven, Docker e REST API.

## Como executar
Pré-requisito: Docker Desktop.

    git clone https://github.com/lfillipebf-ai/sistema-academia-api.git
    cd sistema-academia-api
    docker compose up --build

API: http://localhost:8080

## Funcionalidades
- Cadastro de alunos, professores e planos
- Matrículas e status
- Registro de pagamentos
- Consulta de alunos ativos

## Endpoints principais
- GET/POST /api/alunos
- GET/POST /api/professores
- GET/POST /api/planos
- GET/POST /api/matriculas
- PATCH /api/matriculas/{id}/status
- GET/POST /api/pagamentos
- GET /api/alunos/ativos

Autor: Luis Fillipe Backer Faria
GitHub: lfillipebf-ai

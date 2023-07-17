<h1>SBOOT-SRV-ARCHITTETURE-HEXAGONAL-MODEL</h1>

# Model Architteture Hexagonal API

## Architteture Hexagonal Spring boot Project
Projeto responsável por modelar e exenmplificar como que funciona um projeto em arquitetura hexagonal em micro-services

## Descrição
Aplicação responsável por mostrar como uma arquitetura hexagonal se comporta

## Funcionalidades
1 - Buscar os endereços do cliente a partir do CEP.

## Tecnologias
- Java v17
- Springboot v3.1.1
- Maven v3.9
- MongoDB
- Spring boot for apache kafka

## Requisitos
- JDK v17
## Inicialização
### Docker
1 - Construa a imagem no seu docker:
```bash
docker build . -t sboot-srv-architteture-hexagonal-model
```
2 - Inicializar a imagem na porta 8080:
```bash
docker run --name internet-banking -p 8089:8089 -d sboot-srv-architteture-hexagonal-model
```
2 - Inicializar a imagem docker através da pasta docker-local-test
```bash
docker-compose up
```
### Local
1 - Construa seu projeto no maven:
```bash
mvn clean install -U
```
2 - Importe o seu projeto no eclipse ou intelliJ
3 - Inicializar o arquivo SbootSrvArchittetureHexagonalModelApplication

## Colaboradores
Vinicius Torres Pascucci <a href="https://github.com/viniciuspascucci1993" target="_blank">LinkedIn</a>

## Status do Projeto
Em Desenvolvimento.
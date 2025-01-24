# Loja de Exemplo em Spring

Este projeto é uma aplicação simples desenvolvida em Spring Boot, que simula o gerenciamento de produtos de uma loja sem utilização de banco de dados. Os dados são armazenados em uma lista (´List´) na memória durante a execução da aplicação.

## Endereço Base

```
http://localhost:8080
```

## Endpoints Disponíveis

### 1. Criar um Produto
- **Endpoint**: `/product`
- **Método HTTP**: `POST`
- **Body (JSON)**:

```json
{
    "name": "Notebook",
    "price": 20023.30
}
```
- **Resposta (JSON)**:

```json
{
    "id": 1,
    "name": "Notebook",
    "price": 20023.30
}
```

### 2. Buscar Todos os Produtos
- **Endpoint**: `/product`
- **Método HTTP**: `GET`
- **Resposta (JSON)**:

```json
[
    {
        "id": 1,
        "name": "Notebook",
        "price": 20023.30
    },
    {
        "id": 2,
        "name": "Teclado",
        "price": 223.20
    }
]
```

### 3. Buscar um Produto por ID
- **Endpoint**: `/product/{id}`
- **Método HTTP**: `GET`
- **Resposta (JSON)**:

```json
{
    "id": 1,
    "name": "Notebook",
    "price": 20023.30
}
```

### 4. Atualizar um Produto
- **Endpoint**: `/product/{id}`
- **Método HTTP**: `PUT`
- **Body (JSON)**:

```json
{
    "name": "Notebook",
    "price": 25000.00
}
```
- **Resposta (JSON)**:

```json
{
    "id": 1,
    "name": "Notebook",
    "price": 25000.00
}
```

### 5. Deletar um Produto
- **Endpoint**: `/product/{id}`
- **Método HTTP**: `DELETE`
- **Resposta (JSON)**:

```json
{
    "id": 1,
    "name": "Notebook",
    "price": 20023.30
}
```

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.2**
- **Maven**

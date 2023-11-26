# CardapiZap API

## Introdução

CardapiZap é uma API RESTful desenvolvida para gerenciar um sistema de pedidos para restaurantes. 
Ela permite criar, atualizar, visualizar e excluir clientes, produtos, pedidos e métodos de pagamento, oferecendo uma solução completa para o gerenciamento de pedidos de um restaurante.

## Tecnologias Utilizadas

- Java 11
- Spring Boot
- JPA/Hibernate
- Banco de dados PostgreSQL
- Lombok
- Maven

## Configuração

Para configurar e executar a API localmente, siga os passos abaixo:

1. Clone o repositório: `git clone [URL do repositório]`
2. Entre no diretório do projeto: `cd CardapiZap`
3. Execute o projeto com Maven: `mvn spring-boot:run`

A API estará disponível em `http://localhost:8081`.

## Uso

A API fornece os seguintes endpoints:

### Clientes
- `GET /clientes`: Retorna todos os clientes.
- `GET /clientes/{id}`: Retorna um cliente específico pelo ID.
- `POST /clientes`: Cria um novo cliente.
- `PUT /clientes/{id}`: Atualiza um cliente existente.
- `DELETE /clientes/{id}`: Exclui um cliente.

### Produtos
- `GET /produtos`: Retorna todos os produtos.
- ... (e assim por diante para outros endpoints)

## Contribuições

Contribuições são sempre bem-vindas! Para contribuir, por favor:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature: `git checkout -b nova-feature`
3. Faça suas alterações e confirme-as: `git commit -m 'Adiciona alguma feature'`
4. Envie para a branch original: `git push origin nova-feature`
5. Crie um pull request.

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
- `GET /produtos/{id}`: Retorna um produto específico pelo ID.
- `POST /produtos`: Cria um novo produto.
- `PUT /produtos/{id}`: Atualiza um produto existente.
- `DELETE /produtos/{id}`: Exclui um produto.

### Endereços de Entrega
- `GET /enderecos-entrega`: Retorna todos os endereços de entrega.
- `GET /enderecos-entrega/{id}`: Retorna um endereço de entrega específico pelo ID.
- `POST /enderecos-entrega`: Cadastra um novo endereço de entrega.
- `PUT /enderecos-entrega/{id}`: Atualiza um endereço de entrega existente.
- `DELETE /enderecos-entrega/{id}`: Remove um endereço de entrega.

### Métodos de Pagamento
- `GET /metodos-pagamento`: Lista todos os métodos de pagamento disponíveis.
- `GET /metodos-pagamento/{id}`: Detalha um método de pagamento específico.
- `POST /metodos-pagamento`: Adiciona um novo método de pagamento.
- `PUT /metodos-pagamento/{id}`: Atualiza um método de pagamento existente.
- `DELETE /metodos-pagamento/{id}`: Exclui um método de pagamento.

### Pedidos
- `GET /pedidos`: Exibe todos os pedidos realizados.
- `GET /pedidos/{id}`: Mostra detalhes de um pedido específico.
- `POST /pedidos`: Registra um novo pedido.
- `PUT /pedidos/{id}`: Atualiza um pedido existente.
- `DELETE /pedidos/{id}`: Cancela um pedido.

## Contribuições

Contribuições são sempre bem-vindas! Para contribuir, por favor:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature: `git checkout -b nova-feature`
3. Faça suas alterações e confirme-as: `git commit -m 'Adiciona alguma feature'`
4. Envie para a branch original: `git push origin nova-feature`
5. Crie um pull request.

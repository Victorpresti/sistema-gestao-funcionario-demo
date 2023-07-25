# É só executar SGFApplication e utilizar Java 11

Criei essa aplicação utilizando arquitetura padrão hexagonal, embora ela seja muito complexa para um programa desse tamanho. Demorou entre 1h e 1h30m para montar toda a aplicação do zero.

# Contém 4 rotas, POST, GET, PATCH, DELETE
# Para testar execute pelo Postman ou equivalente, em ordem, começando pelo save:

POST
URL: http://localhost:8080/funcionario/save

Body:
{
  "idFuncionario": 1,
  "nomeFuncionario": "Victor",
  "cargoFuncionario": "Programador",
  "salarioFuncionario": 50000.0,
  "telefoneFuncionario": "(12) 34567890",
  "enderecoFuncionario": "Brasil, São Paulo, SP"
}

# Em seguida use o get para confirmar o save:

GET
URL: http://localhost:8080/funcionario/get/1

# Use o patch para alterar a informação adicionada:

PATCH
URL: http://localhost:8080/funcionario/update

Body:
{
  "idFuncionario": 1,
  "nomeFuncionario": "Victor Presti",
  "cargoFuncionario": "Programador Java",
  "salarioFuncionario": 50000.0,
  "telefoneFuncionario": "(12) 34567890",
  "enderecoFuncionario": "Brasil, São Paulo, SP"
}

# Novamente o get para confirmar o patch:

GET
URL: http://localhost:8080/funcionario/get/1

# Agora o delete para remover o funcionário pelo ID:

DELETE
URL: http://localhost:8080/funcionario/delete/1


# Finalizando com o delete para confirmar que não existe mais esse funcionário na 'base':

GET
URL: http://localhost:8080/funcionario/get/1



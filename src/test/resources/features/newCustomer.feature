# language: pt

Funcionalidade: Customer

  Contexto:
    Dado que eu esteja na tela de login
    Quando faço login com o username "admin" e password "admin"

  @SuccessfullRegisterCustomer
  Cenário: Adicionar um novo customer
    Dado que eu esteja na tela inicial
    Quando acesso o menu Customers
    E adiciono um novo customer com o email "aultima3@email.com.br"
    Então o email "aultima3@email.com.br" é cadastrado com sucesso

  @testeacesso
  Cenário: Adicionar um novo customer
    Dado que eu esteja na tela inicial
    Quando acesso o menu Customers
    E acesso o cadastro do email
    Então verifico se está cadastrado

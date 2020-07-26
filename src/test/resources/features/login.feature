# language: pt

Funcionalidade: Login

  @SuccessfullLogin
  Cenário: Realizar login com sucesso
      Dado que eu esteja na tela de login
      Quando faço login com o username "admin" e password "admin"
      Então sou autenticado com sucesso
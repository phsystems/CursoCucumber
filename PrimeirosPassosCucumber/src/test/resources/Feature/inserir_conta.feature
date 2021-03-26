#language: pt
Funcionalidade: Cadastro de contas

Como um usuario
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Cenário: Deve inserir uma conta com sucesso
Dado que estou acessando a aplicacao
Quando informo o usuario "leticiaperetti@hotmail.com"
E a senha "741123"
E seleciono entrar
Então visualizo a pagina inicial
Quando seleciono Contas
E seleciono Adicionar
E informo a conta "Conta de Teste"
E seleciono Salvar
Então a conta e inserida com sucesso




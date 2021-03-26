# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar criterios de acietacao

Cenario: Deve executar especificacao
  Dado que criei o arquivo corretamente
  Quando executa - lo 
  Entao a especificacao deve finalizar com sucesso
  
Cenario: Deve incrementar contador
  Dado que o valor do contador e 15
  Quando eu incrementar em 3
  Entao o valor do contador sera 18
  
Cenario: Deve incrementar contador
  Dado que o valor do contador e 123
  Quando eu incrementar em 35
  Entao o valor do contador sera 158
  
Cenario: Deve calcular atraso na entrega
  Dado que a entrega e dia 05/04/2021
  Quando a entrega atrasar em 2 dias
  Entao a entrega sera efetuada em 07/04/2021
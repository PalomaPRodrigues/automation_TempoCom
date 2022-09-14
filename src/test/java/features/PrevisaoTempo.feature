#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:06/09/2022
#version: 1.0


Funcionalidade: Busca de Temperatura
  Como um usuario do site Tempo.Com
  Quero buscar a previsão do tempo
  Para me programar na semana

  @Teste
  Esquema do Cenario:Busca de Temperatura
    Dado que acesso a pagina home do site
    E clico em aceitar
    E clico no campo buscar
    E preencho o nome da cidade "<cidade>"
    E seleciono o periodo de pesquisa
    Quando clico em pdf
    Entao envio o email com a previsão do tempo

    Exemplos:
      | cidade   |
      | Sorocaba |

  @Teste
  Esquema do Cenario: Validacao do Envio do Email
    Dado que acesso a pagina de login
    E preencho email "<email>"
    E clico em Avancar
    E preencho senha "<senha>"
    Quando clico em Avanca
    Entao valido que o recebimento do email "<msgFinal>"

    Exemplos:
      | email                                 | senha     | msgFinal          |
      | testesenvioemailtemperatura@gmail.com | Teste1234 | Previsão do Tempo |
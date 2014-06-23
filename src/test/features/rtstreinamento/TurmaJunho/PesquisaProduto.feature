#language:pt
@regressão-total
Funcionalidade: Pesquisa de produto
  Como ....

  Contexto: 
    Dado eu esteja na página para pesquisa de produto
 @executar-esse
  @validação
  Cenário: Pesquisar produto pelo nome completo
    Dado que o filme "Senhor dos Aneis - As duas torres" esteja cadastrado
    Quando pesquiso o filme "Senhor dos Aneis - As duas torres"
    Então visualizo o filme pesquisado

  @validação @execução-manual
  Cenário: Pesquisar produto por parte do nome
    Dado que o filme "Senhor dos Aneis - As duas torres" esteja cadastrado
    E que o filme "Senhor dos Aneis - A sociedade do anel" esteja cadastrado
    Quando pesquiso o filme "Senhor dos Aneis"
    Então visualizo dois filmes no resultado da pesquisa

  @validação
  Cenário: Pesquisar produto indisponível
    Dado que o filme "Thor" esteja cadastrado como indisponivel
    Quando pesquiso o filme "Thor"
    Então visualizo o filme como indisponivel no resultado da pesquisa

  @exceção
  Cenário: Pesquisar produto inexistente
    Dado que o filme "O Espetacular Homem Aranha 2" nao esteja cadastrado
    Quando pesquiso o filme "O Espetacular Homem Aranha 2"
    Então visualizo a mensagem Produto não cadastrado

  @exceção
  Cenário: Pesquisar sem informar o nome do produto
    Dado que existam filmes cadastrados
    Quando pesquiso sem informar um filme
    Então visualizo todos os filmes cadastrados

  @validação
  Esquema do Cenário: Pesquisar produto por parte do nome
    Dado que o filme "Senhor dos Aneis - As duas torres" esteja cadastrado
    E que o filme "Senhor dos Aneis - A sociedade do anel" esteja cadastrado
    Quando pesquiso o filme "<valor-pesquisar>"
    Então visualizo "<quantidade>" filme

    Cenários: 
      | valor-pesquisar | quantidade |
      | Senhor          | 2          |
      | Aneis           | 2          |
      | dos             | 2          |
      | Sociedade       | 1          |

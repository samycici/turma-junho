#language:pt
Funcionalidade: cadastrar e-mail newsletter

  @validação @executar-esse
  Cenário: Cadastrar email valido
    Dado que eu esteja na página de newsletter
    Quando tento cadastrar o email na newsletter
    Então visualizo a mensagem "Seu cadastro foi realizado com sucesso em nossa newsletter."

  @exceção
  Cenário: Rejeitar cadastro caso email já exista
    Dado que eu esteja na página de newsletter
    E o email "joao@gmail.com" já esteja cadastrado
    Quando tento cadastrar o email "joao@gmail.com" na newsletter
    Então visualizo a mensagem "Email já cadastrado"

  @exceção
  Cenário: Rejeitar formato de email inválido
    Dado que eu esteja na página de newsletter
    Quando tento cadastrar o email "maria.#gmail.com"
    Então visualizo a mensagem "Email inválido"

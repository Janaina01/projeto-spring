package com.projeto.spring;

public class Teoricas {
    //O que é uma API REST? Pra que ela serve?
    /*R: É uma interface que permite a comunicação entre sistemas por meio do protocolo HTTP,
    seguindo os princípios da arquitetura REST.
    Ela permite que uma aplicação consiga consultar, cadastrar, atualizar ou excluir informações de outra aplicação.*/

    //Qual a diferença entre GET, POST, PUT e DELETE? Dê um exemplo de cada.
    //R: São métodos HTTP para indicar uma operação que queremos realizar.
    //GET: Consulta informações. Ex.: GET /equipamentos/1
    //POST: Envia dados, geralmente de cadastro. Ex. POST /equipamentos/cadastrar
    //PUT: Atualiza ou substitui um recurso. Ex.: PUT /equipamentos/1
    //DELETE: Exclui um recurso. Ex.: DELETE /equipamentos/1

    //O que significam os status 200, 201, 400, 404 e 409?
    //200: Requisição realizada com sucesso
    //201: Criação realizada com sucesso
    //400: Requisição inválida
    //404: Valor/requisição não encontrada
    //409: Conflito, algo já cadastrado, por exemplo.

    //O que é JSON?
    //R: É um formato utilizado para representar e trocar dados entre sistemas. Ele organiza em pares de chave e valor.

    //Qual a função de cada camada: Controller, Service e Repository?
    //R: Essas camadas ajudam a organizar e separar responsabilidades.
    //Controller: Recebe as requisições e retorna respostas
    //Service: Executa as regras de negócio e coordena as operações.
    //Repository: Realiza as operações de acesso aos dados

    //O que a anotação @Entity faz?
    //R: Identifica uma classe Java como uma entidade gerenciada pelo JPA,
    // permitindo que seus objetos sejam gravados no banco de dados.

    //Por que o repository é uma interface, e quem escreve o código dele?
    /*R: Porque assim, o JPA consegue fornecer automaticamente os métodos necessários de acesso ao banco de dados,
    sem precisar implementar manualmente.*/

    //O que é validar? O que o @Valid faz?
    //R: Significa verificar se os dados recebidos atendem às regras definidas.
    //O @Valid solicita a execução das validações declaradas.

    //Como um JSON vira uma linha no banco de dados? Descreva o caminho, do Postman até a tabela.
    /* R: O Postman envia uma requisição POST contendo um JSON, o Spring MVC identifica o endpoint e converte o JSON
    em um objeto do Java por meio do @RequestBody; O @Valid verifica as validações declaradas no código;
    O Controller recebe o objeto e chama o Service, que executa as regras de negócio;
    O Repository usa o JPA pra refletir o objeto; O hibernate gera e executa o SQL por meio da conexao com o banco e
    o bando armazena então os dados na tabela.*/

   // E o caminho contrário: num GET /equipamentos/1, como uma linha do banco vira o JSON que aparece no Postman?
   /* R: O Postman envia uma requisição GET /equipamentos/1, o Spring identifica o metodo correspondente no Controller, que chama o Service; O Service pede para o Repository a busca do ID; O Repository usa o JPA pra consultar o banco,
    então o resultado é convertido em um objeto Java; O objeto retorna pelo Service até o Controller e
    o Spring converte o objeto em JSON, que envia a resposta HTTP para o Postman.*/

    //Quando o Postman manda um POST /equipamentos/cadastrar, como o Spring sabe qual método de qual controller chamar?
    //R: O Spring utiliza as anotações de mapeamento pra identificar qual método deve atender.

    //O @Valid barrou o pedido. O Service ficou sabendo? E o banco?
    //R: Não, quando o @Valid identifica um erro, o Spring interrompe o processamento antes de executar o Controller.
    //Com isso, o Service não é chamado e o Repository não grava no banco, possivelmente dando erro 400.

    //Qual a diferença entre o @NotBlank na entidade e o nullable = false no @Column?
    // Se os dois barram o mesmo nome vazio, por que ter os dois?
    //R: Porque o @NotBlank valida os dados, e o nullable = false no @Column reforça a integridade no banco de dados.

    //Ontem os dados sumiam quando o servidor reiniciava, e hoje não somem mais. O que mudou, e onde?
    //R: Antes era utilizado um banco H2 em memória, e os dados desapareciam quando a aplicação era encerrada.
    // Agora, com um banco persistente, como H2 em arquivo, os dados persistem mesmo após reiniciar o servidor.

    //Quem cria as tabelas no banco? Em algum momento a gente escreveu CREATE TABLE? Como isso acontece?
    //R: O Hibernate pode criar as tabelas a partir das classes anotadas com @Entity

    //O nome existsByPatrimonio é só um nome, e ninguém escreveu o código dele.
    //Como o Spring sabe o que esse método tem que fazer?*/
    /*R: O JPA utiliza query methods para conseguir criar consultas automaticamente a partir dos nomes dos métodos
    declarados no Repository.*/

}

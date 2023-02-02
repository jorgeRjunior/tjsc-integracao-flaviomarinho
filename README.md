## TJSC - Integração utilizando WSDL

## Índice 

* [Índice](#índice)
* [Descrição do Projeto](#descrição-do-projeto)
* [Status do Projeto](#status-do-projeto)
* [Modelagem de Dados](#Modelagem-de-Dados)
* [Funcionalidades](#funcionalidades)
* [Abrir e Rodar o Projeto](#abrir-e-rodar-o-projeto)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Pessoas Desenvolvedoras do Projeto](#pessoa-desenvolvedora)

## Descrição do Projeto

- `API de integração com o Tribunal de Justiça de Santa Catarina (TJSC) utilizando WSDL.`

## Status do Projeto

- `Projeto Concluído`

## Modelagem de Dados

![image](https://user-images.githubusercontent.com/107947462/216439893-c1467483-eb98-4adb-9fbe-3f015b519ca9.png)


## Funcionalidades
- `Funcionalidade 1` `Teste de conexão com o WebService do TJSC.`


```
Método GET (Teste)
localhost:8443/api/integracao/teste-conexao
Retorno da requisição - Status: 200 OK
{
    "lei":"5.133",
    "nome":"ASSOCIAÇÃO ATLÉTICA BEIRA RIO",
    "codigo":"1565"
}

```

- `Funcionalidade 2` `Salvar lista de entidades no banco de dados.`

```
Método GET (Salvar)
localhost:8443/api/integracao/salva-entidades
Retorno da requisição - Status: 200 OK
{
  "Dados salvos no banco com sucesso!"
}

```

- `Funcionalidade 3` `Listar todas as entidades direto do banco de dados.`

```
Método GET (Listar)
localhost:8443/api/main/lista-todos
Retorno da requisição - Status: 200 OK
{
    "codigo":"1565",
    "lei":"5.133",
    "nome":"ASSOCIAÇÃO ATLÉTICA BEIRA RIO",
    "id": "e0007cf4-aa02-4751-8884-e22f5d83329f"
}
 ```
 
- `Funcionalidade 4` `Consulta paginada filtrada por nome.`

```
Método GET (Paginação)
localhost:8443/api/main/lista-por-nome
Params: nome, page, size
Retorno da requisição - Status: 200 OK
{
    "total itens": 135,
    "pagina atual": 1,
    "entidades": [
        {
            "nome": "ASSOCIAÇÃO DE PAIS E AMIGOS DOS EXCEPCIONAIS (APAE)",
            "lei": "10.967",
            "codigo": 241,
            "id": "d676a955-a574-46c2-bf08-57116eba3f91"
        },
        {
            "nome": "ASSOCIAÇÃO DE PAIS E AMIGOS DOS EXCEPCIONAIS (APAE)",
            "lei": "8.496",
            "codigo": 2720,
            "id": "be56c6f6-f95c-4849-b7fc-34eab20858bb"
        }
    ],
    "total paginas": 68
}
```

- `Funcionalidade 5` `Consulta paginada filtrada por codigo.`

```
Método GET (Paginação)
localhost:8443/api/main/lista-por-codigo
Params: codigo, page, size
Retorno da requisição - Status: 200 OK
{
    "total itens": 1,
    "pagina atual": 0,
    "entidades": [
        {
            "nome": "ASSOCIAÇÃO DE PAIS E AMIGOS DOS EXCEPCIONAIS (APAE)",
            "lei": "10.967",
            "codigo": 241,
            "id": "d676a955-a574-46c2-bf08-57116eba3f91"
        }
    ],
    "total paginas": 1
}
```

- `Funcionalidade 6` `Testes unitários dos controllers da aplicação.`

```
- Os testes podem ser encontrados no respositório do projeto: src/test/java/com/integracao/tjsc/controllers

```


## Abrir e rodar o projeto

- `Faça o dowload do código fonte do projeto no repositório do github e depois descompacte.`
- `Após baixar o projeto, você pode abri-lo com o InteliJ IDEA.`
- `Após abrir o projeto na IDE, você deve configurar uma instância local do banco de dados MYSQL.`
- `Uma vez configurado o banco de dados, você deve rodar o seguinte script:`

```
CREATE DATABASE `integracao_tjsc_main`

CREATE TABLE entidade (
  `codigo` bigint(20) DEFAULT NULL,
  `lei` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id` varchar(100) NOT NULL
);

```
- `Você deve editar o arquivo application.properties passando as informações de acesso ao banco de dados.`
- `Nesse projeto foi necessário a utilização de SSL, para isso foi gerado um certificado digital que você pode visualizar no diretório resources "flaviomarinho.p12". Caso o mesmo tenha expirado, você pode recriá-lo com o seguinte comando:`
- `Comando: keytool -genkeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore flaviomarinho.p12 -validity 365`
- `Uma vez gerado o certificado, você deve atualizar o arquivo application.properties com as informações do mesmo.
- `Nesse projeto foi necessário importar um certificado digital do orgão TJSC, o mesmo pode ser encontrado e extraido a partir da url: https://selo.tjsc.jus.br/selo_teste/SeloService. Caso o mesmo expire você pode extraí-lo, salvá-lo com a extenção .cer e colá-lo na pasta resources do projeto. Para importá-lo ao projeto execute o comando abaixo:`
- `Comando:     keytool -noprompt -importcert -file src/main/resources/tjsc.cer -keystore /home/vhl/.jdks/openjdk-19.0.2/lib/security/cacerts -storepass changeit -alias TJSC -storepass changeit`

 
```

`application.properties`

# SSL
server.ssl.key-store=classpath:flaviomarinho.p12
server.ssl.key-store-password=123456
server.ssl.keyStoreType=PKCS12
#PORTA
server.port=8443

# BANCO
spring.datasource.url=jdbc:mysql://localhost:3306/integracao_tjsc_main
spring.datasource.username=root
spring.datasource.password=elisa

```

- `Após a configuração da conexão com o banco de dados, você deve clicar com o botão direito encima do projeto, ir na guia Maven e clicar em Reload project. Essa ação vai fazer com que o Maven baixe todas as dependências necessárias para a execução do projeto apontadas no arquivo pom.xml, você deve acompanhar esse processo e confirmando as instalações necessárias.`
- `Uma vez que terminaram os downloads e instalações reinicie a IDE.`
- `Feito isso é só escolher na guia Run/Debug Configurations a Tjsc.Application e executar o projeto!`
- `Testes unitários podem ser executados a parte, clicando em "run" direto no arquivo de testes.`

## Tecnologias utilizadas
- `Java 19`
- `Maven`
- `JDBC`
- `Spring Boot`
- `Lombok`
- `MySQL`
- `InteliJ IDEA`
- `WSDL`
- `SSL`
- `Certificado`
- `Postman`
- `Teste unitário`


## Pessoa Desenvolvedora
<img src="https://avatars.githubusercontent.com/u/107947462?s=400&u=a6d810255c8159011072b3cf5556fab573041443&v=4" width=115><br><sub>Flávio da Rosa Marinho</sub>

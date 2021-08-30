## Projeto de avaliação, de acordo com as seguintes requisições:

1 - Criar uma API Rest com o path “/carta” usando JAXRS para cadastrar, consultar e excluir uma carta. Permitir consultar uma carta por nome, id, classe ou tipo. Utilize os padrões de mercado para criação da API Rest.

2 - O armazenamento pode ser feito em memória usando um mapa.


# Desenvolvimento
#### O projeto foi desenvolvido utilizando SpringBoot utilizando o IntelliJ, e tendo como banco de dados o PostgreSQL
Devido à problemas de conexão, não foi possível finalizar o deploy do projeto em um hospederio (Heroku)

### Banco de Dados
Foi criado um banco de dados com o nome "hearthstone-bank" dentro o postgreSQL, e dentro dele a tabela de cartas é criada automaticamente na execução do código

### Postman
Executando o projeto através do ambiente de desenvolvimento, as operações podem ser realizadas pelo Postman ou pelo navegador de preferência através da seguinte URL:
http://localhost:8080/cards

# Operações:
## Cadastro de cartas (POST)
http://localhost:8080/cards/add

É possível inserir novas cartas no banco através do seguinte modelo JSON, respeitando os atributos descritos abaixo:
```
{
    "name": "Nome",
    "description": "Descricao",
    "cardClass": 0,
    "cardType": 0,
    "attack": 10,
    "defense": 10
}

# Classes:
  0 - Mage
  1 - Paladin
  2 - Hunter
  3 - Druid
  4 - Any
  
# Tipo:
  0 - Magic
  1 - Creature
  
# Ataque e Defesa:
  Valores de 0 a 10
```
## Consulta por ID (GET)
http://localhost:8080/cards/id={id}

Retorna as informações da carta com o ID digitado. Substituir {id} pelo ID da carta desejada

Exemplo: http://localhost:8080/cards/id=10
  
## Consulta por Nome (GET)
http://localhost:8080/cards/name={name}

Retorna as informações da carta com o Nome descrito. Substituir {name} pelo nome da carta desejada.

Exemplo: http://localhost:8080/cards/name=Barov

## Consulta por Classe (GET)
http://localhost:8080/cards/class={cardClass}

Retorna uma lista de cartas da Classe selecionada. Substituir {cardClass} pela classe desejada. (Mage, Paladin, Hunter, Druid, Any)

Exemplo: http://localhost:8080/cards/class=Mage

## Consulta por Tipo (GET)
http://localhost:8080/cards/type={cardType}

Retorna uma lista de cartas do Tipo selecionado. Substituir {cardType} pelo tipo desejado. (Magic, Creature)

Exemplo: http://localhost:8080/cards/type=Magic

## Listar cartas (GET)
http://localhost:8080/cards/list

Retorna a lista completa com todas as informações de cartas no banco de dados

## Excluir cartas usando o ID (DELETE)
http://localhost:8080/cards/delete/id={id}

É possível excluir alguma carta do registro utilizando o seguinte código, substituindo {id} pelo número da carta que deseja remover.

Exemplo: http://localhost:8080/cards/delete/id=15


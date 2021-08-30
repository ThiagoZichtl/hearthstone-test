## Projeto de avaliação, de acordo com as seguintes requisições:

1 - Criar uma API Rest com o path “/carta” usando JAXRS para cadastrar, consultar e excluir uma carta. Permitir consultar uma carta por nome, id, classe ou tipo. Utilize os padrões de mercado para criação da API Rest.

2 - O armazenamento pode ser feito em memória usando um mapa.


# Desenvolvimento
#### O projeto foi desenvolvido utilizando SpringBoot tendo como banco de dados o PostgreSQLheroku

### Operações via GET:
- [x] Consulta por ID
- [x] Consulta por Nome
- [x] Consulta por Tipo de carta
- [x] Consulta por Classe da carta
- [x] Consulta de todas as cartas cadastradas
- [ ] Consulta pela Descrição
- [ ] Consulta pelos pontos de Ataque
- [ ] Consulta pelos pontos de Defesa

### Operações via POST
- [x] Cadastro de cartas - seguindo modelo JSON:
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
### Operações via DELETE
- [x] Exclusão de cartas via ID


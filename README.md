# Desafio: Aprenda na Prática Programação Orientada a Objetos

## Melhorias

### Classe Bootcamp

#### Validações adicionadas em setNome e setDescricao:

* Verifica se os valores são nulos ou vazios e lança uma `IllegalArgumentException` caso sejam.
  
#### Validações adicionadas em setDevsInscritos e setConteudos:

* Verifica se os conjuntos são nulos e lança uma `IllegalArgumentException` caso sejam.
      
![Classe Bootcamp](https://github.com/marcsalexandrborges/desafio-poo-dio-master/raw/main/1.png)

### Classe Conteudo

#### Validações adicionadas em setTitulo e setDescricao:

* Verifica se os valores são nulos ou vazios e lança uma `IllegalArgumentException` caso sejam.
      
![Classe Conteudo](https://github.com/marcsalexandrborges/desafio-poo-dio-master/raw/main/2.png)

### Classe Curso

#### Validação adicionada em setCargaHoraria:

* Verifica se o valor da carga horária é positivo e lança uma `IllegalArgumentException` caso não seja.
      
![Classe Curso](https://github.com/marcsalexandrborges/desafio-poo-dio-master/raw/main/3.png)

### Classe Dev

 #### Validações adicionadas em inscreverBootcamp:
 
* Verifica se o bootcamp é nulo e lança uma `IllegalArgumentException` caso seja.
  
 #### Validações adicionadas em setNome:
 
* Verifica se o valor é nulo ou vazio e lança uma `IllegalArgumentException` caso seja.
  
 #### Validações adicionadas em `setConteudosInscritos` e `setConteudosConcluidos:
 
* Verifica se os conjuntos são nulos e lança uma `IllegalArgumentException` caso sejam.
      
![Classe Dev](https://github.com/marcsalexandrborges/desafio-poo-dio-master/raw/main/4.png)

### Classe Mentoria

 #### Validação adicionada em setData:
 
* Verifica se a data é nula e lança uma `IllegalArgumentException` caso seja.
      
![Classe Mentoria](https://github.com/marcsalexandrborges/desafio-poo-dio-master/raw/main/5.png)

### Considerações Finais

* Adicionei validações para entradas nulas ou vazias, que são boas práticas para garantir a integridade dos dados.
  
* Usei new HashSet<>(...) e new LinkedHashSet<>(...) nos métodos get e set para proteger a imutabilidade interna dos conjuntos.
  
* Simplifiquei o método calcularTotalXp na classe Dev usando streams.

Estas melhorias ajudarão a tornar o código mais robusto, legível e aderente aos princípios de POO.


# Unidade 2 - Introdução à Programação

Este espaço reúne **minhas anotações e atividades** relacionadas à segunda unidade da disciplina **Introdução à Programação**.

# Construção de Algoritmos - Parte 1

## Solução de Problemas

### Etapas para a Solução de Problemas

A especificação da solução de um problema com base em um software exige algumas etapas fundamentais:

- Entender o problema proposto (interpretação);
- Verificar os dados e recursos disponíveis para resolvê-lo (entradas);
- Identificar os dados ou resultados que se deseja alcançar (saídas);
- Definir e redigir os passos gerais para a solução do problema (processos ou regras);
- Descrever formalmente os passos para a solução do problema em uma linguagem clara e sem ambiguidades (representação da solução);
- Testar a solução (testes).

Após a análise e modelagem do problema, passa-se para o processo de implementação computacional do programa (programação).

## Identificar Dados de Entrada e Saída

Um problema computacional normalmente manipula dados e informações. As entradas e saídas de um programa são obtidas através da análise dos substantivos.

Os dados podem ser divididos em três tipos:

- **Dados de entrada**: informações ou recursos disponíveis para resolver um determinado problema utilizando o computador.
- **Dados intermediários**: informações intermediárias que ocorrem ao longo de um processo de solução do problema, mas que ainda não são a solução desejada.
- **Dados de saída**: informações que se deseja obter como resultado do problema.

Em um programa de computador, dados são tratados como variáveis. As variáveis armazenam valores na memória do computador e são caracterizadas por seu tipo:

- **Numérico Inteiro**: contém um número natural (ex.: `idade = 18`, `quantidade = 3`);
- **Numérico Real**: contém um número com casas decimais (ex.: `salario = 1215.76`, `altura = 1.95`);
- **Alfanumérico**: contém caracteres ou sequências de caracteres alfanuméricos (ex.: `letra = 'A'`, `simbolo = '@'`, `texto = "Teste de Texto"`);
- **Lógico**: contém verdadeiro ou falso (ex.: `sucesso = verdadeiro`, `triste = falso`).

### Exemplos - Parte 1

**Problema 1**: considerando que um professor tem 3 notas de um aluno, calcule a média do aluno.

- **Entradas**: 3 notas (numéricos reais)
- **Saída**: média (numérico real)

**Problema 2**: considerando que uma pessoa tem a largura e o comprimento de uma sala retangular, calcule a área da sala.

- **Entradas**: largura e comprimento (numéricos reais)
- **Saída**: área (numérico real)

## Descrever a Solução do Problema - Parte 1

Na descrição da solução de um problema, utilizam-se expressões e operadores. As expressões têm por finalidade verificar ou transformar os dados em um algoritmo. Elas contam com operadores que permitem realizar ações sobre os dados de um determinado algoritmo.

### Expressões/Operações/Comandos

#### Atribuição

Existem informações em um programa que precisam ser armazenadas em variáveis. Nestes casos, utiliza-se uma expressão de atribuição, representada por uma flecha para a esquerda (`<-`) ou pelo sinal de igual (`=`).

#### Entrada e Saída

Os programas normalmente recebem e informam dados executando operações denominadas de entrada (`ler`) e saída (`escrever`).

# Construção de Algoritmos - Parte 2

## Descrever a Solução do Problema - Parte 2

### Estruturas de Controle de Seleção e Repetição

- **Estruturas de Seleção**: comandos executados apenas em determinadas situações.
- **Estruturas de Repetição**: comandos que precisam ser executados repetidas vezes.

### Chamadas de Sub-rotinas

Muitas vezes, a solução de um algoritmo requer a execução de outros algoritmos.

### Tratamentos de Erros

Linguagens modernas possuem estruturas específicas para o tratamento de erros.

## Operações de Atribuição

Um comando de atribuição permite armazenar o resultado de uma expressão ou o valor de uma variável em outra variável. O símbolo de atribuição (`←`) indica que o valor à direita deve ser armazenado na variável à esquerda.

**Exemplo 1**: atribuir o valor 5 à variável A
```algoritmo
A ← 5
```

**Exemplo 2**: atribuir o valor de A somado de 2 unidades à variável B
```algoritmo
B ← A + 2
```

**Exemplo 3**: concatenar dois nomes com um espaço
```algoritmo
nome ← nome1 + " " + nome2
```

## Operadores

| Operador | Descrição |
|----------|------------|
| `+`, `-` | Operadores unários aplicados a um único operando. Exemplo: `-3`, `+x` |
| `+`, `-`, `*`, `/` | Operadores aritméticos: adição, subtração, multiplicação e divisão. `*` e `/` têm precedência sobre `+` e `-`. |
| `%` | Operador de resto: `10 % 3 = 1`. |
| `+` | Operador de concatenação de caracteres: `"Rio " + "de Janeiro" = "Rio de Janeiro"` |

## Operações de Entrada e Saída

Os comandos de entrada e saída são usados para inserir e exibir dados.

### Comando de Entrada

Utiliza-se o comando `ler`, que aguarda que o usuário insira um valor.
```algoritmo
ler (A)
ler (nome)
```

### Comando de Saída

Utiliza-se o comando `escrever` para exibir informações.
```algoritmo
escrever (X)
escrever ("Boa noite!")
escrever (A + B)
escrever ("Idade do aluno = ", idade)
```

## Formulário Para Análise e Especificação da Solução de Problemas

O formulário auxilia na análise do problema. Exemplos:

### Exemplo 1

Um professor deseja calcular a média de um aluno. Ele tem o nome e as 3 notas do aluno e a média deve ser calculada de forma aritmética.

### Exemplo 2

Modele a solução de um problema para calcular a área de uma sala retangular. Considere que as medidas estão expressas em metros.

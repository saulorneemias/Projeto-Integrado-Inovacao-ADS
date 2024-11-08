
# Sistema de Gerenciamento de Estoque

## Descrição

Este é um sistema de gerenciamento de estoque desenvolvido para uma empresa de comércio eletrônico simulado para o Projeto Síntese Inovação ADS. Ele visa otimizar o controle de inventário, permitindo a empresa gerenciar seu estoque de maneira eficiente, evitando problemas como falta de produtos, excesso de estoque e dificuldades no rastreamento de itens. O sistema oferece funcionalidades de cadastro de produtos, atualização de estoque, rastreamento de localização e geração de relatórios, além de ser modular e fácil de expandir.

## Funcionalidades

- **Cadastro de Produtos**: Permite cadastrar novos produtos com informações como nome, categoria, quantidade em estoque, preço e localização no depósito.
- **Atualização de Estoque**: Permite registrar entradas e saídas de produtos, atualizando automaticamente a quantidade em estoque.
- **Rastreamento de Localização**: Permite rastrear a localização dos produtos no depósito, facilitando a logística e organização interna.
- **Geração de Relatórios**: Gera relatórios automáticos sobre o estado do estoque, indicando produtos com estoque baixo, produtos em excesso e a movimentação ao longo de um período.
- **Consulta de Produtos**: Permite consultar produtos cadastrados por filtros de nome, categoria ou localização.
- **Movimentação de Produtos**: Registra todas as movimentações (entrada/saída) para cada produto com data e quantidade.

## Instalação

### Pré-requisitos

- **Java**: Certifique-se de ter o Java Development Kit (JDK) instalado (Java 8 ou superior).
- **IDE (opcional)**: Para facilitar o desenvolvimento, é recomendado o uso de uma IDE como IntelliJ IDEA ou Eclipse.

### Clonando o repositório

Clone este repositório em sua máquina local:

```bash
git clone https://github.com/usuario/sistema-gerenciamento-estoque.git
cd sistema-gerenciamento-estoque
```

Abra o projeto em sua IDE de preferência e compile os arquivos para garantir que tudo está funcionando corretamente.

### Utilização

Compile o projeto:

```bash
javac src/*.java
```

Execute o sistema:

```bash
java -cp src SistemaGerenciamentoEstoque
```

## Principais Funcionalidades

- **Cadastro de Produtos**: Insira novos produtos com informações detalhadas.
- **Atualização de Estoque**: Registre entradas e saídas de produtos.
- **Rastreamento**: Localize produtos específicos no depósito.
- **Relatórios**: Geração de relatórios automáticos sobre o estado do estoque.

## Classes e Estruturas de Dados

### Produto

Representa um produto no estoque. Atributos principais:

- `nome`: Nome do produto.
- `categoria`: Categoria do produto.
- `quantidade`: Quantidade em estoque.
- `preco`: Preço unitário.
- `localizacao`: Localização do produto no depósito.

### Movimentacao

Armazena a movimentação dos produtos no estoque, com os seguintes atributos:

- `produto`: Produto movimentado.
- `tipo_movimentacao`: Tipo de movimentação (entrada/saída).
- `quantidade`: Quantidade movimentada.
- `data`: Data da movimentação.

### RelatorioEstoque

Gera relatórios sobre o estado atual do estoque, destacando produtos com estoque baixo ou em excesso, e permite a visualização da movimentação dos produtos em períodos específicos.

### Estoque

Gerencia todas as operações principais do sistema, como cadastro, atualização de estoque, rastreamento e geração de relatórios.

## Testes

Testes foram implementados para garantir a funcionalidade e integridade do sistema:

- **Testes Unitários**: Verificam o funcionamento de cada função individualmente (ex.: cadastro, atualização e geração de relatórios).
- **Testes de Integração**: Testam a interação entre os diferentes módulos, como o impacto da atualização de estoque nos relatórios e rastreamento de localização.

Para rodar os testes (se aplicável), utilize uma biblioteca de testes em Java, como o JUnit.

## Contribuições

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto.
2. Crie uma nova branch para a funcionalidade ou correção (`git checkout -b minha-funcionalidade`).
3. Commit suas alterações (`git commit -m "Minha nova funcionalidade"`).
4. Envie para o repositório (`git push origin minha-funcionalidade`).
5. Abra um Pull Request.

## Contato

Para dúvidas ou sugestões, entre em contato pelo e-mail [sauloneemias.santana@gmail.com](mailto:sauloneemias.santana@gmail.com).

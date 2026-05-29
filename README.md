
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto

API desenvolvida utilizando Java com Spring Boot, JPA e Hibernate durante a realização de um curso de programação Java. O projeto consiste em uma API com banco de dados H2, contendo entidades como Produto, Item do Pedido, Pedido e Usuário, além de diferentes tipos de relacionamentos entre elas, adaptados para o paradigma de orientação a objetos.

A aplicação segue o padrão de arquitetura MVC, contendo as camadas Model, Controller, Service e Repository para cada entidade do sistema. Além disso, o Postman foi utilizado para realizar os testes das requisições da API.

## Modelo conceitual
![Modelo Conceitual](https://github.com/soleralucas/assets/blob/main/workshop-springboot4-jpa/Captura%20de%20tela%202026-05-28%20183836.png)
![Modelo Conceitual](https://github.com/soleralucas/assets/blob/main/workshop-springboot4-jpa/Captura%20de%20tela%202026-05-28%20182005.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Testes de API
- Postman

## Implantação em produção
- Banco de dados: H2

# Como executar o projeto

## Back end

Pré-requisitos:

* Java 17
* Spring Tools Suite (STS), Eclipse ou IntelliJ
* Git Bash

O projeto utiliza o banco de dados H2 em memória, não sendo necessária a instalação de um banco de dados externo.

```bash
# clonar repositório
git clone git@github.com:soleralucas/workshop-springboot4-jpa.git

# entrar na pasta do projeto
cd workshop-springboot4-jpa
```

Após clonar o projeto, importe-o na IDE Spring Tools Suite ou a que desejar como um projeto Maven.

Para executar a aplicação, utilize a própria IDE ou execute o comando abaixo no Git Bash:

```bash
./mvnw spring-boot:run
```

A aplicação iniciará localmente na porta padrão:

```bash
http://localhost:8080
```

## Banco de dados H2

O console do banco de dados H2 pode ser acessado pelo navegador através do link:

```bash
http://localhost:8080/h2-console
```

Por meio dele, é possível visualizar as tabelas e acompanhar as alterações realizadas no banco de dados pela aplicação.

## Testes da API

As requisições da API podem ser testadas utilizando o Postman, permitindo verificar o funcionamento dos endpoints e validar as funcionalidades da aplicação.

Além disso, as alterações realizadas podem ser acompanhadas pelo console do banco de dados H2 através do navegador.


# Autor

Lucas Pereira Solera

https://www.linkedin.com/in/lucas-pereira-solera/

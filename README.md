# Desafio DIO Academia Digital by MartonJr
#ContratoDeCompromissoDIO

#dio-desafio-academia-digital

## O Projeto Spring Data JPA - API RESTful

Olá! Meu nome é Marton e nesse repositório vou manter o progresso de desenvolvimento do desafio **Academia Digital**, do Bootcamp **Banco PAN Java Developer** da plataforma [DIO](https://www.dio.me/).

Os detalhes do desafio podem ser acessados diretamente da plataforma DIO [clicando aqui](https://web.dio.me/project/conhecendo-spring-data-jpa-na-pratica-com-java/learning/abd511f0-a5be-4f02-a204-03eb2614a12a).

A instrutora é a [Camila Cavalcante](https://www.linkedin.com/in/cami-la/) e seu repositório GitHub pode ser acessado através [desse link](https://github.com/cami-la/academia-digital). 

Optei por não fazer um fork de seu projeto pois preferi criar o meu do zero.

## Objetivo:

Nesse desafio vamos desenvolver uma **API RESTful** no domínio de uma academia de ginástica usando banco de dados PostgreSQL e mapeamento objeto-relacional (ORM) usando Spring Data JPA.

Vamos usar as seguintes Tecnologias:

- **IntelliJ IDEA**: IDE que escolhi para desenvolver;
- **Java 17**: apesar do projeto original ter sido desenvolvido em Java 11, tenho em minha máquina instalado o Java 17. Vou tentar desenvolver pelo Java 17. Se encontrar grandes dificuldades, volto para o Java 11.
- **Spring Data JPA**: para realizar o mapeamento objeto-relacional (ORM);
- **Spring Web**: para rodar o servidor web e escutar nossas chamadas API através do Apache Tomcat;
- **PostgreSQL 15.2-2**: o banco de dados escolhido para persistir nossos dados;
- **Hibernate Validator**: um validador de Bean com Hibernate;
- **Lombok**: uma biblioteca para reduzir códigos repetitivos mas necessários através de Java Annotation.
- **Postman**: ferramenta para realizar requisições web afim de testarmos nosso serviço;



## Progresso:

Vou reportar o meu progresso nesse projeto, incluindo as dificuldades que tive e como resolvi.

## 13/04/2023:

- Comecei criando um projeto usando o **Spring Initializr**. As configurações iniciais do projeto podem ser [acessadas aqui](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.5&packaging=jar&jvmVersion=17&groupId=me.dio&artifactId=desafio-academia-digital&name=desafio-academia-digital&description=Desafio%20DIO%20-%20Academia%20Digital%20by%20MartonJr&packageName=me.dio.desafio-academia-digital&dependencies=web,data-jpa,postgresql,validation,lombok). 
- No GitHub, criei o repositório onde irei guardar o [presente projeto](https://github.com/MartonLyra/dio-desafio-academia-digital).
- Certifiquei-me de que minha assinatura digital está devidamente configurado e que todos meus commits serão assinados por mim.
- Em seguida, instalei o PostgreSQL localmente em minha máquina.

## 14/04/2023:

- Resolvi detalhar nesse _readme.md_ o progresso do meu desenvolvimento.

---

- Comecei o dia [pesquisando](https://projectlombok.org/videos/lombok.mp4) sobre a biblioteca **Lombok** pois não a conhecia:

![Lombok](/gitResources/Lombok.png)

Pelo que entendi, você introduz algumas tags na classe do model e os _getters, setters, toString, hashCode_, dentre outros, são gerados pela biblioteca via _Reflection_, sem necessidade de gerar e manter tais códigos. Gostei pois manteve o visual da classe do model mais limpo.

---

- Durante o desenvolvimento, vamos ficar de olho no Diagrama ER BD:

![Diagrama](/gitResources/Diagrama-ER-BD.png)

---

- O **fluxo back-end** será: Cliente <---> Controller <---> Service <---> Repository <---> PostgreSQL.

- Criei as classes model 'Aluno', 'AvaliacaoFisica' e 'Matricula';











---
_Base64:_ RGVzYWZpbyBESU8gIkFjYWRlbWlhIERpZ2l0YWwiLCBieSBNYXJ0b25MeXJhLCBpbmljaWFkbyBkaWEgMTMvMDQvMjAyMy4=

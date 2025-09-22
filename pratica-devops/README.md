# 🎮 Prática ATDD & TDD – Gamificação em Cursos EAD

[![Java](https://img.shields.io/badge/Java-17-red.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5-orange.svg)](https://junit.org/junit5/)
[![Cucumber](https://img.shields.io/badge/Cucumber-latest-brightgreen.svg)](https://cucumber.io/)
[![JaCoCo](https://img.shields.io/badge/JaCoCo-latest-yellow.svg)](https://www.jacoco.org/jacoco/)

## 👥 Autores

- Cainã José de Arruda Pinto – 210626
- Isabelle Munhoz Scarso – 223285

## 📝 Contexto da Prática

Nesta prática, demos continuidade ao estudo de ATDD (Acceptance Test-Driven Development) iniciado na Prática 4, avançando nos ciclos do TDD (RED → GREEN → BLUE).

O objetivo foi implementar uma feature completa dentro do contexto de gamificação em cursos EAD, garantindo:

- ✅ Clareza dos requisitos (User Stories)
- ✅ Especificação de comportamento (BDD)
- ✅ Implementação com testes automatizados

## 📚 User Stories

### User Story 1 (Isabelle)
**Como** aluno  
**Quero** finalizar o curso com média acima de 7  
**Para que** eu tenha direito a realizar mais 3 cursos

### User Story 2 (Cainã)
**Como** aluno com assinatura premium  
**Quero** ser chamado para participar de projetos reais durante o curso  
**Para** aplicar meus conhecimentos em prática

## 🔄 BDD (Behavior Driven Development)

### Cenário 1: Aluno premium com módulo válido
```gherkin
Dado que o aluno possui uma assinatura premium ativa
Quando ele estiver cursando um módulo válido
Então o sistema deve incluí-lo na lista de alunos elegíveis para projetos reais
```

### Cenário 2: Aluno não premium com módulo válido
```gherkin
Dado que o aluno não possui assinatura premium
Quando ele estiver cursando um módulo válido
Então o sistema não deve incluí-lo na lista de alunos elegíveis para projetos reais
```

## 🧪 Implementação TDD

### 🔴 RED
- Criação dos testes de acordo com os BDDs
- Inicialmente falhando com stubs

### 🟢 GREEN
- Implementação da lógica nas classes Aluno e Modulo
- Garantindo a passagem dos testes

### 🔵 BLUE
- Refatoração para reduzir a complexidade ciclomática
- Melhorando a manutenibilidade do código

## 🛠️ Ferramentas e Tecnologias

- **Java 17**: Linguagem de programação principal
- **Spring Boot 3.2**: Framework da aplicação
- **Maven 3.9**: Gerenciamento de dependências e automação de build
- **JUnit 5 (Jupiter)**: Framework de testes
- **Cucumber**: Framework de testes BDD
- **JaCoCo**: Relatórios de cobertura de testes
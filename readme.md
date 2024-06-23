# Projeto de automação de testes para o sistema de gerenciamento de bug Mantis
Este projeto tem como objetivo automatizar a execução de testes no site [Mantis](http://mantis-prova.base2.com.br) 
para validar suas funcionalidades de maneira eficiente e precisa. O foco da automação é validar a funcionalidade de login em três cenários: login com sucesso, login com usuário incorreto e login com senha incorreta.

## Tecnologias utilizadas
- **Java:** Linguagem de programação utilizada para desenvolver os scripts de teste e interagir com a aplicação web.
- **Selenium:** Framework para automação de ações no navegador, como clicar em botões, preencher formulários e verificar elementos em páginas web.
- **JUnit:** Framework para testes unitários em Java, utilizado para estruturar e executar testes que verificam partes específicas do código.
- **Apache Commons IO:**  Biblioteca que auxilia na manipulação de arquivos, o que inclui a cópia e movimentação de arquivos de evidências durante os testes.

## Tecnologias necessárias
Este projeto de automação requer as seguintes tecnologias:
- **Git:** Sistema de controle de versão utilizado para gerenciar o código fonte do projeto.
- **Java:** Linguagem de programação.
- **Maven:** Ferramenta de automação de construção e gerenciamento de dependências, essencial para organizar, compilar, testar e construir projetos de software, incluindo projetos de automação.

## Clonando o repositório
Abra o terminal ou prompt de comando em seu computador, e utilize o comando **git clone** seguido da **URL** do repositório.
- **git clone https://github.com/empresarialmaia/Mantis.git**
- **cd Mantis**

## Como executar os testes
Após clonar o repositório, instale as dependências e execute os testes.
- **mvn clean install**
- **mvn test -Dtest=Executa**

Os testes definidos serão executados, e você poderá ver o resultado diretamente no terminal.


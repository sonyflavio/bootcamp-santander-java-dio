# Orientação a Objetos e UML: Diagramação de Classes do iPhone

,------------------------.  
|ReprodutorMusical       |  
|------------------------|  
|- Musica[] musicas      |  
|+tocar(): void          |  
|+pausar(): void         | 
|+slelecionarMusica: void|  
|                        |  
`------------------------'  

,-----------------------------.
|AparelhoTelefonico           |
|-----------------------------|
|-Contato[] contatos          |
|+redeMovelDisponive(): Bolean|
|+ligar(): void               |
|+atender(): void             |
|                             |
`-----------------------------'

,------------------------.                                 
|NavegadporInternet      |                                 
|------------------------|                                 
|-ConexaoComInternet     |                                 
|+exibirPagina(): void   |                                 
|+novaAba(): void        |                                 
|+atualizarPagina(): void|                                 
`------------------------'     
Este é um diagrama UML que representa a estrutura de classes e interfaces para um sistema que inclui a modelagem do iPhone, um dispositivo que incorpora funcionalidades de um reprodutor de música, um telefone e um navegador de internet. Este diagrama foi criado como parte do desafio de projeto do **Santander Bootcamp 2023 - Fullstack Java+Angular** na DIO.me.

![iphone](https://raw.githubusercontent.com/SilvioCavalcantiBonfim/Diagramacao-de-Classes-do-iPhone/0.1.0/iphone.png)


## Descrição das Interfaces e Classes

### Reprodutor Musical (ReprodutorMusical)

A interface `Reprodutor Musical` é responsável por implementar a funcionalidade de reprodução de arquivos de áudio. Ela possui métodos como `tocar()`, `pausar()`, e `selecionarMusica()`.

### Aparelho Telefônico (AparelhoTelefonico)

A interface `Aparelho Telefônico` é responsável por implementar a funcionalidade de um telefone. Ela possui métodos como `ligar()`, `atender()`.
### Navegador de Internet (NavegadorInternet)

A interface `Navegador de Internet` é responsável por implementar a funcionalidade de um navegador web. Ela possui métodos como `exibirPagina()`, `novaAba()`, e `atualizarPagina()`.

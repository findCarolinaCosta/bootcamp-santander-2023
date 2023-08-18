# Desafio

1. Projeto `ContaBanco` que recebe dados via terminal contendo as características 
de conta em banco conforme atributos abaixo:

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48

2. Dentro do projeto, existe uma classe chamada `ContaTerminal.java` para realizar toda a codificação do programa.

4. Permite que os dados sejam inseridos via terminal sendo que o usuário recebe a mensagem de
qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois aperta ENTER para o próximo campo)*

5. Depois de todas as informações serem inseridas, o sistema exibe a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] 
e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] são preenchido pelas informações que forem inseridas pelos usuário.

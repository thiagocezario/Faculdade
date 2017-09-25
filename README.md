# Debug passo-a-passo no Dev-C++

Para ativar o modo debug no Dev-C++ basta ir em Tools (ferramentas) -> Compiler Options (Opções de compilador)
Na aba General (geral) marcar a opção "Add the following commands when calling the compiler" 
("Adicionar os seguintes comandos quando chamar o compilador") e colocar na caixa de texto o comando -O0,
após isso vai na aba Settings (Configurações) e em seguida na aba Linker e coloca a opção
"Generate debug information (-gs3)" ("Gerar dados de depuração (-gs3)") como Yes.

Para usar o debug é só rodar o código com o F5, detalhe que o código atual PRECISA ter sido compilado com sucesso
(sem erro, warning ainda da) antes do debug se não não vai funcionar.
Para executar passo a passo basta adicionar um Breakpoint onde deseja que o código 'pare' (só clicar no número da linha
do lado esquerdo, a linha vai ficar vermelha e vai ficar uma marcação em cima do número), quando executar o código com o F5
ele vai parar naquele ponto e só vai continuar quando for passado o comando (pode colocar vários breakpoints).
A linha em que o código estiver parado esperando pra executar vai estar em azul, e para ir pro próximo passo basta dar um F7
ou, caso queira, basta clicar em Continue no menu da parte de baixo, assim o código vai continuar normalmente até encerrar ou
chegar em outro Breakpoint.

Se passar o mouse em cima de uma variavel da pra saber o valor dela naquele momento do código.

Caso tenha outras funções no código além da main e quiser checar a execução delas TEM que colocar breakpoint nela,
adicionar no momento que uma outra função chama ela o depurador não vai fazer o passo a passo dela, ele simplesmente vai executar como
se fosse em tempo real.

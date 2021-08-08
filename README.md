## Jogo de simulação de batalha
O jogo simula uma guerra entre duas espécies de personagens: Orcs e Humanos.
##
## Personagens
Os personagens da espécie Orc possuem 3 atributos: força, habilidade e agilidade. Está é a lista dos personagens com seus atributos de força, habilidade e agilidade respectivamente:
<ul>
  <li>Ogro - 60, 60, 20</li>
  <li>Mago - 20, 80, 40</li>
  <li>Demônio - 80, 20, 60</li>
</ul>
<br>
Os personagens da espécie Humano possuem 3 atributos: inteligência, velocidade e equipamentos. Está é a lista dos personagens com seus atributos de inteligência, velocidade e equipamentos respectivamente:
<ul>
  <li>Arqueiro - 60, 60, 20</li>
  <li>Soldado - 20, 80, 40</li>
  <li>Robo - 80, 20, 60</li>
</ul>
<br>

## Mecânica

No início do jogo é criado um exército para cada espécie (humanos e orcs), com 100 personagens em cada.
A classe do personagem é escolhida de forma aleatória de acordo com as classes disponíveis na sua espécie.
<br>
Com os exércitos formados são feitas batalhas 1v1, o primeiro personagem humano criado luta contra o primeiro personagem orc criado, e assim sucessivamente. 
As batalhas funcionam da seguinte forma: Dentre os 3 atributos de cada personagem é escolhido um atributo de forma aleatória, por exemplo, se o atributo escolhido for o 1 o atributo que o orc irá utilizar será força, enquanto o atributo do humano será inteligência. Com o atributo escolhido é feita a batalha e a vitória é do personagem com o maior atributo, podendo haver empate. O personagem que perde a batalha tem sua sua vida diminuída, sua nova vida será a quantidade de vida total menos a diferença entre os atributos, já o personagem ganhador tem sua vida aumentada, sua nova vida será a quantidade de vida total mais a diferença entre os atributos, já quando ocorre um empate nenhum dos personagens perde ou ganha vida.
<br>Ao final das 100 batalhas 1v1 é feita a contagem de vitórias, derrotas e empates de cada espécie. A espécie com mais vitórias ganha a guerra. Se houver a mesma quantidade de vitórias para as duas espécies o desempate é feito com base na vida total de todos personagens do exército, e o exército com mais vida é o vencedor da guerra. 

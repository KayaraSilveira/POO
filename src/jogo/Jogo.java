package jogo;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {

    public static void main(String[] args) {
        
        int vida_humanos = 0;
        int vida_orcs = 0;
        int empates = 0;
        int vitorias_orcs = 0;
        int vitorias_humanos = 0;
        ArrayList <Orc> Orcs = new ArrayList(); //criando array de Orcs
        ArrayList <Humano> Humanos = new ArrayList(); //criando array de Humanos
        
        Random rand = new Random();
        
        for(int i = 0; i < 100; i++) {
            int orc_aleatorio = rand.nextInt(3);
            switch (orc_aleatorio) { //usando random para adicionar aleatoriamente orcs no vetor
                case 0: 
                    Orcs.add(new Ogro());
                case 1:
                    Orcs.add(new Mago());
                case 2:
                    Orcs.add(new Demonio());
            }
        }
        
        for(int j = 0; j < 100; j++) {
            int humano_aleatorio = rand.nextInt(3);
            switch (humano_aleatorio) { //usando random para adicionar aleatoriamente humanos no vetor
                case 0: 
                    Humanos.add(new Arqueiro());
                case 1:
                    Humanos.add(new Soldado());
                case 2:
                    Humanos.add(new Robo());
            }
        }
           
        for(int k = 0; k < 100; k++) { //abrindo o for onde vai ocorrer toda luta
            
            int temp = 0;
            int atributo_orc = 0;
            int atributo_humano = 0;
            int atributo_aleatorioO = rand.nextInt(3);
            int atributo_aleatorioH = rand.nextInt(3);
            
            switch (atributo_aleatorioO) { //escolhendo o atributo do orc atraves do random
                case 0:
                    atributo_orc = Orcs.get(k).getForça();
                case 1:
                    atributo_orc = Orcs.get(k).getHabilidade();
                case 2:
                    atributo_orc = Orcs.get(k).getAgilidade();
            }
            switch (atributo_aleatorioH) { //escolhendo o atributo do humano atraves do random
                case 0:
                    atributo_humano = Humanos.get(k).getInteligencia();
                case 1:
                    atributo_humano = Humanos.get(k).getVelocidade();
                case 2:
                    atributo_humano = Humanos.get(k).getEquipamentos();
            }
           temp = atributo_orc - atributo_humano; //subtraindo o atributo do humano do atributo do orc e guardando em uma variavel temporaria
           
           if (temp == 0) { //se a variavel temp der 0 significa que deu empate
               empates++; //acrescenta 1 ao numero de empates
               System.out.println("Luta:" + k); //imprime o numero da luta
               System.out.println("Empate"); //informa o resultado
              
           }
           
           else {
                if (temp < 0) { //se a variavel temp for negativa significa que o humano ganhou
                    Orcs.get(k).setVida(100 - Math.abs(temp)); //seta a vida do orc para a vida inicial menos a diferença entre os atributos do orc e do humano
                    Humanos.get(k).setVida(100 + Math.abs(temp));  //seta a vida do humano para a vida inicial mais a diferença entre os atributos do orc e do humano
                    vitorias_humanos++; //acrescenta 1 ao numero total de vitorias dos humanos
                    System.out.println("Luta:" + k); //imprime o numero da luta
                    System.out.println("Vitoria dos humanos"); //informa o resultado
            }
                
                else { //se a variavel temp for positiva significa que o orc ganhou
                    Orcs.get(k).setVida(100 + Math.abs(temp)); //seta a vida do orc para a vida inicial mais a diferença entre os atributos do orc e do humano
                    Humanos.get(k).setVida(100 - Math.abs(temp)); //seta a vida do humano para a vida inicial menos a diferença entre os atributos do orc e do humano
                    vitorias_orcs++; //acrescenta 1 ao numero total de vitorias dos orcs
                    System.out.println("Luta:" + k); //imprime o numero da luta
                    System.out.println("Vitoria dos orcs"); //informa o resultado
           }
           }
           System.out.println(Orcs.get(k).toString()); //usa o toString para imprimir a vida restante e a classe do orc
           System.out.println(Humanos.get(k).toString()); //usa o toString para imprimir a vida restante e a classe do humano
           System.out.println("------------------------------------");
           vida_orcs = vida_orcs + Orcs.get(k).getVida(); //guarda a vida restante do orc 
           vida_humanos = vida_humanos + Humanos.get(k).getVida(); //guarda a vida restante do humano
           
        }
           System.out.println("--------- Resultado final --------- ");
           System.out.println("Vitorias dos orcs:" + vitorias_orcs); //informa o numero total de vitorias dos orcs
           System.out.println("Vitorias dos humanos:" + vitorias_humanos);  //informa o numero total de vitorias dos humanos
           System.out.println("Empates:" + empates); //informa o numero total de empates
           System.out.println("Vida total dos orcs:" + vida_orcs); //informa a vida total restante dos orcs
           System.out.println("Vida total dos humanos:" + vida_humanos); //informa a vida total restante dos humanos
           
           if (vitorias_orcs == vitorias_humanos) { //se os humanos e orcs tiverem a mesma quantidade de vitorias é feito um desempate atraves da vida total restante
               if (vida_orcs == vida_humanos) {
                   System.out.println("EMPATE"); // se a vida total for a mesma é considerado empate
               }
               else {
                   if (vida_orcs > vida_humanos) {
                       System.out.println("VITORIA DOS ORCS"); //se os orcs tiverem mais vida é uma vitoria dos orcs
                   }
                   else {
                      System.out.println("VITORIA DOS HUMANOS"); //se os humanos tiverem mais vida é uma vitoria dos humanos
                   }
               } 
           }
           else { //caso não haja empate a vitoria é atraves do maior numero de vitorias individuais
               if (vitorias_orcs > vitorias_humanos) {
                 System.out.println("VITORIA DOS ORCS");  //se os orcs tiverem mais vitorias eles ganham
               }
               else {
                  System.out.println("VITORIA DOS HUMANOS");  //se os humanos tiverem mais vitorias eles ganham
               }
           }  
        }
    }
 




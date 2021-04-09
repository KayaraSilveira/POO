package jogo;

public abstract class Personagem {
    
    protected int vida = 100;
    protected String classe;
    //criando dois atributos vida e o nome da classe
    
    public String getClasse () {
        return classe; //criando get para pegar o nome da classe
    }
    
    public int getVida() {
        return vida; //criando get para pegar a vida
    }

    public void setVida(int vida) {
        this.vida = vida; //criando set para alterar a vida
    }
    
    public String toString() { 
        return "Personagem: " + this.classe + " |  Vida: " + this.vida; //metodo toString que retorna a vida do perosnagem e o nome da classe
    }
}

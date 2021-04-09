package jogo;

public abstract class Humano extends Personagem {
    
    private int inteligencia;
    private int velocidade;
    private int equipamentos;
    //criando os atributos dos Humanos
    public Humano(String classe, int inteligencia, int velocidade, int equipamentos) {
        this.classe = classe;
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
        this.equipamentos = equipamentos;
    }
    //metodo construtor com os atributos e o nome da classe
    
    public int getInteligencia() {
        return inteligencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getEquipamentos() {
        return equipamentos;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setEquipamentos(int equipamentos) {
        this.equipamentos = equipamentos;
    }
    //criando todos os get e set exceto o da classe
    
}

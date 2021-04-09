package jogo;

public abstract class Orc extends Personagem {
    
    private int força;
    private int habilidade;
    private int agilidade;
    //criando os atributos dos Orcs
    public Orc(String classe, int força, int habilidade, int agilidade) {
        this.classe = classe;
        this.força = força;
        this.habilidade = habilidade;
        this.agilidade = agilidade;
    }
    //metodo construtor com os atributos e o nome da classe
    
    public int getForça() {
        return força;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    //criando todos os get e set exceto o da classe
    
}

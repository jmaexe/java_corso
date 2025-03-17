package models;

public class File implements Componente {
    private String nome;
    private long dimensione;

    public File(String nome, long dimensione) {
        this.nome = nome;
        this.dimensione = dimensione;
    }

    public long getDimensione() {
        return dimensione;
    }

    public String getNome() {
        return nome;
    }

    public void setDimensione(byte dimensione) {
        this.dimensione = dimensione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nFile " + this.nome + ", dimensione : " + this.dimensione;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}

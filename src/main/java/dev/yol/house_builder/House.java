package dev.yol.house_builder;

public class House {
   
    private boolean garage;
    private boolean jardin;
    private boolean piscina;
    private boolean estatuas;


    public boolean hasGarage() {
        return garage;
    }
    public void setGarage(boolean garage) {
        this.garage = garage;
    }
    public boolean hasJardin() {
        return jardin;
    }
    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }
    public boolean hasPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    public boolean hasEstatuas() {
        return estatuas;
    }
    public void setEstatuas(boolean estatuas) {
        this.estatuas = estatuas;
    }

    @Override
    public String toString() {
        return "House{" +
                "garage=" + garage +
                ", jardin=" + jardin +
                ", piscina=" + piscina +
                ", estatuas=" + estatuas +
                '}';
    }
    
}

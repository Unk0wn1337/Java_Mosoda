package hu.szamalk.model;

public class Ruha {
    private String tulaj;
    private boolean tiszta;

    public Ruha(String tulaj) {
        this.tulaj = tulaj;
        this.tiszta = false;
    }

    public String getTulaj() {
        return tulaj;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }
}

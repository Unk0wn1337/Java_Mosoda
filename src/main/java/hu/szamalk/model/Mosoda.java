package hu.szamalk.model;

public class Mosoda {
    private Ruha[] ruhak;


    public Mosoda() {
        this.ruhak = new Ruha[5];
    }

    public Mosoda(int db) {
        this.ruhak = new Ruha[db];
    }


    public void bevesz(Ruha ruha) {
        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] == null) {
                ruhak[i] = ruha;
                System.out.println("Ruha sikeresen felvéve: " + ruha.getTulaj());
                return;
            }
        }
        System.out.println("A mosoda megtelt!");
    }

    public Ruha kiad(String tulaj) {
        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] != null && ruhak[i].getTulaj().equals(tulaj)) {
                Ruha kiadottRuha = ruhak[i];
                ruhak[i] = null;
                System.out.println("Ruha kiadva a tulajdonosnak: " + tulaj);
                return kiadottRuha;
            }
        }
        System.out.println("Nincs ilyen tulajdonú ruha a mosodában!");
        return null;
    }

        public void mos() {
        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] != null && !ruhak[i].isTiszta()) {
                ruhak[i].setTiszta(true);
                System.out.println("Ruha tisztítva: " + ruhak[i].getTulaj());
            }
        }
    }

    public void listaz() {
        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] != null) {
                System.out.println("Ruha: " + ruhak[i]);
            }
        }
    }
}

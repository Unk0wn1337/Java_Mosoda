package hu.szamalk;

import hu.szamalk.model.Mosoda;
import hu.szamalk.model.Ruha;

public class Main {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda(5);


        Ruha ruha1 = new Ruha("Péter");
        Ruha ruha2 = new Ruha("Anna");
        Ruha ruha3 = new Ruha("János");

        mosoda.bevesz(ruha1);
        mosoda.bevesz(ruha2);
        mosoda.bevesz(ruha3);


        mosoda.mos();


        Ruha kiadottRuha = mosoda.kiad("Anna");
        if (kiadottRuha != null) {
            System.out.println("Kiadott ruha: " + kiadottRuha);
        }

        // Próbálkozás megtelt mosodával
        Ruha ruha4 = new Ruha("László");
        mosoda.bevesz(ruha4);  // Ez a ruha már nem kerül be, ha megtelt
    }
}

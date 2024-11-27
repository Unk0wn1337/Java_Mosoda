package hu.szamalk.model;

public class Mosoda  {
   private Ruha[] ruhak;

    public Mosoda() {
        this.ruhak = new Ruha[5];
    }

    public Mosoda(int db) {
        this.ruhak = new Ruha[db];
    }

    public void bevesz(Ruha ruha){
        int i = 0;
        while(i < ruhak.length){
            ruhak[i] = ruha;
            i++;
        }
    }


    public Ruha kiad(Ruha r){
        int i = 0;
        while(i < ruhak.length & ruhak[i] == r){
            i++;
        }
        ruhak.splice(i);

        return r;
    }

    public void mos(){
        for(int i = 0; i < ruhak.length; i++){
            if(ruhak[i].isTiszta() == false){
                ruhak[i].setTiszta(true);
            }
        }
    }

}




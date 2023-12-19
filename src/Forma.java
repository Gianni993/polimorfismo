public class Forma {
    
    int base;
    int altezza;


    Forma(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    

    }

    void calcolaArea(int base, int altezza) {

        System.out.println((base*altezza)/2);
    }

}

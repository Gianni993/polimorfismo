public class Triangolo extends Forma{

    Triangolo(int base, int altezza){
        super(base,altezza);
    }    
    
    @Override
    void calcolaArea(int base,int altezza){

        System.out.println("L'area del triangolo è : "+ (base*altezza)/2);}

}
 
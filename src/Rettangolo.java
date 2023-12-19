public class Rettangolo extends Forma{

    Rettangolo(int base, int altezza){
        super(base,altezza);
    }    
    
    @Override
    void calcolaArea(int base,int altezza){

        System.out.println("L'area del rettangolo è : " + (base*altezza));}

}
 
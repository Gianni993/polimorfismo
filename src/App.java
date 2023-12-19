public class App {
    public static void main(String[] args) throws Exception {
        Rettangolo rettangolo1= new Rettangolo(10,15);
        Triangolo triangolo1 = new Triangolo(10, 15);

        Forma[] geometrica ={rettangolo1,triangolo1};

        for(Forma forma : geometrica){

            forma.calcolaArea(10, 15);
        }
    }
}

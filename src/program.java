public class program
{
    public static void main(String[] args) { //es ta es la forma extensa

        int x = 5;
        int r = 0;
        r = x*x;

        r = (x-1)*(x-1);
        r = (x-2)*(x-2);
        r = (x-3)*(x-3);
        r = (x-4)*(x-5);

        sumapotencias eje= new sumapotencias();

        System.out.println("Fin:" + eje.Exponente(9));
        System.out.println("Forma recursiva" + eje.Recursivo(9870)+" " );

        System.out.println(r);
    }
}

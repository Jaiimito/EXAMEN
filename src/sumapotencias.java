
public class sumapotencias{
    public int Exponente(int a){ // esta es con un ciclo
        int x=0, f=0;
        do{
            x=(a - f)*(a-f);
            System.out.println(x);
            f++;
        }while(x!=1);
        return x;
    }
    public int Recursivo(int a){ //la forma recursiva
        int c=0;
        if (a!=1){
            return 1;}
            else{
            return (c++)+ Recursivo(a-1)*(a-1);
        }
    }
}
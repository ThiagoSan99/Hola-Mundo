
package globant;
import java.util.*;

public class Globant {
static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
       
        int[] v1=new int[100]; 
        v1=reVec();
        orVecDes(v1);
        mosVec(v1);
    }
    static void conversion(double euro, String cambio){
        double divisa = 0;
        if(cambio.equals("DOLARES")){
            divisa =(euro*1.28611);
            System.out.println(" los "+euro+" en doolares equivalen a :"+divisa );
        }else{
            if(cambio.equals("YENES")){
                divisa=(euro*129.852);
                System.out.println(" los "+euro+" en yenes equivalen a :"+divisa );
            }else{
                if(cambio.equals("LIBRAS")){
                    divisa=(euro*0.86);
                    System.out.println(" los "+euro+" en libras equivalen a :"+divisa );
                }else{
                    System.out.println(" Se digito una divisia diferente");
                }
            }
        }
    }
    static int[] reVec(){
        int[] v = new int[100];
        for (int i=0;i<v.length;i++){
            v[i]=i;
        }
        return v;
    }
    static int[] orVecDes(int v[]){
        int aux=0;
        for(int i=0;i<v.length;i++){
            for(int j=i+1;j<v.length;j++){
                if(v[i]<v[j]){
                    aux=v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
            }
        }
        return v;
    }
    static void mosVec(int v[]){
        for(int i=0;i<v.length;i++){
            System.out.print("|"+v[i]+"|");
        }
    }
}

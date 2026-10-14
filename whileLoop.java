import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        //print no.s 1 to 100
        int i=0;
        while(i<=100){
            System.out.println(i);
            i++;
        }

        //print no.s 1 to n

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j=1;
        while(j<=n){
            System.out.println(j);
            j++;
        }

        //do while loop 
        int k=0;
        do{
            System.out.println(k);
            k++;
        }while(k<=5);
    }
    
}

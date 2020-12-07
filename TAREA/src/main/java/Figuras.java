import java.util.Scanner;

public class Figuras{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("dimension:\t");
        int a= input.nextInt();
        for (int y=0;y<=a;y++){
            for(int x=1;x<=y;x++){
                System.out.print(""+x);
            }
            System.out.println("");
        }
        System.out.print("dimension del arbol:\t");
        int b= input.nextInt();
    }
}

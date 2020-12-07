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
        for (int y=0;y<=b;y++){
            for(int x=1;x<=b-y;x++){
                System.out.print(" ");
            }
            for(int w=1;w<=y;w++){
                System.out.print("*");
            }
            for (int z=0;z<=y;z++){
                    System.out.print("*");
            }
            System.out.println("");
        }
        for (int th = 0; th<=(b/3);th++){
            for(int va=0; va<=(b/2); va++ ){
                System.out.print(" ");

            }
            for(int tb=0; tb<=(b/2); tb++ ){
                System.out.print("*");
            }
            for(int tbb=0; tbb<=(b/3); tbb++ ){
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}

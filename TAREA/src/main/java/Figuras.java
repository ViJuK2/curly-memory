import java.util.Scanner;

public class Figuras{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("dimension:\t");
        //triangulo en deceso
        int a= input.nextInt();
        for (int y=0;y<=a;y++){ //se encarga de bajar de linea y dar la altura
            for(int x=1;x<=y;x++){ //se encarga de de escribir y dar el ancho
                System.out.print(""+x);
            }
            System.out.println("");
        }
        //pino
        System.out.print("dimension del arbol:\t");
        int b= input.nextInt();

        for (int y=0;y<=b;y++){//altura del triangulo del pino


            for(int x=1;x<=b-y;x++){//rellenar el vacio
                System.out.print(" ");
            }
            for(int w=1;w<=y;w++){//triangulo del lado izquierdo
                System.out.print("*");
            }
            for (int z=0;z<=y;z++){//triangulo del lado derecho
                    System.out.print("*");
            }
            System.out.println("");
        }
        for (int th = 0; th<=(b/3);th++){//altura del tronco
            for(int va=0; va<=(b/2); va++ ){//vacio del lado izquierdo
                System.out.print(" ");

            }
            for(int tb=0; tb<=(b/2); tb++ ){//tronco del lado izquierdo
                System.out.print("*");
            }
            for(int tbb=0; tbb<=(b/3); tbb++ ){//tonco del lado derecho
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int v = 0; v<=0;v++){//relleno de la parte superior del corazon
            for(int pu=0; pu<=12; pu++ ){//relleno de la parte superior del corazon
                System.out.print(" .");

            }
            System.out.println("");
        }
        for (int ve = 0; ve<=0;ve++){
            for(int x=0;x<=1-ve;x++){//rellenar el vacio
                System.out.print(" .");
            }
            for(int r=0;r<=ve;r++){//triangulo del lado izquierdo
                System.out.print(" *");
            }
            for(int re=1; re<=1; re++ ){//cuadrado
                System.out.print(" *");
            }
            for (int z=0;z<=ve;z++){//triangulo del lado derecho
                System.out.print(" *");
            }
            for(int w=0;w<=2;w++) {//triangulo del lado izquierdo
                System.out.print(" .");
            }
            for(int w=0;w<=ve;w++){//triangulo del lado izquierdo 2
                System.out.print(" *");
            }
            for(int re=1; re<=1; re++ ){//cuadrado
                System.out.print(" *");
            }
            for (int z=0;z<=ve;z++){//triangulo del lado derecho
                System.out.print(" *");
            }
            for(int w=0;w<=1;w++) {//triangulo del lado izquierdo
                System.out.print(" .");
            }

            System.out.println("");
        }
        for (int ve = 0; ve<=0;ve++){
            for(int x=0;x<=-ve;x++){//rellenar el vacio
            System.out.print(" .");
             }
            for(int r=0;r<=ve;r++){//triangulo del lado izquierdo
            System.out.print(" *");
             }
            for(int re=1; re<=3; re++ ){//cuadrado
            System.out.print(" *");
            }
            for (int z=0;z<=ve;z++){//triangulo del lado derecho
            System.out.print(" *");
            }
            for(int w=0;w<=-ve;w++) {//triangulo del lado izquierdo
            System.out.print(" .");
            }
            for(int w=0;w<=ve;w++){//triangulo del lado izquierdo 2
            System.out.print(" *");
             }
            for(int re=1; re<=3; re++ ){//cuadrado
            System.out.print(" *");
            }
            for (int z=0;z<=ve;z++){//triangulo del lado derecho
            System.out.print(" *");
            }
            for(int w=0;w<=-ve;w++) {//triangulo del lado izquierdo
            System.out.print(" .");
            }
        System.out.println("");
        }
        for (int v = 0; v<=2;v++){//relleno de la parte superior del corazon
            for(int pu=0; pu<=12; pu++ ){//relleno de la parte superior del corazon
                System.out.print(" *");

            }
            System.out.println("");
        }
        for (int y=0;y<=5;y++){//altura del triangulo del pino
            for(int x=0;x<=y;x++){//rellenar el vacio
                System.out.print(" .");
            }
            for(int w=0;w<=5-y;w++){//triangulo del lado izquierdo
                System.out.print(" *");
            }
            for(int w=0;w<=4-y;w++){//triangulo del lado izquierdo
                System.out.print(" *");
            }
            for(int x=0;x<=y-0;x++){//rellenar el vacio
                System.out.print(" .");
            }

            System.out.println("");
        }
    }
}

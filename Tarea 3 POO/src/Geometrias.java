import java.util.Arrays;

public class Geometrias {

    public static void main(String args[]) {

    Rectangulo[] rects = new Rectangulo[4];


    rects[0] = new Rectangulo(2.5, 3.0);
    rects[1] = new Rectangulo(1.7, 2.2);
    rects[2] = new Rectangulo(2.8, 3.1);
    rects[3] = new Rectangulo(3.5, 1.2);

    Arrays.sort(rects);

    int i;
    for(i=0; i<4;i++){
        System.out.println(rects[i].calcularArea());

    }

    Triangulo[] rect = new Triangulo[4];


    rect[0] = new Triangulo(2.5, 3.0);
    rect[1] = new Triangulo(1.7, 2.2);
    rect[2] = new Triangulo(2.8, 3.1);
    rect[3] = new Triangulo(3.5, 1.2);

    Arrays.sort(rects);

    int n;
    for(n=0; n<4;n++){
        System.out.println(rect[n].calcularArea());

    }


    System.out.println(rects[0].compareTo(rects[1]));

        
    }


                                     
 }



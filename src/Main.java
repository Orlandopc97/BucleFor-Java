public class Main {
    public static void main(String[] args) {

        int i;
        int j;
        int k;
        //for(inicializacion; condicion; actualizacion)
        /*

        for (i = 0; i<=10; i++ ){
            System.out.print(i);

        }
        //System.out.println("el valor en que termino i es:" + i);
        System.out.println("  ");
        */

        //primera ronda i 1, j 1 y k da los 3 k 1,2,3
        //segunda ronda i 1, j 2 y k da los 3 k 1,2,3
        for (i = 1; i<=3 ; i++ ){
            for (j = 1; j<=3; j++){
                for (k = 1; k<=3; k++) {
                    System.out.print(" i: ");
                    System.out.print(i);
                    System.out.print(" j: ");
                    System.out.print(j);
                    System.out.print(" k: ");
                    System.out.println(k);

                    /*
                     i: 1 j: 1 k: 1
 i: 1 j: 1 k: 2
 i: 1 j: 1 k: 3
 i: 1 j: 2 k: 1
 i: 1 j: 2 k: 2
 i: 1 j: 2 k: 3
 i: 1 j: 3 k: 1
 i: 1 j: 3 k: 2
 i: 1 j: 3 k: 3
 i: 2 j: 1 k: 1
 i: 2 j: 1 k: 2
 i: 2 j: 1 k: 3
 i: 2 j: 2 k: 1
 i: 2 j: 2 k: 2
 i: 2 j: 2 k: 3
 i: 2 j: 3 k: 1
 i: 2 j: 3 k: 2
 i: 2 j: 3 k: 3
 i: 3 j: 1 k: 1
 i: 3 j: 1 k: 2
 i: 3 j: 1 k: 3
 i: 3 j: 2 k: 1
 i: 3 j: 2 k: 2
 i: 3 j: 2 k: 3
 i: 3 j: 3 k: 1
 i: 3 j: 3 k: 2
 i: 3 j: 3 k: 3

                     */

                }
            }
        }
        System.out.println(i);
        //System.out.println(j);
    }
}
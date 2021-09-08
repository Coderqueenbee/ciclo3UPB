package javaScriptSD_W4.forMejorado;


public class ForMejorado {
    public static void main(String[] args) {

        /*
         * ciclo forech en java Comienza con la palabra clave for al igual que un bucle
         * for normal. En lugar de declarar e inicializar una variable contador del
         * bucle, declara una variable que es del mismo tipo que del array, seguido de
         * dos puntos y seguido del nombre del array. En el cuerpo del bucle, puede usar
         * la variable del bucle que creó en lugar de usar un elemento indexado del
         * array. Se usa comúnmente para iterar sobre un array o una clase de
         * colecciones (por ejemplo, ArrayList)
         */

        int nums[] = { 15, 12, 53, 14, 5 };
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("suma uno: " + sum);

        // con ciclo for mejorado
        int nums2[] = { 15, 12, 53, 14, 5 };
        int sum2 = 0;

        int cont = 0;
        for (int x : nums2) {
            cont++;
            sum2 += x;
            System.out.println("El valor de la posicion: " + cont + " es: " + x);
        }
        System.out.println("suma dos: " + sum2);
    }
}

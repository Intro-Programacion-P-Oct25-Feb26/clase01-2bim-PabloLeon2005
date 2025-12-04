/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author PC
 */
public class ejercicio01 {

    public static void main(String[] args) {

        String mensajeFinal;
        String mensaje2;
        
        mensajeFinal = "";
        int numero1;
        int numero2;
        int numero3;
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;

        for (int i = 30; i > 9; i--) {
            numero1 = i * 2;
            numero2 = i * 3;
            numero3 = i * 4;

            mensajeFinal = String.format("%s%s-%s-%s-%s\n",
                    mensajeFinal,
                    i,
                    numero1,
                    numero2,
                    numero3);

            var0= var0+ i;
            var1 += numero1;
            var2 += numero2;
            var3 += numero3;

        }

        mensaje2 = String.format("Totales = %s-%s-%s-%s", 
                var0,
                var1,
                var2,
                var3);
        mensajeFinal = String.format("%s%s\n",
                mensajeFinal,
                mensaje2);
        
        System.out.printf("%s\n", mensajeFinal);

    }

}

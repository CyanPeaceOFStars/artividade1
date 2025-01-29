public class atv_9 {
    public static void main(String[] args) {
        double numero = 10;
        double raizQuadrada = Math.sqrt(numero);
        double raizQuadradaArredondada = Math.round(raizQuadrada * 10.0) / 10.0;

        System.out.println("A raiz quadrada de " + numero + " arredondada para uma casa decimal é: " + raizQuadradaArredondada);
    }
}

public class atv_14 {
    public static void main(String[] args) {
        double numero = 50;
        double raizQuadrada = Math.sqrt(numero);
        double raizQuadradaArredondada = Math.round(raizQuadrada * 100.0) / 100.0;

        System.out.println("A raiz quadrada de " + numero + " arredondada para duas casas decimais é: " + raizQuadradaArredondada);
    }
}

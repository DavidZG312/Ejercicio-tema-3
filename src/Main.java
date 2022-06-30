public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.aumentaPuerta();

        int resultado;
        resultado = Suma(10,10,10);
        System.out.println("Resultado de la suma: " + resultado);
    }

    public static int Suma (int valor1, int valor2, int valor3){
        return valor1 + valor2 + valor3;
    }
}

class Coche {
    public int puertas = 0;

    public void aumentaPuerta () {
        this.puertas ++;
        System.out.println("Mis puertas: " + puertas);
    }
}
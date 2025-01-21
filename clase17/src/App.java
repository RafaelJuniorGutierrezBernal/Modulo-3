public class App {
    public static void main(String[] args) {
        var array = new int[5];
        var num = 5;
        try {
            array[num] = 10;
            System.out.println(array[num]);

            var denominador = 0;
            array[num] /= denominador;
            System.out.println(array[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrio un error en el indice");
        }catch (ArithmeticException e) {
            System.out.println("Ocurrio un error aritmetico");
        }
        System.out.println("Siga trabajando y no pare");
    }
}


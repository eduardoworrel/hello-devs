
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i = i + 5) {
            System.out.println(i);
            //aqui escolhemos usar a variavel i pois é um padrao na programacao
            for (int j = 50; j >0 ; j--) {
                System.out.println("["+i+ "]"+(j*i));

            }
        }
    }

}
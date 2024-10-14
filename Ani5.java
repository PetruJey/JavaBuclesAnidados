public class Ani5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            String contador = "" + i + j + k + l + m;
                            contador = contador.replace('3', 'E');
                            System.out.println(contador);
                        }
                    }
                }
            }
        }
    }
}

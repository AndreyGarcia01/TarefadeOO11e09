
    public interface Refatoracao09 {
        char[][] desenhar();
    }

    public abstract class LetraBase implements Letra {
        @Override
        public abstract char[][] desenhar();

        protected char[][] criarMatriz(int linhas, int colunas, char preenchimento) {
            char[][] arr = new char[linhas][colunas];
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    arr[i][j] = preenchimento;
                }
            }
            return arr;
        }
    }

    public class LetraA extends LetraBase {
        @Override
        public char[][] desenhar() {
            char[][] arr = criarMatriz(5, 5, 'A');
            arr[1][1] = ' ';
            arr[1][2] = ' ';
            arr[1][3] = ' ';
            arr[3][1] = ' ';
            arr[3][2] = ' ';
            arr[3][3] = ' ';
            arr[4][1] = ' ';
            arr[4][2] = ' ';
            arr[4][3] = ' ';
            return arr;
        }
    }

    public class Escritor {
        private Letra letra;

        public Escritor(Letra letra) {
            this.letra = letra;
        }

        public void escrever() {
            char[][] arr = letra.desenhar();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public class Exemplo {
        public static void main(String[] args) {
            Letra letra = new LetraA();
            Escritor escritor = new Escritor(letra);
            escritor.escrever();
        }
    }



package features.certification.inheritances;

import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("All")
public class Exercises {

    /**
     * 1) Compila?
     * Sim, compila. Aqui não ocorre sobrescrita.
     * Como os parâmetros são diferentes, ocorre uma sobrecarga (não confundir na prova overload com overwrite). Ou seja, é um overload com herança.
     */
    class A1 {
        public void metodo(long l) {
        }
    }

    class B1 extends A1 {
        protected void metodo(int i) {
        }
    }


    /**
     * 2) Esta sobrescrita é válida?
     * Sim, a reescrita é válida, pois FileNotFoundException é subclasse de IOException.
     */
    class Veiculo {
        protected void liga() throws IOException {
        }
    }

    class Carro extends Veiculo {
        public void liga() throws FileNotFoundException {
        }
    }


    /**
     * 3) O código não compila pois há um ciclo na herança.
     */
    class B3 extends C3 {
        int m(int a) {
            return 1;
        }
    }

    class C3 {//extends A3 { comentado para nao quebrar a classe

        int m(double b) {
            return 3;
        }
    }

    class A3 extends B3 {
        int m(String c) {
            return 3;
        }
    }

    /**
     * 4) Compila e não imprime nada.
     */
    class B4 {
        private B4() {
        }

       /* static B4 B4(String s) {
            return new B4();
        }*/
    }

    class A {
      /*  public static void main(String[] args) {
            B4 b4 = B4.B4("t");
        }*/
    }


    /**
     * 5) O código não compila pois não existe construtor de B ao qual A tenha acesso para herdar do mesmo.
     */
    class B5 {
        /*private*/ B5() { // comentado para nao quebrar a classe
        }

       /* static B5 B5(String s) {
            return new B5();
        }*/
    }

    class A5 extends B5 {
      /*  public static void main(String[] args) {
            B5 b = B5.B5("t");
        }*/
    }

    /**
     * 6) Não Compila. O código não compila pois A não tem acesso a variável s na classe B.
     */
    class B6 {
        /*private*/ protected String s; // comentado para nao quebrar a classe

        protected B6() {
        }

       /* static A6 B6(String s) {
            return new A6(s);
        }*/
    }

    class A6 extends B6 {
        A6(String s) {
            this.s = s;
        }

       /* public static void main(String[] args) {
            B6 b6 = A6.B6("t");
            System.out.println(b6.s);
        }*/
    }

    /**
     * 7) Compila e imprime "update"
     */

    class B7 {
        protected String s = "init";

        protected B7() {
        }

        /*static A7 B7(String s) {
            return new A7(s);
        }*/
    }

    class A7 extends B7 {
        A7(String s) {
            this.s = s;
        }

       /* public static void main(String[] args) {
            A7 b7 = A7.B7("update");
            System.out.println(b7.s);
        }*/
    }
}
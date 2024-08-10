package certification.polymorphisms;

import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("All")
public class Exercises {


    /**
     * 1) Compila e imprime "b1"
     */
    class B1 {
        void x1() throws IOException {
            System.out.println("c1");
        }
    }

    class C1 extends B1 {
        void x() throws FileNotFoundException {
            System.out.println("b1");
        }
    }

    class A1 {
        /*public static void main(String[] args) throws IOException {
            new C1().x1();
        }*/
    }


    /**
     * 2) Compila e imprime "C2"
     */
    class B2 {
        void x(double i) throws IOException {
            System.out.println("c2");
        }
    }

    class C2 extends B2 {
        void x(int i) throws FileNotFoundException {
            System.out.println("b2");
        }
    }

    class A2 {
       /* public static void main(String[] args) throws IOException {
            new C2().x(3.2);
        }*/
    }


    /**
     * 3) O código não compila: C3 não possui método que receba double.
     */
    class B3 {
        void x(double i) throws IOException {
            System.out.println("c3");
        }
    }

    class C3 {
        void x(int i) throws FileNotFoundException {
            System.out.println("b3");
        }
    }

    class A3 {
        /*public static void main(String[] args) throws IOException {
            new C3().x(3.2);
        }*/
    }


    /**
     * 4) Compila e imprime "D4"
     */
    class B4 {
        void x(int i) throws IOException {
            System.out.println("c4");
        }
    }

    abstract class C4 extends B4 {
        abstract void x(int i) throws IOException;
    }

    abstract class D4 extends C4 {
        void x(int i) throws IOException {
            System.out.println("d4");
        }
    }

    class E4 extends D4 {
    }

    class A4 {
      /*  public static void main(String[] args) throws IOException {
            new E4().x(32);
        }*/
    }

    /**
     * 5) Compila e entra em looping
     */
    class B5 {
        void x(int i) throws IOException {
            if (++i < 0) return;
            x(-1);
            System.out.println("c5");
        }
    }

    abstract class C5 extends B5 {
        void x(int i) throws IOException {
            System.out.println("b5");
            super.x(i);
        }
    }

    abstract class D5 extends C5 {
        void x(int i) throws IOException {
            super.x(i);
        }
    }

    class E5 extends D5 {
    }

    class A5 {
       /* public static void main(String[] args) throws IOException {
            new E5().x(32);
        }*/
    }

    /**
     * 6) Compila e imprime b6, b6, c6
     */
    class B6 {
        void x(int i) throws IOException {
            if (i < 0) return;
            this.x(-1);
            System.out.println("c");
        }
    }

    abstract class C6 extends B6 {
        void x(int i) throws IOException {
            System.out.println("b");
            super.x(i);
        }
    }

    abstract class D6 extends C6 {
        void x(int i) throws IOException {
            super.x(i);
        }
    }

    class E6 extends D6 {
    }

    class A6 {
        /*public static void main(String[] args) throws IOException  {
            new E6().x(32);
        }*/
    }
}

package features.certification.polymorphisms;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("All")
public class ExecutePolymorphism {

    /**
     * ABSTRACT
     */
    class A1 {
        void a1() {
        }
    }

    abstract class B1 extends A1 {
        abstract void a1(); // sobrescrevendo como abstrato
    }

    //class C1 extends B1 {
    // não compila, não redefiniu a1
    //}

    class D1 extends B1 {
        void a1() {
            // compila pois redefiniu a1
        }
    }


    /**
     * RETORNO COVARIANTE
     */
    class ListStringA {
        List<String> metodo() {
            return new ArrayList<>();
        }
    }

    class ListB extends ListStringA {
        ArrayList<String> metodo() {
            return new ArrayList<>();
        }
    }


    /**
     * EXCEÇÕES
     */

    class ExceptionA {
        public void metodo() throws SQLException, IOException {
        }
    }

    class ExceptionB extends ExceptionA {
        public void metodo() throws IOException {
        }
    }

    /**
     * THIS, SUPER E SOBREESCRITA
     */
    class A {
        public void metodo() {
            System.out.println("a");
            // metodo2(); // looping
            // this.metodo2(); // looping
        }

        public void metodo2() {
            System.out.println("metodo 2 do pai");
        }
    }

    class B extends A {
        public void metodo() {
            System.out.println("b");
            super.metodo();
        }

        public void metodo2() {
            System.out.println("c");
            metodo();
            super.metodo();
        }

//      public static void main(String[] args) {
//          new B().metodo2();
//      }
    }

    /**
     * CHAMADA DE METODOS
     */
    class Veiculo {
        void liga() {
            System.out.println("ligando o veiculo");
        }
    }

    class Carro extends Veiculo {
        void liga() {
            System.out.println("ligando o carro");
        }

        void desliga() {
            System.out.println("desligando o carro");
        }
    }
}

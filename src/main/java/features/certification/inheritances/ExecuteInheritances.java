package features.certification.inheritances;

@SuppressWarnings("All")
public class ExecuteInheritances {

    /**
     * --------------------------------------------------------
     * EXPLICITO E IMPLICITO
     * --------------------------------------------------------
     */

    class Explicito extends Object {
    }

    class Implicito {
        // extends Object por padrão
    }


    /**
     * --------------------------------------------------------
     * CONTRUTOR DEFAULT
     * --------------------------------------------------------
     */

    class Pai {
        Pai(int x) {
        }
    }


    //class Filho1 extends Pai {
    //    não compila pois o construtor padrão chama super() e o Pai não tem construtor vazio
    // }

    class Filho2 extends Pai {
        Filho2() {
            super(15); //compila
        }
    }

    /**
     * --------------------------------------------------------
     * VISIBILIDADE
     * --------------------------------------------------------
     */
    class X {
        private int x;

        public void setX(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }
    }

    class Y extends X {
        public void metodo() {
            // this.x = 5; // não compila: "x has private access in X"
            this.setX(10); // compila e altero o x herdado mas não visível
        }
    }

    /**
     * --------------------------------------------------------
     * METODOS ESTATICOS
     * --------------------------------------------------------
     */
    static class W {
        public static void metodo() {
            System.out.println("W");
        }
    }

    static class Z extends W {
        public static void metodo() {
            // super.metodo(); não existe super em contexto estático, não compila
            System.out.println("Z");
        }
    }

    public static void execute() {

        W.metodo(); // W
        Z.metodo(); // Z

        W w = new W();
        w.metodo(); // W

        Z z = new Z();
        z.metodo(); // Z

        W w2 = z;
        w2.metodo(); // W
        // este último imprime w, pois o binding é feito em compilação. W2.metodo é uma referencia em compilação para W
    }

}

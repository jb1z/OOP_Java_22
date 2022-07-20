package video;

public class InnerClasses {
    private static int aMain = 5;
    public static int bMain = 10;
    private int bMainNonStatic = 10;
    private static void methodMain1(){
        System.out.println("Main private method");
    };
    private void methodMainNonStatic(){
        System.out.println("Main non-static private method");
    };

    public static void methodMain2(){
        System.out.println("Main public method");
    };
    public void start(){
        InnerClasses outerMain = new InnerClasses();
        InnerClass iClassMain = this.new InnerClass(outerMain); // creating instance of inner class 
        iClassMain.methodInner2();
        InnerClass iClass = new InnerClass(new InnerClasses()); // creating instance of inner class
        // by the *inner* class instance we can access both private and public methods & fields
        int aInnerFromMain = iClass.aInner; // public aInner
        int bInnerFromMain = iClass.bInner; // private bInner
        iClass.methodInner1(); // private methodInner1
        iClass.methodInner2(); // public methodInner2
        int y = InnerClass.bInnerStatic; // we can access static by classname
    }
    public class InnerClass{
        public int aInner = 6;
        private int bInner = 11;
        private static int bInnerStatic = 125;
        public InnerClasses outer;

        InnerClass(InnerClasses iOuter){
            outer = iOuter;
        }

        private void methodInner1(){
            /**
             * @P.S. instance of *outer* isn't needed for static
             */
            // we can access both static private and public methods & fields of outer
            System.out.println("Inner private method");
            int aOuter = aMain;
            int bOuter = bMain;
            /**
             * @P.S. instance of *outer* is needed for static
             */
            // to access non-static fields and methods we need an instance of outer class
            int bOuterNonStatic1 = outer.bMainNonStatic;
            int bOuterNonStatic2 = InnerClasses.this.bMainNonStatic;
            outer.methodMainNonStatic();
            methodMain2();
        };
        public void methodInner2(){
            System.out.println("Inner public method");
            methodMain1();
        };
    }
    public static class StaticInnerClass{
        public int aInner = 6;
        private int bInner = 11;
        private static int bInnerStatic = 125;
        public InnerClasses outer;

        StaticInnerClass(InnerClasses iOuter){
            outer = iOuter;
        }

        private void methodInner1(){
            /**
             * @P.S. instance of *outer* isn't needed for static
             */
            // we can access both static private and public methods & fields of outer
            System.out.println("Inner private method");
            int aOuter = aMain;
            int bOuter = bMain;
            /**
             * @P.S. instance of *outer* is needed for static
             */
            // to access non-static fields and methods we need an instance of outer class
            int bOuterNonStatic1 = outer.bMainNonStatic;
            outer.methodMainNonStatic();
            methodMain2();
        };
        public void methodInner2(){
            System.out.println("Inner public method");
            methodMain1();
        };
    }
}

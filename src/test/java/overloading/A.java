package overloading;

public class A {



        public void sum(int a, int b) {
            System.out.println("نتيجة الرقم الصحيح ====> "+a+" + "+b+" = "+(a+b));
        }

        public void sum(float a, float b) {
            System.out.println("نتيجة الرقم الكسري ===> "+a+" + "+b+" = "+(a+b));
        }

        public void sum(double a, double b) {
            System.out.println("نتيجة الرقم العشري ====> "+a+" + "+b+" = "+(a+b));
        }

    public void sum(int a, int b,int c) {
        System.out.println("نتيجة جمه ثلاث أرقام ====> "+a+" + "+b+" + "+c+"= "+(a+b+c));
    }
    }



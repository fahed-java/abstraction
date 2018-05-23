package overloading_constrctor;

public class A {

        // سيملك هذه الخصائص, أي كل بلد سيملك هذه الخصائص Country كل كائن من الكلاس
        public String name;
        public double msahh;
        public long sokan;

        // الكونستركتور الأول لا يأخذ باراميترات
        public A() {

        }

        // الكونستركتور الثاني يتيح لك تحديد إسم البلد مباشرةً عند إنشاء الكائن
        public A(String n) {
            name = n;
        }

        // الكونستركتور الثالث يتيح لك تحديد إسم البلد و مساحته مباشرةً عند إنشاء الكائن
        public A(String n, double a) {
            name = n;
            msahh = a;
        }

        // الكونستركتور الرابع يتيح لك تحديد إسم البلد و مساحته و عدد السكان مباشرةً عند إنشاء الكائن
        public A(String n, double a, long p) {
            name = n;
            msahh = a;
            sokan = p;
        }

        // هذه الدالة تعرض جميع المعلومات التي تم إدخالها في الكائن
        public void  printInA() {
            System.out.println("name: " + name);
            System.out.println("msahh: " + msahh);
            System.out.println("sokan: " + sokan);
        }

    }


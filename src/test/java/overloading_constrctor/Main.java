package overloading_constrctor;

public class Main {


        public static void main(String[] args) {

            // هنا كل كائن يمثل بلد ,Country هنا قمنا بإنشاء 4 كائنات من الكلاس
            A c1 = new A();                             // c1 هنا سيتم إستدعاء الكونستركور الأول, لن يتم تحديد أي معلومة حول البلد الذي يمثله الكائن
            A c2 = new A("KSA");                        // c2 هنا سيتم إستدعاء الكونستركور الثاني, أي سيتم تحديد إسم البلد الذي يمثله الكائن
            A c3 = new A("Turkey", 780580);             // c3 هنا سيتم إستدعاء الكونستركور الثالث, أي سيتم تحديد إسم و مساحة البلد الذي يمثله الكائن
            A c4 = new A("Lebanon", 10452, 4467000);    // c4 هنا سيتم إستدعاء الكونستركور الربع, أي سيتم تحديد إسم و مساحة و عدد سكان البلد الذي يمثله الكائن

            // لعرض خصائص جميع الكائنات printInfo() هنا قمنا باستدعاء الدالة
            c1.printInA();
            c2.printInA();
            c3.printInA();
            c4.printInA();

        }

    }

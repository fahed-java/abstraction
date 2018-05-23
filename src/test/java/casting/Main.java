package casting;

public class Main {
    public static void main(String[]args){

        Female hala = new Female();       // Female سيملك نسخة من أشياء الكلاس hala الكائن
        Male mhamad = new Male();         // Male سيملك نسخة من أشياء الكلاس hala الكائن


        Person ziad = new Male();         // Male سيملك نسخة من أشياء الكلاس ziad الكائن


        Female rola = new Female();       // Female سيملك نسخة من أشياء الكلاس rola الكائن
        Person p    = rola;               // Female و بالتالي نسخة من أشياء الكلاس rola سيملك نسخة من أشياء الكائن p الكائن
        Female rana = (Female) p;         // Female و الذي يعتبر في الأصل نسخة من p سيملك نسخة من أشياء الكائن rana الكائن


        hala.print();           // Female الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
        mhamad.print();         // Male الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
        ziad.print();           // Male الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
        rola.print();           // Female الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
        p.print();              // Female الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
        rana.print();           // Female الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة

    }
}

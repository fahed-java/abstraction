package super1;

public class B extends A {

    public int x = 20;                                 // مع وضع قيمة مختلفة له A هنا قمنا بتعريف نفس المتغير الموجود في الكلاس

    public void printBoth() {                          // عند استدعاء هذه الدالة سيتم عرض الأشياء التالية
        System.out.println("x in B contain: " + x);             // B الموجودة في الكلاس x هنا سيتم عرض قيمة الـ
        System.out.println("x in B contain: " + this.x);        // B الموجودة في الكلاس x هنا سيتم عرض قيمة الـ
        System.out.println("x in A contain: " + super.x);       // A الموجودة في الكلاس x هنا سيتم عرض قيمة الـ
   // طبعا في حال تشابه اسم المتغير أو الدالة
        //(thisتجلب الرقم في نفس الكلاس)(superتجلب الرقم في الكلاس الأب)
    }
}
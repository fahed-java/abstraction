package constrctorSuper22;

public class B extends A {          // A يرث من الكلاس B هنا قلنا أن الكلاس

    // A هنا يجب تعريف كونستركتور واحد على الأقل يستدعي الكونستركتور الموجود في الكلاس

    // Superclass A هنا قمنا بتعريف كونستركتور يمرر القيمتين 123 و 456 في كونستركتور الـ
    public B() {
        super(123, 456);
    }

    // Superclass A هنا قمنا بتعريف كونستركتور نمرر له قيمتين عند استدعائه, فيقوم بدوره بتمريرهما في كونستركتور الـ
    public B(int p1, int p2) {
        super(p1, p2);
    }


}
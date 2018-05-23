package overloading111;

public class A {
    // هذه الدالة تعطيها رقمين فترجع لك العدد الأكبر بينهما
    public double max(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // هذه الدالة تعطيها ثلاثة أرقام فترجع لك العدد الأكبر بينهم
    // و هي تعتمد على الدالة السابقة لمقارنة أول عددين مع العدد الثالث
    public double max(double a, double b, double c) {
       double f = max(a,b);
        if (f > c)
            return f;
        else
            return c;
    }

    // هذه الدالة تعطيها ثلاثة أرقام فترجع لك العدد الأكبر بينهم
    // و هي تعتمد على الدالتين السابقتين لمقارنة أول ثلاث أعداد مع العدد الرابع
    public double max(double a, double b, double c, double d) {
        double g = max(a,b,c);
        if (g > d)
            return g;
        else
            return d;
    }

}


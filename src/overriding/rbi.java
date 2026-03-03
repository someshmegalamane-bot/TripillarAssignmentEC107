package overriding;

abstract class rbi {
    abstract int roi();
}
class HDFC extends rbi {
    int roi() {
        return 10;
    }
}
class SBI extends rbi{
    int roi() {
        return 6;
    }
}
class Driver {
    public static void main(String[] args) {
        HDFC l = new HDFC();

        System.out.println(l.roi());

        SBI d = new SBI();
        System.out.println(d.roi());
    }
}

package Tutorial_5.Q4;

public final class X1 {
}
class X2 {
    public void foo() {
        System.out.println("foo() called in X2");
    }
}
class X3 extends X2 {
    // overriding foo() of X2
    public void foo() {
        System.out.println("foo() called in X3");
    }
}
package com.Inner;

public class MyOuter {
    public int x = 5;

    public void makeInner() {
        MyInner inner = new MyInner();
        inner.seeOuter();
    }

    class MyInner {
        public void seeOuter() {
            System.out.println(x);
            System.out.println(this);
            System.out.println(MyOuter.this);

        }
    }

    public static void main(String[] args) {
        MyOuter.MyInner inner=new MyOuter().new MyInner();
        inner.seeOuter();

        MyOuter outer=new MyOuter();
        outer.makeInner();
    }
}

package com.sau.aa;

public class TestB {
    public static void main(String[] args) {
        Hi ob1 = new HI();

        Hi ob2 = new HI(56);

        //การใช้งาน Object/Instance คือการใช้งาน Data เเละ Method
        //การใช้งาน DATA คือการกำหนดค่าให้มันใหม่หรือเอาค่ามันมาใช้

        ob1.aa = 99;
        System.out.println(ob1.aa + ob2.aa);

        //การใช้งาน Method  คือการสั่งให้ Method นั้นๆทำงาน
        ob1.showA();
        ob2.showA();
        ob2.show();
    }
}

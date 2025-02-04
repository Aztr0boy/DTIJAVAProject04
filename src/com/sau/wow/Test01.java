package com.sau.wow;

public class Test01 {
    public static void main(String[] args) {
        //สร้าง object / instance of calss
        //วิธีที่ 1 มี 2 ขั้นตอน
        DtiSAU mod;
        mod = new DtiSAU();

        //วิธีที่2 มี 1 ขั้นตอน
        DtiSAU med = new DtiSAU();

        //การใช้งาน object / instance คือการใช้งาน DATA/Method
        //การใช้งาน Data คือ เปลี่ยนให้มันใหม่ หรือเอามันมาใช้
        //การใช้งาน Method คือการใช้ Method ของ Object/Instance นั้นๆทำงาน
        mod.name = " Somchai " ;
        System.out.println(mod.name + " สูง " + mod.high);

        med.name = "สมศรี" ;
        mod.showHi();
    }
}

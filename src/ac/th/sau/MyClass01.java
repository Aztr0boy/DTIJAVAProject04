package ac.th.sau;
// core of OOP
//1. Encapsulation (Information Hiding) กรซ่อนข้อมูล
//2. Inheritance การสืบทอดคลาส
//3. Polymorphism พฤติกรรมการทำงานเดียวกัน ต่างวิธีการ
public class MyClass01 {
    private int dataA;
    private String dataB;

    //ให้ใช้งาน Data ผ่าน Method Getter/setter
    public int getDataA(){
        return dataA;
    }

    public String getDataB(){
        return dataB;
    }

    public void setDataA(){
        this.dataA= dataA;
    }

    public void setDataB(){
        this.dataB = dataB;
    }
}

public class Class {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setAttr(0.5f, "Swiss Militery", "Gold");
        p1.printPen();
    }
}
class Pen {
float tip;
String name;
String colour;
    void setAttr(float PenTip,String PenName,String PenColour){
        tip=PenTip;
        name=PenName;
        colour=PenColour;
    }
    void printPen(){
        System.out.println(name+" "+"Colour "+colour+" Tip Size "+tip);
    }
}

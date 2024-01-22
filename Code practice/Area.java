public class Area {
    int length;
    int breadth;
    public void setDim(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getArea(){
        return length*breadth;
       
    }
    public static void main(String[] args) {
        Area Rectangle=new Area();
        Rectangle.setDim(10,20);
        System.out.println(Rectangle.getArea());
    }
}

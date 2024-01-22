public class Student {
    String name;
    int roll_no;
    int phNo;
    String address;
    public Student(String name) {
        this.name = name;
    }
    public void setInfo(int roll_no,int phNo,String address){
        this.roll_no=roll_no;
        this.phNo=phNo;
        this.address=address;
    }
    public int getRoll(){
        return roll_no;
    }
    public int getPhoneNo(){
        return phNo;
    }
    public String getAdress(){
return address;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Sam");
        Student student2= new Student("Sam");
        student1.setInfo(01,0177,"Dhaka" );
        student2.setInfo(02,01777770, "Gazipur");
        System.out.println("Name : " + student1.name );
        System.out.println("Roll : " + student1.getRoll() );
        System.out.println("Phone Number: "+student1.getPhoneNo() );
        System.out.println("Address : "+student1.getAdress() );
        
        System.out.println("Name : " + student2.name );
        System.out.println("Roll : " + student2.getRoll() );
        System.out.println("Phone Number: "+student2.getPhoneNo() );
        System.out.println("Address : "+student2.getAdress() );
    }
}


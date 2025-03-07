abstract class emp{
    String name;
    int empid;
    emp(String name,int empid){
        this.name = name;
        this.empid = empid;
    }
    abstract void calculatesalary();
    void showdetails(){
        System.out.println("Name: " + name);
        System.out.println("Emp id: "+ empid);
    
    }
}
class fte extends emp{
    fte(String name, int empid) {
            super(name, empid);
            
        }
    
        void calculatesalary(){
            System.out.println("The salary of fte: " + 50000);
        
    }
}

class pte extends emp{
    pte(String name, int empid) {
            super(name, empid);
            
        }
    
        void calculatesalary(){
            System.out.println("The salary of pte per no of hours 500");
        
    }
}
public class task1oops {
    public static void main(String[] args) {
        fte f = new fte("abc", 1);
        f.showdetails();
        f.calculatesalary();
        pte p = new pte("def", 2);
        p.showdetails();
        p.calculatesalary();
    }
}

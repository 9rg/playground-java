package designPattern.iterator;

public class Main {
    public static void main(String[] args) {
        EmpList myEmpList = new EmpList();

        myEmpList.addEmpliyee(new Employee("hoge", 23, "sales"));
        myEmpList.addEmpliyee(new Employee("fuga", 32, "engineer"));
        myEmpList.addEmpliyee(new Employee("piyo", 55, "leader"));

        Iterator it = myEmpList.iterator();
        while (it.hasNext()) {
            Employee emp = (Employee)it.next();
            System.out.println(emp.toString());
        }
    }
}
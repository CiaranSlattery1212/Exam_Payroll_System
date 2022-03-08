
public class Employee {

//    public Object employee(String title, String name, int ppsID, int phone, String EmploymentType, int age){
//
//        return title;
//    }

    public String employeeTitle(String title){
        if(title != "Mrs"){
            return ("Invalid Title");
        }
        return title;
    }

    public String employeeName(String name){
        if(name != "Daisy"){
            return ("Invalid Name");
        }
        return name;
    }

    public Object employeeID(int id){

        if(id != 123456){
            return ("Invalid User ID");
        }

        return id;
    }

    public Object employeePhone(int phoneNum){

        if(phoneNum != 1234567){
            return ("Invalid Phone Number");
        }

        return phoneNum;
    }

    public String employementType(String type){

        if(type == "Full-time"){
            return type;
        }
        else if(type == "Part-time"){
            return type;
        }
        else {
            return ("Invalid Employment Type");
        }

    }

    public Object employeeAge(int age){

        if(age < 18){
            return ("Invalid Age, Age must be over 18");
        }

        return age;
    }

}

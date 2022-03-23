package RU.GB.LESSON5;

public class ClassSotrudnuc {
    private String FullName;
    private String Possition;
    private String Email;
    private int NumberPhone;
    private int Salary;
    private int Age;

    public ClassSotrudnuc(String FullName, String Possition, String Email, int NumberPhone, int Salary, int Age){
        this.FullName = FullName;
        this.Possition = Possition;
        this.Email = Email;
        this.NumberPhone = NumberPhone;
        this.Salary = Salary;
        this.Age = Age;
    }

    //public String getFullName(){
    //return FullName;
    //}

   public void ShowAll(String FullName, String Postion, String Email, int numberPhone, int Salary, int Age){
        System.out.println("FullName: " + FullName + " Position" + Postion);

   }
   public String getFullName(){
        return this.FullName;
    }
    public String getPossition(){
        return this.Possition;
    }
    public String getEmail(){
        return  this.Email;
    }
    public int getNumberPhone(){
        return this.NumberPhone;
    }
    public int getSalary(){
        return this.Salary;
    }
    public int getAge(){
        return this.Age;
    }

    public void ShowAllInfo(){
        System.out.println("FullName: " + getFullName() + " Postion: " + getPossition() + " Email: " + getEmail() + " NumberPhone: " + getNumberPhone() + " Salary: " + getSalary() + " Age: " + getAge());
    }


}

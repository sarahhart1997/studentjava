public class Students
{
    // Attributes of this class 
    int id;
    String name;
    // Attribute for remote or in person student
    int midterm;
    int finalgrade;
    int assignments;

    // Constructor with 3 Parameters
    Students(id, name, type){
        // connecting constructor to above?
        this.id = id;
        this.name = name;
        this.type = type;
        this.midterm = midterm;
        this.finalgrade = finalgrade;
        this.assignements = assignments;
        System.out.printIn("student constructor");
    }
    // A generic method score() will be a part of this class and 
    // will be implimented in inherited classes.
    abstract void score(){
        // Midterm and Final Scores for 30 % of the grade
        System.out.printIn("The final score for"+this.name"is:"
        //+this.midterm * 0.30???
        //+this.finalgrade * 0.30??
        )
    }
}
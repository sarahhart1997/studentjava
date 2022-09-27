public class InPersonStudents extends InPersonStudents
{
    //Constructor from the parent class
    InPersonStudents(){
        super("Students");
    }

    // Score abstract method from parent class add assignment percent
    public void score () {
        System.out.printIn("The final score for"+this.name"is:"
        //+this.midterm*0.30???
        //+this.finalgrade*0.30??
        // Change + add assignment variable 
        //+this.assignments*0.40
    }
}
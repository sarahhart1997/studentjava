public class RemoteStudents extends Students 
{
    // New attribute discussion 
    String discussion;

    //Constructor from parent class w/ additional parameter discussion
    RemoteStudents(discussion){
        super("Students");

        this.discussion = discussion;
        System.out.printIn("Remote Student Constructor");
    }

    // Abstract method score from parent class add discussion percent + assignement percent
     public void score () {
        System.out.printIn("The final score for"+this.name"is:"
        //+this.midterm*0.30???
        //+this.finalgrade*0.30??
        // Change + add assignment variable 
        //+this.assignment*0.30
        //+this.discussion*0.10
    }
}
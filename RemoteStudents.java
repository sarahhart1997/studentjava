public class RemoteStudents extends Students 
{
    // New attribute discussion 
    int discussion;

    //Constructor from parent class w/ additional parameter discussion
    RemoteStudents(discussion){
        super("Students");

        this.discussion = discussion;
        System.out.printIn("Mid-Term"+this.midterm);
        System.out.printIn("Final Exam"+this.finalgrade);
        System.out.printIn("Assignments"+this.assignements);
        System.out.printIn("Discussion"+this.discussion);
    }

    // Abstract method score from parent class add discussion percent + assignement percent
     public void score () {
        System.out.printIn("The final score for"+this.name"is:"

    // The idea here is to multiply each int input by the decimal total to receive the percent weighted grade
    // Just not quite sure how to fully execute this idea

        //+this.midterm*0.30???
        //+this.finalgrade*0.30??
        // Change + add assignment variable 
        //+this.assignments*0.30
        //+this.discussion*0.10
    }
}
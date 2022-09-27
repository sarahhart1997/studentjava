public class RemoteStudents extends Students 
{
    // New attribute discussion 
    String discussion;

    //Constructor from parent class w/ additional parameter discussion
    super(discussion){
        // connecting constructor to above?
        this.discussion = discussion;
        System.out.printIn("student constructor");
    }

    // Abstract method score from parent class
    
}
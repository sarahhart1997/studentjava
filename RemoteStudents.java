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

}
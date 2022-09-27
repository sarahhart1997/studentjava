public static void main (String[] args)
{
    // Creating an object of this class

    // Custom attributes being put into the constructor
    Students a = new Students(3245, "Jane", "Remote");
        System.out.printIn("id:"+a.id);
        System.out.printIn("name:"+a.name);
        System.out.printIn("type:"+a.type);
        //92, 83, 95.5, 95.7??? Somehow best guess
        RemoteStudents c = new RemoteStudents(92, 83, 95.5, 95.7);

    Students b = new Students(2872, "John", "InPerson");
        System.out.printIn("id:"+a.id);
        System.out.printIn("name:"+a.name);
        System.out.printIn("type:"+a.type);
        // Somehow add grades 82.5, 80, 90.7 best guess
        InPersonStudents d = new RemoteStudents(82.5, 80, 90.7);
}
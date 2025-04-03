
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String username_free_input = scanner.nextLine();
       
        // System.out.print("Enter your password: ");
        // String username_password = scanner.nextLine();

        // System.out.println("Your username is: "+ username_free_input);
        // System.out.println("Your username is: "+ username_password);

        // User me = new User(username_free_input, username_password);

        // File myFile = new File("Accounts.txt");

        // if (myFile.exists()) {
        //     System.out.println("File Found");
        // } else {
        //     System.out.println("File does not exist");
        // }
         
        // Scanner fileScanner = new Scanner(myFile);

        // Boolean accountexists = false;
        // while (fileScanner.hasNextLine()) {
        //     String filedata = fileScanner.nextLine();
        //     //System.out.println(filedata);

        //     String username = filedata.split(",")[0];
        //     //System.out.println(username);

        //     String password = filedata.split(",")[1];
        //     //System.out.println(password);

        //     if (username.equals(username_free_input) && password.equals(username_password)) {
        //         accountexists = true;
        //         break;
        //     }
        // }
        //     if(accountexists){
        //         System.out.println("Login successful, Hello "+ me.getUsername());
        //     }
        //     else{
        //         System.out.println("Account does not exist");
        //     }
        // scanner.close();
        // fileScanner.close();
        DataScientist dataScientist1 = new DataScientist("John", null, null);

        System.out.println("My name is " + dataScientist1.name);
        System.out.println("His work is " + dataScientist1.getWork());
        System.out.println("He earns " + dataScientist1.getSalary());

        Res researcher1 = new Res("Jane", null, null);

        System.out.println("My name is " + researcher1.name);
        System.out.println("His work is " + researcher1.getWork());
        System.out.println("He earns " + researcher1.getSalary());

    }
}

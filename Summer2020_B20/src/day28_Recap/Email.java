package day28_Recap;
/*

    3. write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail
 */
public class Email {
    public static void main(String[] args) {
        String email ="cybertek@gmail.com";
        String name =email.substring(0,email.indexOf("@"));
        name=name;
        String domain=email.substring(email.indexOf("@")+1,email.indexOf(".c"));
        domain=domain;


        System.out.println(name);
        System.out.println(domain);




    }
}

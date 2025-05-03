import java.rmi.*;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerUrl = "rmi://" + args[0] + "/AddServer";

            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerUrl);
            System.out.println("First Number is : " + args[1]);
            double d1 = Double.parseDouble(args[1]);

            System.out.println("Second Number is : " + args[2]);
            double d2 = Double.parseDouble(args[2]);

            System.out.println("Addition of two numbers is : " + addServerIntf.add(d1, d2));

        } catch (Exception e) {
            System.out.println("Exception" + e);
        }

    }
}
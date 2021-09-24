public class Elevator {
    public static void main(String[] args) {

        System.out.println("* * * * * * * *");
        System.out.println("Initializing the building with elevators");
        System.out.println();

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // Configurable elevators names
        String elevator1 = "Passengers elevator (1st)";
        String elevator2 = "Freight elevator (2nd)";
        String elevator3 = "VIP elevator (3rd)";

        boolean isOccupied1 = false;
        boolean isOccupied2 = false;
        boolean isOccupied3 = false;

        // Elev 1
        System.out.println(elevator1 + " is chosen");
        System.out.println(elevator1  + " is occupied? " + isOccupied1);
        if (isOccupied1) {
            System.out.println(elevator1 + " is gone");
        }
        else
        {
            System.out.println(elevator1 + " is waiting");
        }

        System.out.println("");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // Elev 2
        System.out.println(elevator2 + " is chosen");
        System.out.println(elevator2 + " is occupied? " + isOccupied2);

        if (isOccupied2) {
            System.out.println(elevator2 + " is gone");
        }
        else
        {
            System.out.println(elevator2 + " is waiting");
        }

        System.out.println("");

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // Elev 3
        System.out.println(elevator3 + " is chosen");
        System.out.println(elevator3 + " is occupied? " + isOccupied3);
        if (isOccupied3) {
            System.out.println(elevator3 + " is gone");
        }
        else
        {
            System.out.println(elevator3 + " is waiting");
        }
        System.out.println("");

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("* * * * * * * *");
        System.out.println("Starting serving passengers");
        System.out.println();

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // Change elevators state
        // passengers occupy elevators and elevators gone
        isOccupied1 = true;
        isOccupied2 = true;
        // isOccupied3 = false;

        // Elev 1
        System.out.println(elevator1 + " is chosen");
        System.out.println(elevator1  + " is occupied? " + isOccupied1);
        if (isOccupied1) {
            System.out.println(elevator1 + " is gone");
        }
        else
        {
            System.out.println(elevator1 + " is waiting");
        }

        System.out.println("");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // Elev 2
        System.out.println(elevator2 + " is chosen");
        System.out.println(elevator2 + " is occupied? " + isOccupied2);

        if (isOccupied2) {
            System.out.println(elevator2 + " is gone");
        }
        else
        {
            System.out.println(elevator2 + " is waiting");
        }

        System.out.println("");

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // Elev 3
        System.out.println(elevator3 + " is chosen");
        System.out.println(elevator3 + " is occupied? " + isOccupied3);
        if (isOccupied3) {
            System.out.println(elevator3 + " is gone");
        }
        else
        {
            System.out.println(elevator3 + " is waiting");
        }

        System.out.println("");

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }




    }
}

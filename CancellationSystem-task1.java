import java.util.Scanner;

class CancellationSystem {
    public void cancelTicket() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PNR Number: ");
        String pnr = sc.nextLine();
        System.out.print("Are you sure you want to cancel ticket with PNR " + pnr + "? (yes/no): ");
        String confirm = sc.nextLine().trim().toLowerCase();
        if (confirm.equals("yes")) {
            System.out.println("Ticket with PNR " + pnr + " is cancelled successfully!");
        } else {
            System.out.println("Cancellation aborted by user.");
        }
    }
}

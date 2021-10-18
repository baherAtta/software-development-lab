public class Main {
    public static void main(String[] args) throws Exception {
        // Testing TV Class
        System.out.println("Testing TV Class");
        TV homeTV = new TV();

        System.out.println("Current Channel: " + homeTV.getChannel());
        System.out.println("Current Volume: " + homeTV.getVolume());

        homeTV.setChannel(51);
        System.out.println("Current Channel: " + homeTV.getChannel());

        homeTV.setVolume(6);
        System.out.println("Current Volume: " + homeTV.getVolume());

        homeTV.channelUp();
        homeTV.channelUp();
        System.out.println("Current Channel: " + homeTV.getChannel());
        homeTV.channelDown();
        System.out.println("Current Channel: " + homeTV.getChannel());

        homeTV.volumeUp();
        homeTV.volumeUp();
        homeTV.volumeUp();
        homeTV.volumeUp();
        homeTV.volumeUp();
        System.out.println("Current Volume: " + homeTV.getVolume());
        
        homeTV.volumeDown();
        homeTV.volumeDown();
        homeTV.volumeDown();
        System.out.println("Current Volume: " + homeTV.getVolume());


        homeTV.setChannel(121);
        System.out.println("Current Channel: " + homeTV.getChannel());

        System.out.println("\n\n /*************************************************/\n\n");
        System.out.println("Testing Account Class \n");

        Account user = new Account(1122, 20000, 4.5);
        user.printAccount();

        user.withdraw(2500);
        user.printAccount();

        user.deposit(3000);
        System.out.println("\n This account's Balance is: $" + user.getBalance() + '\n');
        System.out.println("\n This account's Monthly Interest is: " + user.getMonthlyInterest() + "%\n");

        System.out.println("\n This account was created in: " + user.getDateCreated() + '\n');

        user.printAccount();
    }
}

package lab03;
public class Lab03 {
    public static void main(String[] args) {
        UserStory s1 = new UserStory(1, "Registration", 5, null);
        UserStory s2 = new UserStory(2, "Verifying", 4, new UserStory[] {s1});
        
        System.out.println("Completing s2 without s1");
        s2.complete();
        System.out.println("S2 stopped: " + s2.isCompleted());
        
        System.out.println("Completing s1, then - s2");
        s1.complete();
        s2.complete();
        System.out.println("S1 stopped: " + s1.isCompleted());
        System.out.println("S2 stopped: " + s2.isCompleted());
        
        Bug b1 = Bug.createBug(1, "Error: incorrect email", 2, s1);
        Bug b2 = Bug.createBug(2, "Error: incorrect password", 3, s2);
        
        Sprint sprint = new Sprint(10, 3);
        
        System.out.println("Creating bugs for completed user stories.");
        System.out.println("S1 bug: " + b1);
        System.out.println("S2 bug: " + b2);
        
        System.out.println("Adding bugs and userstory to sprint.");
        System.out.println("S1: " + sprint.addUserStory(s1));
        System.out.println("B1: " + sprint.addBug(b1));
        System.out.println("B2: " + sprint.addBug(b2));
        
        System.out.println("Try to add extra userstory.");
        System.out.println("S2: " + sprint.addUserStory(s2));
        
        System.out.println("===================================");
        System.out.println("Total estimate of sprint: " + sprint.getTotalEstimate());
        System.out.println("Tickets count: " + sprint.getTickets().length);
    }
}

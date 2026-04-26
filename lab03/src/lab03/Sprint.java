package lab03;
import java.util.ArrayList;
import java.util.List;
public class Sprint {
    private int capacity;
    private int limit;
    private List<Ticket> tickets;
    public Sprint(int capacity, int limit){
        this.capacity = capacity;
        this.limit = limit;
        this.tickets = new ArrayList<>();
    }
    public boolean addUserStory(UserStory userStory){
        if (userStory != null && !userStory.isCompleted() && tickets.size() < limit 
                && getTotalEstimate() + userStory.getEstimate() <= capacity){
            tickets.add(userStory);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addBug(Bug bugReport){
        if (bugReport != null && !bugReport.isCompleted() && tickets.size() < limit 
                && getTotalEstimate() + bugReport.getEstimate() <= capacity){
            tickets.add(bugReport);
            return true;
        }
        else{
            return false;
        }
    }
    public Ticket[] getTickets(){
        Ticket[] result = new Ticket[tickets.size()];
        return tickets.toArray(result);
    }
    public int getTotalEstimate(){
        int total = 0;
        for (Ticket ticket: tickets){
            total += ticket.getEstimate();
        }
        return total;
    }
}

package lab03;
public class Ticket {
    private int id;
    private int estimate;
    private String name;
    private boolean completed;
    public Ticket (int id, int estimate, String name){
        this.id = id;
        this.estimate = estimate;
        this.name = name;
        this.completed = false;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return name;
    }
    public int getEstimate(){
        return this.estimate;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void complete(){
        this.completed = true;
    }
}

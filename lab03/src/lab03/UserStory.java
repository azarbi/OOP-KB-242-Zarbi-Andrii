package lab03;
public class UserStory extends Ticket{
    private UserStory[] dependencies;
    public UserStory(int id, String name, int estimate, UserStory[] dependencies){
        super(id, estimate, name);
        if (dependencies == null){
            this.dependencies = new UserStory[0];
        } 
        else {
            this.dependencies = new UserStory[dependencies.length];
            System.arraycopy(dependencies, 0, this.dependencies, 0, dependencies.length);
        }
    }
    public UserStory[] getDependencies(){
        UserStory[] copy = new UserStory[dependencies.length];
        System.arraycopy(dependencies, 0, copy, 0, dependencies.length);
        return copy;
    }
    @Override
    public void complete(){
        for (UserStory dependency : dependencies){
            if(!dependency.isCompleted()){
                return;
            }
        }
        super.complete();
    }
    @Override
    public String toString(){
        return "[US" + " " + getId() + "]" + " " + getName();
    }
}

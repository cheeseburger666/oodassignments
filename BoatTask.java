/**
 * NAME：Xinyi Wu
 * @version 1
 */


package assignments;

public class BoatTask {
    private int ID;
    private String taskName;
    private String Objective;
    private String startData;
    private int BoatID;
    
    
    //Build task 
    
    public BoatTask(int ID, String taskName, String objective, String startData, int boatID) {
        this.ID = ID;
        this.taskName = taskName;
        Objective = objective;
        this.startData = startData;
        BoatID = boatID;
    }
    //Output tasks 
    public void output(){
        System.out.println("Task Number:" + getID());
        System.out.println("Task Name:" + getTaskName());
        System.out.println("Destination:" + getObjective());
        System.out.println("Start Date:" + getStartData());
        System.out.println("Boat Number:" + getBoatID());
        System.out.println("-------------");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public String getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        this.startData = startData;
    }

    public int getBoatID() {
        return BoatID;
    }

    public void setBoatID(int boatID) {
        BoatID = boatID;
    }
}

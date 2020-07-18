/**
 * NAME：Xinyi Wu
 * @version 1
 */


package assignments;

import java.util.ArrayList;
import java.util.HashMap;

public class BoatScheduler {

    private ArrayList taskList=new ArrayList();
    private HashMap map=new HashMap();

    public void add(BoatTask task){
        taskList.add(task);
        ArrayList list=(ArrayList) map.get(task.getBoatID());
        if(list==null){
            list=new ArrayList();
        }
        list.add(task);
        map.put(task.getBoatID(),list);
    }
    public BoatTask get(int ID){
        for (int i = 0; i <taskList.size() ; i++) {
            BoatTask boatTask=(BoatTask) taskList.get(i);
            if(boatTask.getID()==ID){
                return boatTask;
            }
        }
        return null;
    }
    public void remove(int ID){
        for (int i = 0; i <taskList.size() ; i++) {
            BoatTask boatTask=(BoatTask) taskList.get(i);
            if(boatTask.getID()==ID){
                taskList.remove(i);
                ArrayList list=(ArrayList) map.get(boatTask.getBoatID());
                if(list==null){
                    continue;
                }
                list.remove(boatTask);
                map.put(boatTask.getBoatID(),list);
            }
        }
    }

    public void loop(){
        for (int i = 0; i <taskList.size() ; i++) {
            BoatTask boatTask=(BoatTask) taskList.get(i);
            boatTask.output();
        }
    }

    public ArrayList search(int BoatID){
        ArrayList list=(ArrayList) map.get(BoatID);
        return list;
    }
}

/**
 * NAME：Xinyi Wu
 * @version 1
 */


package assignments;

import java.util.ArrayList;
import java.util.Scanner;



public class BoatTest{
    public static void output(Boat boat){
        System.out.println("name="+boat.getName()+
                ",x="+boat.getX()+
                ",y="+boat.getY()+
                ",heading="+boat.getHeading()+
                ",speed="+boat.getSpeed()+
                ",loadCapacity="+boat.getLoadCapacity()+
                ",batteryCapacity="+boat.getBatteryCapacity());
        System.out.println("-------------------------");
    }
    public static void run(){
        Boat boat1=new Boat("boat1",3,4,30,15,100,100);
        Boat boat2=new Boat("boat2",6,8,60,20,50,100);
        Boat boat3=new Boat("boat3",9,3,90,25,150,100);
        Boat boat4=new Boat("boat4",3,8,0,30,200,100);
        Boat boat5=new Boat("boat5",20,24,120,45,100,100);
        boat1.moveTo(5,6);
        output(boat1);
        boat2.moveTo(5,6);
        output(boat2);
        boat3.moveTo(5,6);
        output(boat3);
        boat4.moveTo(5,6);
        output(boat4);
        boat5.moveTo(5,6);
        output(boat5);
    }
    public static void main(String[] args) {
      run();
      System.out.println("Build 3 tasks");
      BoatTask task=new BoatTask(1,"first","Beijing","2020-7-16",1);
      BoatTask task1=new BoatTask(2,"second","Shanghai","2020-7-17",1);
      BoatTask task2=new BoatTask(3,"third","Hangzhou","2020-7-18",2);
      System.out.println("Tasks instance");
      BoatScheduler scheduler=new BoatScheduler();
      System.out.println("Task 1 on schedule");
      scheduler.add(task);
      System.out.println("Task 2 on schedule");
      scheduler.add(task1);
      System.out.println("Task 3 on schedule");
      scheduler.add(task2);
      System.out.println("get Task 2");
      BoatTask tmp=scheduler.get(2);
      System.out.println("Output Task 2");
      tmp.output();
      System.out.println("Loop tasks");
      scheduler.loop();
      System.out.println("Remote Task 2");
      scheduler.remove(2);
      System.out.println("Check whether Task 2 remoted successfully");
      scheduler.loop();
      System.out.println("Get the task of Boat 1 from HashMap");
      ArrayList list=scheduler.search(1);
      System.out.println("Output the task of Boat 1");
      for (int i = 0; i <list.size() ; i++) {
          BoatTask boatTask=(BoatTask)list.get(i);
          boatTask.output();
      }
  }
}
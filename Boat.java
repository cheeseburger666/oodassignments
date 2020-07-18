/**
 * NAME：Xinyi Wu
 * @version1
 */


package assignments;

public class Boat{
    private String name;
    private double x,y,heading,speed,loadCapacity,batteryCapacity;

    public Boat(String name, double x, double y, double heading, double speed, double loadCapacity, double batteryCapacity) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.heading = heading;
        this.speed = speed;
        this.loadCapacity = loadCapacity;
        this.batteryCapacity = batteryCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getHeading() {
        return heading;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void moveTo(double newX, double newY){
        System.out.println(getName()+" will move from ("+getX()+","+getY()+") to ("+newX+","+newY+")");
        double distance=Math.sqrt(Math.abs(newY-getY())+Math.abs(newX-getX()));
        
        
        System.out.println(getName()+" will move "+distance+" steps");
        double powerConsumption=distance*0.07;
        
        if(getBatteryCapacity()<powerConsumption){
            System.out.println("The battery is low!");
            return;
        }
        
        double newheading=Math.toDegrees(Math.atan((newY-getY())/(newX-getX())));
        
        if(newY>getY()&&newX<getX()){
            newheading+=180;
        }
        else if(newY<getY()&&newX<getX()){
            newheading-=180;
        }
        setHeading(newheading);
        setBatteryCapacity(getBatteryCapacity()-powerConsumption);
        setX(newX);
        setY(newY);
    }
}

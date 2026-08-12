class NeedForSpeed { 
    int speed; 
    int batteryDrain; 
    int battery = 100; 
    int distance = 0; 

    NeedForSpeed(int speed, int batteryDrain) { 
        this.speed = speed; 
        this.batteryDrain = batteryDrain; 
    } 

    public boolean batteryDrained() { 
        return this.battery < this.batteryDrain; 
    } 

    public int distanceDriven() { 
        return distance; 
    } 

    public void drive() { 
        if (!batteryDrained()){ 
            distance = speed + distance; 
            battery = battery - batteryDrain; 
        } 
    } 

    public static NeedForSpeed nitro() { 
        return new NeedForSpeed(50, 4); 
    } 
} 

class RaceTrack { 
    int distance; 

    RaceTrack(int distance) { 
        this.distance = distance; 
    } 

    public boolean canFinishRace(NeedForSpeed car) { 
        while (!car.batteryDrained()) { 
            car.drive(); 
        } 
        // FIXED: Changed car.distance() to car.distanceDriven()
        return car.distanceDriven() >= this.distance; 
    } 
}
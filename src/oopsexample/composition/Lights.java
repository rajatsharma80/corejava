package oopsexample.composition;

public class Lights {

    private int bulbCount;
    private int nightLamp;

    public Lights(int bulbCount, int nightLamp) {
        this.bulbCount = bulbCount;
        this.nightLamp = nightLamp;
    }

    public int getBulbCount() {
        return bulbCount;
    }

    public int getNightLamp() {
        return nightLamp;
    }

    public void totalLights(){
        int totalLights = this.bulbCount + this.nightLamp;
        System.out.println("Total lights are " + totalLights);
    }
}

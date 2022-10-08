package baithi.flight;

public class Flight {
    int number;
    String destination;

    public Flight() {
        this.number = 0;
        this.destination= "";
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void disPlay(){
        System.out.println(getNumber()+","+getDestination());
    }
}

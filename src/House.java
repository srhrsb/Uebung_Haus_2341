public class House {

    private int space;
    private boolean balcony;
    private int floors;

    public House( int space ){
        this.space = space;
        this.balcony = false;
        this.floors = 2;
    }

    public House(int space, boolean balcony, int floors) {
        this.space = space;
        this.balcony = balcony;
        this.floors = floors;
    }

    public void addBalcony(){
        this.balcony = true;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

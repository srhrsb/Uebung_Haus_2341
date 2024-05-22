public class Main {
    public static void main(String[] args) {

        House house = new House(80, true, 2);
        House house2 = new House(120);

        PoolHouse poolHouse = new PoolHouse(40, 120);
        System.out.println(poolHouse.getBalcony());
        poolHouse.setBalcony(true);
        System.out.println(poolHouse.getBalcony());
    }
}
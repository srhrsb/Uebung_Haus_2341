public class PoolHouse extends House {

    private int poolSize;

    public PoolHouse( int poolSize, int space){
        super( space );
        this.poolSize = poolSize;
    }

    public void setPoolSize( int poolSize ){
        this.poolSize = poolSize;
    }

    public int getPoolSize(){
        return this.poolSize;
    }

    @Override
    public void addBalcony() {
        super.addBalcony();//nutzt die Implementierung aus der Oberklasse
        //und fügt neue Funktionalität hinzu
        System.out.println("Es wird ein Poolhaus Balkon hinzugefügt");
    }
}

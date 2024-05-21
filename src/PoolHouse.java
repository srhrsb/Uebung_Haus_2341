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


}

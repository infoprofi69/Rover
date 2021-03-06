package Sensors;

public abstract class AbstractSensor <T> implements Sensor<T> {
    private boolean status=true;
    private T content ;




    public  T  read() throws Exception {
        if (status) {
            return this.content;
        }

        throw new Exception();


    }

    @Override
    public boolean enabled() {
        status=true;
        return status;
    }

    @Override
    public boolean disabled() {
        status=false;
        //System.out.println("STATUS ="+ this.status );
        return status;
    }




}

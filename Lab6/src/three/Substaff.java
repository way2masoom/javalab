package three;

public class Substaff extends Manager{

    Substaff(float basic){
        super(basic);
    }
    @Override
    public float bonus() {
        return (basic / 2.0f);
    }
}

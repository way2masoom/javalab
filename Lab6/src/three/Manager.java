package three;

public abstract class Manager implements Account{
    float basic;
    Manager(float basic){
        this.basic = basic;
    }
    @Override
    public float earning() {
        return  basic + (basic * 0.8f) * (basic * 0.15f);
    }

    @Override
    public float deduction() {
        return (basic * 0.12f);
    }
    public abstract float bonus();

}

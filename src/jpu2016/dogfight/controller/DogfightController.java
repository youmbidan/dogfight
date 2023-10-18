package jpu2016.dogfight.controller;

public class DogfightController implements IOrderPerformer {
    private final int TIME_SLEEP = 30;
    private final IDogfightModel dogfightModel;
    private UserOrder UserOrder;
    private IViewSystem viewSystem;

    public DogfightController (IDogfightModel dogfightModel){
        this.dogfightModel = dogfightModel;
    }
    public void orderPerform ( UserOrder userorder){
        this.UserOrder = userorder;

    }
    private void launchMissile( int player){
        this.dogfightModel.addMobile(new Missile(
        this.dogfightModel.getMobileByPlayer(player).getDirection(),
        null));
    }

    public jpu2016.dogfight.controller.UserOrder getUserOrder() {
        return UserOrder;
    }
}

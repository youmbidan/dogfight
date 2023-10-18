package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
    private int player;

    private Order order;

    public UserOrder(int player, Order order){
        this.player = player;
        this.order = order;

    }

    public Order getOrder() {
        return order;
    }

    public int getPlayer(){
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}

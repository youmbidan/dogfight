package jpu2016.dogfight.controller;

import javax.swing.plaf.basic.BasicArrowButton;

public interface IDogfightModel {
    void addMobile(Missile missile);

    BasicArrowButton getMobileByPlayer(int player);
}

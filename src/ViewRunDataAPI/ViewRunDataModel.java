/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewRunDataAPI;

/**
 * Class that store data + getter and setter
 * @author r4kia
 */
public class ViewRunDataModel {
    
    private double Tspeed = 0;
    private double Aspeed = 0;
    private double Taccel = 0;
    private double Aaccel = 0;
    private double AirTime = 0;
    private double Vertical = 0;
    private int Fall = 0;
    
    ViewRunDataModel(){};
    
    /**
     * get double top speed
     * @return
     */
    public double getTspeed(){
        return Tspeed;
    }

    /**
     * get double average speed
     * @return
     */
    public double getAspeed() {
        return Aspeed;
    }

    /**
     * get top acceleration
     * @return
     */
    public double getTaccel() {
        return Taccel;
    }

    /**
     * get double average acceleration
     * @return
     */
    public double getAaccel() {
        return Aaccel;
    }

    /**
     * get double air time
     * @return
     */
    public double getAirTime() {
        return AirTime;
    }

    /**
     * get double max vertical aka height
     * @return
     */
    public double getMaxVertical() {
        return Vertical;
    }

    /**
     * get int fall count
     * @return
     */
    public int getFallCount() {
        return Fall;
    }

    /**
     *set top speed 
     * @param Tspeed
     */
    public void setTspeed(double Tspeed) {
        this.Tspeed = Tspeed;
    }

    /**
     *set average speed
     * @param Aspeed
     */
    public void setAspeed(double Aspeed) {
        this.Aspeed = Aspeed;
    }

    /**
     *set top acceleration
     * @param Taccel
     */
    public void setTaccel(double Taccel) {
        this.Taccel = Taccel;
    }

    /**
     *set average acceleration
     * @param Aaccel
     */
    public void setAaccel(double Aaccel) {
        this.Aaccel = Aaccel;
    }

    /**
     *set air time
     * @param AirTime
     */
    public void setAirTime(double AirTime) {
        this.AirTime = AirTime;
    }

    /**
     *set max vertical aka height
     * @param Vertical
     */
    public void setMaxVertical(double Vertical) {
        this.Vertical = Vertical;
    }

    /**
     *set fall count
     * @param Fall
     */
    public void setFallCount(int Fall) {
        this.Fall = Fall;
    }
    
}


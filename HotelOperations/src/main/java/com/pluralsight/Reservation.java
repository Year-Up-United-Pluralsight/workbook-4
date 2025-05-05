package com.pluralsight;

public class Reservation {

// PRIVATE INSTANCE VARIABLES ------------------------------------------------------------------------------------------
    private String roomType;
    private int numOfNights;
    private boolean isWeekend;

// CONSTRUCTOR ---------------------------------------------------------------------------------------------------------
    public Reservation(String roomType, boolean isWeekend, int numOfNights) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
    }

// GETTERS AND SETTERS -------------------------------------------------------------------------------------------------
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public double getPrice() {

        double basepay = 0;

        // Sets price according to size of bed (king or double) with exception if wrong input
        if (getRoomType().equals("king")) {
            basepay = 139;
        }

        else if (getRoomType().equals("double")) {
            basepay = 124;
        }

        // Applies 10% in price  if it's a weekend
        return (this.isWeekend) ? (basepay *= 0.1) : basepay;

    }

    public double getReservationTotal() {
        return getPrice() * numOfNights;
    }
}

package com.pluralsight;

public class Room {

// PRIVATE INSTANCE VARIABLES ----------------------------------------------------------------------------------------
    private int num_of_beds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

// CONSTRUCTOR -----------------------------------------------------------------------------------------------------
    public Room(int num_of_beds, double price, boolean occupied, boolean dirty, boolean available) {
        this.num_of_beds = num_of_beds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

// GETTERS ----------------------------------------------------------------------------------------------------------
    public int getNumberOfBeds() {
        return num_of_beds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }
}

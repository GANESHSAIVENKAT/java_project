package com.xworkz.exceptiontask.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class BusTicketDTO {
    private String destination;
    private double price;

    public BusTicketDTO(String destination, double price) {
        this.destination = destination;
        this.price = price;
    }

    // Getters and setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


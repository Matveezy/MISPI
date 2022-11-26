package com.example.Web3.mbeans.square_mbean;

import lombok.Data;

@Data
public class Square implements SquareMBean {
    private int r;


    @Override
    public double calculateSquare() {
        double rectangle = r * (r / 2);
        double triangle = (1.0 / 2.0) * r * (r / 2);
        double circle = (Math.PI * Math.pow(r, 2)) / 4;
        return rectangle + triangle + circle;
    }
}

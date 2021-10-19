package com.example.nasa_iotd;


public class Response {
    @SuppressWarnings("unused")
    int date, totalHits;
    @SuppressWarnings("unused")
    Hit[] hits;

    @Override
    public String toString() {

            return "totalHits = " + totalHits;

    }
}

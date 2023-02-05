package com.example.busticket.model;

public class RailwayTicket {

    //задание полей
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // время отправления
    private String arrivalDate; // время прибытия
    private String travelTime; // время пути
    private int distance; // расстояние пути
    private float ticketPrice; // стоимость взрослого билета
    private int numberOfTickets; // количество билетов

    //пустой конструктор по умолчанию
    public RailwayTicket() {
    }

    //конструктор стоимость и количество
    public RailwayTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice; //стоимость
        this.numberOfTickets = numberOfTickets; //количество
    }

    //метод подсчета взрослых билетов
    public float ticketPriceAll () {
        return ticketPrice * numberOfTickets; //количество билетов умножаем на стоимость одного
    }

    // создаем геттеры и сеттеры

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }


}


package com.example.busticket.model;

//            детский билет    наследует от взрослого билета
public class RailwayTicketChild extends RailwayTicket {

    //задание полей
    private float ticketDiscount; //скидка на детский билет

    //пустой конструктор
    public RailwayTicketChild() {
    }

    //создание конструктора с данными детского билета
    public RailwayTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    //переопределяем метод для подсчета стоимости детского билета с учетом скидки
    public float ticketPriceAll () {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount)) / 100; // нужно умножить
        // количество билетов на стоимость одного билета и на скидку (100% - % скидки) и всё разделить на 100
    }

}

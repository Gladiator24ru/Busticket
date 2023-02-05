package com.example.busticket.model;

//            пенсионный  билет    наследует от взрослого билета
public class PensionerTicket extends RailwayTicket{

    //задание полей
    private float ticketDiscount; //скидка на пенсионный билет

    //пустой конструктор
    public PensionerTicket() {
    }

    //создание конструктора с данными пенсионного билета
    public PensionerTicket(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    //переопределяем метод подсчета стоимости пенсионного билета с учетом скидки
    public float ticketPriceAll () {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount)) / 100; // нужно умножить
        // количество билетов на стоимость одного билета и на скидку (100% - % скидки) и всё разделить на 100
    }


}
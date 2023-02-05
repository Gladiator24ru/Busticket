package com.example.busticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.busticket.model.PensionerTicket;
import com.example.busticket.model.RailwayTicket;
import com.example.busticket.model.RailwayTicketChild;

public class MainActivity extends AppCompatActivity {

    //создание объекта сущности взрослых билетов (стоимость билета, количество билетов)
    RailwayTicket railwayTicket = new RailwayTicket(70, 9);
    //создание объекта сущности взрослых билетов (стоимость билета, количество билетов, скидка)
    RailwayTicketChild railwayTicketChild = new RailwayTicketChild(70, 11, 50);
    //создание объекта сущности взрослых билетов (стоимость билета, количество билетов)
    PensionerTicket pensionerTicket = new PensionerTicket(70,5,30);

    //создание полей для вывода нужной информации
    private TextView railwayTicketTotalOut; //поле вывода общей стоимости билетов

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);  // вывод информации стоимости всех билетов

        // заполнение поля стоимостью всех билетов
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll() + pensionerTicket.ticketPriceAll()) + " монет");


    }
}
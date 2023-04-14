package me.dio.desafioacademiadigital.infra;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeUtils {

    private DateTimeUtils() {}

    private  static final Locale LOCALE_BR = new Locale("pt", "BR");

    public static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", LOCALE_BR);
    public static final DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy", LOCALE_BR);


    /**
     * Converte um string no formato "dd/MM/yyyy" para um LocalDate.
     *
     * Atenção: use duas casas decimais. Esse método falha para: "25/2/2012"
     *
     * @param date: data do tipo String a ser convertido em LocalDate
     * @return LocalDate ronvertido em data.
     */
    public static final LocalDate convertStringToLocalDate(String date) {
        LocalDate localDate = LocalDate.parse(date, LOCAL_DATE_FORMATTER);
        return localDate;
    }

    /**
     * Converte um string no formato "dd/MM/yyyy HH:mm:ss" para um LocalDate.
     *
     * Atenção: use duas casas decimais. Esse método falha para: "25/2/2012"
     *
     * @param datetime: data e hora do tipo String a ser convertido em LocalDate
     * @return LocalDate ronvertido em data e hora.
     */
    public static final LocalDateTime convertStringToLocalDateTime(String datetime) {
        LocalDateTime localDateTime = LocalDateTime.parse(datetime, LOCAL_DATE_TIME_FORMATTER);
        return localDateTime;
    }

}

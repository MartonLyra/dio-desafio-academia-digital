package me.dio.desafioacademiadigital.infra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DateTimeUtilsTest {

    @Test
    void convertStringToLocalDateTest() {
        String dtStr = "25/12/2012"; // Atenção: esse método falha para: "25/2/2012"

        LocalDate dt = DateTimeUtils.convertStringToLocalDate(dtStr);

        Assertions.assertEquals(2012, dt.getYear());
        Assertions.assertEquals(12, dt.getMonthValue());
        Assertions.assertEquals(25, dt.getDayOfMonth());


    }


    @Test
    void convertStringToLocalDateTimeTest() {
        String dtStr = "09/07/2021 15:45:59"; // Atenção: esse método falha para: "25/2/2012"

        LocalDateTime dt = DateTimeUtils.convertStringToLocalDateTime(dtStr);

        Assertions.assertEquals(2021, dt.getYear());
        Assertions.assertEquals(7, dt.getMonthValue());
        Assertions.assertEquals(9, dt.getDayOfMonth());

        Assertions.assertEquals(15, dt.getHour());
        Assertions.assertEquals(45, dt.getMinute());
        Assertions.assertEquals(59, dt.getSecond());

    }

}
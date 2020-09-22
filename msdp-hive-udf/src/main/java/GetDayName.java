package com.epam;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.DateFormatSymbols;
import java.util.Locale;

public final class GetDayName extends UDF {

    public String evaluate(final Integer input) {
        if (input == null) return null;
        Locale usersLocale = Locale.getDefault();
        DateFormatSymbols dfs = new DateFormatSymbols(usersLocale);
        String weekdays[] = dfs.getWeekdays();
        return weekdays[input];
    }
}
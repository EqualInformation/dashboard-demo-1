package com.vaadin.addon.charts.util;

/**
 * Created by bpupadhyaya on 12/25/15.
 */

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Util {
    public Util() {
    }

    public static long toHighchartsTS(Date date) {
        return date.getTime() - (long)(date.getTimezoneOffset() * '\uea60');
    }

    public static Date toServerDate(double rawClientSideValue) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.setTimeInMillis((long)rawClientSideValue);
        instance.set(12, instance.get(12));
        instance.setTimeZone(TimeZone.getDefault());
        return instance.getTime();
    }
}

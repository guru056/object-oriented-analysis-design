package com.playalong.ParkingLot.Util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

    public static String getCurrentTimestamp()
    {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

    public static long getTimeDifferenceInSeconds(String fromTimeStamp, String toTimeStamp)  {
        Date fromTime = null;
        Date toTime = null;
        try {
            fromTime = getDateFromStringTimeStamp(fromTimeStamp);
            toTime = getDateFromStringTimeStamp(toTimeStamp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (toTime.getTime() - fromTime.getTime()) / 1000;
    }

    public static Date getDateFromStringTimeStamp(String timestamp) throws ParseException
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        return dateFormat.parse(timestamp);
    }

}

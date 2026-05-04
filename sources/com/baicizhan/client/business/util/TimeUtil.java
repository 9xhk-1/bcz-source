package com.baicizhan.client.business.util;

import com.baicizhan.client.business.util.LunarUtils;
import com.baicizhan.online.user_study_api.UserDakaDate;
import com.tencent.liteav.TXLiteAVCode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TimeUtil {
    public static final SimpleDateFormat COMMON_DATE_EN_FORMAT;
    public static final SimpleDateFormat COMMON_DATE_FORMAT;
    public static final long DAY_MILLIS = 86400000;
    public static final long HOUR_MILLIS = 3600000;
    public static final long MINUTE_MILLIS = 60000;
    public static final long SECOND_MILLIS = 1000;
    private static final String TAG = "TimeUtil";
    public static final SimpleDateFormat YEAR_MONTH_FORMAT;
    public static final SimpleDateFormat YEAR_MONTH_NUMBER_FORMAT;

    static {
        Locale locale = Locale.CHINA;
        COMMON_DATE_FORMAT = new SimpleDateFormat("yyyy年MM月dd日", locale);
        COMMON_DATE_EN_FORMAT = new SimpleDateFormat("yyyy-MM-dd", locale);
        YEAR_MONTH_FORMAT = new SimpleDateFormat("yyyy年MM月", locale);
        YEAR_MONTH_NUMBER_FORMAT = new SimpleDateFormat("yyyyMM", locale);
    }

    public static UserDakaDate convert2DakaDate(int second) {
        long j11 = second;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1000 * j11);
        UserDakaDate userDakaDate = new UserDakaDate();
        userDakaDate.year = calendar.get(1);
        userDakaDate.month = calendar.get(2) + 1;
        userDakaDate.day = calendar.get(5);
        userDakaDate.timestamp = j11;
        return userDakaDate;
    }

    public static List<UserDakaDate> convert2DakaDates(List<Integer> secondList) {
        if (CollectionUtils.isEmpty(secondList)) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList(secondList.size());
        Iterator<Integer> it = secondList.iterator();
        while (it.hasNext()) {
            long intValue = it.next().intValue();
            calendar.setTimeInMillis(1000 * intValue);
            UserDakaDate userDakaDate = new UserDakaDate();
            userDakaDate.year = calendar.get(1);
            userDakaDate.month = calendar.get(2) + 1;
            userDakaDate.day = calendar.get(5);
            userDakaDate.timestamp = intValue;
            arrayList.add(userDakaDate);
        }
        return arrayList;
    }

    public static List<Integer> convert2Seconds(List<UserDakaDate> dakaDates) {
        if (CollectionUtils.isEmpty(dakaDates)) {
            return new ArrayList();
        }
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList(dakaDates.size());
        for (UserDakaDate userDakaDate : dakaDates) {
            calendar.set(1, userDakaDate.year);
            calendar.set(2, userDakaDate.month - 1);
            calendar.set(5, userDakaDate.day);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 1);
            calendar.set(14, 0);
            arrayList.add(Integer.valueOf((int) (calendar.getTimeInMillis() / 1000)));
        }
        return arrayList;
    }

    public static long convert2Time(UserDakaDate dakaDate) {
        if (dakaDate == null) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, dakaDate.year);
        calendar.set(2, dakaDate.month - 1);
        calendar.set(5, dakaDate.day);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 1);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long currentTimeSeconds() {
        return TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public static String formatYearMonth(long time) {
        return YEAR_MONTH_FORMAT.format(new Date(time));
    }

    public static String formatYearMonthNumber(long time) {
        return YEAR_MONTH_NUMBER_FORMAT.format(new Date(time));
    }

    public static int getBetweenDays(long timeMillis1, long timeMillis2) {
        long startOfDay = getStartOfDay(timeMillis1);
        long startOfDay2 = getStartOfDay(timeMillis2);
        long abs = Math.abs(startOfDay - startOfDay2) / 86400000;
        qb.c.i(TAG, "[in1,in2,day1,day2,between],[%d,%d,%d,%d,%d]", Long.valueOf(timeMillis1), Long.valueOf(timeMillis2), Long.valueOf(startOfDay), Long.valueOf(startOfDay2), Long.valueOf(abs));
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            qb.c.i(TAG, "timezone[%s,%s,%d]", timeZone.getID(), timeZone.getDisplayName(), Integer.valueOf(timeZone.getRawOffset()));
        }
        return (int) abs;
    }

    public static int getBetweenMonth(long timeMillis1, long timeMillis2) {
        long max = Math.max(timeMillis1, timeMillis2);
        long min = Math.min(timeMillis1, timeMillis2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(max);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(min);
        return (((calendar.get(1) - calendar2.get(1)) * 12) + calendar.get(2)) - calendar2.get(2);
    }

    public static String getDateString(Date date) {
        return COMMON_DATE_FORMAT.format(date);
    }

    public static long getStartOfDay(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long getStartSecondOfDay(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 1);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String getTodayDateString() {
        return COMMON_DATE_FORMAT.format(Calendar.getInstance().getTime());
    }

    public static String getTodayEn() {
        return COMMON_DATE_EN_FORMAT.format(Calendar.getInstance().getTime());
    }

    public static boolean is618() {
        long currentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2020);
        gregorianCalendar.set(2, 5);
        gregorianCalendar.set(5, 16);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(1, 2020);
        gregorianCalendar2.set(2, 5);
        gregorianCalendar2.set(5, 19);
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        gregorianCalendar2.set(14, 0);
        return currentTimeMillis >= gregorianCalendar.getTimeInMillis() && currentTimeMillis <= gregorianCalendar2.getTimeInMillis();
    }

    public static boolean isDoubleElevenActivated() {
        long currentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2020);
        gregorianCalendar.set(2, 10);
        gregorianCalendar.set(5, 9);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(1, 2020);
        gregorianCalendar2.set(2, 10);
        gregorianCalendar2.set(5, 11);
        gregorianCalendar2.set(11, 23);
        gregorianCalendar2.set(12, 59);
        gregorianCalendar2.set(13, 59);
        gregorianCalendar2.set(14, 0);
        return currentTimeMillis >= gregorianCalendar.getTimeInMillis() && currentTimeMillis <= gregorianCalendar2.getTimeInMillis();
    }

    public static boolean isDoubleElevenPrepared() {
        long currentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2020);
        gregorianCalendar.set(2, 10);
        gregorianCalendar.set(5, 1);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(1, 2020);
        gregorianCalendar2.set(2, 10);
        gregorianCalendar2.set(5, 8);
        gregorianCalendar2.set(11, 23);
        gregorianCalendar2.set(12, 59);
        gregorianCalendar2.set(13, 59);
        gregorianCalendar2.set(14, 0);
        return currentTimeMillis >= gregorianCalendar.getTimeInMillis() && currentTimeMillis < gregorianCalendar2.getTimeInMillis();
    }

    public static boolean isDoubleTwelveActivated() {
        long currentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2020);
        gregorianCalendar.set(2, 11);
        gregorianCalendar.set(5, 10);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(1, 2020);
        gregorianCalendar2.set(2, 11);
        gregorianCalendar2.set(5, 13);
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        gregorianCalendar2.set(14, 0);
        return currentTimeMillis >= gregorianCalendar.getTimeInMillis() && currentTimeMillis <= gregorianCalendar2.getTimeInMillis();
    }

    public static boolean isDoubleTwelvePrepared() {
        long currentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED);
        gregorianCalendar.set(2, 11);
        gregorianCalendar.set(5, 10);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(1, TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED);
        gregorianCalendar2.set(2, 11);
        gregorianCalendar2.set(5, 12);
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        gregorianCalendar2.set(14, 0);
        return currentTimeMillis >= gregorianCalendar.getTimeInMillis() && currentTimeMillis < gregorianCalendar2.getTimeInMillis();
    }

    public static boolean isLunarNewYear() {
        int i11;
        Calendar calendar = Calendar.getInstance();
        LunarUtils.Solar solar = new LunarUtils.Solar();
        solar.solarYear = calendar.get(1);
        solar.solarMonth = calendar.get(2) + 1;
        solar.solarDay = calendar.get(5);
        LunarUtils.Lunar SolarToLunar = LunarUtils.SolarToLunar(solar);
        return SolarToLunar.lunarMonth == 1 && (i11 = SolarToLunar.lunarDay) >= 1 && i11 <= 7;
    }

    public static boolean isNewSemester() {
        long currentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE);
        gregorianCalendar.set(2, 7);
        gregorianCalendar.set(5, 27);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(1, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE);
        gregorianCalendar2.set(2, 8);
        gregorianCalendar2.set(5, 2);
        gregorianCalendar2.set(11, 23);
        gregorianCalendar2.set(12, 59);
        gregorianCalendar2.set(13, 59);
        gregorianCalendar2.set(14, 0);
        return currentTimeMillis >= gregorianCalendar.getTimeInMillis() && currentTimeMillis < gregorianCalendar2.getTimeInMillis();
    }

    public static boolean isSpringFestival() {
        long currentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2020);
        gregorianCalendar.set(2, 0);
        gregorianCalendar.set(5, 25);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(1, 2020);
        gregorianCalendar2.set(2, 0);
        gregorianCalendar2.set(5, 26);
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        gregorianCalendar2.set(14, 0);
        return currentTimeMillis >= gregorianCalendar.getTimeInMillis() && currentTimeMillis <= gregorianCalendar2.getTimeInMillis();
    }

    public static boolean isStoreDoubleDateActivated() {
        return isDoubleElevenActivated() || isDoubleTwelveActivated();
    }

    public static boolean isStoreDoubleDatePrepared() {
        return isDoubleElevenPrepared() || isDoubleTwelvePrepared();
    }

    public static boolean isSummerVacation() {
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(2);
        int i12 = calendar.get(5);
        if (i11 != 5 || i12 < 9) {
            return i11 > 5 && i11 <= 7;
        }
        return true;
    }

    public static long secondsToMillis(long seconds) {
        return seconds * 1000;
    }

    public static long todayStart() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 1);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTime().getTime();
    }
}

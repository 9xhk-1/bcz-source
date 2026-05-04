package org.mozilla.javascript;

import com.jiongji.andriod.card.R;
import dp.a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class NativeDate extends IdScriptableObject {
    private static final int ConstructorId_UTC = -1;
    private static final int ConstructorId_now = -3;
    private static final int ConstructorId_parse = -2;
    private static final Object DATE_TAG = "Date";
    private static final double HalfTimeDomain = 8.64E15d;
    private static final double HoursPerDay = 24.0d;
    private static final int Id_constructor = 1;
    private static final int Id_getDate = 17;
    private static final int Id_getDay = 19;
    private static final int Id_getFullYear = 13;
    private static final int Id_getHours = 21;
    private static final int Id_getMilliseconds = 27;
    private static final int Id_getMinutes = 23;
    private static final int Id_getMonth = 15;
    private static final int Id_getSeconds = 25;
    private static final int Id_getTime = 11;
    private static final int Id_getTimezoneOffset = 29;
    private static final int Id_getUTCDate = 18;
    private static final int Id_getUTCDay = 20;
    private static final int Id_getUTCFullYear = 14;
    private static final int Id_getUTCHours = 22;
    private static final int Id_getUTCMilliseconds = 28;
    private static final int Id_getUTCMinutes = 24;
    private static final int Id_getUTCMonth = 16;
    private static final int Id_getUTCSeconds = 26;
    private static final int Id_getYear = 12;
    private static final int Id_setDate = 39;
    private static final int Id_setFullYear = 43;
    private static final int Id_setHours = 37;
    private static final int Id_setMilliseconds = 31;
    private static final int Id_setMinutes = 35;
    private static final int Id_setMonth = 41;
    private static final int Id_setSeconds = 33;
    private static final int Id_setTime = 30;
    private static final int Id_setUTCDate = 40;
    private static final int Id_setUTCFullYear = 44;
    private static final int Id_setUTCHours = 38;
    private static final int Id_setUTCMilliseconds = 32;
    private static final int Id_setUTCMinutes = 36;
    private static final int Id_setUTCMonth = 42;
    private static final int Id_setUTCSeconds = 34;
    private static final int Id_setYear = 45;
    private static final int Id_toDateString = 4;
    private static final int Id_toGMTString = 8;
    private static final int Id_toISOString = 46;
    private static final int Id_toJSON = 47;
    private static final int Id_toLocaleDateString = 7;
    private static final int Id_toLocaleString = 5;
    private static final int Id_toLocaleTimeString = 6;
    private static final int Id_toSource = 9;
    private static final int Id_toString = 2;
    private static final int Id_toTimeString = 3;
    private static final int Id_toUTCString = 8;
    private static final int Id_valueOf = 10;
    private static double LocalTZA = 0.0d;
    private static final int MAXARGS = 7;
    private static final int MAX_PROTOTYPE_ID = 47;
    private static final double MinutesPerDay = 1440.0d;
    private static final double MinutesPerHour = 60.0d;
    private static final double SecondsPerDay = 86400.0d;
    private static final double SecondsPerHour = 3600.0d;
    private static final double SecondsPerMinute = 60.0d;
    private static final DateFormat isoFormat;
    private static final String js_NaN_date_str = "Invalid Date";
    private static DateFormat localeDateFormatter = null;
    private static DateFormat localeDateTimeFormatter = null;
    private static DateFormat localeTimeFormatter = null;
    private static final double msPerDay = 8.64E7d;
    private static final double msPerHour = 3600000.0d;
    private static final double msPerMinute = 60000.0d;
    private static final double msPerSecond = 1000.0d;
    static final long serialVersionUID = -8307438915861678966L;
    private static TimeZone thisTimeZone;
    private static DateFormat timeZoneFormatter;
    private double date;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        isoFormat = simpleDateFormat;
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
        simpleDateFormat.setLenient(false);
    }

    private NativeDate() {
        if (thisTimeZone == null) {
            thisTimeZone = TimeZone.getDefault();
            LocalTZA = r0.getRawOffset();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int DateFromTime(double r3) {
        /*
            int r0 = YearFromTime(r3)
            double r3 = Day(r3)
            double r1 = (double) r0
            double r1 = DayFromYear(r1)
            double r3 = r3 - r1
            int r3 = (int) r3
            int r4 = r3 + (-59)
            if (r4 >= 0) goto L1d
            r0 = -28
            if (r4 >= r0) goto L1a
            int r3 = r3 + 1
            return r3
        L1a:
            int r3 = r3 + (-30)
            return r3
        L1d:
            boolean r0 = IsLeapYear(r0)
            if (r0 == 0) goto L2a
            if (r4 != 0) goto L28
            r3 = 29
            return r3
        L28:
            int r4 = r3 + (-60)
        L2a:
            int r3 = r4 / 30
            r0 = 30
            r1 = 31
            switch(r3) {
                case 0: goto L5d;
                case 1: goto L55;
                case 2: goto L52;
                case 3: goto L4f;
                case 4: goto L4c;
                case 5: goto L49;
                case 6: goto L46;
                case 7: goto L43;
                case 8: goto L3e;
                case 9: goto L3b;
                case 10: goto L38;
                default: goto L33;
            }
        L33:
            java.lang.RuntimeException r3 = org.mozilla.javascript.Kit.codeBug()
            throw r3
        L38:
            int r4 = r4 + (-274)
            return r4
        L3b:
            r1 = 275(0x113, float:3.85E-43)
            goto L56
        L3e:
            r3 = 245(0xf5, float:3.43E-43)
        L40:
            r0 = r1
            r1 = r3
            goto L56
        L43:
            r1 = 214(0xd6, float:3.0E-43)
            goto L56
        L46:
            r3 = 184(0xb8, float:2.58E-43)
            goto L40
        L49:
            r3 = 153(0x99, float:2.14E-43)
            goto L40
        L4c:
            r1 = 122(0x7a, float:1.71E-43)
            goto L56
        L4f:
            r3 = 92
            goto L40
        L52:
            r1 = 61
            goto L56
        L55:
            r0 = r1
        L56:
            int r4 = r4 - r1
            if (r4 >= 0) goto L5a
            int r4 = r4 + r0
        L5a:
            int r4 = r4 + 1
            return r4
        L5d:
            int r4 = r4 + 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeDate.DateFromTime(double):int");
    }

    private static double Day(double d11) {
        return Math.floor(d11 / msPerDay);
    }

    private static double DayFromMonth(int i11, int i12) {
        int i13;
        int i14;
        int i15 = i11 * 30;
        if (i11 >= 7) {
            i14 = i11 / 2;
        } else {
            if (i11 < 2) {
                i13 = i15 + i11;
                if (i11 >= 2 && IsLeapYear(i12)) {
                    i13++;
                }
                return i13;
            }
            i14 = (i11 - 1) / 2;
        }
        i13 = i15 + (i14 - 1);
        if (i11 >= 2) {
            i13++;
        }
        return i13;
    }

    private static double DayFromYear(double d11) {
        return ((((d11 - 1970.0d) * 365.0d) + Math.floor((d11 - 1969.0d) / 4.0d)) - Math.floor((d11 - 1901.0d) / 100.0d)) + Math.floor((d11 - 1601.0d) / 400.0d);
    }

    private static double DaylightSavingTA(double d11) {
        if (d11 < 0.0d) {
            d11 = MakeDate(MakeDay(EquivalentYear(YearFromTime(d11)), MonthFromTime(d11), DateFromTime(d11)), TimeWithinDay(d11));
        }
        if (thisTimeZone.inDaylightTime(new Date((long) d11))) {
            return msPerHour;
        }
        return 0.0d;
    }

    private static int EquivalentYear(int i11) {
        int DayFromYear = (((int) DayFromYear(i11)) + 4) % 7;
        if (DayFromYear < 0) {
            DayFromYear += 7;
        }
        if (IsLeapYear(i11)) {
            switch (DayFromYear) {
                case 0:
                    return 1984;
                case 1:
                    return 1996;
                case 2:
                    return 1980;
                case 3:
                    return 1992;
                case 4:
                    return 1976;
                case 5:
                    return 1988;
                case 6:
                    return 1972;
            }
        }
        switch (DayFromYear) {
            case 0:
                return 1978;
            case 1:
                return 1973;
            case 2:
                return 1985;
            case 3:
                return 1986;
            case 4:
                return 1981;
            case 5:
                return 1971;
            case 6:
                return 1977;
        }
        throw Kit.codeBug();
    }

    private static int HourFromTime(double d11) {
        double floor = Math.floor(d11 / msPerHour) % HoursPerDay;
        if (floor < 0.0d) {
            floor += HoursPerDay;
        }
        return (int) floor;
    }

    private static boolean IsLeapYear(int i11) {
        if (i11 % 4 == 0) {
            return i11 % 100 != 0 || i11 % 400 == 0;
        }
        return false;
    }

    private static double LocalTime(double d11) {
        return LocalTZA + d11 + DaylightSavingTA(d11);
    }

    private static double MakeDate(double d11, double d12) {
        return (d11 * msPerDay) + d12;
    }

    private static double MakeDay(double d11, double d12, double d13) {
        double floor = d11 + Math.floor(d12 / 12.0d);
        double d14 = d12 % 12.0d;
        if (d14 < 0.0d) {
            d14 += 12.0d;
        }
        return ((Math.floor(TimeFromYear(floor) / msPerDay) + DayFromMonth((int) d14, (int) floor)) + d13) - 1.0d;
    }

    private static double MakeTime(double d11, double d12, double d13, double d14) {
        return (((((d11 * 60.0d) + d12) * 60.0d) + d13) * msPerSecond) + d14;
    }

    private static int MinFromTime(double d11) {
        double floor = Math.floor(d11 / msPerMinute) % 60.0d;
        if (floor < 0.0d) {
            floor += 60.0d;
        }
        return (int) floor;
    }

    private static int MonthFromTime(double d11) {
        int i11;
        int YearFromTime = YearFromTime(d11);
        int Day = (int) (Day(d11) - DayFromYear(YearFromTime));
        int i12 = Day - 59;
        if (i12 < 0) {
            return i12 < -28 ? 0 : 1;
        }
        if (IsLeapYear(YearFromTime)) {
            if (i12 == 0) {
                return 1;
            }
            i12 = Day - 60;
        }
        int i13 = i12 / 30;
        switch (i13) {
            case 0:
                return 2;
            case 1:
                i11 = 31;
                break;
            case 2:
                i11 = 61;
                break;
            case 3:
                i11 = 92;
                break;
            case 4:
                i11 = 122;
                break;
            case 5:
                i11 = 153;
                break;
            case 6:
                i11 = 184;
                break;
            case 7:
                i11 = R.styleable.Theme_drawable_review_sound;
                break;
            case 8:
                i11 = R.styleable.Theme_drawable_walk_sound1;
                break;
            case 9:
                i11 = 275;
                break;
            case 10:
                return 11;
            default:
                throw Kit.codeBug();
        }
        return i12 >= i11 ? i13 + 2 : i13 + 1;
    }

    private static int SecFromTime(double d11) {
        double floor = Math.floor(d11 / msPerSecond) % 60.0d;
        if (floor < 0.0d) {
            floor += 60.0d;
        }
        return (int) floor;
    }

    private static double TimeClip(double d11) {
        return (d11 != d11 || d11 == Double.POSITIVE_INFINITY || d11 == Double.NEGATIVE_INFINITY || Math.abs(d11) > HalfTimeDomain) ? ScriptRuntime.NaN : d11 > 0.0d ? Math.floor(d11 + 0.0d) : Math.ceil(d11 + 0.0d);
    }

    private static double TimeFromYear(double d11) {
        return DayFromYear(d11) * msPerDay;
    }

    private static double TimeWithinDay(double d11) {
        double d12 = d11 % msPerDay;
        return d12 < 0.0d ? d12 + msPerDay : d12;
    }

    private static int WeekDay(double d11) {
        double Day = (Day(d11) + 4.0d) % 7.0d;
        if (Day < 0.0d) {
            Day += 7.0d;
        }
        return (int) Day;
    }

    private static int YearFromTime(double d11) {
        double d12 = d11 / msPerDay;
        int floor = ((int) Math.floor(d12 / 366.0d)) + 1970;
        int floor2 = ((int) Math.floor(d12 / 365.0d)) + 1970;
        if (floor2 >= floor) {
            floor = floor2;
            floor2 = floor;
        }
        while (floor > floor2) {
            int i11 = (floor + floor2) / 2;
            if (TimeFromYear(i11) > d11) {
                floor = i11 - 1;
            } else {
                floor2 = i11 + 1;
                if (TimeFromYear(floor2) > d11) {
                    return i11;
                }
            }
        }
        return floor2;
    }

    private static void append0PaddedUint(StringBuffer stringBuffer, int i11, int i12) {
        int i13;
        if (i11 < 0) {
            Kit.codeBug();
        }
        int i14 = i12 - 1;
        if (i11 >= 10) {
            i13 = 1000000000;
            if (i11 < 1000000000) {
                i13 = 1;
                while (true) {
                    int i15 = i13 * 10;
                    if (i11 < i15) {
                        break;
                    }
                    i14--;
                    i13 = i15;
                }
            } else {
                i14 = i12 - 10;
            }
        } else {
            i13 = 1;
        }
        while (i14 > 0) {
            stringBuffer.append('0');
            i14--;
        }
        while (i13 != 1) {
            stringBuffer.append((char) ((i11 / i13) + 48));
            i11 %= i13;
            i13 /= 10;
        }
        stringBuffer.append((char) (i11 + 48));
    }

    private static void appendMonthName(StringBuffer stringBuffer, int i11) {
        int i12 = i11 * 3;
        for (int i13 = 0; i13 != 3; i13++) {
            stringBuffer.append("JanFebMarAprMayJunJulAugSepOctNovDec".charAt(i12 + i13));
        }
    }

    private static void appendWeekDayName(StringBuffer stringBuffer, int i11) {
        int i12 = i11 * 3;
        for (int i13 = 0; i13 != 3; i13++) {
            stringBuffer.append("SunMonTueWedThuFriSat".charAt(i12 + i13));
        }
    }

    private static String date_format(double d11, int i11) {
        StringBuffer stringBuffer = new StringBuffer(60);
        double LocalTime = LocalTime(d11);
        if (i11 != 3) {
            appendWeekDayName(stringBuffer, WeekDay(LocalTime));
            stringBuffer.append(' ');
            appendMonthName(stringBuffer, MonthFromTime(LocalTime));
            stringBuffer.append(' ');
            append0PaddedUint(stringBuffer, DateFromTime(LocalTime), 2);
            stringBuffer.append(' ');
            int YearFromTime = YearFromTime(LocalTime);
            if (YearFromTime < 0) {
                stringBuffer.append('-');
                YearFromTime = -YearFromTime;
            }
            append0PaddedUint(stringBuffer, YearFromTime, 4);
            if (i11 != 4) {
                stringBuffer.append(' ');
            }
        }
        if (i11 != 4) {
            append0PaddedUint(stringBuffer, HourFromTime(LocalTime), 2);
            stringBuffer.append(':');
            append0PaddedUint(stringBuffer, MinFromTime(LocalTime), 2);
            stringBuffer.append(':');
            append0PaddedUint(stringBuffer, SecFromTime(LocalTime), 2);
            int floor = (int) Math.floor((LocalTZA + DaylightSavingTA(d11)) / msPerMinute);
            int i12 = ((floor / 60) * 100) + (floor % 60);
            if (i12 > 0) {
                stringBuffer.append(" GMT+");
            } else {
                stringBuffer.append(" GMT-");
                i12 = -i12;
            }
            append0PaddedUint(stringBuffer, i12, 4);
            if (timeZoneFormatter == null) {
                timeZoneFormatter = new SimpleDateFormat("zzz");
            }
            if (d11 < 0.0d) {
                d11 = MakeDate(MakeDay(EquivalentYear(YearFromTime(LocalTime)), MonthFromTime(d11), DateFromTime(d11)), TimeWithinDay(d11));
            }
            stringBuffer.append(" (");
            Date date = new Date((long) d11);
            synchronized (timeZoneFormatter) {
                stringBuffer.append(timeZoneFormatter.format(date));
            }
            stringBuffer.append(')');
        }
        return stringBuffer.toString();
    }

    private static double date_msecFromArgs(Object[] objArr) {
        double[] dArr = new double[7];
        for (int i11 = 0; i11 < 7; i11++) {
            if (i11 < objArr.length) {
                double number = ScriptRuntime.toNumber(objArr[i11]);
                if (number != number || Double.isInfinite(number)) {
                    return ScriptRuntime.NaN;
                }
                dArr[i11] = ScriptRuntime.toInteger(objArr[i11]);
            } else if (i11 == 2) {
                dArr[i11] = 1.0d;
            } else {
                dArr[i11] = 0.0d;
            }
        }
        double d11 = dArr[0];
        if (d11 >= 0.0d && d11 <= 99.0d) {
            dArr[0] = d11 + 1900.0d;
        }
        return date_msecFromDate(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5], dArr[6]);
    }

    private static double date_msecFromDate(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return MakeDate(MakeDay(d11, d12, d13), MakeTime(d14, d15, d16, d17));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x016a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double date_parseString(java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeDate.date_parseString(java.lang.String):double");
    }

    public static void init(Scriptable scriptable, boolean z11) {
        NativeDate nativeDate = new NativeDate();
        nativeDate.date = ScriptRuntime.NaN;
        nativeDate.exportAsJSClass(47, scriptable, z11);
    }

    private static double internalUTC(double d11) {
        double d12 = LocalTZA;
        return (d11 - d12) - DaylightSavingTA(d11 - d12);
    }

    private static Object jsConstructor(Object[] objArr) {
        NativeDate nativeDate = new NativeDate();
        if (objArr.length == 0) {
            nativeDate.date = now();
            return nativeDate;
        }
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof Scriptable) {
                obj = ((Scriptable) obj).getDefaultValue(null);
            }
            nativeDate.date = TimeClip(obj instanceof CharSequence ? date_parseString(obj.toString()) : ScriptRuntime.toNumber(obj));
            return nativeDate;
        }
        double date_msecFromArgs = date_msecFromArgs(objArr);
        if (!Double.isNaN(date_msecFromArgs) && !Double.isInfinite(date_msecFromArgs)) {
            date_msecFromArgs = TimeClip(internalUTC(date_msecFromArgs));
        }
        nativeDate.date = date_msecFromArgs;
        return nativeDate;
    }

    private static double jsStaticFunction_UTC(Object[] objArr) {
        return TimeClip(date_msecFromArgs(objArr));
    }

    private static String js_toUTCString(double d11) {
        StringBuffer stringBuffer = new StringBuffer(60);
        appendWeekDayName(stringBuffer, WeekDay(d11));
        stringBuffer.append(j2.O);
        append0PaddedUint(stringBuffer, DateFromTime(d11), 2);
        stringBuffer.append(' ');
        appendMonthName(stringBuffer, MonthFromTime(d11));
        stringBuffer.append(' ');
        int YearFromTime = YearFromTime(d11);
        if (YearFromTime < 0) {
            stringBuffer.append('-');
            YearFromTime = -YearFromTime;
        }
        append0PaddedUint(stringBuffer, YearFromTime, 4);
        stringBuffer.append(' ');
        append0PaddedUint(stringBuffer, HourFromTime(d11), 2);
        stringBuffer.append(':');
        append0PaddedUint(stringBuffer, MinFromTime(d11), 2);
        stringBuffer.append(':');
        append0PaddedUint(stringBuffer, SecFromTime(d11), 2);
        stringBuffer.append(" GMT");
        return stringBuffer.toString();
    }

    private static double makeDate(double d11, Object[] objArr, int i11) {
        boolean z11;
        int i12;
        double LocalTime;
        double YearFromTime;
        double MonthFromTime;
        Object[] objArr2 = objArr;
        int i13 = 0;
        switch (i11) {
            case 39:
                z11 = true;
                i12 = 1;
                break;
            case 40:
                z11 = false;
                i12 = 1;
                break;
            case 41:
                z11 = true;
                i12 = 2;
                break;
            case 42:
                z11 = false;
                i12 = 2;
                break;
            case 43:
                z11 = true;
                i12 = 3;
                break;
            case 44:
                z11 = false;
                i12 = 3;
                break;
            default:
                Kit.codeBug();
                i12 = 0;
                z11 = true;
                break;
        }
        double[] dArr = new double[3];
        if (objArr2.length == 0) {
            objArr2 = ScriptRuntime.padArguments(objArr2, 1);
        }
        for (int i14 = 0; i14 < objArr2.length && i14 < i12; i14++) {
            double number = ScriptRuntime.toNumber(objArr2[i14]);
            dArr[i14] = number;
            if (number != number || Double.isInfinite(number)) {
                return ScriptRuntime.NaN;
            }
            dArr[i14] = ScriptRuntime.toInteger(dArr[i14]);
        }
        if (d11 == d11) {
            LocalTime = z11 ? LocalTime(d11) : d11;
        } else {
            if (objArr2.length < 3) {
                return ScriptRuntime.NaN;
            }
            LocalTime = 0.0d;
        }
        int length = objArr2.length;
        if (i12 < 3 || length <= 0) {
            YearFromTime = YearFromTime(LocalTime);
        } else {
            YearFromTime = dArr[0];
            i13 = 1;
        }
        if (i12 < 2 || i13 >= length) {
            MonthFromTime = MonthFromTime(LocalTime);
        } else {
            MonthFromTime = dArr[i13];
            i13++;
        }
        double MakeDate = MakeDate(MakeDay(YearFromTime, MonthFromTime, (i12 < 1 || i13 >= length) ? DateFromTime(LocalTime) : dArr[i13]), TimeWithinDay(LocalTime));
        if (z11) {
            MakeDate = internalUTC(MakeDate);
        }
        return TimeClip(MakeDate);
    }

    private static double makeTime(double d11, Object[] objArr, int i11) {
        boolean z11;
        int i12;
        double HourFromTime;
        double MinFromTime;
        double SecFromTime;
        Object[] objArr2 = objArr;
        int i13 = 0;
        switch (i11) {
            case 31:
                z11 = true;
                i12 = 1;
                break;
            case 32:
                z11 = false;
                i12 = 1;
                break;
            case 33:
                z11 = true;
                i12 = 2;
                break;
            case 34:
                z11 = false;
                i12 = 2;
                break;
            case 35:
                z11 = true;
                i12 = 3;
                break;
            case 36:
                z11 = false;
                i12 = 3;
                break;
            case 37:
                z11 = true;
                i12 = 4;
                break;
            case 38:
                z11 = false;
                i12 = 4;
                break;
            default:
                Kit.codeBug();
                i12 = 0;
                z11 = true;
                break;
        }
        double[] dArr = new double[4];
        if (d11 != d11) {
            return d11;
        }
        if (objArr2.length == 0) {
            objArr2 = ScriptRuntime.padArguments(objArr2, 1);
        }
        for (int i14 = 0; i14 < objArr2.length && i14 < i12; i14++) {
            double number = ScriptRuntime.toNumber(objArr2[i14]);
            dArr[i14] = number;
            if (number != number || Double.isInfinite(number)) {
                return ScriptRuntime.NaN;
            }
            dArr[i14] = ScriptRuntime.toInteger(dArr[i14]);
        }
        double LocalTime = z11 ? LocalTime(d11) : d11;
        int length = objArr2.length;
        if (i12 < 4 || length <= 0) {
            HourFromTime = HourFromTime(LocalTime);
        } else {
            HourFromTime = dArr[0];
            i13 = 1;
        }
        if (i12 < 3 || i13 >= length) {
            MinFromTime = MinFromTime(LocalTime);
        } else {
            MinFromTime = dArr[i13];
            i13++;
        }
        if (i12 < 2 || i13 >= length) {
            SecFromTime = SecFromTime(LocalTime);
        } else {
            SecFromTime = dArr[i13];
            i13++;
        }
        double MakeDate = MakeDate(Day(LocalTime), MakeTime(HourFromTime, MinFromTime, SecFromTime, (i12 < 1 || i13 >= length) ? msFromTime(LocalTime) : dArr[i13]));
        if (z11) {
            MakeDate = internalUTC(MakeDate);
        }
        return TimeClip(MakeDate);
    }

    private static int msFromTime(double d11) {
        double d12 = d11 % msPerSecond;
        if (d12 < 0.0d) {
            d12 += msPerSecond;
        }
        return (int) d12;
    }

    private static double now() {
        return System.currentTimeMillis();
    }

    private String toISOString() {
        String format;
        double d11 = this.date;
        if (d11 != d11) {
            throw ScriptRuntime.constructError("RangeError", ScriptRuntime.getMessage0("msg.invalid.date"));
        }
        DateFormat dateFormat = isoFormat;
        synchronized (dateFormat) {
            format = dateFormat.format(new Date((long) this.date));
        }
        return format;
    }

    private static String toLocale_helper(double d11, int i11) {
        DateFormat dateFormat;
        String format;
        if (i11 == 5) {
            if (localeDateTimeFormatter == null) {
                localeDateTimeFormatter = DateFormat.getDateTimeInstance(1, 1);
            }
            dateFormat = localeDateTimeFormatter;
        } else if (i11 == 6) {
            if (localeTimeFormatter == null) {
                localeTimeFormatter = DateFormat.getTimeInstance(1);
            }
            dateFormat = localeTimeFormatter;
        } else {
            if (i11 != 7) {
                throw new AssertionError();
            }
            if (localeDateFormatter == null) {
                localeDateFormatter = DateFormat.getDateInstance(1);
            }
            dateFormat = localeDateFormatter;
        }
        synchronized (dateFormat) {
            format = dateFormat.format(new Date((long) d11));
        }
        return format;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d11;
        if (!idFunctionObject.hasTag(DATE_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == -3) {
            return ScriptRuntime.wrapNumber(now());
        }
        if (methodId == -2) {
            return ScriptRuntime.wrapNumber(date_parseString(ScriptRuntime.toString(objArr, 0)));
        }
        if (methodId == -1) {
            return ScriptRuntime.wrapNumber(jsStaticFunction_UTC(objArr));
        }
        if (methodId == 1) {
            return scriptable2 != null ? date_format(now(), 2) : jsConstructor(objArr);
        }
        if (methodId == 47) {
            if (scriptable2 instanceof NativeDate) {
                return ((NativeDate) scriptable2).toISOString();
            }
            Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
            Object primitive = ScriptRuntime.toPrimitive(object, ScriptRuntime.NumberClass);
            if (primitive instanceof Number) {
                double doubleValue = ((Number) primitive).doubleValue();
                if (doubleValue != doubleValue || Double.isInfinite(doubleValue)) {
                    return null;
                }
            }
            Object obj = object.get("toISOString", object);
            if (obj == Scriptable.NOT_FOUND) {
                throw ScriptRuntime.typeError2("msg.function.not.found.in", "toISOString", ScriptRuntime.toString(object));
            }
            if (!(obj instanceof Callable)) {
                throw ScriptRuntime.typeError3("msg.isnt.function.in", "toISOString", ScriptRuntime.toString(object), ScriptRuntime.toString(obj));
            }
            Object call = ((Callable) obj).call(context, scriptable, object, ScriptRuntime.emptyArgs);
            if (ScriptRuntime.isPrimitive(call)) {
                return call;
            }
            throw ScriptRuntime.typeError1("msg.toisostring.must.return.primitive", ScriptRuntime.toString(call));
        }
        if (!(scriptable2 instanceof NativeDate)) {
            throw IdScriptableObject.incompatibleCallError(idFunctionObject);
        }
        NativeDate nativeDate = (NativeDate) scriptable2;
        double d12 = nativeDate.date;
        switch (methodId) {
            case 2:
            case 3:
            case 4:
                return d12 == d12 ? date_format(d12, methodId) : js_NaN_date_str;
            case 5:
            case 6:
            case 7:
                return d12 == d12 ? toLocale_helper(d12, methodId) : js_NaN_date_str;
            case 8:
                return d12 == d12 ? js_toUTCString(d12) : js_NaN_date_str;
            case 9:
                return "(new Date(" + ScriptRuntime.toString(d12) + a.f48058d;
            case 10:
            case 11:
                return ScriptRuntime.wrapNumber(d12);
            case 12:
            case 13:
            case 14:
                if (d12 == d12) {
                    if (methodId != 14) {
                        d12 = LocalTime(d12);
                    }
                    d12 = YearFromTime(d12);
                    if (methodId == 12 && (!context.hasFeature(1) || (1900.0d <= d12 && d12 < 2000.0d))) {
                        d12 -= 1900.0d;
                    }
                }
                return ScriptRuntime.wrapNumber(d12);
            case 15:
            case 16:
                if (d12 == d12) {
                    if (methodId == 15) {
                        d12 = LocalTime(d12);
                    }
                    d12 = MonthFromTime(d12);
                }
                return ScriptRuntime.wrapNumber(d12);
            case 17:
            case 18:
                if (d12 == d12) {
                    if (methodId == 17) {
                        d12 = LocalTime(d12);
                    }
                    d12 = DateFromTime(d12);
                }
                return ScriptRuntime.wrapNumber(d12);
            case 19:
            case 20:
                if (d12 == d12) {
                    if (methodId == 19) {
                        d12 = LocalTime(d12);
                    }
                    d12 = WeekDay(d12);
                }
                return ScriptRuntime.wrapNumber(d12);
            case 21:
            case 22:
                if (d12 == d12) {
                    if (methodId == 21) {
                        d12 = LocalTime(d12);
                    }
                    d12 = HourFromTime(d12);
                }
                return ScriptRuntime.wrapNumber(d12);
            case 23:
            case 24:
                if (d12 == d12) {
                    if (methodId == 23) {
                        d12 = LocalTime(d12);
                    }
                    d12 = MinFromTime(d12);
                }
                return ScriptRuntime.wrapNumber(d12);
            case 25:
            case 26:
                if (d12 == d12) {
                    if (methodId == 25) {
                        d12 = LocalTime(d12);
                    }
                    d12 = SecFromTime(d12);
                }
                return ScriptRuntime.wrapNumber(d12);
            case 27:
            case 28:
                if (d12 == d12) {
                    if (methodId == 27) {
                        d12 = LocalTime(d12);
                    }
                    d12 = msFromTime(d12);
                }
                return ScriptRuntime.wrapNumber(d12);
            case 29:
                if (d12 == d12) {
                    d12 = (d12 - LocalTime(d12)) / msPerMinute;
                }
                return ScriptRuntime.wrapNumber(d12);
            case 30:
                double TimeClip = TimeClip(ScriptRuntime.toNumber(objArr, 0));
                nativeDate.date = TimeClip;
                return ScriptRuntime.wrapNumber(TimeClip);
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                double makeTime = makeTime(d12, objArr, methodId);
                nativeDate.date = makeTime;
                return ScriptRuntime.wrapNumber(makeTime);
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                double makeDate = makeDate(d12, objArr, methodId);
                nativeDate.date = makeDate;
                return ScriptRuntime.wrapNumber(makeDate);
            case 45:
                double number = ScriptRuntime.toNumber(objArr, 0);
                if (number != number || Double.isInfinite(number)) {
                    d11 = ScriptRuntime.NaN;
                } else {
                    double LocalTime = d12 != d12 ? 0.0d : LocalTime(d12);
                    if (number >= 0.0d && number <= 99.0d) {
                        number += 1900.0d;
                    }
                    d11 = TimeClip(internalUTC(MakeDate(MakeDay(number, MonthFromTime(LocalTime), DateFromTime(LocalTime)), TimeWithinDay(LocalTime))));
                }
                nativeDate.date = d11;
                return ScriptRuntime.wrapNumber(d11);
            case 46:
                return nativeDate.toISOString();
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = DATE_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -3, "now", 0);
        addIdFunctionProperty(idFunctionObject, obj, -2, "parse", 1);
        addIdFunctionProperty(idFunctionObject, obj, -1, "UTC", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217 A[FALL_THROUGH] */
    @Override // org.mozilla.javascript.IdScriptableObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int findPrototypeId(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeDate.findPrototypeId(java.lang.String):int");
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Date";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        if (cls == null) {
            cls = ScriptRuntime.StringClass;
        }
        return super.getDefaultValue(cls);
    }

    public double getJSTimeValue() {
        return this.date;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 0;
        switch (i11) {
            case 1:
                str = "constructor";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 2:
                str = "toString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 3:
                str = "toTimeString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 4:
                str = "toDateString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 5:
                str = "toLocaleString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 6:
                str = "toLocaleTimeString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 7:
                str = "toLocaleDateString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 8:
                str = "toUTCString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 9:
                str = "toSource";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 10:
                str = "valueOf";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 11:
                str = "getTime";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 12:
                str = "getYear";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 13:
                str = "getFullYear";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 14:
                str = "getUTCFullYear";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 15:
                str = "getMonth";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 16:
                str = "getUTCMonth";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 17:
                str = "getDate";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 18:
                str = "getUTCDate";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 19:
                str = "getDay";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 20:
                str = "getUTCDay";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 21:
                str = "getHours";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 22:
                str = "getUTCHours";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 23:
                str = "getMinutes";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 24:
                str = "getUTCMinutes";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 25:
                str = "getSeconds";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 26:
                str = "getUTCSeconds";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 27:
                str = "getMilliseconds";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 28:
                str = "getUTCMilliseconds";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 29:
                str = "getTimezoneOffset";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 30:
                str = "setTime";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 31:
                str = "setMilliseconds";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 32:
                str = "setUTCMilliseconds";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 33:
                str = "setSeconds";
                i12 = 2;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 34:
                str = "setUTCSeconds";
                i12 = 2;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 35:
                str = "setMinutes";
                i12 = 3;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 36:
                str = "setUTCMinutes";
                i12 = 3;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 37:
                str2 = "setHours";
                i12 = 4;
                str = str2;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 38:
                str2 = "setUTCHours";
                i12 = 4;
                str = str2;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 39:
                str = "setDate";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 40:
                str = "setUTCDate";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 41:
                str = "setMonth";
                i12 = 2;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 42:
                str = "setUTCMonth";
                i12 = 2;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 43:
                str = "setFullYear";
                i12 = 3;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 44:
                str = "setUTCFullYear";
                i12 = 3;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 45:
                str = "setYear";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 46:
                str = "toISOString";
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            case 47:
                str = "toJSON";
                i12 = 1;
                initPrototypeMethod(DATE_TAG, i11, str, i12);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
    }
}

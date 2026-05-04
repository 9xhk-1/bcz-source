package bg;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {
    public static int a(Calendar c12, Calendar c22) {
        int i11;
        int i12;
        if (c12 == null && c22 == null) {
            return 0;
        }
        if (c12 == null) {
            return 1;
        }
        if (c22 == null) {
            return -1;
        }
        if (c12.get(1) - c22.get(1) == 0) {
            i11 = c12.get(2);
            i12 = c22.get(2);
        } else {
            i11 = c12.get(1);
            i12 = c22.get(1);
        }
        return i11 - i12;
    }

    public static int b(int rawWeekIndex, Calendar calendar) {
        if (1 == calendar.getFirstDayOfWeek()) {
            return rawWeekIndex;
        }
        if (1 == rawWeekIndex) {
            return 7;
        }
        return rawWeekIndex - 1;
    }

    public static String c(Calendar calendar, Locale locale) {
        return new DateFormatSymbols(locale).getMonths()[calendar.get(2)];
    }

    public static String d(Calendar calendar) {
        return String.valueOf(calendar.get(1));
    }

    public static boolean e(Calendar c12, Calendar c22) {
        return c12 != null && c22 != null && c12.get(0) == c22.get(0) && c12.get(1) == c22.get(1) && c12.get(6) == c22.get(6);
    }

    public static boolean f(Calendar c12, Calendar c22) {
        return c12 != null && c22 != null && c12.get(0) == c22.get(0) && c12.get(1) == c22.get(1) && c12.get(2) == c22.get(2);
    }

    public static boolean g(Calendar calendar) {
        int i11 = calendar.get(7);
        return 7 == i11 || 1 == i11;
    }
}

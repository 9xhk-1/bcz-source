package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i {
    public static String a(int i11) {
        if (i11 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i11 == 1) {
            return "MMMM d, y";
        }
        if (i11 == 2) {
            return "MMM d, y";
        }
        if (i11 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
    }

    public static String b(int i11) {
        if (i11 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i11 == 1) {
            return "MMMM d, yyyy";
        }
        if (i11 == 2) {
            return "MMM d, yyyy";
        }
        if (i11 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
    }

    public static String c(int i11) {
        if (i11 == 0 || i11 == 1) {
            return "h:mm:ss a z";
        }
        if (i11 == 2) {
            return "h:mm:ss a";
        }
        if (i11 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
    }

    public static DateFormat d(int i11) {
        return new SimpleDateFormat(a(i11), Locale.US);
    }

    public static DateFormat e(int i11, int i12) {
        return new SimpleDateFormat(b(i11) + " " + c(i12), Locale.US);
    }
}

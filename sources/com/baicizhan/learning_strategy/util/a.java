package com.baicizhan.learning_strategy.util;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    public static long a() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static boolean b(Date date) {
        if (date == null) {
            return false;
        }
        return date.getTime() >= a();
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h {
    public static Pair<String, String> a(@Nullable Long l11, @Nullable Long l12) {
        return b(l11, l12, null);
    }

    public static Pair<String, String> b(@Nullable Long l11, @Nullable Long l12, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l11 == null && l12 == null) {
            return Pair.create(null, null);
        }
        if (l11 == null) {
            return Pair.create(null, d(l12.longValue(), simpleDateFormat));
        }
        if (l12 == null) {
            return Pair.create(d(l11.longValue(), simpleDateFormat), null);
        }
        Calendar v11 = v.v();
        Calendar x11 = v.x();
        x11.setTimeInMillis(l11.longValue());
        Calendar x12 = v.x();
        x12.setTimeInMillis(l12.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l11.longValue())), simpleDateFormat.format(new Date(l12.longValue())));
        }
        return x11.get(1) == x12.get(1) ? x11.get(1) == v11.get(1) ? Pair.create(g(l11.longValue(), Locale.getDefault()), g(l12.longValue(), Locale.getDefault())) : Pair.create(g(l11.longValue(), Locale.getDefault()), n(l12.longValue(), Locale.getDefault())) : Pair.create(n(l11.longValue(), Locale.getDefault()), n(l12.longValue(), Locale.getDefault()));
    }

    public static String c(long j11) {
        return d(j11, null);
    }

    public static String d(long j11, @Nullable SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j11)) : q(j11) ? f(j11) : m(j11);
    }

    public static String e(Context context, long j11, boolean z11, boolean z12, boolean z13) {
        String j12 = j(j11);
        if (z11) {
            j12 = String.format(context.getString(R.string.mtrl_picker_today_description), j12);
        }
        return z12 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), j12) : z13 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), j12) : j12;
    }

    public static String f(long j11) {
        return g(j11, Locale.getDefault());
    }

    public static String g(long j11, Locale locale) {
        return v.c(locale).format(new Date(j11));
    }

    public static String h(long j11) {
        return i(j11, Locale.getDefault());
    }

    public static String i(long j11, Locale locale) {
        return v.p(locale).format(new Date(j11));
    }

    public static String j(long j11) {
        return q(j11) ? h(j11) : o(j11);
    }

    public static String k(Context context, int i11) {
        return v.v().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
    }

    public static String l(long j11) {
        return v.A(Locale.getDefault()).format(new Date(j11));
    }

    public static String m(long j11) {
        return n(j11, Locale.getDefault());
    }

    public static String n(long j11, Locale locale) {
        return v.z(locale).format(new Date(j11));
    }

    public static String o(long j11) {
        return p(j11, Locale.getDefault());
    }

    public static String p(long j11, Locale locale) {
        return v.B(locale).format(new Date(j11));
    }

    public static boolean q(long j11) {
        Calendar v11 = v.v();
        Calendar x11 = v.x();
        x11.setTimeInMillis(j11);
        return v11.get(1) == x11.get(1);
    }
}

package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f31297c = new u(null, null);

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f31298a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final TimeZone f31299b;

    public u(@Nullable Long l11, @Nullable TimeZone timeZone) {
        this.f31298a = l11;
        this.f31299b = timeZone;
    }

    public static u a(long j11) {
        return new u(Long.valueOf(j11), null);
    }

    public static u b(long j11, @Nullable TimeZone timeZone) {
        return new u(Long.valueOf(j11), timeZone);
    }

    public static u e() {
        return f31297c;
    }

    public Calendar c() {
        return d(this.f31299b);
    }

    public Calendar d(@Nullable TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l11 = this.f31298a;
        if (l11 != null) {
            calendar.setTimeInMillis(l11.longValue());
        }
        return calendar;
    }
}

package r90;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends v<Calendar> implements n<SimpleDateFormat> {

    /* renamed from: c, reason: collision with root package name */
    public final i f83853c;

    public e(TimeZone timeZone, Locale locale, Calendar calendar, String str, String... strArr) {
        super(calendar, str);
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Date formats", strArr);
        this.f83853c = new i(locale, strArr);
    }

    @Override // r90.v
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Calendar l(String str) {
        Date b11 = this.f83853c.b(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(b11);
        calendar.setTimeZone(this.f83853c.u());
        return calendar;
    }

    @Override // r90.n
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public SimpleDateFormat[] c() {
        return this.f83853c.c();
    }

    @Override // r90.v
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public String a(Calendar calendar) {
        return calendar == null ? super.a(null) : this.f83853c.a(calendar.getTime());
    }

    public e(Locale locale, Calendar calendar, String str, String... strArr) {
        super(calendar, str);
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Date formats", strArr);
        this.f83853c = new i(locale, strArr);
    }

    public e(Calendar calendar, String str, String... strArr) {
        super(calendar, str);
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Date formats", strArr);
        this.f83853c = new i(Locale.getDefault(), strArr);
    }

    public e(Locale locale, String... strArr) {
        this(locale, null, null, strArr);
    }

    public e(String... strArr) {
        this(Locale.getDefault(), null, null, strArr);
    }
}

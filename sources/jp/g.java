package jp;

import com.google.zxing.client.result.ParsedResultType;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g extends q {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f64531m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: n, reason: collision with root package name */
    public static final long[] f64532n = {604800000, 86400000, 3600000, 60000, 1000};

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f64533o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b, reason: collision with root package name */
    public final String f64534b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64535c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f64536d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64537e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f64538f;

    /* renamed from: g, reason: collision with root package name */
    public final String f64539g;

    /* renamed from: h, reason: collision with root package name */
    public final String f64540h;

    /* renamed from: i, reason: collision with root package name */
    public final String[] f64541i;

    /* renamed from: j, reason: collision with root package name */
    public final String f64542j;

    /* renamed from: k, reason: collision with root package name */
    public final double f64543k;

    /* renamed from: l, reason: collision with root package name */
    public final double f64544l;

    public g(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d11, double d12) {
        super(ParsedResultType.CALENDAR);
        this.f64534b = str;
        try {
            long s11 = s(str2);
            this.f64535c = s11;
            if (str3 == null) {
                long u11 = u(str4);
                this.f64537e = u11 < 0 ? -1L : s11 + u11;
            } else {
                try {
                    this.f64537e = s(str3);
                } catch (ParseException e11) {
                    throw new IllegalArgumentException(e11.toString());
                }
            }
            int length = str2.length();
            boolean z11 = false;
            this.f64536d = length == 8;
            if (str3 != null && str3.length() == 8) {
                z11 = true;
            }
            this.f64538f = z11;
            this.f64539g = str5;
            this.f64540h = str6;
            this.f64541i = strArr;
            this.f64542j = str7;
            this.f64543k = d11;
            this.f64544l = d12;
        } catch (ParseException e12) {
            throw new IllegalArgumentException(e12.toString());
        }
    }

    public static String e(boolean z11, long j11) {
        if (j11 < 0) {
            return null;
        }
        return (z11 ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j11));
    }

    public static long s(String str) throws ParseException {
        if (!f64533o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        }
        if (str.length() != 16 || str.charAt(15) != 'Z') {
            return t(str);
        }
        long t11 = t(str.substring(0, 15));
        long j11 = t11 + r5.get(15);
        new GregorianCalendar().setTime(new Date(j11));
        return j11 + r5.get(16);
    }

    public static long t(String str) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
    }

    public static long u(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = f64531m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j11 = 0;
        int i11 = 0;
        while (true) {
            long[] jArr = f64532n;
            if (i11 >= jArr.length) {
                return j11;
            }
            int i12 = i11 + 1;
            if (matcher.group(i12) != null) {
                j11 += jArr[i11] * Integer.parseInt(r5);
            }
            i11 = i12;
        }
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.c(this.f64534b, sb2);
        q.c(e(this.f64536d, this.f64535c), sb2);
        q.c(e(this.f64538f, this.f64537e), sb2);
        q.c(this.f64539g, sb2);
        q.c(this.f64540h, sb2);
        q.d(this.f64541i, sb2);
        q.c(this.f64542j, sb2);
        return sb2.toString();
    }

    public String[] f() {
        return this.f64541i;
    }

    public String g() {
        return this.f64542j;
    }

    @Deprecated
    public Date h() {
        if (this.f64537e < 0) {
            return null;
        }
        return new Date(this.f64537e);
    }

    public long i() {
        return this.f64537e;
    }

    public double j() {
        return this.f64543k;
    }

    public String k() {
        return this.f64539g;
    }

    public double l() {
        return this.f64544l;
    }

    public String m() {
        return this.f64540h;
    }

    @Deprecated
    public Date n() {
        return new Date(this.f64535c);
    }

    public long o() {
        return this.f64535c;
    }

    public String p() {
        return this.f64534b;
    }

    public boolean q() {
        return this.f64538f;
    }

    public boolean r() {
        return this.f64536d;
    }
}

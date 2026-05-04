package a60;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1997a = 253402300799999L;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f1998b = new a();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String[] f1999c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final DateFormat[] f2000d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(u50.f.f91851f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {c80.h.f8346d, "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f1999c = strArr;
        f2000d = new DateFormat[strArr.length];
    }

    @l
    public static final Date a(@m80.k String str) {
        g0.p(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f1998b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f1999c;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    DateFormat[] dateFormatArr = f2000d;
                    DateFormat dateFormat = dateFormatArr[i11];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f1999c[i11], Locale.US);
                        dateFormat.setTimeZone(u50.f.f91851f);
                        dateFormatArr[i11] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                g2 g2Var = g2.f100423a;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m80.k
    public static final String b(@m80.k Date date) {
        g0.p(date, "<this>");
        String format = f1998b.get().format(date);
        g0.o(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}

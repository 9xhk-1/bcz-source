package c80;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class h {

    /* renamed from: d, reason: collision with root package name */
    public static final String f8346d = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f8347e = TimeZone.getTimeZone("GMT");

    /* renamed from: a, reason: collision with root package name */
    public final DateFormat f8348a;

    /* renamed from: b, reason: collision with root package name */
    public long f8349b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f8350c = null;

    public h() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f8346d, Locale.US);
        this.f8348a = simpleDateFormat;
        simpleDateFormat.setTimeZone(f8347e);
    }

    public synchronized String a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f8349b > 1000) {
                this.f8350c = this.f8348a.format(new Date(currentTimeMillis));
                this.f8349b = currentTimeMillis;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8350c;
    }
}

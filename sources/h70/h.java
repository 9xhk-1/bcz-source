package h70;

import java.util.Date;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f58763a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58764b;

    public h(Throwable th2, Date date) {
        this.f58763a = th2;
        if (date != null) {
            this.f58764b = date.getTime();
        } else {
            this.f58764b = 0L;
        }
    }

    public Throwable a() {
        return this.f58763a;
    }

    public Date b() {
        return new Date(this.f58764b);
    }

    public String toString() {
        return new Date(this.f58764b) + " " + this.f58763a;
    }

    public h(Exception exc) {
        this(exc, new Date());
    }
}

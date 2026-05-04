package gi;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static long f53870a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final long f53871b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final long f53872c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final long f53873d = 4;

    public static void a(Context context, long flag) {
        synchronized (y.class) {
            c(context);
            long j11 = flag | f53870a;
            f53870a = j11;
            i9.f.m(context, i9.f.f60372g, j11);
        }
    }

    public static boolean b(Context context, long flag) {
        boolean z11;
        synchronized (y.class) {
            c(context);
            z11 = (f53870a & flag) == flag;
        }
        return z11;
    }

    public static void c(Context context) {
        if (f53870a == -1) {
            f53870a = i9.f.f(context, i9.f.f60372g);
        }
    }
}

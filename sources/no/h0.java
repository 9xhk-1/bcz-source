package no;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@i
/* loaded from: classes7.dex */
public abstract class h0 extends Number {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<int[]> f75291d = new ThreadLocal<>();

    /* renamed from: e, reason: collision with root package name */
    public static final Random f75292e = new Random();

    /* renamed from: f, reason: collision with root package name */
    public static final int f75293f = Runtime.getRuntime().availableProcessors();

    /* renamed from: g, reason: collision with root package name */
    public static final Unsafe f75294g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f75295h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f75296i;

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public volatile transient b[] f75297a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient long f75298b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient int f75299c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: p, reason: collision with root package name */
        public static final Unsafe f75300p;

        /* renamed from: q, reason: collision with root package name */
        public static final long f75301q;

        /* renamed from: a, reason: collision with root package name */
        public volatile long f75302a;

        /* renamed from: b, reason: collision with root package name */
        public volatile long f75303b;

        /* renamed from: c, reason: collision with root package name */
        public volatile long f75304c;

        /* renamed from: d, reason: collision with root package name */
        public volatile long f75305d;

        /* renamed from: e, reason: collision with root package name */
        public volatile long f75306e;

        /* renamed from: f, reason: collision with root package name */
        public volatile long f75307f;

        /* renamed from: g, reason: collision with root package name */
        public volatile long f75308g;

        /* renamed from: h, reason: collision with root package name */
        public volatile long f75309h;

        /* renamed from: i, reason: collision with root package name */
        public volatile long f75310i;

        /* renamed from: j, reason: collision with root package name */
        public volatile long f75311j;

        /* renamed from: k, reason: collision with root package name */
        public volatile long f75312k;

        /* renamed from: l, reason: collision with root package name */
        public volatile long f75313l;

        /* renamed from: m, reason: collision with root package name */
        public volatile long f75314m;

        /* renamed from: n, reason: collision with root package name */
        public volatile long f75315n;

        /* renamed from: o, reason: collision with root package name */
        public volatile long f75316o;

        static {
            try {
                Unsafe e11 = h0.e();
                f75300p = e11;
                f75301q = e11.objectFieldOffset(b.class.getDeclaredField(CmcdData.STREAMING_FORMAT_HLS));
            } catch (Exception e12) {
                throw new Error(e12);
            }
        }

        public b(long x11) {
            this.f75309h = x11;
        }

        public final boolean a(long cmp, long val) {
            return f75300p.compareAndSwapLong(this, f75301q, cmp, val);
        }
    }

    static {
        try {
            Unsafe e11 = e();
            f75294g = e11;
            f75295h = e11.objectFieldOffset(h0.class.getDeclaredField(yr.e.f100279a));
            f75296i = e11.objectFieldOffset(h0.class.getDeclaredField("c"));
        } catch (Exception e12) {
            throw new Error(e12);
        }
    }

    public static Unsafe e() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    public final boolean b(long cmp, long val) {
        return f75294g.compareAndSwapLong(this, f75295h, cmp, val);
    }

    public final boolean c() {
        return f75294g.compareAndSwapInt(this, f75296i, 0, 1);
    }

    public abstract long d(long currentValue, long newValue);

    public final void f(long initialValue) {
        b[] bVarArr = this.f75297a;
        this.f75298b = initialValue;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f75309h = initialValue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r17, @javax.annotation.CheckForNull int[] r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.h0.g(long, int[], boolean):void");
    }
}

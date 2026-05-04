package jo;

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
@e
/* loaded from: classes7.dex */
public abstract class t extends Number {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<int[]> f64472d = new ThreadLocal<>();

    /* renamed from: e, reason: collision with root package name */
    public static final Random f64473e = new Random();

    /* renamed from: f, reason: collision with root package name */
    public static final int f64474f = Runtime.getRuntime().availableProcessors();

    /* renamed from: g, reason: collision with root package name */
    public static final Unsafe f64475g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f64476h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f64477i;

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public volatile transient b[] f64478a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient long f64479b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient int f64480c;

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
        public static final Unsafe f64481p;

        /* renamed from: q, reason: collision with root package name */
        public static final long f64482q;

        /* renamed from: a, reason: collision with root package name */
        public volatile long f64483a;

        /* renamed from: b, reason: collision with root package name */
        public volatile long f64484b;

        /* renamed from: c, reason: collision with root package name */
        public volatile long f64485c;

        /* renamed from: d, reason: collision with root package name */
        public volatile long f64486d;

        /* renamed from: e, reason: collision with root package name */
        public volatile long f64487e;

        /* renamed from: f, reason: collision with root package name */
        public volatile long f64488f;

        /* renamed from: g, reason: collision with root package name */
        public volatile long f64489g;

        /* renamed from: h, reason: collision with root package name */
        public volatile long f64490h;

        /* renamed from: i, reason: collision with root package name */
        public volatile long f64491i;

        /* renamed from: j, reason: collision with root package name */
        public volatile long f64492j;

        /* renamed from: k, reason: collision with root package name */
        public volatile long f64493k;

        /* renamed from: l, reason: collision with root package name */
        public volatile long f64494l;

        /* renamed from: m, reason: collision with root package name */
        public volatile long f64495m;

        /* renamed from: n, reason: collision with root package name */
        public volatile long f64496n;

        /* renamed from: o, reason: collision with root package name */
        public volatile long f64497o;

        static {
            try {
                Unsafe e11 = t.e();
                f64481p = e11;
                f64482q = e11.objectFieldOffset(b.class.getDeclaredField(CmcdData.STREAMING_FORMAT_HLS));
            } catch (Exception e12) {
                throw new Error(e12);
            }
        }

        public b(long x11) {
            this.f64490h = x11;
        }

        public final boolean a(long cmp, long val) {
            return f64481p.compareAndSwapLong(this, f64482q, cmp, val);
        }
    }

    static {
        try {
            Unsafe e11 = e();
            f64475g = e11;
            f64476h = e11.objectFieldOffset(t.class.getDeclaredField(yr.e.f100279a));
            f64477i = e11.objectFieldOffset(t.class.getDeclaredField("c"));
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
        return f64475g.compareAndSwapLong(this, f64476h, cmp, val);
    }

    public final boolean c() {
        return f64475g.compareAndSwapInt(this, f64477i, 0, 1);
    }

    public abstract long d(long currentValue, long newValue);

    public final void f(long initialValue) {
        b[] bVarArr = this.f64478a;
        this.f64479b = initialValue;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f64490h = initialValue;
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
        throw new UnsupportedOperationException("Method not decompiled: jo.t.g(long, int[], boolean):void");
    }
}

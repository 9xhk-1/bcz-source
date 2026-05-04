package no;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import no.v;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final c f75355a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f75356b = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f75357a = new a("INSTANCE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f75358b = c();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // no.v.c
            public long a(byte[] source, int offset) {
                return ro.k.k(source[offset + 7], source[offset + 6], source[offset + 5], source[offset + 4], source[offset + 3], source[offset + 2], source[offset + 1], source[offset]);
            }

            @Override // no.v.c
            public void b(byte[] sink, int offset, long value) {
                long j11 = 255;
                for (int i11 = 0; i11 < 8; i11++) {
                    sink[offset + i11] = (byte) ((value & j11) >> (i11 * 8));
                    j11 <<= 8;
                }
            }
        }

        public b(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ b[] c() {
            return new b[]{f75357a};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f75358b.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        long a(byte[] array, int offset);

        void b(byte[] array, int offset, long value);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d implements c {

        /* renamed from: c, reason: collision with root package name */
        public static final Unsafe f75361c;

        /* renamed from: d, reason: collision with root package name */
        public static final int f75362d;

        /* renamed from: a, reason: collision with root package name */
        public static final d f75359a = new a("UNSAFE_LITTLE_ENDIAN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f75360b = new b("UNSAFE_BIG_ENDIAN", 1);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ d[] f75363e = d();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends d {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // no.v.c
            public long a(byte[] array, int offset) {
                return d.f75361c.getLong(array, offset + d.f75362d);
            }

            @Override // no.v.c
            public void b(byte[] array, int offset, long value) {
                d.f75361c.putLong(array, offset + d.f75362d, value);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends d {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // no.v.c
            public long a(byte[] array, int offset) {
                return Long.reverseBytes(d.f75361c.getLong(array, offset + d.f75362d));
            }

            @Override // no.v.c
            public void b(byte[] array, int offset, long value) {
                d.f75361c.putLong(array, offset + d.f75362d, Long.reverseBytes(value));
            }
        }

        static {
            Unsafe g11 = g();
            f75361c = g11;
            f75362d = g11.arrayBaseOffset(byte[].class);
            if (g11.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        public d(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ d[] d() {
            return new d[]{f75359a, f75360b};
        }

        public static Unsafe g() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e11) {
                    throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: no.w
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        Unsafe i11;
                        i11 = v.d.i();
                        return i11;
                    }
                });
            }
        }

        public static /* synthetic */ Unsafe i() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public static d valueOf(String name) {
            return (d) Enum.valueOf(d.class, name);
        }

        public static d[] values() {
            return (d[]) f75363e.clone();
        }
    }

    static {
        c cVar = b.f75357a;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                cVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? d.f75359a : d.f75360b;
            }
        } catch (Throwable unused) {
        }
        f75355a = cVar;
    }

    public static int a(byte[] source, int offset) {
        return ((source[offset + 3] & 255) << 24) | (source[offset] & 255) | ((source[offset + 1] & 255) << 8) | ((source[offset + 2] & 255) << 16);
    }

    public static long b(byte[] input, int offset) {
        return f75355a.a(input, offset);
    }

    public static long c(byte[] input, int offset, int length) {
        long j11 = 0;
        for (int i11 = 0; i11 < Math.min(length, 8); i11++) {
            j11 |= (input[offset + i11] & 255) << (i11 * 8);
        }
        return j11;
    }

    public static void d(byte[] sink, int offset, long value) {
        f75355a.b(sink, offset, value);
    }

    public static boolean e() {
        return f75355a instanceof d;
    }
}

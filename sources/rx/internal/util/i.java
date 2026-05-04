package rx.internal.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f86715a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f86716b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f86717c;

    static {
        int c11 = c();
        f86716b = c11;
        f86717c = c11 != 0;
    }

    public i() {
        throw new IllegalStateException("No instances!");
    }

    public static int a() {
        return f86716b;
    }

    public static boolean b() {
        return f86717c;
    }

    public static int c() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}

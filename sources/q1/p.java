package q1;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81402a = "1.13.1";

    /* renamed from: b, reason: collision with root package name */
    public static final int f81403b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f81404c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f81405d;

    static {
        try {
            String[] split = f81402a.split("\\.");
            int i11 = 0;
            f81403b = split.length < 1 ? 0 : Integer.valueOf(split[0]).intValue();
            f81404c = split.length < 2 ? 0 : Integer.valueOf(split[1]).intValue();
            if (split.length >= 3) {
                i11 = Integer.valueOf(split[2]).intValue();
            }
            f81405d = i11;
        } catch (Throwable th2) {
            throw new GdxRuntimeException("Invalid version " + f81402a, th2);
        }
    }

    public static boolean a(int i11, int i12, int i13) {
        return b(i11, i12, i13 + 1);
    }

    public static boolean b(int i11, int i12, int i13) {
        int i14 = f81403b;
        if (i14 != i11) {
            return i14 > i11;
        }
        int i15 = f81404c;
        return i15 != i12 ? i15 > i12 : f81405d >= i13;
    }

    public static boolean c(int i11, int i12, int i13) {
        return d(i11, i12, i13 - 1);
    }

    public static boolean d(int i11, int i12, int i13) {
        int i14 = f81403b;
        if (i14 != i11) {
            return i14 < i11;
        }
        int i15 = f81404c;
        return i15 != i12 ? i15 < i12 : f81405d <= i13;
    }
}

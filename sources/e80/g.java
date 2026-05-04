package e80;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49588a = 17;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49589b = 37;

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (!a(objArr[i11], objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static int c(int i11, int i12) {
        return (i11 * 37) + i12;
    }

    public static int d(int i11, Object obj) {
        return c(i11, obj != null ? obj.hashCode() : 0);
    }

    public static int e(int i11, boolean z11) {
        return c(i11, z11 ? 1 : 0);
    }
}

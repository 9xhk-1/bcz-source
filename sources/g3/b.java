package g3;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {
    public static Object a(Object obj, int i11) {
        return Array.get(obj, i11);
    }

    public static int b(Object obj) {
        return Array.getLength(obj);
    }

    public static Object c(Class cls, int i11) {
        return Array.newInstance((Class<?>) cls, i11);
    }

    public static void d(Object obj, int i11, Object obj2) {
        Array.set(obj, i11, obj2);
    }
}

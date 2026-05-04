package androidx.collection;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    public static <T> T[] resizeForToArray(T[] tArr, int i11) {
        if (tArr.length < i11) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
        }
        if (tArr.length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }
}

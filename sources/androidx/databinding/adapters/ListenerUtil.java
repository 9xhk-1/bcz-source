package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ListenerUtil {
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray<>();

    public static <T> T getListener(View view, int i11) {
        return (T) view.getTag(i11);
    }

    public static <T> T trackListener(View view, T t11, int i11) {
        T t12 = (T) view.getTag(i11);
        view.setTag(i11, t11);
        return t12;
    }
}

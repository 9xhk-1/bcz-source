package androidx.core.util;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class DebugUtils {
    private DebugUtils() {
    }

    public static void buildShortClassTag(Object obj, StringBuilder sb2) {
        int lastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append(l50.b.f69927i);
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}

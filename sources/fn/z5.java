package fn;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class z5 {
    public static Map<Integer, Integer> a(int[] iArr, int i11) {
        Set<Integer> keySet = new d6().a(iArr, i11).f52092a.keySet();
        int[] iArr2 = new int[keySet.size()];
        Iterator<Integer> it = keySet.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr2[i12] = it.next().intValue();
            i12++;
        }
        return c6.a(iArr, iArr2, i11);
    }
}

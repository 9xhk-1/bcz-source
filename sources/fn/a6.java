package fn;

import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class a6 implements y5 {

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f52079a;

    @Override // fn.y5
    public b6 a(int[] iArr, int i11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i12 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i12));
            int i13 = 1;
            if (num != null) {
                i13 = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i12), Integer.valueOf(i13));
        }
        this.f52079a = linkedHashMap;
        return new b6(linkedHashMap);
    }

    public Map<Integer, Integer> b() {
        return this.f52079a;
    }
}

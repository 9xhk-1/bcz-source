package bq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Integer, Integer> f7159a = new HashMap();

    public Integer a(int i11) {
        return this.f7159a.get(Integer.valueOf(i11));
    }

    public int[] b() {
        ArrayList arrayList = new ArrayList();
        int i11 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f7159a.entrySet()) {
            if (entry.getValue().intValue() > i11) {
                i11 = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i11) {
                arrayList.add(entry.getKey());
            }
        }
        return aq.a.c(arrayList);
    }

    public void c(int i11) {
        Integer num = this.f7159a.get(Integer.valueOf(i11));
        if (num == null) {
            num = 0;
        }
        this.f7159a.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() + 1));
    }
}

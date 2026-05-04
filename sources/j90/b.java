package j90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<T> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public Map<m, r90.g<String, ?>[]> f63909a;

    /* renamed from: b, reason: collision with root package name */
    public List<m> f63910b;

    public b(List<m> list) {
        this.f63910b = list;
    }

    public static void g(m mVar, List<r90.g<?, ?>> list, r90.g<?, ?>[] gVarArr) {
        for (r90.g<?, ?> gVar : gVarArr) {
            Iterator<r90.g<?, ?>> it = list.iterator();
            while (it.hasNext()) {
                if (gVar == it.next()) {
                    throw new DataProcessingException("Duplicate conversion " + gVar.getClass().getName() + " being applied to " + mVar.H());
                }
            }
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b<T> clone() {
        try {
            return (b) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public b<T> b(Map<m, m> map, List<m> list) {
        b<T> clone = clone();
        clone.f63910b = list;
        if (this.f63909a != null) {
            clone.f63909a = new HashMap();
            for (m mVar : this.f63910b) {
                m mVar2 = map.get(mVar);
                if (mVar2 == null) {
                    throw new IllegalStateException("Internal error cloning conversion mappings");
                }
                clone.f63909a.put(mVar2, this.f63909a.get(mVar));
            }
        }
        return clone;
    }

    public boolean c() {
        Map<m, r90.g<String, ?>[]> map = this.f63909a;
        return map == null || map.isEmpty();
    }

    public abstract m d();

    public void e(boolean z11, m mVar, Map<Integer, List<r90.g<?, ?>>> map, String[] strArr) {
        r90.g<String, ?>[] gVarArr;
        Map<m, r90.g<String, ?>[]> map2 = this.f63909a;
        if (map2 == null || (gVarArr = map2.get(mVar)) == null) {
            return;
        }
        int[] V = mVar.V(NormalizedString.toIdentifierGroupArray(strArr));
        if (V == null) {
            V = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.F(map.keySet());
        }
        for (int i11 : V) {
            List<r90.g<?, ?>> list = map.get(Integer.valueOf(i11));
            if (list == null) {
                list = new ArrayList<>();
                map.put(Integer.valueOf(i11), list);
            }
            g(mVar, list, gVarArr);
            list.addAll(Arrays.asList(gVarArr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<T> f(r90.g<String, ?>... gVarArr) {
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Conversions", gVarArr);
        Cloneable d11 = d();
        if (this.f63909a == null) {
            this.f63909a = new LinkedHashMap();
        }
        this.f63909a.put(d11, gVarArr);
        this.f63910b.add(d11);
        if (d11 instanceof n) {
            return (n) d11;
        }
        return null;
    }
}

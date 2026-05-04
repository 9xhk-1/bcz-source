package j90;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import r90.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final r90.g[] f63917i = new r90.g[0];

    /* renamed from: a, reason: collision with root package name */
    public int[] f63918a;

    /* renamed from: b, reason: collision with root package name */
    public List<m> f63919b;

    /* renamed from: c, reason: collision with root package name */
    public j90.b<String> f63920c;

    /* renamed from: d, reason: collision with root package name */
    public j90.b<Integer> f63921d;

    /* renamed from: e, reason: collision with root package name */
    public j90.b<Enum> f63922e;

    /* renamed from: f, reason: collision with root package name */
    public j90.b<Integer> f63923f;

    /* renamed from: g, reason: collision with root package name */
    public Map<Integer, List<r90.g<?, ?>>> f63924g;

    /* renamed from: h, reason: collision with root package name */
    public Map<Integer, List<b0>> f63925h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j90.b<String> {
        public a(List list) {
            super(list);
        }

        @Override // j90.b
        public m d() {
            return new l();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends j90.b<Integer> {
        public b(List list) {
            super(list);
        }

        @Override // j90.b
        public m d() {
            return new k();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends j90.b<Enum> {
        public c(List list) {
            super(list);
        }

        @Override // j90.b
        public m d() {
            return new j();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends j90.b<Integer> {
        public d(List list) {
            super(list);
        }

        @Override // j90.b
        public m d() {
            return new j90.c();
        }
    }

    public i() {
        ArrayList arrayList = new ArrayList();
        this.f63919b = arrayList;
        this.f63920c = new a(arrayList);
        this.f63921d = new b(this.f63919b);
        this.f63922e = new c(this.f63919b);
        this.f63923f = new d(this.f63919b);
        Map<Integer, List<b0>> map = Collections.EMPTY_MAP;
        this.f63924g = map;
        this.f63925h = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable, org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    public Object a(int i11, String str, boolean[] zArr) {
        List<r90.g<?, ?>> list = this.f63924g.get(Integer.valueOf(i11));
        if (list != null) {
            if (zArr != null) {
                zArr[i11] = true;
            }
            for (r90.g<?, ?> gVar : list) {
                try {
                    str = gVar.b(str);
                } catch (DataProcessingException e11) {
                    e11.setColumnIndex(i11);
                    e11.markAsNonFatal();
                    throw e11;
                } catch (Throwable th2) {
                    ?? dataProcessingException = new DataProcessingException("Error converting value '{value}' using conversion " + gVar.getClass().getName(), th2);
                    dataProcessingException.setValue(str);
                    dataProcessingException.setColumnIndex(i11);
                    dataProcessingException.markAsNonFatal();
                    throw dataProcessingException;
                }
            }
        }
        return str;
    }

    public void b(r90.g<String, ?>... gVarArr) {
        this.f63923f.f(gVarArr);
    }

    public n<Enum> c(r90.g<String, ?>... gVarArr) {
        return this.f63922e.f(gVarArr);
    }

    public n<Integer> d(r90.g<String, ?>... gVarArr) {
        return this.f63921d.f(gVarArr);
    }

    public n<String> e(r90.g<String, ?>... gVarArr) {
        return this.f63920c.f(gVarArr);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            int[] iArr = this.f63918a;
            iVar.f63918a = iArr == null ? null : (int[]) iArr.clone();
            iVar.f63919b = new ArrayList();
            HashMap hashMap = new HashMap();
            for (m mVar : this.f63919b) {
                m mVar2 = (m) mVar.clone();
                iVar.f63919b.add(mVar2);
                hashMap.put(mVar, mVar2);
            }
            iVar.f63920c = this.f63920c.b(hashMap, iVar.f63919b);
            iVar.f63921d = this.f63921d.b(hashMap, iVar.f63919b);
            iVar.f63922e = this.f63922e.b(hashMap, iVar.f63919b);
            iVar.f63923f = this.f63923f.b(hashMap, iVar.f63919b);
            iVar.f63924g = new HashMap(this.f63924g);
            iVar.f63925h = new TreeMap(this.f63925h);
            return iVar;
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void g(int i11, Object obj) {
        List<b0> list = this.f63925h.get(Integer.valueOf(i11));
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                list.get(i12).b(obj);
            }
        }
    }

    public r90.g[] h(int i11, Class<?> cls) {
        List<r90.g<?, ?>> list = this.f63924g.get(Integer.valueOf(i11));
        int i12 = 0;
        if (list == null) {
            if (cls == String.class) {
                return f63917i;
            }
            r90.g C = h90.a.C(cls, null, null);
            return C == null ? f63917i : new r90.g[]{C};
        }
        r90.g[] gVarArr = new r90.g[list.size()];
        Iterator<r90.g<?, ?>> it = list.iterator();
        while (it.hasNext()) {
            gVarArr[i12] = it.next();
            i12++;
        }
        return gVarArr;
    }

    public void i(boolean z11, String[] strArr) {
        if (!(this.f63920c.c() && this.f63922e.c() && this.f63921d.c() && this.f63923f.c()) && this.f63924g.isEmpty()) {
            this.f63924g = new HashMap();
            for (m mVar : this.f63919b) {
                this.f63920c.e(z11, mVar, this.f63924g, strArr);
                this.f63921d.e(z11, mVar, this.f63924g, strArr);
                this.f63922e.e(z11, mVar, this.f63924g, strArr);
                this.f63923f.e(z11, mVar, this.f63924g, strArr);
            }
            Iterator<Map.Entry<Integer, List<r90.g<?, ?>>>> it = this.f63924g.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, List<r90.g<?, ?>>> next = it.next();
                Iterator<r90.g<?, ?>> it2 = next.getValue().iterator();
                while (it2.hasNext()) {
                    r90.g<?, ?> next2 = it2.next();
                    if (next2 instanceof b0) {
                        if (this.f63925h.isEmpty()) {
                            this.f63925h = new TreeMap();
                        }
                        it2.remove();
                        List<b0> list = this.f63925h.get(next.getKey());
                        if (list == null) {
                            list = new ArrayList<>(1);
                            this.f63925h.put(next.getKey(), list);
                        }
                        list.add((b0) next2);
                    }
                }
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
            this.f63918a = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.F(this.f63925h.keySet());
        }
    }

    public Object j(boolean z11, int i11, Object obj, boolean[] zArr) {
        List<r90.g<?, ?>> list = this.f63924g.get(Integer.valueOf(i11));
        if (list == null) {
            return obj;
        }
        if (zArr != null) {
            zArr[i11] = true;
        }
        r90.g<?, ?> gVar = null;
        try {
            try {
                if (!z11) {
                    for (r90.g<?, ?> gVar2 : list) {
                        try {
                            obj = gVar2.a(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            gVar = gVar2;
                        }
                    }
                    return obj;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    r90.g<?, ?> gVar3 = list.get(size);
                    try {
                        obj = gVar3.a(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar = gVar3;
                    }
                }
                return obj;
            } catch (Throwable th4) {
                th = th4;
            }
            DataProcessingException dataProcessingException = gVar != null ? new DataProcessingException("Error converting value '{value}' using conversion " + gVar.getClass().getName(), th) : new DataProcessingException("Error converting value '{value}'", th);
            dataProcessingException.setValue(obj);
            dataProcessingException.setColumnIndex(i11);
            dataProcessingException.markAsNonFatal();
            throw dataProcessingException;
        } catch (DataProcessingException e11) {
            e11.setValue(obj);
            e11.setColumnIndex(i11);
            e11.markAsNonFatal();
            throw e11;
        }
    }
}

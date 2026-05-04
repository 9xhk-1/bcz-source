package t90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.y;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FieldAlignment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f90379a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f90380b;

    /* renamed from: c, reason: collision with root package name */
    public final FieldAlignment[] f90381c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f90382d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean[] f90383e;

    /* renamed from: f, reason: collision with root package name */
    public final char[] f90384f;

    /* renamed from: g, reason: collision with root package name */
    public final NormalizedString[] f90385g;

    /* renamed from: h, reason: collision with root package name */
    public final char f90386h;

    /* renamed from: i, reason: collision with root package name */
    public org.junit.jupiter.params.shadow.com.univocity.parsers.common.i f90387i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends a0 {

        /* renamed from: b, reason: collision with root package name */
        public p90.d f90388b;

        /* renamed from: c, reason: collision with root package name */
        public final org.junit.jupiter.params.shadow.com.univocity.parsers.common.e f90389c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f90390d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, String[] strArr) {
            super(yVar);
            this.f90390d = strArr;
            this.f90389c = new org.junit.jupiter.params.shadow.com.univocity.parsers.common.e(this, null);
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
        public String[] a() {
            return this.f90390d;
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
        public int e(String str) {
            return this.f90389c.b(str);
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
        public int h(Enum<?> r22) {
            return this.f90389c.a(r22);
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0, org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
        public p90.c k(String[] strArr) {
            if (this.f90388b == null) {
                this.f90388b = new p90.d(this);
            }
            return this.f90388b.c(strArr);
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
        public p90.f s() {
            if (this.f90388b == null) {
                this.f90388b = new p90.d(this);
            }
            return this.f90388b.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Comparator<i> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            char[] cArr = iVar.f90379a;
            int length = cArr.length;
            char[] cArr2 = iVar2.f90379a;
            if (length < cArr2.length) {
                return 1;
            }
            return cArr.length == cArr2.length ? 0 : -1;
        }
    }

    public i(String str, t90.b bVar, c cVar) {
        this.f90379a = str.toCharArray();
        this.f90380b = bVar.x();
        this.f90381c = bVar.y();
        this.f90385g = bVar.A();
        this.f90384f = bVar.E(cVar);
        this.f90386h = cVar.q();
        this.f90382d = bVar.G();
        this.f90383e = bVar.J();
    }

    public static int[] a(t90.b bVar, Map<String, t90.b> map, Map<String, t90.b> map2) {
        int i11;
        ArrayList<int[]> arrayList = new ArrayList();
        if (bVar != null) {
            arrayList.add(bVar.z());
        }
        Iterator<t90.b> it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().z());
        }
        Iterator<t90.b> it2 = map2.values().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().z());
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Cannot determine field lengths to use.");
        }
        int i12 = -1;
        for (int[] iArr : arrayList) {
            if (i12 < iArr.length) {
                i12 = iArr.length;
            }
        }
        int[] iArr2 = new int[i12];
        Arrays.fill(iArr2, 0);
        for (int[] iArr3 : arrayList) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (i13 < iArr3.length && iArr2[i13] < (i11 = iArr3[i13])) {
                    iArr2[i13] = i11;
                }
            }
        }
        return iArr2;
    }

    public static int b(i[]... iVarArr) {
        int i11 = 0;
        for (i[] iVarArr2 : iVarArr) {
            if (iVarArr2 != null) {
                for (i iVar : iVarArr2) {
                    char[] cArr = iVar.f90379a;
                    if (i11 < cArr.length) {
                        i11 = cArr.length;
                    }
                }
            }
        }
        return i11;
    }

    public static i[] c(Map<String, t90.b> map, c cVar) {
        if (map.isEmpty()) {
            return null;
        }
        i[] iVarArr = new i[map.size()];
        int i11 = 0;
        for (Map.Entry<String, t90.b> entry : map.entrySet()) {
            iVarArr[i11] = new i(entry.getKey(), entry.getValue(), cVar);
            i11++;
        }
        Arrays.sort(iVarArr, new b());
        return iVarArr;
    }

    public static void f(String str, t90.b bVar, Map<String, t90.b> map) {
        h("ahead", str, bVar, map);
    }

    public static void g(String str, t90.b bVar, Map<String, t90.b> map) {
        h("behind", str, bVar, map);
    }

    public static void h(String str, String str2, t90.b bVar, Map<String, t90.b> map) {
        if (str2 == null) {
            throw new IllegalArgumentException("Look" + str + " value cannot be null");
        }
        if (bVar != null) {
            map.put(str2, bVar);
            return;
        }
        throw new IllegalArgumentException("Lengths of fields associated to look" + str + " value '" + str2 + "' cannot be null");
    }

    public void d(y yVar, NormalizedString[] normalizedStringArr) {
        this.f90387i = new a(yVar, NormalizedString.toArray(normalizedStringArr));
    }

    public boolean e(char[] cArr) {
        if (this.f90379a.length > cArr.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            char[] cArr2 = this.f90379a;
            if (i11 >= cArr2.length) {
                return true;
            }
            char c11 = cArr2[i11];
            if (c11 != this.f90386h && c11 != cArr[i11]) {
                return false;
            }
            i11++;
        }
    }
}

package vp;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import com.google.zxing.m;
import hq.d;
import hq.e;
import hq.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b extends e {

    /* renamed from: i, reason: collision with root package name */
    public static final f[] f94253i = new f[0];

    /* renamed from: j, reason: collision with root package name */
    public static final float f94254j = 180.0f;

    /* renamed from: k, reason: collision with root package name */
    public static final float f94255k = 9.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final float f94256l = 0.05f;

    /* renamed from: m, reason: collision with root package name */
    public static final float f94257m = 0.5f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: vp.b$b, reason: collision with other inner class name */
    public static final class C1269b implements Serializable, Comparator<d> {
        public C1269b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            double i11 = dVar2.i() - dVar.i();
            if (i11 < 0.0d) {
                return -1;
            }
            return i11 > 0.0d ? 1 : 0;
        }
    }

    public b(kp.b bVar) {
        super(bVar);
    }

    public f[] r(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z11 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        kp.b k11 = k();
        int h11 = k11.h();
        int m11 = k11.m();
        int i11 = (h11 * 3) / 388;
        if (i11 < 3 || z11) {
            i11 = 3;
        }
        int[] iArr = new int[5];
        for (int i12 = i11 - 1; i12 < h11; i12 += i11) {
            b(iArr);
            int i13 = 0;
            for (int i14 = 0; i14 < m11; i14++) {
                if (k11.e(i14, i12)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (e.h(iArr) && m(iArr, i12, i14)) {
                    b(iArr);
                    i13 = 0;
                } else {
                    q(iArr);
                    i13 = 3;
                }
            }
            if (e.h(iArr)) {
                m(iArr, i12, m11);
            }
        }
        d[][] s11 = s();
        ArrayList arrayList = new ArrayList();
        for (d[] dVarArr : s11) {
            l.e(dVarArr);
            arrayList.add(new f(dVarArr));
        }
        return arrayList.isEmpty() ? f94253i : (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    public final d[][] s() throws NotFoundException {
        List<d> l11 = l();
        int size = l11.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (size == 3) {
            return new d[][]{new d[]{l11.get(0), l11.get(1), l11.get(2)}};
        }
        Collections.sort(l11, new C1269b());
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < size - 2; i11++) {
            d dVar = l11.get(i11);
            if (dVar != null) {
                for (int i12 = i11 + 1; i12 < size - 1; i12++) {
                    d dVar2 = l11.get(i12);
                    if (dVar2 != null) {
                        float i13 = (dVar.i() - dVar2.i()) / Math.min(dVar.i(), dVar2.i());
                        if (Math.abs(dVar.i() - dVar2.i()) <= 0.5f || i13 < 0.05f) {
                            for (int i14 = i12 + 1; i14 < size; i14++) {
                                d dVar3 = l11.get(i14);
                                if (dVar3 != null) {
                                    float i15 = (dVar2.i() - dVar3.i()) / Math.min(dVar2.i(), dVar3.i());
                                    if (Math.abs(dVar2.i() - dVar3.i()) <= 0.5f || i15 < 0.05f) {
                                        d[] dVarArr = {dVar, dVar2, dVar3};
                                        l.e(dVarArr);
                                        f fVar = new f(dVarArr);
                                        float b11 = l.b(fVar.b(), fVar.a());
                                        float b12 = l.b(fVar.c(), fVar.a());
                                        float b13 = l.b(fVar.b(), fVar.c());
                                        float i16 = (b11 + b13) / (dVar.i() * 2.0f);
                                        if (i16 <= 180.0f && i16 >= 9.0f && Math.abs((b11 - b13) / Math.min(b11, b13)) < 0.1f) {
                                            float sqrt = (float) Math.sqrt((b11 * b11) + (b13 * b13));
                                            if (Math.abs((b12 - sqrt) / Math.min(b12, sqrt)) < 0.1f) {
                                                arrayList.add(dVarArr);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (d[][]) arrayList.toArray(new d[arrayList.size()][]);
    }

    public b(kp.b bVar, m mVar) {
        super(bVar, mVar);
    }
}

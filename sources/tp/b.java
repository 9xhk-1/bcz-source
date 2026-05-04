package tp;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f90850b = 100;

    /* renamed from: c, reason: collision with root package name */
    public static final int f90851c = 4;

    /* renamed from: a, reason: collision with root package name */
    public final j f90852a;

    public b(j jVar) {
        this.f90852a = jVar;
    }

    public static k c(k kVar, int i11, int i12) {
        l[] f11 = kVar.f();
        if (f11 == null) {
            return kVar;
        }
        l[] lVarArr = new l[f11.length];
        for (int i13 = 0; i13 < f11.length; i13++) {
            l lVar = f11[i13];
            if (lVar != null) {
                lVarArr[i13] = new l(lVar.c() + i11, lVar.d() + i12);
            }
        }
        k kVar2 = new k(kVar.g(), kVar.d(), kVar.c(), lVarArr, kVar.b(), kVar.h());
        kVar2.i(kVar.e());
        return kVar2;
    }

    public final void a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map, List<k> list, int i11, int i12, int i13) {
        int i14;
        if (i13 > 4) {
            return;
        }
        try {
            k a11 = this.f90852a.a(bVar, map);
            Iterator<k> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().g().equals(a11.g())) {
                        break;
                    }
                } else {
                    list.add(c(a11, i11, i12));
                    break;
                }
            }
            l[] f11 = a11.f();
            if (f11 == null || f11.length == 0) {
                return;
            }
            int e11 = bVar.e();
            int d11 = bVar.d();
            float f12 = e11;
            float f13 = d11;
            float f14 = 0.0f;
            float f15 = 0.0f;
            for (l lVar : f11) {
                if (lVar != null) {
                    float c11 = lVar.c();
                    float d12 = lVar.d();
                    if (c11 < f12) {
                        f12 = c11;
                    }
                    if (d12 < f13) {
                        f13 = d12;
                    }
                    if (c11 > f14) {
                        f14 = c11;
                    }
                    if (d12 > f15) {
                        f15 = d12;
                    }
                }
            }
            if (f12 > 100.0f) {
                i14 = 0;
                a(bVar.a(0, 0, (int) f12, d11), map, list, i11, i12, i13 + 1);
            } else {
                i14 = 0;
            }
            if (f13 > 100.0f) {
                a(bVar.a(i14, i14, e11, (int) f13), map, list, i11, i12, i13 + 1);
            }
            if (f14 < e11 - 100) {
                int i15 = (int) f14;
                a(bVar.a(i15, 0, e11 - i15, d11), map, list, i11 + i15, i12, i13 + 1);
            }
            if (f15 < d11 - 100) {
                int i16 = (int) f15;
                a(bVar.a(0, i16, e11, d11 - i16), map, list, i11, i12 + i16, i13 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    @Override // tp.c
    public k[] b(com.google.zxing.b bVar) throws NotFoundException {
        return d(bVar, null);
    }

    @Override // tp.c
    public k[] d(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        a(bVar, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }
}

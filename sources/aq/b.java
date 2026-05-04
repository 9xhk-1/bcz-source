package aq;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b implements j, tp.c {
    public static k[] e(com.google.zxing.b bVar, Map<DecodeHintType, ?> map, boolean z11) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        dq.b b11 = dq.a.b(bVar, map, z11);
        for (l[] lVarArr : b11.b()) {
            kp.d i11 = bq.j.i(b11.a(), lVarArr[4], lVarArr[5], lVarArr[6], lVarArr[7], h(lVarArr), f(lVarArr));
            k kVar = new k(i11.j(), i11.g(), lVarArr, BarcodeFormat.PDF_417);
            kVar.j(ResultMetadataType.ERROR_CORRECTION_LEVEL, i11.b());
            c cVar = (c) i11.f();
            if (cVar != null) {
                kVar.j(ResultMetadataType.PDF417_EXTRA_METADATA, cVar);
            }
            arrayList.add(kVar);
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    public static int f(l[] lVarArr) {
        return Math.max(Math.max(g(lVarArr[0], lVarArr[4]), (g(lVarArr[6], lVarArr[2]) * 17) / 18), Math.max(g(lVarArr[1], lVarArr[5]), (g(lVarArr[7], lVarArr[3]) * 17) / 18));
    }

    public static int g(l lVar, l lVar2) {
        if (lVar == null || lVar2 == null) {
            return 0;
        }
        return (int) Math.abs(lVar.c() - lVar2.c());
    }

    public static int h(l[] lVarArr) {
        return Math.min(Math.min(i(lVarArr[0], lVarArr[4]), (i(lVarArr[6], lVarArr[2]) * 17) / 18), Math.min(i(lVarArr[1], lVarArr[5]), (i(lVarArr[7], lVarArr[3]) * 17) / 18));
    }

    public static int i(l lVar, l lVar2) {
        if (lVar == null || lVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(lVar.c() - lVar2.c());
    }

    @Override // com.google.zxing.j
    public k a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        k kVar;
        k[] e11 = e(bVar, map, false);
        if (e11 == null || e11.length == 0 || (kVar = e11[0]) == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return kVar;
    }

    @Override // tp.c
    public k[] b(com.google.zxing.b bVar) throws NotFoundException {
        return d(bVar, null);
    }

    @Override // com.google.zxing.j
    public k c(com.google.zxing.b bVar) throws NotFoundException, FormatException, ChecksumException {
        return a(bVar, null);
    }

    @Override // tp.c
    public k[] d(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        try {
            return e(bVar, map, true);
        } catch (ChecksumException | FormatException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    @Override // com.google.zxing.j
    public void reset() {
    }
}

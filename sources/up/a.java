package up;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.k;
import com.google.zxing.l;
import gq.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kp.d;
import kp.f;
import tp.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a extends fq.a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final k[] f92399c = new k[0];

    /* renamed from: d, reason: collision with root package name */
    public static final l[] f92400d = new l[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Serializable, Comparator<k> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(k kVar, k kVar2) {
            Map<ResultMetadataType, Object> e11 = kVar.e();
            ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) e11.get(resultMetadataType)).intValue(), ((Integer) kVar2.e().get(resultMetadataType)).intValue());
        }
    }

    public static List<k> h(List<k> list) {
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().e().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                ArrayList arrayList = new ArrayList();
                ArrayList<k> arrayList2 = new ArrayList();
                for (k kVar : list) {
                    arrayList.add(kVar);
                    if (kVar.e().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                        arrayList2.add(kVar);
                    }
                }
                Collections.sort(arrayList2, new b());
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                int i12 = 0;
                for (k kVar2 : arrayList2) {
                    sb2.append(kVar2.g());
                    i11 += kVar2.d().length;
                    Map<ResultMetadataType, Object> e11 = kVar2.e();
                    ResultMetadataType resultMetadataType = ResultMetadataType.BYTE_SEGMENTS;
                    if (e11.containsKey(resultMetadataType)) {
                        Iterator it2 = ((Iterable) kVar2.e().get(resultMetadataType)).iterator();
                        while (it2.hasNext()) {
                            i12 += ((byte[]) it2.next()).length;
                        }
                    }
                }
                byte[] bArr = new byte[i11];
                byte[] bArr2 = new byte[i12];
                int i13 = 0;
                int i14 = 0;
                for (k kVar3 : arrayList2) {
                    System.arraycopy(kVar3.d(), 0, bArr, i13, kVar3.d().length);
                    i13 += kVar3.d().length;
                    Map<ResultMetadataType, Object> e12 = kVar3.e();
                    ResultMetadataType resultMetadataType2 = ResultMetadataType.BYTE_SEGMENTS;
                    if (e12.containsKey(resultMetadataType2)) {
                        for (byte[] bArr3 : (Iterable) kVar3.e().get(resultMetadataType2)) {
                            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
                            i14 += bArr3.length;
                        }
                    }
                }
                k kVar4 = new k(sb2.toString(), bArr, f92400d, BarcodeFormat.QR_CODE);
                if (i12 > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(bArr2);
                    kVar4.j(ResultMetadataType.BYTE_SEGMENTS, arrayList3);
                }
                arrayList.add(kVar4);
                return arrayList;
            }
        }
        return list;
    }

    @Override // tp.c
    public k[] b(com.google.zxing.b bVar) throws NotFoundException {
        return d(bVar, null);
    }

    @Override // tp.c
    public k[] d(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        for (f fVar : new vp.a(bVar.b()).n(map)) {
            try {
                d d11 = f().d(fVar.a(), map);
                l[] b11 = fVar.b();
                if (d11.f() instanceof g) {
                    ((g) d11.f()).a(b11);
                }
                k kVar = new k(d11.j(), d11.g(), b11, BarcodeFormat.QR_CODE);
                List<byte[]> a11 = d11.a();
                if (a11 != null) {
                    kVar.j(ResultMetadataType.BYTE_SEGMENTS, a11);
                }
                String b12 = d11.b();
                if (b12 != null) {
                    kVar.j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b12);
                }
                if (d11.k()) {
                    kVar.j(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(d11.i()));
                    kVar.j(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(d11.h()));
                }
                arrayList.add(kVar);
            } catch (ReaderException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return f92399c;
        }
        List<k> h11 = h(arrayList);
        return (k[]) h11.toArray(new k[h11.size()]);
    }
}

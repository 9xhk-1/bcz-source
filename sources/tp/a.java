package tp;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f90849a;

    public a(j jVar) {
        this.f90849a = jVar;
    }

    public static void b(l[] lVarArr, int i11, int i12) {
        if (lVarArr != null) {
            for (int i13 = 0; i13 < lVarArr.length; i13++) {
                l lVar = lVarArr[i13];
                lVarArr[i13] = new l(lVar.c() + i11, lVar.d() + i12);
            }
        }
    }

    @Override // com.google.zxing.j
    public k a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int e11 = bVar.e() / 2;
        int d11 = bVar.d() / 2;
        try {
            try {
                try {
                    try {
                        return this.f90849a.a(bVar.a(0, 0, e11, d11), map);
                    } catch (NotFoundException unused) {
                        int i11 = e11 / 2;
                        int i12 = d11 / 2;
                        k a11 = this.f90849a.a(bVar.a(i11, i12, e11, d11), map);
                        b(a11.f(), i11, i12);
                        return a11;
                    }
                } catch (NotFoundException unused2) {
                    k a12 = this.f90849a.a(bVar.a(e11, d11, e11, d11), map);
                    b(a12.f(), e11, d11);
                    return a12;
                }
            } catch (NotFoundException unused3) {
                k a13 = this.f90849a.a(bVar.a(0, d11, e11, d11), map);
                b(a13.f(), 0, d11);
                return a13;
            }
        } catch (NotFoundException unused4) {
            k a14 = this.f90849a.a(bVar.a(e11, 0, e11, d11), map);
            b(a14.f(), e11, 0);
            return a14;
        }
    }

    @Override // com.google.zxing.j
    public k c(com.google.zxing.b bVar) throws NotFoundException, ChecksumException, FormatException {
        return a(bVar, null);
    }

    @Override // com.google.zxing.j
    public void reset() {
        this.f90849a.reset();
    }
}

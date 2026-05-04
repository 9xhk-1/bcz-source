package cq;

import com.google.zxing.ChecksumException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f46815a = b.f46816f;

    public int a(int[] iArr, int i11, int[] iArr2) throws ChecksumException {
        c cVar = new c(this.f46815a, iArr);
        int[] iArr3 = new int[i11];
        boolean z11 = false;
        for (int i12 = i11; i12 > 0; i12--) {
            int b11 = cVar.b(this.f46815a.c(i12));
            iArr3[i11 - i12] = b11;
            if (b11 != 0) {
                z11 = true;
            }
        }
        if (!z11) {
            return 0;
        }
        c d11 = this.f46815a.d();
        if (iArr2 != null) {
            for (int i13 : iArr2) {
                int c11 = this.f46815a.c((iArr.length - 1) - i13);
                b bVar = this.f46815a;
                d11 = d11.h(new c(bVar, new int[]{bVar.j(0, c11), 1}));
            }
        }
        c[] d12 = d(this.f46815a.b(i11, 1), new c(this.f46815a, iArr3), i11);
        c cVar2 = d12[0];
        c cVar3 = d12[1];
        int[] b12 = b(cVar2);
        int[] c12 = c(cVar3, cVar2, b12);
        for (int i14 = 0; i14 < b12.length; i14++) {
            int length = (iArr.length - 1) - this.f46815a.h(b12[i14]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.f46815a.j(iArr[length], c12[i14]);
        }
        return b12.length;
    }

    public final int[] b(c cVar) throws ChecksumException {
        int e11 = cVar.e();
        int[] iArr = new int[e11];
        int i11 = 0;
        for (int i12 = 1; i12 < this.f46815a.e() && i11 < e11; i12++) {
            if (cVar.b(i12) == 0) {
                iArr[i11] = this.f46815a.g(i12);
                i11++;
            }
        }
        if (i11 == e11) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    public final int[] c(c cVar, c cVar2, int[] iArr) {
        int e11 = cVar2.e();
        int[] iArr2 = new int[e11];
        for (int i11 = 1; i11 <= e11; i11++) {
            iArr2[e11 - i11] = this.f46815a.i(i11, cVar2.c(i11));
        }
        c cVar3 = new c(this.f46815a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            int g11 = this.f46815a.g(iArr[i12]);
            iArr3[i12] = this.f46815a.i(this.f46815a.j(0, cVar.b(g11)), this.f46815a.g(cVar3.b(g11)));
        }
        return iArr3;
    }

    public final c[] d(c cVar, c cVar2, int i11) throws ChecksumException {
        if (cVar.e() < cVar2.e()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        c f11 = this.f46815a.f();
        c d11 = this.f46815a.d();
        while (true) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
            c cVar4 = d11;
            c cVar5 = f11;
            f11 = cVar4;
            if (cVar.e() < i11 / 2) {
                int c11 = f11.c(0);
                if (c11 == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int g11 = this.f46815a.g(c11);
                return new c[]{f11.g(g11), cVar.g(g11)};
            }
            if (cVar.f()) {
                throw ChecksumException.getChecksumInstance();
            }
            c f12 = this.f46815a.f();
            int g12 = this.f46815a.g(cVar.c(cVar.e()));
            while (cVar2.e() >= cVar.e() && !cVar2.f()) {
                int e11 = cVar2.e() - cVar.e();
                int i12 = this.f46815a.i(cVar2.c(cVar2.e()), g12);
                f12 = f12.a(this.f46815a.b(e11, i12));
                cVar2 = cVar2.k(cVar.i(e11, i12));
            }
            d11 = f12.h(f11).k(cVar5).j();
        }
    }
}

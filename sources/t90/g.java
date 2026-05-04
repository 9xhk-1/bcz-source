package t90;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextWritingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FieldAlignment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<h> {
    public int[] F;
    public FieldAlignment[] G;
    public char[] H;
    public char I;
    public char J;
    public int K;
    public FieldAlignment L;
    public i[] M;
    public i[] N;
    public char[] O;
    public i P;
    public int[] Q;
    public FieldAlignment[] R;
    public boolean[] S;
    public boolean[] T;
    public int U;
    public char[] V;
    public boolean W;
    public FieldAlignment X;

    public g(h hVar) {
        this((Writer) null, hVar);
    }

    public final void F1(String str, boolean z11) {
        int k02 = (z11 && this.B) ? org.junit.jupiter.params.shadow.com.univocity.parsers.common.c.k0(this.f78083z, str) : 0;
        int calculatePadding = this.L.calculatePadding(this.K, str.length() - k02);
        this.K -= calculatePadding;
        this.f78071n.c(this.I, calculatePadding);
        if (!z11 || !this.C) {
            while (k02 < str.length()) {
                int i11 = this.K;
                this.K = i11 - 1;
                if (i11 <= 0) {
                    return;
                }
                this.f78071n.append(str.charAt(k02));
                k02++;
            }
            return;
        }
        while (k02 < str.length() && this.K > 0) {
            while (k02 < str.length()) {
                int i12 = this.K;
                this.K = i12 - 1;
                if (i12 <= 0) {
                    break;
                }
                this.f78071n.C(str.charAt(k02));
                k02++;
            }
            if (this.K == -1 && this.f78071n.w() > 0) {
                int i13 = k02;
                while (true) {
                    if (i13 >= str.length()) {
                        break;
                    }
                    if (str.charAt(i13) > ' ') {
                        this.f78071n.i();
                        break;
                    }
                    i13++;
                }
                if (this.f78071n.w() > 0) {
                    this.K = 0;
                }
            }
            this.K += this.f78071n.w();
            l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public final void B(h hVar) {
        char s11 = ((c) hVar.o()).s();
        this.I = s11;
        this.J = s11;
        this.F = hVar.G0();
        this.G = hVar.J0();
        this.H = hVar.N0();
        boolean[] O0 = hVar.O0();
        this.S = O0;
        if (O0 != null) {
            int i11 = 0;
            while (true) {
                boolean[] zArr = this.S;
                if (i11 >= zArr.length) {
                    break;
                }
                if (zArr[i11]) {
                    this.U++;
                }
                i11++;
            }
        }
        this.M = hVar.P0();
        this.N = hVar.S0();
        this.W = hVar.T0();
        this.X = hVar.I0();
        super.q(hVar.U0());
        i[] iVarArr = this.M;
        if (iVarArr == null && this.N == null) {
            this.O = null;
            this.Q = null;
            this.R = null;
            this.V = null;
            this.T = null;
            return;
        }
        this.O = new char[i.b(iVarArr, this.N)];
        this.Q = this.F;
        this.R = this.G;
        this.V = this.H;
        this.T = this.S;
    }

    public final void H1(String str, boolean z11) {
        if (str != null) {
            F1(str, z11);
        }
        this.f78071n.c(this.I, this.K);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c
    public void g0(Object[] objArr) {
        if ((objArr.length > 0 && this.M != null) || this.N != null) {
            int i11 = 0;
            for (int i12 = 0; i12 < objArr.length && i11 < this.O.length; i12++) {
                String valueOf = String.valueOf(objArr[i12]);
                int length = valueOf.length();
                int i13 = i11 + length;
                char[] cArr = this.O;
                if (i13 > cArr.length) {
                    length = cArr.length - i11;
                }
                valueOf.getChars(0, length, cArr, i11);
                i11 += length;
            }
            boolean z11 = true;
            for (int length2 = this.O.length - 1; length2 > i11; length2--) {
                this.O[length2] = 0;
            }
            if (this.M == null) {
                int i14 = 0;
                while (true) {
                    i[] iVarArr = this.N;
                    if (i14 >= iVarArr.length) {
                        z11 = false;
                        break;
                    }
                    if (iVarArr[i14].e(this.O)) {
                        this.P = this.N[i14];
                        this.F = this.Q;
                        this.G = this.R;
                        this.H = this.V;
                        this.S = this.T;
                        break;
                    }
                    i14++;
                }
            } else {
                int i15 = 0;
                while (true) {
                    i[] iVarArr2 = this.M;
                    if (i15 >= iVarArr2.length) {
                        z11 = false;
                        break;
                    }
                    if (iVarArr2[i15].e(this.O)) {
                        i iVar = this.M[i15];
                        this.F = iVar.f90380b;
                        this.G = iVar.f90381c;
                        this.H = iVar.f90384f;
                        this.S = iVar.f90382d;
                        break;
                    }
                    i15++;
                }
                if (this.N != null && z11) {
                    this.P = null;
                    int i16 = 0;
                    while (true) {
                        i[] iVarArr3 = this.N;
                        if (i16 >= iVarArr3.length) {
                            break;
                        }
                        if (iVarArr3[i16].e(this.O)) {
                            this.P = this.N[i16];
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (!z11) {
                i iVar2 = this.P;
                if (iVar2 == null) {
                    int[] iArr = this.Q;
                    if (iArr == null) {
                        throw new TextWritingException("Cannot write with the given configuration. No default field lengths defined and no lookahead/lookbehind value match '" + new String(this.O) + '\'', y(), objArr);
                    }
                    this.F = iArr;
                    this.G = this.R;
                    this.H = this.V;
                    this.S = this.T;
                } else {
                    this.F = iVar2.f90380b;
                    this.G = iVar2.f90381c;
                    this.H = iVar2.f90384f;
                    this.S = iVar2.f90382d;
                }
            }
        }
        if (this.f78079v) {
            objArr = r(objArr, this.F.length - this.U, null);
        }
        int[] iArr2 = this.F;
        int length3 = iArr2.length < objArr.length ? iArr2.length : objArr.length;
        int i17 = 0;
        for (int i18 = 0; i18 < length3 + i17; i18++) {
            int i19 = this.F[i18];
            this.K = i19;
            if (this.S[i18]) {
                i17++;
                this.f78071n.c(' ', i19);
            } else {
                this.L = this.G[i18];
                this.I = this.H[i18];
                if (this.f78076s) {
                    if (this.W) {
                        this.I = this.J;
                    }
                    FieldAlignment fieldAlignment = this.X;
                    if (fieldAlignment != null) {
                        this.L = fieldAlignment;
                    }
                }
                H1(A(objArr[i18 - i17]), i(i18));
                l();
            }
        }
    }

    public g(Writer writer, h hVar) {
        super(writer, hVar);
    }

    public g(File file, h hVar) {
        super(file, hVar);
    }

    public g(File file, String str, h hVar) {
        super(file, str, hVar);
    }

    public g(File file, Charset charset, h hVar) {
        super(file, charset, hVar);
    }

    public g(OutputStream outputStream, h hVar) {
        super(outputStream, hVar);
    }

    public g(OutputStream outputStream, String str, h hVar) {
        super(outputStream, str, hVar);
    }

    public g(OutputStream outputStream, Charset charset, h hVar) {
        super(outputStream, charset, hVar);
    }
}

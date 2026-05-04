package u90;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<f> {
    public boolean F;
    public char G;
    public char H;
    public char I;

    public e(f fVar) {
        this((Writer) null, fVar);
    }

    private void F1(String str, boolean z11) {
        if (str == null) {
            str = this.f78069l;
        }
        if (str == null) {
            return;
        }
        char c11 = 0;
        int k02 = (z11 && this.B) ? org.junit.jupiter.params.shadow.com.univocity.parsers.common.c.k0(this.f78083z, str) : 0;
        int length = str.length();
        int i11 = k02;
        while (k02 < length) {
            c11 = str.charAt(k02);
            if (c11 == '\t' || c11 == '\n' || c11 == '\r' || c11 == '\\') {
                this.f78071n.p(str, i11, k02);
                i11 = k02 + 1;
                this.f78071n.append(this.G);
                if (c11 == '\t') {
                    this.f78071n.append(this.H);
                } else if (c11 == '\n') {
                    this.f78071n.append(this.F ? this.I : 'n');
                } else if (c11 == '\\') {
                    this.f78071n.append('\\');
                } else {
                    this.f78071n.append(this.F ? this.I : 'r');
                }
            }
            k02++;
        }
        this.f78071n.p(str, i11, k02);
        if (!z11 || c11 > ' ' || !this.C || this.f78083z >= c11) {
            return;
        }
        this.f78071n.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public final void B(f fVar) {
        this.G = ((a) fVar.o()).q();
        this.H = ((a) fVar.o()).s();
        this.F = fVar.A0();
        this.I = ((a) fVar.o()).g();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c
    public void g0(Object[] objArr) {
        String str;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (i11 != 0) {
                j('\t');
            }
            String A = A(objArr[i11]);
            boolean i12 = i(i11);
            int length = this.f78071n.length();
            F1(A, i12);
            if (this.f78071n.length() == length && (str = this.f78069l) != null && !str.isEmpty()) {
                F1(this.f78069l, i12);
            }
            l();
        }
    }

    public e(Writer writer, f fVar) {
        super(writer, fVar);
    }

    public e(File file, f fVar) {
        super(file, fVar);
    }

    public e(File file, String str, f fVar) {
        super(file, str, fVar);
    }

    public e(File file, Charset charset, f fVar) {
        super(file, charset, fVar);
    }

    public e(OutputStream outputStream, f fVar) {
        super(outputStream, fVar);
    }

    public e(OutputStream outputStream, String str, f fVar) {
        super(outputStream, str, fVar);
    }

    public e(OutputStream outputStream, Charset charset, f fVar) {
        super(outputStream, charset, fVar);
    }
}

package k90;

import java.io.IOException;
import java.io.Writer;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends f {

    /* renamed from: h, reason: collision with root package name */
    public final char f66097h;

    /* renamed from: i, reason: collision with root package name */
    public final char f66098i;

    /* renamed from: j, reason: collision with root package name */
    public final char f66099j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f66100k;

    public k(int i11, String str, int i12, q qVar) {
        super(i11 == -1 ? 8192 : i11, str, i12);
        this.f66100k = true;
        char[] e11 = qVar.e();
        this.f66097h = e11[0];
        this.f66098i = e11.length > 1 ? e11[1] : (char) 0;
        this.f66099j = qVar.g();
    }

    @Override // k90.f, k90.d, k90.a
    public final void B(char c11, char c12) {
        if (c11 != this.f66099j || !this.f66100k) {
            super.B(c11, c12);
            return;
        }
        super.B(this.f66097h, c12);
        char c13 = this.f66098i;
        if (c13 != 0) {
            super.B(c13, c12);
        }
    }

    @Override // k90.f, k90.d, k90.a
    public final void C(char c11) {
        if (c11 != this.f66099j || !this.f66100k) {
            super.C(c11);
            return;
        }
        super.C(this.f66097h);
        char c12 = this.f66098i;
        if (c12 != 0) {
            super.C(c12);
        }
    }

    public final void G() {
        if (this.f66083d + 2 >= this.f66082c.length) {
            n();
        }
        char[] cArr = this.f66082c;
        int i11 = this.f66083d;
        int i12 = i11 + 1;
        this.f66083d = i12;
        cArr[i11] = this.f66097h;
        char c11 = this.f66098i;
        if (c11 != 0) {
            this.f66083d = i11 + 2;
            cArr[i12] = c11;
        }
    }

    public final void H(boolean z11) {
        this.f66100k = z11;
    }

    public final void I(Writer writer) throws IOException {
        int i11 = this.f66083d;
        int i12 = this.f66085f;
        if (i11 - i12 > 0) {
            writer.write(this.f66082c, 0, i11 - i12);
        } else {
            char[] cArr = this.f66081b;
            if (cArr != null) {
                writer.write(cArr, 0, cArr.length);
            }
        }
        this.f66083d = 0;
        this.f66085f = 0;
    }

    @Override // k90.f, k90.d, k90.a
    public final void append(char c11) {
        if (c11 == this.f66099j && this.f66100k) {
            G();
        } else {
            super.append(c11);
        }
    }

    @Override // k90.f, k90.d, k90.a
    public final void d(char c11, char c12) {
        if (c11 != this.f66099j || !this.f66100k) {
            super.d(c11, c12);
            return;
        }
        super.d(this.f66097h, c12);
        char c13 = this.f66098i;
        if (c13 != 0) {
            super.d(c13, c12);
        }
    }
}

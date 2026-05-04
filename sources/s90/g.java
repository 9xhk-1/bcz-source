package s90;

import j90.m;
import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a> {
    public char F;
    public char[] G;
    public char H;
    public char I;
    public char J;
    public boolean K;
    public boolean L;
    public boolean M;
    public char N;
    public boolean O;
    public boolean[] P;
    public char Q;
    public Set<Integer> R;
    public m S;
    public boolean T;

    public g(org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        this((Writer) null, aVar);
    }

    public final boolean F1(int i11, boolean z11, boolean z12, String str) {
        int i12;
        char c11;
        char c12;
        char c13;
        char c14;
        if (str == null && (str = this.f78069l) == null) {
            return z11;
        }
        char c15 = 0;
        int k02 = (z12 && this.B) ? org.junit.jupiter.params.shadow.com.univocity.parsers.common.c.k0(this.f78083z, str) : 0;
        int length = str.length();
        if (k02 < length && (str.charAt(k02) == this.H || (i11 == 0 && str.charAt(0) == this.f78061d))) {
            z11 = true;
        }
        if (z11) {
            if (!this.f78082y || length < 2) {
                G1(k02, z12, str);
                return true;
            }
            if (str.charAt(0) == this.H && str.charAt(length - 1) == this.H) {
                this.f78071n.append(str);
                return false;
            }
            G1(k02, z12, str);
            return true;
        }
        if (this.G == null) {
            i12 = k02;
            while (k02 < length) {
                c15 = str.charAt(k02);
                if (c15 == this.H || c15 == this.F || c15 == this.I || (c15 < this.Q && this.P[c15])) {
                    this.f78071n.p(str, i12, k02);
                    i12 = k02 + 1;
                    if (c15 != this.H && c15 != (c13 = this.I)) {
                        if (c15 == c13 && this.M && (c14 = this.J) != 0 && this.L) {
                            this.f78071n.append(c14);
                        } else if (c15 == this.F || (c15 < this.Q && this.P[c15])) {
                            G1(k02, z12, str);
                            return true;
                        }
                        this.f78071n.append(c15);
                    } else {
                        if (J1(k02, str)) {
                            G1(k02, z12, str);
                            return true;
                        }
                        if (this.L) {
                            G1(k02, z12, str);
                            return z11;
                        }
                        this.f78071n.p(str, k02, length);
                        if (z12 && this.C) {
                            int i13 = length - 1;
                            if (str.charAt(i13) <= ' ' && this.f78083z < str.charAt(i13)) {
                                this.f78071n.o();
                                return z11;
                            }
                        }
                    }
                }
                k02++;
            }
            this.f78071n.p(str, i12, k02);
            if (z12 && c15 <= ' ' && this.C && this.f78083z < c15) {
                this.f78071n.o();
            }
        } else {
            char c16 = 0;
            int i14 = k02;
            while (k02 < length) {
                c16 = str.charAt(k02);
                if (c16 == this.H || ((c16 == this.G[0] && I1(str, k02 + 1)) || c16 == this.I || (c16 < this.Q && this.P[c16]))) {
                    this.f78071n.p(str, i14, k02);
                    i14 = k02 + 1;
                    if (c16 != this.H && c16 != (c11 = this.I)) {
                        if (c16 == c11 && this.M && (c12 = this.J) != 0 && this.L) {
                            this.f78071n.append(c12);
                        } else if ((c16 == this.G[0] && I1(str, i14)) || (c16 < this.Q && this.P[c16])) {
                            G1(k02, z12, str);
                            return true;
                        }
                        this.f78071n.append(c16);
                    } else {
                        if (J1(k02, str)) {
                            G1(k02, z12, str);
                            return true;
                        }
                        if (this.L) {
                            G1(k02, z12, str);
                            return z11;
                        }
                        this.f78071n.p(str, k02, length);
                        if (z12 && this.C) {
                            int i15 = length - 1;
                            if (str.charAt(i15) <= ' ' && this.f78083z < str.charAt(i15)) {
                                this.f78071n.o();
                                return z11;
                            }
                        }
                    }
                }
                k02++;
            }
            c15 = c16;
            i12 = i14;
            this.f78071n.p(str, i12, k02);
            if (z12) {
                this.f78071n.o();
            }
        }
        return z11;
    }

    public final void G1(int i11, boolean z11, String str) {
        char c11;
        int length = str.length();
        char c12 = 0;
        int i12 = i11;
        while (i11 < length) {
            c12 = str.charAt(i11);
            if (c12 == this.H || c12 == this.N || c12 == this.I) {
                this.f78071n.p(str, i12, i11);
                i12 = i11 + 1;
                if (c12 == this.H && this.M) {
                    this.f78071n.append(this.I);
                } else if (c12 == this.I && this.M && (c11 = this.J) != 0) {
                    this.f78071n.append(c11);
                }
                this.f78071n.append(c12);
            }
            i11++;
        }
        this.f78071n.p(str, i12, i11);
        if (!z11 || c12 > ' ' || !this.C || this.f78083z >= c12) {
            return;
        }
        this.f78071n.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public final void B(org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        b bVar = (b) aVar.o();
        char[] charArray = bVar.t().toCharArray();
        this.G = charArray;
        if (charArray.length == 1) {
            this.F = charArray[0];
            this.G = null;
        }
        this.H = bVar.u();
        this.I = bVar.v();
        this.J = ((b) aVar.o()).q();
        this.N = bVar.g();
        this.K = aVar.B0();
        this.T = aVar.E0();
        this.L = aVar.G0();
        this.M = !aVar.I0();
        this.O = !aVar.J0();
        this.P = null;
        this.R = null;
        this.Q = (char) 0;
        this.R = Collections.EMPTY_SET;
        this.S = aVar.F0();
        char[] e11 = bVar.e();
        int length = aVar.A0().length + 3 + e11.length;
        boolean N0 = aVar.N0();
        char[] copyOf = Arrays.copyOf(aVar.A0(), length + (N0 ? 1 : 0));
        if (N0) {
            copyOf[length] = this.H;
        }
        copyOf[length - 1] = '\n';
        copyOf[length - 2] = '\r';
        copyOf[length - 3] = this.N;
        copyOf[length - 4] = e11[0];
        if (e11.length > 1) {
            copyOf[length - 5] = e11[1];
        }
        for (char c11 : copyOf) {
            if (this.Q < c11) {
                this.Q = c11;
            }
        }
        char c12 = this.Q;
        if (c12 != 0) {
            int i11 = (char) (c12 + 1);
            this.Q = i11;
            boolean[] zArr = new boolean[i11];
            this.P = zArr;
            Arrays.fill(zArr, false);
            for (char c13 : copyOf) {
                this.P[c13] = true;
            }
        }
    }

    public final boolean I1(String str, int i11) {
        if ((this.G.length + i11) - 2 >= str.length()) {
            return false;
        }
        int i12 = 1;
        while (i12 < this.G.length) {
            if (str.charAt(i11) != this.G[i12]) {
                return false;
            }
            i12++;
            i11++;
        }
        return true;
    }

    public final boolean J1(int i11, String str) {
        int length = str.length();
        if (this.G == null) {
            if (this.Q == 0) {
                while (i11 < length) {
                    char charAt = str.charAt(i11);
                    if (charAt == this.F || charAt == this.N) {
                        return true;
                    }
                    i11++;
                }
            } else {
                while (i11 < length) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 == this.F || (charAt2 < this.Q && this.P[charAt2])) {
                        return true;
                    }
                    i11++;
                }
            }
        } else if (this.Q == 0) {
            while (i11 < length) {
                char charAt3 = str.charAt(i11);
                if ((charAt3 == this.G[0] && I1(str, i11 + 1)) || charAt3 == this.N) {
                    return true;
                }
                i11++;
            }
        } else {
            while (i11 < length) {
                char charAt4 = str.charAt(i11);
                if ((charAt4 == this.G[0] && I1(str, i11 + 1)) || (charAt4 < this.Q && this.P[charAt4])) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c
    public void g0(Object[] objArr) {
        m mVar;
        if (this.f78068k == 0 && (mVar = this.S) != null) {
            int[] V = mVar.V(this.f78067j);
            if (V.length > 0) {
                this.R = new HashSet();
                for (int i11 : V) {
                    this.R.add(Integer.valueOf(i11));
                }
            }
        }
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (i12 != 0) {
                char[] cArr = this.G;
                if (cArr == null) {
                    j(this.F);
                } else {
                    k(cArr);
                }
            }
            if (this.O) {
                this.f78071n.H(false);
            }
            boolean i13 = i(i12);
            String A = A(objArr[i12]);
            boolean z11 = this.T || objArr[i12] != null;
            int length = this.f78071n.length();
            boolean z12 = F1(i12, z11 && (this.K || this.R.contains(Integer.valueOf(i12))), i13, A) && z11;
            if (this.f78071n.length() == length && !this.f78082y) {
                if (z12) {
                    if (A == null) {
                        F1(i12, false, i13, this.f78069l);
                    } else {
                        F1(i12, true, i13, this.f78070m);
                    }
                } else if (A == null) {
                    F1(i12, false, i13, this.f78069l);
                } else {
                    F1(i12, false, i13, this.f78070m);
                }
            }
            if (z12) {
                j(this.H);
                l();
                j(this.H);
                if (this.O) {
                    this.f78071n.H(true);
                }
            } else {
                l();
            }
        }
    }

    public g(Writer writer, org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        super(writer, aVar);
    }

    public g(File file, org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        super(file, aVar);
    }

    public g(File file, String str, org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        super(file, str, aVar);
    }

    public g(File file, Charset charset, org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        super(file, charset, aVar);
    }

    public g(OutputStream outputStream, org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        super(outputStream, aVar);
    }

    public g(OutputStream outputStream, String str, org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        super(outputStream, str, aVar);
    }

    public g(OutputStream outputStream, Charset charset, org.junit.jupiter.params.shadow.com.univocity.parsers.csv.a aVar) {
        super(outputStream, charset, aVar);
    }
}

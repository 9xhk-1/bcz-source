package t90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.y;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FieldAlignment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.b<e> {
    public FieldAlignment[] A;
    public char[] B;
    public char[] C;
    public Boolean[] D;
    public Boolean[] E;
    public final i[] F;
    public final i[] G;
    public i H;
    public i I;
    public int J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public boolean O;
    public final char P;
    public char Q;
    public FieldAlignment R;
    public final char S;
    public int T;
    public boolean U;
    public k90.i V;
    public final char W;

    /* renamed from: v, reason: collision with root package name */
    public int[] f90367v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f90368w;

    /* renamed from: x, reason: collision with root package name */
    public boolean[] f90369x;

    /* renamed from: y, reason: collision with root package name */
    public boolean[] f90370y;

    /* renamed from: z, reason: collision with root package name */
    public FieldAlignment[] f90371z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends a0 {
        public a(y yVar) {
            super(yVar);
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
        public String[] a() {
            return d.this.H != null ? NormalizedString.toArray(d.this.H.f90385g) : super.a();
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0, org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
        public p90.c k(String[] strArr) {
            if (d.this.H == null) {
                return super.k(strArr);
            }
            if (d.this.H.f90387i == null) {
                d.this.H.d((y) this.f78166a, d.this.H.f90385g);
            }
            return d.this.H.f90387i.k(strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar) {
        super(eVar);
        boolean z11 = false;
        this.U = false;
        this.K = eVar.p1();
        this.L = eVar.o1();
        this.M = eVar.z();
        this.f90367v = eVar.f1();
        this.f90371z = eVar.g1();
        this.B = eVar.i1();
        this.f90369x = eVar.j1();
        this.D = eVar.l1();
        this.N = eVar.k1();
        i[] m12 = eVar.m1();
        this.F = m12;
        i[] n12 = eVar.n1();
        this.G = n12;
        this.W = ((c) eVar.o()).q();
        if (m12 != null || n12 != null) {
            this.U = true;
            this.f90368w = this.f90367v;
            this.A = this.f90371z;
            this.C = this.B;
            this.f90370y = this.f90369x;
            this.E = this.D;
            this.J = i.b(m12, n12);
        }
        c cVar = (c) eVar.o();
        char s11 = cVar.s();
        this.Q = s11;
        this.P = s11;
        this.S = cVar.g();
        if (eVar.q1() && eVar.z0()) {
            z11 = true;
        }
        this.O = z11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.b
    public void D0() {
        boolean z11;
        char c11 = this.f78021i;
        char c12 = this.S;
        if (c11 == c12 && this.M) {
            return;
        }
        if (this.F != null || this.G != null) {
            if (this.U) {
                this.U = false;
                k90.i iVar = new k90.i(this.f78020h, c12, this.f78030r);
                this.V = iVar;
                this.f78020h = iVar;
            }
            this.V.g(this.J);
            if (this.F == null) {
                int i11 = 0;
                while (true) {
                    i[] iVarArr = this.G;
                    if (i11 >= iVarArr.length) {
                        z11 = false;
                        break;
                    }
                    if (this.V.h(this.f78021i, iVarArr[i11].f90379a, this.W)) {
                        this.I = this.G[i11];
                        this.f90367v = this.f90368w;
                        this.f90369x = this.f90370y;
                        this.D = this.E;
                        z11 = true;
                        break;
                    }
                    i11++;
                }
            } else {
                int i12 = 0;
                while (true) {
                    i[] iVarArr2 = this.F;
                    if (i12 >= iVarArr2.length) {
                        z11 = false;
                        break;
                    }
                    if (this.V.h(this.f78021i, iVarArr2[i12].f90379a, this.W)) {
                        i iVar2 = this.F[i12];
                        this.f90367v = iVar2.f90380b;
                        this.f90371z = iVar2.f90381c;
                        this.B = iVar2.f90384f;
                        this.f90369x = iVar2.f90382d;
                        this.D = iVar2.f90383e;
                        this.H = iVar2;
                        z11 = true;
                        break;
                    }
                    i12++;
                }
                if (this.G != null && z11) {
                    this.I = null;
                    int i13 = 0;
                    while (true) {
                        i[] iVarArr3 = this.G;
                        if (i13 >= iVarArr3.length) {
                            break;
                        }
                        if (this.V.h(this.f78021i, iVarArr3[i13].f90379a, this.W)) {
                            this.I = this.G[i13];
                            break;
                        }
                        i13++;
                    }
                }
            }
            if (!z11) {
                i iVar3 = this.I;
                if (iVar3 == null) {
                    int[] iArr = this.f90368w;
                    if (iArr == null) {
                        throw new TextParsingException(this.f78018f, "Cannot process input with the given configuration. No default field lengths defined and no lookahead/lookbehind value match '" + this.V.f(this.f78021i) + '\'');
                    }
                    this.f90367v = iArr;
                    this.f90371z = this.A;
                    this.B = this.C;
                    this.f90369x = this.f90370y;
                    this.D = this.E;
                    this.H = null;
                } else {
                    this.f90367v = iVar3.f90380b;
                    this.f90371z = iVar3.f90381c;
                    this.B = iVar3.f90384f;
                    this.f90369x = iVar3.f90382d;
                    this.D = iVar3.f90383e;
                    this.H = iVar3;
                }
            }
        }
        int i14 = 0;
        while (i14 < this.f90367v.length) {
            Boolean bool = this.D[i14];
            boolean z12 = bool != null ? !bool.booleanValue() : !this.N;
            int[] iArr2 = this.f90367v;
            this.T = iArr2[i14];
            char[] cArr = this.B;
            if (cArr != null) {
                this.Q = this.O ? this.P : cArr[i14];
            }
            FieldAlignment[] fieldAlignmentArr = this.f90371z;
            if (fieldAlignmentArr != null) {
                this.R = fieldAlignmentArr[i14];
            }
            int i15 = i14 + 1;
            boolean z13 = i15 >= iArr2.length;
            if (z12) {
                M0(z13);
            }
            if (this.f78032t) {
                O0(z13, z12);
            }
            if (this.L) {
                L0(z12);
                if (this.f78021i == this.S) {
                    this.f78014b.n();
                    this.O = false;
                    return;
                }
            } else if (this.T > 0) {
                K0(z12);
                if (!z13) {
                    this.f78021i = this.f78020h.c();
                }
            }
            if (this.f90369x[i14]) {
                this.f78014b.f78203g.reset();
            } else {
                this.f78014b.n();
            }
            i14 = i15;
        }
        if (this.K) {
            N0();
        }
        this.O = false;
    }

    public final void K0(boolean z11) {
        this.T--;
        if (this.f78031s) {
            if (this.R == FieldAlignment.RIGHT) {
                this.f78014b.f78203g.C(this.f78021i);
                while (true) {
                    int i11 = this.T;
                    this.T = i11 - 1;
                    if (i11 <= 0) {
                        return;
                    }
                    k90.a aVar = this.f78014b.f78203g;
                    char c11 = this.f78020h.c();
                    this.f78021i = c11;
                    aVar.C(c11);
                }
            } else if (z11) {
                this.f78014b.f78203g.B(this.f78021i, this.Q);
                while (true) {
                    int i12 = this.T;
                    this.T = i12 - 1;
                    if (i12 <= 0) {
                        return;
                    }
                    k90.a aVar2 = this.f78014b.f78203g;
                    char c12 = this.f78020h.c();
                    this.f78021i = c12;
                    aVar2.B(c12, this.Q);
                }
            } else {
                this.f78014b.f78203g.append(this.f78021i);
                while (true) {
                    int i13 = this.T;
                    this.T = i13 - 1;
                    if (i13 <= 0) {
                        return;
                    }
                    k90.a aVar3 = this.f78014b.f78203g;
                    char c13 = this.f78020h.c();
                    this.f78021i = c13;
                    aVar3.append(c13);
                }
            }
        } else if (this.R == FieldAlignment.RIGHT) {
            this.f78014b.f78203g.append(this.f78021i);
            while (true) {
                int i14 = this.T;
                this.T = i14 - 1;
                if (i14 <= 0) {
                    return;
                }
                k90.a aVar4 = this.f78014b.f78203g;
                char c14 = this.f78020h.c();
                this.f78021i = c14;
                aVar4.append(c14);
            }
        } else if (z11) {
            this.f78014b.f78203g.d(this.f78021i, this.Q);
            while (true) {
                int i15 = this.T;
                this.T = i15 - 1;
                if (i15 <= 0) {
                    return;
                }
                k90.a aVar5 = this.f78014b.f78203g;
                char c15 = this.f78020h.c();
                this.f78021i = c15;
                aVar5.d(c15, this.Q);
            }
        } else {
            this.f78014b.f78203g.append(this.f78021i);
            while (true) {
                int i16 = this.T;
                this.T = i16 - 1;
                if (i16 <= 0) {
                    return;
                }
                k90.a aVar6 = this.f78014b.f78203g;
                char c16 = this.f78020h.c();
                this.f78021i = c16;
                aVar6.append(c16);
            }
        }
    }

    public final void L0(boolean z11) {
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        if (this.f78031s) {
            if (this.R == FieldAlignment.RIGHT) {
                while (true) {
                    int i11 = this.T;
                    this.T = i11 - 1;
                    if (i11 <= 0 || (c16 = this.f78021i) == this.S) {
                        return;
                    }
                    this.f78014b.f78203g.C(c16);
                    this.f78021i = this.f78020h.c();
                }
            } else if (z11) {
                while (true) {
                    int i12 = this.T;
                    this.T = i12 - 1;
                    if (i12 <= 0 || (c15 = this.f78021i) == this.S) {
                        return;
                    }
                    this.f78014b.f78203g.B(c15, this.Q);
                    this.f78021i = this.f78020h.c();
                }
            } else {
                while (true) {
                    int i13 = this.T;
                    this.T = i13 - 1;
                    if (i13 <= 0 || (c14 = this.f78021i) == this.S) {
                        return;
                    }
                    this.f78014b.f78203g.append(c14);
                    this.f78021i = this.f78020h.c();
                }
            }
        } else if (this.R == FieldAlignment.RIGHT) {
            while (true) {
                int i14 = this.T;
                this.T = i14 - 1;
                if (i14 <= 0 || (c13 = this.f78021i) == this.S) {
                    return;
                }
                this.f78014b.f78203g.append(c13);
                this.f78021i = this.f78020h.c();
            }
        } else if (z11) {
            while (true) {
                int i15 = this.T;
                this.T = i15 - 1;
                if (i15 <= 0 || (c12 = this.f78021i) == this.S) {
                    return;
                }
                this.f78014b.f78203g.d(c12, this.Q);
                this.f78021i = this.f78020h.c();
            }
        } else {
            while (true) {
                int i16 = this.T;
                this.T = i16 - 1;
                if (i16 <= 0 || (c11 = this.f78021i) == this.S) {
                    return;
                }
                this.f78014b.f78203g.append(c11);
                this.f78021i = this.f78020h.c();
            }
        }
    }

    public final void M0(boolean z11) {
        while (this.f78021i == this.Q) {
            int i11 = this.T;
            int i12 = i11 - 1;
            this.T = i12;
            if (i11 <= 0) {
                return;
            }
            if (!z11 || i12 > 0) {
                this.f78021i = this.f78020h.c();
            }
        }
    }

    public final void N0() {
        while (this.f78021i != this.S) {
            try {
                this.f78021i = this.f78020h.c();
            } catch (EOFException unused) {
                return;
            }
        }
    }

    public final void O0(boolean z11, boolean z12) {
        while (true) {
            char c11 = this.f78021i;
            if ((c11 > ' ' || this.f78030r >= c11) && c11 != this.Q) {
                return;
            }
            if (!z12 && c11 == this.Q) {
                return;
            }
            int i11 = this.T;
            int i12 = i11 - 1;
            this.T = i12;
            if (i11 <= 0) {
                return;
            }
            if (!z11 || i12 > 0) {
                this.f78021i = this.f78020h.c();
            }
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.b
    public y j() {
        y j11 = super.j();
        return (this.F == null && this.G == null) ? j11 : new a(j11);
    }
}

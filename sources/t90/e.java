package t90;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FieldAlignment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<c> {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public b E;
    public Map<String, b> F;
    public Map<String, b> G;

    public e(b bVar) {
        this.A = false;
        this.B = false;
        this.C = true;
        this.D = false;
        this.F = new HashMap();
        this.G = new HashMap();
        if (bVar == null) {
            throw new IllegalArgumentException("Field lengths cannot be null");
        }
        this.E = bVar;
        NormalizedString[] A = bVar.A();
        if (A != null) {
            Q(NormalizedString.toArray(A));
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f
    public k90.a B0() {
        return new k90.d(t(), v(), A());
    }

    public void X0(String str, b bVar) {
        i.f(str, bVar, this.F);
    }

    public void Y0(String str, b bVar) {
        i.g(str, bVar, this.G);
    }

    public final int[] Z0() {
        return i.a(this.E, this.F, this.G);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f, org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void a(Map<String, Object> map) {
        super.a(map);
        map.put("Skip trailing characters until new line", Boolean.valueOf(this.A));
        map.put("Record ends on new line", Boolean.valueOf(this.B));
        b bVar = this.E;
        map.put("Field lengths", bVar == null ? "<null>" : bVar.toString());
        map.put("Lookahead formats", this.F);
        map.put("Lookbehind formats", this.G);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        return (e) super.clone();
    }

    public final e b1(b bVar) {
        return d1(true, bVar);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f
    @Deprecated
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public final e e(boolean z11) {
        b bVar = this.E;
        return d1(z11, bVar == null ? null : bVar.clone());
    }

    public final e d1(boolean z11, b bVar) {
        e eVar = (e) super.e(z11);
        eVar.E = bVar;
        if (z11) {
            eVar.F = new HashMap();
            eVar.G = new HashMap();
            return eVar;
        }
        eVar.F = new HashMap(this.F);
        eVar.G = new HashMap(this.G);
        return eVar;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public c f() {
        return new c();
    }

    public int[] f1() {
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        return bVar.x();
    }

    public FieldAlignment[] g1() {
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        return bVar.y();
    }

    public int[] h1() {
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        return bVar.z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public char[] i1() {
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        return bVar.E((c) o());
    }

    public boolean[] j1() {
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        return bVar.G();
    }

    public final boolean k1() {
        return this.D;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f
    public void l0(Class<?> cls) {
        if (this.E == null) {
            try {
                this.E = b.t(cls);
                g90.h s11 = h90.a.s(cls);
                if (this.f78094o == null && s11 != null) {
                    N0(s11.extract());
                }
            } catch (IllegalArgumentException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
        if (this.f78094o == null) {
            N0(false);
        }
        super.l0(cls);
        if (z0()) {
            return;
        }
        b.X(this.E, this);
    }

    public Boolean[] l1() {
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        Boolean[] J = bVar.J();
        Boolean[] boolArr = new Boolean[J.length];
        Arrays.fill(boolArr, Boolean.valueOf(k1()));
        for (int i11 = 0; i11 < J.length; i11++) {
            Boolean bool = J[i11];
            if (bool != null) {
                boolArr[i11] = bool;
            }
        }
        return boolArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i[] m1() {
        return i.c(this.F, (c) o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i[] n1() {
        return i.c(this.G, (c) o());
    }

    public boolean o1() {
        return this.B;
    }

    public boolean p1() {
        return this.A;
    }

    public boolean q1() {
        return this.C;
    }

    public final void r1(boolean z11) {
        this.D = z11;
    }

    public void s1(boolean z11) {
        this.B = z11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public int t() {
        int t11 = super.t();
        int i11 = 0;
        for (int i12 : Z0()) {
            i11 += i12 + 2;
        }
        return t11 > i11 ? t11 : i11;
    }

    public void t1(boolean z11) {
        this.A = z11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public int u() {
        int u11 = super.u();
        int length = Z0().length;
        return u11 > length ? u11 : length;
    }

    public void u1(boolean z11) {
        this.C = z11;
    }

    public e() {
        this.A = false;
        this.B = false;
        this.C = true;
        this.D = false;
        this.F = new HashMap();
        this.G = new HashMap();
        this.E = null;
    }
}

package s90;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.UnescapedQuoteHandling;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<b> {
    public String A = null;
    public boolean B = true;
    public boolean C = true;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = true;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public UnescapedQuoteHandling L = null;
    public char[] M = null;
    public int N = 20;

    @Deprecated
    public void A1(boolean z11) {
        this.B = z11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f
    public k90.a B0() {
        int t11 = t();
        return t11 != -1 ? new k90.d(t11, this.A, A()) : new k90.f(this.A, A());
    }

    @Deprecated
    public void B1(boolean z11) {
        if (z11) {
            this.B = true;
        }
        this.C = z11;
    }

    public final void C1(boolean z11) {
        this.K = z11;
    }

    public void D1(UnescapedQuoteHandling unescapedQuoteHandling) {
        this.L = unescapedQuoteHandling;
    }

    public final void E1(boolean z11) {
        w1(z11);
        v1(z11);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        return (e) super.clone();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final e e(boolean z11) {
        return (e) super.e(z11);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return new b();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.f, org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void a(Map<String, Object> map) {
        super.a(map);
        map.put("Empty value", this.A);
        map.put("Unescaped quote handling", this.L);
        map.put("Escape unquoted values", Boolean.valueOf(this.D));
        map.put("Keep escape sequences", Boolean.valueOf(this.E));
        map.put("Keep quotes", Boolean.valueOf(this.F));
        map.put("Normalize escaped line separators", Boolean.valueOf(this.G));
        map.put("Autodetect column delimiter", Boolean.valueOf(this.J));
        map.put("Autodetect quotes", Boolean.valueOf(this.K));
        map.put("Delimiters for detection", Arrays.toString(this.M));
        map.put("Ignore leading whitespaces in quotes", Boolean.valueOf(this.I));
        map.put("Ignore trailing whitespaces in quotes", Boolean.valueOf(this.H));
    }

    public final void a1() {
        b1(new char[0]);
    }

    public final void b1(char... cArr) {
        r1(true, cArr);
        C1(true);
        P0(true);
    }

    public final char[] c1() {
        return this.M;
    }

    public String d1() {
        return this.A;
    }

    public int e1() {
        return this.N;
    }

    public boolean f1() {
        return this.I;
    }

    public boolean g1() {
        return this.H;
    }

    public boolean h1() {
        return this.F;
    }

    public UnescapedQuoteHandling i1() {
        return this.L;
    }

    public final boolean j1() {
        return this.J;
    }

    public boolean k1() {
        return this.D;
    }

    public final boolean l1() {
        return this.E;
    }

    public boolean m1() {
        return this.G;
    }

    @Deprecated
    public boolean n1() {
        if (this.B) {
            return true;
        }
        UnescapedQuoteHandling unescapedQuoteHandling = this.L;
        return (unescapedQuoteHandling == null || unescapedQuoteHandling == UnescapedQuoteHandling.RAISE_ERROR) ? false : true;
    }

    @Deprecated
    public boolean o1() {
        UnescapedQuoteHandling unescapedQuoteHandling;
        return (this.C && n1()) || (unescapedQuoteHandling = this.L) == UnescapedQuoteHandling.STOP_AT_DELIMITER || unescapedQuoteHandling == UnescapedQuoteHandling.SKIP_VALUE;
    }

    public final boolean p1() {
        return this.K;
    }

    public final void q1(boolean z11) {
        r1(z11, new char[0]);
    }

    public final void r1(boolean z11, char... cArr) {
        this.J = z11;
        this.M = cArr;
    }

    public void s1(String str) {
        this.A = str;
    }

    public void t1(boolean z11) {
        this.D = z11;
    }

    public void u1(int i11) {
        if (i11 <= 0) {
            i11 = 20;
        }
        this.N = i11;
    }

    public void v1(boolean z11) {
        this.I = z11;
    }

    public void w1(boolean z11) {
        this.H = z11;
    }

    public final void x1(boolean z11) {
        this.E = z11;
    }

    public void y1(boolean z11) {
        this.F = z11;
    }

    public void z1(boolean z11) {
        this.G = z11;
    }
}

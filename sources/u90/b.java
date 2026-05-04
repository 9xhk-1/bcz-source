package u90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.b<c> {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f92084v;

    /* renamed from: w, reason: collision with root package name */
    public final char f92085w;

    /* renamed from: x, reason: collision with root package name */
    public final char f92086x;

    /* renamed from: y, reason: collision with root package name */
    public final char f92087y;

    /* JADX WARN: Multi-variable type inference failed */
    public b(c cVar) {
        super(cVar);
        this.f92084v = cVar.a1();
        a aVar = (a) cVar.o();
        this.f92085w = aVar.g();
        this.f92086x = ((a) cVar.o()).q();
        this.f92087y = aVar.s();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.b
    public void D0() {
        char c11;
        if (this.f78032t && (c11 = this.f78021i) != '\t' && c11 <= ' ' && this.f78030r < c11) {
            this.f78021i = this.f78020h.p(c11, '\t', this.f92086x);
        }
        while (this.f78021i != this.f92085w) {
            J0();
            if (this.f78021i != this.f92085w) {
                char c12 = this.f78020h.c();
                this.f78021i = c12;
                if (c12 == this.f92085w) {
                    this.f78014b.b();
                }
            }
        }
    }

    public final void J0() {
        char c11;
        char c12;
        if (this.f78032t && (c12 = this.f78021i) != '\t' && c12 <= ' ' && this.f78030r < c12) {
            this.f78021i = this.f78020h.p(c12, '\t', this.f92086x);
        }
        if (this.f78021i == '\t') {
            this.f78014b.b();
            return;
        }
        while (true) {
            char c13 = this.f78021i;
            if (c13 == '\t' || c13 == (c11 = this.f92085w)) {
                break;
            }
            char c14 = this.f92086x;
            if (c13 == c14) {
                char c15 = this.f78020h.c();
                this.f78021i = c15;
                if (c15 == 't' || c15 == this.f92087y) {
                    this.f78014b.f78203g.append('\t');
                } else if (c15 == 'n') {
                    this.f78014b.f78203g.append('\n');
                } else if (c15 == '\\') {
                    this.f78014b.f78203g.append('\\');
                } else if (c15 == 'r') {
                    this.f78014b.f78203g.append('\r');
                } else {
                    char c16 = this.f92085w;
                    if (c15 != c16 || !this.f92084v) {
                        this.f78014b.f78203g.append(this.f92086x);
                        char c17 = this.f78021i;
                        if (c17 == this.f92085w || c17 == '\t') {
                            break;
                        } else {
                            this.f78014b.f78203g.append(c17);
                        }
                    } else {
                        this.f78014b.f78203g.append(c16);
                    }
                }
                this.f78021i = this.f78020h.c();
            } else {
                this.f78021i = this.f78014b.f78203g.r(c13, this.f78020h, '\t', c14, c11);
            }
        }
        this.f78014b.n();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.b
    public void v() {
        this.f78014b.f78212p = this.f78031s;
    }
}

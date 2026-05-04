package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final e0 f70064a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f70065b;

    public s(@m80.k e0 writer) {
        kotlin.jvm.internal.g0.p(writer, "writer");
        this.f70064a = writer;
        this.f70065b = true;
    }

    public final boolean a() {
        return this.f70065b;
    }

    public void b() {
        this.f70065b = true;
    }

    public void c() {
        this.f70065b = false;
    }

    public void d() {
        this.f70065b = false;
    }

    public void e(byte b11) {
        this.f70064a.writeLong(b11);
    }

    public final void f(char c11) {
        this.f70064a.a(c11);
    }

    public void g(double d11) {
        this.f70064a.c(String.valueOf(d11));
    }

    public void h(float f11) {
        this.f70064a.c(String.valueOf(f11));
    }

    public void i(int i11) {
        this.f70064a.writeLong(i11);
    }

    public void j(long j11) {
        this.f70064a.writeLong(j11);
    }

    public final void k(@m80.k String v11) {
        kotlin.jvm.internal.g0.p(v11, "v");
        this.f70064a.c(v11);
    }

    public void l(short s11) {
        this.f70064a.writeLong(s11);
    }

    public void m(boolean z11) {
        this.f70064a.c(String.valueOf(z11));
    }

    public void n(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f70064a.b(value);
    }

    public final void o(boolean z11) {
        this.f70065b = z11;
    }

    public void p() {
    }

    public void q() {
    }
}

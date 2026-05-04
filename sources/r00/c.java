package r00;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.io.ReadAfterEOFException;
import kotlin.jvm.internal.g0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ConsoleKt")
/* loaded from: classes8.dex */
public final class c {
    @o00.f
    public static final void a(byte b11) {
        System.out.print(Byte.valueOf(b11));
    }

    @o00.f
    public static final void b(char c11) {
        System.out.print(c11);
    }

    @o00.f
    public static final void c(double d11) {
        System.out.print(d11);
    }

    @o00.f
    public static final void d(float f11) {
        System.out.print(f11);
    }

    @o00.f
    public static final void e(int i11) {
        System.out.print(i11);
    }

    @o00.f
    public static final void f(long j11) {
        System.out.print(j11);
    }

    @o00.f
    public static final void g(Object obj) {
        System.out.print(obj);
    }

    @o00.f
    public static final void h(short s11) {
        System.out.print(Short.valueOf(s11));
    }

    @o00.f
    public static final void i(boolean z11) {
        System.out.print(z11);
    }

    @o00.f
    public static final void j(char[] message) {
        g0.p(message, "message");
        System.out.print(message);
    }

    @o00.f
    public static final void k() {
        System.out.println();
    }

    @o00.f
    public static final void l(byte b11) {
        System.out.println(Byte.valueOf(b11));
    }

    @o00.f
    public static final void m(char c11) {
        System.out.println(c11);
    }

    @o00.f
    public static final void n(double d11) {
        System.out.println(d11);
    }

    @o00.f
    public static final void o(float f11) {
        System.out.println(f11);
    }

    @o00.f
    public static final void p(int i11) {
        System.out.println(i11);
    }

    @o00.f
    public static final void q(long j11) {
        System.out.println(j11);
    }

    @o00.f
    public static final void r(Object obj) {
        System.out.println(obj);
    }

    @o00.f
    public static final void s(short s11) {
        System.out.println(Short.valueOf(s11));
    }

    @o00.f
    public static final void t(boolean z11) {
        System.out.println(z11);
    }

    @o00.f
    public static final void u(char[] message) {
        g0.p(message, "message");
        System.out.println(message);
    }

    @m80.l
    public static final String v() {
        p pVar = p.f82808a;
        InputStream in2 = System.in;
        g0.o(in2, "in");
        Charset defaultCharset = Charset.defaultCharset();
        g0.o(defaultCharset, "defaultCharset(...)");
        return pVar.d(in2, defaultCharset);
    }

    @y0(version = "1.6")
    @m80.k
    public static final String w() {
        String x11 = x();
        if (x11 != null) {
            return x11;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @m80.l
    @y0(version = "1.6")
    public static final String x() {
        return v();
    }
}

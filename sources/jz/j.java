package jz;

import kotlin.jvm.internal.g0;
import y40.c0;
import y40.x;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f64752a = new y40.b();

    @m80.k
    public static final c0 a(@m80.k byte[] array, int i11, int i12) {
        g0.p(array, "array");
        y40.b bVar = new y40.b();
        bVar.write(array, i11, i12 + i11);
        return bVar;
    }

    public static /* synthetic */ c0 c(byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return a(bArr, i11, i12);
    }

    @yz.n(message = "Use Buffer instead", replaceWith = @w0(expression = "Buffer()", imports = {"kotlinx.io.Buffer"}))
    @m80.k
    public static final y40.b d() {
        return new y40.b();
    }

    @yz.n(message = "Use Buffer instead", replaceWith = @w0(expression = "Buffer()", imports = {"kotlinx.io.Buffer"}))
    @m80.k
    public static final y40.b e(@m80.k pz.h<?> pool) {
        g0.p(pool, "pool");
        return new y40.b();
    }

    @m80.k
    public static final c0 f(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return c0Var.getBuffer().e();
    }

    public static final long g(@m80.k c0 c0Var, long j11) {
        g0.p(c0Var, "<this>");
        c0Var.request(j11);
        long min = Math.min(j11, j(c0Var));
        c0Var.getBuffer().skip(min);
        return min;
    }

    public static /* synthetic */ long h(c0 c0Var, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return g(c0Var, j11);
    }

    @m80.k
    public static final c0 i() {
        return f64752a;
    }

    public static final long j(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return c0Var.getBuffer().r();
    }

    public static final <T> T l(@m80.k x xVar, @m80.k x00.l<? super c0, ? extends T> function) {
        g0.p(xVar, "<this>");
        g0.p(function, "function");
        c0 peek = xVar.getBuffer().peek();
        try {
            T invoke = function.invoke(peek);
            u00.a.c(peek, null);
            return invoke;
        } finally {
        }
    }

    public static final <T> T m(@m80.k c0 c0Var, @m80.k x00.l<? super c0, ? extends T> function) {
        g0.p(c0Var, "<this>");
        g0.p(function, "function");
        c0 peek = c0Var.getBuffer().peek();
        try {
            T invoke = function.invoke(peek);
            u00.a.c(peek, null);
            return invoke;
        } finally {
        }
    }

    public static final int n(@m80.k c0 c0Var, @m80.k y40.b out) {
        g0.p(c0Var, "<this>");
        g0.p(out, "out");
        long r11 = c0Var.getBuffer().r();
        out.T(c0Var);
        return (int) r11;
    }

    public static final void o(@m80.k c0 c0Var, @m80.k byte[] out, int i11, int i12) {
        g0.p(c0Var, "<this>");
        g0.p(out, "out");
        y40.g0.o(c0Var, out, i11, i12 + i11);
    }

    public static /* synthetic */ void p(c0 c0Var, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length - i11;
        }
        o(c0Var, bArr, i11, i12);
    }

    public static final short q(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return y40.g0.n(c0Var.getBuffer());
    }

    @yz.n(message = "Use close instead", replaceWith = @w0(expression = "this.close()", imports = {}))
    public static final void r(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        c0Var.close();
    }

    public static final void s(@m80.k c0 c0Var, @m80.k x00.l<? super y40.b, Boolean> block) {
        g0.p(c0Var, "<this>");
        g0.p(block, "block");
        while (!c0Var.J() && block.invoke(c0Var.getBuffer()).booleanValue()) {
        }
    }

    @yz.n(message = "Use Source instead", replaceWith = @w0(expression = "Source", imports = {"kotlinx.io.Source"}))
    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void k(c0 c0Var) {
    }
}

package f80;

import com.alipay.sdk.m.u.i;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.fusesource.jansi.AnsiColors;
import org.fusesource.jansi.AnsiMode;
import org.fusesource.jansi.AnsiType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends PrintStream {
    public g(h80.a aVar, boolean z11) {
        super(aVar, z11);
    }

    public void C() throws IOException {
        h80.a e11 = e();
        if (e11 != null) {
            e11.I();
        }
    }

    public AnsiColors a() {
        return e().a();
    }

    public AnsiMode c() {
        return e().c();
    }

    public h80.a e() {
        return (h80.a) ((PrintStream) this).out;
    }

    public int f() {
        return e().e();
    }

    public AnsiType j() {
        return e().f();
    }

    public void k() throws IOException {
        e().j();
    }

    public boolean q() {
        return e().k();
    }

    public void r(AnsiMode ansiMode) {
        e().E(ansiMode);
    }

    public String toString() {
        return "AnsiPrintStream{type=" + j() + ", colors=" + a() + ", mode=" + c() + ", resetAtUninstall=" + q() + i.f11099d;
    }

    public void w(boolean z11) {
        e().H(z11);
    }

    public g(h80.a aVar, boolean z11, String str) throws UnsupportedEncodingException {
        super(aVar, z11, str);
    }
}

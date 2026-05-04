package yy;

import io.ktor.utils.io.m;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    @k
    public static final BufferedWriter a(@k m mVar, @k Charset charset) {
        g0.p(mVar, "<this>");
        g0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(mz.a.c(mVar), charset), 8192);
    }

    public static /* synthetic */ BufferedWriter b(m mVar, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return a(mVar, charset);
    }

    @k
    public static final Writer c(@k m mVar, @k Charset charset) {
        g0.p(mVar, "<this>");
        g0.p(charset, "charset");
        return new OutputStreamWriter(mz.a.c(mVar), charset);
    }

    public static /* synthetic */ Writer d(m mVar, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return c(mVar, charset);
    }
}

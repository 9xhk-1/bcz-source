package io.ktor.utils.io;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    @m80.k
    public static final g a(@m80.k String text, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return e(jz.s.l(text, charset), 0, 0, 6, null);
    }

    @m80.k
    public static final g b(@m80.k y40.c0 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        return new k0(source);
    }

    @m80.k
    public static final g c(@m80.k byte[] content, int i11, int i12) {
        kotlin.jvm.internal.g0.p(content, "content");
        y40.b bVar = new y40.b();
        bVar.write(content, i11, i12 + i11);
        return b(bVar);
    }

    public static /* synthetic */ g d(String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        return a(str, charset);
    }

    public static /* synthetic */ g e(byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return c(bArr, i11, i12);
    }
}

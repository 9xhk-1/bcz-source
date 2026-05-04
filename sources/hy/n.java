package hy;

import java.io.File;
import java.io.IOException;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final File f59982b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ix.k f59983c;

    public /* synthetic */ n(File file, ix.k kVar, int i11, kotlin.jvm.internal.v vVar) {
        this(file, (i11 & 2) != 0 ? ix.h0.a(ix.k.f62843f, file) : kVar);
    }

    @Override // mx.v
    @m80.k
    public Long a() {
        return Long.valueOf(this.f59982b.length());
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f59983c;
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g m() {
        return yy.f.e(this.f59982b, 0L, 0L, null, 7, null);
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g n(@m80.k g10.o range) {
        kotlin.jvm.internal.g0.p(range, "range");
        return yy.f.e(this.f59982b, range.d(), range.f(), null, 4, null);
    }

    @m80.k
    public final File o() {
        return this.f59982b;
    }

    public n(@m80.k File file, @m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(file, "file");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f59982b = file;
        this.f59983c = contentType;
        if (file.exists()) {
            mx.g0.d(this, a00.r0.J4(mx.g0.c(this), m.a(file.lastModified())));
        } else {
            throw new IOException("No such file " + file.getAbsolutePath());
        }
    }
}

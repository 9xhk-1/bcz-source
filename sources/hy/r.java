package hy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.List;
import mx.v;
import t00.w2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Path f59988b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ix.k f59989c;

    public /* synthetic */ r(Path path, ix.k kVar, int i11, kotlin.jvm.internal.v vVar) {
        this(path, (i11 & 2) != 0 ? ix.l0.e(ix.k.f62843f, w2.W0(path)) : kVar);
    }

    @Override // mx.v
    @m80.k
    public Long a() {
        long size;
        size = Files.size(this.f59988b);
        return Long.valueOf(size);
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f59989c;
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g m() {
        return yy.c.b(this.f59988b, 0L, 0L, null, 7, null);
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g n(@m80.k g10.o range) {
        kotlin.jvm.internal.g0.p(range, "range");
        return yy.c.b(this.f59988b, range.d(), range.f(), null, 4, null);
    }

    @m80.k
    public final Path o() {
        return this.f59988b;
    }

    public r(@m80.k Path path, @m80.k ix.k contentType) {
        boolean exists;
        FileTime lastModifiedTime;
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f59988b = path;
        this.f59989c = contentType;
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            lastModifiedTime = Files.getLastModifiedTime(path, new LinkOption[0]);
            List<mx.e0> c11 = mx.g0.c(this);
            kotlin.jvm.internal.g0.m(lastModifiedTime);
            mx.g0.d(this, a00.r0.J4(c11, m.b(lastModifiedTime)));
            return;
        }
        throw new IOException("No such path " + path);
    }
}

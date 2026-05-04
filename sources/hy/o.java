package hy;

import java.io.File;
import java.nio.file.Path;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {
    @m80.k
    public static final n a(@m80.k File baseDir, @m80.k String relativePath, @m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(baseDir, "baseDir");
        kotlin.jvm.internal.g0.p(relativePath, "relativePath");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        return new n(xy.n1.b(baseDir, relativePath), contentType);
    }

    @yz.n(message = "Use LocalPathContent instead", replaceWith = @yz.w0(expression = "LocalPathContent(baseDir, relativePath, contentType)", imports = {"io.ktor.server.http.content.LocalPathContent"}))
    @m80.k
    public static final r b(@m80.k Path baseDir, @m80.k Path relativePath, @m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(baseDir, "baseDir");
        kotlin.jvm.internal.g0.p(relativePath, "relativePath");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        return new r(xy.k1.b(baseDir, relativePath), contentType);
    }

    public static /* synthetic */ n c(File file, String str, ix.k kVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            kVar = ix.l0.f(ix.k.f62843f, str);
        }
        return a(file, str, kVar);
    }

    public static /* synthetic */ r d(Path path, Path path2, ix.k kVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            kVar = ix.h0.b(ix.k.f62843f, path2);
        }
        return b(path, path2, kVar);
    }

    @m80.k
    public static final r e(@m80.k Path baseDir, @m80.k Path relativePath, @m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(baseDir, "baseDir");
        kotlin.jvm.internal.g0.p(relativePath, "relativePath");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        return new r(xy.k1.b(baseDir, relativePath), contentType);
    }

    public static /* synthetic */ r f(Path path, Path path2, ix.k kVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            kVar = ix.h0.b(ix.k.f62843f, path2);
        }
        return e(path, path2, kVar);
    }
}

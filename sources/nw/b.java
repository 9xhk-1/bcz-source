package nw;

import ix.l0;
import java.io.File;
import kotlin.jvm.internal.g0;
import m80.k;
import xy.n1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final a a(@k File baseDir, @k String relativePath, @k ix.k contentType) {
        g0.p(baseDir, "baseDir");
        g0.p(relativePath, "relativePath");
        g0.p(contentType, "contentType");
        return new a(n1.b(baseDir, relativePath), contentType);
    }

    public static /* synthetic */ a b(File file, String str, ix.k kVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            kVar = l0.f(ix.k.f62843f, str);
        }
        return a(file, str, kVar);
    }
}

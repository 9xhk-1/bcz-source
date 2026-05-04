package io.ktor.server.engine;

import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e1 {
    public static final boolean a(@m80.k URL url, @m80.k String pattern) {
        char c11;
        String y22;
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(pattern, "pattern");
        String path = url.getPath();
        if (path == null || (y22 = u30.f0.y2(path, (c11 = File.separatorChar), '/', false, 4, null)) == null) {
            return false;
        }
        return u30.k0.k3(y22, u30.f0.y2(pattern, c11, '/', false, 4, null), true);
    }
}

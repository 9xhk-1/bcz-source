package hy;

import io.ktor.http.CacheControl;
import java.time.ZonedDateTime;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @m80.k
    public static final mx.d a(@m80.l CacheControl cacheControl, @m80.k ZonedDateTime expires) {
        kotlin.jvm.internal.g0.p(expires, "expires");
        return new mx.d(cacheControl, ty.f.d(expires));
    }

    public static /* synthetic */ mx.d b(CacheControl cacheControl, ZonedDateTime zonedDateTime, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cacheControl = null;
        }
        return a(cacheControl, zonedDateTime);
    }
}

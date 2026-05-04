package mx;

import java.io.InputStream;
import mx.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s {
    @m80.k
    public static final x00.a<InputStream> a(@m80.k b0.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        throw new IllegalStateException("streamProvider is deprecated. Use provider() instead");
    }

    @yz.n(message = "This API uses blocking InputStream. Please use provider() directly.")
    public static /* synthetic */ void b(b0.c cVar) {
    }
}

package zx;

import kotlin.DeprecationLevel;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface f {
    @m80.k
    hx.c a();

    @m80.k
    ClassLoader b();

    @m80.k
    Logger c();

    @m80.k
    ey.a getConfig();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to Application", replaceWith = @yz.w0(expression = "EmbeddedServer.monitor", imports = {"io.ktor.server.engine.EmbeddedServer"}))
        public static /* synthetic */ void a() {
        }
    }
}

package ix;

import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface z1 {
    @m80.k
    String A();

    @m80.k
    String B();

    int C();

    int a();

    @m80.k
    String b();

    @m80.k
    String getLocalAddress();

    int getLocalPort();

    @m80.k
    e1 getMethod();

    @m80.k
    String getScheme();

    @m80.k
    String getUri();

    @m80.k
    String getVersion();

    @m80.k
    String l();

    int y();

    @m80.k
    String z();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @yz.n(level = DeprecationLevel.ERROR, message = "Use localHost or serverHost instead")
        public static /* synthetic */ void a() {
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Use localPort or serverPort instead")
        public static /* synthetic */ void b() {
        }
    }
}

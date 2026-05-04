package k20;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {
    public static final boolean a(@k a version) {
        g0.p(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(@k a version) {
        g0.p(version, "version");
        return a(version);
    }
}

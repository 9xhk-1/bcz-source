package mx;

import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 {
    @m80.k
    public static final q a(@m80.k Date lastModified) {
        kotlin.jvm.internal.g0.p(lastModified, "lastModified");
        return new q(io.ktor.util.date.a.b(Long.valueOf(lastModified.getTime())));
    }
}

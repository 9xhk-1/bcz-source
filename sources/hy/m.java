package hy;

import java.nio.file.attribute.FileTime;
import java.time.ZonedDateTime;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {
    @m80.k
    public static final mx.q a(long j11) {
        return new mx.q(io.ktor.util.date.a.b(Long.valueOf(j11)));
    }

    @m80.k
    public static final mx.q b(@m80.k FileTime lastModified) {
        long millis;
        kotlin.jvm.internal.g0.p(lastModified, "lastModified");
        millis = lastModified.toMillis();
        return new mx.q(io.ktor.util.date.a.b(Long.valueOf(millis)));
    }

    @m80.k
    public static final mx.q c(@m80.k ZonedDateTime lastModified) {
        kotlin.jvm.internal.g0.p(lastModified, "lastModified");
        return new mx.q(ty.f.d(lastModified));
    }
}

package w30;

import kotlin.jvm.internal.g0;
import kotlin.time.Instant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f94777a = o00.n.f75505a.e();

    @h
    @m80.k
    public static final Object b(@m80.k Instant instant) {
        g0.p(instant, "instant");
        return new kotlin.time.i(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
    }

    @h
    @m80.k
    public static final Instant c() {
        return f94777a.a();
    }

    @h
    public static /* synthetic */ void a() {
    }
}

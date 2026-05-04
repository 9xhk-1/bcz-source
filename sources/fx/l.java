package fx;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ex.c f52424a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Throwable f52425b;

    public l(@m80.k ex.c response, @m80.k Throwable cause) {
        g0.p(response, "response");
        g0.p(cause, "cause");
        this.f52424a = response;
        this.f52425b = cause;
    }

    @m80.k
    public final Throwable a() {
        return this.f52425b;
    }

    @m80.k
    public final ex.c b() {
        return this.f52424a;
    }
}

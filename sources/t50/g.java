package t50;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z50.g f89591a;

    public g(@m80.k z50.g delegate) {
        g0.p(delegate, "delegate");
        this.f89591a = delegate;
    }

    public final int a() {
        return this.f89591a.d();
    }

    public final void b() {
        this.f89591a.e();
    }

    @m80.k
    public final z50.g c() {
        return this.f89591a;
    }

    public final int d() {
        return this.f89591a.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int i11, long j11, @m80.k TimeUnit timeUnit) {
        this(new z50.g(y50.d.f99391i, i11, j11, timeUnit));
        g0.p(timeUnit, "timeUnit");
    }

    public g() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}

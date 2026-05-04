package z;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final AtomicInteger f100474a;

    public a(boolean z11) {
        this.f100474a = new AtomicInteger(a(z11));
    }

    public final boolean b(boolean z11, boolean z12) {
        return this.f100474a.compareAndSet(a(z11), a(z12));
    }

    public final boolean c() {
        return c.a(this.f100474a) != 0;
    }

    public final void d(boolean z11) {
        c.b(this.f100474a, a(z11));
    }

    public final int a(boolean z11) {
        return z11 ? 1 : 0;
    }
}

package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g extends rx.d {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f86584a;

    public g(ThreadFactory threadFactory) {
        this.f86584a = threadFactory;
    }

    @Override // rx.d
    public d.a a() {
        return new h(this.f86584a);
    }
}

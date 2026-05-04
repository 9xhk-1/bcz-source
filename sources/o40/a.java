package o40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f75719a = AtomicIntegerFieldUpdater.newUpdater(a.class, "container$volatile");
    private volatile /* synthetic */ int container$volatile;

    public a(boolean z11) {
        this.container$volatile = z11 ? 1 : 0;
    }

    public final /* synthetic */ int a() {
        return this.container$volatile;
    }

    public final boolean c() {
        return f75719a.get(this) == 1;
    }

    public final /* synthetic */ void d(int i11) {
        this.container$volatile = i11;
    }

    public final void e(boolean z11) {
        f75719a.set(this, z11 ? 1 : 0);
    }
}

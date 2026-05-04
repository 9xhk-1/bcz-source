package c40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7826b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Throwable f7827a;

    public c0(@m80.k Throwable th2, boolean z11) {
        this.f7827a = th2;
        this._handled$volatile = z11 ? 1 : 0;
    }

    public final boolean a() {
        return f7826b.get(this) == 1;
    }

    public final /* synthetic */ int b() {
        return this._handled$volatile;
    }

    public final boolean d() {
        return f7826b.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void e(int i11) {
        this._handled$volatile = i11;
    }

    @m80.k
    public String toString() {
        return u0.a(this) + '[' + this.f7827a + l50.b.f69930l;
    }

    public /* synthetic */ c0(Throwable th2, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(th2, (i11 & 2) != 0 ? false : z11);
    }
}

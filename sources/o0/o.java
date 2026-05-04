package o0;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import c40.l2;
import coil.request.ImageRequest;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b0.f f75490a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ImageRequest f75491b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r0.d<?> f75492c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Lifecycle f75493d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final l2 f75494e;

    public o(@m80.k b0.f fVar, @m80.k ImageRequest imageRequest, @m80.k r0.d<?> dVar, @m80.k Lifecycle lifecycle, @m80.k l2 l2Var) {
        this.f75490a = fVar;
        this.f75491b = imageRequest;
        this.f75492c = dVar;
        this.f75493d = lifecycle;
        this.f75494e = l2Var;
    }

    @MainThread
    public final void a() {
        this.f75490a.d(this.f75491b);
    }

    @Override // o0.k
    public void dispose() {
        l2.a.b(this.f75494e, null, 1, null);
        r0.d<?> dVar = this.f75492c;
        if (dVar instanceof LifecycleObserver) {
            this.f75493d.removeObserver((LifecycleObserver) dVar);
        }
        this.f75493d.removeObserver(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // o0.k
    public void e() {
        if (this.f75492c.getView().isAttachedToWindow()) {
            return;
        }
        u0.l.t(this.f75492c.getView()).e(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@m80.k LifecycleOwner lifecycleOwner) {
        u0.l.t(this.f75492c.getView()).a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // o0.k
    public void start() {
        this.f75493d.addObserver(this);
        r0.d<?> dVar = this.f75492c;
        if (dVar instanceof LifecycleObserver) {
            u0.i.b(this.f75493d, (LifecycleObserver) dVar);
        }
        u0.l.t(this.f75492c.getView()).e(this);
    }
}

package zb0;

import androidx.camera.view.q;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b implements qb0.b, qb0.h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f102501b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<qb0.h> f102502a = new AtomicReference<>();

    @Override // qb0.b
    public final void a(qb0.h hVar) {
        if (q.a(this.f102502a, null, hVar)) {
            onStart();
            return;
        }
        hVar.unsubscribe();
        if (this.f102502a.get() != f102501b) {
            ac0.c.I(new IllegalStateException("Subscription already set!"));
        }
    }

    public final void b() {
        this.f102502a.set(f102501b);
    }

    @Override // qb0.h
    public final boolean isUnsubscribed() {
        return this.f102502a.get() == f102501b;
    }

    @Override // qb0.h
    public final void unsubscribe() {
        qb0.h andSet;
        qb0.h hVar = this.f102502a.get();
        a aVar = f102501b;
        if (hVar == aVar || (andSet = this.f102502a.getAndSet(aVar)) == null || andSet == aVar) {
            return;
        }
        andSet.unsubscribe();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements qb0.h {
        @Override // qb0.h
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // qb0.h
        public void unsubscribe() {
        }
    }

    public void onStart() {
    }
}

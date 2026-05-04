package sb0;

import androidx.camera.view.q;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f88262b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<b> f88263a = new AtomicReference<>();

    public static a a() {
        return f88262b;
    }

    public b b() {
        if (this.f88263a.get() == null) {
            q.a(this.f88263a, null, b.a());
        }
        return this.f88263a.get();
    }

    public void c(b bVar) {
        if (q.a(this.f88263a, null, bVar)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f88263a.get());
    }

    @ub0.a
    public void d() {
        this.f88263a.set(null);
    }
}

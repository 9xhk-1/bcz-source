package dagger.hilt.android.internal.lifecycle;

import androidx.annotation.NonNull;
import av.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements qu.a, qu.i {

    /* renamed from: a, reason: collision with root package name */
    public final Set<d.a> f47615a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public boolean f47616b = false;

    @Override // av.d
    public void a(@NonNull d.a listener) {
        tu.c.a();
        d();
        this.f47615a.remove(listener);
    }

    @Override // av.d
    public void b(@NonNull d.a listener) {
        tu.c.a();
        d();
        this.f47615a.add(listener);
    }

    public void c() {
        tu.c.a();
        this.f47616b = true;
        Iterator<d.a> it = this.f47615a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void d() {
        if (this.f47616b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }
}

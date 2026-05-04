package yk;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class u implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Set<cl.p<?>> f100223a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f100223a.clear();
    }

    @NonNull
    public List<cl.p<?>> b() {
        return fl.o.l(this.f100223a);
    }

    public void c(@NonNull cl.p<?> pVar) {
        this.f100223a.add(pVar);
    }

    public void d(@NonNull cl.p<?> pVar) {
        this.f100223a.remove(pVar);
    }

    @Override // yk.l
    public void onDestroy() {
        Iterator it = fl.o.l(this.f100223a).iterator();
        while (it.hasNext()) {
            ((cl.p) it.next()).onDestroy();
        }
    }

    @Override // yk.l
    public void onStart() {
        Iterator it = fl.o.l(this.f100223a).iterator();
        while (it.hasNext()) {
            ((cl.p) it.next()).onStart();
        }
    }

    @Override // yk.l
    public void onStop() {
        Iterator it = fl.o.l(this.f100223a).iterator();
        while (it.hasNext()) {
            ((cl.p) it.next()).onStop();
        }
    }
}

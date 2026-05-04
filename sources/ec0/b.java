package ec0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public Set<h> f49632a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f49633b;

    public b() {
    }

    private static void f(Collection<h> collection) {
        if (collection == null) {
            return;
        }
        Iterator<h> it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (Throwable th2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        vb0.a.d(arrayList);
    }

    public void a(h hVar) {
        if (hVar.isUnsubscribed()) {
            return;
        }
        if (!this.f49633b) {
            synchronized (this) {
                try {
                    if (!this.f49633b) {
                        if (this.f49632a == null) {
                            this.f49632a = new HashSet(4);
                        }
                        this.f49632a.add(hVar);
                        return;
                    }
                } finally {
                }
            }
        }
        hVar.unsubscribe();
    }

    public void b(h... hVarArr) {
        int i11 = 0;
        if (!this.f49633b) {
            synchronized (this) {
                try {
                    if (!this.f49633b) {
                        if (this.f49632a == null) {
                            this.f49632a = new HashSet(hVarArr.length);
                        }
                        int length = hVarArr.length;
                        while (i11 < length) {
                            h hVar = hVarArr[i11];
                            if (!hVar.isUnsubscribed()) {
                                this.f49632a.add(hVar);
                            }
                            i11++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        int length2 = hVarArr.length;
        while (i11 < length2) {
            hVarArr[i11].unsubscribe();
            i11++;
        }
    }

    public void c() {
        Set<h> set;
        if (this.f49633b) {
            return;
        }
        synchronized (this) {
            if (!this.f49633b && (set = this.f49632a) != null) {
                this.f49632a = null;
                f(set);
            }
        }
    }

    public boolean d() {
        Set<h> set;
        boolean z11 = false;
        if (this.f49633b) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f49633b && (set = this.f49632a) != null && !set.isEmpty()) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    public void e(h hVar) {
        Set<h> set;
        if (this.f49633b) {
            return;
        }
        synchronized (this) {
            if (!this.f49633b && (set = this.f49632a) != null) {
                boolean remove = set.remove(hVar);
                if (remove) {
                    hVar.unsubscribe();
                }
            }
        }
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f49633b;
    }

    @Override // qb0.h
    public void unsubscribe() {
        if (this.f49633b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f49633b) {
                    return;
                }
                this.f49633b = true;
                Set<h> set = this.f49632a;
                this.f49632a = null;
                f(set);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(h... hVarArr) {
        this.f49632a = new HashSet(Arrays.asList(hVarArr));
    }
}

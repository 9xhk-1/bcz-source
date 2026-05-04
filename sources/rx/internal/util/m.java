package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m implements qb0.h {

    /* renamed from: a, reason: collision with root package name */
    public List<qb0.h> f86754a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f86755b;

    public m() {
    }

    public static void e(Collection<qb0.h> collection) {
        if (collection == null) {
            return;
        }
        Iterator<qb0.h> it = collection.iterator();
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

    public void a(qb0.h hVar) {
        if (hVar.isUnsubscribed()) {
            return;
        }
        if (!this.f86755b) {
            synchronized (this) {
                try {
                    if (!this.f86755b) {
                        List list = this.f86754a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f86754a = list;
                        }
                        list.add(hVar);
                        return;
                    }
                } finally {
                }
            }
        }
        hVar.unsubscribe();
    }

    public void b() {
        List<qb0.h> list;
        if (this.f86755b) {
            return;
        }
        synchronized (this) {
            list = this.f86754a;
            this.f86754a = null;
        }
        e(list);
    }

    public boolean c() {
        List<qb0.h> list;
        boolean z11 = false;
        if (this.f86755b) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f86755b && (list = this.f86754a) != null && !list.isEmpty()) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    public void d(qb0.h hVar) {
        if (this.f86755b) {
            return;
        }
        synchronized (this) {
            List<qb0.h> list = this.f86754a;
            if (!this.f86755b && list != null) {
                boolean remove = list.remove(hVar);
                if (remove) {
                    hVar.unsubscribe();
                }
            }
        }
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f86755b;
    }

    @Override // qb0.h
    public void unsubscribe() {
        if (this.f86755b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f86755b) {
                    return;
                }
                this.f86755b = true;
                List<qb0.h> list = this.f86754a;
                this.f86754a = null;
                e(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m(qb0.h... hVarArr) {
        this.f86754a = new LinkedList(Arrays.asList(hVarArr));
    }

    public m(qb0.h hVar) {
        LinkedList linkedList = new LinkedList();
        this.f86754a = linkedList;
        linkedList.add(hVar);
    }
}

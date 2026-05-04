package zb0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Notification;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class i<T> implements qb0.c<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final qb0.c<Object> f102530e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final qb0.c<T> f102531a;

    /* renamed from: b, reason: collision with root package name */
    public final List<T> f102532b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Throwable> f102533c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Notification<T>> f102534d;

    public i(qb0.c<T> cVar) {
        this.f102532b = new ArrayList();
        this.f102533c = new ArrayList();
        this.f102534d = new ArrayList();
        this.f102531a = cVar;
    }

    public List<T> T() {
        return Collections.unmodifiableList(this.f102532b);
    }

    public void c(List<T> list) {
        if (this.f102532b.size() != list.size()) {
            e("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.f102532b.size() + ".\nProvided values: " + list + "\nActual values: " + this.f102532b + "\n");
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t11 = list.get(i11);
            T t12 = this.f102532b.get(i11);
            if (t11 == null) {
                if (t12 != null) {
                    e("Value at index: " + i11 + " expected to be [null] but was: [" + t12 + "]\n");
                }
            } else if (!t11.equals(t12)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Value at index: ");
                sb2.append(i11);
                sb2.append(" expected to be [");
                sb2.append(t11);
                sb2.append("] (");
                sb2.append(t11.getClass().getSimpleName());
                sb2.append(") but was: [");
                sb2.append(t12);
                sb2.append("] (");
                sb2.append(t12 != null ? t12.getClass().getSimpleName() : "null");
                sb2.append(")\n");
                e(sb2.toString());
            }
        }
    }

    public void d() {
        if (this.f102533c.size() > 1) {
            e("Too many onError events: " + this.f102533c.size());
        }
        if (this.f102534d.size() > 1) {
            e("Too many onCompleted events: " + this.f102534d.size());
        }
        if (this.f102534d.size() == 1 && this.f102533c.size() == 1) {
            e("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.f102534d.isEmpty() && this.f102533c.isEmpty()) {
            e("No terminal events received.");
        }
    }

    public final void e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append(str);
        sb2.append(" (");
        int size = this.f102534d.size();
        sb2.append(size);
        sb2.append(" completion");
        if (size != 1) {
            sb2.append(io.ktor.util.date.b.f61997c);
        }
        sb2.append(')');
        if (!this.f102533c.isEmpty()) {
            int size2 = this.f102533c.size();
            sb2.append(" (+");
            sb2.append(size2);
            sb2.append(" error");
            if (size2 != 1) {
                sb2.append(io.ktor.util.date.b.f61997c);
            }
            sb2.append(')');
        }
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (this.f102533c.isEmpty()) {
            throw assertionError;
        }
        if (this.f102533c.size() == 1) {
            assertionError.initCause(this.f102533c.get(0));
            throw assertionError;
        }
        assertionError.initCause(new CompositeException(this.f102533c));
        throw assertionError;
    }

    public List<Object> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f102532b);
        arrayList.add(this.f102533c);
        arrayList.add(this.f102534d);
        return Collections.unmodifiableList(arrayList);
    }

    public List<Notification<T>> g() {
        return Collections.unmodifiableList(this.f102534d);
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f102534d.add(Notification.b());
        this.f102531a.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f102533c.add(th2);
        this.f102531a.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f102532b.add(t11);
        this.f102531a.onNext(t11);
    }

    public List<Throwable> u() {
        return Collections.unmodifiableList(this.f102533c);
    }

    public i() {
        this.f102532b = new ArrayList();
        this.f102533c = new ArrayList();
        this.f102534d = new ArrayList();
        this.f102531a = (qb0.c<T>) f102530e;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements qb0.c<Object> {
        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
        }

        @Override // qb0.c
        public void onNext(Object obj) {
        }
    }
}

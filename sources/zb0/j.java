package zb0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rx.Notification;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j<T> extends qb0.g<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final qb0.c<Object> f102535h = new a();

    /* renamed from: a, reason: collision with root package name */
    public final qb0.c<T> f102536a;

    /* renamed from: b, reason: collision with root package name */
    public final List<T> f102537b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Throwable> f102538c;

    /* renamed from: d, reason: collision with root package name */
    public int f102539d;

    /* renamed from: e, reason: collision with root package name */
    public final CountDownLatch f102540e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f102541f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Thread f102542g;

    public j(long j11) {
        this(f102535h, j11);
    }

    public static <T> j<T> i0() {
        return new j<>();
    }

    public static <T> j<T> j0(long j11) {
        return new j<>(j11);
    }

    public static <T> j<T> k0(qb0.c<T> cVar) {
        return new j<>(cVar);
    }

    public static <T> j<T> l0(qb0.c<T> cVar, long j11) {
        return new j<>(cVar, j11);
    }

    public static <T> j<T> m0(qb0.g<T> gVar) {
        return new j<>((qb0.g) gVar);
    }

    public void C(Class<? extends Throwable> cls) {
        List<Throwable> list = this.f102538c;
        if (list.isEmpty()) {
            d0("No errors");
            return;
        }
        if (list.size() > 1) {
            AssertionError assertionError = new AssertionError("Multiple errors: " + list.size());
            assertionError.initCause(new CompositeException(list));
            throw assertionError;
        }
        if (cls.isInstance(list.get(0))) {
            return;
        }
        AssertionError assertionError2 = new AssertionError("Exceptions differ; expected: " + cls + ", actual: " + list.get(0));
        assertionError2.initCause(list.get(0));
        throw assertionError2;
    }

    public void D(Throwable th2) {
        List<Throwable> list = this.f102538c;
        if (list.isEmpty()) {
            d0("No errors");
            return;
        }
        if (list.size() > 1) {
            d0("Multiple errors");
            return;
        }
        if (th2.equals(list.get(0))) {
            return;
        }
        d0("Exceptions differ; expected: " + th2 + ", actual: " + list.get(0));
    }

    public final void E(T t11, int i11) {
        T t12 = this.f102537b.get(i11);
        if (t11 == null) {
            if (t12 != null) {
                d0("Value at index: " + i11 + " expected: [null] but was: [" + t12 + "]\n");
                return;
            }
            return;
        }
        if (t11.equals(t12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Value at index: ");
        sb2.append(i11);
        sb2.append(" expected: [");
        sb2.append(t11);
        sb2.append("] (");
        sb2.append(t11.getClass().getSimpleName());
        sb2.append(") but was: [");
        sb2.append(t12);
        sb2.append("] (");
        sb2.append(t12 != null ? t12.getClass().getSimpleName() : "null");
        sb2.append(")\n");
        d0(sb2.toString());
    }

    public final int G() {
        return this.f102539d;
    }

    public void H() {
        if (u().isEmpty()) {
            return;
        }
        d0("Unexpected onError events");
    }

    public void I() {
        List<Throwable> list = this.f102538c;
        int i11 = this.f102539d;
        if (!list.isEmpty() || i11 > 0) {
            if (list.isEmpty()) {
                d0("Found " + list.size() + " errors and " + i11 + " completion events instead of none");
                return;
            }
            if (list.size() == 1) {
                d0("Found " + list.size() + " errors and " + i11 + " completion events instead of none");
                return;
            }
            d0("Found " + list.size() + " errors and " + i11 + " completion events instead of none");
        }
    }

    public void L() {
        int size = this.f102537b.size();
        if (size != 0) {
            d0("No onNext events expected yet some received: " + size);
        }
    }

    public Thread M() {
        return this.f102542g;
    }

    public void Q() {
        int i11 = this.f102539d;
        if (i11 == 1) {
            d0("Completed!");
        } else if (i11 > 1) {
            d0("Completed multiple times: " + i11);
        }
    }

    public void S(List<T> list) {
        if (this.f102537b.size() != list.size()) {
            d0("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.f102537b.size() + ".\nProvided values: " + list + "\nActual values: " + this.f102537b + "\n");
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            E(list.get(i11), i11);
        }
    }

    public List<T> T() {
        return this.f102537b;
    }

    public void U() {
        if (this.f102538c.size() > 1) {
            d0("Too many onError events: " + this.f102538c.size());
        }
        if (this.f102539d > 1) {
            d0("Too many onCompleted events: " + this.f102539d);
        }
        if (this.f102539d == 1 && this.f102538c.size() == 1) {
            d0("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.f102539d == 0 && this.f102538c.isEmpty()) {
            d0("No terminal events received.");
        }
    }

    public void V() {
        if (isUnsubscribed()) {
            return;
        }
        d0("Not unsubscribed.");
    }

    public void Z(T t11) {
        S(Collections.singletonList(t11));
    }

    public void a0(int i11) {
        int size = this.f102537b.size();
        if (size != i11) {
            d0("Number of onNext events differ; expected: " + i11 + ", actual: " + size);
        }
    }

    public void b0(T... tArr) {
        S(Arrays.asList(tArr));
    }

    public final void c0(T t11, T... tArr) {
        a0(tArr.length + 1);
        E(t11, 0);
        int i11 = 0;
        while (i11 < tArr.length) {
            T t12 = tArr[i11];
            i11++;
            E(t12, i11);
        }
        this.f102537b.clear();
        this.f102541f = 0;
    }

    public final void d0(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append(str);
        sb2.append(" (");
        int i11 = this.f102539d;
        sb2.append(i11);
        sb2.append(" completion");
        if (i11 != 1) {
            sb2.append(io.ktor.util.date.b.f61997c);
        }
        sb2.append(')');
        if (!this.f102538c.isEmpty()) {
            int size = this.f102538c.size();
            sb2.append(" (+");
            sb2.append(size);
            sb2.append(" error");
            if (size != 1) {
                sb2.append(io.ktor.util.date.b.f61997c);
            }
            sb2.append(')');
        }
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (this.f102538c.isEmpty()) {
            throw assertionError;
        }
        if (this.f102538c.size() == 1) {
            assertionError.initCause(this.f102538c.get(0));
            throw assertionError;
        }
        assertionError.initCause(new CompositeException(this.f102538c));
        throw assertionError;
    }

    public void e0() {
        try {
            this.f102540e.await();
        } catch (InterruptedException e11) {
            throw new IllegalStateException("Interrupted", e11);
        }
    }

    public void f0(long j11, TimeUnit timeUnit) {
        try {
            this.f102540e.await(j11, timeUnit);
        } catch (InterruptedException e11) {
            throw new IllegalStateException("Interrupted", e11);
        }
    }

    public void g0(long j11, TimeUnit timeUnit) {
        try {
            if (this.f102540e.await(j11, timeUnit)) {
                return;
            }
            unsubscribe();
        } catch (InterruptedException unused) {
            unsubscribe();
        }
    }

    public final int getValueCount() {
        return this.f102541f;
    }

    public final boolean h0(int i11, long j11, TimeUnit timeUnit) {
        while (j11 != 0 && this.f102541f < i11) {
            try {
                timeUnit.sleep(1L);
                j11--;
            } catch (InterruptedException e11) {
                throw new IllegalStateException("Interrupted", e11);
            }
        }
        return this.f102541f >= i11;
    }

    @Deprecated
    public List<Notification<T>> n0() {
        int i11 = this.f102539d;
        ArrayList arrayList = new ArrayList(i11 != 0 ? i11 : 1);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Notification.b());
        }
        return arrayList;
    }

    public void o0(long j11) {
        request(j11);
    }

    @Override // qb0.c
    public void onCompleted() {
        try {
            this.f102539d++;
            this.f102542g = Thread.currentThread();
            this.f102536a.onCompleted();
        } finally {
            this.f102540e.countDown();
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        try {
            this.f102542g = Thread.currentThread();
            this.f102538c.add(th2);
            this.f102536a.onError(th2);
        } finally {
            this.f102540e.countDown();
        }
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f102542g = Thread.currentThread();
        this.f102537b.add(t11);
        this.f102541f = this.f102537b.size();
        this.f102536a.onNext(t11);
    }

    public void q() {
        int i11 = this.f102539d;
        if (i11 == 0) {
            d0("Not completed!");
        } else if (i11 > 1) {
            d0("Completed multiple times: " + i11);
        }
    }

    public List<Throwable> u() {
        return this.f102538c;
    }

    public j(qb0.c<T> cVar, long j11) {
        this.f102540e = new CountDownLatch(1);
        cVar.getClass();
        this.f102536a = cVar;
        if (j11 >= 0) {
            request(j11);
        }
        this.f102537b = new ArrayList();
        this.f102538c = new ArrayList();
    }

    public j(qb0.g<T> gVar) {
        this(gVar, -1L);
    }

    public j(qb0.c<T> cVar) {
        this(cVar, -1L);
    }

    public j() {
        this(-1L);
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

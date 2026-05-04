package a3;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1455a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f1456b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceArray<T> f1457c;

    public b(int i11) {
        this.f1457c = new AtomicReferenceArray<>(i11);
    }

    public final int a(int i11) {
        return (i11 + 1) % this.f1457c.length();
    }

    @d0
    public T b() {
        int i11 = this.f1456b.get();
        if (i11 == this.f1455a.get()) {
            return null;
        }
        T t11 = this.f1457c.get(i11);
        this.f1456b.set(a(i11));
        return t11;
    }

    public boolean c(@d0 T t11) {
        int i11 = this.f1455a.get();
        int i12 = this.f1456b.get();
        int a11 = a(i11);
        if (a11 == i12) {
            return false;
        }
        this.f1457c.set(i11, t11);
        this.f1455a.set(a11);
        return true;
    }
}

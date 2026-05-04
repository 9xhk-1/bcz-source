package e00;

import java.util.Comparator;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l<T> implements Comparator<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Comparator<T> f48276a;

    public l(@m80.k Comparator<T> comparator) {
        g0.p(comparator, "comparator");
        this.f48276a = comparator;
    }

    @m80.k
    public final Comparator<T> a() {
        return this.f48276a;
    }

    @Override // java.util.Comparator
    public int compare(T t11, T t12) {
        return this.f48276a.compare(t12, t11);
    }

    @Override // java.util.Comparator
    @m80.k
    public final Comparator<T> reversed() {
        return this.f48276a;
    }
}

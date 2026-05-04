package q30;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b<T, K> extends a00.c<T> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Iterator<T> f81487c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.l<T, K> f81488d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final HashSet<K> f81489e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@m80.k Iterator<? extends T> source, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        this.f81487c = source;
        this.f81488d = keySelector;
        this.f81489e = new HashSet<>();
    }

    @Override // a00.c
    public void a() {
        while (this.f81487c.hasNext()) {
            T next = this.f81487c.next();
            if (this.f81489e.add(this.f81488d.invoke(next))) {
                c(next);
                return;
            }
        }
        b();
    }
}

package c30;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import q10.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b implements q10.g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f7681b = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d30.i f7682a;

    public b(@m80.k d30.n storageManager, @m80.k x00.a<? extends List<? extends q10.c>> compute) {
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f7682a = storageManager.f(compute);
    }

    private final List<q10.c> a() {
        return (List) d30.m.a(this.f7682a, this, f7681b[0]);
    }

    @Override // q10.g
    public boolean a0(@m80.k n20.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // q10.g
    @m80.l
    public q10.c i(@m80.k n20.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // q10.g
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<q10.c> iterator() {
        return a().iterator();
    }
}

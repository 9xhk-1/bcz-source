package k40;

import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k<P, Q> implements j<P, Q> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Object f65824a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.q<Object, n<?>, Object, g2> f65825b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.q<Object, Object, Object, Object> f65826c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final x00.q<n<?>, Object, Object, x00.q<Throwable, Object, kotlin.coroutines.d, g2>> f65827d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@m80.k Object obj, @m80.k x00.q<Object, ? super n<?>, Object, g2> qVar, @m80.k x00.q<Object, Object, Object, ? extends Object> qVar2, @m80.l x00.q<? super n<?>, Object, Object, ? extends x00.q<? super Throwable, Object, ? super kotlin.coroutines.d, g2>> qVar3) {
        this.f65824a = obj;
        this.f65825b = qVar;
        this.f65826c = qVar2;
        this.f65827d = qVar3;
    }

    @Override // k40.l
    @m80.l
    public x00.q<n<?>, Object, Object, x00.q<Throwable, Object, kotlin.coroutines.d, g2>> a() {
        return this.f65827d;
    }

    @Override // k40.l
    @m80.k
    public x00.q<Object, Object, Object, Object> b() {
        return this.f65826c;
    }

    @Override // k40.l
    @m80.k
    public x00.q<Object, n<?>, Object, g2> c() {
        return this.f65825b;
    }

    @Override // k40.l
    @m80.k
    public Object d() {
        return this.f65824a;
    }

    public /* synthetic */ k(Object obj, x00.q qVar, x00.q qVar2, x00.q qVar3, int i11, v vVar) {
        this(obj, qVar, qVar2, (i11 & 8) != 0 ? null : qVar3);
    }
}

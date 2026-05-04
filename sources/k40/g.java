package k40;

import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Object f65816a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.q<Object, n<?>, Object, g2> f65817b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final x00.q<n<?>, Object, Object, x00.q<Throwable, Object, kotlin.coroutines.d, g2>> f65818c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.q<Object, Object, Object, Object> f65819d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k Object obj, @m80.k x00.q<Object, ? super n<?>, Object, g2> qVar, @m80.l x00.q<? super n<?>, Object, Object, ? extends x00.q<? super Throwable, Object, ? super kotlin.coroutines.d, g2>> qVar2) {
        x00.q<Object, Object, Object, Object> qVar3;
        this.f65816a = obj;
        this.f65817b = qVar;
        this.f65818c = qVar2;
        qVar3 = p.f65850a;
        this.f65819d = qVar3;
    }

    @Override // k40.l
    @m80.l
    public x00.q<n<?>, Object, Object, x00.q<Throwable, Object, kotlin.coroutines.d, g2>> a() {
        return this.f65818c;
    }

    @Override // k40.l
    @m80.k
    public x00.q<Object, Object, Object, Object> b() {
        return this.f65819d;
    }

    @Override // k40.l
    @m80.k
    public x00.q<Object, n<?>, Object, g2> c() {
        return this.f65817b;
    }

    @Override // k40.l
    @m80.k
    public Object d() {
        return this.f65816a;
    }

    public /* synthetic */ g(Object obj, x00.q qVar, x00.q qVar2, int i11, v vVar) {
        this(obj, qVar, (i11 & 4) != 0 ? null : qVar2);
    }
}

package kotlinx.coroutines.flow;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.p<j<? super T>, j00.c<? super g2>, Object> f68101a;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        this.f68101a = pVar;
    }

    @Override // kotlinx.coroutines.flow.a
    @m80.l
    public Object g(@m80.k j<? super T> jVar, @m80.k j00.c<? super g2> cVar) {
        Object invoke = this.f68101a.invoke(jVar, cVar);
        return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
    }
}

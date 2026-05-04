package kotlinx.coroutines.flow.internal;

import c40.g2;
import e40.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
/* loaded from: classes8.dex */
public final class w<T> implements kotlinx.coroutines.flow.j<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l0<T> f68288a;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@m80.k l0<? super T> l0Var) {
        this.f68288a = l0Var;
    }

    @Override // kotlinx.coroutines.flow.j
    @m80.l
    public Object emit(T t11, @m80.k j00.c<? super yz.g2> cVar) {
        Object b11 = this.f68288a.b(t11, cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }
}

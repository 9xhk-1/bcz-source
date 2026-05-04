package kotlinx.coroutines.flow;

import c40.l2;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z<T> implements c0<T>, c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0<T> f68446a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final l2 f68447b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@m80.k c0<? extends T> c0Var, @m80.l l2 l2Var) {
        this.f68446a = c0Var;
        this.f68447b = l2Var;
    }

    @Override // kotlinx.coroutines.flow.c0
    @m80.k
    public List<T> a() {
        return this.f68446a.a();
    }

    @Override // kotlinx.coroutines.flow.c0, kotlinx.coroutines.flow.i
    @m80.l
    public Object collect(@m80.k j<? super T> jVar, @m80.k j00.c<?> cVar) {
        return this.f68446a.collect(jVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @m80.k
    public i<T> e(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return e0.e(this, dVar, i11, bufferOverflow);
    }
}

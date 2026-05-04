package kotlinx.coroutines.flow;

import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 extends kotlinx.coroutines.flow.internal.c<d0<?>> {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public long f68132a = -1;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public j00.c<? super g2> f68133b;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@m80.k d0<?> d0Var) {
        if (this.f68132a >= 0) {
            return false;
        }
        this.f68132a = d0Var.c0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j00.c<g2>[] b(@m80.k d0<?> d0Var) {
        long j11 = this.f68132a;
        this.f68132a = -1L;
        this.f68133b = null;
        return d0Var.b0(j11);
    }
}

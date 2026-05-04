package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e40.g0;
import e40.i0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/LifecycleKt$eventFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleKt$eventFlow$1 extends SuspendLambda implements p<i0<? super Lifecycle.Event>, j00.c<? super g2>, Object> {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, j00.c<? super LifecycleKt$eventFlow$1> cVar) {
        super(2, cVar);
        this.$this_eventFlow = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, cVar);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k i0<? super Lifecycle.Event> i0Var, @l j00.c<? super g2> cVar) {
        return ((LifecycleKt$eventFlow$1) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final i0 i0Var = (i0) this.L$0;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.g
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    i0.this.m(event);
                }
            };
            this.$this_eventFlow.addObserver(lifecycleEventObserver);
            final Lifecycle lifecycle = this.$this_eventFlow;
            x00.a<g2> aVar = new x00.a<g2>() { // from class: androidx.lifecycle.LifecycleKt$eventFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Lifecycle.this.removeObserver(lifecycleEventObserver);
                }
            };
            this.label = 1;
            if (g0.b(i0Var, aVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}

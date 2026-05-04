package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.r0;
import e40.i0;
import e40.l0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class FlowExtKt$flowWithLifecycle$1<T> extends SuspendLambda implements p<i0<? super T>, j00.c<? super g2>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ i0<T> $$this$callbackFlow;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlinx.coroutines.flow.i<? extends T> iVar, i0<? super T> i0Var, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_flowWithLifecycle = iVar;
            this.$$this$callbackFlow = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.i<T> iVar = this.$this_flowWithLifecycle;
                final i0<T> i0Var = this.$$this$callbackFlow;
                kotlinx.coroutines.flow.j<? super T> jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // kotlinx.coroutines.flow.j
                    @l
                    public final Object emit(T t11, @k j00.c<? super g2> cVar) {
                        Object b11 = i0Var.b(t11, cVar);
                        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == l11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.flow.i<? extends T> iVar, j00.c<? super FlowExtKt$flowWithLifecycle$1> cVar) {
        super(2, cVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k i0<? super T> i0Var, @l j00.c<? super g2> cVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        i0 i0Var;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            i0 i0Var2 = (i0) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, i0Var2, null);
            this.L$0 = i0Var2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == l11) {
                return l11;
            }
            i0Var = i0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = (i0) this.L$0;
            kotlin.e.n(obj);
        }
        l0.a.a(i0Var, null, 1, null);
        return g2.f100423a;
    }
}

package androidx.lifecycle.compose;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowExtKt$collectAsStateWithLifecycle$1$1<T> extends SuspendLambda implements p<ProduceStateScope<T>, j00.c<? super g2>, Object> {
    final /* synthetic */ kotlin.coroutines.d $context;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ i<T> $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ ProduceStateScope<T> $$this$produceState;
        final /* synthetic */ kotlin.coroutines.d $context;
        final /* synthetic */ i<T> $this_collectAsStateWithLifecycle;
        int label;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
            final /* synthetic */ ProduceStateScope<T> $$this$produceState;
            final /* synthetic */ i<T> $this_collectAsStateWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(i<? extends T> iVar, ProduceStateScope<T> produceStateScope, j00.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$this_collectAsStateWithLifecycle = iVar;
                this.$$this$produceState = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
                return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, cVar);
            }

            @Override // x00.p
            @l
            public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
                return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.label;
                if (i11 == 0) {
                    e.n(obj);
                    i<T> iVar = this.$this_collectAsStateWithLifecycle;
                    final ProduceStateScope<T> produceStateScope = this.$$this$produceState;
                    j<? super T> jVar = new j() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.1.2.1
                        @Override // kotlinx.coroutines.flow.j
                        @l
                        public final Object emit(T t11, @k j00.c<? super g2> cVar) {
                            produceStateScope.setValue(t11);
                            return g2.f100423a;
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
                    e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlin.coroutines.d dVar, i<? extends T> iVar, ProduceStateScope<T> produceStateScope, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = dVar;
            this.$this_collectAsStateWithLifecycle = iVar;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (r7.collect(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            if (c40.i.h(r7, r1, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.e.n(r7)
                goto L4f
            L1b:
                kotlin.e.n(r7)
                kotlin.coroutines.d r7 = r6.$context
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                boolean r7 = kotlin.jvm.internal.g0.g(r7, r1)
                if (r7 == 0) goto L3a
                kotlinx.coroutines.flow.i<T> r7 = r6.$this_collectAsStateWithLifecycle
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1
                androidx.compose.runtime.ProduceStateScope<T> r2 = r6.$$this$produceState
                r1.<init>()
                r6.label = r3
                java.lang.Object r7 = r7.collect(r1, r6)
                if (r7 != r0) goto L4f
                goto L4e
            L3a:
                kotlin.coroutines.d r7 = r6.$context
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                kotlinx.coroutines.flow.i<T> r3 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.ProduceStateScope<T> r4 = r6.$$this$produceState
                r5 = 0
                r1.<init>(r3, r4, r5)
                r6.label = r2
                java.lang.Object r7 = c40.i.h(r7, r1, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, kotlin.coroutines.d dVar, i<? extends T> iVar, j00.c<? super FlowExtKt$collectAsStateWithLifecycle$1$1> cVar) {
        super(2, cVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$context = dVar;
        this.$this_collectAsStateWithLifecycle = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, cVar);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k ProduceStateScope<T> produceStateScope, @l j00.c<? super g2> cVar) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create(produceStateScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$this_collectAsStateWithLifecycle, produceStateScope, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}

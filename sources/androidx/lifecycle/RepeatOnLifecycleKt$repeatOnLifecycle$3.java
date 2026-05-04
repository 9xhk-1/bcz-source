package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.h1;
import c40.r0;
import c40.v2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ p<r0, j00.c<? super g2>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    @u0({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ r0 $$this$coroutineScope;
        final /* synthetic */ p<r0, j00.c<? super g2>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, r0 r0Var, p<? super r0, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = r0Var;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L37
                if (r1 != r3) goto L2f
                java.lang.Object r0 = r13.L$5
                x00.p r0 = (x00.p) r0
                java.lang.Object r0 = r13.L$4
                c40.r0 r0 = (c40.r0) r0
                java.lang.Object r0 = r13.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r13.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r13.L$1
                r1 = r0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r0 = r13.L$0
                r4 = r0
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                kotlin.e.n(r14)     // Catch: java.lang.Throwable -> L2b
                goto La9
            L2b:
                r0 = move-exception
                r14 = r0
                goto Lc0
            L2f:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L37:
                kotlin.e.n(r14)
                androidx.lifecycle.Lifecycle r14 = r13.$this_repeatOnLifecycle
                androidx.lifecycle.Lifecycle$State r14 = r14.getCurrentState()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r14 != r1) goto L47
                yz.g2 r14 = yz.g2.f100423a
                return r14
            L47:
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                androidx.lifecycle.Lifecycle$State r14 = r13.$state     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle r12 = r13.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La1
                c40.r0 r7 = r13.$$this$coroutineScope     // Catch: java.lang.Throwable -> La1
                x00.p<c40.r0, j00.c<? super yz.g2>, java.lang.Object> r11 = r13.$block     // Catch: java.lang.Throwable -> La1
                r13.L$0 = r6     // Catch: java.lang.Throwable -> La1
                r13.L$1 = r1     // Catch: java.lang.Throwable -> La1
                r13.L$2 = r14     // Catch: java.lang.Throwable -> La1
                r13.L$3 = r12     // Catch: java.lang.Throwable -> La1
                r13.L$4 = r7     // Catch: java.lang.Throwable -> La1
                r13.L$5 = r11     // Catch: java.lang.Throwable -> La1
                r13.label = r3     // Catch: java.lang.Throwable -> La1
                c40.p r9 = new c40.p     // Catch: java.lang.Throwable -> La1
                j00.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r13)     // Catch: java.lang.Throwable -> La1
                r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> La1
                r9.y()     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle$Event r5 = r4.upTo(r14)     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle$Event r8 = r4.downFrom(r14)     // Catch: java.lang.Throwable -> La1
                r14 = 0
                n40.a r10 = n40.g.b(r14, r3, r2)     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r4 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La1
                r4.<init>()     // Catch: java.lang.Throwable -> La1
                r1.element = r4     // Catch: java.lang.Throwable -> La1
                java.lang.String r14 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                kotlin.jvm.internal.g0.n(r4, r14)     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4     // Catch: java.lang.Throwable -> La1
                r12.addObserver(r4)     // Catch: java.lang.Throwable -> La1
                java.lang.Object r14 = r9.F()     // Catch: java.lang.Throwable -> La1
                java.lang.Object r4 = kotlin.coroutines.intrinsics.b.l()     // Catch: java.lang.Throwable -> La1
                if (r14 != r4) goto La5
                l00.f.c(r13)     // Catch: java.lang.Throwable -> La1
                goto La5
            La1:
                r0 = move-exception
                r14 = r0
                r4 = r6
                goto Lc0
            La5:
                if (r14 != r0) goto La8
                return r0
            La8:
                r4 = r6
            La9:
                T r14 = r4.element
                c40.l2 r14 = (c40.l2) r14
                if (r14 == 0) goto Lb2
                c40.l2.a.b(r14, r2, r3, r2)
            Lb2:
                T r14 = r1.element
                androidx.lifecycle.LifecycleEventObserver r14 = (androidx.lifecycle.LifecycleEventObserver) r14
                if (r14 == 0) goto Lbd
                androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                r0.removeObserver(r14)
            Lbd:
                yz.g2 r14 = yz.g2.f100423a
                return r14
            Lc0:
                T r0 = r4.element
                c40.l2 r0 = (c40.l2) r0
                if (r0 == 0) goto Lc9
                c40.l2.a.b(r0, r2, r3, r2)
            Lc9:
                T r0 = r1.element
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 == 0) goto Ld4
                androidx.lifecycle.Lifecycle r1 = r13.$this_repeatOnLifecycle
                r1.removeObserver(r0)
            Ld4:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, p<? super r0, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> cVar) {
        super(2, cVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, cVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            r0 r0Var = (r0) this.L$0;
            v2 q11 = h1.e().q();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, r0Var, this.$block, null);
            this.label = 1;
            if (c40.i.h(q11, anonymousClass1, this) == l11) {
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

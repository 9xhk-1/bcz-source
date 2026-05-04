package kotlin.coroutines.intrinsics;

import j00.c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l00.f;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
/* loaded from: classes8.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    @y0(version = "1.3")
    public static final <T> c<g2> a(final c<? super T> cVar, final l<? super c<? super T>, ? extends Object> lVar) {
        final d context = cVar.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(cVar, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
            final /* synthetic */ l<c<? super T>, Object> $block;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(cVar);
                this.$block = lVar;
                g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i11 = this.label;
                if (i11 == 0) {
                    this.label = 1;
                    e.n(obj);
                    return this.$block.invoke(this);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                e.n(obj);
                return obj;
            }
        } : new ContinuationImpl(cVar, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
            final /* synthetic */ l<c<? super T>, Object> $block;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(cVar, context);
                this.$block = lVar;
                g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i11 = this.label;
                if (i11 == 0) {
                    this.label = 1;
                    e.n(obj);
                    return this.$block.invoke(this);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                e.n(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @k
    public static <T> c<g2> b(@k final l<? super c<? super T>, ? extends Object> lVar, @k c<? super T> completion) {
        g0.p(lVar, "<this>");
        g0.p(completion, "completion");
        final c<?> a11 = f.a(completion);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(a11);
        }
        final d context = a11.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(a11, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
            final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a11);
                this.$this_createCoroutineUnintercepted$inlined = lVar;
                g0.n(a11, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i11 = this.label;
                if (i11 == 0) {
                    this.label = 1;
                    e.n(obj);
                    g0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((l) x0.q(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                e.n(obj);
                return obj;
            }
        } : new ContinuationImpl(a11, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a11, context);
                this.$this_createCoroutineUnintercepted$inlined = lVar;
                g0.n(a11, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i11 = this.label;
                if (i11 == 0) {
                    this.label = 1;
                    e.n(obj);
                    g0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((l) x0.q(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                e.n(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @k
    public static <R, T> c<g2> c(@k final p<? super R, ? super c<? super T>, ? extends Object> pVar, final R r11, @k c<? super T> completion) {
        g0.p(pVar, "<this>");
        g0.p(completion, "completion");
        final c<?> a11 = f.a(completion);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r11, a11);
        }
        final d context = a11.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(a11, pVar, r11) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a11);
                this.$this_createCoroutineUnintercepted$inlined = pVar;
                this.$receiver$inlined = r11;
                g0.n(a11, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i11 = this.label;
                if (i11 == 0) {
                    this.label = 1;
                    e.n(obj);
                    g0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((p) x0.q(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                e.n(obj);
                return obj;
            }
        } : new ContinuationImpl(a11, context, pVar, r11) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a11, context);
                this.$this_createCoroutineUnintercepted$inlined = pVar;
                this.$receiver$inlined = r11;
                g0.n(a11, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i11 = this.label;
                if (i11 == 0) {
                    this.label = 1;
                    e.n(obj);
                    g0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((p) x0.q(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                e.n(obj);
                return obj;
            }
        };
    }

    public static final <T> c<T> d(final c<? super T> cVar) {
        final d context = cVar.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(cVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar);
                g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                e.n(obj);
                return obj;
            }
        } : new ContinuationImpl(cVar, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar, context);
                g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                e.n(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @k
    public static <T> c<T> e(@k c<? super T> cVar) {
        c<T> cVar2;
        g0.p(cVar, "<this>");
        ContinuationImpl continuationImpl = cVar instanceof ContinuationImpl ? (ContinuationImpl) cVar : null;
        return (continuationImpl == null || (cVar2 = (c<T>) continuationImpl.intercepted()) == null) ? cVar : cVar2;
    }

    @y0(version = "1.3")
    @o00.f
    public static final <T> Object f(l<? super c<? super T>, ? extends Object> lVar, c<? super T> completion) {
        g0.p(lVar, "<this>");
        g0.p(completion, "completion");
        return !(lVar instanceof BaseContinuationImpl) ? i(lVar, completion) : ((l) x0.q(lVar, 1)).invoke(completion);
    }

    @y0(version = "1.3")
    @o00.f
    public static final <R, T> Object g(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r11, c<? super T> completion) {
        g0.p(pVar, "<this>");
        g0.p(completion, "completion");
        return !(pVar instanceof BaseContinuationImpl) ? j(pVar, r11, completion) : ((p) x0.q(pVar, 2)).invoke(r11, completion);
    }

    @o00.f
    public static final <R, P, T> Object h(q<? super R, ? super P, ? super c<? super T>, ? extends Object> qVar, R r11, P p11, c<? super T> completion) {
        g0.p(qVar, "<this>");
        g0.p(completion, "completion");
        return !(qVar instanceof BaseContinuationImpl) ? k(qVar, r11, p11, completion) : ((q) x0.q(qVar, 3)).invoke(r11, p11, completion);
    }

    @m80.l
    @v0
    public static final <T> Object i(@k l<? super c<? super T>, ? extends Object> lVar, @k c<? super T> completion) {
        g0.p(lVar, "<this>");
        g0.p(completion, "completion");
        return ((l) x0.q(lVar, 1)).invoke(d(f.a(completion)));
    }

    @m80.l
    @v0
    public static <R, T> Object j(@k p<? super R, ? super c<? super T>, ? extends Object> pVar, R r11, @k c<? super T> completion) {
        g0.p(pVar, "<this>");
        g0.p(completion, "completion");
        return ((p) x0.q(pVar, 2)).invoke(r11, d(f.a(completion)));
    }

    @m80.l
    @v0
    public static <R, P, T> Object k(@k q<? super R, ? super P, ? super c<? super T>, ? extends Object> qVar, R r11, P p11, @k c<? super T> completion) {
        g0.p(qVar, "<this>");
        g0.p(completion, "completion");
        return ((q) x0.q(qVar, 3)).invoke(r11, p11, d(f.a(completion)));
    }
}

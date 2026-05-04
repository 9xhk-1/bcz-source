package kotlinx.coroutines.flow.internal;

import c40.n2;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes8.dex */
public final class SafeCollector<T> extends ContinuationImpl implements kotlinx.coroutines.flow.j<T>, l00.c {

    @w00.g
    @m80.k
    public final kotlin.coroutines.d collectContext;

    @w00.g
    public final int collectContextSize;

    @w00.g
    @m80.k
    public final kotlinx.coroutines.flow.j<T> collector;

    @m80.l
    private j00.c<? super g2> completion_;

    @m80.l
    private kotlin.coroutines.d lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@m80.k kotlinx.coroutines.flow.j<? super T> jVar, @m80.k kotlin.coroutines.d dVar) {
        super(q.f68279a, EmptyCoroutineContext.INSTANCE);
        this.collector = jVar;
        this.collectContext = dVar;
        this.collectContextSize = ((Number) dVar.fold(0, new x00.p() { // from class: kotlinx.coroutines.flow.internal.t
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                int collectContextSize$lambda$0;
                collectContextSize$lambda$0 = SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (d.b) obj2);
                return Integer.valueOf(collectContextSize$lambda$0);
            }
        })).intValue();
    }

    private final void checkContext(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2, T t11) {
        if (dVar2 instanceof l) {
            exceptionTransparencyViolated((l) dVar2, t11);
        }
        SafeCollector_commonKt.b(this, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i11, d.b bVar) {
        return i11 + 1;
    }

    private final void exceptionTransparencyViolated(l lVar, Object obj) {
        throw new IllegalStateException(u30.y.v("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f68273b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.j
    @m80.l
    public Object emit(T t11, @m80.k j00.c<? super g2> cVar) {
        try {
            Object emit = emit(cVar, (j00.c<? super g2>) t11);
            if (emit == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            return emit == kotlin.coroutines.intrinsics.b.l() ? emit : g2.f100423a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new l(th2, cVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, l00.c
    @m80.l
    public l00.c getCallerFrame() {
        j00.c<? super g2> cVar = this.completion_;
        if (cVar instanceof l00.c) {
            return (l00.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        kotlin.coroutines.d dVar = this.lastEmissionContext;
        return dVar == null ? EmptyCoroutineContext.INSTANCE : dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, l00.c
    @m80.l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.k
    public Object invokeSuspend(@m80.k Object obj) {
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        if (m6311exceptionOrNullimpl != null) {
            this.lastEmissionContext = new l(m6311exceptionOrNullimpl, getContext());
        }
        j00.c<? super g2> cVar = this.completion_;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return kotlin.coroutines.intrinsics.b.l();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(j00.c<? super g2> cVar, T t11) {
        x00.q qVar;
        kotlin.coroutines.d context = cVar.getContext();
        n2.z(context);
        kotlin.coroutines.d dVar = this.lastEmissionContext;
        if (dVar != context) {
            checkContext(context, dVar, t11);
            this.lastEmissionContext = context;
        }
        this.completion_ = cVar;
        qVar = u.f68285a;
        kotlinx.coroutines.flow.j<T> jVar = this.collector;
        g0.n(jVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        g0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = qVar.invoke(jVar, t11, this);
        if (!g0.g(invoke, kotlin.coroutines.intrinsics.b.l())) {
            this.completion_ = null;
        }
        return invoke;
    }
}

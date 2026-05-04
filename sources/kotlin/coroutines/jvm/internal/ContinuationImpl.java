package kotlin.coroutines.jvm.internal;

import j00.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.b;
import m80.k;
import m80.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@u0({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* loaded from: classes8.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @l
    private final d _context;

    @l
    private transient c<Object> intercepted;

    public ContinuationImpl(@l c<Object> cVar, @l d dVar) {
        super(cVar);
        this._context = dVar;
    }

    @Override // j00.c
    @k
    public d getContext() {
        d dVar = this._context;
        g0.m(dVar);
        return dVar;
    }

    @k
    public final c<Object> intercepted() {
        c<Object> cVar = this.intercepted;
        if (cVar == null) {
            kotlin.coroutines.c cVar2 = (kotlin.coroutines.c) getContext().get(kotlin.coroutines.c.f66933w0);
            if (cVar2 == null || (cVar = cVar2.interceptContinuation(this)) == null) {
                cVar = this;
            }
            this.intercepted = cVar;
        }
        return cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        c<?> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            d.b bVar = getContext().get(kotlin.coroutines.c.f66933w0);
            g0.m(bVar);
            ((kotlin.coroutines.c) bVar).releaseInterceptedContinuation(cVar);
        }
        this.intercepted = b.f69110a;
    }

    public ContinuationImpl(@l c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}

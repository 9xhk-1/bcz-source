package kotlin.coroutines.jvm.internal;

import j00.c;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import l00.l;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements c0<Object>, l {
    private final int arity;

    public RestrictedSuspendLambda(int i11, @m80.l c<Object> cVar) {
        super(cVar);
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String w11 = o0.w(this);
        g0.o(w11, "renderLambdaToString(...)");
        return w11;
    }

    public RestrictedSuspendLambda(int i11) {
        this(i11, null);
    }
}

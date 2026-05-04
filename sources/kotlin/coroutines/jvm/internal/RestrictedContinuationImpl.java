package kotlin.coroutines.jvm.internal;

import j00.c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(@l c<Object> cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != EmptyCoroutineContext.INSTANCE) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // j00.c
    @k
    public d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}

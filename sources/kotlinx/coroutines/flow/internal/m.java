package kotlinx.coroutines.flow.internal;

import h40.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m<T> extends t0<T> {
    public m(@m80.k kotlin.coroutines.d dVar, @m80.k j00.c<? super T> cVar) {
        super(dVar, cVar);
    }

    @Override // c40.r2
    public boolean u0(@m80.k Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return n0(th2);
    }
}

package kotlinx.coroutines.flow.internal;

import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {
    @v0
    public static final int a(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@m80.k AbortFlowException abortFlowException, @m80.k Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }
}

package i00;

import kotlin.contracts.InvocationKind;
import m80.l;
import yz.w;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@f
@o00.b
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ i00.a a(c cVar, w wVar, InvocationKind invocationKind, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i11 & 2) != 0) {
                invocationKind = InvocationKind.UNKNOWN;
            }
            return cVar.b(wVar, invocationKind);
        }
    }

    @m80.k
    @o00.b
    i a();

    @m80.k
    @o00.b
    <R> i00.a b(@m80.k w<? extends R> wVar, @m80.k InvocationKind invocationKind);

    @m80.k
    @o00.b
    i c(@l Object obj);

    @m80.k
    @o00.b
    j d();

    @g
    @m80.k
    @o00.b
    <R> h e(boolean z11, @m80.k w<? extends R> wVar);

    @g
    @o00.b
    void f(boolean z11, @m80.k j jVar);
}

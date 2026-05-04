package kotlin.coroutines.intrinsics;

import j00.c;
import kotlin.NotImplementedError;
import m80.k;
import o00.f;
import x00.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b extends IntrinsicsKt__IntrinsicsJvmKt {
    @k
    public static Object l() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @y0(version = "1.3")
    @f
    public static final <T> Object n(l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }

    @y0(version = "1.3")
    public static /* synthetic */ void m() {
    }
}

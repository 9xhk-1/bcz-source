package cx;

import c40.r0;
import ix.a1;
import ix.e1;
import ix.t2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface w extends a1, r0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.k
        public static kotlin.coroutines.d a(@m80.k w wVar) {
            return wVar.c().getCoroutineContext();
        }
    }

    @m80.k
    mw.a c();

    @m80.k
    xy.b getAttributes();

    @m80.k
    kotlin.coroutines.d getCoroutineContext();

    @m80.k
    e1 getMethod();

    @m80.k
    t2 getUrl();

    @m80.k
    mx.v w();
}

package t3;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v<T> extends d<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@m80.k j<T> storage, @m80.k x00.l<? super j00.c<? super T>, ? extends Object> remote, @m80.k h checker) {
        super(storage, remote, checker);
        g0.p(storage, "storage");
        g0.p(remote, "remote");
        g0.p(checker, "checker");
    }

    @Override // t3.d
    @m80.l
    public Object d(@m80.k j00.c<? super T> cVar) {
        return h().invoke(cVar);
    }
}

package z50;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import t50.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f100930a = new a();

    @Override // t50.n
    @k
    public okhttp3.n intercept(@k n.a chain) throws IOException {
        g0.p(chain, "chain");
        a60.g gVar = (a60.g) chain;
        return a60.g.i(gVar, 0, gVar.j().t(gVar), null, 0, 0, 0, 61, null).c(gVar.n());
    }
}

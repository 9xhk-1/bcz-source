package cx;

import cx.y;
import ix.b2;
import ix.j2;
import java.net.URL;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpRequestJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestJvm.kt\nio/ktor/client/request/HttpRequestJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {
    @m80.k
    public static final y a(@m80.k y.a aVar, @m80.k URL url) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(url, "url");
        y yVar = new y();
        b(yVar, url);
        return yVar;
    }

    @m80.k
    public static final b2 b(@m80.k y yVar, @m80.k URL url) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(url, "url");
        return j2.c(yVar.j(), url);
    }
}

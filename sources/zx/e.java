package zx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    @m80.k
    public static final String a(@m80.k ey.a aVar) {
        String string;
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        ey.c d11 = aVar.d(io.ktor.server.engine.y.f61464c);
        return (d11 == null || (string = d11.getString()) == null) ? "0.0.0.0" : string;
    }

    public static final int b(@m80.k ey.a aVar) {
        String string;
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        ey.c d11 = aVar.d(io.ktor.server.engine.y.f61465d);
        if (d11 == null || (string = d11.getString()) == null) {
            return 8080;
        }
        return Integer.parseInt(string);
    }
}

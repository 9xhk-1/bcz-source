package f70;

import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes9.dex */
public final class a {
    public static r70.b a() {
        r70.b bVar = new r70.b();
        bVar.e(new r70.a("http", 80, null));
        bVar.e(new r70.a("https", 443, s70.b.c()));
        return bVar;
    }
}

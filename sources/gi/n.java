package gi;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53833a = "DebugUtil";

    public static void a(yc.b proxy) {
        qb.c.b(f53833a, "[id=%d, time=%d, score=%d, new=%s, killed=%s]", Integer.valueOf(proxy.e0()), Long.valueOf(proxy.f0()), Integer.valueOf(proxy.k0()), Boolean.valueOf(proxy.r0()), Boolean.valueOf(proxy.q0()));
    }

    public static void b(List<yc.b> proxies) {
        Iterator<yc.b> it = proxies.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}

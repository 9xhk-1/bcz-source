package gj;

import java.util.List;
import q9.x;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f53883a = {gb.d.f53556a, gb.d.f53557b};

    /* renamed from: b, reason: collision with root package name */
    public static List<String> f53884b = null;

    public static String a(String path) {
        if (f53884b == null && x.r().j() != null) {
            f53884b = x.r().j().getRes_dns();
        }
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        if (e.h(f53884b)) {
            return f53883a + path;
        }
        return f53884b.get(0) + path;
    }
}

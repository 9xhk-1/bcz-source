package mq;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, a> f73653a = new HashMap();

    public interface a {
        String a(e eVar);
    }

    public static Map<String, a> a() {
        return f73653a;
    }

    public static void b(String str, a aVar) {
        f73653a.put(str, aVar);
    }
}

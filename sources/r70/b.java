package r70;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpHost;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, a> f83589a = new ConcurrentHashMap();

    public final a a(String str) {
        if (str != null) {
            return this.f83589a.get(str);
        }
        throw new IllegalArgumentException("Name must not be null.");
    }

    public final a b(String str) {
        a a11 = a(str);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException("Scheme '" + str + "' not registered.");
    }

    public final a c(HttpHost httpHost) {
        if (httpHost != null) {
            return b(httpHost.getSchemeName());
        }
        throw new IllegalArgumentException("Host must not be null.");
    }

    public final List<String> d() {
        return new ArrayList(this.f83589a.keySet());
    }

    public final a e(a aVar) {
        if (aVar != null) {
            return this.f83589a.put(aVar.c(), aVar);
        }
        throw new IllegalArgumentException("Scheme must not be null.");
    }

    public void f(Map<String, a> map) {
        if (map == null) {
            return;
        }
        this.f83589a.clear();
        this.f83589a.putAll(map);
    }

    public final a g(String str) {
        if (str != null) {
            return this.f83589a.remove(str);
        }
        throw new IllegalArgumentException("Name must not be null.");
    }
}

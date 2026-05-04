package c80;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class g0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, T> f8345a = new LinkedHashMap();

    public synchronized Set<Map.Entry<String, T>> a() {
        return new HashSet(this.f8345a.entrySet());
    }

    @Deprecated
    public synchronized Map<String, T> b() {
        return this.f8345a;
    }

    public synchronized T c(String str) {
        T t11;
        try {
            e80.a.j(str, "Request path");
            t11 = this.f8345a.get(str);
            if (t11 == null) {
                String str2 = null;
                for (String str3 : this.f8345a.keySet()) {
                    if (d(str3, str)) {
                        if (str2 != null) {
                            if (str2.length() >= str3.length()) {
                                if (str2.length() == str3.length() && str3.endsWith("*")) {
                                }
                            }
                        }
                        t11 = this.f8345a.get(str3);
                        str2 = str3;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return t11;
    }

    public boolean d(String str, String str2) {
        if (str.equals("*")) {
            return true;
        }
        return (str.endsWith("*") && str2.startsWith(str.substring(0, str.length() - 1))) || (str.startsWith("*") && str2.endsWith(str.substring(1, str.length())));
    }

    public synchronized void e(String str, T t11) {
        e80.a.j(str, "URI request pattern");
        this.f8345a.put(str, t11);
    }

    @Deprecated
    public synchronized void f(Map<String, T> map) {
        e80.a.j(map, "Map of handlers");
        this.f8345a.clear();
        this.f8345a.putAll(map);
    }

    @Deprecated
    public synchronized void g(Map<String, T> map) {
        e80.a.j(map, "Map of handlers");
        this.f8345a.clear();
        this.f8345a.putAll(map);
    }

    public synchronized void h(String str) {
        if (str == null) {
            return;
        }
        this.f8345a.remove(str);
    }

    public String toString() {
        return this.f8345a.toString();
    }
}

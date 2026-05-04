package v60;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public final class d<I> implements b<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, I> f93134a;

    public d(Map<String, I> map) {
        this.f93134a = new ConcurrentHashMap(map);
    }

    @Override // v60.b
    public I a(String str) {
        if (str == null) {
            return null;
        }
        return this.f93134a.get(str.toLowerCase(Locale.ROOT));
    }

    public String toString() {
        return this.f93134a.toString();
    }
}

package sc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f88270b = "MsgHub";

    /* renamed from: c, reason: collision with root package name */
    public static c f88271c;

    /* renamed from: a, reason: collision with root package name */
    public Set<b> f88272a;

    public c() {
        this.f88272a = null;
        this.f88272a = Collections.synchronizedSet(new HashSet());
    }

    public static c c() {
        if (f88271c == null) {
            synchronized (c.class) {
                try {
                    if (f88271c == null) {
                        f88271c = new c();
                    }
                } finally {
                }
            }
        }
        return f88271c;
    }

    public void a(b w11) {
        qb.c.i(f88270b, "add %d", Integer.valueOf(w11 == null ? 0 : w11.hashCode()));
        if (w11 != null) {
            this.f88272a.add(w11);
        }
    }

    public void b() {
        this.f88272a.clear();
    }

    public void d(String msg, String channel) {
        qb.c.i(f88270b, "[msg, channel, watcher] [%s,%s,%d]", msg, channel, Integer.valueOf(this.f88272a.size()));
        Iterator<b> it = this.f88272a.iterator();
        while (it.hasNext()) {
            it.next().onMessage(msg, channel);
        }
    }

    public void e(b w11) {
        qb.c.i(f88270b, "remove %d", Integer.valueOf(w11 == null ? 0 : w11.hashCode()));
        if (w11 != null) {
            this.f88272a.remove(w11);
        }
    }
}

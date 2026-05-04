package rh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f84070b = "MsgIdCache";

    /* renamed from: c, reason: collision with root package name */
    public static final String f84071c = "MsgIdCache_ids";

    /* renamed from: d, reason: collision with root package name */
    public static e f84072d;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, List<String>> f84073a = null;

    public e() {
        e();
    }

    public static e d() {
        if (f84072d == null) {
            synchronized (e.class) {
                try {
                    if (f84072d == null) {
                        f84072d = new e();
                    }
                } finally {
                }
            }
        }
        return f84072d;
    }

    public void a(String id2) {
        if (!this.f84073a.containsKey(String.valueOf(f()))) {
            this.f84073a.put(String.valueOf(f()), Collections.synchronizedList(new ArrayList()));
        }
        this.f84073a.get(String.valueOf(f())).add(id2);
        c();
    }

    public boolean b(String id2) {
        Iterator<List<String>> it = this.f84073a.values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(id2)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        pb.a.a().getSharedPreferences(f84070b, 0).edit().putString(f84071c, new com.google.gson.d().z(this.f84073a)).apply();
    }

    public final void e() {
        String string = pb.a.a().getSharedPreferences(f84070b, 0).getString(f84071c, "");
        qb.c.i(f84070b, "load %s", string);
        try {
            this.f84073a = (Map) new com.google.gson.d().n(string, Map.class);
        } catch (Exception e11) {
            qb.c.c(f84070b, "", e11);
        }
        if (this.f84073a == null) {
            this.f84073a = new HashMap();
        }
        this.f84073a = Collections.synchronizedMap(this.f84073a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f84073a.keySet()) {
            Map<String, List<String>> map = this.f84073a;
            map.put(str, Collections.synchronizedList(map.get(str)));
            if (f() - Long.valueOf(str).longValue() >= 8) {
                arrayList.add(str);
            }
        }
        qb.c.i(f84070b, "size %d", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f84073a.remove((String) it.next());
        }
    }

    public final long f() {
        return System.currentTimeMillis() / 86400000;
    }
}

package y9;

import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.baicizhan.online.bcz_system_api.StaticConfig;
import i9.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final String f99706f = "StaticConfigMgr";

    /* renamed from: g, reason: collision with root package name */
    public static final String f99707g = "StaticConfig";

    /* renamed from: a, reason: collision with root package name */
    public int f99708a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f99709b = 2;

    /* renamed from: c, reason: collision with root package name */
    public int f99710c = 4;

    /* renamed from: d, reason: collision with root package name */
    public int f99711d = 8;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, y9.a> f99712e = new ConcurrentHashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends bp.a<Map<String, y9.a>> {
        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f99714a = new e();
    }

    public static e f() {
        return b.f99714a;
    }

    public void b() {
        qb.c.i(f99706f, "clean", new Object[0]);
        this.f99712e.clear();
        g.c().d(f99707g, "");
    }

    public Object c(String key, String field) {
        if (!d(key, field)) {
            return null;
        }
        try {
            return this.f99712e.get(key).f99684c.get(field);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public boolean d(String key, String field) {
        try {
            if (this.f99712e.containsKey(key)) {
                if (this.f99712e.get(key).f99684c.containsKey(field)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public boolean e(String key) {
        return this.f99712e.containsKey(key);
    }

    public final /* synthetic */ Boolean g(BczSystemApiService.Client client) {
        try {
            List<StaticConfig> list = client.get_static_config();
            this.f99712e.clear();
            for (StaticConfig staticConfig : list) {
                qb.c.b(f99706f, "config: " + staticConfig, new Object[0]);
                this.f99712e.put(staticConfig.key, y9.a.a(staticConfig));
            }
            g.c().d(f99707g, new com.google.gson.d().z(this.f99712e));
            return Boolean.TRUE;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public void h() {
        Map<? extends String, ? extends y9.a> map = (Map) new com.google.gson.d().o(g.c().b(f99707g), new a().getType());
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        this.f99712e.putAll(map);
    }

    public rx.c<Boolean> i() {
        return p.a(new l("/rpc/bcz_system")).w5(bc0.c.e()).c3(new wb0.p() { // from class: y9.d
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean g11;
                g11 = e.this.g((BczSystemApiService.Client) obj);
                return g11;
            }
        });
    }
}

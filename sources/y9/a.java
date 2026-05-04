package y9;

import com.baicizhan.online.bcz_system_api.StaticConfig;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f99682a;

    /* renamed from: b, reason: collision with root package name */
    public int f99683b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Object> f99684c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y9.a$a, reason: collision with other inner class name */
    public class C1353a extends bp.a<Map<String, Object>> {
    }

    public static a a(StaticConfig config) {
        a aVar = new a();
        aVar.f99682a = config.key;
        aVar.f99683b = config.bit_flag;
        aVar.f99684c = (Map) new com.google.gson.d().o(config.config_json, new C1353a().getType());
        return aVar;
    }
}

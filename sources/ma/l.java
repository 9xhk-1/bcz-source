package ma;

import com.baicizhan.client.business.util.BczJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f72984a = "ReportV2";

    /* renamed from: b, reason: collision with root package name */
    public static final String f72985b = "bcz_app";

    public static void a(final String group, final String eventId) {
        b(group, eventId, null);
    }

    public static void b(final String group, final String eventId, final Map<String, String> data) {
        r.g().k(group, eventId, data);
    }

    public static void c(final String group, final String eventId) {
        r.g().m(group, eventId, null);
    }

    public static void d(final String group, final String eventId, final Map<String, String> data) {
        r.g().m(group, eventId, data);
    }

    public static void e(final String group, final String eventId, final Map<String, Object> data) {
        HashMap hashMap = new HashMap();
        hashMap.put("extra_info", BczJson.toJson(data));
        b(group, eventId, hashMap);
    }

    public static void f(final String group, final String eventId, List<String> extras) {
        long currentTimeMillis = System.currentTimeMillis();
        r g11 = r.g();
        ArrayList arrayList = new ArrayList(extras.size());
        for (String str : extras) {
            HashMap hashMap = new HashMap();
            hashMap.put("extra_info", str);
            String str2 = group;
            arrayList.add(g11.j(str2, eventId, hashMap, currentTimeMillis));
            group = str2;
        }
        g11.o(arrayList);
        qb.c.i("ReportV2", "batch size %d", Integer.valueOf(arrayList.size()));
    }

    public static void g(final String group, final String eventId, final Map<String, Object> data) {
        HashMap hashMap = new HashMap();
        hashMap.put("extra_info", BczJson.toJson(data));
        r.g().m(group, eventId, hashMap);
    }
}

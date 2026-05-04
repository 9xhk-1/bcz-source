package oc;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, d> f76763a;

    static {
        HashMap hashMap = new HashMap();
        f76763a = hashMap;
        hashMap.put("huawei", new qc.a());
        hashMap.put("oppo", new uc.a());
        hashMap.put("vivo", new vc.c());
        hashMap.put("meizu", new rc.a());
        hashMap.put(h.f76767b, new tc.a());
    }

    public static d a(Context context) {
        c cVar = new c();
        Iterator<Map.Entry<String, d>> it = f76763a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, d> next = it.next();
            if (next.getValue().c(context)) {
                cVar.d(next.getValue());
                i.f().i(next.getKey());
                break;
            }
        }
        return cVar;
    }
}

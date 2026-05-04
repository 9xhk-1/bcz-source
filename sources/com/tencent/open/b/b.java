package com.tencent.open.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f44450a;

    /* renamed from: b, reason: collision with root package name */
    private String f44451b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f44452c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f44453d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f44454e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f44455f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f44456g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f44457h = "";

    /* renamed from: i, reason: collision with root package name */
    private List<Serializable> f44458i = Collections.synchronizedList(new ArrayList());

    /* renamed from: j, reason: collision with root package name */
    private List<Serializable> f44459j = Collections.synchronizedList(new ArrayList());

    /* renamed from: k, reason: collision with root package name */
    private Executor f44460k = l.b();

    /* renamed from: l, reason: collision with root package name */
    private boolean f44461l;

    private b() {
    }

    private void c() {
        while (!this.f44459j.isEmpty()) {
            c cVar = (c) this.f44459j.remove(0);
            cVar.f44464a.put("appid", this.f44451b);
            cVar.f44464a.put("app_name", this.f44452c);
            cVar.f44464a.put(Constants.PARAM_APP_VER, this.f44454e);
            cVar.f44464a.put(Constants.PARAM_PKG_NAME, this.f44455f);
            cVar.f44464a.put("qq_install", this.f44456g);
            cVar.f44464a.put(Constants.PARAM_QQ_VER, this.f44457h);
            cVar.f44464a.put("openid", this.f44453d);
            cVar.f44464a.put("time_appid_openid", cVar.f44464a.get("time") + "_" + this.f44451b + "_" + this.f44453d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fixDirtyData--------------------------");
            sb2.append(cVar);
            SLog.i("AttaReporter", sb2.toString());
            this.f44458i.add(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        SLog.i("AttaReporter", "attaReportAtSubThread");
        if (!this.f44461l) {
            List<Serializable> b11 = g.b("report_atta");
            this.f44461l = b11.isEmpty();
            this.f44458i.addAll(b11);
            Iterator<Serializable> it = b11.iterator();
            while (it.hasNext()) {
                SLog.i("AttaReporter", "attaReportAtSubThread from db = " + it.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f44458i.isEmpty()) {
            c cVar = (c) this.f44458i.remove(0);
            if (!b(cVar)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.f44461l) {
                return;
            }
            SLog.i("AttaReporter", "attaReportAtSubThread clear db");
            g.a("report_atta");
            this.f44461l = true;
            return;
        }
        SLog.i("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SLog.i("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((c) ((Serializable) it2.next())));
        }
        g.a("report_atta", arrayList);
        this.f44461l = false;
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f44450a == null) {
                    f44450a = new b();
                }
                bVar = f44450a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private c b(String str, String str2, Object obj, Map<String, Object> map) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("attaid", "09400051119");
        hashMap.put("token", "9389887874");
        hashMap.put("time_appid_openid", currentTimeMillis + "_" + this.f44451b + "_" + this.f44453d);
        hashMap.put("time", String.valueOf(currentTimeMillis));
        hashMap.put("openid", this.f44453d);
        hashMap.put("appid", this.f44451b);
        hashMap.put("app_name", this.f44452c);
        hashMap.put(Constants.PARAM_APP_VER, this.f44454e);
        hashMap.put(Constants.PARAM_PKG_NAME, this.f44455f);
        hashMap.put("os", "AND");
        hashMap.put("os_ver", Build.VERSION.RELEASE);
        hashMap.put("sdk_ver", Constants.SDK_VERSION);
        hashMap.put(Constants.PARAM_MODEL_NAME, com.tencent.open.utils.f.a().c(com.tencent.open.utils.g.a()));
        hashMap.put("interface_name", str);
        hashMap.put("interface_data", str2);
        hashMap.put("interface_result", obj == null ? "" : obj.toString());
        hashMap.put("qq_install", this.f44456g);
        hashMap.put(Constants.PARAM_QQ_VER, this.f44457h);
        if (map != null && !map.isEmpty()) {
            Object obj2 = map.get("reserve1");
            hashMap.put("reserve1", obj2 == null ? "" : obj2.toString());
            Object obj3 = map.get("reserve2");
            hashMap.put("reserve2", obj3 == null ? "" : obj3.toString());
            Object obj4 = map.get("reserve3");
            hashMap.put("reserve3", obj4 == null ? "" : obj4.toString());
            Object obj5 = map.get("reserve4");
            hashMap.put("reserve4", obj5 != null ? obj5.toString() : "");
        }
        return new c((HashMap<String, String>) hashMap);
    }

    public void a(String str, Context context) {
        SLog.i("AttaReporter", "init");
        this.f44451b = str;
        this.f44452c = k.a(context);
        this.f44454e = m.d(context, com.tencent.open.utils.g.b());
        this.f44455f = com.tencent.open.utils.g.b();
        this.f44456g = k.b(context) ? "1" : "0";
        this.f44457h = m.c(context, "com.tencent.mobileqq");
        c();
        g.a();
    }

    public void a(String str) {
        SLog.i("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f44453d = str;
    }

    public void a(String str, String str2) {
        a(str, str2, null);
    }

    public void a(String str, String str2, Map<String, Object> map) {
        a(str, str2, "", map);
    }

    public void a(String str, Object obj) {
        a(str, "", obj, null);
    }

    public void a(String str, String str2, Object obj, Map<String, Object> map) {
        c b11 = b(str, str2, obj, map);
        if (!TextUtils.isEmpty(this.f44451b) && !TextUtils.isEmpty(this.f44452c) && com.tencent.open.utils.g.a() != null) {
            a(b11);
            return;
        }
        SLog.i("AttaReporter", "attaReport cancel appid=" + this.f44451b + ", mAppName=" + this.f44452c + ", context=" + com.tencent.open.utils.g.a() + j2.O + b11);
        this.f44459j.add(b11);
    }

    private void a(final c cVar) {
        this.f44460k.execute(new Runnable() { // from class: com.tencent.open.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f44458i.add(cVar);
                if (m.b(com.tencent.open.utils.g.a())) {
                    try {
                        b.this.d();
                        return;
                    } catch (Exception e11) {
                        SLog.e("AttaReporter", "Exception", e11);
                        return;
                    }
                }
                SLog.i("AttaReporter", "attaReport net disconnect, " + cVar);
            }
        });
    }

    private boolean b(c cVar) {
        int i11 = 0;
        do {
            i11++;
            try {
                SLog.i("AttaReporter", "doAttaReportItem post " + cVar);
                return com.tencent.open.a.f.a().b("https://h.trace.qq.com/kv", cVar.f44464a).d() == 200;
            } catch (Exception e11) {
                SLog.i("AttaReporter", "Exception", e11);
            }
        } while (i11 < 2);
        return false;
    }

    public static String b() {
        return a().f44451b;
    }
}

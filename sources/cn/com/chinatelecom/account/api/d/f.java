package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import com.baicizhan.main.vld.bonding.DeviceBondingActivityKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8988a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static int f8989b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, e> f8990c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static List<e> f8991d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private static e f8992e = null;

    public static synchronized e a(String str) {
        e eVar;
        synchronized (f.class) {
            try {
                eVar = f8990c.containsKey(str) ? f8990c.get(str) : null;
                if (eVar == null) {
                    eVar = new e(str);
                    f8990c.put(str, eVar);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return new e(str);
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (f.class) {
                try {
                    e eVar = f8992e;
                    if (eVar != null) {
                        arrayList.add(eVar.toString());
                        f8992e = null;
                    }
                    Iterator<e> it = f8991d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().toString());
                    }
                    f8989b = 0;
                    f8991d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            cn.com.chinatelecom.account.a.c.a(context, arrayList);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    public static void c(String str) {
        try {
            synchronized (f.class) {
                try {
                    if (f8990c.containsKey(str)) {
                        e eVar = f8990c.get(str);
                        eVar.b();
                        f8991d.add(eVar);
                        f8990c.remove(str);
                    }
                    if (f8989b != 1 && !f8991d.isEmpty()) {
                        f8989b = 1;
                        new Timer().schedule(new TimerTask() { // from class: cn.com.chinatelecom.account.api.d.f.1
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                f.b(cn.com.chinatelecom.account.api.a.f8834c);
                            }
                        }, DeviceBondingActivityKt.f25227b);
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static synchronized void b(String str) {
        synchronized (f.class) {
            try {
                if (f8990c.containsKey(str)) {
                    e eVar = f8990c.get(str);
                    f8992e = eVar;
                    eVar.b();
                    f8990c.remove(str);
                }
            } finally {
            }
        }
    }

    public static void a(Context context, String str) {
        cn.com.chinatelecom.account.a.c.a(context, str);
    }

    public static void b(String str, JSONObject jSONObject, String str2) {
        try {
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("msg");
            if (optInt == 0) {
                a(str).a(optInt).e(optString);
            } else {
                a(str).a(optInt).e(optString).d(str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static synchronized void a(String str, JSONObject jSONObject, String str2) {
        synchronized (f.class) {
            try {
            } finally {
            }
            if (f8990c.containsKey(str)) {
                f8990c.get(str).g(str2);
                return;
            }
            if (f8991d.size() > 0) {
                for (e eVar : f8991d) {
                    if (eVar.a() != null && eVar.a().equals(str) && jSONObject != null) {
                        jSONObject.remove("data");
                        eVar.g(jSONObject.toString());
                        eVar.g(str2);
                    }
                }
            }
        }
    }
}

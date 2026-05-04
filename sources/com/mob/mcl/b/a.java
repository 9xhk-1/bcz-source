package com.mob.mcl.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.mob.MobSDK;
import com.mob.apc.b;
import com.mob.mcl.BusinessMessageListener;
import com.mob.mcl.MobMCL;
import com.mob.mcl.c.h;
import com.mob.mcl.d.d;
import com.mob.mgs.OnIdChangeListener;
import com.mob.tools.network.HttpResponseCallback;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.network.StringPart;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.UIHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import u30.u0;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f40475a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f40476b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static NetworkHelper f40477c = new NetworkHelper();

    /* renamed from: d, reason: collision with root package name */
    private static CopyOnWriteArraySet<String> f40478d = new CopyOnWriteArraySet<>();

    /* renamed from: com.mob.mcl.b.a$a, reason: collision with other inner class name */
    public static class C0485a implements b.InterfaceC0482b {
        private C0485a() {
        }

        @Override // com.mob.apc.b.InterfaceC0482b
        public com.mob.apc.a a(String str, com.mob.apc.a aVar, long j11) {
            com.mob.apc.a a11 = com.mob.mcl.a.a.a().a(str, aVar);
            if (a11 != null) {
                try {
                    Object obj = a11.f40054d;
                    if (obj != null && (obj instanceof com.mob.mcl.a.b)) {
                        com.mob.mcl.a.b bVar = (com.mob.mcl.a.b) obj;
                        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                        networkTimeOut.readTimout = bVar.f40473f;
                        networkTimeOut.connectionTimeout = bVar.f40474g;
                        if ("POST".equals(bVar.f40468a)) {
                            a11.f40054d = null;
                            a.a(true, bVar.f40469b, com.mob.mcl.a.b.a(bVar.f40470c), new StringPart().append(bVar.f40471d), bVar.f40472e, com.mob.mcl.a.a(bVar.f40469b, a11), networkTimeOut);
                        } else if ("GET".equals(bVar.f40468a)) {
                            com.mob.mcl.a.a.a().b(a.a(true, bVar.f40469b, null, com.mob.mcl.a.b.a(bVar.f40470c), networkTimeOut), a11);
                        }
                    } else if (a11.f40051a == 9004) {
                        String string = aVar.f40055e.getString("data");
                        long j12 = aVar.f40055e.getLong("uniqueId");
                        if (!TextUtils.isEmpty(string)) {
                            try {
                                HashMap fromJson = HashonHelper.fromJson(h.b().a(h.b().j(), string));
                                String str2 = (String) fromJson.get("workId");
                                int a12 = h.a((HashMap<String, Object>) fromJson, "expire", 0);
                                boolean z11 = h.a((HashMap<String, Object>) fromJson, "needRepeat", 0) == 1;
                                int a13 = h.a((HashMap<String, Object>) fromJson, "type", 0);
                                String str3 = (String) fromJson.get("data");
                                if (a13 == 1 || a13 == 2) {
                                    boolean z12 = z11;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data", str3);
                                    bundle.putString("workId", str2);
                                    bundle.putLong("uniqueId", aVar.f40055e.getLong("uniqueId"));
                                    bundle.putInt("expire", a12);
                                    bundle.putInt("msgType", a13);
                                    int a14 = h.b().a(bundle);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putBoolean("needRepeat", z12);
                                    bundle2.putInt("repeat", a14);
                                    a11.f40055e = bundle2;
                                } else {
                                    boolean z13 = z11;
                                    boolean a15 = h.b().a(j12, str2, a12, a13, str3);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putBoolean("needRepeat", z13);
                                    bundle3.putInt("repeat", a15 ? 1 : 0);
                                    a11.f40055e = bundle3;
                                }
                            } catch (Throwable th2) {
                                com.mob.mcl.d.b.a().a(th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    com.mob.mcl.d.b.a().a(th3);
                }
            }
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i11) {
        if (i11 < 6) {
            boolean isInMainProcess = DeviceHelper.getInstance(MobSDK.getContext()).isInMainProcess();
            com.mob.mcl.d.b.a().b("tp rgs, main p: " + isInMainProcess);
            if ((!isInMainProcess && com.mob.mcl.a.a.a().b()) || e(5000) || h.b().a()) {
                return;
            }
            if (i11 == 0) {
                a(i11 + 1, 10);
                return;
            }
            if (i11 == 1) {
                a(i11 + 1, 30);
                return;
            }
            if (i11 == 2) {
                a(i11 + 1, 60);
            } else if (i11 == 3) {
                a(i11 + 1, 180);
            } else if (i11 == 4) {
                a(i11 + 1, 300);
            }
        }
    }

    private static boolean e(int i11) {
        try {
        } finally {
            try {
                return false;
            } finally {
            }
        }
        if (!f40476b.getAndSet(true)) {
            boolean isInMainProcess = DeviceHelper.getInstance(MobSDK.getContext()).isInMainProcess();
            com.mob.mcl.d.b.a().b("init tp, main p: " + isInMainProcess);
            if (isInMainProcess) {
                h.b().f();
                if (!h.b().f40515f) {
                    f40476b.set(false);
                } else if (!h.b().d()) {
                    com.mob.mcl.d.b.a().a("tp reg avail false");
                } else {
                    if (h.b().a(i11)) {
                        com.mob.mcl.c.b.a();
                        if (!h.b().f40517h) {
                            e();
                        }
                        f40476b.set(false);
                        return true;
                    }
                    boolean z11 = h.b().f40521l;
                    com.mob.mcl.d.b.a().a("tp reg failed");
                }
            }
            e();
            return false;
        }
        return false;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f40478d.add(str);
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f40478d.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Runnable c(final int i11) {
        return new Runnable() { // from class: com.mob.mcl.b.a.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (h.b().c()) {
                        return;
                    }
                    a.d(i11);
                } catch (Throwable th2) {
                    com.mob.mcl.d.b.a().a(th2);
                }
            }
        };
    }

    public static void a(Context context, String str, String str2) {
        Context applicationContext;
        com.mob.mcl.d.b.a().a("mcl ini");
        if (context == null) {
            applicationContext = MobSDK.getContext();
        } else {
            applicationContext = context.getApplicationContext();
        }
        h.b().a(applicationContext, str, str2);
        com.mob.mcl.a.a.a().a(applicationContext, new C0485a());
        d.a(false);
        a(0, 0);
    }

    public static long b() {
        h.b().h();
        return h.b().f40520k;
    }

    private static void d() {
        try {
            if (!f40476b.getAndSet(true)) {
                boolean isInMainProcess = DeviceHelper.getInstance(MobSDK.getContext()).isInMainProcess();
                com.mob.mcl.d.b.a().b("rgs tp, main p: " + isInMainProcess);
                if (isInMainProcess) {
                    if (!h.b().f40515f) {
                        f40476b.set(false);
                    } else if (h.b().d()) {
                        if (h.b().a(3000)) {
                            com.mob.mcl.c.b.a();
                            f40476b.set(false);
                        } else {
                            com.mob.mcl.d.b.a().a("tp reg failed");
                        }
                    } else {
                        f40475a.execute(new Runnable() { // from class: com.mob.mcl.b.a.3
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    if (h.b().c()) {
                                        return;
                                    }
                                    if (!h.b().d()) {
                                        h.b().f();
                                    }
                                    h.b().g();
                                    if (h.b().f40517h) {
                                        return;
                                    }
                                    a.e();
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    private static void a(final int i11, int i12) {
        UIHandler.sendEmptyMessageDelayed(0, i12 * 1000, new Handler.Callback() { // from class: com.mob.mcl.b.a.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                a.f40475a.execute(a.c(i11));
                return false;
            }
        });
    }

    public static String a(boolean z11, String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkHelper.NetworkTimeOut networkTimeOut) throws Throwable {
        CopyOnWriteArraySet<String> copyOnWriteArraySet;
        if (!z11 && (copyOnWriteArraySet = f40478d) != null) {
            Iterator<String> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    String httpGetNew = f40477c.httpGetNew(str, hashMap, hashMap2, networkTimeOut);
                    com.mob.mcl.d.b.a().a("mcl htp");
                    return httpGetNew;
                }
            }
        }
        if (hashMap != null) {
            String a11 = a(hashMap);
            if (a11.length() > 0) {
                str = str + "?" + a11;
            }
            hashMap = null;
        }
        if (h.b().e()) {
            if (!h.b().c()) {
                d();
            }
            if (h.b().c()) {
                HashMap<String, Object> a12 = h.b().a(1004, networkTimeOut.readTimout, a("GET", str, hashMap2, null));
                if (a12 != null) {
                    com.mob.mcl.d.b.a().a("mcl tp");
                    return HashonHelper.fromHashMap(a12);
                }
                if (!z11) {
                    String httpGetNew2 = f40477c.httpGetNew(str, hashMap, hashMap2, networkTimeOut);
                    com.mob.mcl.d.b.a().a("mcl htp");
                    return httpGetNew2;
                }
            }
        }
        if (z11) {
            return null;
        }
        if (!com.mob.mcl.a.a.a().b()) {
            a(5, 0);
        }
        return a(str, hashMap2, networkTimeOut);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        if (com.mob.mcl.a.a.a().b()) {
            return;
        }
        com.mob.mcl.a.a.a().c();
    }

    public static void a(boolean z11, String str, HashMap<String, String> hashMap, StringPart stringPart, int i11, HttpResponseCallback httpResponseCallback, NetworkHelper.NetworkTimeOut networkTimeOut) throws Throwable {
        CopyOnWriteArraySet<String> copyOnWriteArraySet;
        if (!z11 && (copyOnWriteArraySet = f40478d) != null) {
            Iterator<String> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    f40477c.rawPost(str, hashMap, stringPart, i11, httpResponseCallback, networkTimeOut);
                    return;
                }
            }
        }
        if (h.b().e()) {
            if (!h.b().c()) {
                d();
            }
            if (h.b().c()) {
                HashMap<String, Object> a11 = h.b().a(1004, networkTimeOut.readTimout, a("POST", str, hashMap, stringPart));
                if (a11 != null) {
                    httpResponseCallback.onResponse(com.mob.mcl.a.a(new b(a11)));
                    return;
                } else if (!z11) {
                    f40477c.rawPost(str, hashMap, stringPart, i11, httpResponseCallback, networkTimeOut);
                    return;
                }
            }
        }
        if (z11) {
            httpResponseCallback.onResponse(null);
            return;
        }
        if (!com.mob.mcl.a.a.a().b()) {
            a(5, 0);
        }
        a(str, hashMap, stringPart, i11, httpResponseCallback, networkTimeOut);
    }

    private static String a(String str, String str2, HashMap<String, String> hashMap, StringPart stringPart) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("type", str);
        hashMap2.put("url", str2);
        HashMap hashMap3 = new HashMap();
        if (hashMap != null) {
            hashMap3.putAll(hashMap);
        }
        hashMap2.put("headers", hashMap3);
        if (stringPart != null) {
            hashMap2.put(TtmlNode.TAG_BODY, stringPart.toString());
        }
        return HashonHelper.fromHashMap(hashMap2);
    }

    private static String a(String str, HashMap<String, String> hashMap, NetworkHelper.NetworkTimeOut networkTimeOut) throws Throwable {
        String a11 = com.mob.mcl.a.a.a().a("GET", str, hashMap, null, 0, networkTimeOut);
        if (!TextUtils.isEmpty(a11)) {
            com.mob.mcl.d.b.a().a("mcl apc");
            return a11;
        }
        String httpGetNew = f40477c.httpGetNew(str, null, hashMap, networkTimeOut);
        com.mob.mcl.d.b.a().a("mcl htp");
        return httpGetNew;
    }

    private static void a(String str, HashMap<String, String> hashMap, StringPart stringPart, int i11, HttpResponseCallback httpResponseCallback, NetworkHelper.NetworkTimeOut networkTimeOut) throws Throwable {
        String a11 = com.mob.mcl.a.a.a().a("POST", str, hashMap, stringPart, i11, networkTimeOut);
        if (!TextUtils.isEmpty(a11)) {
            httpResponseCallback.onResponse(com.mob.mcl.a.a(new b(HashonHelper.fromJson(a11), true)));
        } else {
            f40477c.rawPost(str, hashMap, stringPart, i11, httpResponseCallback, networkTimeOut);
        }
    }

    private static String a(HashMap<String, Object> hashMap) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String urlEncode = Data.urlEncode(entry.getKey(), "utf-8");
            String urlEncode2 = entry.getValue() == null ? "" : Data.urlEncode(String.valueOf(entry.getValue()), "utf-8");
            if (sb2.length() > 0) {
                sb2.append(u0.f91708d);
            }
            sb2.append(urlEncode);
            sb2.append('=');
            sb2.append(urlEncode2);
        }
        return sb2.toString();
    }

    public static String a() {
        h.b().h();
        return h.b().f40519j;
    }

    public static void a(OnIdChangeListener onIdChangeListener) {
        h.b().a(onIdChangeListener);
        h.b().h();
    }

    public static boolean a(String str, long j11) {
        h.b().a(str, j11);
        try {
            if (!h.b().d()) {
                return false;
            }
            if (!h.b().c()) {
                e(3000);
            }
            if (h.b().c()) {
                return h.b().i();
            }
            return false;
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
            return false;
        }
    }

    public static void a(MobMCL.ELPMessageListener eLPMessageListener) {
        h.b().a(eLPMessageListener);
    }

    public static void a(int i11, BusinessMessageListener businessMessageListener) {
        h.b().a(i11, businessMessageListener);
    }
}

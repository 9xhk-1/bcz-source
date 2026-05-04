package com.vivo.push;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.igexin.sdk.PushConsts;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.t;
import com.vivo.push.util.w;
import com.vivo.push.util.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f44995a;

    /* renamed from: h, reason: collision with root package name */
    private Context f45002h;

    /* renamed from: j, reason: collision with root package name */
    private com.vivo.push.util.b f45004j;

    /* renamed from: k, reason: collision with root package name */
    private String f45005k;

    /* renamed from: l, reason: collision with root package name */
    private String f45006l;

    /* renamed from: o, reason: collision with root package name */
    private Boolean f45009o;

    /* renamed from: p, reason: collision with root package name */
    private Long f45010p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f45011q;

    /* renamed from: s, reason: collision with root package name */
    private int f45013s;

    /* renamed from: b, reason: collision with root package name */
    private long f44996b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f44997c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f44998d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f44999e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f45000f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f45001g = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f45003i = true;

    /* renamed from: m, reason: collision with root package name */
    private SparseArray<a> f45007m = new SparseArray<>();

    /* renamed from: n, reason: collision with root package name */
    private int f45008n = 0;

    /* renamed from: r, reason: collision with root package name */
    private IPushClientFactory f45012r = new d();

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f45006l = null;
        this.f45004j.b("APP_ALIAS");
    }

    private boolean n() {
        if (this.f45009o == null) {
            this.f45009o = Boolean.valueOf(l() >= 1230 && z.d(this.f45002h));
        }
        return this.f45009o.booleanValue();
    }

    public final boolean d() {
        if (this.f45002h == null) {
            com.vivo.push.util.p.d("PushClientManager", "support:context is null");
            return false;
        }
        Boolean valueOf = Boolean.valueOf(n());
        this.f45009o = valueOf;
        return valueOf.booleanValue();
    }

    public final boolean e() {
        return this.f45011q;
    }

    public final String f() {
        if (!TextUtils.isEmpty(this.f45005k)) {
            return this.f45005k;
        }
        com.vivo.push.util.b bVar = this.f45004j;
        String b11 = bVar != null ? bVar.b("APP_TOKEN", (String) null) : "";
        c(b11);
        return b11;
    }

    public final boolean g() {
        return this.f45003i;
    }

    public final Context h() {
        return this.f45002h;
    }

    public final void i() {
        this.f45004j.a();
    }

    public final String j() {
        return this.f45006l;
    }

    public final int k() {
        return this.f45013s;
    }

    public final long l() {
        Context context = this.f45002h;
        if (context == null) {
            return -1L;
        }
        if (this.f45010p == null) {
            this.f45010p = Long.valueOf(z.a(context));
        }
        return this.f45010p.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        m.a(new k(this, str));
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f44995a == null) {
                    f44995a = new e();
                }
                eVar = f44995a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final void b() throws VivoPushException {
        Context context = this.f45002h;
        if (context != null) {
            z.b(context);
        }
    }

    public final List<String> c() {
        String b11 = this.f45004j.b("APP_TAGS", (String) null);
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(b11)) {
                Iterator<String> keys = new JSONObject(b11).keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            this.f45004j.b("APP_TAGS");
            arrayList.clear();
            com.vivo.push.util.p.d("PushClientManager", "getTags error");
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private IPushActionListener f45016a;

        /* renamed from: b, reason: collision with root package name */
        private com.vivo.push.b.c f45017b;

        /* renamed from: c, reason: collision with root package name */
        private IPushActionListener f45018c;

        /* renamed from: d, reason: collision with root package name */
        private Runnable f45019d;

        /* renamed from: e, reason: collision with root package name */
        private Object[] f45020e;

        public a(com.vivo.push.b.c cVar, IPushActionListener iPushActionListener) {
            this.f45017b = cVar;
            this.f45016a = iPushActionListener;
        }

        public final void a(int i11, Object... objArr) {
            this.f45020e = objArr;
            IPushActionListener iPushActionListener = this.f45018c;
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(i11);
            }
            IPushActionListener iPushActionListener2 = this.f45016a;
            if (iPushActionListener2 != null) {
                iPushActionListener2.onStateChanged(i11);
            }
        }

        public final Object[] b() {
            return this.f45020e;
        }

        public final void a(Runnable runnable) {
            this.f45019d = runnable;
        }

        public final void a() {
            Runnable runnable = this.f45019d;
            if (runnable == null) {
                com.vivo.push.util.p.a("PushClientManager", "task is null");
            } else {
                runnable.run();
            }
        }

        public final void a(IPushActionListener iPushActionListener) {
            this.f45018c = iPushActionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized a d(String str) {
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                a aVar = this.f45007m.get(parseInt);
                this.f45007m.delete(parseInt);
                return aVar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void b(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() <= 0) {
                return;
            }
            String b11 = this.f45004j.b("APP_TAGS", (String) null);
            if (TextUtils.isEmpty(b11)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(b11);
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.remove(it.next());
            }
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                this.f45004j.b("APP_TAGS");
            } else {
                this.f45004j.a("APP_TAGS", jSONObject2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
            this.f45004j.b("APP_TAGS");
        }
    }

    public final synchronized void a(Context context) {
        if (this.f45002h == null) {
            this.f45002h = ContextDelegate.getContext(context);
            this.f45011q = t.c(context, context.getPackageName());
            w.b().a(this.f45002h);
            a(new com.vivo.push.b.g());
            com.vivo.push.util.b bVar = new com.vivo.push.util.b();
            this.f45004j = bVar;
            bVar.a(this.f45002h, "com.vivo.push_preferences.appconfig_v1");
            this.f45005k = f();
            this.f45006l = this.f45004j.b("APP_ALIAS", (String) null);
        }
    }

    public final void c(List<String> list) {
        if (list.contains(this.f45006l)) {
            m();
        }
    }

    private void c(String str) {
        m.c(new f(this, str));
    }

    public final void a(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() <= 0) {
                return;
            }
            String b11 = this.f45004j.b("APP_TAGS", (String) null);
            if (TextUtils.isEmpty(b11)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(b11);
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.put(it.next(), System.currentTimeMillis());
            }
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                this.f45004j.b("APP_TAGS");
            } else {
                this.f45004j.a("APP_TAGS", jSONObject2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
            this.f45004j.b("APP_TAGS");
        }
    }

    public final void b(IPushActionListener iPushActionListener) {
        if (this.f45002h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if ("".equals(this.f45005k)) {
            iPushActionListener.onStateChanged(0);
            return;
        }
        if (!a(this.f44997c)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f44997c = SystemClock.elapsedRealtime();
        String packageName = this.f45002h.getPackageName();
        a aVar = null;
        if (this.f45002h != null) {
            com.vivo.push.b.b bVar = new com.vivo.push.b.b(false, packageName);
            bVar.d();
            bVar.e();
            bVar.g();
            bVar.a(100);
            if (this.f45011q) {
                if (n()) {
                    aVar = new a(bVar, iPushActionListener);
                    String a11 = a(aVar);
                    bVar.b(a11);
                    aVar.a(new j(this, bVar, a11));
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (bVar.a(this.f45002h) == 2) {
                aVar = a(bVar, iPushActionListener);
            } else {
                a(bVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVar == null) {
            return;
        }
        aVar.a(new i(this));
        aVar.a();
    }

    public final void a(String str) {
        this.f45005k = str;
        this.f45004j.a("APP_TOKEN", str);
    }

    public final void a(boolean z11) {
        this.f45003i = z11;
    }

    public final void a(IPushActionListener iPushActionListener) {
        if (this.f45002h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        String f11 = f();
        this.f45005k = f11;
        if (!TextUtils.isEmpty(f11)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!a(this.f44996b)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f44996b = SystemClock.elapsedRealtime();
        String packageName = this.f45002h.getPackageName();
        a aVar = null;
        if (this.f45002h != null) {
            com.vivo.push.b.b bVar = new com.vivo.push.b.b(true, packageName);
            bVar.g();
            bVar.d();
            bVar.e();
            bVar.a(100);
            if (this.f45011q) {
                if (n()) {
                    aVar = a(bVar, iPushActionListener);
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (bVar.a(this.f45002h) == 2) {
                aVar = a(bVar, iPushActionListener);
            } else {
                a(bVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVar == null) {
            return;
        }
        aVar.a(new g(this, aVar));
        aVar.a();
    }

    public final void b(String str, IPushActionListener iPushActionListener) {
        if (this.f45002h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f45006l)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        com.vivo.push.b.a aVar = new com.vivo.push.b.a(false, this.f45002h.getPackageName(), arrayList);
        aVar.a(100);
        if (this.f45011q) {
            if (!n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!a(this.f44999e)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f44999e = SystemClock.elapsedRealtime();
            String a11 = a(new a(aVar, iPushActionListener));
            aVar.b(a11);
            if (TextUtils.isEmpty(this.f45005k)) {
                a(a11, 30001);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                a(a11, 30002);
                return;
            } else if (str.length() > 70) {
                a(a11, PushConsts.ALIAS_REQUEST_FILTER);
                return;
            } else {
                a(aVar);
                e(a11);
                return;
            }
        }
        a(aVar);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    private a a(com.vivo.push.b.b bVar, IPushActionListener iPushActionListener) {
        a aVar = new a(bVar, iPushActionListener);
        String a11 = a(aVar);
        bVar.b(a11);
        aVar.a(new h(this, bVar, a11));
        return aVar;
    }

    public final void a(String str, int i11, Object... objArr) {
        a d11 = d(str);
        if (d11 != null) {
            d11.a(i11, objArr);
        } else {
            com.vivo.push.util.p.d("PushClientManager", "notifyApp token is null");
        }
    }

    public final void a(String str, IPushActionListener iPushActionListener) {
        if (this.f45002h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(this.f45006l) && this.f45006l.equals(str)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        com.vivo.push.b.a aVar = new com.vivo.push.b.a(true, this.f45002h.getPackageName(), arrayList);
        aVar.a(100);
        if (this.f45011q) {
            if (!n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!a(this.f44998d)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f44998d = SystemClock.elapsedRealtime();
            String a11 = a(new a(aVar, iPushActionListener));
            aVar.b(a11);
            if (TextUtils.isEmpty(this.f45005k)) {
                a(a11, 30001);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                a(a11, 30002);
                return;
            } else if (str.length() > 70) {
                a(a11, PushConsts.ALIAS_REQUEST_FILTER);
                return;
            } else {
                a(aVar);
                e(a11);
                return;
            }
        }
        a(aVar);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    public final void b(String str) {
        this.f45006l = str;
        this.f45004j.a("APP_ALIAS", str);
    }

    public final void b(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f45002h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        com.vivo.push.b.z zVar = new com.vivo.push.b.z(false, context.getPackageName(), arrayList);
        zVar.a(500);
        if (this.f45011q) {
            if (!n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!a(this.f45001g)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f45001g = SystemClock.elapsedRealtime();
            String a11 = a(new a(zVar, iPushActionListener));
            zVar.b(a11);
            if (TextUtils.isEmpty(this.f45005k)) {
                a(a11, 20001);
                return;
            }
            if (arrayList.size() < 0) {
                a(a11, 20002);
                return;
            }
            if (arrayList.size() > 500) {
                a(a11, 20004);
                return;
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().length() > 70) {
                    a(a11, 20003);
                    return;
                }
            }
            a(zVar);
            e(a11);
            return;
        }
        a(zVar);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    private static boolean a(long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return j11 == -1 || elapsedRealtime <= j11 || elapsedRealtime >= j11 + 2000;
    }

    public final void a(String str, int i11) {
        a d11 = d(str);
        if (d11 != null) {
            d11.a(i11, new Object[0]);
        } else {
            com.vivo.push.util.p.d("PushClientManager", "notifyStatusChanged token is null");
        }
    }

    private synchronized String a(a aVar) {
        int i11;
        this.f45007m.put(this.f45008n, aVar);
        i11 = this.f45008n;
        this.f45008n = i11 + 1;
        return Integer.toString(i11);
    }

    public final void a(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f45002h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        com.vivo.push.b.z zVar = new com.vivo.push.b.z(true, context.getPackageName(), arrayList);
        zVar.a(500);
        if (this.f45011q) {
            if (!n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!a(this.f45000f)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f45000f = SystemClock.elapsedRealtime();
            String a11 = a(new a(zVar, iPushActionListener));
            zVar.b(a11);
            if (TextUtils.isEmpty(this.f45005k)) {
                a(a11, 20001);
                return;
            }
            if (arrayList.size() < 0) {
                a(a11, 20002);
                return;
            }
            if (arrayList.size() + c().size() > 500) {
                a(a11, 20004);
                return;
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().length() > 70) {
                    a(a11, 20003);
                    return;
                }
            }
            a(zVar);
            e(a11);
            return;
        }
        a(zVar);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    public final void a(Intent intent, PushMessageCallback pushMessageCallback) {
        o createReceiverCommand = this.f45012r.createReceiverCommand(intent);
        Context context = a().f45002h;
        if (createReceiverCommand == null) {
            com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                com.vivo.push.util.p.c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        com.vivo.push.d.z createReceiveTask = this.f45012r.createReceiveTask(createReceiverCommand);
        if (createReceiveTask == null) {
            com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(createReceiverCommand)));
            if (context != null) {
                com.vivo.push.util.p.c(context, "[执行指令失败]指令" + createReceiverCommand + "任务空！");
                return;
            }
            return;
        }
        if (context != null && !(createReceiverCommand instanceof com.vivo.push.b.n)) {
            com.vivo.push.util.p.a(context, "[接收指令]".concat(String.valueOf(createReceiverCommand)));
        }
        createReceiveTask.a(pushMessageCallback);
        m.a((l) createReceiveTask);
    }

    public final void a(o oVar) {
        Context context = a().f45002h;
        if (oVar == null) {
            com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                com.vivo.push.util.p.c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        l createTask = this.f45012r.createTask(oVar);
        if (createTask == null) {
            com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(oVar)));
            if (context != null) {
                com.vivo.push.util.p.c(context, "[执行指令失败]指令" + oVar + "任务空！");
                return;
            }
            return;
        }
        com.vivo.push.util.p.d("PushClientManager", "client--sendCommand, command = ".concat(String.valueOf(oVar)));
        m.a(createTask);
    }
}

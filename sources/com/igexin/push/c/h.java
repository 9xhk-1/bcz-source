package com.igexin.push.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.igexin.push.c.a;
import com.igexin.push.c.b;
import com.igexin.push.c.e.AnonymousClass1;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.d;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: e, reason: collision with root package name */
    private static final String f37481e = b.f37444a + h.class.getName();

    /* renamed from: a, reason: collision with root package name */
    protected long f37482a;

    /* renamed from: i, reason: collision with root package name */
    private Handler f37489i;

    /* renamed from: b, reason: collision with root package name */
    protected final Map<String, e> f37483b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    protected final Map<String, d> f37484c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Object f37486f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f37487g = new Object();

    /* renamed from: d, reason: collision with root package name */
    protected a f37485d = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Comparator<Map.Entry<String, d>> f37488h = new Comparator<Map.Entry<String, d>>() { // from class: com.igexin.push.c.h.1
        private static int a(Map.Entry<String, d> entry, Map.Entry<String, d> entry2) {
            return (int) (entry.getValue().c() - entry2.getValue().c());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Map.Entry<String, d> entry, Map.Entry<String, d> entry2) {
            return (int) (entry.getValue().c() - entry2.getValue().c());
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.c.h.<init>(java.lang.String, java.lang.String):void");
    }

    private static d a(JSONObject jSONObject) throws Exception {
        if (!jSONObject.has("domain")) {
            return null;
        }
        d dVar = new d();
        dVar.a(jSONObject.getString("domain"));
        if (jSONObject.has(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT)) {
            dVar.f37461b = jSONObject.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
        }
        if (jSONObject.has(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP)) {
            dVar.f37460a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        }
        if (jSONObject.has("consumeTime")) {
            dVar.f37462c = jSONObject.getLong("consumeTime");
        }
        if (jSONObject.has("detectSuccessTime")) {
            dVar.f37463d = jSONObject.getLong("detectSuccessTime");
        }
        if (jSONObject.has("isDomain")) {
            dVar.f37464e = jSONObject.getBoolean("isDomain");
        }
        return dVar;
    }

    private static List<String> b() {
        return SDKUrlConfig.getDefaultXfrList();
    }

    private void c(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        if (jSONObject.has("loginFailedlCnt")) {
            try {
                this.f37485d.f37424g = jSONObject.getInt("loginFailedlCnt");
            } catch (JSONException e12) {
                com.igexin.c.a.c.a.a(e12);
            }
        }
        if (jSONObject.has("lastChange2BackupTime")) {
            try {
                this.f37485d.f37425h = jSONObject.getLong("lastChange2BackupTime");
            } catch (JSONException e13) {
                com.igexin.c.a.c.a.a(e13);
            }
        }
        if (jSONObject.has("lastOfflineTime")) {
            try {
                this.f37485d.f37426i = jSONObject.getLong("lastOfflineTime");
            } catch (JSONException e14) {
                com.igexin.c.a.c.a.a(e14);
            }
        }
        if (jSONObject.has("domainType")) {
            try {
                this.f37485d.f37422e = a.EnumC0462a.a(jSONObject.getInt("domainType"));
                if (this.f37485d.f37422e == a.EnumC0462a.BACKUP) {
                    this.f37485d.f37423f.set(true);
                }
            } catch (JSONException e15) {
                com.igexin.c.a.c.a.a(e15);
            }
        }
    }

    private static d d(String str) {
        d dVar = new d();
        String[] a11 = com.igexin.c.a.b.g.a(str);
        dVar.a(str);
        dVar.f37461b = Integer.parseInt(a11[2]);
        return dVar;
    }

    public static void k() {
        com.igexin.push.core.e.f.a().b("null", true);
        com.igexin.push.core.e.f.a().b("null", false);
    }

    private void p() {
        synchronized (this.f37486f) {
            this.f37484c.clear();
        }
    }

    private boolean q() {
        long abs = Math.abs(System.currentTimeMillis() - this.f37482a);
        long j11 = b.f37446c;
        if (abs >= (2 * j11) - 3600) {
            com.igexin.c.a.c.a.a(f37481e + "|current time - last detect time > " + (j11 / 1000) + " s, detect = true", new Object[0]);
            f.f37476a.set(true);
            return true;
        }
        if (!f.f37476a.getAndSet(true)) {
            long abs2 = Math.abs(j11 - abs);
            f.g().a(abs2, TimeUnit.MILLISECONDS);
            com.igexin.c.a.c.a.a(f37481e + "|set next detect time = " + abs2, new Object[0]);
        }
        return false;
    }

    private boolean r() {
        return c() == b.EnumC0463b.f37454b;
    }

    public abstract int c();

    public abstract i d();

    public final void e() {
        long abs = Math.abs(System.currentTimeMillis() - this.f37482a);
        long j11 = b.f37446c;
        if (abs < (2 * j11) - 3600) {
            if (!f.f37476a.getAndSet(true)) {
                long abs2 = Math.abs(j11 - abs);
                f.g().a(abs2, TimeUnit.MILLISECONDS);
                com.igexin.c.a.c.a.a(f37481e + "|set next detect time = " + abs2, new Object[0]);
            }
            com.igexin.c.a.c.a.a(f37481e + "|startDetect detect = false, return !!!", new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String str = f37481e;
        sb2.append(str);
        sb2.append("|current time - last detect time > ");
        sb2.append(j11 / 1000);
        sb2.append(" s, detect = true");
        com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
        f.f37476a.set(true);
        com.igexin.c.a.c.a.a(str + "|startDetect detect = true, start detect !!!", new Object[0]);
        i();
    }

    public final void f() {
        synchronized (this.f37487g) {
            try {
                for (Map.Entry<String, e> entry : this.f37483b.entrySet()) {
                    entry.getValue().a((i) null);
                    entry.getValue().a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        f();
        p();
        List<String> defaultXfrList = SDKUrlConfig.getDefaultXfrList();
        synchronized (this.f37487g) {
            try {
                int size = this.f37483b.size();
                if (defaultXfrList.size() < size) {
                    int size2 = size - defaultXfrList.size();
                    Iterator<Map.Entry<String, e>> it = this.f37483b.entrySet().iterator();
                    for (int i11 = 0; it.hasNext() && i11 < size2; i11++) {
                        it.next().getValue().b();
                        it.remove();
                    }
                }
                ArrayList arrayList = new ArrayList(this.f37483b.values());
                this.f37483b.clear();
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < defaultXfrList.size(); i12++) {
                    d dVar = new d();
                    String[] a11 = com.igexin.c.a.b.g.a(defaultXfrList.get(i12));
                    dVar.a(defaultXfrList.get(i12));
                    dVar.f37461b = Integer.parseInt(a11[2]);
                    if (i12 < size) {
                        e eVar = (e) arrayList.get(i12);
                        eVar.f37472b = dVar;
                        this.f37483b.put(dVar.a(), eVar);
                    } else {
                        b(dVar);
                    }
                    arrayList2.add(dVar);
                }
                this.f37485d.b(arrayList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        f();
        p();
        List<String> defaultXfrList = SDKUrlConfig.getDefaultXfrList();
        synchronized (this.f37487g) {
            try {
                Iterator<Map.Entry<String, e>> it = this.f37483b.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().b();
                }
                this.f37483b.clear();
                ArrayList arrayList = new ArrayList();
                d dVar = new d();
                String[] a11 = com.igexin.c.a.b.g.a(defaultXfrList.get(0));
                dVar.a(defaultXfrList.get(0));
                dVar.f37461b = Integer.parseInt(a11[2]);
                arrayList.add(dVar);
                this.f37485d.b(arrayList);
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        this.f37482a = System.currentTimeMillis();
        synchronized (this.f37487g) {
            try {
                for (Map.Entry<String, e> entry : this.f37483b.entrySet()) {
                    entry.getValue();
                    entry.getValue().a(d());
                    if (entry.getValue().f37472b != null) {
                        entry.getValue().f37472b.b();
                    }
                    e value = entry.getValue();
                    synchronized (i.class) {
                        try {
                            if (value.f37473c != null) {
                                value.f37471a = com.igexin.b.a.a().f37028a.submit(value.new AnonymousClass1());
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void j() {
        this.f37482a = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f37487g) {
            try {
                jSONObject.put("lastDetectTime", this.f37482a);
                jSONObject.put("list", jSONArray);
                Iterator<Map.Entry<String, e>> it = this.f37483b.entrySet().iterator();
                while (it.hasNext()) {
                    JSONObject f11 = it.next().getValue().f37472b.f();
                    if (f11 != null) {
                        jSONArray.put(f11);
                    }
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
        if (jSONObject.length() > 0) {
            if (r()) {
                com.igexin.push.core.e.f.a().b(jSONObject.toString(), true);
                return;
            }
            com.igexin.push.core.e.f.a().b(jSONObject.toString(), false);
        }
    }

    public final synchronized void l() {
        a aVar = this.f37485d;
        a.EnumC0462a enumC0462a = aVar.f37422e;
        com.igexin.c.a.c.a.a(a.f37417a + "|detect success, current type = " + aVar.f37422e, new Object[0]);
        if (aVar.f37422e == a.EnumC0462a.BACKUP) {
            aVar.a(a.EnumC0462a.TRY_NORMAL);
            com.igexin.push.core.d unused = d.a.f37956a;
            com.igexin.push.e.a.a(true);
        }
    }

    public final void m() {
        synchronized (h.class) {
            try {
                if (this.f37489i == null) {
                    HandlerThread handlerThread = new HandlerThread("NetDetect-T");
                    handlerThread.start();
                    this.f37489i = new Handler(handlerThread.getLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f37489i.removeCallbacksAndMessages("detToken");
        this.f37489i.postAtTime(new Runnable() { // from class: com.igexin.push.c.h.2
            @Override // java.lang.Runnable
            public final void run() {
                String unused = h.f37481e;
                try {
                    h.this.j();
                } catch (Throwable th3) {
                    com.igexin.c.a.c.a.a(th3);
                }
            }
        }, "detToken", SystemClock.uptimeMillis() + 5000);
    }

    public final synchronized void n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loginFailedlCnt", this.f37485d.f37424g);
            jSONObject.put("lastChange2BackupTime", this.f37485d.f37425h);
            jSONObject.put("lastOfflineTime", this.f37485d.f37426i);
            jSONObject.put("domainType", this.f37485d.f37422e.f37441d);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        if (jSONObject.length() > 0) {
            if (r()) {
                com.igexin.push.core.e.f.a().a(jSONObject.toString(), true);
                return;
            }
            com.igexin.push.core.e.f.a().a(jSONObject.toString(), false);
        }
    }

    private void b(d dVar) {
        e eVar = new e();
        eVar.f37474d = c() == b.EnumC0463b.f37453a;
        eVar.a(d());
        eVar.f37472b = dVar;
        synchronized (this.f37487g) {
            this.f37483b.put(dVar.a(), eVar);
        }
    }

    public final e a(String str) {
        synchronized (this.f37487g) {
            try {
                for (Map.Entry<String, e> entry : this.f37483b.entrySet()) {
                    if (entry.getKey().equals(str)) {
                        return entry.getValue();
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static List<String> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                arrayList.add(jSONArray.getJSONObject(i11).getString("domain"));
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                return arrayList;
            }
        }
        return arrayList;
    }

    private void b(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            a();
            return;
        }
        JSONArray jSONArray = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            a();
            return;
        }
        if (jSONObject.has("lastDetectTime")) {
            try {
                this.f37482a = jSONObject.getLong("lastDetectTime");
            } catch (JSONException e12) {
                com.igexin.c.a.c.a.a(e12);
            }
        }
        if (Math.abs(System.currentTimeMillis() - this.f37482a) >= b.f37446c) {
            a();
            return;
        }
        if (jSONObject.has("list")) {
            try {
                jSONArray = jSONObject.getJSONArray("list");
            } catch (JSONException e13) {
                com.igexin.c.a.c.a.a(e13);
            }
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            a();
            return;
        }
        List<String> a11 = a(jSONArray);
        if (a11.isEmpty()) {
            a();
            return;
        }
        List<String> defaultXfrList = SDKUrlConfig.getDefaultXfrList();
        ArrayList arrayList = new ArrayList(defaultXfrList);
        arrayList.retainAll(a11);
        if (arrayList.size() == a11.size()) {
            String str2 = f37481e;
            com.igexin.c.a.c.a.a(str2, "db cache xfr == default, use cache");
            com.igexin.c.a.c.a.a(str2 + " | db cache xfr == default, use cache", new Object[0]);
            b(jSONArray);
            return;
        }
        String str3 = f37481e;
        com.igexin.c.a.c.a.a(str3, "db cache xfr != default, use default");
        com.igexin.c.a.c.a.a(str3 + " | db cache xfr != default, use default", new Object[0]);
        arrayList.clear();
        defaultXfrList.clear();
        a11.clear();
        a();
    }

    private void a() {
        this.f37482a = 0L;
        if (r()) {
            if (com.igexin.push.core.e.f38014ap != null) {
                com.igexin.push.core.e.f.a().b("null", true);
            }
        } else if (com.igexin.push.core.e.f38015aq != null) {
            com.igexin.push.core.e.f.a().b("null", false);
        }
        List<String> defaultXfrList = SDKUrlConfig.getDefaultXfrList();
        ArrayList arrayList = new ArrayList();
        for (String str : defaultXfrList) {
            d dVar = new d(str, Integer.parseInt(com.igexin.c.a.b.g.a(str)[2]));
            if (defaultXfrList.size() > 1) {
                b(dVar);
            }
            arrayList.add(dVar);
        }
        this.f37485d.b(arrayList);
        defaultXfrList.clear();
    }

    private void b(JSONArray jSONArray) {
        d dVar;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject.has("domain")) {
                    dVar = new d();
                    dVar.a(jSONObject.getString("domain"));
                    if (jSONObject.has(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT)) {
                        dVar.f37461b = jSONObject.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                    }
                    if (jSONObject.has(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP)) {
                        dVar.f37460a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    }
                    if (jSONObject.has("consumeTime")) {
                        dVar.f37462c = jSONObject.getLong("consumeTime");
                    }
                    if (jSONObject.has("detectSuccessTime")) {
                        dVar.f37463d = jSONObject.getLong("detectSuccessTime");
                    }
                    if (jSONObject.has("isDomain")) {
                        dVar.f37464e = jSONObject.getBoolean("isDomain");
                    }
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    this.f37484c.put(dVar.a(), dVar);
                } else {
                    try {
                        dVar = d(jSONObject.getString("domain"));
                    } catch (Exception e11) {
                        com.igexin.c.a.c.a.a(e11);
                        com.igexin.c.a.c.a.a(f37481e + "|initWithCacheData exception " + e11.toString(), new Object[0]);
                        this.f37484c.clear();
                        a();
                        return;
                    }
                }
                if (dVar != null) {
                    b(dVar);
                    arrayList.add(dVar);
                }
            } catch (Exception e12) {
                com.igexin.c.a.c.a.a(e12);
                com.igexin.c.a.c.a.a(f37481e + "|initWithCacheData exception " + e12.toString(), new Object[0]);
                return;
            }
        }
        this.f37485d.b(arrayList);
    }

    public final void a(d dVar) {
        synchronized (this.f37486f) {
            this.f37484c.put(dVar.a(), dVar);
        }
        a aVar = this.f37485d;
        synchronized (aVar.f37421d) {
            aVar.f37419b = 0;
            Collections.sort(aVar.f37420c, aVar.f37428k);
        }
    }
}

package com.igexin.push.core;

import android.net.wifi.ScanResult;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.igexin.push.core.d;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final String f38353b = "PushMessageExecutor";

    /* renamed from: d, reason: collision with root package name */
    private static Set<String> f38354d;

    /* renamed from: f, reason: collision with root package name */
    private static volatile n f38355f;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, PushMessageInterface> f38357c;

    /* renamed from: a, reason: collision with root package name */
    protected HashMap<String, String> f38356a = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f38358e = new ConcurrentHashMap();

    private n() {
        f38354d = new HashSet();
        this.f38357c = new HashMap();
        f38354d.add(b.f37747s);
        f38354d.add("notification");
        f38354d.add(b.f37743o);
        f38354d.add(b.f37744p);
        f38354d.add(b.f37745q);
        f38354d.add("popup");
        f38354d.add("null");
        f38354d.add(b.f37749u);
        f38354d.add(b.f37750v);
        f38354d.add(b.f37751w);
        f38354d.add(b.f37752x);
        f38354d.add(b.f37753y);
        f38354d.add(b.f37748t);
        f38354d.add(b.f37754z);
    }

    public static n a() {
        if (f38355f == null) {
            synchronized (n.class) {
                try {
                    if (f38355f == null) {
                        f38355f = new n();
                    }
                } finally {
                }
            }
        }
        return f38355f;
    }

    private PushMessageInterface b(String str) {
        if (TextUtils.isEmpty(str) || !f38354d.contains(str)) {
            return null;
        }
        PushMessageInterface pushMessageInterface = this.f38357c.get(str);
        if (pushMessageInterface != null) {
            return pushMessageInterface;
        }
        str.getClass();
        switch (str) {
            case "updatedconfig":
                this.f38357c.put(b.f37748t, new com.igexin.push.core.a.c.n());
                break;
            case "disablelog":
                this.f38357c.put(b.f37753y, new com.igexin.push.core.a.c.c());
                break;
            case "startmyactivity":
                this.f38357c.put(b.f37744p, new com.igexin.push.core.a.c.k());
                break;
            case "terminatetask":
                this.f38357c.put(b.f37743o, new com.igexin.push.core.a.c.m());
                break;
            case "enablelog":
                this.f38357c.put(b.f37752x, new com.igexin.push.core.a.c.d());
                break;
            case "goto":
                this.f38357c.put(b.f37747s, new com.igexin.push.core.a.c.f());
                break;
            case "null":
                this.f38357c.put("null", new com.igexin.push.core.a.c.e());
                break;
            case "popup":
                this.f38357c.put("popup", new com.igexin.push.core.a.c.i());
                break;
            case "notification":
                this.f38357c.put("notification", new com.igexin.push.core.a.c.h());
                break;
            case "cleanext":
                this.f38357c.put(b.f37751w, new com.igexin.push.core.a.c.b());
                break;
            case "gdoption":
                this.f38357c.put(b.f37754z, new com.igexin.push.core.a.c.g());
                break;
            case "startapp":
                this.f38357c.put(b.f37745q, new com.igexin.push.core.a.c.j());
                break;
            case "startweb":
                this.f38357c.put(b.f37749u, new com.igexin.push.core.a.c.l());
                break;
            case "checkapp":
                this.f38357c.put(b.f37750v, new com.igexin.push.core.a.c.a());
                break;
        }
        return this.f38357c.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        if (r3 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.n.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        return com.igexin.push.core.e.f38006ah.isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.n.f():boolean");
    }

    private void g() {
        try {
            List<ScanResult> j11 = com.igexin.push.g.n.j();
            this.f38358e.clear();
            if (j11 == null || j11.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < j11.size(); i11++) {
                this.f38358e.put(j11.get(i11).BSSID, j11.get(i11).SSID);
                String str = j11.get(i11).BSSID;
                String str2 = j11.get(i11).SSID;
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final void c() {
        try {
            if (com.igexin.push.g.c.a(System.currentTimeMillis())) {
                com.igexin.c.a.c.a.b(f38353b, "message in silent time , ignored...");
                return;
            }
            if (e()) {
                return;
            }
            for (Map.Entry<String, PushTaskBean> entry : e.f38006ah.entrySet()) {
                try {
                    entry.getKey();
                    PushTaskBean value = entry.getValue();
                    if (value != null && value.getStatus() == b.f37710ag) {
                        String taskId = value.getTaskId();
                        Map<String, String> conditionMap = value.getConditionMap();
                        if (conditionMap == null) {
                            return;
                        }
                        if (a(conditionMap, taskId, value)) {
                            b(taskId, value.getMessageId());
                        }
                    }
                } catch (Exception e11) {
                    com.igexin.c.a.c.a.a(e11);
                    com.igexin.c.a.c.a.a("PushMessageExecutor|" + e11.toString(), new Object[0]);
                }
            }
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
            com.igexin.c.a.c.a.a("PushMessageExecutor|" + e12.toString(), new Object[0]);
        }
    }

    public final void d() {
        com.igexin.c.a.c.a.a("PushMessageExecutor|--------checkConditionStatus the pushMessageMap from db because log gkt...", new Object[0]);
        try {
            if (com.igexin.push.g.c.a(System.currentTimeMillis())) {
                com.igexin.c.a.c.a.b(f38353b, "message in silent time , ignored...");
                return;
            }
            if (f()) {
                return;
            }
            for (Map.Entry<String, PushTaskBean> entry : e.f38006ah.entrySet()) {
                try {
                    entry.getKey();
                    PushTaskBean value = entry.getValue();
                    if (value != null && value.getStatus() == b.f37710ag) {
                        String taskId = value.getTaskId();
                        Map<String, String> conditionMap = value.getConditionMap();
                        if (conditionMap == null) {
                            return;
                        }
                        if (a(conditionMap, taskId, value)) {
                            b(taskId, value.getMessageId());
                        }
                    }
                } catch (Exception e11) {
                    com.igexin.c.a.c.a.a(e11);
                    com.igexin.c.a.c.a.a("PushMessageExecutor|" + e11.toString(), new Object[0]);
                }
            }
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
            com.igexin.c.a.c.a.a("PushMessageExecutor|" + e12.toString(), new Object[0]);
        }
    }

    public static void b() {
        try {
            if (!TextUtils.isEmpty(com.igexin.push.config.d.C) && !"none".equals(com.igexin.push.config.d.C)) {
                List<String> asList = Arrays.asList(com.igexin.push.config.d.C.split(","));
                if (asList.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, PushTaskBean>> it = e.f38006ah.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, PushTaskBean> next = it.next();
                    String key = next.getKey();
                    PushTaskBean value = next.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        for (String str : asList) {
                            if (!TextUtils.isEmpty(str) && key.startsWith(str)) {
                                arrayList.add(value.getTaskId());
                                it.remove();
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                String[] strArr = new String[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    strArr[i11] = (String) arrayList.get(i11);
                }
                d.a.f37956a.f37950i.a("message", new String[]{"taskid"}, strArr);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    private void c(String str, String str2) {
        if (str2 == null || str == null) {
            return;
        }
        try {
            com.igexin.push.core.a.b.d();
            String a11 = com.igexin.push.core.a.b.a(str, str2);
            PushTaskBean pushTaskBean = e.f38006ah.get(a11);
            if (pushTaskBean == null) {
                return;
            }
            int status = pushTaskBean.getStatus();
            int i11 = b.f37711ah;
            if (status == i11) {
                com.igexin.c.a.c.a.b(f38353b, " has execute ".concat(String.valueOf(a11)));
                return;
            }
            pushTaskBean.setStatus(i11);
            com.igexin.c.a.c.a.b(f38353b, " do processActionExecute ".concat(String.valueOf(a11)));
            if (a(str, str2) == PushMessageInterface.ActionPrepareState.success) {
                com.igexin.push.core.e.c.a();
                com.igexin.push.core.e.c.a(b.f37711ah, str);
                pushTaskBean.setStatus(b.f37711ah);
                if (a(str, str2, "1")) {
                    return;
                }
                com.igexin.push.core.e.c.a();
                com.igexin.push.core.e.c.a(b.f37710ag, str);
            }
            pushTaskBean.setStatus(b.f37710ag);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final PushMessageInterface.ActionPrepareState a(String str, String str2) {
        PushMessageInterface.ActionPrepareState actionPrepareState = PushMessageInterface.ActionPrepareState.success;
        com.igexin.push.core.a.b.d();
        PushTaskBean pushTaskBean = e.f38006ah.get(com.igexin.push.core.a.b.a(str, str2));
        if (pushTaskBean == null) {
            return PushMessageInterface.ActionPrepareState.stop;
        }
        int i11 = 0;
        boolean z11 = false;
        for (BaseActionBean baseActionBean : pushTaskBean.getActionChains()) {
            PushMessageInterface.ActionPrepareState actionPrepareState2 = PushMessageInterface.ActionPrepareState.stop;
            if (baseActionBean == null) {
                return actionPrepareState2;
            }
            if (!z11 && "popup".equals(baseActionBean.getType())) {
                z11 = true;
            }
            PushMessageInterface a11 = a(baseActionBean.getType());
            if (a11 != null) {
                actionPrepareState2 = a11.prepareExecuteAction(pushTaskBean, baseActionBean);
            } else {
                baseActionBean.getType();
            }
            if (actionPrepareState == PushMessageInterface.ActionPrepareState.success) {
                actionPrepareState = actionPrepareState2;
            }
            if (actionPrepareState2 == PushMessageInterface.ActionPrepareState.wait) {
                i11++;
            }
        }
        return (i11 == 0 || z11 || e.a(str, Integer.valueOf(i11))) ? actionPrepareState : PushMessageInterface.ActionPrepareState.success;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.igexin.push.extension.mod.PushMessageInterface a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.n.a(java.lang.String):com.igexin.push.extension.mod.PushMessageInterface");
    }

    private static void b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        Message obtain = Message.obtain();
        obtain.what = b.V;
        obtain.obj = bundle;
        d.a.f37956a.a(obtain);
    }

    private static void b(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
            HashMap hashMap = new HashMap();
            if (jSONObject2.has("wifi")) {
                hashMap.put("wifi", jSONObject2.getString("wifi"));
            }
            if (jSONObject2.has("screenOn")) {
                hashMap.put("screenOn", jSONObject2.getString("screenOn"));
            }
            if (jSONObject2.has("ssid")) {
                hashMap.put("ssid", jSONObject2.getString("ssid"));
                if (jSONObject2.has("bssid")) {
                    hashMap.put("bssid", jSONObject2.getString("bssid"));
                }
            }
            if (jSONObject2.has("duration")) {
                String string = jSONObject2.getString("duration");
                if (string.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    int indexOf = string.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    String substring = string.substring(0, indexOf);
                    String substring2 = string.substring(indexOf + 1, string.length());
                    hashMap.put("startTime", substring);
                    hashMap.put("endTime", substring2);
                }
            }
            if (jSONObject2.has("netConnected")) {
                hashMap.put("netConnected", jSONObject2.getString("netConnected"));
            }
            if (jSONObject2.has(HwPayConstant.KEY_EXPIRETIME)) {
                String string2 = jSONObject2.getString(HwPayConstant.KEY_EXPIRETIME);
                if (!TextUtils.isEmpty(string2) && TextUtils.isDigitsOnly(string2)) {
                    hashMap.put(HwPayConstant.KEY_EXPIRETIME, string2);
                }
            }
            pushTaskBean.setConditionMap(hashMap);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "taskid"
            java.lang.String r2 = r12.getStringExtra(r0)
            java.lang.String r0 = "messageid"
            java.lang.String r3 = r12.getStringExtra(r0)
            java.lang.String r0 = "actionid"
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = "accesstoken"
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r4 = "url"
            java.lang.String r6 = r12.getStringExtra(r4)
            java.lang.String r4 = "intentUri"
            java.lang.String r7 = r12.getStringExtra(r4)
            java.lang.String r4 = "payload"
            java.lang.String r8 = r12.getStringExtra(r4)
            java.lang.String r4 = "title"
            boolean r5 = r12.hasExtra(r4)
            java.lang.String r9 = ""
            if (r5 == 0) goto L39
            java.lang.String r4 = r12.getStringExtra(r4)
            goto L3a
        L39:
            r4 = r9
        L3a:
            java.lang.String r5 = "content"
            boolean r10 = r12.hasExtra(r5)
            if (r10 == 0) goto L46
            java.lang.String r9 = r12.getStringExtra(r5)
        L46:
            r5 = r9
            java.lang.String r9 = "notifID"
            r10 = 0
            int r12 = r12.getIntExtra(r9, r10)
            android.content.Context r9 = com.igexin.push.core.e.f38035l
            java.lang.String r10 = "notification"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            if (r12 == 0) goto L5e
        L5a:
            r9.cancel(r12)
            goto L73
        L5e:
            java.util.Map<java.lang.String, java.lang.Integer> r12 = com.igexin.push.core.e.f38007ai
            boolean r12 = r12.containsKey(r2)
            if (r12 == 0) goto L73
            java.util.Map<java.lang.String, java.lang.Integer> r12 = com.igexin.push.core.e.f38007ai
            java.lang.Object r12 = r12.get(r2)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            goto L5a
        L73:
            java.util.Map<java.lang.String, java.lang.Integer> r12 = com.igexin.push.core.e.f38007ai
            r12.remove(r2)
            java.lang.String r12 = com.igexin.push.core.e.f38012an
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L8a
            com.igexin.push.core.l r1 = com.igexin.push.core.l.a()
            r1.b(r2, r3, r4, r5, r6, r7, r8)
            r11.b(r2, r3, r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.n.a(android.content.Intent):void");
    }

    public final boolean a(String str, String str2, String str3) {
        if (Thread.currentThread().getId() == d.a.f37956a.a()) {
            return b(str, str2, str3);
        }
        Bundle bundle = new Bundle();
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        bundle.putString("actionid", str3);
        Message obtain = Message.obtain();
        obtain.what = b.S;
        obtain.obj = bundle;
        return d.a.f37956a.a(obtain);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r4 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r12, java.lang.String r13, final java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.n.b(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final boolean a(Map<String, String> map, String str, PushTaskBean pushTaskBean) {
        String str2;
        if (!com.igexin.push.g.c.b(str)) {
            if (map != null && map.size() != 0) {
                if ((!map.containsKey(HwPayConstant.KEY_EXPIRETIME) || Long.parseLong(map.get(HwPayConstant.KEY_EXPIRETIME)) >= System.currentTimeMillis()) && (!map.containsKey("endTime") || Long.parseLong(map.get("endTime")) >= System.currentTimeMillis())) {
                    if (map.containsKey("wifi")) {
                        int parseInt = Integer.parseInt(map.get("wifi"));
                        com.igexin.push.g.c.c();
                        if (parseInt != e.f38047x) {
                            return false;
                        }
                    }
                    if (map.containsKey("screenOn")) {
                        int parseInt2 = Integer.parseInt(map.get("screenOn"));
                        com.igexin.push.g.c.d();
                        if (parseInt2 != e.f38048y) {
                            return false;
                        }
                    }
                    if (map.containsKey("ssid")) {
                        str2 = map.get("ssid");
                        try {
                            List<ScanResult> j11 = com.igexin.push.g.n.j();
                            this.f38358e.clear();
                            if (j11 != null && !j11.isEmpty()) {
                                for (int i11 = 0; i11 < j11.size(); i11++) {
                                    this.f38358e.put(j11.get(i11).BSSID, j11.get(i11).SSID);
                                    String str3 = j11.get(i11).BSSID;
                                    String str4 = j11.get(i11).SSID;
                                }
                            }
                        } catch (Throwable th2) {
                            com.igexin.c.a.c.a.a(th2);
                        }
                        if (!this.f38358e.containsValue(str2)) {
                            return false;
                        }
                    } else {
                        str2 = "";
                    }
                    if (map.containsKey("bssid")) {
                        String str5 = map.get("bssid");
                        if (!this.f38358e.containsKey(str5)) {
                            return false;
                        }
                        String str6 = this.f38358e.get(str5);
                        if (str6 != null && !str6.equals(str2)) {
                            return false;
                        }
                    }
                    if (map.containsKey("startTime") && Long.parseLong(map.get("startTime")) > System.currentTimeMillis()) {
                        return false;
                    }
                    if (map.containsKey("netConnected")) {
                        try {
                            if (Integer.parseInt(map.get("netConnected")) != com.igexin.push.g.c.e()) {
                                return false;
                            }
                        } catch (Exception e11) {
                            com.igexin.c.a.c.a.a(e11);
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        com.igexin.push.core.e.c.a();
        com.igexin.push.core.e.c.a(b.f37712ai, str);
        pushTaskBean.setStatus(b.f37711ah);
        return false;
    }

    public final boolean a(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        com.igexin.c.a.c.a.a("PushMessageExecutor------parse pushmessage actionchain json start-------", new Object[0]);
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("action_chains");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string = ((JSONObject) jSONArray.get(i11)).getString("type");
                if (!this.f38356a.containsKey(string) && !f38354d.contains(string)) {
                    com.igexin.c.a.c.a.a("PushMessageExecutor|" + string + " not support~", new Object[0]);
                    return false;
                }
            }
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i12);
                String string2 = jSONObject2.getString("type");
                com.igexin.c.a.c.a.a("PushMessageExecutor|start parse type = ".concat(String.valueOf(string2)), new Object[0]);
                PushMessageInterface a11 = a(string2);
                if (a11 != null) {
                    arrayList.add(a11.parseAction(jSONObject2));
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        pushTaskBean.setActionChains(arrayList);
        com.igexin.c.a.c.a.b(f38353b, "------parse pushmessage actionchain json end-------");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e7, code lost:
    
        if (com.igexin.push.core.d.a.f37956a.f37950i.a("message", r3) != (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0236, code lost:
    
        if (com.igexin.push.core.d.a.f37956a.f37950i.a("message", r3) != (-1)) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc A[Catch: all -> 0x0113, LOOP:0: B:42:0x0175->B:52:0x01bc, LOOP_END, TryCatch #0 {all -> 0x0113, blocks: (B:31:0x00f1, B:33:0x00fa, B:35:0x0116, B:37:0x0153, B:38:0x015b, B:40:0x0161, B:41:0x0164, B:42:0x0175, B:44:0x017b, B:46:0x018f, B:48:0x0195, B:54:0x01a3, B:52:0x01bc, B:55:0x01bf, B:75:0x0239, B:57:0x01c3, B:59:0x01c8, B:60:0x01d1, B:63:0x01db, B:65:0x01e9, B:67:0x01f2, B:69:0x0207, B:70:0x022a), top: B:30:0x00f1, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(org.json.JSONObject r21, byte[] r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.n.a(org.json.JSONObject, byte[], boolean):boolean");
    }
}

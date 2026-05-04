package com.getui.gtc.server;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.base.crypt.SecureCryptTools;
import com.getui.gtc.base.util.ScheduleQueue;
import com.getui.gtc.e.c;
import com.getui.gtc.e.d;
import com.getui.gtc.f.e;
import com.getui.gtc.h.e;
import com.getui.gtc.i.c.a;
import com.heytap.mcssdk.constant.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ServerManager {
    private static final long SERVERS_REFRESH_PERIOD = 86400000;
    private static Map<String, List<String>> availableServerMap;
    private static Map<String, List<String>> configServerMap;
    private static Map<String, String> runningServerMap;
    private static final Map<String, List<String>> buildInServerMap = new ConcurrentHashMap();
    private static final Map<String, List<String>> unavailableServerMap = new ConcurrentHashMap();

    public static synchronized void addBuildInServerMap(Map<String, List<String>> map) {
        synchronized (ServerManager.class) {
            buildInServerMap.putAll(map);
        }
    }

    public static synchronized void confirmServer(String str, String str2) {
        c cVar;
        c cVar2;
        synchronized (ServerManager.class) {
            try {
                List<String> list = unavailableServerMap.get(str);
                if (list != null) {
                    list.remove(str2);
                }
                cVar = c.a.f30027a;
                String str3 = cVar.f30024a.f30036i;
                try {
                    Properties properties = new Properties();
                    if (!TextUtils.isEmpty(str3)) {
                        properties.load(new StringReader(str3));
                    }
                    properties.put(str, str2);
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry entry : properties.entrySet()) {
                        String str4 = (String) entry.getKey();
                        String str5 = (String) entry.getValue();
                        sb2.append(str4);
                        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb2.append(str5);
                        sb2.append("\n");
                    }
                    cVar2 = c.a.f30027a;
                    d dVar = cVar2.f30024a;
                    String sb3 = sb2.toString();
                    try {
                        if (dVar.a(13, Base64.encodeToString(SecureCryptTools.getInstance().encrypt(sb3.getBytes()), 0))) {
                            dVar.f30036i = sb3;
                        }
                    } catch (Throwable th2) {
                        a.c(th2);
                    }
                } catch (Throwable th3) {
                    a.b(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, List<String>> getAvailableServerMap() {
        c cVar;
        Map<String, List<String>> map = availableServerMap;
        if (map != null) {
            return map;
        }
        availableServerMap = new HashMap();
        cVar = c.a.f30027a;
        parseServerProperties(cVar.f30024a.f30035h, availableServerMap);
        return availableServerMap;
    }

    public static synchronized List<String> getBuildInServers(String str) {
        List<String> list;
        synchronized (ServerManager.class) {
            list = buildInServerMap.get(str);
        }
        return list;
    }

    public static synchronized List<String> getConfigServerMap(String str) {
        List<String> list;
        synchronized (ServerManager.class) {
            list = getConfigServerMap().get(str);
        }
        return list;
    }

    private static Map<String, String> getRunningServerMap() {
        c cVar;
        Map<String, String> map = runningServerMap;
        if (map != null) {
            return map;
        }
        runningServerMap = new HashMap();
        try {
            cVar = c.a.f30027a;
            String str = cVar.f30024a.f30036i;
            if (!TextUtils.isEmpty(str)) {
                Properties properties = new Properties();
                properties.load(new StringReader(str));
                for (Map.Entry entry : properties.entrySet()) {
                    runningServerMap.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            a.b(th2);
        }
        return runningServerMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        getRunningServerMap().put(r5, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String getServer(java.lang.String r5) {
        /*
            java.lang.Class<com.getui.gtc.server.ServerManager> r0 = com.getui.gtc.server.ServerManager.class
            monitor-enter(r0)
            java.util.Map r1 = getRunningServerMap()     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            if (r2 == 0) goto L2d
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = com.getui.gtc.server.ServerManager.buildInServerMap     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L2b
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L2b
            if (r4 <= 0) goto L2d
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            java.util.Map r2 = getAvailableServerMap()     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L2b
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L2b
            if (r4 <= 0) goto L55
            boolean r4 = r2.contains(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L46
            goto L55
        L46:
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2b
            java.util.Map r2 = getRunningServerMap()     // Catch: java.lang.Throwable -> L2b
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            return r1
        L55:
            if (r1 == 0) goto L5e
            java.util.Map r2 = getRunningServerMap()     // Catch: java.lang.Throwable -> L2b
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L2b
        L5e:
            monitor-exit(r0)
            return r1
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.server.ServerManager.getServer(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parseServerProperties(String str, Map<String, List<String>> map) {
        if (map == null) {
            return;
        }
        map.clear();
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Properties properties = new Properties();
            properties.load(new StringReader(str));
            for (Map.Entry entry : properties.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                ArrayList arrayList = new ArrayList();
                map.put(str2, arrayList);
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    arrayList2.add(next);
                    ArrayList arrayList3 = new ArrayList();
                    hashMap.put(next, arrayList3);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        String str4 = (String) jSONArray.opt(i11);
                        if (!TextUtils.isEmpty(str4) && !arrayList3.contains(str4)) {
                            arrayList3.add(str4);
                        }
                    }
                }
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.addAll((Collection) hashMap.get((String) it.next()));
                }
            }
        } catch (Throwable th2) {
            a.b(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveAvailableConfigServers() {
        c cVar;
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : availableServerMap.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("1", jSONArray);
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                sb2.append(jSONObject.toString());
            } catch (JSONException e11) {
                a.b(e11);
            }
            sb2.append("\n");
        }
        cVar = c.a.f30027a;
        cVar.f30024a.c(sb2.toString());
    }

    public static synchronized boolean switchServer(String str, String str2) {
        synchronized (ServerManager.class) {
            try {
                Map<String, List<String>> map = unavailableServerMap;
                List<String> list = map.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(str, list);
                }
                if (!list.contains(str2)) {
                    list.add(str2);
                }
                List<String> list2 = getAvailableServerMap().get(str);
                if (list2 != null) {
                    list2.remove(str2);
                    saveAvailableConfigServers();
                }
                if (!TextUtils.equals(str2, getRunningServerMap().get(str))) {
                    return true;
                }
                if (list2 != null && list2.size() > 0) {
                    getRunningServerMap().put(str, list2.get(0));
                    return true;
                }
                List<String> list3 = buildInServerMap.get(str);
                if (list3 != null && list3.size() > 0) {
                    for (String str3 : list3) {
                        if (!list.contains(str3) && !TextUtils.equals(str3, str2)) {
                            getRunningServerMap().put(str, str3);
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } finally {
            }
        }
    }

    public static synchronized void updateConfigServerMap() {
        synchronized (ServerManager.class) {
            ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.server.ServerManager.1
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar;
                    c cVar2;
                    c cVar3;
                    synchronized (ServerManager.class) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            cVar = c.a.f30027a;
                            if (currentTimeMillis - cVar.f30024a.f30037j > 86400000) {
                                cVar3 = c.a.f30027a;
                                d dVar = cVar3.f30024a;
                                if (dVar.a(14, currentTimeMillis)) {
                                    dVar.f30037j = currentTimeMillis;
                                }
                                ServerManager.getAvailableServerMap().clear();
                                ServerManager.getAvailableServerMap().putAll(ServerManager.getConfigServerMap());
                                ServerManager.saveAvailableConfigServers();
                            }
                            Map<String, String> a11 = com.getui.gtc.f.c.a(Constants.MILLS_OF_LAUNCH_INTERVAL, new e() { // from class: com.getui.gtc.server.ServerManager.1.1
                                @Override // com.getui.gtc.f.e
                                public final void a(String str) {
                                }

                                @Override // com.getui.gtc.f.e
                                public final void a(Map<String, String> map, Map<String, String> map2) {
                                    c cVar4;
                                    if (map2 == null || map2.size() <= 0) {
                                        return;
                                    }
                                    final String str = map2.get("sdk.gtc.hosts.url");
                                    if (map != null && map.size() > 0) {
                                        String str2 = map.get("sdk.gtc.hosts.url");
                                        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(str2)) {
                                            return;
                                        }
                                    }
                                    cVar4 = c.a.f30027a;
                                    String str3 = cVar4.f30024a.f30033f;
                                    if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(str3)) {
                                        return;
                                    }
                                    com.getui.gtc.h.e.a(str, map2.get("sdk.gtc.hosts.key"), new e.a() { // from class: com.getui.gtc.server.ServerManager.1.1.1
                                        @Override // com.getui.gtc.h.e.a
                                        public final void a(String str4) {
                                            c cVar5;
                                            c cVar6;
                                            c cVar7;
                                            cVar5 = c.a.f30027a;
                                            cVar5.f30024a.a(str);
                                            cVar6 = c.a.f30027a;
                                            cVar6.f30024a.b(str4);
                                            cVar7 = c.a.f30027a;
                                            cVar7.f30024a.c(str4);
                                            ServerManager.parseServerProperties(str4, ServerManager.getConfigServerMap());
                                            ServerManager.parseServerProperties(str4, ServerManager.getAvailableServerMap());
                                        }
                                    });
                                }
                            });
                            if (a11 != null && a11.size() > 0) {
                                final String str = a11.get("sdk.gtc.hosts.url");
                                cVar2 = c.a.f30027a;
                                String str2 = cVar2.f30024a.f30033f;
                                if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase(str2)) {
                                    com.getui.gtc.h.e.a(str, a11.get("sdk.gtc.hosts.key"), new e.a() { // from class: com.getui.gtc.server.ServerManager.1.2
                                        @Override // com.getui.gtc.h.e.a
                                        public final void a(String str3) {
                                            c cVar4;
                                            c cVar5;
                                            c cVar6;
                                            cVar4 = c.a.f30027a;
                                            cVar4.f30024a.a(str);
                                            cVar5 = c.a.f30027a;
                                            cVar5.f30024a.b(str3);
                                            cVar6 = c.a.f30027a;
                                            cVar6.f30024a.c(str3);
                                            ServerManager.parseServerProperties(str3, ServerManager.getConfigServerMap());
                                            ServerManager.parseServerProperties(str3, ServerManager.getAvailableServerMap());
                                        }
                                    });
                                }
                            }
                        } finally {
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, List<String>> getConfigServerMap() {
        c cVar;
        Map<String, List<String>> map = configServerMap;
        if (map != null) {
            return map;
        }
        configServerMap = new HashMap();
        cVar = c.a.f30027a;
        parseServerProperties(cVar.f30024a.f30034g, configServerMap);
        return configServerMap;
    }

    @Deprecated
    public static void initServerMap(Context context) {
    }
}

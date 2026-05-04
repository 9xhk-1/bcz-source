package com.tencent.bugly.crashreport.crash.h5;

import android.webkit.JavascriptInterface;
import c90.k;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.bb;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class H5JavaScriptInterface {

    /* renamed from: a, reason: collision with root package name */
    private static HashSet<Integer> f42138a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private String f42139b = null;

    /* renamed from: c, reason: collision with root package name */
    private Thread f42140c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f42141d = null;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f42142e = null;

    private H5JavaScriptInterface() {
    }

    private static bb a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                bb bbVar = new bb();
                String string2 = jSONObject.getString("projectRoot");
                bbVar.f42438a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString(k.f8409a);
                bbVar.f42439b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                bbVar.f42440c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString("userAgent");
                bbVar.f42441d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                bbVar.f42442e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString("name");
                bbVar.f42443f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int indexOf = string.indexOf("\n");
                if (indexOf < 0) {
                    al.d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                bbVar.f42445h = string.substring(indexOf + 1);
                String substring = string.substring(0, indexOf);
                bbVar.f42444g = substring;
                int indexOf2 = substring.indexOf(":");
                if (indexOf2 > 0) {
                    bbVar.f42444g = bbVar.f42444g.substring(indexOf2 + 1);
                }
                bbVar.f42446i = jSONObject.getString("file");
                if (bbVar.f42443f == null) {
                    return null;
                }
                long j11 = jSONObject.getLong("lineNumber");
                bbVar.f42447j = j11;
                if (j11 < 0) {
                    return null;
                }
                long j12 = jSONObject.getLong("columnNumber");
                bbVar.f42448k = j12;
                if (j12 < 0) {
                    return null;
                }
                al.a("H5 crash information is following: ", new Object[0]);
                al.a("[projectRoot]: " + bbVar.f42438a, new Object[0]);
                al.a("[context]: " + bbVar.f42439b, new Object[0]);
                al.a("[url]: " + bbVar.f42440c, new Object[0]);
                al.a("[userAgent]: " + bbVar.f42441d, new Object[0]);
                al.a("[language]: " + bbVar.f42442e, new Object[0]);
                al.a("[name]: " + bbVar.f42443f, new Object[0]);
                al.a("[message]: " + bbVar.f42444g, new Object[0]);
                al.a("[stacktrace]: \n" + bbVar.f42445h, new Object[0]);
                al.a("[file]: " + bbVar.f42446i, new Object[0]);
                al.a("[lineNumber]: " + bbVar.f42447j, new Object[0]);
                al.a("[columnNumber]: " + bbVar.f42448k, new Object[0]);
                return bbVar;
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.a aVar) {
        String str = null;
        if (aVar == null || f42138a.contains(Integer.valueOf(aVar.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f42138a.add(Integer.valueOf(aVar.hashCode()));
        Thread currentThread = Thread.currentThread();
        h5JavaScriptInterface.f42140c = currentThread;
        if (currentThread != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n");
            for (int i11 = 2; i11 < currentThread.getStackTrace().length; i11++) {
                StackTraceElement stackTraceElement = currentThread.getStackTrace()[i11];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append("\n");
                }
            }
            str = sb2.toString();
        }
        h5JavaScriptInterface.f42141d = str;
        HashMap hashMap = new HashMap();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) aVar.c());
        hashMap.put("[WebView] ContentDescription", sb3.toString());
        h5JavaScriptInterface.f42142e = hashMap;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        al.d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            al.d("Payload from JS is null.", new Object[0]);
            return;
        }
        String c11 = ap.c(str.getBytes());
        String str2 = this.f42139b;
        if (str2 != null && str2.equals(c11)) {
            al.d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f42139b = c11;
        al.d("Handling JS exception ...", new Object[0]);
        bb a11 = a(str);
        if (a11 == null) {
            al.d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = a11.f42438a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = a11.f42439b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = a11.f42440c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = a11.f42441d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = a11.f42446i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j11 = a11.f42447j;
        if (j11 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j11));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f42142e);
        linkedHashMap.put("Java Stack", this.f42141d);
        InnerApi.postH5CrashAsync(this.f42140c, a11.f42443f, a11.f42444g, a11.f42445h, linkedHashMap);
    }
}

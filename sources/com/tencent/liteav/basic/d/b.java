package com.tencent.liteav.basic.d;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f43243a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f43244b = null;

    private void b() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f43243a.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(" : ");
            sb2.append(entry.getValue());
            sb2.append("\n");
        }
        TXCLog.i("CompatibleConfig", sb2.toString());
    }

    public synchronized void a(JSONArray jSONArray) {
        this.f43243a.clear();
        JSONObject b11 = b(jSONArray);
        this.f43244b = b11;
        if (b11 == null) {
            TXCLog.i("CompatibleConfig", "can't find best match value");
        } else {
            a(this.f43243a, "", b11);
            b();
        }
    }

    private JSONObject b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = null;
        int i11 = 0;
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                int a11 = a(jSONObject2.optJSONObject("deviceinfo"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("deviceconfig");
                if (a11 > i11 && optJSONObject != null) {
                    jSONObject = optJSONObject;
                    i11 = a11;
                }
            } catch (JSONException e11) {
                TXCLog.e("CompatibleConfig", "Find best match value failed.", e11);
            }
        }
        TXCLog.i("CompatibleConfig", "bestMatchLevel: %d", Integer.valueOf(i11));
        if (i11 > 0) {
            return jSONObject;
        }
        return null;
    }

    public synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f43243a.clear();
            JSONObject jSONObject = new JSONObject(str);
            this.f43244b = jSONObject;
            a(this.f43243a, "", jSONObject);
            b();
        } catch (JSONException e11) {
            TXCLog.e("CompatibleConfig", "parse best match value failed.", e11);
        }
    }

    public synchronized JSONObject a() {
        return this.f43244b;
    }

    private int a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(e.f43439c, jSONObject.optString("MANUFACTURER")));
        arrayList.add(new Pair(e.f43437a, jSONObject.optString("MODEL")));
        arrayList.add(new Pair(String.valueOf(Build.VERSION.SDK_INT), jSONObject.optString("VERSION")));
        arrayList.add(new Pair(Build.VERSION.INCREMENTAL, jSONObject.optString("VERSION_INCREMENTAL")));
        arrayList.add(new Pair(Build.DISPLAY, jSONObject.optString("DISPLAY")));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Pair pair = (Pair) arrayList.get(i11);
            if (TextUtils.isEmpty((CharSequence) pair.second)) {
                return i11;
            }
            if (!((String) pair.first).equalsIgnoreCase((String) pair.second)) {
                return 0;
            }
        }
        return arrayList.size();
    }

    private void a(Map<String, String> map, String str, JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                a(map, str + "." + next, (JSONObject) opt);
            } else if (opt != null) {
                map.put(str + "." + next, opt.toString());
            }
        }
    }
}

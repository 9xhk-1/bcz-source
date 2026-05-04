package com.igexin.push.core.b;

import android.text.TextUtils;
import com.igexin.push.extension.mod.BaseActionBean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class q extends BaseActionBean {

    /* renamed from: a, reason: collision with root package name */
    private long f37901a;

    private long a() {
        return this.f37901a;
    }

    private static q a(String str) throws JSONException {
        long j11;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        q qVar = new q();
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("actionid")) {
            qVar.setActionId(jSONObject.getString("actionid"));
        }
        if (jSONObject.has("type")) {
            qVar.setType(jSONObject.getString("type"));
        }
        if (jSONObject.has("do")) {
            qVar.setDoActionId(jSONObject.getString("do"));
        }
        if (jSONObject.has("delay")) {
            double d11 = jSONObject.getDouble("delay");
            if (d11 > 0.0d) {
                j11 = (long) (d11 * 1000.0d);
                qVar.f37901a = j11;
                return qVar;
            }
        }
        j11 = 200;
        qVar.f37901a = j11;
        return qVar;
    }

    private void a(long j11) {
        this.f37901a = j11;
    }
}

package com.mob.secverify.pure.core.ope.wo.listener;

import android.text.TextUtils;
import com.mob.secverify.pure.core.ope.wo.core.WoExecutor;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private WoExecutor.Callback f41091a;

    public a(WoExecutor.Callback callback) {
        this.f41091a = callback;
    }

    public void a(String str, String str2) {
        try {
            if (this.f41091a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", 0);
                jSONObject.put("resultMsg", str);
                if (TextUtils.isEmpty(str2)) {
                    jSONObject.put("resultData", "");
                } else {
                    jSONObject.put("resultData", new JSONObject(str2));
                }
                jSONObject.put("operatorType", "CU");
                this.f41091a.onResult(jSONObject.toString());
                this.f41091a = null;
            }
        } catch (Exception unused) {
        }
    }

    public void a(int i11, String str, String str2) {
        try {
            if (this.f41091a == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i11);
            jSONObject.put("resultMsg", str);
            jSONObject.put("resultData", "");
            jSONObject.put("traceId", str2);
            jSONObject.put("operatorType", "CU");
            this.f41091a.onResult(jSONObject.toString());
            this.f41091a = null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void a(int i11, String str) {
        a(i11, str, "");
    }
}

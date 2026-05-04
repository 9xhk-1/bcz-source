package com.mob.secverify.pure.core.ope.wo;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.secverify.a.e;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.pure.b.c;
import com.mob.secverify.pure.core.ope.wo.listener.ResultListener;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends com.mob.secverify.pure.core.ope.a {

    /* renamed from: g, reason: collision with root package name */
    private final int f41048g;

    public a(String str, String str2, String str3, com.mob.secverify.b.b bVar) {
        super(str, str2, str3);
        this.f41048g = 8000;
        b.a().a(MobSDK.getContext(), str, str2);
    }

    private void c(final InternalCallback<PreVerifyResult> internalCallback) {
        if (a(internalCallback, false)) {
            return;
        }
        b.a().a(8000, new ResultListener() { // from class: com.mob.secverify.pure.core.ope.wo.a.1
            @Override // com.mob.secverify.pure.core.ope.wo.listener.ResultListener
            public void onResult(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("resultCode");
                    String optString2 = jSONObject.optString("resultMsg");
                    String optString3 = jSONObject.optString("resultData");
                    if (!"0".equals(optString)) {
                        internalCallback.onFailure(new VerifyException(Integer.parseInt(optString), optString2));
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(optString3);
                    String optString4 = jSONObject2.optString("accessCode");
                    long optLong = jSONObject2.optLong("expires");
                    String optString5 = jSONObject2.optString("mobile");
                    c.a().a(new e(optString4, optLong, optString5));
                    PreVerifyResult preVerifyResult = new PreVerifyResult(optString5, "CUCC");
                    c.a().a(preVerifyResult);
                    internalCallback.onSuccess(preVerifyResult);
                } catch (JSONException e11) {
                    internalCallback.onFailure(new VerifyException(e11));
                }
            }
        });
    }

    private void d(final InternalCallback<VerifyResult> internalCallback) {
        if (a(internalCallback, true)) {
            return;
        }
        b.a().a(8000, new ResultListener() { // from class: com.mob.secverify.pure.core.ope.wo.a.2
            @Override // com.mob.secverify.pure.core.ope.wo.listener.ResultListener
            public void onResult(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("resultCode");
                    String optString2 = jSONObject.optString("resultMsg");
                    String optString3 = jSONObject.optString("resultData");
                    if (!"0".equals(optString)) {
                        internalCallback.onFailure(new VerifyException(Integer.parseInt(optString), optString2));
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(optString3);
                    String optString4 = jSONObject2.optString("accessCode");
                    jSONObject2.optLong("expires");
                    internalCallback.onSuccess(new VerifyResult(jSONObject2.optString("mobile"), optString4, "CUCC"));
                } catch (JSONException e11) {
                    com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "WoImpl verify error: " + e11.getMessage());
                    internalCallback.onFailure(new VerifyException(e11));
                }
            }
        });
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void a(InternalCallback<PreVerifyResult> internalCallback) {
        c(internalCallback);
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void b(InternalCallback<VerifyResult> internalCallback) {
        d(internalCallback);
    }

    private boolean a(InternalCallback internalCallback, boolean z11) {
        com.mob.secverify.a.a c11 = c.a().c();
        if (c11 == null || c11.d() - 30000 <= System.currentTimeMillis()) {
            return false;
        }
        String c12 = c11.c();
        if (TextUtils.isEmpty(c12)) {
            return false;
        }
        if (z11) {
            internalCallback.onSuccess(new VerifyResult(c11.e(), c12, "CUCC"));
            return true;
        }
        internalCallback.onSuccess(new PreVerifyResult(c11.e(), "CUCC"));
        return true;
    }
}

package com.mob.secverify.pure.core.ope.a;

import android.text.TextUtils;
import android.widget.TextView;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.sdk.CtAuth;
import cn.com.chinatelecom.account.sdk.ResultListener;
import com.mob.secverify.a.c;
import com.mob.secverify.b.b;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.common.exception.VerifyErr;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.pure.core.ope.a.a.g;
import com.mob.secverify.pure.core.ope.a.a.h;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends com.mob.secverify.pure.core.ope.a {

    /* renamed from: g, reason: collision with root package name */
    private String f40836g;

    public a(String str, String str2, String str3, b bVar) {
        super(str, str2, str3);
        CtAuth.getInstance().init(this.f40835f, this.f40833d, this.f40834e, true);
    }

    private void c(final InternalCallback<VerifyResult> internalCallback) {
        a(new InternalCallback<PreVerifyResult>() { // from class: com.mob.secverify.pure.core.ope.a.a.3
            @Override // com.mob.secverify.common.callback.InternalCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(PreVerifyResult preVerifyResult) {
                String a11 = g.a();
                c cVar = new c(a11);
                a.this.f40836g = cVar.e();
                cn.com.chinatelecom.account.sdk.a.a.a().a(((com.mob.secverify.pure.core.ope.a) a.this).f40835f, a11, (TextView) null);
            }

            @Override // com.mob.secverify.common.callback.InternalCallback
            public void onFailure(VerifyException verifyException) {
                internalCallback.onFailure(verifyException);
            }
        });
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void b(final InternalCallback<VerifyResult> internalCallback) {
        cn.com.chinatelecom.account.sdk.a.a.a().a(this.f40835f, false, h.a());
        cn.com.chinatelecom.account.sdk.a.a.a().a(new ResultListener() { // from class: com.mob.secverify.pure.core.ope.a.a.2
            @Override // cn.com.chinatelecom.account.sdk.ResultListener
            public void onResult(String str) {
                try {
                    JSONObject jSONObject = (JSONObject) new JSONObject(String.valueOf(str)).opt("data");
                    internalCallback.onSuccess(new VerifyResult(a.this.f40836g, jSONObject.getString("accessCode") + ":" + jSONObject.getString("authCode"), "CTCC"));
                    g.a((String) null);
                } catch (JSONException e11) {
                    internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_TOKEN_ERR, e11));
                }
            }
        });
        String a11 = g.a();
        if (TextUtils.isEmpty(a11)) {
            c(internalCallback);
            return;
        }
        c cVar = new c(a11);
        if (System.currentTimeMillis() > cVar.d()) {
            g.a((String) null);
            c(internalCallback);
        } else {
            this.f40836g = cVar.e();
            cn.com.chinatelecom.account.sdk.a.a.a().a(this.f40835f, a11, (TextView) null);
        }
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void a(final InternalCallback<PreVerifyResult> internalCallback) {
        String a11 = g.a();
        if (!TextUtils.isEmpty(a11)) {
            c cVar = new c(a11);
            if (System.currentTimeMillis() - g.b() > cVar.d() - 30000) {
                g.a((String) null);
            } else {
                internalCallback.onSuccess(new PreVerifyResult(cVar.e(), "CTCC"));
                return;
            }
        }
        cn.com.chinatelecom.account.api.a.a().a((CtSetting) null, new cn.com.chinatelecom.account.api.c() { // from class: com.mob.secverify.pure.core.ope.a.a.1
            @Override // cn.com.chinatelecom.account.api.c
            public void a(String str) {
                c cVar2 = new c(str);
                if (!cVar2.a()) {
                    com.mob.secverify.pure.b.c.a().a((com.mob.secverify.a.a) null);
                    internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_CODE_ERR, new Throwable(cVar2.b())));
                    return;
                }
                PreVerifyResult preVerifyResult = new PreVerifyResult(cVar2.e(), "CTCC");
                g.a(str);
                g.a(System.currentTimeMillis());
                com.mob.secverify.pure.b.c.a().a(cVar2);
                internalCallback.onSuccess(preVerifyResult);
            }
        });
    }
}

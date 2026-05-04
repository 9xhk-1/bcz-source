package com.igexin.assist.action;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.igexin.assist.MessageBean;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.core.b;
import com.igexin.push.g.d;
import com.igexin.push.g.n;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    byte[] f37010a;

    /* renamed from: b, reason: collision with root package name */
    String f37011b;

    /* renamed from: c, reason: collision with root package name */
    String f37012c;

    /* renamed from: d, reason: collision with root package name */
    String f37013d;

    /* renamed from: e, reason: collision with root package name */
    String f37014e;

    /* renamed from: f, reason: collision with root package name */
    String f37015f;

    /* renamed from: g, reason: collision with root package name */
    private String f37016g;

    private String b() {
        return this.f37011b;
    }

    private String c() {
        return this.f37012c;
    }

    private String d() {
        return this.f37013d;
    }

    private String e() {
        return this.f37014e;
    }

    private String f() {
        return this.f37016g;
    }

    private String g() {
        return this.f37015f;
    }

    public final void a(MessageBean messageBean) {
        try {
            Context context = messageBean.getContext();
            String stringMessage = messageBean.getStringMessage();
            if (!TextUtils.isEmpty(stringMessage) && context != null) {
                ApplicationInfo b11 = n.b(context);
                String a11 = d.a(b11);
                this.f37013d = a11;
                if (TextUtils.isEmpty(a11)) {
                    this.f37013d = b11.metaData.getString(b.f37730b);
                }
                if (TextUtils.isEmpty(this.f37013d)) {
                    this.f37013d = b11.metaData.getString("GETUI_APPID");
                }
                if (TextUtils.isEmpty(this.f37013d)) {
                    return;
                }
                this.f37016g = context.getPackageName();
                this.f37012c = (TextUtils.isEmpty(messageBean.getMessageSource()) ? "" : messageBean.getMessageSource()) + UUID.randomUUID().toString();
                String a12 = com.igexin.assist.util.a.a(stringMessage, this.f37013d);
                if (TextUtils.isEmpty(a12)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(a12);
                if (jSONObject.has(AssistPushConsts.MSG_KEY_TASKID)) {
                    this.f37011b = jSONObject.getString(AssistPushConsts.MSG_KEY_TASKID);
                }
                if (jSONObject.has(AssistPushConsts.MSG_KEY_ACTION)) {
                    this.f37014e = jSONObject.getString(AssistPushConsts.MSG_KEY_ACTION);
                }
                if (jSONObject.has(AssistPushConsts.MSG_KEY_CONTENT) && !TextUtils.isEmpty(jSONObject.getString(AssistPushConsts.MSG_KEY_CONTENT))) {
                    this.f37010a = jSONObject.getString(AssistPushConsts.MSG_KEY_CONTENT).getBytes();
                }
                if (jSONObject.has(AssistPushConsts.MSG_KEY_ACTION_CHAINS)) {
                    String string = jSONObject.getString(AssistPushConsts.MSG_KEY_ACTION_CHAINS);
                    this.f37015f = string;
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(this.f37015f);
                    jSONObject2.put("extra_actionid", b.f37737i);
                    this.f37015f = jSONObject2.toString();
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final boolean a(boolean z11) {
        return (this.f37010a != null || (this.f37015f != null && z11)) && !d.a(this.f37011b, this.f37016g, this.f37013d, this.f37014e, this.f37012c);
    }

    private byte[] a() {
        return this.f37010a;
    }
}

package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class ed implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45471a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ ec f340a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f45472b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f45473c;

    public ed(ec ecVar, String str, Context context, String str2, String str3) {
        this.f340a = ecVar;
        this.f341a = str;
        this.f45471a = context;
        this.f45472b = str2;
        this.f45473c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        String str;
        String str2;
        Context context2;
        String str3;
        StringBuilder sb2;
        String str4;
        ec ecVar;
        ec ecVar2;
        ee eeVar;
        if (TextUtils.isEmpty(this.f341a)) {
            context = this.f45471a;
            str = "null";
            str2 = "A receive a incorrect message with empty info";
        } else {
            try {
                dy.a(this.f45471a, this.f341a, 1001, "get message");
                JSONObject jSONObject = new JSONObject(this.f341a);
                String optString = jSONObject.optString("action");
                String optString2 = jSONObject.optString("awakened_app_packagename");
                String optString3 = jSONObject.optString("awake_app_packagename");
                String optString4 = jSONObject.optString("awake_app");
                String optString5 = jSONObject.optString("awake_type");
                int optInt = jSONObject.optInt("awake_foreground", 0);
                if (this.f45472b.equals(optString3) && this.f45473c.equals(optString4)) {
                    if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                        context2 = this.f45471a;
                        str3 = this.f341a;
                        str4 = "A receive a incorrect message with empty type";
                        dy.a(context2, str3, 1008, str4);
                        return;
                    }
                    this.f340a.b(optString3);
                    this.f340a.a(optString4);
                    eb ebVar = new eb();
                    ebVar.b(optString);
                    ebVar.a(optString2);
                    ebVar.a(optInt);
                    ebVar.d(this.f341a);
                    if ("service".equals(optString5)) {
                        if (TextUtils.isEmpty(optString)) {
                            ebVar.c("com.xiaomi.mipush.sdk.PushMessageHandler");
                            ecVar2 = this.f340a;
                            eeVar = ee.SERVICE_COMPONENT;
                        } else {
                            ecVar2 = this.f340a;
                            eeVar = ee.SERVICE_ACTION;
                        }
                        ecVar2.a(eeVar, this.f45471a, ebVar);
                        return;
                    }
                    ee eeVar2 = ee.ACTIVITY;
                    if (eeVar2.f343a.equals(optString5)) {
                        ecVar = this.f340a;
                    } else {
                        eeVar2 = ee.PROVIDER;
                        if (!eeVar2.f343a.equals(optString5)) {
                            context2 = this.f45471a;
                            str3 = this.f341a;
                            sb2 = new StringBuilder();
                            sb2.append("A receive a incorrect message with unknown type ");
                            sb2.append(optString5);
                            str4 = sb2.toString();
                            dy.a(context2, str3, 1008, str4);
                            return;
                        }
                        ecVar = this.f340a;
                    }
                    ecVar.a(eeVar2, this.f45471a, ebVar);
                    return;
                }
                context2 = this.f45471a;
                str3 = this.f341a;
                sb2 = new StringBuilder();
                sb2.append("A receive a incorrect message with incorrect package info");
                sb2.append(optString3);
                str4 = sb2.toString();
                dy.a(context2, str3, 1008, str4);
                return;
            } catch (JSONException e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
                context = this.f45471a;
                str = this.f341a;
                str2 = "A meet a exception when receive the message";
            }
        }
        dy.a(context, str, 1008, str2);
    }
}

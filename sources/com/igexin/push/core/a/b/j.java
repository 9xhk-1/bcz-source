package com.igexin.push.core.a.b;

import android.content.Intent;
import android.os.Bundle;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.message.FeedbackCmdMessage;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class j extends a {
    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("sendmessage_feedback")) {
                return true;
            }
            String string = jSONObject.getString("appid");
            String string2 = jSONObject.getString("taskid");
            String string3 = jSONObject.getString("actionid");
            String string4 = jSONObject.getString("result");
            long j11 = jSONObject.getLong(com.alipay.sdk.m.t.a.f11034k);
            com.igexin.c.a.c.a.a("SendMessageFeedbackAction|appid:" + string + "|taskid:" + string2 + "|actionid:" + string3, new Object[0]);
            com.igexin.push.core.l a11 = com.igexin.push.core.l.a();
            String str2 = com.igexin.push.core.e.f37998a;
            if (str2 == null || !str2.equals(string)) {
                str = com.alipay.sdk.m.t.a.f11034k;
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("action", 10010);
                str = com.alipay.sdk.m.t.a.f11034k;
                bundle.putSerializable(PushConsts.KEY_CMD_MSG, new FeedbackCmdMessage(string2, string3, string4, j11, PushConsts.THIRDPART_FEEDBACK));
                a11.a(bundle);
            }
            Intent d11 = com.igexin.push.core.l.d();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("action", PushConsts.THIRDPART_FEEDBACK);
            bundle2.putString("appid", string);
            bundle2.putString("taskid", string2);
            bundle2.putString("actionid", string3);
            bundle2.putString("result", string4);
            bundle2.putLong(str, j11);
            d11.putExtras(bundle2);
            com.igexin.push.core.e.f38035l.sendBroadcast(d11, com.igexin.push.core.e.f38001ac);
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return true;
        }
    }
}

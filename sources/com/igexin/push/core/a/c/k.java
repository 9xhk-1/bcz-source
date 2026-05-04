package com.igexin.push.core.a.c;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.push.core.b.r;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import da0.v1;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class k implements PushMessageInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37700a = com.igexin.push.config.c.f37542a;

    public static void a(String str, Context context) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent a11 = com.igexin.push.g.d.a(str);
            a11.setPackage(context.getPackageName());
            a11.addFlags(268435456);
            context.startActivity(a11);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final boolean executeAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        String id2;
        String messageId;
        String str;
        r rVar = (r) baseActionBean;
        try {
            Intent a11 = com.igexin.push.g.d.a(rVar.f37903b);
            a11.setPackage(com.igexin.push.core.e.f38035l.getPackageName());
            a11.addFlags(268435456);
            if (com.igexin.push.g.c.b(a11, com.igexin.push.core.e.f38035l)) {
                com.igexin.push.core.e.f38035l.startActivity(a11);
                com.igexin.push.core.a.b.d();
                id2 = pushTaskBean.getTaskId();
                messageId = pushTaskBean.getMessageId();
                str = rVar.getDoActionId();
            } else {
                String str2 = f37700a;
                com.igexin.c.a.c.a.a(str2, "execute failed, activity not exist");
                com.igexin.c.a.c.a.a(str2 + "|execute failed, activity not exist", new Object[0]);
                com.igexin.push.core.a.b.d();
                id2 = pushTaskBean.getId();
                messageId = pushTaskBean.getMessageId();
                str = rVar.f37902a;
            }
            com.igexin.push.core.a.b.a(id2, messageId, str);
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.a(pushTaskBean.getId(), pushTaskBean.getMessageId(), rVar.f37902a);
            return true;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final BaseActionBean parseAction(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("do") || !jSONObject.has("actionid") || !jSONObject.has("type") || !jSONObject.has(v1.a.f47590a) || !jSONObject.has("do_failed")) {
                return null;
            }
            String optString = jSONObject.optString(v1.a.f47590a);
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            r rVar = new r();
            rVar.setType(com.igexin.push.core.b.f37744p);
            rVar.setActionId(jSONObject.getString("actionid"));
            rVar.setDoActionId(jSONObject.getString("do"));
            rVar.f37903b = optString;
            rVar.f37902a = jSONObject.optString("do_failed");
            return rVar;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final PushMessageInterface.ActionPrepareState prepareExecuteAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        r rVar = (r) baseActionBean;
        try {
            Intent a11 = com.igexin.push.g.d.a(rVar.f37903b);
            a11.setPackage(com.igexin.push.core.e.f38035l.getPackageName());
            a11.addFlags(268435456);
            if (com.igexin.push.g.c.b(a11, com.igexin.push.core.e.f38035l)) {
                return PushMessageInterface.ActionPrepareState.success;
            }
            String str = f37700a;
            com.igexin.c.a.c.a.a(str, "execute failed, activity not exist");
            com.igexin.c.a.c.a.a(str + "|execute failed, activity not exist", new Object[0]);
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.a(pushTaskBean.getId(), pushTaskBean.getMessageId(), rVar.f37902a);
            return PushMessageInterface.ActionPrepareState.stop;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.a(pushTaskBean.getId(), pushTaskBean.getMessageId(), rVar.f37902a);
            return PushMessageInterface.ActionPrepareState.stop;
        }
    }
}

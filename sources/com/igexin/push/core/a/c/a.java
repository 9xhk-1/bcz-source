package com.igexin.push.core.a.c;

import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class a implements PushMessageInterface {
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final boolean executeAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        String str;
        com.igexin.push.core.b.e eVar = (com.igexin.push.core.b.e) baseActionBean;
        String taskId = pushTaskBean.getTaskId();
        String messageId = pushTaskBean.getMessageId();
        if (com.igexin.push.g.c.d(eVar.f37785a)) {
            String str2 = eVar.f37786b;
            if (str2 == null || str2.equals("")) {
                return true;
            }
            com.igexin.push.core.a.b.d();
            str = eVar.f37786b;
        } else {
            String str3 = eVar.f37787c;
            if (str3 == null || str3.equals("")) {
                return true;
            }
            com.igexin.push.core.a.b.d();
            str = eVar.f37787c;
        }
        com.igexin.push.core.a.b.a(taskId, messageId, str);
        return true;
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final BaseActionBean parseAction(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("type") || !jSONObject.has("actionid")) {
                return null;
            }
            com.igexin.push.core.b.e eVar = new com.igexin.push.core.b.e();
            eVar.setType(com.igexin.push.core.b.f37750v);
            eVar.setActionId(jSONObject.getString("actionid"));
            if (!jSONObject.has("appstartupid")) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("appstartupid");
            if (!jSONObject2.has("android")) {
                return null;
            }
            eVar.f37785a = jSONObject2.getString("android");
            if (!jSONObject.has("do_installed") && !jSONObject.has("do_uninstalled")) {
                return null;
            }
            if (jSONObject.has("do_installed")) {
                eVar.f37786b = jSONObject.getString("do_installed");
            }
            if (jSONObject.has("do_uninstalled")) {
                eVar.f37787c = jSONObject.getString("do_uninstalled");
            }
            return eVar;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final PushMessageInterface.ActionPrepareState prepareExecuteAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        return PushMessageInterface.ActionPrepareState.success;
    }
}

package com.igexin.push.core.a.c;

import android.content.Intent;
import android.text.TextUtils;
import com.igexin.push.core.b.v;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import da0.k1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class n implements PushMessageInterface {
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final boolean executeAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        String str = ((v) baseActionBean).f37922a;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\|");
            Intent intent = new Intent();
            intent.setPackage(com.igexin.push.core.e.f38030g);
            for (String str2 : split) {
                if (com.igexin.push.core.b.f37738j.equals(str2)) {
                    com.igexin.push.core.d.b.d().b();
                } else {
                    intent.setAction("com.igexin.sdk.action.updatedconfig." + str2);
                    com.igexin.push.core.e.f38035l.sendBroadcast(intent, com.igexin.push.core.e.f38001ac);
                }
            }
        }
        if (baseActionBean.getDoActionId().equals("")) {
            return true;
        }
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseActionBean.getDoActionId());
        return true;
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final BaseActionBean parseAction(JSONObject jSONObject) {
        try {
            v vVar = new v();
            vVar.setType(com.igexin.push.core.b.f37748t);
            vVar.setActionId(jSONObject.getString("actionid"));
            vVar.setDoActionId(jSONObject.getString("do"));
            vVar.f37922a = jSONObject.getString(k1.a.f47555a);
            return vVar;
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final PushMessageInterface.ActionPrepareState prepareExecuteAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        return PushMessageInterface.ActionPrepareState.success;
    }
}

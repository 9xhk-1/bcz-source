package com.igexin.push.core.a.c;

import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class e implements PushMessageInterface {
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final boolean executeAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        com.igexin.push.core.a.b.d();
        String a11 = com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId());
        com.igexin.c.a.c.a.a("EndAction execute, remove pushMessage from pushMessageMap, key = ".concat(String.valueOf(a11)), new Object[0]);
        try {
            com.igexin.push.core.e.f38006ah.remove(a11);
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a("EndAction|" + e11.toString(), new Object[0]);
            return true;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final BaseActionBean parseAction(JSONObject jSONObject) {
        try {
            BaseActionBean baseActionBean = new BaseActionBean();
            baseActionBean.setType("null");
            baseActionBean.setActionId(jSONObject.getString("actionid"));
            return baseActionBean;
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

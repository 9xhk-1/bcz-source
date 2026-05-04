package com.igexin.push.core.a.c;

import com.getui.gtc.api.GtcManager;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class b implements PushMessageInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37671a = "CleanExtAction";

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final boolean executeAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        com.igexin.push.core.b.g gVar;
        int[] iArr;
        if (pushTaskBean != null && baseActionBean != null && (iArr = (gVar = (com.igexin.push.core.b.g) baseActionBean).f37791a) != null && iArr.length > 0) {
            Arrays.toString(iArr);
            GtcManager.getInstance().removeExt(com.igexin.push.core.b.f37738j, gVar.f37791a);
        }
        if ("".equals(baseActionBean.getDoActionId())) {
            return true;
        }
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseActionBean.getDoActionId());
        return true;
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final BaseActionBean parseAction(JSONObject jSONObject) {
        if (!jSONObject.has("ids")) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("ids"));
            if (jSONArray.length() <= 0) {
                return null;
            }
            int[] iArr = new int[jSONArray.length()];
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                iArr[i11] = jSONArray.getInt(i11);
            }
            com.igexin.push.core.b.g gVar = new com.igexin.push.core.b.g();
            gVar.setType(com.igexin.push.core.b.f37751w);
            gVar.f37791a = iArr;
            gVar.setActionId(jSONObject.getString("actionid"));
            gVar.setDoActionId(jSONObject.getString("do"));
            return gVar;
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

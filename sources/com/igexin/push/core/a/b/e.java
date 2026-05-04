package com.igexin.push.core.a.b;

import com.igexin.assist.action.MessageManger;
import com.igexin.push.d.c.n;
import com.igexin.sdk.main.FeedbackImpl;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37664a = "PushMessageAction";

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        byte[] bArr;
        try {
            n nVar = (n) obj;
            if (jSONObject.has("action") && jSONObject.getString("action").equals(com.igexin.push.core.b.E)) {
                Object obj2 = nVar.f38502g;
                if (obj2 instanceof byte[]) {
                    try {
                        new String((byte[]) obj2, "UTF-8");
                    } catch (Exception e11) {
                        com.igexin.c.a.c.a.a(f37664a + e11.toString(), new Object[0]);
                    }
                    bArr = (byte[]) nVar.f38502g;
                } else {
                    bArr = null;
                }
                String string = jSONObject.getString("taskid");
                com.igexin.c.a.c.a.a("getui receive message : %s", jSONObject);
                if (bArr == null || !com.igexin.assist.sdk.a.a().c()) {
                    com.igexin.push.core.n.a().a(jSONObject, bArr, true);
                } else {
                    com.igexin.push.core.e.d a11 = com.igexin.push.core.e.d.a(com.igexin.push.core.e.f38035l);
                    if (a11.a(string)) {
                        String str = string + "4051" + MessageManger.getInstance().getBrandCode();
                        if (!a11.a(str)) {
                            FeedbackImpl.getInstance().feedbackMultiBrandMessageAction(jSONObject, "1" + MessageManger.getInstance().getBrandCode());
                            a11.b(str);
                        }
                    } else {
                        a11.b(string);
                        com.igexin.push.core.n.a().a(jSONObject, bArr, true);
                        FeedbackImpl.getInstance().feedbackMultiBrandMessageAction(jSONObject, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
                    }
                }
            }
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
            com.igexin.c.a.c.a.a("PushMessageAction|" + e12.toString(), new Object[0]);
        }
        return true;
    }
}

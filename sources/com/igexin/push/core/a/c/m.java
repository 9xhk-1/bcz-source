package com.igexin.push.core.a.c;

import android.app.NotificationManager;
import android.text.TextUtils;
import com.igexin.push.core.b.t;
import com.igexin.push.core.d;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class m implements PushMessageInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37702a = com.igexin.push.core.b.f37734f + m.class.getName();

    private static void a(String str) {
        try {
            com.igexin.c.a.c.a.a(f37702a + "|del condition taskid = " + str, new Object[0]);
            d.a.f37956a.f37950i.a("message", new String[]{"taskid"}, new String[]{str});
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.b(f37702a, "del condition" + th2.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0174, code lost:
    
        if (r5 == null) goto L67;
     */
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean executeAction(com.igexin.push.extension.mod.PushTaskBean r17, com.igexin.push.extension.mod.BaseActionBean r18) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.m.executeAction(com.igexin.push.extension.mod.PushTaskBean, com.igexin.push.extension.mod.BaseActionBean):boolean");
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public BaseActionBean parseAction(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("do") || !jSONObject.has("actionid") || !jSONObject.has("taskid")) {
                return null;
            }
            t tVar = new t();
            tVar.setType(com.igexin.push.core.b.f37743o);
            tVar.setActionId(jSONObject.getString("actionid"));
            tVar.setDoActionId(jSONObject.getString("do"));
            tVar.f37908a = jSONObject.getString("taskid");
            tVar.f37909b = jSONObject.optBoolean(f80.f.f51304e);
            return tVar;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public PushMessageInterface.ActionPrepareState prepareExecuteAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        return PushMessageInterface.ActionPrepareState.success;
    }

    private static void a(String str, BaseActionBean baseActionBean) {
        if (baseActionBean == null) {
            return;
        }
        com.igexin.push.core.b.l lVar = (com.igexin.push.core.b.l) baseActionBean;
        String str2 = lVar.f37827q;
        HashSet<String> hashSet = com.igexin.push.core.e.f38008aj.get(str2);
        Integer num = com.igexin.push.core.e.f38009ak.get(lVar.f37827q);
        if (hashSet != null && !hashSet.isEmpty()) {
            hashSet.remove(str);
        }
        if (TextUtils.isEmpty(str2) || num == null || hashSet == null || !hashSet.isEmpty()) {
            return;
        }
        ((NotificationManager) com.igexin.push.core.e.f38035l.getSystemService("notification")).cancel(num.intValue());
        com.igexin.push.core.e.f38008aj.remove(str2);
        com.igexin.push.core.e.f38009ak.remove(str2);
    }
}

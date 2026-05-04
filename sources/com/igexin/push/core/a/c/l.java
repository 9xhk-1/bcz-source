package com.igexin.push.core.a.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.igexin.push.core.b.s;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class l implements PushMessageInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37701a = com.igexin.push.config.c.f37542a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r11.contains(com.huawei.hms.framework.common.ContainerUtils.KEY_VALUE_DELIMITER) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r6 = r11.substring(r11.indexOf(com.huawei.hms.framework.common.ContainerUtils.KEY_VALUE_DELIMITER) + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r11.contains(com.huawei.hms.framework.common.ContainerUtils.KEY_VALUE_DELIMITER) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.igexin.push.core.b.s r10, java.lang.String r11) {
        /*
            java.lang.String r0 = r10.f37904a
            if (r0 != 0) goto L5
            goto Lc
        L5:
            int r11 = r0.indexOf(r11)
            r1 = -1
            if (r11 != r1) goto Ld
        Lc:
            return
        Ld:
            java.lang.String r2 = "&"
            int r3 = r0.indexOf(r2)
            r4 = 0
            java.lang.String r5 = "="
            r6 = 0
            if (r3 != r1) goto L34
            int r1 = r11 + (-1)
            java.lang.String r1 = r0.substring(r4, r1)
            java.lang.String r11 = r0.substring(r11)
            boolean r0 = r11.contains(r5)
            if (r0 == 0) goto L9e
        L29:
            int r0 = r11.indexOf(r5)
            int r0 = r0 + 1
            java.lang.String r6 = r11.substring(r0)
            goto L9e
        L34:
            int r7 = r11 + (-1)
            char r8 = r0.charAt(r7)
            r9 = 63
            if (r8 != r9) goto L62
            java.lang.String r1 = r0.substring(r4, r11)
            int r2 = r3 + 1
            java.lang.String r2 = r0.substring(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            java.lang.String r11 = r0.substring(r11, r3)
            boolean r0 = r11.contains(r5)
            if (r0 == 0) goto L9e
            goto L29
        L62:
            char r3 = r0.charAt(r7)
            r8 = 38
            java.lang.String r9 = ""
            if (r3 != r8) goto L9d
            java.lang.String r3 = r0.substring(r4, r7)
            java.lang.String r11 = r0.substring(r11)
            int r0 = r11.indexOf(r2)
            if (r0 == r1) goto L82
            java.lang.String r9 = r11.substring(r0)
            java.lang.String r11 = r11.substring(r4, r0)
        L82:
            int r0 = r11.indexOf(r5)
            int r0 = r0 + 1
            java.lang.String r11 = r11.substring(r0)
            r6 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r9)
            java.lang.String r1 = r11.toString()
            goto L9e
        L9d:
            r1 = r9
        L9e:
            r10.f37904a = r1
            r10.f37907d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.l.a(com.igexin.push.core.b.s, java.lang.String):void");
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final boolean executeAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        s sVar = (s) baseActionBean;
        a(sVar, com.igexin.push.core.b.A);
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setFlags(268435456);
        intent.setPackage(sVar.f37907d);
        intent.setData(Uri.parse(sVar.a()));
        try {
            com.igexin.push.core.e.f38035l.startActivity(intent);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        sVar.a();
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
            if (!jSONObject.has("url") || !jSONObject.has("do") || !jSONObject.has("actionid")) {
                return null;
            }
            String string = jSONObject.getString("url");
            if (string.equals("")) {
                return null;
            }
            s sVar = new s();
            sVar.setType(com.igexin.push.core.b.f37749u);
            sVar.setActionId(jSONObject.getString("actionid"));
            sVar.setDoActionId(jSONObject.getString("do"));
            sVar.f37904a = string;
            if (jSONObject.has("is_withcid") && n6.m.f74525c.equals(jSONObject.getString("is_withcid"))) {
                sVar.f37905b = true;
            }
            if (jSONObject.has("is_withnettype") && n6.m.f74525c.equals(jSONObject.getString("is_withnettype"))) {
                sVar.f37906c = true;
            }
            return sVar;
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final PushMessageInterface.ActionPrepareState prepareExecuteAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        return PushMessageInterface.ActionPrepareState.success;
    }

    private static void a(String str, Context context) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            s sVar = new s();
            sVar.f37904a = str;
            a(sVar, com.igexin.push.core.b.A);
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setFlags(268435456);
            intent.setPackage(sVar.f37907d);
            intent.setData(Uri.parse(sVar.a()));
            context.startActivity(intent);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }
}

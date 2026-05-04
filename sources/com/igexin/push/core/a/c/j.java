package com.igexin.push.core.a.c;

import android.content.Context;
import android.content.Intent;
import com.igexin.push.core.b.p;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class j implements PushMessageInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37699a = "com.igexin.push.core.a.c.j";

    private static void a(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(270532608);
                intent.setComponent(launchIntentForPackage.getComponent());
                context.startActivity(intent);
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[Catch: Exception -> 0x0066, TRY_ENTER, TryCatch #0 {Exception -> 0x0066, blocks: (B:11:0x0043, B:13:0x005c, B:14:0x0068, B:16:0x006e, B:17:0x0079, B:18:0x007d, B:20:0x0081, B:22:0x0098, B:24:0x00a0, B:25:0x00aa, B:27:0x00ae, B:28:0x00bc, B:30:0x00c2), top: B:9:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:11:0x0043, B:13:0x005c, B:14:0x0068, B:16:0x006e, B:17:0x0079, B:18:0x007d, B:20:0x0081, B:22:0x0098, B:24:0x00a0, B:25:0x00aa, B:27:0x00ae, B:28:0x00bc, B:30:0x00c2), top: B:9:0x0041 }] */
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean executeAction(com.igexin.push.extension.mod.PushTaskBean r9, com.igexin.push.extension.mod.BaseActionBean r10) {
        /*
            r8 = this;
            r0 = 1
            if (r9 == 0) goto Ld1
            if (r10 == 0) goto Ld1
            r1 = r10
            com.igexin.push.core.b.p r1 = (com.igexin.push.core.b.p) r1
            java.lang.String r2 = r1.f37897b
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)
            r4 = 0
            if (r3 == 0) goto L17
            java.lang.String r2 = com.igexin.push.core.e.f37998a
        L15:
            r3 = r0
            goto L23
        L17:
            java.lang.String r3 = com.igexin.push.core.e.f37998a
            java.lang.String r5 = r1.f37897b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L22
            goto L15
        L22:
            r3 = r4
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "doStartApp|"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r6 = "|"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.igexin.c.a.c.a.a(r5, r4)
            java.lang.String r4 = "true"
            r5 = 0
            if (r3 == 0) goto L81
            com.igexin.push.core.l r3 = com.igexin.push.core.l.a()     // Catch: java.lang.Exception -> L66
            java.lang.String r6 = r9.getTaskId()     // Catch: java.lang.Exception -> L66
            java.lang.String r7 = r9.getMessageId()     // Catch: java.lang.Exception -> L66
            r3.a(r6, r7, r2, r5)     // Catch: java.lang.Exception -> L66
            com.igexin.push.core.b.p r10 = (com.igexin.push.core.b.p) r10     // Catch: java.lang.Exception -> L66
            java.lang.String r10 = r10.f37899d     // Catch: java.lang.Exception -> L66
            boolean r10 = r10.equals(r4)     // Catch: java.lang.Exception -> L66
            if (r10 == 0) goto L68
            java.lang.String r10 = com.igexin.push.core.e.f38030g     // Catch: java.lang.Exception -> L66
            android.content.Context r10 = com.igexin.push.core.e.f38035l     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = com.igexin.push.core.e.f38030g     // Catch: java.lang.Exception -> L66
            a(r10, r2)     // Catch: java.lang.Exception -> L66
            goto L68
        L66:
            r9 = move-exception
            goto Lce
        L68:
            java.lang.String r10 = r1.getDoActionId()     // Catch: java.lang.Exception -> L66
            if (r10 == 0) goto Ld1
            com.igexin.push.core.a.b.d()     // Catch: java.lang.Exception -> L66
            java.lang.String r10 = r9.getTaskId()     // Catch: java.lang.Exception -> L66
            java.lang.String r9 = r9.getMessageId()     // Catch: java.lang.Exception -> L66
        L79:
            java.lang.String r1 = r1.getDoActionId()     // Catch: java.lang.Exception -> L66
        L7d:
            com.igexin.push.core.a.b.a(r10, r9, r1)     // Catch: java.lang.Exception -> L66
            goto Ld1
        L81:
            com.igexin.push.core.l r3 = com.igexin.push.core.l.a()     // Catch: java.lang.Exception -> L66
            java.lang.String r6 = r9.getTaskId()     // Catch: java.lang.Exception -> L66
            java.lang.String r7 = r9.getMessageId()     // Catch: java.lang.Exception -> L66
            r3.a(r6, r7, r2, r5)     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = r1.f37899d     // Catch: java.lang.Exception -> L66
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto Lbc
            java.lang.String r2 = r1.f37896a     // Catch: java.lang.Exception -> L66
            boolean r2 = com.igexin.push.g.c.a(r2)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto Laa
            android.content.Context r2 = com.igexin.push.core.e.f38035l     // Catch: java.lang.Exception -> L66
            com.igexin.push.core.b.p r10 = (com.igexin.push.core.b.p) r10     // Catch: java.lang.Exception -> L66
            java.lang.String r10 = r10.f37896a     // Catch: java.lang.Exception -> L66
            a(r2, r10)     // Catch: java.lang.Exception -> L66
            goto Lbc
        Laa:
            java.lang.String r10 = r1.f37898c     // Catch: java.lang.Exception -> L66
            if (r10 == 0) goto Ld1
            com.igexin.push.core.a.b.d()     // Catch: java.lang.Exception -> L66
            java.lang.String r10 = r9.getTaskId()     // Catch: java.lang.Exception -> L66
            java.lang.String r9 = r9.getMessageId()     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = r1.f37898c     // Catch: java.lang.Exception -> L66
            goto L7d
        Lbc:
            java.lang.String r10 = r1.getDoActionId()     // Catch: java.lang.Exception -> L66
            if (r10 == 0) goto Ld1
            com.igexin.push.core.a.b.d()     // Catch: java.lang.Exception -> L66
            java.lang.String r10 = r9.getTaskId()     // Catch: java.lang.Exception -> L66
            java.lang.String r9 = r9.getMessageId()     // Catch: java.lang.Exception -> L66
            goto L79
        Lce:
            com.igexin.c.a.c.a.a(r9)
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.j.executeAction(com.igexin.push.extension.mod.PushTaskBean, com.igexin.push.extension.mod.BaseActionBean):boolean");
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public BaseActionBean parseAction(JSONObject jSONObject) {
        try {
            p pVar = new p();
            pVar.setType(com.igexin.push.core.b.f37745q);
            pVar.setActionId(jSONObject.getString("actionid"));
            pVar.setDoActionId(jSONObject.getString("do"));
            if (jSONObject.has("appstartupid")) {
                pVar.f37896a = jSONObject.getJSONObject("appstartupid").getString("android");
            }
            if (jSONObject.has("is_autostart")) {
                pVar.f37899d = jSONObject.getString("is_autostart");
            }
            if (jSONObject.has("appid")) {
                pVar.f37897b = jSONObject.getString("appid");
            }
            if (jSONObject.has("noinstall_action")) {
                pVar.f37898c = jSONObject.getString("noinstall_action");
            }
            return pVar;
        } catch (JSONException e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public PushMessageInterface.ActionPrepareState prepareExecuteAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        return PushMessageInterface.ActionPrepareState.success;
    }
}

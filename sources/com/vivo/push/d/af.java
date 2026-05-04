package com.vivo.push.d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class af extends z {
    public af(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.u uVar = (com.vivo.push.b.u) oVar;
        if (com.vivo.push.e.a().g() && !a(com.vivo.push.util.z.c(this.f45035a), uVar.e(), uVar.i())) {
            com.vivo.push.util.p.d("OnUndoMsgTask", " vertify msg is error ");
            com.vivo.push.b.x xVar = new com.vivo.push.b.x(1021L);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(uVar.f()));
            Context context = this.f45035a;
            String b11 = com.vivo.push.util.z.b(context, context.getPackageName());
            if (!TextUtils.isEmpty(b11)) {
                hashMap.put("remoteAppId", b11);
            }
            xVar.a(hashMap);
            com.vivo.push.e.a().a(xVar);
            return;
        }
        boolean repealNotifyById = NotifyAdapterUtil.repealNotifyById(this.f45035a, uVar.d());
        com.vivo.push.util.p.d("OnUndoMsgTask", "undo message " + uVar.d() + j2.O + repealNotifyById);
        if (repealNotifyById) {
            com.vivo.push.util.p.b(this.f45035a, "回收client通知成功, 上报埋点 1031, messageId = " + uVar.d());
            com.vivo.push.util.e.a(this.f45035a, uVar.d(), 1031L);
            return;
        }
        com.vivo.push.util.p.d("OnUndoMsgTask", "undo message fail，messageId = " + uVar.d());
        com.vivo.push.util.p.c(this.f45035a, "回收client通知失败，messageId = " + uVar.d());
    }
}

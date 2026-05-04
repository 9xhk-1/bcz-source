package com.vivo.push.d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.UnvarnishedMessage;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class p extends z {
    public p(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.o oVar2 = (com.vivo.push.b.o) oVar;
        com.vivo.push.e.a().a(new com.vivo.push.b.h(String.valueOf(oVar2.f())));
        if (!ClientConfigManagerImpl.getInstance(this.f45035a).isEnablePush()) {
            com.vivo.push.util.p.d("OnMessageTask", "command  " + oVar + " is ignore by disable push ");
            com.vivo.push.b.x xVar = new com.vivo.push.b.x(1020L);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(oVar2.f()));
            Context context = this.f45035a;
            String b11 = com.vivo.push.util.z.b(context, context.getPackageName());
            if (!TextUtils.isEmpty(b11)) {
                hashMap.put("remoteAppId", b11);
            }
            xVar.a(hashMap);
            com.vivo.push.e.a().a(xVar);
            return;
        }
        if (com.vivo.push.e.a().g() && !a(com.vivo.push.util.z.c(this.f45035a), oVar2.d(), oVar2.i())) {
            com.vivo.push.b.x xVar2 = new com.vivo.push.b.x(1021L);
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put(IntentConstant.MESSAGE_ID, String.valueOf(oVar2.f()));
            Context context2 = this.f45035a;
            String b12 = com.vivo.push.util.z.b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(b12)) {
                hashMap2.put("remoteAppId", b12);
            }
            xVar2.a(hashMap2);
            com.vivo.push.e.a().a(xVar2);
            return;
        }
        UnvarnishedMessage e11 = oVar2.e();
        if (e11 == null) {
            com.vivo.push.util.p.a("OnMessageTask", " message is null");
            return;
        }
        com.vivo.push.util.p.d("OnMessageTask", "tragetType is " + e11.getTargetType() + " ; target is " + e11.getTragetContent());
        com.vivo.push.m.b(new q(this, e11));
    }
}

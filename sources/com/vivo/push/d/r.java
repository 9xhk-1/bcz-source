package com.vivo.push.d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.InsideNotificationItem;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class r extends z {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a();

        void b();
    }

    public r(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        if (oVar == null) {
            com.vivo.push.util.p.a("OnNotificationArrivedTask", "command is null");
            return;
        }
        boolean isEnablePush = ClientConfigManagerImpl.getInstance(this.f45035a).isEnablePush();
        com.vivo.push.b.q qVar = (com.vivo.push.b.q) oVar;
        Context context = this.f45035a;
        if (!com.vivo.push.util.t.d(context, context.getPackageName())) {
            com.vivo.push.b.x xVar = new com.vivo.push.b.x(2101L);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(qVar.f()));
            Context context2 = this.f45035a;
            String b11 = com.vivo.push.util.z.b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(b11)) {
                hashMap.put("remoteAppId", b11);
            }
            xVar.a(hashMap);
            com.vivo.push.e.a().a(xVar);
            return;
        }
        com.vivo.push.e.a().a(new com.vivo.push.b.h(String.valueOf(qVar.f())));
        com.vivo.push.util.p.d("OnNotificationArrivedTask", "PushMessageReceiver " + this.f45035a.getPackageName() + " isEnablePush :" + isEnablePush);
        if (!isEnablePush) {
            com.vivo.push.b.x xVar2 = new com.vivo.push.b.x(1020L);
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put(IntentConstant.MESSAGE_ID, String.valueOf(qVar.f()));
            Context context3 = this.f45035a;
            String b12 = com.vivo.push.util.z.b(context3, context3.getPackageName());
            if (!TextUtils.isEmpty(b12)) {
                hashMap2.put("remoteAppId", b12);
            }
            xVar2.a(hashMap2);
            com.vivo.push.e.a().a(xVar2);
            return;
        }
        if (com.vivo.push.e.a().g() && !a(com.vivo.push.util.z.c(this.f45035a), qVar.e(), qVar.i())) {
            com.vivo.push.b.x xVar3 = new com.vivo.push.b.x(1021L);
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put(IntentConstant.MESSAGE_ID, String.valueOf(qVar.f()));
            Context context4 = this.f45035a;
            String b13 = com.vivo.push.util.z.b(context4, context4.getPackageName());
            if (!TextUtils.isEmpty(b13)) {
                hashMap3.put("remoteAppId", b13);
            }
            xVar3.a(hashMap3);
            com.vivo.push.e.a().a(xVar3);
            return;
        }
        InsideNotificationItem d11 = qVar.d();
        if (d11 == null) {
            com.vivo.push.util.p.a("OnNotificationArrivedTask", "notify is null");
            com.vivo.push.util.p.c(this.f45035a, "通知内容为空，" + qVar.f());
            com.vivo.push.util.e.a(this.f45035a, qVar.f(), 1027L);
            return;
        }
        com.vivo.push.util.p.d("OnNotificationArrivedTask", "tragetType is " + d11.getTargetType() + " ; target is " + d11.getTragetContent());
        com.vivo.push.m.c(new s(this, d11, qVar));
    }
}

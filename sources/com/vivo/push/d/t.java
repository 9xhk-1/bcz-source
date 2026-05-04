package com.vivo.push.d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.vivo.push.d.r;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class t implements r.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f44986a;

    public t(s sVar) {
        this.f44986a = sVar;
    }

    @Override // com.vivo.push.d.r.a
    public final void a() {
        Context context;
        Context context2;
        long l11 = com.vivo.push.e.a().l();
        if (l11 < 1400 && l11 != 1340) {
            com.vivo.push.util.p.b("OnNotificationArrivedTask", "引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：".concat(String.valueOf(l11)));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("srt", "1");
        hashMap.put("message_id", String.valueOf(this.f44986a.f44984b.f()));
        context = ((com.vivo.push.l) this.f44986a.f44985c).f45035a;
        context2 = ((com.vivo.push.l) this.f44986a.f44985c).f45035a;
        String b11 = com.vivo.push.util.z.b(context, context2.getPackageName());
        if (!TextUtils.isEmpty(b11)) {
            hashMap.put("app_id", b11);
        }
        hashMap.put("type", "1");
        hashMap.put("dtp", "1");
        com.vivo.push.util.e.a(6L, hashMap);
    }

    @Override // com.vivo.push.d.r.a
    public final void b() {
        Context context;
        Context context2;
        HashMap hashMap = new HashMap();
        hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(this.f44986a.f44984b.f()));
        context = ((com.vivo.push.l) this.f44986a.f44985c).f45035a;
        context2 = ((com.vivo.push.l) this.f44986a.f44985c).f45035a;
        String b11 = com.vivo.push.util.z.b(context, context2.getPackageName());
        if (!TextUtils.isEmpty(b11)) {
            hashMap.put("remoteAppId", b11);
        }
        com.vivo.push.util.e.a(2122L, hashMap);
    }
}

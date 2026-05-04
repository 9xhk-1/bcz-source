package com.vivo.push.d;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InsideNotificationItem f44983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.q f44984b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f44985c;

    public s(r rVar, InsideNotificationItem insideNotificationItem, com.vivo.push.b.q qVar) {
        this.f44985c = rVar;
        this.f44983a = insideNotificationItem;
        this.f44984b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        int type;
        Context context7;
        Context context8;
        Context context9;
        Context context10;
        Context context11;
        Context context12;
        Context context13;
        Context context14;
        r rVar = this.f44985c;
        PushMessageCallback pushMessageCallback = ((z) rVar).f44994b;
        context = ((com.vivo.push.l) rVar).f45035a;
        if (pushMessageCallback.onNotificationMessageArrived(context, com.vivo.push.util.q.a(this.f44983a))) {
            StringBuilder sb2 = new StringBuilder("pkg name : ");
            context11 = ((com.vivo.push.l) this.f44985c).f45035a;
            sb2.append(context11.getPackageName());
            sb2.append(" 应用主动拦截通知");
            com.vivo.push.util.p.b("OnNotificationArrivedTask", sb2.toString());
            context12 = ((com.vivo.push.l) this.f44985c).f45035a;
            com.vivo.push.util.p.b(context12, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
            HashMap hashMap = new HashMap();
            hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(this.f44984b.f()));
            context13 = ((com.vivo.push.l) this.f44985c).f45035a;
            context14 = ((com.vivo.push.l) this.f44985c).f45035a;
            String b11 = com.vivo.push.util.z.b(context13, context14.getPackageName());
            if (!TextUtils.isEmpty(b11)) {
                hashMap.put("remoteAppId", b11);
            }
            com.vivo.push.util.e.a(2120L, hashMap);
            return;
        }
        int b12 = this.f44985c.b();
        if (b12 > 0) {
            StringBuilder sb3 = new StringBuilder("pkg name : ");
            context7 = ((com.vivo.push.l) this.f44985c).f45035a;
            sb3.append(context7.getPackageName());
            sb3.append(" notify channel switch is ");
            sb3.append(b12);
            com.vivo.push.util.p.b("OnNotificationArrivedTask", sb3.toString());
            context8 = ((com.vivo.push.l) this.f44985c).f45035a;
            com.vivo.push.util.p.b(context8, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(b12)));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(IntentConstant.MESSAGE_ID, String.valueOf(this.f44984b.f()));
            context9 = ((com.vivo.push.l) this.f44985c).f45035a;
            context10 = ((com.vivo.push.l) this.f44985c).f45035a;
            String b13 = com.vivo.push.util.z.b(context9, context10.getPackageName());
            if (!TextUtils.isEmpty(b13)) {
                hashMap2.put("remoteAppId", b13);
            }
            com.vivo.push.util.e.a(b12, hashMap2);
            return;
        }
        context2 = ((com.vivo.push.l) this.f44985c).f45035a;
        InsideNotificationItem insideNotificationItem = this.f44983a;
        long f11 = this.f44984b.f();
        r rVar2 = this.f44985c;
        PushMessageCallback pushMessageCallback2 = ((z) rVar2).f44994b;
        context3 = ((com.vivo.push.l) rVar2).f45035a;
        com.vivo.push.util.k kVar = new com.vivo.push.util.k(context2, insideNotificationItem, f11, pushMessageCallback2.isAllowNet(context3), new t(this));
        boolean isShowBigPicOnMobileNet = this.f44983a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f44983a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f44983a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            com.vivo.push.util.p.c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(isShowBigPicOnMobileNet)));
            if (isShowBigPicOnMobileNet) {
                context4 = ((com.vivo.push.l) this.f44985c).f45035a;
                com.vivo.push.util.p.a(context4, "mobile net show");
            } else {
                context5 = ((com.vivo.push.l) this.f44985c).f45035a;
                com.vivo.push.util.p.a(context5, "mobile net unshow");
                context6 = ((com.vivo.push.l) this.f44985c).f45035a;
                NetworkInfo a11 = com.vivo.push.util.r.a(context6);
                if (a11 != null && a11.getState() == NetworkInfo.State.CONNECTED && (type = a11.getType()) != 1 && type == 0) {
                    this.f44983a.clearCoverUrl();
                    this.f44983a.clearPurePicUrl();
                    purePicUrl = null;
                }
            }
        }
        kVar.execute(this.f44983a.getIconUrl(), purePicUrl);
    }
}

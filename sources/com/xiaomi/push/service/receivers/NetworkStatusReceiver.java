package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.af;
import com.xiaomi.mipush.sdk.ao;
import com.xiaomi.mipush.sdk.au;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.mipush.sdk.e;
import com.xiaomi.push.bi;
import com.xiaomi.push.ha;
import com.xiaomi.push.l;
import com.xiaomi.push.service.ServiceClient;

/* loaded from: classes8.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f46394a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46395b = true;

    public NetworkStatusReceiver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (!ao.a(context).m5676a() && b.m5683a(context).m5692c() && !b.m5683a(context).m5695f()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }
        ha.m6006a(context);
        if (bi.b(context) && ao.a(context).m5679b()) {
            ao.a(context).m5680c();
        }
        if (bi.b(context)) {
            if ("syncing".equals(af.a(context).a(au.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(af.a(context).a(au.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            af a11 = af.a(context);
            au auVar = au.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(a11.a(auVar))) {
                ao.a(context).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, com.alipay.sdk.m.k.b.f10651k);
            }
            if ("syncing".equals(af.a(context).a(au.UPLOAD_FCM_TOKEN))) {
                ao.a(context).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, com.alipay.sdk.m.k.b.f10651k);
            }
            af a12 = af.a(context);
            au auVar2 = au.UPLOAD_COS_TOKEN;
            if ("syncing".equals(a12.a(auVar2))) {
                ao.a(context).a((String) null, auVar2, e.ASSEMBLE_PUSH_COS, com.alipay.sdk.m.k.b.f10651k);
            }
            af a13 = af.a(context);
            au auVar3 = au.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(a13.a(auVar3))) {
                ao.a(context).a((String) null, auVar3, e.ASSEMBLE_PUSH_FTOS, com.alipay.sdk.m.k.b.f10651k);
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f46395b) {
            return;
        }
        l.a().post(new a(this, context));
    }

    public NetworkStatusReceiver(Object obj) {
        f46394a = true;
    }

    public static boolean a() {
        return f46394a;
    }
}

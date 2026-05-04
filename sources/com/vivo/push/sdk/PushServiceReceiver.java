package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.igexin.sdk.PushConsts;
import com.vivo.push.PushClient;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.e;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.p;
import com.vivo.push.util.r;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class PushServiceReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static HandlerThread f45059a;

    /* renamed from: b, reason: collision with root package name */
    private static Handler f45060b;

    /* renamed from: c, reason: collision with root package name */
    private static a f45061c = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Context f45062a;

        /* renamed from: b, reason: collision with root package name */
        private String f45063b;

        public static /* synthetic */ void a(a aVar, Context context, String str) {
            aVar.f45062a = ContextDelegate.getContext(context);
            aVar.f45063b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NetworkInfo a11 = r.a(this.f45062a);
            if (!(a11 != null ? a11.isConnectedOrConnecting() : false)) {
                p.d("PushServiceReceiver", this.f45062a.getPackageName() + ": 无网络  by " + this.f45063b);
                p.a(this.f45062a, "触发静态广播:无网络(" + this.f45063b + "," + this.f45062a.getPackageName() + j.f81007d);
                return;
            }
            p.d("PushServiceReceiver", this.f45062a.getPackageName() + ": 执行开始出发动作: " + this.f45063b);
            p.a(this.f45062a, "触发静态广播(" + this.f45063b + "," + this.f45062a.getPackageName() + j.f81007d);
            e.a().a(this.f45062a);
            if (ClientConfigManagerImpl.getInstance(this.f45062a).isCancleBroadcastReceiver()) {
                return;
            }
            try {
                PushClient.getInstance(this.f45062a).initialize();
            } catch (VivoPushException e11) {
                e11.printStackTrace();
                p.a(this.f45062a, " 初始化异常 error= " + e11.getMessage());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2 = ContextDelegate.getContext(context);
        String action = intent.getAction();
        if (PushConsts.ACTION_BROADCAST_NETWORK_CHANGE.equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            if (f45059a == null) {
                HandlerThread handlerThread = new HandlerThread("PushServiceReceiver");
                f45059a = handlerThread;
                handlerThread.start();
                f45060b = new Handler(f45059a.getLooper());
            }
            p.d("PushServiceReceiver", context2.getPackageName() + ": start PushSerevice for by " + action + "  ; handler : " + f45060b);
            a.a(f45061c, context2, action);
            f45060b.removeCallbacks(f45061c);
            f45060b.postDelayed(f45061c, 2000L);
        }
    }
}

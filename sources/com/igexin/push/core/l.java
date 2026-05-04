package com.igexin.push.core;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.message.BindAliasCmdMessage;
import com.igexin.sdk.message.FeedbackCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTPopupMessage;
import com.igexin.sdk.message.GTTransmitMessage;
import com.igexin.sdk.message.QueryTagCmdMessage;
import com.igexin.sdk.message.SetTagCmdMessage;
import com.igexin.sdk.message.UnBindAliasCmdMessage;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class l extends Handler implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38333a = "MsgServerSender";

    /* renamed from: c, reason: collision with root package name */
    private static volatile l f38334c = null;

    /* renamed from: e, reason: collision with root package name */
    private static final int f38335e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f38336f = 2;

    /* renamed from: h, reason: collision with root package name */
    private static Context f38337h;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Intent> f38338b;

    /* renamed from: d, reason: collision with root package name */
    private final a f38339d;

    /* renamed from: g, reason: collision with root package name */
    private volatile Messenger f38340g;

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f38341i;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        static final int f38342a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f38343b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f38344c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f38345d = 0;

        /* renamed from: e, reason: collision with root package name */
        static final int f38346e = 1;

        /* renamed from: f, reason: collision with root package name */
        final Handler f38347f;

        public a() {
            HandlerThread handlerThread = new HandlerThread("GTIS-HANDLER");
            handlerThread.start();
            this.f38347f = new Handler(handlerThread.getLooper()) { // from class: com.igexin.push.core.l.a.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    if (message == null) {
                        return;
                    }
                    try {
                        int i11 = message.what;
                        boolean z11 = true;
                        if (i11 == 1) {
                            if (l.this.a((IBinder) message.obj)) {
                                removeMessages(2);
                                removeMessages(3);
                                removeMessages(1);
                                l.a(l.this);
                                return;
                            }
                            return;
                        }
                        if (i11 == 2 || i11 == 3) {
                            l lVar = l.this;
                            if (message.arg1 != 0) {
                                z11 = false;
                            }
                            l.a(lVar, z11);
                        }
                    } catch (Throwable th2) {
                        l.this.f38341i.set(false);
                        com.igexin.c.a.c.a.a(th2);
                    }
                }
            };
        }

        private Handler a() {
            return this.f38347f;
        }
    }

    private l() {
        super(Looper.getMainLooper());
        this.f38341i = new AtomicBoolean(false);
        a aVar = new a();
        this.f38339d = aVar;
        this.f38338b = new ConcurrentLinkedQueue<>();
        Message.obtain(aVar.f38347f, 3, 1, 0).sendToTarget();
    }

    public static l a() {
        if (f38334c == null) {
            synchronized (l.class) {
                try {
                    if (f38334c == null) {
                        f38334c = new l();
                    }
                } finally {
                }
            }
        }
        return f38334c;
    }

    @TargetApi(12)
    public static Intent d() {
        Intent intent = new Intent();
        intent.setAction(b.K + e.f37998a);
        intent.setPackage(e.f38035l.getPackageName());
        return intent;
    }

    private void e() {
        this.f38340g = null;
    }

    private void f() {
        if (this.f38341i.get()) {
            return;
        }
        com.igexin.c.a.c.a.a("MsgServerSender|try to bind iservice", new Object[0]);
        try {
            this.f38341i.set(true);
            if (e.f38035l == null) {
                e.f38035l = f38337h;
            }
            Intent intent = new Intent(e.f38035l, (Class<?>) ServiceManager.getInstance().c(e.f38035l));
            intent.setType(e.f38035l.getPackageName());
            e.f38035l.bindService(intent, this, 1);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.e.a(f38333a, "bind iservice error = " + th2.toString());
            com.igexin.c.a.c.a.a(th2);
            this.f38341i.set(false);
        }
    }

    private void g() {
        Message obtain = Message.obtain();
        obtain.what = 2;
        try {
            this.f38340g.send(obtain);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a("MsgServerSender|send clent to iservice error = " + e11.toString(), new Object[0]);
            if (e11 instanceof DeadObjectException) {
                Message.obtain(this.f38339d.f38347f, 2, 0, 0).sendToTarget();
            }
        }
    }

    private void h() {
        while (!this.f38338b.isEmpty()) {
            Intent poll = this.f38338b.poll();
            if (poll != null) {
                a(poll);
            }
        }
    }

    private void i() {
        Bundle bundle = new Bundle();
        bundle.putInt("action", PushConsts.ACTION_NOTIFICATION_ENABLE);
        a(bundle);
    }

    private static Class j() {
        return ServiceManager.getInstance().c(e.f38035l);
    }

    public final void c() {
        com.igexin.c.a.c.a.b(f38333a, "broadcastClientId|" + e.A);
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10002);
        bundle.putString(PushConsts.KEY_CLIENT_ID, e.A);
        a(bundle);
        Intent d11 = d();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("action", 10002);
        bundle2.putString(PushConsts.KEY_CLIENT_ID, e.A);
        d11.putExtras(bundle2);
        e.f38035l.sendBroadcast(d11, e.f38001ac);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        super.handleMessage(message);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.igexin.c.a.c.a.a("MsgServerSender|remote iservice connected ", new Object[0]);
        Message.obtain(this.f38339d.f38347f, 1, iBinder).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.igexin.c.a.c.a.a("MsgServerSender|remote iservice disConnected ~~~", new Object[0]);
        this.f38341i.set(false);
        this.f38340g = null;
    }

    private void a(int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", PushConsts.GET_SDKSERVICEPID);
        bundle.putInt(PushConsts.KEY_SERVICE_PIT, i11);
        a(bundle);
    }

    public final void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10007);
        bundle.putBoolean(PushConsts.KEY_ONLINE_STATE, e.f38044u);
        a(bundle);
        try {
            Intent d11 = d();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("action", 10007);
            bundle2.putBoolean(PushConsts.KEY_ONLINE_STATE, e.f38044u);
            d11.putExtras(bundle2);
            e.f38035l.sendBroadcast(d11, e.f38001ac);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final void c(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10010);
        bundle.putSerializable(PushConsts.KEY_CMD_MSG, new UnBindAliasCmdMessage(str, str2, 10011));
        a(bundle);
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        f38337h = context.getApplicationContext();
        ServiceManager.f37612b = context.getApplicationContext();
    }

    private void b(Intent intent) {
        if (this.f38340g != null) {
            a(intent);
        } else {
            this.f38338b.add(intent);
            Message.obtain(this.f38339d.f38347f, 2, 1, 0).sendToTarget();
        }
    }

    private void a(Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.f38340g == null) {
            com.igexin.c.a.c.a.a(f38333a, "realSend, remoteMessenger is null");
            com.igexin.c.a.c.a.a("MsgServerSender|realSend, remoteMessenger is null", new Object[0]);
        }
        Bundle extras = intent.getExtras();
        if (extras == null || extras.get("action") == null || !(extras.get("action") instanceof Integer)) {
            return;
        }
        com.igexin.c.a.c.a.a("MsgServerSender|realSend action = ".concat(String.valueOf(extras.getInt("action"))), new Object[0]);
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = intent;
        try {
            this.f38340g.send(obtain);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a("MsgServerSender|realSend iservice error = " + e11.toString(), new Object[0]);
            if (e11 instanceof DeadObjectException) {
                Message.obtain(this.f38339d.f38347f, 2, 0, 0).sendToTarget();
            }
        }
    }

    private void b(GTPopupMessage gTPopupMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", PushConsts.ACTION_POPUP_SHOW);
        bundle.putSerializable(PushConsts.KEY_POPUP_SHOW, gTPopupMessage);
        a(bundle);
    }

    public final void a(Bundle bundle) {
        Intent intent = new Intent();
        intent.setAction(String.valueOf(bundle.getInt("action")));
        intent.putExtras(bundle);
        b(intent);
    }

    public final void b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10010);
        bundle.putSerializable(PushConsts.KEY_CMD_MSG, new BindAliasCmdMessage(str, str2, 10010));
        a(bundle);
    }

    public static /* synthetic */ void a(l lVar) {
        while (!lVar.f38338b.isEmpty()) {
            Intent poll = lVar.f38338b.poll();
            if (poll != null) {
                lVar.a(poll);
            }
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10012);
        bundle.putSerializable(PushConsts.KEY_NOTIFICATION_CLICKED, new GTNotificationMessage(str, str2, str3, str4, str5, str6, str7));
        a(bundle);
    }

    public static /* synthetic */ void a(l lVar, boolean z11) {
        if (z11 && lVar.f38340g != null) {
            lVar.f38340g = null;
        }
        if (lVar.f38341i.get()) {
            return;
        }
        com.igexin.c.a.c.a.a("MsgServerSender|try to bind iservice", new Object[0]);
        try {
            lVar.f38341i.set(true);
            if (e.f38035l == null) {
                e.f38035l = f38337h;
            }
            Intent intent = new Intent(e.f38035l, (Class<?>) ServiceManager.getInstance().c(e.f38035l));
            intent.setType(e.f38035l.getPackageName());
            e.f38035l.bindService(intent, lVar, 1);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.e.a(f38333a, "bind iservice error = " + th2.toString());
            com.igexin.c.a.c.a.a(th2);
            lVar.f38341i.set(false);
        }
    }

    private void a(GTPopupMessage gTPopupMessage) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(GTPopupMessage.class.getClassLoader());
        bundle.putInt("action", PushConsts.ACTION_POPUP_CLICKED);
        bundle.putSerializable(PushConsts.KEY_POPUP_CLICKED, gTPopupMessage);
        a(bundle);
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10013);
        bundle.putString(PushConsts.KEY_DEVICE_TOKEN, str);
        a(bundle);
    }

    public final void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10010);
        bundle.putSerializable(PushConsts.KEY_CMD_MSG, new SetTagCmdMessage(str, str2, PushConsts.SET_TAG_RESULT));
        a(bundle);
    }

    public final void a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10010);
        bundle.putSerializable(PushConsts.KEY_CMD_MSG, new QueryTagCmdMessage(str, str2, str3, 10012));
        a(bundle);
    }

    public final void a(String str, String str2, String str3, String str4) {
        byte[] msgExtra;
        com.igexin.c.a.c.a.a("startapp|broadcastPayload", new Object[0]);
        if (str4 != null) {
            msgExtra = str4.getBytes();
        } else {
            com.igexin.push.core.a.b.d();
            PushTaskBean pushTaskBean = e.f38006ah.get(com.igexin.push.core.a.b.a(str, str2));
            msgExtra = pushTaskBean != null ? pushTaskBean.getMsgExtra() : null;
        }
        if (msgExtra != null) {
            new String(msgExtra);
            com.igexin.c.a.c.a.a("startapp|broadcast|payload = " + new String(msgExtra), new Object[0]);
            String str5 = e.f37998a;
            if (str5 != null && str5.equals(str3)) {
                Bundle bundle = new Bundle();
                bundle.putInt("action", 10001);
                bundle.putSerializable(PushConsts.KEY_MESSAGE_DATA, new GTTransmitMessage(str, str2, str2 + ":" + str, msgExtra));
                a(bundle);
            }
            Intent intent = new Intent();
            intent.setAction(b.K.concat(String.valueOf(str3)));
            Bundle bundle2 = new Bundle();
            bundle2.putInt("action", 10001);
            bundle2.putString("taskid", str);
            bundle2.putString("messageid", str2);
            bundle2.putString("appid", str3);
            bundle2.putString("payloadid", str2 + ":" + str);
            bundle2.putString("packagename", e.f38030g);
            bundle2.putByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD, msgExtra);
            intent.putExtras(bundle2);
            intent.setPackage(e.f38035l.getPackageName());
            e.f38035l.sendBroadcast(intent, e.f38001ac);
            return;
        }
        com.igexin.c.a.c.a.a("startapp|broadcast|payload is empty!", new Object[0]);
    }

    private void a(String str, String str2, String str3, String str4, long j11) {
        String str5 = e.f37998a;
        if (str5 != null && str5.equals(str)) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 10010);
            bundle.putSerializable(PushConsts.KEY_CMD_MSG, new FeedbackCmdMessage(str2, str3, str4, j11, PushConsts.THIRDPART_FEEDBACK));
            a(bundle);
        }
        Intent d11 = d();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("action", PushConsts.THIRDPART_FEEDBACK);
        bundle2.putString("appid", str);
        bundle2.putString("taskid", str2);
        bundle2.putString("actionid", str3);
        bundle2.putString("result", str4);
        bundle2.putLong(com.alipay.sdk.m.t.a.f11034k, j11);
        d11.putExtras(bundle2);
        e.f38035l.sendBroadcast(d11, e.f38001ac);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10011);
        bundle.putSerializable("notification_arrived", new GTNotificationMessage(str, str2, str3, str4, str5, str6, str7));
        a(bundle);
    }

    private static void a(String str, String str2, String str3, byte[] bArr) {
        Intent intent = new Intent();
        intent.setAction(b.K.concat(String.valueOf(str3)));
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10001);
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        bundle.putString("appid", str3);
        bundle.putString("payloadid", str2 + ":" + str);
        bundle.putString("packagename", e.f38030g);
        bundle.putByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD, bArr);
        intent.putExtras(bundle);
        intent.setPackage(e.f38035l.getPackageName());
        e.f38035l.sendBroadcast(intent, e.f38001ac);
    }

    private void a(boolean z11) {
        if (z11 && this.f38340g != null) {
            this.f38340g = null;
        }
        if (this.f38341i.get()) {
            return;
        }
        com.igexin.c.a.c.a.a("MsgServerSender|try to bind iservice", new Object[0]);
        try {
            this.f38341i.set(true);
            if (e.f38035l == null) {
                e.f38035l = f38337h;
            }
            Intent intent = new Intent(e.f38035l, (Class<?>) ServiceManager.getInstance().c(e.f38035l));
            intent.setType(e.f38035l.getPackageName());
            e.f38035l.bindService(intent, this, 1);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.e.a(f38333a, "bind iservice error = " + th2.toString());
            com.igexin.c.a.c.a.a(th2);
            this.f38341i.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(IBinder iBinder) {
        if (iBinder == null) {
            return false;
        }
        try {
            this.f38340g = new Messenger(iBinder);
            this.f38341i.set(false);
            return true;
        } finally {
            this.f38341i.set(false);
        }
    }
}

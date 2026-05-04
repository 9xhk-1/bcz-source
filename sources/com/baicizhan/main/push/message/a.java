package com.baicizhan.main.push.message;

import android.annotation.TargetApi;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.util.n;
import com.baicizhan.client.business.thrift.o;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.main.push.message.Message;
import com.baicizhan.online.notify.NotifyService;
import com.baicizhan.online.notify.PushConfirmParams;
import com.jiongji.andriod.card.R;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import q9.x;
import qb0.g;
import qb0.h;
import rh.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements sc.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f24779d = "MsgHandler";

    /* renamed from: e, reason: collision with root package name */
    public static a f24780e;

    /* renamed from: a, reason: collision with root package name */
    public String f24781a = "bcz_notify_01";

    /* renamed from: b, reason: collision with root package name */
    public h f24782b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f24783c = ch.a.f8619c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.push.message.a$a, reason: collision with other inner class name */
    public class C0321a extends g<Integer> {
        public C0321a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(a.f24779d, "", e11);
        }

        @Override // qb0.c
        public void onNext(Integer integer) {
            qb.c.i(a.f24779d, "upload %d", integer);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f24787a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f24788b;

        public d(final String val$id, final String val$channel) {
            this.f24787a = val$id;
            this.f24788b = val$channel;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            try {
                String str = "receive_self";
                if (x.r().p() == null) {
                    th.g.l(pb.a.a(), dc0.c.y7()).t6().p();
                    str = "receive_pull";
                }
                o.a(pb.a.a());
                NotifyService.Client client = (NotifyService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/notify");
                PushConfirmParams pushConfirmParams = new PushConfirmParams();
                pushConfirmParams.setManufacturer(Build.MANUFACTURER);
                pushConfirmParams.setMessage_id(this.f24787a);
                pushConfirmParams.setChannel(this.f24788b);
                pushConfirmParams.setModel(Build.MODEL);
                pushConfirmParams.setHint(str);
                client.push_confirm(pushConfirmParams);
                return null;
            } catch (Exception e11) {
                qb.c.c(a.f24779d, "", e11);
                return null;
            }
        }
    }

    public static a f() {
        if (f24780e == null) {
            synchronized (a.class) {
                try {
                    if (f24780e == null) {
                        f24780e = new a();
                    }
                } finally {
                }
            }
        }
        return f24780e;
    }

    public final void b(final String channel, final String id2) {
        rx.c.z2(new d(id2, channel)).w5(bc0.c.a()).r5(new c());
    }

    @TargetApi(26)
    public final void c(Context context, NotificationManager notificationManager) {
        androidx.media3.common.util.o.a();
        NotificationChannel a11 = n.a(this.f24781a, context.getString(R.string.notify_channel_title), 4);
        a11.enableLights(true);
        a11.enableVibration(true);
        a11.setLightColor(-65536);
        a11.setLockscreenVisibility(1);
        a11.setShowBadge(true);
        a11.setBypassDnd(true);
        a11.setVibrationPattern(new long[]{100, 200, 300, 400});
        notificationManager.createNotificationChannel(a11);
    }

    public final void d(Message msg) {
        h hVar = this.f24782b;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f24782b.unsubscribe();
        }
        this.f24782b = rx.c.M2(msg).w1(5L, TimeUnit.SECONDS).I3(tb0.a.a()).r5(new b());
    }

    public final void e(Message msg) {
        Message.LogInfo logInfo = msg.loginfo;
        if (logInfo == null) {
            qb.c.d(f24779d, "null loginfo", new Object[0]);
            return;
        }
        if (logInfo.tag == null) {
            logInfo.tag = "";
        }
        if (logInfo.days <= 0) {
            logInfo.days = 3;
        }
        oa.a.g().l(Integer.valueOf(msg.loginfo.days), msg.loginfo.tag).r5(new C0321a());
    }

    public final void g(Message msg) {
        if ("2".equals(msg.type)) {
            d(msg);
        } else if ("3".equals(msg.type)) {
            e(msg);
        }
    }

    public final void h(Message message) {
        Notification.Builder builder;
        Application a11 = pb.a.a();
        NotificationManager notificationManager = (NotificationManager) a11.getSystemService("notification");
        if (notificationManager == null) {
            qb.c.d(f24779d, "null == notificationManager", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c(a11, notificationManager);
            rh.d.a();
            builder = rh.c.a(a11, this.f24781a);
        } else {
            builder = new Notification.Builder(a11);
        }
        builder.setSmallIcon(R.drawable.ic_baicizhan_notification_small);
        builder.setSound(Uri.parse("android.resource://" + a11.getPackageName() + "/" + R.raw.noticetip));
        Intent intent = new Intent();
        intent.setAction("com.baicizhan.notifyclick");
        PendingIntent broadcast = PendingIntent.getBroadcast(a11, 0, intent, 0);
        qb.c.b(f24779d, "notification " + message.notification.description, new Object[0]);
        builder.setContentTitle("百词斩").setContentText(message.notification.description).setContentIntent(broadcast).setAutoCancel(true);
        notificationManager.notify(this.f24783c, builder.getNotification());
        this.f24783c = this.f24783c + 1;
    }

    @Override // sc.b
    public void onMessage(String msg, String channel) {
        Message message;
        qb.c.i(f24779d, "[msg,channel] [%s, %s]", msg == null ? "null" : msg, channel != null ? channel : "null");
        try {
            message = (Message) new JsonSerializer(Message.class).readFromJson(msg);
        } catch (Exception e11) {
            qb.c.c(f24779d, "", e11);
            message = null;
        }
        if (message == null || TextUtils.isEmpty(message.f24776id)) {
            qb.c.d(f24779d, "drop msg %s", msg);
            return;
        }
        b(channel, message.f24776id);
        if (e.d().b(message.f24776id)) {
            qb.c.i(f24779d, "msg has already been revc %s", message.f24776id);
        } else {
            e.d().a(message.f24776id);
            g(message);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g<Message> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(a.f24779d, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Message message) {
            a.this.h(message);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends g<Object> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(a.f24779d, "", e11);
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onNext(Object o11) {
        }
    }
}

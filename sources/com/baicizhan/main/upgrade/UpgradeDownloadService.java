package com.baicizhan.main.upgrade;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.FileProvider;
import androidx.media3.common.util.n;
import androidx.media3.common.util.o;
import com.baicizhan.client.framework.network.http.download.IDownloadManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import i9.j;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.j2;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UpgradeDownloadService extends Service {

    /* renamed from: i, reason: collision with root package name */
    public static final String f25075i = "UpgradeDownloadService";

    /* renamed from: j, reason: collision with root package name */
    public static final String f25076j = "com.jiongji.andriod.card.action.UPGRADE_STOP";

    /* renamed from: k, reason: collision with root package name */
    public static final String f25077k = "com.jiongji.andriod.card.action.UPGRADE_DOWNLOAD";

    /* renamed from: l, reason: collision with root package name */
    public static final String f25078l = "app_url";

    /* renamed from: m, reason: collision with root package name */
    public static final String f25079m = "app_md5";

    /* renamed from: n, reason: collision with root package name */
    public static final String f25080n = "app_path";

    /* renamed from: o, reason: collision with root package name */
    public static final String f25081o = "APKUpgradeManager";

    /* renamed from: p, reason: collision with root package name */
    public static final String f25082p = "www.baicizhan.com.upgrade.last_app_path";

    /* renamed from: q, reason: collision with root package name */
    public static final String f25083q = "www.baicizhan.com.upgrade.last_app_md5";

    /* renamed from: r, reason: collision with root package name */
    public static final String f25084r = "www.baicizhan.com.upgrade.last_app_status";

    /* renamed from: s, reason: collision with root package name */
    public static final int f25085s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f25086t = 2;

    /* renamed from: a, reason: collision with root package name */
    public String f25087a;

    /* renamed from: b, reason: collision with root package name */
    public String f25088b;

    /* renamed from: c, reason: collision with root package name */
    public String f25089c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManagerCompat f25090d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25091e = "bcz_download_01";

    /* renamed from: f, reason: collision with root package name */
    public boolean f25092f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.baicizhan.client.framework.network.http.download.a f25093g = new com.baicizhan.client.framework.network.http.download.a();

    /* renamed from: h, reason: collision with root package name */
    public b f25094h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int state);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f25098a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f25099b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f25100c = 2;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends Binder {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<UpgradeDownloadService> f25101a;

        public d(UpgradeDownloadService service) {
            this.f25101a = new WeakReference<>(service);
        }

        public void a(b l11) {
            UpgradeDownloadService upgradeDownloadService = this.f25101a.get();
            if (upgradeDownloadService != null) {
                upgradeDownloadService.f25094h = l11;
            }
        }
    }

    public static void p() {
        j.m(f25083q, "");
        j.m(f25082p, "");
    }

    public final boolean k() {
        return j.i(f25082p, "").equals(this.f25089c) && j.i(f25083q, "").equals(this.f25088b);
    }

    @TargetApi(26)
    public final void l(Context context, NotificationManagerCompat notificationManager) {
        o.a();
        NotificationChannel a11 = n.a("bcz_download_01", context.getString(R.string.notify_channel_download_title), 4);
        a11.enableLights(true);
        a11.enableVibration(true);
        a11.setLightColor(-65536);
        a11.setLockscreenVisibility(1);
        a11.setShowBadge(true);
        a11.setBypassDnd(true);
        a11.setVibrationPattern(new long[]{100, 200, 300, 400});
        a11.setSound(null, null);
        notificationManager.createNotificationChannel(a11);
    }

    public final NotificationCompat.Builder m() {
        return new NotificationCompat.Builder(this, "bcz_download_01").setSmallIcon(R.drawable.ic_baicizhan_notification_small).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_baicizhan)).setOnlyAlertOnce(true);
    }

    public final void n(String path) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addFlags(1);
        intent.setDataAndType(FileProvider.getUriForFile(this, "com.jiongji.andriod.card.fileprovider", new File(path)), "application/vnd.android.package-archive");
        startActivity(intent);
    }

    public void o() {
        this.f25093g.stop();
        qb.c.b(f25075i, "remove apk " + this.f25089c, new Object[0]);
        try {
            File file = new File(this.f25089c);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        qb.c.i(f25075i, "onBind", new Object[0]);
        return new d(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        qb.c.i(f25075i, "onCreate", new Object[0]);
        NotificationManagerCompat from = NotificationManagerCompat.from(this);
        this.f25090d = from;
        if (Build.VERSION.SDK_INT >= 26) {
            l(this, from);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        qb.c.i(f25075i, "onDestroy", new Object[0]);
        this.f25094h = null;
        this.f25093g.stop();
        this.f25093g.r(null);
        p();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String action = intent.getAction();
        qb.c.i(f25075i, "onStartCommand " + action, new Object[0]);
        action.getClass();
        if (action.equals(f25076j)) {
            p();
            this.f25093g.stop();
            this.f25090d.cancel(1);
            r(0);
            stopSelf();
            return 2;
        }
        if (!action.equals(f25077k)) {
            return 2;
        }
        this.f25087a = intent.getStringExtra("app_url");
        this.f25088b = intent.getStringExtra(f25079m);
        this.f25089c = intent.getStringExtra(f25080n);
        if (k()) {
            qb.c.b(f25075i, "resume downloading", new Object[0]);
            q();
            return 2;
        }
        if (this.f25093g.l() != IDownloadManager.State.Downloading) {
            o();
            q();
            return 2;
        }
        p();
        this.f25092f = true;
        this.f25093g.stop();
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        qb.c.i(f25075i, "onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    public final void q() {
        PendingIntent foregroundService;
        int i11 = Build.VERSION.SDK_INT;
        NotificationCompat.Builder m11 = m();
        if (i11 >= 26) {
            foregroundService = PendingIntent.getForegroundService(this, 0, new Intent(this, (Class<?>) UpgradeDownloadService.class).setAction(f25076j), 201326592);
            m11.addAction(new NotificationCompat.Action.Builder(R.drawable.ic_notification_close, "停止", foregroundService).build());
        } else {
            m11.addAction(new NotificationCompat.Action.Builder(R.drawable.ic_notification_close, "停止", PendingIntent.getService(this, 0, new Intent(this, (Class<?>) UpgradeDownloadService.class).setAction(f25076j), 201326592)).build());
        }
        m11.setContentTitle("百词斩下载准备中...").setOngoing(true).setWhen(System.currentTimeMillis()).setProgress(100, 0, false);
        this.f25093g.t(this.f25087a).b(this.f25089c).x(new fi.d(3000, 2.0f)).r(new a(m11)).start();
        startForeground(1, m11.build());
    }

    public final void r(int state) {
        b bVar = this.f25094h;
        if (bVar != null) {
            bVar.a(state);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements IDownloadManager.a {

        /* renamed from: a, reason: collision with root package name */
        public int f25095a = 0;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public final NotificationCompat.Builder f25096b;

        public a(@NonNull NotificationCompat.Builder builder) {
            this.f25096b = builder;
        }

        public final void a(boolean success) {
            PendingIntent pendingIntent;
            String str;
            int i11;
            if (success) {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.addFlags(1);
                intent.setDataAndType(FileProvider.getUriForFile(UpgradeDownloadService.this, "com.jiongji.andriod.card.fileprovider", new File(UpgradeDownloadService.this.f25089c)), "application/vnd.android.package-archive");
                pendingIntent = PendingIntent.getActivity(UpgradeDownloadService.this, 0, intent, 201326592);
                str = "下载完成，请点击安装";
                i11 = 100;
            } else {
                pendingIntent = null;
                str = "下载失败";
                i11 = 0;
            }
            NotificationCompat.Builder when = UpgradeDownloadService.this.m().setContentTitle(str).setProgress(100, i11, false).setOngoing(false).setAutoCancel(true).setWhen(System.currentTimeMillis());
            if (pendingIntent != null) {
                when.setContentIntent(pendingIntent);
            }
            UpgradeDownloadService.this.f25090d.notify(2, when.build());
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onComplete(boolean success, String target, int errCode) {
            boolean i11 = xb.a.h().i();
            qb.c.b(UpgradeDownloadService.f25075i, "onComplete: " + success + j2.O + errCode + j2.O + i11, new Object[0]);
            UpgradeDownloadService.this.stopForeground(true);
            if (success && this.f25095a == 100) {
                if (i11) {
                    UpgradeDownloadService upgradeDownloadService = UpgradeDownloadService.this;
                    upgradeDownloadService.n(upgradeDownloadService.f25089c);
                } else {
                    a(true);
                }
                UpgradeDownloadService.this.r(2);
            } else {
                if (i11) {
                    g.i("下载失败，请稍后重试", 0);
                } else {
                    a(false);
                }
                j.m(UpgradeDownloadService.f25083q, "");
                j.m(UpgradeDownloadService.f25082p, "");
                UpgradeDownloadService.this.r(0);
            }
            UpgradeDownloadService.this.stopSelf();
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onPause() {
            qb.c.b(UpgradeDownloadService.f25075i, "onPause", new Object[0]);
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onProgress(int progress) {
            qb.c.b(UpgradeDownloadService.f25075i, "onProgress " + progress, new Object[0]);
            this.f25095a = progress;
            if (progress < 100) {
                UpgradeDownloadService.this.f25090d.notify(1, this.f25096b.setProgress(100, progress, false).setContentTitle(String.format(Locale.US, "正在下载百词斩，进度%d%%", Integer.valueOf(progress))).build());
            }
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onStart() {
            qb.c.b(UpgradeDownloadService.f25075i, "onStart", new Object[0]);
            j.m(UpgradeDownloadService.f25083q, UpgradeDownloadService.this.f25088b);
            j.m(UpgradeDownloadService.f25082p, UpgradeDownloadService.this.f25089c);
            UpgradeDownloadService.this.r(1);
            UpgradeDownloadService.this.f25090d.notify(1, this.f25096b.setContentTitle("正在下载百词斩，进度0%").build());
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onStop() {
            qb.c.b(UpgradeDownloadService.f25075i, "onStop", new Object[0]);
            if (UpgradeDownloadService.this.f25092f) {
                UpgradeDownloadService.this.f25092f = false;
                UpgradeDownloadService.this.q();
            }
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onResume() {
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onStartDecompress() {
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onGroupComplete(boolean success, List<String> arg1, int arg2) {
        }
    }
}

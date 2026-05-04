package com.baicizhan.client.business.managers.upgrade;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.baicizhan.client.business.managers.upgrade.UpgradeManager;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.util.ChannelUtils;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.VersionUtils;
import com.baicizhan.online.bcz_system_api.AppBetaUpdateRequest;
import com.baicizhan.online.bcz_system_api.AppBetaUpdateResult;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import java.io.File;
import ma.l;
import org.apache.thrift.TException;
import org.junit.jupiter.api.j2;
import qb.c;
import xb.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UpgradeManager {

    /* renamed from: f, reason: collision with root package name */
    public static String f16463f = "UpgradeManager";

    /* renamed from: g, reason: collision with root package name */
    public static final String f16464g = "android";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16465h = "upgrade_download_id";

    /* renamed from: b, reason: collision with root package name */
    public long f16467b = -1;

    /* renamed from: c, reason: collision with root package name */
    public File f16468c = null;

    /* renamed from: d, reason: collision with root package name */
    public BroadcastReceiver f16469d = null;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f16470e = Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final DownloadManager f16466a = (DownloadManager) pb.a.a().getSystemService("download");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum UpdateType {
        NONE,
        NEW,
        APPLE_TEST_FLIGHT;

        public static UpdateType typeOf(int v11) {
            return v11 != 1 ? v11 != 2 ? NONE : APPLE_TEST_FLIGHT : NEW;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends BroadcastReceiver {
        public final void a(@NonNull Context context, @NonNull File file) {
            UpgradeManager.this.f16466a.addCompletedDownload(context.getResources().getString(R.string.app_name), "下载已完成", false, "application/vnd.android.package-archive", file.getAbsolutePath(), file.length(), true);
            l.a("notify-popup", ma.a.L3);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            boolean i11 = xb.a.h().i();
            String str = UpgradeManager.f16463f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("action: ");
            sb2.append(action);
            sb2.append(", foreground: ");
            sb2.append(i11);
            sb2.append(", target: ");
            sb2.append(UpgradeManager.this.f16468c);
            sb2.append(j2.O);
            sb2.append(UpgradeManager.this.j() != null);
            c.b(str, sb2.toString(), new Object[0]);
            if (action.equals("android.intent.action.DOWNLOAD_COMPLETE") && intent.getLongExtra("extra_download_id", 0L) == UpgradeManager.this.f16467b) {
                UpgradeManager.this.f16470e = Boolean.FALSE;
                if (DeviceUtil.isMeizu()) {
                    if (UpgradeManager.this.f16468c == null || !UpgradeManager.this.f16468c.exists() || UpgradeManager.this.j() == null) {
                        return;
                    }
                    UpgradeManager upgradeManager = UpgradeManager.this;
                    upgradeManager.n(context, upgradeManager.f16468c);
                    return;
                }
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(UpgradeManager.this.f16467b);
                Cursor query2 = UpgradeManager.this.f16466a.query(query);
                if (query2.moveToFirst()) {
                    if (8 == query2.getInt(query2.getColumnIndex("status"))) {
                        int columnIndex = query2.getColumnIndex("local_uri");
                        if (columnIndex < 0) {
                            c.d(UpgradeManager.f16463f, "COLUMN_LOCAL_URI index %d error", Integer.valueOf(columnIndex));
                            return;
                        }
                        String string = query2.getString(columnIndex);
                        File file = string != null ? new File(Uri.parse(string).getPath()) : null;
                        if (file != null && UpgradeManager.this.j() != null) {
                            if (i11) {
                                try {
                                    UpgradeManager.this.n(context, file);
                                } catch (Exception e11) {
                                    c.c(UpgradeManager.f16463f, "foreground auto install: ", e11);
                                    a(context, file);
                                }
                            } else {
                                c.b(UpgradeManager.f16463f, "pending downloaded: " + file.getAbsolutePath(), new Object[0]);
                                a(context, file);
                            }
                        }
                    }
                    nc.b.b().n(UpgradeManager.f16465h, -1L);
                }
            }
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final UpgradeManager f16472a = new UpgradeManager();
    }

    public static /* synthetic */ AppBetaUpdateResult a(AppBetaUpdateRequest appBetaUpdateRequest, BczSystemApiService.Client client) {
        try {
            return client.get_app_beta_update_info(appBetaUpdateRequest);
        } catch (TException e11) {
            throw vb0.a.c(e11);
        }
    }

    public static UpgradeManager m() {
        return b.f16472a;
    }

    public rx.c<AppBetaUpdateResult> h() {
        Context j11 = j();
        final AppBetaUpdateRequest appBetaUpdateRequest = new AppBetaUpdateRequest();
        appBetaUpdateRequest.setDevice_id(o.a(j11));
        appBetaUpdateRequest.setDevice_manufacturer(Build.MANUFACTURER);
        appBetaUpdateRequest.setDevice_model(Build.MODEL);
        appBetaUpdateRequest.setOs_name("android");
        appBetaUpdateRequest.setOs_sdk(Integer.toString(Build.VERSION.SDK_INT));
        appBetaUpdateRequest.setApp_name("baicizhan");
        appBetaUpdateRequest.setApp_channel(ChannelUtils.getChannel(j11));
        Pair<String, Integer> versionInfo = VersionUtils.getVersionInfo(j11);
        appBetaUpdateRequest.setShort_version((String) versionInfo.first);
        appBetaUpdateRequest.setLong_version(((Integer) versionInfo.second).intValue());
        return p.b("/rpc/bcz_system").c3(new wb0.p() { // from class: ba.a
            @Override // wb0.p
            public final Object call(Object obj) {
                return UpgradeManager.a(AppBetaUpdateRequest.this, (BczSystemApiService.Client) obj);
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
    }

    public void i() {
        c.b(f16463f, "destroy", new Object[0]);
        s();
        com.baicizhan.client.business.thrift.c.b().b(f16463f);
    }

    public final Context j() {
        return pb.a.a();
    }

    public final String k(String version) {
        return String.format("baicizhan_%s.apk", version);
    }

    public final File l(Context context, String version) {
        return new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + File.separator + k(version));
    }

    public final void n(Context context, File file) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addFlags(1);
        intent.setDataAndType(FileProvider.getUriForFile(context, "com.jiongji.andriod.card.fileprovider", file), "application/vnd.android.package-archive");
        context.startActivity(intent);
        l.a("notify-popup", ma.a.K3);
    }

    public Boolean o() {
        return this.f16470e;
    }

    public final void p(Context context) {
        if (this.f16469d == null) {
            a aVar = new a();
            this.f16469d = aVar;
            ContextCompat.registerReceiver(context, aVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        }
    }

    public final void q() {
        long j11 = nc.b.b().getLong(f16465h, -1L);
        if (-1 == j11) {
            return;
        }
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(j11);
        Cursor query2 = this.f16466a.query(query);
        boolean moveToFirst = query2.moveToFirst();
        query2.close();
        if (moveToFirst) {
            this.f16466a.remove(j11);
        }
        nc.b.b().n(f16465h, -1L);
    }

    public void r(final AppBetaUpdateResult result) {
        c.i(f16463f, "startDownloading  %s", result.getNew_version());
        Context j11 = j();
        if (j11 == null) {
            return;
        }
        q();
        p(j11);
        File l11 = l(j11, result.getNew_version());
        this.f16468c = l11;
        if (l11.exists()) {
            c.b(f16463f, "delete target: " + this.f16468c.delete(), new Object[0]);
        }
        c.b(f16463f, "download " + result.getVersion_url() + j2.O + result.getNew_version(), new Object[0]);
        this.f16467b = this.f16466a.enqueue(new DownloadManager.Request(Uri.parse(result.getVersion_url())).setTitle(j11.getString(R.string.app_name)).setDestinationUri(Uri.fromFile(this.f16468c)).setNotificationVisibility(0).setAllowedNetworkTypes(3).setAllowedOverMetered(true).setAllowedOverRoaming(true));
        nc.b.b().n(f16465h, this.f16467b);
        c.i(f16463f, "download id %s", Long.valueOf(this.f16467b));
        this.f16470e = Boolean.TRUE;
    }

    public final void s() {
        BroadcastReceiver broadcastReceiver;
        Context j11 = j();
        if (j11 == null || (broadcastReceiver = this.f16469d) == null) {
            return;
        }
        j11.unregisterReceiver(broadcastReceiver);
    }
}

package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* loaded from: classes8.dex */
public class hc implements XMPushService.n {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f45708a = false;

    /* renamed from: a, reason: collision with other field name */
    private int f495a;

    /* renamed from: a, reason: collision with other field name */
    private Context f496a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45709b;

    public hc(Context context) {
        this.f496a = context;
    }

    private String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f496a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a, reason: collision with other method in class */
    public void mo6008a() {
        a(this.f496a);
        if (this.f45709b && a()) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            hg a11 = hf.a(this.f496a).a();
            if (a(a11)) {
                f45708a = true;
                hd.a(this.f496a, a11);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m5639a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
            }
        }
    }

    private void a(Context context) {
        this.f45709b = com.xiaomi.push.service.ba.a(context).a(hm.TinyDataUploadSwitch.a(), true);
        int a11 = com.xiaomi.push.service.ba.a(context).a(hm.TinyDataUploadFrequency.a(), 7200);
        this.f495a = a11;
        this.f495a = Math.max(60, a11);
    }

    public static void a(boolean z11) {
        f45708a = z11;
    }

    private boolean a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f496a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f495a);
    }

    private boolean a(hg hgVar) {
        if (!bi.b(this.f496a) || hgVar == null || TextUtils.isEmpty(a(this.f496a.getPackageName())) || !new File(this.f496a.getFilesDir(), "tiny_data.data").exists() || f45708a) {
            return false;
        }
        return !com.xiaomi.push.service.ba.a(this.f496a).a(hm.ScreenOnOrChargingTinyDataUploadSwitch.a(), false) || i.m6069a(this.f496a) || i.m6071b(this.f496a);
    }
}

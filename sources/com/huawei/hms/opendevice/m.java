package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.support.log.HMSLog;
import java.util.Map;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36099b;

    public m(Context context, String str) {
        this.f36098a = context;
        this.f36099b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean b11;
        boolean d11;
        String c11;
        if (!p.b()) {
            HMSLog.d("ReportAaidToken", "Not HW Phone.");
            return;
        }
        b11 = n.b(this.f36098a);
        if (b11) {
            return;
        }
        String a11 = o.a(this.f36098a);
        if (TextUtils.isEmpty(a11)) {
            HMSLog.w("ReportAaidToken", "AAID is empty.");
            return;
        }
        d11 = n.d(this.f36098a, a11, this.f36099b);
        if (!d11) {
            HMSLog.d("ReportAaidToken", "This time need not report.");
            return;
        }
        String string = oq.a.b(this.f36098a).getString(TtmlNode.TAG_REGION);
        if (TextUtils.isEmpty(string)) {
            HMSLog.i("ReportAaidToken", "The data storage region is empty.");
            return;
        }
        String a12 = e.a(this.f36098a, "com.huawei.hms.opendevicesdk", Logger.ROOT_LOGGER_NAME, null, string);
        if (TextUtils.isEmpty(a12)) {
            return;
        }
        c11 = n.c(this.f36098a, a11, this.f36099b);
        n.b(this.f36098a, d.a(this.f36098a, a12 + "/rest/appdata/v1/aaid/report", c11, (Map<String, String>) null), a11, this.f36099b);
    }
}

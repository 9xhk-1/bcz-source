package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.appgallery.markethomecountrysdk.api.HomeCountryApi;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.updatesdk.service.otaupdate.f;
import fr.n;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private String f36899a;

    /* renamed from: b, reason: collision with root package name */
    private String f36900b;

    private String d(Context context) {
        d();
        String a11 = f.e().a();
        if (!TextUtils.isEmpty(this.f36899a) && TextUtils.equals(this.f36899a, a11) && !TextUtils.isEmpty(this.f36900b)) {
            com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url from cache!" + b(this.f36900b));
            return this.f36900b;
        }
        this.f36899a = a11;
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setSerCountry(a11);
        this.f36900b = new GrsClient(context, grsBaseInfo).synGetGrsUrl(a(), Logger.ROOT_LOGGER_NAME);
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url from GRS_SDK Success!" + b(this.f36900b));
        if (!TextUtils.isEmpty(this.f36900b)) {
            return this.f36900b;
        }
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url is default url");
        return a(context);
    }

    private void e(Context context) {
        String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(context);
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK use grs issue country code");
        f.e().a(issueCountryCode);
    }

    public abstract String a();

    public abstract String a(Context context);

    public void a(String str) {
    }

    public abstract void a(List<String> list);

    public abstract String b();

    public String b(Context context) {
        if (!TextUtils.equals("SECURITY", com.huawei.updatesdk.a.a.c.a.a.b.a())) {
            return d(context);
        }
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url is security url");
        return a(context);
    }

    public abstract int c();

    public abstract boolean c(Context context);

    private String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(46));
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("AbstractTaskInit", e11.toString());
            return null;
        }
    }

    private void d() {
        String str;
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        try {
            String str2 = (String) n.c(HomeCountryApi.getHomeCountry(a11, "UpdateSDK", false));
            if (TextUtils.isEmpty(str2)) {
                e(a11);
            } else {
                f.e().a(str2);
            }
        } catch (InterruptedException unused) {
            str = "get country code InterruptedException";
            com.huawei.updatesdk.a.a.a.a("AbstractTaskInit", str);
            e(a11);
        } catch (ExecutionException unused2) {
            str = "get country code ExecutionException.";
            com.huawei.updatesdk.a.a.a.a("AbstractTaskInit", str);
            e(a11);
        }
    }
}

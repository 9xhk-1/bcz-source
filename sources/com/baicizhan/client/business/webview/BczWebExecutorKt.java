package com.baicizhan.client.business.webview;

import android.app.Activity;
import android.content.Context;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.BczWebDirector;
import com.baicizhan.client.business.webview.OpenWebViewOption;
import com.baicizhan.client.business.webview.ui.WebWorker;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBczWebExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczWebExecutor.kt\ncom/baicizhan/client/business/webview/BczWebExecutorKt\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,125:1\n35#2:126\n35#2:127\n*S KotlinDebug\n*F\n+ 1 BczWebExecutor.kt\ncom/baicizhan/client/business/webview/BczWebExecutorKt\n*L\n91#1:126\n116#1:127\n*E\n"})
/* loaded from: classes4.dex */
public final class BczWebExecutorKt {

    @k
    public static final String URL_COURSE = "https://learn.baicizhan.com/home-learning/?tab=1&webview.option=%7B%22navigationBar%22%3A%7B%22visible%22%3Afalse%7D%7D";

    @k
    public static final String URL_ICP = "https://beian.miit.gov.cn/";

    @k
    public static final String URL_JOIN_US = "https://join.baicizhan.com/main_2019_mobile";

    @k
    public static final String URL_MY_DEVICES = "https://learn.baicizhan.com/vld/home";

    @k
    public static final String URL_MY_LIBRARY = "https://learn.baicizhan.com/librarys/";

    @k
    public static final String URL_PK = "https://pk.baicizhan.com/pages/challenge/index.html";

    @k
    public static final String URL_WEB_JS_TEST_LAB = "https://sss.baicizhan.com/native-jsapi-lab/api";

    @w00.k
    public static final void startFullScreenWeb(@l Context context) {
        startFullScreenWeb$default(context, null, 0, 0, 14, null);
    }

    public static /* synthetic */ void startFullScreenWeb$default(Context context, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        startFullScreenWeb(context, str, i11, i12);
    }

    @w00.k
    public static final boolean startNormalWeb(@l Context context, @l String str) {
        return startNormalWeb$default(context, str, null, false, 0, null, 60, null);
    }

    public static /* synthetic */ boolean startNormalWeb$default(Context context, String str, String str2, boolean z11, int i11, WebWorker webWorker, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        boolean z12 = (i12 & 8) != 0 ? false : z11;
        int i13 = (i12 & 16) != 0 ? 0 : i11;
        if ((i12 & 32) != 0) {
            webWorker = null;
        }
        return startNormalWeb(context, str, str3, z12, i13, webWorker);
    }

    public static final void startWebForResult(@l Activity activity, @k String url, int i11, boolean z11, int i12) {
        g0.p(url, "url");
        if (activity != null) {
            new BczWebDirector.Builder().setDefaultUrl(url).setFixedClosed(z11).setUrlStrategy(i12).setLeftIn(true).build().goToWebForResult(activity, i11);
        }
    }

    public static /* synthetic */ void startWebForResult$default(Activity activity, String str, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        if ((i13 & 16) != 0) {
            i12 = 0;
        }
        startWebForResult(activity, str, i11, z11, i12);
    }

    @w00.k
    public static final void startWebLeftIn(@l Activity activity, @l String str) {
        startWebLeftIn$default(activity, str, null, 4, null);
    }

    public static /* synthetic */ void startWebLeftIn$default(Activity activity, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        startWebLeftIn(activity, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 startWebLeftIn$lambda$0(String str, Activity thisActivity, String thisUrl) {
        g0.p(thisActivity, "thisActivity");
        g0.p(thisUrl, "thisUrl");
        new BczWebDirector.Builder().setTitle(str).setDefaultUrl(thisUrl).setUrlStrategy(0).setLeftIn(true).build().goToWeb(thisActivity);
        return g2.f100423a;
    }

    @w00.k
    public static final void startFullScreenWeb(@l Context context, @k String url) {
        g0.p(url, "url");
        startFullScreenWeb$default(context, url, 0, 0, 12, null);
    }

    @w00.k
    public static final boolean startNormalWeb(@l Context context, @l String str, @k String title) {
        g0.p(title, "title");
        return startNormalWeb$default(context, str, title, false, 0, null, 56, null);
    }

    @w00.k
    public static final void startWebLeftIn(@l Activity activity, @l String str, @k final String title) {
        g0.p(title, "title");
        KotlinExtKt.allNotNullLet(activity, str, new p() { // from class: com.baicizhan.client.business.webview.f
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 startWebLeftIn$lambda$0;
                startWebLeftIn$lambda$0 = BczWebExecutorKt.startWebLeftIn$lambda$0(title, (Activity) obj, (String) obj2);
                return startWebLeftIn$lambda$0;
            }
        });
    }

    @w00.k
    public static final void startFullScreenWeb(@l Context context, @k String url, int i11) {
        g0.p(url, "url");
        startFullScreenWeb$default(context, url, i11, 0, 8, null);
    }

    @w00.k
    public static final boolean startNormalWeb(@l Context context, @l String str, @k String title, boolean z11) {
        g0.p(title, "title");
        return startNormalWeb$default(context, str, title, z11, 0, null, 48, null);
    }

    @w00.k
    public static final void startFullScreenWeb(@l Context context, @k String url, int i11, int i12) {
        g0.p(url, "url");
        if (context != null) {
            OrientationOption orientationOption = new OrientationOption(i11);
            new BczWebDirector.Builder().setDefaultUrl(url).setWebOption(new OpenWebViewOption.Builder().setOrientation(orientationOption).setNavigationBar(new NavigationBarOption(false, null, null, 6, null)).build()).setUrlStrategy(i12).build().goToWeb(context);
        }
    }

    @w00.k
    public static final boolean startNormalWeb(@l Context context, @l String str, @k String title, boolean z11, int i11) {
        g0.p(title, "title");
        return startNormalWeb$default(context, str, title, z11, i11, null, 32, null);
    }

    @w00.k
    public static final boolean startNormalWeb(@l Context context, @l String str, @k String title, boolean z11, int i11, @l WebWorker webWorker) {
        g0.p(title, "title");
        if (context == null || str == null) {
            return false;
        }
        new BczWebDirector.Builder().setTitle(title).setDefaultUrl(str).setUrlStrategy(i11).setAnonymous(z11).setWebWorker(webWorker).build().goToWeb(context);
        return true;
    }
}

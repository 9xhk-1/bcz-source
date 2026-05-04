package com.baicizhan.client.business.webview.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.home.experiment.q0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nNavigatorMgr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorMgr.kt\ncom/baicizhan/client/business/webview/sdk/NavigatorMgr\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n29#2:53\n1#3:54\n*S KotlinDebug\n*F\n+ 1 NavigatorMgr.kt\ncom/baicizhan/client/business/webview/sdk/NavigatorMgr\n*L\n22#1:53\n*E\n"})
/* loaded from: classes4.dex */
public final class NavigatorMgr {

    @k
    public static final String DATA_EXIT = "resume_to_exit";

    @k
    private static final String _bczProtocol = "bcz://";

    @l
    private static Navigator navigator;

    @k
    public static final NavigatorMgr INSTANCE = new NavigatorMgr();
    private static final String TAG = NavigatorMgr.class.getSimpleName();
    public static final int $stable = 8;

    private NavigatorMgr() {
    }

    private final Uri compatible(Uri uri) {
        if (!g0.g(uri.getHost(), "com.baicizhan.home") || !q0.f21394a.b()) {
            return uri;
        }
        Uri build = uri.buildUpon().path("/player").build();
        g0.o(build, "build(...)");
        return build;
    }

    public static /* synthetic */ boolean navToWebOrNaive$default(NavigatorMgr navigatorMgr, Context context, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        return navigatorMgr.navToWebOrNaive(context, str, i11);
    }

    private final boolean navigateTo(Uri uri, Context context, int i11) {
        try {
            if (context instanceof FragmentActivity) {
                Intent intent = new Intent(jc.a.f64014a);
                intent.setData(uri);
                ((FragmentActivity) context).startActivityForResult(intent, i11);
                return true;
            }
            Intent intent2 = new Intent(jc.a.f64014a);
            intent2.setData(uri);
            context.startActivity(intent2);
            return true;
        } catch (Exception e11) {
            qb.c.c(TAG, "", e11);
            return false;
        }
    }

    public static /* synthetic */ boolean navigatorTo$default(NavigatorMgr navigatorMgr, String str, Context context, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        return navigatorMgr.navigatorTo(str, context, i11);
    }

    @l
    public final Navigator getNavigator() {
        return navigator;
    }

    public final boolean navToWebOrNaive(@k Context context, @k String url, int i11) {
        g0.p(context, "context");
        g0.p(url, "url");
        return f0.J2(url, _bczProtocol, false, 2, null) ? navigatorTo(url, context, i11) : BczWebExecutorKt.startNormalWeb$default(context, url, null, false, 0, null, 60, null);
    }

    public final boolean navigatorTo(@k String url, @k Context context, int i11) {
        g0.p(url, "url");
        g0.p(context, "context");
        Uri compatible = compatible(Uri.parse(url));
        if (INSTANCE.navigateTo(compatible, context, i11)) {
            return true;
        }
        Navigator navigator2 = navigator;
        if (navigator2 != null) {
            return navigator2.navigator(compatible, context);
        }
        return false;
    }

    public final void setNavigator(@l Navigator navigator2) {
        navigator = navigator2;
    }
}

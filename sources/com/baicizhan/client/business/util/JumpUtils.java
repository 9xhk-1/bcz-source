package com.baicizhan.client.business.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.device.MeizuAdaptActivity;
import com.baicizhan.client.business.store.NewMallActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class JumpUtils {
    public static final String TAG = "JumpUtils";
    private static final String TAOBAO_PACKAGE_NAME = "com.taobao";

    public static /* synthetic */ g2 c(Context context, Intent intent) {
        if (DeviceUtil.isMeizu()) {
            MeizuAdaptActivity.I0(context, intent);
        } else {
            context.startActivity(intent);
        }
        return g2.f100423a;
    }

    private static boolean doRedirectToAppWithScheme(@NonNull Context context, String url) {
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(url));
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e11) {
            redirectToBrowser(context, "https://baicizhan.tmall.com/");
            qb.c.h(TAG, "", e11);
            return false;
        }
    }

    public static boolean doRedirectToBrowser(@NonNull Context context, String url) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(url));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e11) {
            qb.c.h(TAG, "doRedirectToBrowser failed for url: " + url, e11);
            return false;
        }
    }

    public static /* synthetic */ g2 e(Context context, String str) {
        doRedirectToAppWithScheme(context, str);
        return g2.f100423a;
    }

    public static /* synthetic */ g2 f(Context context, String str) {
        doRedirectToBrowser(context, str);
        return g2.f100423a;
    }

    public static boolean redirectToAppWithScheme(@NonNull final Context context, final String url) {
        kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(context, new x00.a() { // from class: com.baicizhan.client.business.util.j
            @Override // x00.a
            public final Object invoke() {
                return JumpUtils.e(context, url);
            }
        }, new x00.a() { // from class: com.baicizhan.client.business.util.k
            @Override // x00.a
            public final Object invoke() {
                g2 g2Var;
                g2Var = g2.f100423a;
                return g2Var;
            }
        });
        if (!(context instanceof FragmentActivity)) {
            return doRedirectToAppWithScheme(context, url);
        }
        mc.a.n((FragmentActivity) context, thirdAppDialog, "show-dialog");
        return true;
    }

    public static boolean redirectToBrowser(@NonNull final Context context, final String url) {
        kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(context, new x00.a() { // from class: com.baicizhan.client.business.util.l
            @Override // x00.a
            public final Object invoke() {
                return JumpUtils.f(context, url);
            }
        }, new x00.a() { // from class: com.baicizhan.client.business.util.m
            @Override // x00.a
            public final Object invoke() {
                g2 g2Var;
                g2Var = g2.f100423a;
                return g2Var;
            }
        });
        if (!(context instanceof FragmentActivity)) {
            return doRedirectToBrowser(context, url);
        }
        mc.a.n((FragmentActivity) context, thirdAppDialog, "show-dialog");
        return true;
    }

    public static boolean redirectToNativeStore(@NonNull Context context, String mallUrl) {
        if (TextUtils.isEmpty(mallUrl)) {
            NewMallActivity.N0(context, q9.x.r().p());
            return true;
        }
        NewMallActivity.O0(context, q9.x.r().p(), mallUrl);
        return true;
    }

    public static void redirectToPISetting(@NonNull Context context) {
        context.startActivity(new Intent("baicizhan.intent.action.PISET"));
    }

    public static boolean redirectToTaobaoApp(@NonNull final Context context, String url) {
        final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(url));
        ResolveInfo resolveInfo = null;
        for (ResolveInfo resolveInfo2 : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo2.activityInfo.packageName.startsWith(TAOBAO_PACKAGE_NAME)) {
                resolveInfo = resolveInfo2;
            }
        }
        if (resolveInfo == null) {
            return false;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        intent.addFlags(268435456);
        kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(context, new x00.a() { // from class: com.baicizhan.client.business.util.h
            @Override // x00.a
            public final Object invoke() {
                return JumpUtils.c(context, intent);
            }
        }, new x00.a() { // from class: com.baicizhan.client.business.util.i
            @Override // x00.a
            public final Object invoke() {
                g2 g2Var;
                g2Var = g2.f100423a;
                return g2Var;
            }
        });
        if (context instanceof FragmentActivity) {
            mc.a.n((FragmentActivity) context, thirdAppDialog, "show-dialog");
            return true;
        }
        if (DeviceUtil.isMeizu()) {
            MeizuAdaptActivity.I0(context, intent);
            return true;
        }
        context.startActivity(intent);
        return true;
    }
}

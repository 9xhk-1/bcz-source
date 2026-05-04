package c9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import b9.g;
import b9.j;
import com.baicizhan.client.business.auth.QQAuthHelper;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import com.tencent.connect.common.Constants;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mobileqq.openpay.api.OpenApiFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8369a = "ThirdpartyAuthDelegate";

    /* renamed from: b, reason: collision with root package name */
    public static ThirdPartyUserInfo f8370b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8371c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8372d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f8373e = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void onCancel();

        void onComplete();

        void onError(Throwable throwable);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void onCancel();

        void onComplete(WeixinAuthHelper.g resp);

        void onError(Throwable throwable);
    }

    public static void a() {
        f8370b = null;
    }

    public static boolean b(Context context) {
        return OpenApiFactory.getInstance(context, b9.a.f6456e).isMobileQQInstalled();
    }

    public static boolean c(Context context) {
        qb.c.i(f8369a, "isQQInstalled", new Object[0]);
        return OpenApiFactory.getInstance(context, b9.a.f6456e).isMobileQQInstalled() || d(context);
    }

    public static boolean d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(Constants.PACKAGE_TIM, 0);
            if (packageInfo != null) {
                if (!TextUtils.isEmpty(packageInfo.versionName)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e11) {
            qb.c.c(f8369a, "", e11);
            return false;
        } catch (Exception e12) {
            qb.c.c(f8369a, "", e12);
            return false;
        }
    }

    public static boolean e(Context context) {
        return WBAPIFactory.createWBAPI(context).isWBAppInstalled();
    }

    public static boolean f(Context context) {
        qb.c.i(f8369a, "isWeixinInstalled", new Object[0]);
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, b9.a.f6458g, false);
        createWXAPI.registerApp(b9.a.f6458g);
        return createWXAPI.isWXAppInstalled();
    }

    public static void g(Activity activity, InterfaceC0141a callback) {
        f8373e = true;
        f8371c = false;
        f8372d = false;
        g.f6472a.e(activity, callback);
    }

    public static void h(Activity activity, InterfaceC0141a callback) {
        f8371c = true;
        f8372d = false;
        f8373e = false;
        QQAuthHelper.h().j(activity, callback);
    }

    public static void i(Activity activity, InterfaceC0141a callback) {
        f8371c = false;
        f8372d = true;
        f8373e = false;
        j.h().f(activity, callback);
    }

    public static void j(Activity activity, InterfaceC0141a callback) {
        f8371c = false;
        f8372d = false;
        WeixinAuthHelper.A().E();
        WeixinAuthHelper.A().l(activity, callback);
    }

    public static void k(final Context activity, final ShareChannel media, final b callback) {
        if (media == ShareChannel.WEIXIN) {
            WeixinAuthHelper.A().E();
            if (callback != null) {
                callback.onComplete();
                return;
            }
            return;
        }
        if (media == ShareChannel.QQ) {
            QQAuthHelper.h().k(activity);
            if (callback != null) {
                callback.onComplete();
                return;
            }
            return;
        }
        if (media == ShareChannel.WEIBO) {
            j.h().k();
            if (callback != null) {
                callback.onComplete();
            }
        }
    }

    public static void l(Activity activity, int requestCode, int resultCode, Intent data) {
        if (f8372d) {
            j.h().l(activity, requestCode, resultCode, data);
        }
        if (f8371c) {
            QQAuthHelper.h().l(requestCode, resultCode, data);
        }
        if (f8373e) {
            g.f6472a.d(requestCode, resultCode, data);
        }
    }

    public static void m(ThirdPartyUserInfo userInfo) {
        f8370b = userInfo;
    }

    public static void n(Activity activity, int scene, String reserved, c callback) {
        WeixinAuthHelper.A().G();
        WeixinAuthHelper.A().m(activity, scene, reserved, callback);
    }

    public static ThirdPartyUserInfo o() {
        ThirdPartyUserInfo thirdPartyUserInfo = f8370b;
        f8370b = null;
        return thirdPartyUserInfo;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: c9.a$a, reason: collision with other inner class name */
    public interface InterfaceC0141a {
        void onCancel();

        void onComplete(ThirdPartyUserInfo thirdPartyUserInfo);

        void onError(Throwable throwable);

        default void onStart() {
        }
    }
}

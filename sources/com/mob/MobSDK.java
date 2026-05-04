package com.mob;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mob.commons.InternationalDomain;
import com.mob.commons.MobProduct;
import com.mob.commons.n;
import com.mob.commons.o;
import com.mob.commons.q;
import com.mob.commons.r;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes7.dex */
public class MobSDK implements PublicMemberKeeper {
    public static final int CHANNEL_APICLOUD = 5;
    public static final int CHANNEL_COCOS = 1;
    public static final int CHANNEL_FLUTTER = 4;
    public static final int CHANNEL_JS = 3;
    public static final int CHANNEL_NATIVE = 0;
    public static final int CHANNEL_QUICKSDK = 6;
    public static final int CHANNEL_UNIAPP = 7;
    public static final int CHANNEL_UNITY = 2;
    public static final int SDK_VERSION_CODE;
    public static final String SDK_VERSION_NAME;

    /* renamed from: a, reason: collision with root package name */
    private static volatile Context f40032a;

    static {
        int i11;
        String str = "1.0.0";
        try {
            str = "2022-07-29".replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".");
            i11 = Integer.parseInt("2022-07-29".replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
        } catch (Throwable unused) {
            i11 = 1;
        }
        SDK_VERSION_CODE = i11;
        SDK_VERSION_NAME = str;
    }

    @Deprecated
    public static void canIContinueBusiness(final MobProduct mobProduct, Object obj, final Object obj2) {
        if (obj2 == null) {
            throw new IllegalArgumentException("callback can not be null");
        }
        new Thread(new Runnable() { // from class: com.mob.MobSDK.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MobProduct.this == null) {
                        ReflectHelper.invokeInstanceMethod(obj2, "onFailure", new Throwable("MobProduct can not be null"));
                    } else {
                        ReflectHelper.invokeInstanceMethod(obj2, "onComplete", Boolean.TRUE);
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().e(th2);
                    try {
                        ReflectHelper.invokeInstanceMethod(obj2, "onFailure", th2);
                    } catch (Throwable unused) {
                    }
                }
            }
        }).start();
    }

    public static boolean checkForceHttps() {
        return n.f40394d;
    }

    @Deprecated
    public static String checkRequestUrl(String str) {
        return r.a(str);
    }

    public static boolean checkV6() {
        return n.f40396f;
    }

    @Deprecated
    public static String dynamicModifyUrl(String str) {
        return r.a(str);
    }

    public static String getAppSecret() {
        return n.f40392b;
    }

    public static String getAppkey() {
        if (TextUtils.isEmpty(n.f40391a) && f40032a != null) {
            n.a(f40032a);
        }
        return n.f40391a;
    }

    public static Context getContext() {
        if (f40032a == null) {
            try {
                Context a11 = r.a();
                if (a11 != null) {
                    init(a11);
                }
            } catch (Throwable unused) {
            }
        }
        return f40032a;
    }

    public static Context getContextSafely() {
        return f40032a;
    }

    public static boolean getDefaultPrivacy() {
        return n.f40395e;
    }

    public static InternationalDomain getDomain() {
        return n.f40393c == null ? InternationalDomain.DEFAULT : n.f40393c;
    }

    public static int getPrivacyGrantedStatus() {
        return s.c();
    }

    public static synchronized void init(Context context) {
        synchronized (MobSDK.class) {
            init(context, null, null);
        }
    }

    public static final int isAuth() {
        return q.c();
    }

    public static final boolean isForb() {
        return q.e();
    }

    public static final boolean isGppVer() {
        return n.f40398h;
    }

    public static final boolean isMob() {
        return q.d();
    }

    public static void setChannel(MobProduct mobProduct, int i11) {
        o.a().a(mobProduct, i11);
    }

    public static void submitPolicyGrantResult(boolean z11) {
        s.b(z11);
    }

    @Deprecated
    public static void submitPolicyGrantResult(boolean z11, final OperationCallback<Void> operationCallback) {
        s.b(z11);
        if (operationCallback != null) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.MobSDK.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    OperationCallback operationCallback2 = OperationCallback.this;
                    if (operationCallback2 == null) {
                        return false;
                    }
                    operationCallback2.onComplete(null);
                    return false;
                }
            });
        }
    }

    public static synchronized void init(Context context, String str) {
        synchronized (MobSDK.class) {
            init(context, str, null);
        }
    }

    public static synchronized void init(Context context, String str, String str2) {
        synchronized (MobSDK.class) {
            if (context == null) {
                Log.e("MobSDK", "MobSDK init error, context is null");
                return;
            }
            if (f40032a == null) {
                f40032a = context.getApplicationContext();
                n.f40391a = str;
                n.f40392b = str2;
                q.a();
            } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(n.f40391a)) {
                n.f40391a = str;
                n.f40392b = str2;
                q.b();
            }
        }
    }
}

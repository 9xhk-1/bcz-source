package com.tencent.connect.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.jiongji.andriod.card.R;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.TDialog;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.g;
import com.tencent.open.utils.i;
import com.tencent.open.utils.j;
import com.tencent.open.utils.k;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import com.tencent.open.web.security.JniInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import g80.h;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AuthAgent extends BaseApi {
    public static final String KEY_FORCE_QR_LOGIN = "KEY_FORCE_QR_LOGIN";
    public static final String SECURE_LIB_ARM64_FILE_NAME = "libwbsafeedit_64";
    public static final String SECURE_LIB_ARM_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_NAME = null;
    public static final int SECURE_LIB_VERSION = 5;
    public static final String SECURE_LIB_X86_64_FILE_NAME = "libwbsafeedit_x86_64";
    public static final String SECURE_LIB_X86_FILE_NAME = "libwbsafeedit_x86";

    /* renamed from: a, reason: collision with root package name */
    private IUiListener f42717a;

    /* renamed from: d, reason: collision with root package name */
    private String f42718d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f42719e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends DefaultUiListener {

        /* renamed from: a, reason: collision with root package name */
        IUiListener f42725a;

        public a(IUiListener iUiListener) {
            this.f42725a = iUiListener;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f42725a;
            if (iUiListener != null) {
                iUiListener.onCancel();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                SLog.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data is null");
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                int i11 = jSONObject.getInt("ret");
                String string = i11 == 0 ? "success" : jSONObject.getString("msg");
                IUiListener iUiListener = this.f42725a;
                if (iUiListener != null) {
                    iUiListener.onComplete(new JSONObject().put("ret", i11).put("msg", string));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
                SLog.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data format error");
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            IUiListener iUiListener = this.f42725a;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends DefaultUiListener {

        /* renamed from: b, reason: collision with root package name */
        private final IUiListener f42744b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f42745c;

        /* renamed from: d, reason: collision with root package name */
        private final Context f42746d;

        public c(Context context, IUiListener iUiListener, boolean z11, boolean z12) {
            this.f42746d = context;
            this.f42744b = iUiListener;
            this.f42745c = z11;
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
            this.f42744b.onCancel();
            SLog.release();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString("access_token");
                String string2 = jSONObject.getString("expires_in");
                String string3 = jSONObject.getString("openid");
                if (string != null && ((BaseApi) AuthAgent.this).f42865c != null && string3 != null) {
                    ((BaseApi) AuthAgent.this).f42865c.setAccessToken(string, string2);
                    ((BaseApi) AuthAgent.this).f42865c.setOpenId(string3);
                    com.tencent.connect.a.a.d(this.f42746d, ((BaseApi) AuthAgent.this).f42865c);
                }
                String string4 = jSONObject.getString(Constants.PARAM_PLATFORM_ID);
                if (string4 != null) {
                    try {
                        this.f42746d.getSharedPreferences(Constants.PREFERENCE_PF, 0).edit().putString(Constants.PARAM_PLATFORM_ID, string4).commit();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        SLog.e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e11);
                    }
                }
                if (this.f42745c) {
                    CookieSyncManager.getInstance().sync();
                }
            } catch (JSONException e12) {
                e12.printStackTrace();
                SLog.e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e12);
            }
            this.f42744b.onComplete(jSONObject);
            AuthAgent.this.releaseResource();
            SLog.release();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
            this.f42744b.onError(uiError);
            SLog.release();
        }
    }

    static {
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.i("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
            return;
        }
        if (str.equalsIgnoreCase(h.f53495a)) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.i("openSDK_LOG.AuthAgent", "is x86 architecture");
            return;
        }
        if (str.equalsIgnoreCase(h.f53496b)) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            SLog.i("openSDK_LOG.AuthAgent", "is x86_64 architecture");
            return;
        }
        SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        SLog.i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
    }

    public AuthAgent(QQToken qQToken) {
        super(qQToken);
    }

    private void a(Bundle bundle, Map<String, Object> map) {
    }

    public int doLogin(Activity activity, String str, IUiListener iUiListener, boolean z11, Fragment fragment, boolean z12, Map<String, Object> map) {
        if (com.tencent.connect.a.a("openSDK_LOG.AuthAgent", iUiListener)) {
            return -1;
        }
        this.f42718d = str;
        this.f42719e = new WeakReference<>(activity);
        this.f42717a = iUiListener;
        Object[] objArr = new Object[2];
        boolean booleanExtra = activity.getIntent().getBooleanExtra(KEY_FORCE_QR_LOGIN, false);
        boolean b11 = i.a(activity, this.f42865c.getAppId()).b("C_LoginWeb");
        SLog.i("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin=" + booleanExtra + ", toWebLogin=" + b11);
        if (!booleanExtra && !b11 && a(activity, fragment, map, z11, objArr)) {
            SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showUi, return Constants.UI_ACTIVITY");
            e.a().a(this.f42865c.getOpenId(), this.f42865c.getAppId(), "2", "1", "5", (String) objArr[0], "0", "0");
            return ((Integer) objArr[1]).intValue();
        }
        e.a().a(this.f42865c.getOpenId(), this.f42865c.getAppId(), "2", "1", "5", "1", "0", "0");
        SLog.w("openSDK_LOG.AuthAgent", "doLogin startActivity fail show dialog.");
        b bVar = new b(this.f42717a);
        this.f42717a = bVar;
        return a(z11, bVar, z12, map);
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
        this.f42717a = null;
    }

    public void b(IUiListener iUiListener) {
        Bundle a11 = a();
        a11.putString("reqType", "checkLogin");
        HttpUtils.requestAsync(this.f42865c, g.a(), "https://openmobile.qq.com/v3/user/get_info", a11, "GET", new BaseApi.TempRequestListener(new a(iUiListener)));
    }

    public int a(Activity activity, String str, IUiListener iUiListener, boolean z11, Fragment fragment, boolean z12) {
        return doLogin(activity, str, iUiListener, z11, fragment, z12, null);
    }

    private int a(boolean z11, IUiListener iUiListener, boolean z12, Map<String, Object> map) {
        CookieSyncManager.createInstance(g.a());
        Bundle a11 = a();
        if (z11) {
            a11.putString("isadd", "1");
        }
        a11.putString("scope", this.f42718d);
        a11.putString("client_id", this.f42865c.getAppId());
        if (BaseApi.isOEM) {
            a11.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + BaseApi.installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.businessId);
        } else {
            a11.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        String str = (System.currentTimeMillis() / 1000) + "";
        a11.putString(HwPayConstant.KEY_SIGN, k.b(g.a(), str));
        a11.putString("time", str);
        a11.putString(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL, "mobile");
        a11.putString(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "token");
        a11.putString(CommonConstant.ReqAccessTokenParam.REDIRECT_URI, "auth://tauth.qq.com/");
        a11.putString("cancel_display", "1");
        a11.putString("switch", "1");
        a11.putString("compat_v", "1");
        if (z12) {
            a11.putString("style", "qr");
        }
        boolean a12 = a(map);
        a11.putString("show_download_ui", Boolean.toString(a12));
        SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- start, isShowDownloadUi=" + a12);
        final String str2 = j.a().a(g.a(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + HttpUtils.encodeUrl(a11);
        final c cVar = new c(g.a(), iUiListener, true, false);
        SLog.d("openSDK_LOG.AuthAgent", "OpenUi, showDialog TDialog");
        l.b(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1
            @Override // java.lang.Runnable
            public void run() {
                final Activity activity;
                k.a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                JniInterface.loadSo();
                if (AuthAgent.this.f42719e == null || (activity = (Activity) AuthAgent.this.f42719e.get()) == null) {
                    return;
                }
                activity.runOnUiThread(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (JniInterface.isJniOk) {
                            Activity activity2 = activity;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            com.tencent.connect.auth.a aVar = new com.tencent.connect.auth.a(activity2, "action_login", str2, cVar, ((BaseApi) AuthAgent.this).f42865c);
                            if (activity.isFinishing()) {
                                return;
                            }
                            aVar.show();
                            return;
                        }
                        SLog.w("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
                        Activity activity3 = activity;
                        String a13 = AuthAgent.this.a("");
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        TDialog tDialog = new TDialog(activity3, "", a13, cVar, ((BaseApi) AuthAgent.this).f42865c);
                        if (activity.isFinishing()) {
                            return;
                        }
                        tDialog.show();
                    }
                });
            }
        });
        SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- end");
        return 2;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends DefaultUiListener {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<IUiListener> f42727a;

        /* renamed from: c, reason: collision with root package name */
        private final String f42729c = "sendinstall";

        /* renamed from: d, reason: collision with root package name */
        private final String f42730d = "installwording";

        /* renamed from: e, reason: collision with root package name */
        private final String f42731e = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public abstract class a implements View.OnClickListener {

            /* renamed from: d, reason: collision with root package name */
            Dialog f42741d;

            public a(Dialog dialog) {
                this.f42741d = dialog;
            }
        }

        public b(IUiListener iUiListener) {
            this.f42727a = new WeakReference<>(iUiListener);
        }

        private void a(String str, final IUiListener iUiListener, final Object obj) {
            PackageInfo packageInfo;
            if (AuthAgent.this.f42719e == null) {
                SLog.i("openSDK_LOG.AuthAgent", "showFeedConfrimDialog mActivity null and return");
                return;
            }
            Activity activity = (Activity) AuthAgent.this.f42719e.get();
            if (activity == null) {
                SLog.i("openSDK_LOG.AuthAgent", "showFeedConfrimDialog mActivity.get() null and return");
                return;
            }
            Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(1);
            PackageManager packageManager = activity.getPackageManager();
            try {
                packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e11) {
                SLog.e("openSDK_LOG.AuthAgent", "showFeedConfrimDialog exception:" + e11.getStackTrace().toString());
                packageInfo = null;
            }
            Drawable loadIcon = packageInfo != null ? packageInfo.applicationInfo.loadIcon(packageManager) : null;
            View.OnClickListener onClickListener = new a(dialog) { // from class: com.tencent.connect.auth.AuthAgent.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    b.this.a();
                    Dialog dialog2 = this.f42741d;
                    if (dialog2 != null && dialog2.isShowing()) {
                        this.f42741d.dismiss();
                    }
                    IUiListener iUiListener2 = iUiListener;
                    if (iUiListener2 != null) {
                        iUiListener2.onComplete(obj);
                    }
                }
            };
            View.OnClickListener onClickListener2 = new a(dialog) { // from class: com.tencent.connect.auth.AuthAgent.b.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Dialog dialog2 = this.f42741d;
                    if (dialog2 != null && dialog2.isShowing()) {
                        this.f42741d.dismiss();
                    }
                    IUiListener iUiListener2 = iUiListener;
                    if (iUiListener2 != null) {
                        iUiListener2.onComplete(obj);
                    }
                }
            };
            ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setAlpha(0);
            dialog.getWindow().setBackgroundDrawable(colorDrawable);
            dialog.setContentView(a(activity, loadIcon, str, onClickListener, onClickListener2));
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tencent.connect.auth.AuthAgent.b.3
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IUiListener iUiListener2 = iUiListener;
                    if (iUiListener2 != null) {
                        iUiListener2.onComplete(obj);
                    }
                }
            });
            if (activity.isFinishing()) {
                return;
            }
            dialog.show();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.f42727a.get() != null) {
                this.f42727a.get().onCancel();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onComplete(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = "openSDK_LOG.AuthAgent"
                if (r8 == 0) goto La3
                r1 = r8
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                r2 = 0
                java.lang.String r3 = "sendinstall"
                int r3 = r1.getInt(r3)     // Catch: org.json.JSONException -> L1a
                r4 = 1
                if (r3 != r4) goto L12
                goto L13
            L12:
                r4 = r2
            L13:
                java.lang.String r3 = "installwording"
                java.lang.String r3 = r1.getString(r3)     // Catch: org.json.JSONException -> L1b
                goto L22
            L1a:
                r4 = r2
            L1b:
                java.lang.String r3 = "FeedConfirmListener onComplete There is no value for sendinstall."
                com.tencent.open.log.SLog.w(r0, r3)
                java.lang.String r3 = ""
            L22:
                java.lang.String r3 = java.net.URLDecoder.decode(r3)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = " WORDING = "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r6 = "xx,showConfirmDialog="
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                com.tencent.open.log.SLog.i(r0, r5)
                if (r4 == 0) goto L5b
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L5b
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r1 = r7.f42727a
                java.lang.Object r1 = r1.get()
                com.tencent.tauth.IUiListener r1 = (com.tencent.tauth.IUiListener) r1
                r7.a(r3, r1, r8)
                java.lang.String r8 = " WORDING is not empty and return"
                com.tencent.open.log.SLog.i(r0, r8)
                return
            L5b:
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r3 = r7.f42727a
                java.lang.Object r3 = r3.get()
                com.tencent.tauth.IUiListener r3 = (com.tencent.tauth.IUiListener) r3
                if (r3 == 0) goto L9e
                com.tencent.connect.auth.AuthAgent r4 = com.tencent.connect.auth.AuthAgent.this
                com.tencent.connect.auth.QQToken r4 = com.tencent.connect.auth.AuthAgent.h(r4)
                if (r4 == 0) goto L8b
                com.tencent.connect.auth.AuthAgent r2 = com.tencent.connect.auth.AuthAgent.this
                com.tencent.connect.auth.QQToken r2 = com.tencent.connect.auth.AuthAgent.i(r2)
                boolean r2 = r2.saveSession(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = " saveSession saveSuccess="
                r1.append(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.open.log.SLog.i(r0, r1)
            L8b:
                if (r2 == 0) goto L91
                r3.onComplete(r8)
                goto La3
            L91:
                com.tencent.tauth.UiError r8 = new com.tencent.tauth.UiError
                java.lang.String r0 = "持久化失败!"
                r1 = 0
                r2 = -6
                r8.<init>(r2, r0, r1)
                r3.onError(r8)
                goto La3
            L9e:
                java.lang.String r8 = " userListener is null"
                com.tencent.open.log.SLog.i(r0, r8)
            La3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.auth.AuthAgent.b.onComplete(java.lang.Object):void");
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            if (this.f42727a.get() != null) {
                this.f42727a.get().onError(uiError);
            }
        }

        private Drawable a(String str, Context context) {
            InputStream open;
            Bitmap bitmap;
            Drawable drawable = null;
            try {
                open = context.getApplicationContext().getAssets().open(str);
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            if (open == null) {
                return null;
            }
            if (str.endsWith(".9.png")) {
                try {
                    bitmap = BitmapFactory.decodeStream(open);
                } catch (OutOfMemoryError e12) {
                    e12.printStackTrace();
                    bitmap = null;
                }
                if (bitmap == null) {
                    return null;
                }
                byte[] ninePatchChunk = bitmap.getNinePatchChunk();
                NinePatch.isNinePatchChunk(ninePatchChunk);
                return new NinePatchDrawable(bitmap, ninePatchChunk, new Rect(), null);
            }
            drawable = Drawable.createFromStream(open, str);
            open.close();
            return drawable;
        }

        private View a(Context context, Drawable drawable, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            float f11 = displayMetrics.density;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setId(1);
            int i11 = (int) (60.0f * f11);
            int i12 = (int) (f11 * 14.0f);
            int i13 = (int) (18.0f * f11);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
            layoutParams.addRule(9);
            layoutParams.setMargins(0, i13, (int) (6.0f * f11), i13);
            relativeLayout.addView(imageView, layoutParams);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(14.0f);
            textView.setGravity(3);
            textView.setIncludeFontPadding(false);
            textView.setPadding(0, 0, 0, 0);
            textView.setLines(2);
            textView.setId(5);
            textView.setMinWidth((int) (185.0f * f11));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, 1);
            layoutParams2.addRule(6, 1);
            float f12 = 5.0f * f11;
            layoutParams2.setMargins(0, 0, (int) f12, 0);
            relativeLayout.addView(textView, layoutParams2);
            View view = new View(context);
            view.setBackgroundColor(Color.rgb(R.styleable.Theme_drawable_review_sound, R.styleable.Theme_drawable_review_sound, R.styleable.Theme_drawable_review_sound));
            view.setId(3);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, 2);
            layoutParams3.addRule(3, 1);
            layoutParams3.addRule(5, 1);
            layoutParams3.addRule(7, 5);
            int i14 = (int) (12.0f * f11);
            layoutParams3.setMargins(0, 0, 0, i14);
            relativeLayout.addView(view, layoutParams3);
            LinearLayout linearLayout = new LinearLayout(context);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(5, 1);
            layoutParams4.addRule(7, 5);
            layoutParams4.addRule(3, 3);
            Button button = new Button(context);
            button.setText("跳过");
            button.setBackgroundDrawable(a("buttonNegt.png", context));
            button.setTextColor(Color.rgb(36, 97, 131));
            button.setTextSize(20.0f);
            button.setOnClickListener(onClickListener2);
            button.setId(4);
            int i15 = (int) (45.0f * f11);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, i15);
            layoutParams5.rightMargin = i12;
            int i16 = (int) (4.0f * f11);
            layoutParams5.leftMargin = i16;
            layoutParams5.weight = 1.0f;
            linearLayout.addView(button, layoutParams5);
            Button button2 = new Button(context);
            button2.setText("确定");
            button2.setTextSize(20.0f);
            button2.setTextColor(Color.rgb(255, 255, 255));
            button2.setBackgroundDrawable(a("buttonPost.png", context));
            button2.setOnClickListener(onClickListener);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, i15);
            layoutParams6.weight = 1.0f;
            layoutParams6.rightMargin = i16;
            linearLayout.addView(button2, layoutParams6);
            relativeLayout.addView(linearLayout, layoutParams4);
            ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) (279.0f * f11), (int) (f11 * 163.0f));
            relativeLayout.setPadding(i12, 0, i14, i14);
            relativeLayout.setLayoutParams(layoutParams7);
            relativeLayout.setBackgroundColor(Color.rgb(R.styleable.Theme_drawable_walk_sound3, R.styleable.Theme_drawable_wiki_sound, R.styleable.Theme_drawable_walk_sound3));
            PaintDrawable paintDrawable = new PaintDrawable(Color.rgb(R.styleable.Theme_drawable_walk_sound3, R.styleable.Theme_drawable_wiki_sound, R.styleable.Theme_drawable_walk_sound3));
            paintDrawable.setCornerRadius(f12);
            relativeLayout.setBackgroundDrawable(paintDrawable);
            return relativeLayout;
        }

        public void a() {
            Activity activity;
            Bundle b11 = AuthAgent.this.b();
            if (AuthAgent.this.f42719e == null || (activity = (Activity) AuthAgent.this.f42719e.get()) == null) {
                return;
            }
            HttpUtils.requestAsync(((BaseApi) AuthAgent.this).f42865c, activity, "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi", b11, "POST", null);
        }
    }

    private boolean a(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(Constants.KEY_ENABLE_SHOW_DOWNLOAD_URL);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return true;
    }

    private boolean a(Activity activity, Fragment fragment, Map<String, Object> map, boolean z11, Object[] objArr) {
        SLog.i("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
        Intent c11 = c();
        if (c11 != null) {
            Bundle a11 = a();
            if (z11) {
                a11.putString("isadd", "1");
            }
            a11.putString("scope", this.f42718d);
            a11.putString("client_id", this.f42865c.getAppId());
            if (BaseApi.isOEM) {
                a11.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + BaseApi.installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.businessId);
            } else {
                a11.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
            }
            a11.putString("need_pay", "1");
            a(a11, map);
            a11.putString(Constants.KEY_APP_NAME, k.a(g.a()));
            c11.putExtra(Constants.KEY_ACTION, "action_login");
            c11.putExtra(Constants.KEY_PARAMS, a11);
            c11.putExtra("appid", this.f42865c.getAppId());
            a11.putString(Constants.KEY_PPSTS, k.a(activity, a(a11)));
            try {
                this.f42717a = new b(this.f42717a);
                UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_LOGIN, this.f42717a);
                if (fragment != null) {
                    SLog.d("openSDK_LOG.AuthAgent", "startAssitActivity fragment");
                    a(fragment, c11, Constants.REQUEST_LOGIN, map);
                } else {
                    SLog.d("openSDK_LOG.AuthAgent", "startAssitActivity activity");
                    a(activity, c11, Constants.REQUEST_LOGIN, map);
                }
                SLog.i("openSDK_LOG.AuthAgent", "startActionActivity() -- end, found activity for loginIntent");
                e.a().a(0, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.f42865c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
                objArr[0] = "0";
                objArr[1] = 1;
                return true;
            } catch (Exception e11) {
                SLog.e("openSDK_LOG.AuthAgent", "startActionActivity() exception", e11);
            }
        }
        e.a().a(1, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.f42865c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
        SLog.i("openSDK_LOG.AuthAgent", "startActionActivity() -- end, no target activity for loginIntent");
        return false;
    }

    private String a(Bundle bundle) {
        String string = bundle.getString("status_os");
        String string2 = bundle.getString("status_machine");
        String string3 = bundle.getString("status_version");
        String string4 = bundle.getString("sdkv");
        String string5 = bundle.getString("client_id");
        String string6 = bundle.getString("need_pay");
        String string7 = bundle.getString(Constants.PARAM_PLATFORM_ID);
        SLog.d("openSDK_LOG.AuthAgent", "os=" + string + ", machine=" + string2 + ", version=" + string3 + ", sdkv=" + string4 + ", appId=" + string5 + ", needPay=" + string6 + ", pf=" + string7);
        StringBuilder sb2 = new StringBuilder();
        if (string == null) {
            string = "";
        }
        sb2.append(string);
        if (string2 == null) {
            string2 = "";
        }
        sb2.append(string2);
        if (string3 == null) {
            string3 = "";
        }
        sb2.append(string3);
        if (string4 == null) {
            string4 = "";
        }
        sb2.append(string4);
        if (string5 == null) {
            string5 = "";
        }
        sb2.append(string5);
        if (string6 == null) {
            string6 = "";
        }
        sb2.append(string6);
        if (string7 == null) {
            string7 = "";
        }
        sb2.append(string7);
        return sb2.toString();
    }

    public void a(IUiListener iUiListener) {
        String str;
        SLog.i("openSDK_LOG.AuthAgent", "reportDAU() -- start");
        String accessToken = this.f42865c.getAccessToken();
        String openId = this.f42865c.getOpenId();
        String appId = this.f42865c.getAppId();
        if (!TextUtils.isEmpty(accessToken) && !TextUtils.isEmpty(openId) && !TextUtils.isEmpty(appId)) {
            str = m.g("tencent&sdk&qazxc***14969%%" + accessToken + appId + openId + "qzone3.4");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            SLog.e("openSDK_LOG.AuthAgent", "reportDAU -- encrytoken is null");
            return;
        }
        Bundle a11 = a();
        a11.putString("encrytoken", str);
        HttpUtils.requestAsync(this.f42865c, g.a(), "https://openmobile.qq.com/user/user_login_statis", a11, "POST", null);
        SLog.i("openSDK_LOG.AuthAgent", "reportDAU() -- end");
    }
}

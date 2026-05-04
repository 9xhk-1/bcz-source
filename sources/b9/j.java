package b9;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import b9.j;
import c9.a;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.baicizhan.client.business.auth.WBShareActivity;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import com.sina.weibo.sdk.share.WbShareCallback;
import com.squareup.picasso.Picasso;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import wb0.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j implements WbShareCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6482d = "WeiboHelper";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6483e = "https://api.weibo.com/2/users/show.json?uid=%s&access_token=%s";

    /* renamed from: a, reason: collision with root package name */
    public ShareDelegate.b f6484a;

    /* renamed from: b, reason: collision with root package name */
    public IWBAPI f6485b;

    /* renamed from: c, reason: collision with root package name */
    public qb0.h f6486c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements WbAuthListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0141a f6487a;

        public a(final a.InterfaceC0141a val$callback) {
            this.f6487a = val$callback;
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onCancel() {
            qb.c.i(j.f6482d, "cancel", new Object[0]);
            this.f6487a.onCancel();
            j.this.p();
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onComplete(Oauth2AccessToken oauth2AccessToken) {
            qb.c.i(j.f6482d, "onSuccess", new Object[0]);
            if (oauth2AccessToken == null) {
                this.f6487a.onError(new RuntimeException("empty token"));
            } else {
                j.this.i(oauth2AccessToken.getAccessToken(), oauth2AccessToken.getUid(), this.f6487a);
            }
            j.this.p();
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onError(UiError uiError) {
            qb.c.i(j.f6482d, "onFailure code %d, msg %s, detail %s", Integer.valueOf(uiError.errorCode), uiError.errorMessage, uiError.errorDetail);
            this.f6487a.onError(new RuntimeException(uiError.errorMessage));
            j.this.p();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Response.Listener<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0141a f6489a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f6490b;

        public b(final a.InterfaceC0141a val$callback, final String val$token) {
            this.f6489a = val$callback;
            this.f6490b = val$token;
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String s11) {
            qb.c.i(j.f6482d, "onResponse data = ", new Object[0]);
            Map map = (Map) new com.google.gson.d().n(s11, Map.class);
            if (map.get(ma.b.f72948u) == null) {
                this.f6489a.onComplete(j.n(map, this.f6490b));
                return;
            }
            qb.c.i(j.f6482d, "error data = " + s11, new Object[0]);
            this.f6489a.onError(new RuntimeException(s11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Response.ErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0141a f6492a;

        public c(final a.InterfaceC0141a val$callback) {
            this.f6492a = val$callback;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            qb.c.i(j.f6482d, "onErrorResponse error =" + volleyError.getMessage(), new Object[0]);
            this.f6492a.onError(volleyError);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements o<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f6494a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ShareParams f6495b;

        public d(final Activity val$activity, final ShareParams val$params) {
            this.f6494a = val$activity;
            this.f6495b = val$params;
        }

        public final /* synthetic */ void b(Exception exc, Activity activity) {
            if (j.this.f6484a != null) {
                j.this.f6484a.onShareError(ShareChannel.WEIBO, exc);
            }
            activity.finish();
        }

        @Override // wb0.o, java.util.concurrent.Callable
        public Object call() {
            try {
                j.this.o(this.f6494a, this.f6495b);
                return null;
            } catch (Exception e11) {
                qb.c.c(j.f6482d, "", e11);
                final Activity activity = this.f6494a;
                activity.runOnUiThread(new Runnable() { // from class: b9.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.d.this.b(e11, activity);
                    }
                });
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final j f6497a = new j();
    }

    public static j h() {
        return e.f6497a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r6.equals("m") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baicizhan.client.business.auth.login.ThirdPartyUserInfo n(java.util.Map<java.lang.String, java.lang.Object> r6, java.lang.String r7) {
        /*
            com.baicizhan.client.business.auth.login.ThirdPartyUserInfo r0 = new com.baicizhan.client.business.auth.login.ThirdPartyUserInfo
            r0.<init>()
            java.lang.String r1 = "weibo"
            r0.provider = r1
            r1 = 1
            r0.loginType = r1
            java.lang.String r2 = "idstr"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.uid = r2
            r0.atoken = r7
            java.lang.String r7 = "location"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r0.city = r7
            java.lang.String r7 = "name"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r0.nickName = r7
            java.lang.String r7 = "avatar_large"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r0.imageUrl = r7
            java.lang.String r7 = "gender"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            r0.gender = r6
            java.lang.String r7 = "X"
            if (r6 == 0) goto L86
            r6.getClass()
            int r2 = r6.hashCode()
            java.lang.String r3 = "m"
            java.lang.String r4 = "f"
            r5 = -1
            switch(r2) {
                case 102: goto L72;
                case 109: goto L6b;
                case 22899: goto L60;
                case 30007: goto L55;
                default: goto L53;
            }
        L53:
            r1 = r5
            goto L7a
        L55:
            java.lang.String r1 = "男"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L5e
            goto L53
        L5e:
            r1 = 3
            goto L7a
        L60:
            java.lang.String r1 = "女"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L69
            goto L53
        L69:
            r1 = 2
            goto L7a
        L6b:
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L7a
            goto L53
        L72:
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L79
            goto L53
        L79:
            r1 = 0
        L7a:
            switch(r1) {
                case 0: goto L83;
                case 1: goto L80;
                case 2: goto L83;
                case 3: goto L80;
                default: goto L7d;
            }
        L7d:
            r0.gender = r7
            return r0
        L80:
            r0.gender = r3
            return r0
        L83:
            r0.gender = r4
            return r0
        L86:
            r0.gender = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.j.n(java.util.Map, java.lang.String):com.baicizhan.client.business.auth.login.ThirdPartyUserInfo");
    }

    public void f(Activity activity, final a.InterfaceC0141a callback) {
        this.f6485b.authorize(activity, new a(callback));
    }

    public final void g(WeiboMultiMessage weiboMessage, ShareParams params) throws IOException, IllegalStateException {
        if (!TextUtils.isEmpty(params.f16057a)) {
            WebpageObject webpageObject = new WebpageObject();
            webpageObject.identify = UUID.randomUUID().toString();
            webpageObject.title = TextUtils.isEmpty(params.f16058b) ? params.f16059c : params.f16058b;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Picasso.k().u(params.f16060d).C(params.f16062f).l().compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            webpageObject.thumbData = byteArrayOutputStream.toByteArray();
            webpageObject.actionUrl = params.f16057a;
            weiboMessage.mediaObject = webpageObject;
        } else if (!TextUtils.isEmpty(params.f16063g) || !TextUtils.isEmpty(params.f16059c) || !TextUtils.isEmpty(params.f16058b)) {
            TextObject textObject = new TextObject();
            String str = TextUtils.isEmpty(params.f16063g) ? params.f16059c : params.f16063g;
            if (TextUtils.isEmpty(str)) {
                str = params.f16058b;
            }
            textObject.text = str;
            weiboMessage.textObject = textObject;
        }
        if (TextUtils.isEmpty(params.f16060d)) {
            return;
        }
        ImageObject imageObject = new ImageObject();
        try {
            imageObject.setImageData(Picasso.k().u(params.f16060d).C(params.f16062f).l());
            weiboMessage.imageObject = imageObject;
        } catch (IOException e11) {
            qb.c.d(f6482d, "error " + e11.getMessage(), new Object[0]);
        }
    }

    public final void i(final String token, String uid, final a.InterfaceC0141a callback) {
        rb.f.d(new StringRequest(0, String.format(Locale.CHINA, f6483e, uid, token), new b(callback, token), new c(callback)));
    }

    public void j(Activity activity) {
        IWBAPI createWBAPI = WBAPIFactory.createWBAPI(activity);
        this.f6485b = createWBAPI;
        createWBAPI.setLoggerEnable(true);
        this.f6485b.registerApp(pb.a.a(), new AuthInfo(pb.a.a(), b9.a.f6452a, b9.a.f6454c, b9.a.f6455d));
    }

    public void l(Activity activity, int requestCode, int resultCode, Intent data) {
        IWBAPI iwbapi = this.f6485b;
        if (iwbapi != null) {
            iwbapi.authorizeCallback(activity, requestCode, resultCode, data);
        }
    }

    public void m(Intent intent, WbShareCallback response) {
        IWBAPI iwbapi = this.f6485b;
        if (iwbapi != null) {
            iwbapi.doResultIntent(intent, response);
        }
    }

    public final void o(Activity activity, ShareParams params) throws Exception {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        if (ShareParams.ShareType.IMAGE.equals(params.f16061e)) {
            t(weiboMultiMessage, params);
        } else {
            g(weiboMultiMessage, params);
        }
        this.f6485b.shareMessage(activity, weiboMultiMessage, false);
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onCancel() {
        qb.c.i(f6482d, "onWbShareCancel", new Object[0]);
        ShareDelegate.b bVar = this.f6484a;
        if (bVar != null) {
            bVar.onShareCancel();
        }
        q();
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onComplete() {
        qb.c.i(f6482d, "onWbShareSuccess", new Object[0]);
        ShareDelegate.b bVar = this.f6484a;
        if (bVar != null) {
            bVar.onShareSuccess(ShareChannel.WEIBO);
        }
        q();
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onError(UiError uiError) {
        qb.c.i(f6482d, "onWbShareFail %d %s %s", Integer.valueOf(uiError.errorCode), uiError.errorMessage, uiError.errorDetail);
        ShareDelegate.b bVar = this.f6484a;
        if (bVar != null) {
            bVar.onShareError(ShareChannel.WEIBO, new RuntimeException("onWbShareFail"));
        }
        q();
    }

    public final void q() {
        this.f6484a = null;
        qb0.h hVar = this.f6486c;
        if (hVar != null) {
            if (!hVar.isUnsubscribed()) {
                this.f6486c.unsubscribe();
            }
            this.f6486c = null;
        }
    }

    public void r(final Activity activity, final ShareParams params) {
        qb0.h hVar = this.f6486c;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f6486c.unsubscribe();
        }
        this.f6486c = rx.c.z2(new d(activity, params)).w5(bc0.c.e()).p5();
    }

    public void s(Activity activity, ShareParams params, ShareDelegate.b listener) {
        if (activity == null || params == null || listener == null) {
            qb.c.i(f6482d, "null == activity || null == params || null == listener", new Object[0]);
        }
        this.f6484a = listener;
        WBShareActivity.K0(activity, params);
        if (listener != null) {
            listener.onShareSend(ShareChannel.WEIBO);
        }
    }

    public final void t(WeiboMultiMessage weiboMessage, ShareParams params) {
        if (!TextUtils.isEmpty(params.f16059c) || !TextUtils.isEmpty(params.f16058b)) {
            TextObject textObject = new TextObject();
            textObject.text = TextUtils.isEmpty(params.f16059c) ? params.f16058b : params.f16059c;
            weiboMessage.textObject = textObject;
        }
        if (TextUtils.isEmpty(params.f16060d)) {
            return;
        }
        ImageObject imageObject = new ImageObject();
        try {
            imageObject.setImageData(Picasso.k().t(new File(params.f16060d)).G(756, 1008).l());
            weiboMessage.imageObject = imageObject;
        } catch (IOException e11) {
            qb.c.d(f6482d, "error " + e11.getMessage(), new Object[0]);
        }
    }

    public j() {
    }

    public void k() {
    }

    public final void p() {
    }
}

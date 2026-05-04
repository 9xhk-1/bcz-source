package com.baicizhan.client.business.auth;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import c9.a;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.NoProguard;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.open.SocialOperation;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WeixinAuthHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final String f16010g = "WeixinAuthHelper";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16011h = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";

    /* renamed from: i, reason: collision with root package name */
    public static final String f16012i = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=%s&grant_type=refresh_token&refresh_token=%s";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16013j = "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s";

    /* renamed from: k, reason: collision with root package name */
    public static final int f16014k = 32768;

    /* renamed from: l, reason: collision with root package name */
    public static final int f16015l = 200;

    /* renamed from: m, reason: collision with root package name */
    public static final WeixinAuthHelper f16016m = new WeixinAuthHelper();

    /* renamed from: a, reason: collision with root package name */
    public a.InterfaceC0141a f16017a;

    /* renamed from: b, reason: collision with root package name */
    public ShareDelegate.b f16018b;

    /* renamed from: c, reason: collision with root package name */
    public a.c f16019c;

    /* renamed from: d, reason: collision with root package name */
    public ShareChannel f16020d;

    /* renamed from: e, reason: collision with root package name */
    public h f16021e;

    /* renamed from: f, reason: collision with root package name */
    public ThirdPartyUserInfo f16022f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessTokenResp implements NoProguard {

        @wo.c("access_token")
        public String access_token;

        @wo.c("errcode")
        public int errcode;

        @wo.c("errmsg")
        public String errmsg;

        @wo.c("expires_in")
        public long expires_in;

        @wo.c("openid")
        public String openid;

        @wo.c(Oauth2AccessToken.KEY_REFRESH_TOKEN)
        public String refresh_token;

        @wo.c("scope")
        public String scope;

        @wo.c(SocialOperation.GAME_UNION_ID)
        public String unionid;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<AccessTokenResp> {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends bp.a<AccessTokenResp> {
            public b() {
            }
        }

        public static AccessTokenResp fromJson(String json) {
            return (AccessTokenResp) BczJson.readFromJson(json, new a().getType());
        }

        public String toString() {
            return BczJson.writeToJson(this, new b().getType());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserInfoResp implements NoProguard {

        @wo.c("city")
        public String city;

        @wo.c(HwPayConstant.KEY_COUNTRY)
        public String country;

        @wo.c("errcode")
        public int errcode;

        @wo.c("errmsg")
        public String errmsg;

        @wo.c("headimgurl")
        public String headimgurl;

        @wo.c("nickname")
        public String nickname;

        @wo.c("openid")
        public String openid;

        @wo.c("privilege")
        public List<String> privilege;

        @wo.c("province")
        public String province;

        @wo.c("sex")
        public int sex;

        @wo.c(SocialOperation.GAME_UNION_ID)
        public String unionid;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<UserInfoResp> {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends bp.a<UserInfoResp> {
            public b() {
            }
        }

        public static UserInfoResp fromJson(String json) {
            InputStreamReader inputStreamReader;
            ByteArrayInputStream byteArrayInputStream;
            BufferedReader bufferedReader;
            String str = null;
            try {
                byteArrayInputStream = new ByteArrayInputStream(json.getBytes("ISO-8859-1"));
                try {
                    inputStreamReader = new InputStreamReader(byteArrayInputStream, "UTF-8");
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb2.append(readLine);
                            }
                            str = sb2.toString();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                qb.c.b(WeixinAuthHelper.f16010g, "coded json: " + str, new Object[0]);
                                return (UserInfoResp) BczJson.readFromJson(str, new a().getType());
                            } finally {
                                FileUtils.closeQuietly(byteArrayInputStream);
                                FileUtils.closeQuietly(inputStreamReader);
                                FileUtils.closeQuietly(bufferedReader);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                    bufferedReader = null;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
                byteArrayInputStream = null;
                bufferedReader = null;
            }
            qb.c.b(WeixinAuthHelper.f16010g, "coded json: " + str, new Object[0]);
            return (UserInfoResp) BczJson.readFromJson(str, new a().getType());
        }

        public String toString() {
            return BczJson.writeToJson(this, new b().getType());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Response.Listener<String> {
        public a() {
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String s11) {
            AccessTokenResp fromJson = AccessTokenResp.fromJson(s11);
            if (fromJson == null || fromJson.errcode > 0) {
                if (WeixinAuthHelper.this.f16017a != null) {
                    WeixinAuthHelper.this.f16017a.onError(fromJson == null ? new AuthException(-1) : new AuthException(fromJson.errcode, fromJson.errmsg));
                }
                WeixinAuthHelper.this.E();
                return;
            }
            if (WeixinAuthHelper.this.f16022f != null) {
                WeixinAuthHelper.this.f16022f.atoken = fromJson.access_token;
                WeixinAuthHelper.this.f16022f.expireAt = fromJson.expires_in;
                WeixinAuthHelper.this.f16022f.refreshToken = fromJson.refresh_token;
                WeixinAuthHelper.this.f16022f.unionid = fromJson.unionid;
                WeixinAuthHelper.this.f16022f.openid = fromJson.openid;
            }
            WeixinAuthHelper.this.y(fromJson);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Response.ErrorListener {
        public b() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (WeixinAuthHelper.this.f16017a != null) {
                WeixinAuthHelper.this.f16017a.onError(volleyError);
            }
            WeixinAuthHelper.this.E();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Response.Listener<String> {
        public c() {
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String s11) {
            UserInfoResp fromJson = UserInfoResp.fromJson(s11);
            if (fromJson == null || fromJson.errcode > 0) {
                if (WeixinAuthHelper.this.f16017a != null) {
                    WeixinAuthHelper.this.f16017a.onError(fromJson == null ? new AuthException(-2) : new AuthException(fromJson.errcode, fromJson.errmsg));
                }
                WeixinAuthHelper.this.E();
                return;
            }
            if (WeixinAuthHelper.this.f16022f != null) {
                WeixinAuthHelper.this.f16022f.openid = fromJson.openid;
                WeixinAuthHelper.this.f16022f.unionid = fromJson.unionid;
                WeixinAuthHelper.this.f16022f.nickName = fromJson.nickname;
                WeixinAuthHelper.this.f16022f.province = fromJson.province;
                WeixinAuthHelper.this.f16022f.city = fromJson.city;
                WeixinAuthHelper.this.f16022f.country = fromJson.country;
                WeixinAuthHelper.this.f16022f.imageUrl = fromJson.headimgurl;
                WeixinAuthHelper.this.f16022f.uid = fromJson.unionid;
                int i11 = fromJson.sex;
                if (i11 == 1) {
                    WeixinAuthHelper.this.f16022f.gender = "m";
                } else if (i11 != 2) {
                    WeixinAuthHelper.this.f16022f.gender = "X";
                } else {
                    WeixinAuthHelper.this.f16022f.gender = "f";
                }
                if (WeixinAuthHelper.this.f16017a != null) {
                    WeixinAuthHelper.this.f16017a.onComplete(WeixinAuthHelper.this.f16022f);
                    WeixinAuthHelper.this.f16017a = null;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Response.ErrorListener {
        public d() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (WeixinAuthHelper.this.f16017a != null) {
                WeixinAuthHelper.this.f16017a.onError(volleyError);
            }
            WeixinAuthHelper.this.E();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Callable<byte[]> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareParams f16029a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap f16030b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f16031c;

        public e(final ShareParams val$params, final Bitmap val$thumb, final Bitmap val$bitmap) {
            this.f16029a = val$params;
            this.f16030b = val$thumb;
            this.f16031c = val$bitmap;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] call() throws Exception {
            ShareParams.ShareType shareType = this.f16029a.f16061e;
            if (shareType == ShareParams.ShareType.IMAGE) {
                return WeixinAuthHelper.w(this.f16030b, 100);
            }
            if (shareType == ShareParams.ShareType.MINI_PROGRAM) {
                return WeixinAuthHelper.x(this.f16030b, 100, 131072);
            }
            Bitmap bitmap = this.f16031c;
            return WeixinAuthHelper.v(bitmap, bitmap.getWidth(), this.f16031c.getHeight());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        @wo.c("openid")
        public String f16037a;

        /* renamed from: b, reason: collision with root package name */
        @wo.c("template_id")
        public String f16038b;

        /* renamed from: c, reason: collision with root package name */
        @wo.c("action")
        public String f16039c;

        /* renamed from: d, reason: collision with root package name */
        @wo.c("scene")
        public int f16040d;

        /* renamed from: e, reason: collision with root package name */
        @wo.c("reserved")
        public String f16041e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<g> {
            public a() {
            }
        }

        public String toString() {
            return BczJson.writeToJson(this, new a().getType());
        }
    }

    public static WeixinAuthHelper A() {
        return f16016m;
    }

    public static IWXAPI C(Context context) {
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, b9.a.f6458g, false);
        createWXAPI.registerApp(b9.a.f6458g);
        return createWXAPI;
    }

    public static void J(ShareParams params, byte[] thumb, Context context, int type, Bitmap bitmap) {
        WXImageObject wXImageObject;
        IWXAPI C = C(context);
        if (TextUtils.isEmpty(params.f16060d)) {
            wXImageObject = new WXImageObject(bitmap);
        } else {
            WXImageObject wXImageObject2 = new WXImageObject();
            String z11 = z(context, new File(params.f16060d));
            if (z11 == null) {
                z11 = params.f16060d;
            }
            wXImageObject2.setImagePath(z11);
            wXImageObject = wXImageObject2;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.thumbData = thumb;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        String str = params.f16057a;
        if (str == null) {
            str = "";
        }
        req.transaction = xb.f.o(str);
        req.message = wXMediaMessage;
        req.scene = type;
        C.sendReq(req);
    }

    public static void K(ShareParams params, Context context, byte[] thumb) {
        IWXAPI C = C(context);
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.webpageUrl = params.f16068l;
        int i11 = params.f16066j;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 0;
            }
        }
        wXMiniProgramObject.miniprogramType = i12;
        wXMiniProgramObject.userName = params.f16064h;
        wXMiniProgramObject.path = params.f16065i;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXMiniProgramObject);
        wXMediaMessage.title = params.f16058b;
        wXMediaMessage.thumbData = thumb;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        String str = params.f16057a;
        if (str == null) {
            str = "";
        }
        req.transaction = xb.f.o(str);
        req.message = wXMediaMessage;
        req.scene = 0;
        C.sendReq(req);
    }

    public static void M(ShareParams params, Context context, int type) {
        IWXAPI C = C(context);
        WXTextObject wXTextObject = new WXTextObject();
        String str = TextUtils.isEmpty(params.f16063g) ? params.f16059c : params.f16063g;
        if (TextUtils.isEmpty(str)) {
            str = params.f16058b;
        }
        wXTextObject.text = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = wXTextObject.text;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        String str2 = params.f16057a;
        if (str2 == null) {
            str2 = "";
        }
        req.transaction = xb.f.o(str2);
        req.message = wXMediaMessage;
        req.scene = type;
        C.sendReq(req);
    }

    public static void N(ShareParams params, byte[] thumb, Context context, int type) {
        IWXAPI C = C(context);
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = params.f16057a;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
        wXMediaMessage.title = params.f16058b;
        wXMediaMessage.description = params.f16059c;
        wXMediaMessage.thumbData = thumb;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        String str = params.f16057a;
        if (str == null) {
            str = "";
        }
        req.transaction = xb.f.o(str);
        req.message = wXMediaMessage;
        req.scene = type;
        C.sendReq(req);
    }

    public static boolean r() {
        return true;
    }

    public static boolean s(Context context) {
        return C(context).getWXAppSupportAPI() >= 654314752;
    }

    public static byte[] v(Bitmap bitmap, int width, int height) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (OutOfMemoryError e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length <= 32768) {
                FileUtils.closeQuietly(byteArrayOutputStream);
                return byteArray;
            }
            byteArrayOutputStream.reset();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            float f11 = byteArray.length / 32768 < 10 ? 0.8f : 0.5f;
            qb.c.b(f16010g, "compress factor: " + f11 + "; length: " + byteArray.length, new Object[0]);
            byte[] v11 = v(createScaledBitmap, (int) (((float) width) * f11), (int) (((float) height) * f11));
            FileUtils.closeQuietly(byteArrayOutputStream);
            return v11;
        } catch (OutOfMemoryError e12) {
            e = e12;
            byteArrayOutputStream2 = byteArrayOutputStream;
            qb.c.c(f16010g, "OutOfMemoryError occurred when compress. ", e);
            byte[] bArr = new byte[0];
            FileUtils.closeQuietly(byteArrayOutputStream2);
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            FileUtils.closeQuietly(byteArrayOutputStream2);
            throw th;
        }
    }

    public static byte[] w(Bitmap bitmap, int quality) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 200, (int) ((bitmap.getHeight() / bitmap.getWidth()) * 200.0f), true);
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            while (byteArray.length > 32768) {
                byteArrayOutputStream.reset();
                quality = quality <= 10 ? quality - 2 : quality - 10;
                if (quality == 0) {
                    quality = 1;
                }
                createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                qb.c.b(f16010g, "compress quality: " + quality + "; length: " + byteArray.length, new Object[0]);
            }
            FileUtils.closeQuietly(byteArrayOutputStream);
            return byteArray;
        } catch (OutOfMemoryError e12) {
            e = e12;
            byteArrayOutputStream2 = byteArrayOutputStream;
            qb.c.c(f16010g, "OutOfMemoryError occurred when compress. ", e);
            byte[] bArr = new byte[0];
            FileUtils.closeQuietly(byteArrayOutputStream2);
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            FileUtils.closeQuietly(byteArrayOutputStream2);
            throw th;
        }
    }

    public static byte[] x(Bitmap bitmap, int quality, int maxSize) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (OutOfMemoryError e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            while (byteArray.length > maxSize) {
                byteArrayOutputStream.reset();
                quality = quality <= 10 ? quality - 2 : quality - 10;
                if (quality == 0) {
                    quality = 1;
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                qb.c.b(f16010g, "compress quality: " + quality + "; length: " + byteArray.length, new Object[0]);
            }
            FileUtils.closeQuietly(byteArrayOutputStream);
            return byteArray;
        } catch (OutOfMemoryError e12) {
            e = e12;
            byteArrayOutputStream2 = byteArrayOutputStream;
            qb.c.c(f16010g, "OutOfMemoryError occurred when compress. ", e);
            byte[] bArr = new byte[0];
            FileUtils.closeQuietly(byteArrayOutputStream2);
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            FileUtils.closeQuietly(byteArrayOutputStream2);
            throw th;
        }
    }

    public static String z(Context context, File file) {
        if (file != null && file.exists()) {
            if (s(context) && r()) {
                Uri uriForFile = FileProvider.getUriForFile(context, "com.jiongji.andriod.card.fileprovider", file);
                context.grantUriPermission("com.tencent.mm", uriForFile, 1);
                return uriForFile.toString();
            }
            qb.c.q(f16010g, "share by file provider unsupported", new Object[0]);
        }
        return null;
    }

    public void B(String code) {
        ThirdPartyUserInfo thirdPartyUserInfo = this.f16022f;
        rb.f.d(new StringRequest((thirdPartyUserInfo == null || code != null) ? String.format(Locale.CHINA, f16011h, b9.a.f6458g, b9.a.f6459h, code) : String.format(Locale.CHINA, f16012i, b9.a.f6458g, thirdPartyUserInfo.refreshToken), new a(), new b()));
    }

    public void D(Context context, String userName, String path, Integer programType) {
        IWXAPI C = C(context);
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = userName;
        req.path = path;
        req.miniprogramType = 0;
        if (programType != null && programType.intValue() >= 0 && programType.intValue() <= 2) {
            req.miniprogramType = programType.intValue();
        }
        C.sendReq(req);
    }

    public void E() {
        this.f16017a = null;
        this.f16022f = null;
    }

    public void F() {
        this.f16018b = null;
        this.f16020d = null;
        h hVar = this.f16021e;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f16021e.unsubscribe();
    }

    public void G() {
        this.f16019c = null;
    }

    public void H(final Context context, final int type, final ShareParams params, final Bitmap bitmap, final Bitmap thumb, final ShareDelegate.b shareListener, final ShareChannel media) {
        this.f16018b = shareListener;
        this.f16020d = media;
        h hVar = this.f16021e;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f16021e.unsubscribe();
        }
        this.f16021e = rx.c.z2(new e(params, thumb, bitmap)).w5(bc0.c.a()).I3(tb0.a.a()).r5(new f(context, type, params, bitmap));
    }

    public void I() {
        ShareDelegate.b bVar = this.f16018b;
        if (bVar != null) {
            bVar.onShareError(this.f16020d, new AuthException(-3));
        }
        F();
    }

    public void L(final Context context, final int type, final ShareParams params, final ShareDelegate.b shareListener, final ShareChannel media) {
        this.f16018b = shareListener;
        this.f16020d = media;
        M(params, context, type);
    }

    public void l(Context context, a.InterfaceC0141a callback) {
        this.f16017a = callback;
        IWXAPI C = C(context);
        if (!C.isWXAppInstalled()) {
            if (callback != null) {
                callback.onError(new AuthException(-4));
                return;
            }
            return;
        }
        if (callback != null) {
            callback.onStart();
        }
        if (this.f16022f != null) {
            B(null);
            return;
        }
        ThirdPartyUserInfo thirdPartyUserInfo = new ThirdPartyUserInfo();
        this.f16022f = thirdPartyUserInfo;
        thirdPartyUserInfo.provider = "weixin";
        thirdPartyUserInfo.loginType = 4;
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "baicizhan";
        C.sendReq(req);
    }

    public void m(Context context, int scene, String reserved, a.c callback) {
        this.f16019c = callback;
        IWXAPI C = C(context);
        if (!C.isWXAppInstalled()) {
            if (callback != null) {
                callback.onError(new AuthException(-4));
            }
        } else {
            SubscribeMessage.Req req = new SubscribeMessage.Req();
            req.scene = scene;
            req.templateID = b9.a.f6460i;
            req.reserved = reserved;
            C.sendReq(req);
        }
    }

    public void n(int errCode, String errMsg) {
        a.c cVar = this.f16019c;
        if (cVar != null) {
            cVar.onError(new AuthException(errCode, errMsg));
        }
        G();
    }

    public void o() {
        a.InterfaceC0141a interfaceC0141a = this.f16017a;
        if (interfaceC0141a != null) {
            interfaceC0141a.onCancel();
        }
        E();
    }

    public void p() {
        a.c cVar = this.f16019c;
        if (cVar != null) {
            cVar.onCancel();
        }
        G();
    }

    public void q() {
        ShareDelegate.b bVar = this.f16018b;
        if (bVar != null) {
            bVar.onShareCancel();
        }
        F();
    }

    public void t(g resp) {
        a.c cVar = this.f16019c;
        if (cVar != null) {
            cVar.onComplete(resp);
        }
        G();
    }

    public void u() {
        ShareDelegate.b bVar = this.f16018b;
        if (bVar != null) {
            bVar.onShareSuccess(this.f16020d);
        }
        F();
    }

    public final void y(AccessTokenResp resp) {
        rb.f.d(new StringRequest(String.format(Locale.CHINA, f16013j, resp.access_token, resp.openid), new c(), new d()));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends qb0.g<byte[]> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<Context> f16033a;

        /* renamed from: b, reason: collision with root package name */
        public int f16034b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f16035c;

        /* renamed from: d, reason: collision with root package name */
        public ShareParams f16036d;

        public f(Context context, int type, ShareParams params, Bitmap bitmap) {
            this.f16033a = new WeakReference<>(context);
            this.f16034b = type;
            this.f16036d = params;
            this.f16035c = bitmap;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(WeixinAuthHelper.f16010g, "compress bmp failed when share to weixin: " + e11, new Object[0]);
            WeixinAuthHelper A = WeixinAuthHelper.A();
            if (this.f16033a.get() == null) {
                A.F();
                return;
            }
            if (A.f16018b != null) {
                A.f16018b.onShareError(A.f16020d, e11);
            }
            A.F();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(byte[] data) {
            WeixinAuthHelper A = WeixinAuthHelper.A();
            Context context = this.f16033a.get();
            if (context == null) {
                A.F();
                return;
            }
            ShareParams shareParams = this.f16036d;
            ShareParams.ShareType shareType = shareParams.f16061e;
            if (shareType == ShareParams.ShareType.IMAGE) {
                WeixinAuthHelper.J(shareParams, data, context, this.f16034b, this.f16035c);
            } else if (shareType == ShareParams.ShareType.MINI_PROGRAM) {
                WeixinAuthHelper.K(shareParams, context, data);
            } else {
                WeixinAuthHelper.N(shareParams, data, context, this.f16034b);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}

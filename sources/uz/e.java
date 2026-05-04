package uz;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.igexin.assist.sdk.AssistPushConsts;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.web.WebActivity;
import dw.b;
import gw.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public WeiboMultiMessage f92776c;

    /* renamed from: d, reason: collision with root package name */
    public String f92777d;

    /* renamed from: e, reason: collision with root package name */
    public String f92778e;

    /* renamed from: f, reason: collision with root package name */
    public String f92779f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f92780g;

    /* renamed from: h, reason: collision with root package name */
    public String f92781h;

    public e(Context context) {
        this.f92772a = context;
    }

    @Override // uz.b
    public final String a() {
        Uri.Builder buildUpon = Uri.parse("https://service.weibo.com/share/mobilesdk.php").buildUpon();
        buildUpon.appendQueryParameter("title", this.f92779f);
        buildUpon.appendQueryParameter("version", "0041005000");
        String appKey = this.f92773b.f41599a.getAppKey();
        if (!TextUtils.isEmpty(appKey)) {
            buildUpon.appendQueryParameter("source", appKey);
        }
        if (!TextUtils.isEmpty(this.f92777d)) {
            buildUpon.appendQueryParameter("access_token", this.f92777d);
        }
        if (!TextUtils.isEmpty(this.f92778e)) {
            buildUpon.appendQueryParameter("packagename", this.f92778e);
        }
        if (!TextUtils.isEmpty(this.f92781h)) {
            buildUpon.appendQueryParameter("picinfo", this.f92781h);
        }
        buildUpon.appendQueryParameter("luicode", "10000360");
        buildUpon.appendQueryParameter("lfid", AssistPushConsts.OPPO_PREFIX + appKey);
        return buildUpon.build().toString();
    }

    @Override // uz.b
    public final void b(Bundle bundle) {
        byte[] bArr;
        FileInputStream fileInputStream;
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        this.f92776c = weiboMultiMessage;
        weiboMultiMessage.readFromBundle(bundle);
        this.f92777d = bundle.getString("token");
        this.f92778e = bundle.getString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME);
        StringBuilder sb2 = new StringBuilder();
        TextObject textObject = this.f92776c.textObject;
        if (textObject != null) {
            sb2.append(textObject.text);
        }
        ImageObject imageObject = this.f92776c.imageObject;
        if (imageObject != null) {
            String str = imageObject.imagePath;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    byte[] bArr2 = new byte[(int) file.length()];
                    FileInputStream fileInputStream2 = null;
                    try {
                        try {
                            fileInputStream = new FileInputStream(file);
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                    }
                    try {
                        fileInputStream.read(bArr2);
                        this.f92780g = f.d(bArr2);
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    } catch (Exception e13) {
                        e = e13;
                        fileInputStream2 = fileInputStream;
                        e.printStackTrace();
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        bArr = imageObject.imageData;
                        if (bArr != null) {
                            this.f92780g = f.d(bArr);
                        }
                        this.f92779f = sb2.toString();
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            }
            bArr = imageObject.imageData;
            if (bArr != null && bArr.length > 0) {
                this.f92780g = f.d(bArr);
            }
        }
        this.f92779f = sb2.toString();
    }

    @Override // uz.b
    public final void c(WebActivity.a aVar) {
        b.a.f48183a.a(new dw.e(this.f92772a, new String(this.f92780g), this.f92773b.f41599a.getAppKey(), this.f92777d, new d(this, aVar)));
    }

    @Override // uz.b
    public final boolean d() {
        byte[] bArr = this.f92780g;
        return bArr != null && bArr.length > 0;
    }
}

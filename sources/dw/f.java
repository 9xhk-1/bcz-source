package dw;

import android.os.Bundle;
import com.heytap.mcssdk.constant.IntentConstant;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import r.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends c<Void, Void, String> {

    /* renamed from: e, reason: collision with root package name */
    public r.b<String> f48198e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f48199f;

    /* renamed from: g, reason: collision with root package name */
    public String f48200g;

    /* renamed from: h, reason: collision with root package name */
    public Oauth2AccessToken f48201h;

    public f(String str, Oauth2AccessToken oauth2AccessToken, AccessTokenHelper.a aVar) {
        this.f48200g = str;
        this.f48201h = oauth2AccessToken;
        this.f48198e = aVar;
    }

    @Override // dw.c
    public final String a() {
        try {
            c.a aVar = new c.a();
            aVar.f82765a = "https://api.weibo.com/oauth2/access_token";
            String str = this.f48200g;
            Bundle bundle = aVar.f82767c;
            if (str != null) {
                bundle.putString("client_id", str);
            }
            String str2 = this.f48200g;
            Bundle bundle2 = aVar.f82767c;
            if (str2 != null) {
                bundle2.putString(IntentConstant.APP_KEY, str2);
            }
            aVar.f82767c.putString("grant_type", Oauth2AccessToken.KEY_REFRESH_TOKEN);
            String refreshToken = this.f48201h.getRefreshToken();
            Bundle bundle3 = aVar.f82767c;
            if (refreshToken != null) {
                bundle3.putString(Oauth2AccessToken.KEY_REFRESH_TOKEN, refreshToken);
            }
            r.d a11 = r.a.a(new r.c(aVar));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = a11.f82772a.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e11) {
                throw e11;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            this.f48199f = th2;
            return null;
        }
    }

    @Override // dw.c
    public final void b(String str) {
        String str2 = str;
        Throwable th2 = this.f48199f;
        if (th2 != null) {
            r.b<String> bVar = this.f48198e;
            if (bVar != null) {
                bVar.a(th2);
                return;
            }
            return;
        }
        r.b<String> bVar2 = this.f48198e;
        if (bVar2 != null) {
            bVar2.a((r.b<String>) str2);
        }
    }
}

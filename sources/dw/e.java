package dw;

import android.content.Context;
import android.os.Bundle;
import com.heytap.mcssdk.constant.IntentConstant;
import com.sina.weibo.sdk.net.HttpManager;
import com.tencent.open.SocialConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jx.b;
import r.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends c<Void, Void, String> {

    /* renamed from: e, reason: collision with root package name */
    public Context f48192e;

    /* renamed from: f, reason: collision with root package name */
    public r.b<String> f48193f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f48194g;

    /* renamed from: h, reason: collision with root package name */
    public String f48195h;

    /* renamed from: i, reason: collision with root package name */
    public String f48196i;

    /* renamed from: j, reason: collision with root package name */
    public String f48197j;

    public e(Context context, String str, String str2, String str3, uz.d dVar) {
        this.f48192e = context;
        this.f48195h = str;
        this.f48196i = str2;
        this.f48197j = str3;
        this.f48193f = dVar;
    }

    @Override // dw.c
    public final String a() {
        try {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            c.a aVar = new c.a();
            aVar.f82765a = "https://service.weibo.com/share/mobilesdk_uppic.php";
            Bundle bundle = aVar.f82766b;
            if (valueOf != null) {
                bundle.putString(b.c.f64706k, valueOf);
            }
            String a11 = HttpManager.a(this.f48192e, this.f48197j, this.f48196i, valueOf);
            Bundle bundle2 = aVar.f82766b;
            if (a11 != null) {
                bundle2.putString("oauth_sign", a11);
            }
            String str = this.f48196i;
            Bundle bundle3 = aVar.f82767c;
            if (str != null) {
                bundle3.putString(IntentConstant.APP_KEY, str);
            }
            Bundle bundle4 = aVar.f82767c;
            if (valueOf != null) {
                bundle4.putString(b.c.f64706k, valueOf);
            }
            String a12 = HttpManager.a(this.f48192e, this.f48197j, this.f48196i, valueOf);
            Bundle bundle5 = aVar.f82767c;
            if (a12 != null) {
                bundle5.putString("oauth_sign", a12);
            }
            String str2 = this.f48195h;
            Bundle bundle6 = aVar.f82767c;
            if (str2 != null) {
                bundle6.putString(SocialConstants.PARAM_IMG_URL, str2);
            }
            r.d a13 = r.a.a(new r.c(aVar));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = a13.f82772a.read(bArr);
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
            this.f48194g = th2;
            return null;
        }
    }

    @Override // dw.c
    public final void b(String str) {
        String str2 = str;
        Throwable th2 = this.f48194g;
        if (th2 != null) {
            r.b<String> bVar = this.f48193f;
            if (bVar != null) {
                bVar.a(th2);
                return;
            }
            return;
        }
        r.b<String> bVar2 = this.f48193f;
        if (bVar2 != null) {
            bVar2.a((r.b<String>) str2);
        }
    }
}

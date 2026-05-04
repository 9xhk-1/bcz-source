package uz;

import android.text.TextUtils;
import com.sina.weibo.sdk.web.WebActivity;
import org.json.JSONException;
import org.json.JSONObject;
import uz.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements r.b<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.a f92774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f92775b;

    public d(e eVar, WebActivity.a aVar) {
        this.f92775b = eVar;
        this.f92774a = aVar;
    }

    @Override // r.b
    public final void a(String str) {
        String str2 = str;
        gw.c.a("WbShareTag", "handle image result :" + str2);
        if (TextUtils.isEmpty(str2)) {
            b.a aVar = this.f92774a;
            if (aVar != null) {
                WebActivity.this.f41596g.b("处理图片，服务端返回null!");
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int optInt = jSONObject.optInt("code");
            String optString = jSONObject.optString("data");
            if (optInt != 1 || TextUtils.isEmpty(optString)) {
                b.a aVar2 = this.f92774a;
                if (aVar2 != null) {
                    WebActivity.this.f41596g.b("图片内容不合适，禁止上传！");
                    return;
                }
                return;
            }
            this.f92775b.f92781h = optString;
            b.a aVar3 = this.f92774a;
            if (aVar3 != null) {
                WebActivity.a aVar4 = (WebActivity.a) aVar3;
                String a11 = WebActivity.this.f41595f.a();
                if (TextUtils.isEmpty(a11)) {
                    return;
                }
                WebActivity.this.getClass();
                if (TextUtils.isEmpty(a11)) {
                    return;
                }
                if (!a11.startsWith("https://service.weibo.com/share/mobilesdk.php") && !a11.startsWith("https://open.weibo.cn/oauth2/authorize?")) {
                    return;
                }
                WebActivity.this.f41593d.loadUrl(a11);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
            b.a aVar5 = this.f92774a;
            if (aVar5 != null) {
                WebActivity.this.f41596g.b("解析服务端返回的字符串时发生异常！");
            }
        }
    }

    @Override // r.b
    public final void a(Throwable th2) {
        b.a aVar = this.f92774a;
        if (aVar != null) {
            WebActivity.this.f41596g.b(th2.getMessage());
        }
    }
}

package cn.com.chinatelecom.account.api.d;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import cn.com.chinatelecom.account.api.ClientUtils;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: l, reason: collision with root package name */
    private String f8976l;

    /* renamed from: o, reason: collision with root package name */
    private int f8979o;

    /* renamed from: q, reason: collision with root package name */
    private long f8981q;

    /* renamed from: t, reason: collision with root package name */
    private int f8984t;

    /* renamed from: w, reason: collision with root package name */
    private long f8987w;

    /* renamed from: r, reason: collision with root package name */
    private long f8982r = -1;

    /* renamed from: u, reason: collision with root package name */
    private StringBuffer f8985u = new StringBuffer();

    /* renamed from: c, reason: collision with root package name */
    private String f8967c = "";

    /* renamed from: e, reason: collision with root package name */
    private String f8969e = "";

    /* renamed from: n, reason: collision with root package name */
    private String f8978n = "";

    /* renamed from: m, reason: collision with root package name */
    private String f8977m = "";

    /* renamed from: p, reason: collision with root package name */
    private String f8980p = "";

    /* renamed from: a, reason: collision with root package name */
    private String f8965a = "1.2";

    /* renamed from: v, reason: collision with root package name */
    private long f8986v = SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    private String f8966b = a(System.currentTimeMillis());

    /* renamed from: d, reason: collision with root package name */
    private String f8968d = cn.com.chinatelecom.account.api.a.f8832a;

    /* renamed from: f, reason: collision with root package name */
    private String f8970f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f8971g = Build.BRAND;

    /* renamed from: h, reason: collision with root package name */
    private String f8972h = Build.MODEL;

    /* renamed from: i, reason: collision with root package name */
    private String f8973i = "Android";

    /* renamed from: j, reason: collision with root package name */
    private String f8974j = Build.VERSION.RELEASE;

    /* renamed from: k, reason: collision with root package name */
    private String f8975k = ClientUtils.getSdkVersion();

    /* renamed from: s, reason: collision with root package name */
    private String f8983s = "0";

    public e(String str) {
        this.f8976l = str;
    }

    public e a(int i11) {
        this.f8979o = i11;
        return this;
    }

    public e b(int i11) {
        this.f8984t = i11;
        return this;
    }

    public e c(String str) {
        this.f8977m = str;
        return this;
    }

    public e d(String str) {
        this.f8978n = str;
        return this;
    }

    public e e(String str) {
        this.f8980p = str;
        return this;
    }

    public e f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8983s = str;
        }
        return this;
    }

    public e g(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuffer stringBuffer = this.f8985u;
            stringBuffer.append(str);
            stringBuffer.append(com.alipay.sdk.m.u.i.f11097b);
        }
        return this;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", this.f8965a);
            jSONObject.put("t", this.f8966b);
            jSONObject.put("tag", this.f8967c);
            jSONObject.put("ai", this.f8968d);
            jSONObject.put(AppIconSetting.DEFAULT_LARGE_ICON, this.f8969e);
            jSONObject.put(NotificationStyle.NOTIFICATION_STYLE, this.f8970f);
            jSONObject.put("br", this.f8971g);
            jSONObject.put("ml", this.f8972h);
            jSONObject.put("os", this.f8973i);
            jSONObject.put("ov", this.f8974j);
            jSONObject.put(com.alipay.sdk.m.s.a.f11006t, this.f8975k);
            jSONObject.put("ri", this.f8976l);
            jSONObject.put(s3.c.f87469a, this.f8977m);
            jSONObject.put("p", this.f8978n);
            jSONObject.put("rt", this.f8979o);
            jSONObject.put("msg", this.f8980p);
            jSONObject.put("st", this.f8981q);
            jSONObject.put("tt", this.f8982r);
            jSONObject.put(CmcdConfiguration.KEY_OBJECT_TYPE, this.f8983s);
            jSONObject.put("rec", this.f8984t);
            jSONObject.put("ep", this.f8985u.toString());
            return jSONObject.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public e a(String str) {
        this.f8969e = str;
        return this;
    }

    public e b(long j11) {
        if (j11 >= 0) {
            this.f8981q = j11;
        }
        return this;
    }

    public void c() {
        this.f8986v = SystemClock.uptimeMillis();
    }

    public String a() {
        return this.f8976l;
    }

    public e b(String str) {
        this.f8970f = str;
        return this;
    }

    public void c(long j11) {
        this.f8982r = j11;
    }

    public static String a(long j11) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA).format(new Date(j11));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public void b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f8987w = uptimeMillis;
        if (this.f8982r == -1) {
            this.f8982r = uptimeMillis - this.f8986v;
        }
    }
}

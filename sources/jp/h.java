package jp;

import androidx.core.net.MailTo;
import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class h extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String[] f64554b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f64555c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f64556d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64557e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64558f;

    public h(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(30);
        q.d(this.f64554b, sb2);
        q.d(this.f64555c, sb2);
        q.d(this.f64556d, sb2);
        q.c(this.f64557e, sb2);
        q.c(this.f64558f, sb2);
        return sb2.toString();
    }

    public String[] e() {
        return this.f64556d;
    }

    public String f() {
        return this.f64558f;
    }

    public String[] g() {
        return this.f64555c;
    }

    @Deprecated
    public String h() {
        String[] strArr = this.f64554b;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    public String i() {
        return MailTo.MAILTO_SCHEME;
    }

    public String j() {
        return this.f64557e;
    }

    public String[] k() {
        return this.f64554b;
    }

    public h(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.f64554b = strArr;
        this.f64555c = strArr2;
        this.f64556d = strArr3;
        this.f64557e = str;
        this.f64558f = str2;
    }
}

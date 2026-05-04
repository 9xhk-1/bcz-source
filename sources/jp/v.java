package jp;

import com.google.zxing.client.result.ParsedResultType;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String[] f64602b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f64603c;

    /* renamed from: d, reason: collision with root package name */
    public final String f64604d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64605e;

    public v(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.f64602b = new String[]{str};
        this.f64603c = new String[]{str2};
        this.f64604d = str3;
        this.f64605e = str4;
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.d(this.f64602b, sb2);
        q.c(this.f64604d, sb2);
        q.c(this.f64605e, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f64605e;
    }

    public String[] f() {
        return this.f64602b;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sms:");
        boolean z11 = true;
        for (int i11 = 0; i11 < this.f64602b.length; i11++) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(this.f64602b[i11]);
            String[] strArr = this.f64603c;
            if (strArr != null && strArr[i11] != null) {
                sb2.append(";via=");
                sb2.append(this.f64603c[i11]);
            }
        }
        boolean z12 = this.f64605e != null;
        boolean z13 = this.f64604d != null;
        if (z12 || z13) {
            sb2.append(s60.d.f88057a);
            if (z12) {
                sb2.append("body=");
                sb2.append(this.f64605e);
            }
            if (z13) {
                if (z12) {
                    sb2.append(u0.f91708d);
                }
                sb2.append("subject=");
                sb2.append(this.f64604d);
            }
        }
        return sb2.toString();
    }

    public String h() {
        return this.f64604d;
    }

    public String[] i() {
        return this.f64603c;
    }

    public v(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.f64602b = strArr;
        this.f64603c = strArr2;
        this.f64604d = str;
        this.f64605e = str2;
    }
}

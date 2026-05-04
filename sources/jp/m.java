package jp;

import com.google.zxing.client.result.ParsedResultType;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m extends q {

    /* renamed from: b, reason: collision with root package name */
    public final double f64588b;

    /* renamed from: c, reason: collision with root package name */
    public final double f64589c;

    /* renamed from: d, reason: collision with root package name */
    public final double f64590d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64591e;

    public m(double d11, double d12, double d13, String str) {
        super(ParsedResultType.GEO);
        this.f64588b = d11;
        this.f64589c = d12;
        this.f64590d = d13;
        this.f64591e = str;
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(this.f64588b);
        sb2.append(j2.O);
        sb2.append(this.f64589c);
        if (this.f64590d > 0.0d) {
            sb2.append(j2.O);
            sb2.append(this.f64590d);
            sb2.append(io.ktor.util.date.b.f61998d);
        }
        if (this.f64591e != null) {
            sb2.append(" (");
            sb2.append(this.f64591e);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public double e() {
        return this.f64590d;
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geo:");
        sb2.append(this.f64588b);
        sb2.append(',');
        sb2.append(this.f64589c);
        if (this.f64590d > 0.0d) {
            sb2.append(',');
            sb2.append(this.f64590d);
        }
        if (this.f64591e != null) {
            sb2.append(s60.d.f88057a);
            sb2.append(this.f64591e);
        }
        return sb2.toString();
    }

    public double g() {
        return this.f64588b;
    }

    public double h() {
        return this.f64589c;
    }

    public String i() {
        return this.f64591e;
    }
}

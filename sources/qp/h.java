package qp;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f82590a;

    /* renamed from: b, reason: collision with root package name */
    public SymbolShapeHint f82591b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.zxing.c f82592c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.zxing.c f82593d;

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f82594e;

    /* renamed from: f, reason: collision with root package name */
    public int f82595f;

    /* renamed from: g, reason: collision with root package name */
    public int f82596g;

    /* renamed from: h, reason: collision with root package name */
    public k f82597h;

    /* renamed from: i, reason: collision with root package name */
    public int f82598i;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = (char) (bytes[i11] & 255);
            if (c11 == '?' && str.charAt(i11) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c11);
        }
        this.f82590a = sb2.toString();
        this.f82591b = SymbolShapeHint.FORCE_NONE;
        this.f82594e = new StringBuilder(str.length());
        this.f82596g = -1;
    }

    public int a() {
        return this.f82594e.length();
    }

    public StringBuilder b() {
        return this.f82594e;
    }

    public char c() {
        return this.f82590a.charAt(this.f82595f);
    }

    public char d() {
        return this.f82590a.charAt(this.f82595f);
    }

    public String e() {
        return this.f82590a;
    }

    public int f() {
        return this.f82596g;
    }

    public int g() {
        return i() - this.f82595f;
    }

    public k h() {
        return this.f82597h;
    }

    public final int i() {
        return this.f82590a.length() - this.f82598i;
    }

    public boolean j() {
        return this.f82595f < i();
    }

    public void k() {
        this.f82596g = -1;
    }

    public void l() {
        this.f82597h = null;
    }

    public void m(com.google.zxing.c cVar, com.google.zxing.c cVar2) {
        this.f82592c = cVar;
        this.f82593d = cVar2;
    }

    public void n(int i11) {
        this.f82598i = i11;
    }

    public void o(SymbolShapeHint symbolShapeHint) {
        this.f82591b = symbolShapeHint;
    }

    public void p(int i11) {
        this.f82596g = i11;
    }

    public void q() {
        r(a());
    }

    public void r(int i11) {
        k kVar = this.f82597h;
        if (kVar == null || i11 > kVar.b()) {
            this.f82597h = k.o(i11, this.f82591b, this.f82592c, this.f82593d, true);
        }
    }

    public void s(char c11) {
        this.f82594e.append(c11);
    }

    public void t(String str) {
        this.f82594e.append(str);
    }
}

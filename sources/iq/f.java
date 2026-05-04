package iq;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import gq.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final int f62686f = 8;

    /* renamed from: a, reason: collision with root package name */
    public Mode f62687a;

    /* renamed from: b, reason: collision with root package name */
    public ErrorCorrectionLevel f62688b;

    /* renamed from: c, reason: collision with root package name */
    public h f62689c;

    /* renamed from: d, reason: collision with root package name */
    public int f62690d = -1;

    /* renamed from: e, reason: collision with root package name */
    public b f62691e;

    public static boolean f(int i11) {
        return i11 >= 0 && i11 < 8;
    }

    public ErrorCorrectionLevel a() {
        return this.f62688b;
    }

    public int b() {
        return this.f62690d;
    }

    public b c() {
        return this.f62691e;
    }

    public Mode d() {
        return this.f62687a;
    }

    public h e() {
        return this.f62689c;
    }

    public void g(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f62688b = errorCorrectionLevel;
    }

    public void h(int i11) {
        this.f62690d = i11;
    }

    public void i(b bVar) {
        this.f62691e = bVar;
    }

    public void j(Mode mode) {
        this.f62687a = mode;
    }

    public void k(h hVar) {
        this.f62689c = hVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f62687a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f62688b);
        sb2.append("\n version: ");
        sb2.append(this.f62689c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f62690d);
        if (this.f62691e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f62691e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}

package em;

import android.graphics.Paint;
import rm.g;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends b {

    /* renamed from: h, reason: collision with root package name */
    public g f49907h;

    /* renamed from: g, reason: collision with root package name */
    public String f49906g = "Description Label";

    /* renamed from: i, reason: collision with root package name */
    public Paint.Align f49908i = Paint.Align.RIGHT;

    public c() {
        this.f49904e = k.e(8.0f);
    }

    public g m() {
        return this.f49907h;
    }

    public String n() {
        return this.f49906g;
    }

    public Paint.Align o() {
        return this.f49908i;
    }

    public void p(float f11, float f12) {
        g gVar = this.f49907h;
        if (gVar == null) {
            this.f49907h = g.c(f11, f12);
        } else {
            gVar.f84265c = f11;
            gVar.f84266d = f12;
        }
    }

    public void q(String str) {
        this.f49906g = str;
    }

    public void r(Paint.Align align) {
        this.f49908i = align;
    }
}

package lm;

import android.view.View;
import rm.h;
import rm.i;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends e {

    /* renamed from: i, reason: collision with root package name */
    public static h<d> f71521i;

    static {
        h<d> a11 = h.a(2, new d(null, 0.0f, 0.0f, null, null));
        f71521i = a11;
        a11.l(0.5f);
    }

    public d(l lVar, float f11, float f12, i iVar, View view) {
        super(lVar, f11, f12, iVar, view);
    }

    public static d d(l lVar, float f11, float f12, i iVar, View view) {
        d b11 = f71521i.b();
        b11.f71523d = lVar;
        b11.f71524e = f11;
        b11.f71525f = f12;
        b11.f71526g = iVar;
        b11.f71527h = view;
        return b11;
    }

    public static void e(d dVar) {
        f71521i.h(dVar);
    }

    @Override // rm.h.a
    public h.a a() {
        return new d(this.f71523d, this.f71524e, this.f71525f, this.f71526g, this.f71527h);
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = this.f71522c;
        fArr[0] = this.f71524e;
        fArr[1] = this.f71525f;
        this.f71526g.o(fArr);
        this.f71523d.e(this.f71522c, this.f71527h);
        e(this);
    }
}

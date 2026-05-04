package bo;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import bo.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f7034a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f7035b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f7036c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final vn.q f7037d = vn.q.k();

    /* renamed from: e, reason: collision with root package name */
    public vn.p f7038e;

    public void a(Canvas canvas) {
        canvas.clipPath(this.f7034a);
    }

    public void b(float f11, vn.p pVar, vn.p pVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        vn.p p11 = v.p(pVar, pVar2, rectF, rectF3, eVar.d(), eVar.c(), f11);
        this.f7038e = p11;
        this.f7037d.d(p11, 1.0f, rectF2, this.f7035b);
        this.f7037d.d(this.f7038e, 1.0f, rectF3, this.f7036c);
        this.f7034a.op(this.f7035b, this.f7036c, Path.Op.UNION);
    }

    public vn.p c() {
        return this.f7038e;
    }

    public Path d() {
        return this.f7034a;
    }
}

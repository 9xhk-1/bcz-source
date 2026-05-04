package co;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import co.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f9395a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f9396b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f9397c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final vn.q f9398d = vn.q.k();

    /* renamed from: e, reason: collision with root package name */
    public vn.p f9399e;

    public void a(Canvas canvas) {
        canvas.clipPath(this.f9395a);
    }

    public void b(float f11, vn.p pVar, vn.p pVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        vn.p p11 = w.p(pVar, pVar2, rectF, rectF3, eVar.d(), eVar.c(), f11);
        this.f9399e = p11;
        this.f9398d.d(p11, 1.0f, rectF2, this.f9396b);
        this.f9398d.d(this.f9399e, 1.0f, rectF3, this.f9397c);
        this.f9395a.op(this.f9396b, this.f9397c, Path.Op.UNION);
    }

    public vn.p c() {
        return this.f9399e;
    }

    public Path d() {
        return this.f9395a;
    }
}

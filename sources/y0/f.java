package y0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements n, a.b, k {

    /* renamed from: i, reason: collision with root package name */
    public static final float f98816i = 0.55228f;

    /* renamed from: b, reason: collision with root package name */
    public final String f98818b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f98819c;

    /* renamed from: d, reason: collision with root package name */
    public final z0.a<?, PointF> f98820d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.a<?, PointF> f98821e;

    /* renamed from: f, reason: collision with root package name */
    public final e1.b f98822f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f98824h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f98817a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b f98823g = new b();

    public f(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.b bVar) {
        this.f98818b = bVar.b();
        this.f98819c = o0Var;
        z0.a<PointF, PointF> k11 = bVar.d().k();
        this.f98820d = k11;
        z0.a<PointF, PointF> k12 = bVar.c().k();
        this.f98821e = k12;
        this.f98822f = bVar;
        aVar.i(k11);
        aVar.i(k12);
        k11.a(this);
        k12.a(this);
    }

    @Override // c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        if (t11 == t0.f10201k) {
            this.f98820d.n(jVar);
        } else if (t11 == t0.f10204n) {
            this.f98821e.n(jVar);
        }
    }

    public final void c() {
        this.f98824h = false;
        this.f98819c.invalidateSelf();
    }

    @Override // z0.a.b
    public void e() {
        c();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f98823g.a(vVar);
                    vVar.b(this);
                }
            }
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98818b;
    }

    @Override // y0.n
    public Path getPath() {
        if (this.f98824h) {
            return this.f98817a;
        }
        this.f98817a.reset();
        if (this.f98822f.e()) {
            this.f98824h = true;
            return this.f98817a;
        }
        PointF h11 = this.f98820d.h();
        float f11 = h11.x / 2.0f;
        float f12 = h11.y / 2.0f;
        float f13 = f11 * 0.55228f;
        float f14 = 0.55228f * f12;
        this.f98817a.reset();
        if (this.f98822f.f()) {
            float f15 = -f12;
            this.f98817a.moveTo(0.0f, f15);
            float f16 = 0.0f - f13;
            float f17 = -f11;
            float f18 = 0.0f - f14;
            this.f98817a.cubicTo(f16, f15, f17, f18, f17, 0.0f);
            float f19 = f14 + 0.0f;
            this.f98817a.cubicTo(f17, f19, f16, f12, 0.0f, f12);
            float f21 = f13 + 0.0f;
            this.f98817a.cubicTo(f21, f12, f11, f19, f11, 0.0f);
            this.f98817a.cubicTo(f11, f18, f21, f15, 0.0f, f15);
        } else {
            float f22 = -f12;
            this.f98817a.moveTo(0.0f, f22);
            float f23 = f13 + 0.0f;
            float f24 = 0.0f - f14;
            this.f98817a.cubicTo(f23, f22, f11, f24, f11, 0.0f);
            float f25 = f14 + 0.0f;
            this.f98817a.cubicTo(f11, f25, f23, f12, 0.0f, f12);
            float f26 = 0.0f - f13;
            float f27 = -f11;
            this.f98817a.cubicTo(f26, f12, f27, f25, f27, 0.0f);
            this.f98817a.cubicTo(f27, f24, f26, f22, 0.0f, f22);
        }
        PointF h12 = this.f98821e.h();
        this.f98817a.offset(h12.x, h12.y);
        this.f98817a.close();
        this.f98823g.b(this.f98817a);
        this.f98824h = true;
        return this.f98817a;
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        j1.i.m(dVar, i11, list, dVar2, this);
    }
}

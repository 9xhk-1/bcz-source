package vn;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class r {

    /* renamed from: j, reason: collision with root package name */
    public static final float f94197j = 270.0f;

    /* renamed from: k, reason: collision with root package name */
    public static final float f94198k = 180.0f;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f94199a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f94200b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f94201c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f94202d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f94203e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f94204f;

    /* renamed from: g, reason: collision with root package name */
    public final List<h> f94205g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final List<j> f94206h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f94207i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f94208c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f94209d;

        public a(List list, Matrix matrix) {
            this.f94208c = list;
            this.f94209d = matrix;
        }

        @Override // vn.r.j
        public void a(Matrix matrix, un.b bVar, int i11, Canvas canvas) {
            Iterator it = this.f94208c.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(this.f94209d, bVar, i11, canvas);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends j {

        /* renamed from: c, reason: collision with root package name */
        public final e f94211c;

        public b(e eVar) {
            this.f94211c = eVar;
        }

        @Override // vn.r.j
        public void a(Matrix matrix, @NonNull un.b bVar, int i11, @NonNull Canvas canvas) {
            bVar.a(canvas, matrix, new RectF(this.f94211c.k(), this.f94211c.o(), this.f94211c.l(), this.f94211c.j()), i11, this.f94211c.m(), this.f94211c.n());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends j {

        /* renamed from: c, reason: collision with root package name */
        public final g f94212c;

        /* renamed from: d, reason: collision with root package name */
        public final g f94213d;

        /* renamed from: e, reason: collision with root package name */
        public final float f94214e;

        /* renamed from: f, reason: collision with root package name */
        public final float f94215f;

        public c(g gVar, g gVar2, float f11, float f12) {
            this.f94212c = gVar;
            this.f94213d = gVar2;
            this.f94214e = f11;
            this.f94215f = f12;
        }

        @Override // vn.r.j
        public void a(Matrix matrix, un.b bVar, int i11, Canvas canvas) {
            int i12;
            float e11 = e();
            if (e11 > 0.0f) {
                return;
            }
            double hypot = Math.hypot(this.f94212c.f94232b - this.f94214e, this.f94212c.f94233c - this.f94215f);
            double hypot2 = Math.hypot(this.f94213d.f94232b - this.f94212c.f94232b, this.f94213d.f94233c - this.f94212c.f94233c);
            float min = (float) Math.min(i11, Math.min(hypot, hypot2));
            double d11 = min;
            double tan = Math.tan(Math.toRadians((-e11) / 2.0f)) * d11;
            if (hypot > tan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                this.f94240a.set(matrix);
                this.f94240a.preTranslate(this.f94214e, this.f94215f);
                this.f94240a.preRotate(d());
                i12 = i11;
                bVar.b(canvas, this.f94240a, rectF, i12);
            } else {
                i12 = i11;
            }
            float f11 = min * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f11, f11);
            this.f94240a.set(matrix);
            this.f94240a.preTranslate(this.f94212c.f94232b, this.f94212c.f94233c);
            this.f94240a.preRotate(d());
            this.f94240a.preTranslate((float) ((-tan) - d11), (-2.0f) * min);
            bVar.c(canvas, this.f94240a, rectF2, (int) min, 450.0f, e11, new float[]{(float) (d11 + tan), f11});
            if (hypot2 > tan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                this.f94240a.set(matrix);
                this.f94240a.preTranslate(this.f94212c.f94232b, this.f94212c.f94233c);
                this.f94240a.preRotate(c());
                this.f94240a.preTranslate((float) tan, 0.0f);
                bVar.b(canvas, this.f94240a, rectF3, i12);
            }
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f94213d.f94233c - this.f94212c.f94233c) / (this.f94213d.f94232b - this.f94212c.f94232b)));
        }

        public float d() {
            return (float) Math.toDegrees(Math.atan((this.f94212c.f94233c - this.f94215f) / (this.f94212c.f94232b - this.f94214e)));
        }

        public float e() {
            float c11 = ((c() - d()) + 360.0f) % 360.0f;
            return c11 <= 180.0f ? c11 : c11 - 360.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends j {

        /* renamed from: c, reason: collision with root package name */
        public final g f94216c;

        /* renamed from: d, reason: collision with root package name */
        public final float f94217d;

        /* renamed from: e, reason: collision with root package name */
        public final float f94218e;

        public d(g gVar, float f11, float f12) {
            this.f94216c = gVar;
            this.f94217d = f11;
            this.f94218e = f12;
        }

        @Override // vn.r.j
        public void a(Matrix matrix, @NonNull un.b bVar, int i11, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f94216c.f94233c - this.f94218e, this.f94216c.f94232b - this.f94217d), 0.0f);
            this.f94240a.set(matrix);
            this.f94240a.preTranslate(this.f94217d, this.f94218e);
            this.f94240a.preRotate(c());
            bVar.b(canvas, this.f94240a, rectF, i11);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f94216c.f94233c - this.f94218e) / (this.f94216c.f94232b - this.f94217d)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends h {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f94219h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f94220b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f94221c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f94222d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f94223e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f94224f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f94225g;

        public e(float f11, float f12, float f13, float f14) {
            q(f11);
            u(f12);
            r(f13);
            p(f14);
        }

        @Override // vn.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f94234a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f94219h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f94223e;
        }

        public final float k() {
            return this.f94220b;
        }

        public final float l() {
            return this.f94222d;
        }

        public final float m() {
            return this.f94224f;
        }

        public final float n() {
            return this.f94225g;
        }

        public final float o() {
            return this.f94221c;
        }

        public final void p(float f11) {
            this.f94223e = f11;
        }

        public final void q(float f11) {
            this.f94220b = f11;
        }

        public final void r(float f11) {
            this.f94222d = f11;
        }

        public final void s(float f11) {
            this.f94224f = f11;
        }

        public final void t(float f11) {
            this.f94225g = f11;
        }

        public final void u(float f11) {
            this.f94221c = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends h {

        /* renamed from: b, reason: collision with root package name */
        public float f94226b;

        /* renamed from: c, reason: collision with root package name */
        public float f94227c;

        /* renamed from: d, reason: collision with root package name */
        public float f94228d;

        /* renamed from: e, reason: collision with root package name */
        public float f94229e;

        /* renamed from: f, reason: collision with root package name */
        public float f94230f;

        /* renamed from: g, reason: collision with root package name */
        public float f94231g;

        public f(float f11, float f12, float f13, float f14, float f15, float f16) {
            h(f11);
            j(f12);
            i(f13);
            k(f14);
            l(f15);
            m(f16);
        }

        @Override // vn.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f94234a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f94226b, this.f94227c, this.f94228d, this.f94229e, this.f94230f, this.f94231g);
            path.transform(matrix);
        }

        public final float b() {
            return this.f94226b;
        }

        public final float c() {
            return this.f94228d;
        }

        public final float d() {
            return this.f94227c;
        }

        public final float e() {
            return this.f94227c;
        }

        public final float f() {
            return this.f94230f;
        }

        public final float g() {
            return this.f94231g;
        }

        public final void h(float f11) {
            this.f94226b = f11;
        }

        public final void i(float f11) {
            this.f94228d = f11;
        }

        public final void j(float f11) {
            this.f94227c = f11;
        }

        public final void k(float f11) {
            this.f94229e = f11;
        }

        public final void l(float f11) {
            this.f94230f = f11;
        }

        public final void m(float f11) {
            this.f94231g = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends h {

        /* renamed from: b, reason: collision with root package name */
        public float f94232b;

        /* renamed from: c, reason: collision with root package name */
        public float f94233c;

        @Override // vn.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f94234a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f94232b, this.f94233c);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f94234a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends h {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f94235b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f94236c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f94237d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f94238e;

        private float h() {
            return this.f94237d;
        }

        private float i() {
            return this.f94238e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f11) {
            this.f94237d = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f11) {
            this.f94238e = f11;
        }

        @Override // vn.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f94234a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }

        public final float f() {
            return this.f94235b;
        }

        public final float g() {
            return this.f94236c;
        }

        public final void j(float f11) {
            this.f94235b = f11;
        }

        public final void k(float f11) {
            this.f94236c = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class j {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f94239b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f94240a = new Matrix();

        public abstract void a(Matrix matrix, un.b bVar, int i11, Canvas canvas);

        public final void b(un.b bVar, int i11, Canvas canvas) {
            a(f94239b, bVar, i11, canvas);
        }
    }

    public r() {
        q(0.0f, 0.0f);
    }

    public void a(float f11, float f12, float f13, float f14, float f15, float f16) {
        e eVar = new e(f11, f12, f13, f14);
        eVar.s(f15);
        eVar.t(f16);
        this.f94205g.add(eVar);
        b bVar = new b(eVar);
        float f17 = f15 + f16;
        boolean z11 = f16 < 0.0f;
        if (z11) {
            f15 = (f15 + 180.0f) % 360.0f;
        }
        c(bVar, f15, z11 ? (180.0f + f17) % 360.0f : f17);
        double d11 = f17;
        u(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.cos(Math.toRadians(d11)))));
        v(((f12 + f14) * 0.5f) + (((f14 - f12) / 2.0f) * ((float) Math.sin(Math.toRadians(d11)))));
    }

    public final void b(float f11) {
        if (h() == f11) {
            return;
        }
        float h11 = ((f11 - h()) + 360.0f) % 360.0f;
        if (h11 > 180.0f) {
            return;
        }
        e eVar = new e(j(), k(), j(), k());
        eVar.s(h());
        eVar.t(h11);
        this.f94206h.add(new b(eVar));
        s(f11);
    }

    public final void c(j jVar, float f11, float f12) {
        b(f11);
        this.f94206h.add(jVar);
        s(f12);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f94205g.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f94205g.get(i11).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f94207i;
    }

    @NonNull
    public j f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.f94206h), new Matrix(matrix));
    }

    @RequiresApi(21)
    public void g(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f94205g.add(new f(f11, f12, f13, f14, f15, f16));
        this.f94207i = true;
        u(f15);
        v(f16);
    }

    public final float h() {
        return this.f94203e;
    }

    public final float i() {
        return this.f94204f;
    }

    public float j() {
        return this.f94201c;
    }

    public float k() {
        return this.f94202d;
    }

    public float l() {
        return this.f94199a;
    }

    public float m() {
        return this.f94200b;
    }

    public void n(float f11, float f12) {
        g gVar = new g();
        gVar.f94232b = f11;
        gVar.f94233c = f12;
        this.f94205g.add(gVar);
        d dVar = new d(gVar, j(), k());
        c(dVar, dVar.c() + 270.0f, dVar.c() + 270.0f);
        u(f11);
        v(f12);
    }

    public void o(float f11, float f12, float f13, float f14) {
        if ((Math.abs(f11 - j()) < 0.001f && Math.abs(f12 - k()) < 0.001f) || (Math.abs(f11 - f13) < 0.001f && Math.abs(f12 - f14) < 0.001f)) {
            n(f13, f14);
            return;
        }
        g gVar = new g();
        gVar.f94232b = f11;
        gVar.f94233c = f12;
        this.f94205g.add(gVar);
        g gVar2 = new g();
        gVar2.f94232b = f13;
        gVar2.f94233c = f14;
        this.f94205g.add(gVar2);
        c cVar = new c(gVar, gVar2, j(), k());
        if (cVar.e() > 0.0f) {
            n(f11, f12);
            n(f13, f14);
        } else {
            c(cVar, cVar.d() + 270.0f, cVar.c() + 270.0f);
            u(f13);
            v(f14);
        }
    }

    @RequiresApi(21)
    public void p(float f11, float f12, float f13, float f14) {
        i iVar = new i();
        iVar.j(f11);
        iVar.k(f12);
        iVar.l(f13);
        iVar.m(f14);
        this.f94205g.add(iVar);
        this.f94207i = true;
        u(f13);
        v(f14);
    }

    public void q(float f11, float f12) {
        r(f11, f12, 270.0f, 0.0f);
    }

    public void r(float f11, float f12, float f13, float f14) {
        w(f11);
        x(f12);
        u(f11);
        v(f12);
        s(f13);
        t((f13 + f14) % 360.0f);
        this.f94205g.clear();
        this.f94206h.clear();
        this.f94207i = false;
    }

    public final void s(float f11) {
        this.f94203e = f11;
    }

    public final void t(float f11) {
        this.f94204f = f11;
    }

    public final void u(float f11) {
        this.f94201c = f11;
    }

    public final void v(float f11) {
        this.f94202d = f11;
    }

    public final void w(float f11) {
        this.f94199a = f11;
    }

    public final void x(float f11) {
        this.f94200b = f11;
    }

    public r(float f11, float f12) {
        q(f11, f12);
    }
}

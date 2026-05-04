package vn;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f94179a = new r[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f94180b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f94181c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f94182d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f94183e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f94184f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final r f94185g = new r();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f94186h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f94187i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f94188j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f94189k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public boolean f94190l = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final q f94191a = new q();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface b {
        void a(r rVar, Matrix matrix, int i11);

        void b(r rVar, Matrix matrix, int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final p f94192a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public final Path f94193b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public final RectF f94194c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public final b f94195d;

        /* renamed from: e, reason: collision with root package name */
        public final float f94196e;

        public c(@NonNull p pVar, float f11, RectF rectF, @Nullable b bVar, Path path) {
            this.f94195d = bVar;
            this.f94192a = pVar;
            this.f94196e = f11;
            this.f94194c = rectF;
            this.f94193b = path;
        }
    }

    public q() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f94179a[i11] = new r();
            this.f94180b[i11] = new Matrix();
            this.f94181c[i11] = new Matrix();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static q k() {
        return a.f94191a;
    }

    public final float a(int i11) {
        return ((i11 + 1) % 4) * 90;
    }

    public final void b(@NonNull c cVar, int i11) {
        this.f94186h[0] = this.f94179a[i11].l();
        this.f94186h[1] = this.f94179a[i11].m();
        this.f94180b[i11].mapPoints(this.f94186h);
        if (i11 == 0) {
            Path path = cVar.f94193b;
            float[] fArr = this.f94186h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f94193b;
            float[] fArr2 = this.f94186h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f94179a[i11].d(this.f94180b[i11], cVar.f94193b);
        b bVar = cVar.f94195d;
        if (bVar != null) {
            bVar.b(this.f94179a[i11], this.f94180b[i11], i11);
        }
    }

    public final void c(@NonNull c cVar, int i11) {
        int i12 = (i11 + 1) % 4;
        this.f94186h[0] = this.f94179a[i11].j();
        this.f94186h[1] = this.f94179a[i11].k();
        this.f94180b[i11].mapPoints(this.f94186h);
        this.f94187i[0] = this.f94179a[i12].l();
        this.f94187i[1] = this.f94179a[i12].m();
        this.f94180b[i12].mapPoints(this.f94187i);
        float f11 = this.f94186h[0];
        float[] fArr = this.f94187i;
        float max = Math.max(((float) Math.hypot(f11 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i13 = i(cVar.f94194c, i11);
        this.f94185g.q(0.0f, 0.0f);
        h j11 = j(i11, cVar.f94192a);
        j11.b(max, i13, cVar.f94196e, this.f94185g);
        this.f94188j.reset();
        this.f94185g.d(this.f94181c[i11], this.f94188j);
        if (this.f94190l && (j11.a() || l(this.f94188j, i11) || l(this.f94188j, i12))) {
            Path path = this.f94188j;
            path.op(path, this.f94184f, Path.Op.DIFFERENCE);
            this.f94186h[0] = this.f94185g.l();
            this.f94186h[1] = this.f94185g.m();
            this.f94181c[i11].mapPoints(this.f94186h);
            Path path2 = this.f94183e;
            float[] fArr2 = this.f94186h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f94185g.d(this.f94181c[i11], this.f94183e);
        } else {
            this.f94185g.d(this.f94181c[i11], cVar.f94193b);
        }
        b bVar = cVar.f94195d;
        if (bVar != null) {
            bVar.a(this.f94185g, this.f94181c[i11], i11);
        }
    }

    public void d(p pVar, float f11, RectF rectF, @NonNull Path path) {
        e(pVar, f11, rectF, null, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void e(p pVar, float f11, RectF rectF, b bVar, @NonNull Path path) {
        path.rewind();
        this.f94183e.rewind();
        this.f94184f.rewind();
        this.f94184f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(pVar, f11, rectF, bVar, path);
        for (int i11 = 0; i11 < 4; i11++) {
            m(cVar, i11);
            o(i11);
        }
        for (int i12 = 0; i12 < 4; i12++) {
            b(cVar, i12);
            c(cVar, i12);
        }
        path.close();
        this.f94183e.close();
        if (this.f94183e.isEmpty()) {
            return;
        }
        path.op(this.f94183e, Path.Op.UNION);
    }

    public final void f(int i11, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i11 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i11 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i11 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final e g(int i11, @NonNull p pVar) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? pVar.t() : pVar.r() : pVar.j() : pVar.l();
    }

    public final f h(int i11, @NonNull p pVar) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? pVar.s() : pVar.q() : pVar.i() : pVar.k();
    }

    public final float i(@NonNull RectF rectF, int i11) {
        float[] fArr = this.f94186h;
        r rVar = this.f94179a[i11];
        fArr[0] = rVar.f94201c;
        fArr[1] = rVar.f94202d;
        this.f94180b[i11].mapPoints(fArr);
        return (i11 == 1 || i11 == 3) ? Math.abs(rectF.centerX() - this.f94186h[0]) : Math.abs(rectF.centerY() - this.f94186h[1]);
    }

    public final h j(int i11, @NonNull p pVar) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? pVar.o() : pVar.p() : pVar.n() : pVar.h();
    }

    @RequiresApi(19)
    public final boolean l(Path path, int i11) {
        this.f94189k.reset();
        this.f94179a[i11].d(this.f94180b[i11], this.f94189k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f94189k.computeBounds(rectF, true);
        path.op(this.f94189k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void m(@NonNull c cVar, int i11) {
        h(i11, cVar.f94192a).c(this.f94179a[i11], 90.0f, cVar.f94196e, cVar.f94194c, g(i11, cVar.f94192a));
        float a11 = a(i11);
        this.f94180b[i11].reset();
        f(i11, cVar.f94194c, this.f94182d);
        Matrix matrix = this.f94180b[i11];
        PointF pointF = this.f94182d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f94180b[i11].preRotate(a11);
    }

    public void n(boolean z11) {
        this.f94190l = z11;
    }

    public final void o(int i11) {
        this.f94186h[0] = this.f94179a[i11].j();
        this.f94186h[1] = this.f94179a[i11].k();
        this.f94180b[i11].mapPoints(this.f94186h);
        float a11 = a(i11);
        this.f94181c[i11].reset();
        Matrix matrix = this.f94181c[i11];
        float[] fArr = this.f94186h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f94181c[i11].preRotate(a11);
    }
}

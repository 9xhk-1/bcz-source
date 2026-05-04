package y0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q implements e, n, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f98905a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f98906b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final o0 f98907c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f98908d;

    /* renamed from: e, reason: collision with root package name */
    public final String f98909e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98910f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.a<Float, Float> f98911g;

    /* renamed from: h, reason: collision with root package name */
    public final z0.a<Float, Float> f98912h;

    /* renamed from: i, reason: collision with root package name */
    public final z0.p f98913i;

    /* renamed from: j, reason: collision with root package name */
    public d f98914j;

    public q(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.g gVar) {
        this.f98907c = o0Var;
        this.f98908d = aVar;
        this.f98909e = gVar.c();
        this.f98910f = gVar.f();
        z0.a<Float, Float> k11 = gVar.b().k();
        this.f98911g = k11;
        aVar.i(k11);
        k11.a(this);
        z0.a<Float, Float> k12 = gVar.d().k();
        this.f98912h = k12;
        aVar.i(k12);
        k12.a(this);
        z0.p b11 = gVar.e().b();
        this.f98913i = b11;
        b11.a(aVar);
        b11.b(this);
    }

    @Override // y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        this.f98914j.a(rectF, matrix, z11);
    }

    @Override // c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        if (this.f98913i.c(t11, jVar)) {
            return;
        }
        if (t11 == t0.f10211u) {
            this.f98911g.n(jVar);
        } else if (t11 == t0.f10212v) {
            this.f98912h.n(jVar);
        }
    }

    @Override // y0.j
    public void c(ListIterator<c> listIterator) {
        if (this.f98914j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f98914j = new d(this.f98907c, this.f98908d, "Repeater", this.f98910f, arrayList, null);
    }

    @Override // y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        float floatValue = this.f98911g.h().floatValue();
        float floatValue2 = this.f98912h.h().floatValue();
        float floatValue3 = this.f98913i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f98913i.e().h().floatValue() / 100.0f;
        for (int i12 = ((int) floatValue) - 1; i12 >= 0; i12--) {
            this.f98905a.set(matrix);
            float f11 = i12;
            this.f98905a.preConcat(this.f98913i.g(f11 + floatValue2));
            this.f98914j.d(canvas, this.f98905a, (int) (i11 * j1.i.k(floatValue3, floatValue4, f11 / floatValue)));
        }
    }

    @Override // z0.a.b
    public void e() {
        this.f98907c.invalidateSelf();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        this.f98914j.f(list, list2);
    }

    @Override // y0.c
    public String getName() {
        return this.f98909e;
    }

    @Override // y0.n
    public Path getPath() {
        Path path = this.f98914j.getPath();
        this.f98906b.reset();
        float floatValue = this.f98911g.h().floatValue();
        float floatValue2 = this.f98912h.h().floatValue();
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f98905a.set(this.f98913i.g(i11 + floatValue2));
            this.f98906b.addPath(path, this.f98905a);
        }
        return this.f98906b;
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        j1.i.m(dVar, i11, list, dVar2, this);
    }
}

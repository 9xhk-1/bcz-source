package y0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import java.util.ArrayList;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d implements e, n, a.b, c1.e {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f98805a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f98806b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f98807c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f98808d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f98809e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98810f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f98811g;

    /* renamed from: h, reason: collision with root package name */
    public final List<c> f98812h;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f98813i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public List<n> f98814j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public z0.p f98815k;

    public d(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.k kVar) {
        this(o0Var, aVar, kVar.c(), kVar.d(), c(o0Var, aVar, kVar.b()), i(kVar.b()));
    }

    public static List<c> c(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, List<e1.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            c a11 = list.get(i11).a(o0Var, aVar);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    @Nullable
    public static d1.l i(List<e1.c> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            e1.c cVar = list.get(i11);
            if (cVar instanceof d1.l) {
                return (d1.l) cVar;
            }
        }
        return null;
    }

    @Override // y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        this.f98807c.set(matrix);
        z0.p pVar = this.f98815k;
        if (pVar != null) {
            this.f98807c.preConcat(pVar.f());
        }
        this.f98809e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f98812h.size() - 1; size >= 0; size--) {
            c cVar = this.f98812h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(this.f98809e, this.f98807c, z11);
                rectF.union(this.f98809e);
            }
        }
    }

    @Override // c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        z0.p pVar = this.f98815k;
        if (pVar != null) {
            pVar.c(t11, jVar);
        }
    }

    @Override // y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f98811g) {
            return;
        }
        this.f98807c.set(matrix);
        z0.p pVar = this.f98815k;
        if (pVar != null) {
            this.f98807c.preConcat(pVar.f());
            i11 = (int) (((((this.f98815k.h() == null ? 100 : this.f98815k.h().h().intValue()) / 100.0f) * i11) / 255.0f) * 255.0f);
        }
        boolean z11 = this.f98813i.l0() && l() && i11 != 255;
        if (z11) {
            this.f98806b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.f98806b, this.f98807c, true);
            this.f98805a.setAlpha(i11);
            j1.j.n(canvas, this.f98806b, this.f98805a);
        }
        if (z11) {
            i11 = 255;
        }
        for (int size = this.f98812h.size() - 1; size >= 0; size--) {
            c cVar = this.f98812h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(canvas, this.f98807c, i11);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // z0.a.b
    public void e() {
        this.f98813i.invalidateSelf();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f98812h.size());
        arrayList.addAll(list);
        for (int size = this.f98812h.size() - 1; size >= 0; size--) {
            c cVar = this.f98812h.get(size);
            cVar.f(arrayList, this.f98812h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98810f;
    }

    @Override // y0.n
    public Path getPath() {
        this.f98807c.reset();
        z0.p pVar = this.f98815k;
        if (pVar != null) {
            this.f98807c.set(pVar.f());
        }
        this.f98808d.reset();
        if (this.f98811g) {
            return this.f98808d;
        }
        for (int size = this.f98812h.size() - 1; size >= 0; size--) {
            c cVar = this.f98812h.get(size);
            if (cVar instanceof n) {
                this.f98808d.addPath(((n) cVar).getPath(), this.f98807c);
            }
        }
        return this.f98808d;
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        if (dVar.h(getName(), i11) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i11)) {
                    list.add(dVar2.j(this));
                }
            }
            if (dVar.i(getName(), i11)) {
                int e11 = i11 + dVar.e(getName(), i11);
                for (int i12 = 0; i12 < this.f98812h.size(); i12++) {
                    c cVar = this.f98812h.get(i12);
                    if (cVar instanceof c1.e) {
                        ((c1.e) cVar).h(dVar, e11, list, dVar2);
                    }
                }
            }
        }
    }

    public List<n> j() {
        if (this.f98814j == null) {
            this.f98814j = new ArrayList();
            for (int i11 = 0; i11 < this.f98812h.size(); i11++) {
                c cVar = this.f98812h.get(i11);
                if (cVar instanceof n) {
                    this.f98814j.add((n) cVar);
                }
            }
        }
        return this.f98814j;
    }

    public Matrix k() {
        z0.p pVar = this.f98815k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f98807c.reset();
        return this.f98807c;
    }

    public final boolean l() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f98812h.size(); i12++) {
            if ((this.f98812h.get(i12) instanceof e) && (i11 = i11 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public d(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, String str, boolean z11, List<c> list, @Nullable d1.l lVar) {
        this.f98805a = new x0.a();
        this.f98806b = new RectF();
        this.f98807c = new Matrix();
        this.f98808d = new Path();
        this.f98809e = new RectF();
        this.f98810f = str;
        this.f98813i = o0Var;
        this.f98811g = z11;
        this.f98812h = list;
        if (lVar != null) {
            z0.p b11 = lVar.b();
            this.f98815k = b11;
            b11.a(aVar);
            this.f98815k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).c(list.listIterator(list.size()));
        }
    }
}

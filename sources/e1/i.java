package e1;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final List<c1.a> f48307a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f48308b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f48309c;

    public i(PointF pointF, boolean z11, List<c1.a> list) {
        this.f48308b = pointF;
        this.f48309c = z11;
        this.f48307a = new ArrayList(list);
    }

    public List<c1.a> a() {
        return this.f48307a;
    }

    public PointF b() {
        return this.f48308b;
    }

    public void c(i iVar, i iVar2, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (this.f48308b == null) {
            this.f48308b = new PointF();
        }
        this.f48309c = iVar.d() || iVar2.d();
        if (iVar.a().size() != iVar2.a().size()) {
            j1.f.e("Curves must have the same number of control points. Shape 1: " + iVar.a().size() + "\tShape 2: " + iVar2.a().size());
        }
        int min = Math.min(iVar.a().size(), iVar2.a().size());
        if (this.f48307a.size() < min) {
            for (int size = this.f48307a.size(); size < min; size++) {
                this.f48307a.add(new c1.a());
            }
        } else if (this.f48307a.size() > min) {
            for (int size2 = this.f48307a.size() - 1; size2 >= min; size2--) {
                List<c1.a> list = this.f48307a;
                list.remove(list.size() - 1);
            }
        }
        PointF b11 = iVar.b();
        PointF b12 = iVar2.b();
        f(j1.i.k(b11.x, b12.x, f11), j1.i.k(b11.y, b12.y, f11));
        for (int size3 = this.f48307a.size() - 1; size3 >= 0; size3--) {
            c1.a aVar = iVar.a().get(size3);
            c1.a aVar2 = iVar2.a().get(size3);
            PointF a11 = aVar.a();
            PointF b13 = aVar.b();
            PointF c11 = aVar.c();
            PointF a12 = aVar2.a();
            PointF b14 = aVar2.b();
            PointF c12 = aVar2.c();
            this.f48307a.get(size3).d(j1.i.k(a11.x, a12.x, f11), j1.i.k(a11.y, a12.y, f11));
            this.f48307a.get(size3).e(j1.i.k(b13.x, b14.x, f11), j1.i.k(b13.y, b14.y, f11));
            this.f48307a.get(size3).g(j1.i.k(c11.x, c12.x, f11), j1.i.k(c11.y, c12.y, f11));
        }
    }

    public boolean d() {
        return this.f48309c;
    }

    public void e(boolean z11) {
        this.f48309c = z11;
    }

    public void f(float f11, float f12) {
        if (this.f48308b == null) {
            this.f48308b = new PointF();
        }
        this.f48308b.set(f11, f12);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f48307a.size() + "closed=" + this.f48309c + l50.b.f69928j;
    }

    public i() {
        this.f48307a = new ArrayList();
    }
}

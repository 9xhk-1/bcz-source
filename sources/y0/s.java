package y0;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.o0;
import java.util.ArrayList;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class s implements n, a.b {

    /* renamed from: b, reason: collision with root package name */
    public final String f98921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98922c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f98923d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.m f98924e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public List<t> f98925f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f98926g;

    /* renamed from: a, reason: collision with root package name */
    public final Path f98920a = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final b f98927h = new b();

    public s(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.l lVar) {
        this.f98921b = lVar.b();
        this.f98922c = lVar.d();
        this.f98923d = o0Var;
        z0.m k11 = lVar.c().k();
        this.f98924e = k11;
        aVar.i(k11);
        k11.a(this);
    }

    private void b() {
        this.f98926g = false;
        this.f98923d.invalidateSelf();
    }

    @Override // z0.a.b
    public void e() {
        b();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f98927h.a(vVar);
                    vVar.b(this);
                }
            }
            if (cVar instanceof t) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((t) cVar);
            }
        }
        this.f98924e.q(arrayList);
    }

    @Override // y0.c
    public String getName() {
        return this.f98921b;
    }

    @Override // y0.n
    public Path getPath() {
        if (this.f98926g) {
            return this.f98920a;
        }
        this.f98920a.reset();
        if (this.f98922c) {
            this.f98926g = true;
            return this.f98920a;
        }
        Path h11 = this.f98924e.h();
        if (h11 == null) {
            return this.f98920a;
        }
        this.f98920a.set(h11);
        this.f98920a.setFillType(Path.FillType.EVEN_ODD);
        this.f98927h.b(this.f98920a);
        this.f98926g = true;
        return this.f98920a;
    }
}

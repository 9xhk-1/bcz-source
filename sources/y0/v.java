package y0;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class v implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f98933a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98934b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a.b> f98935c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ShapeTrimPath.Type f98936d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.a<?, Float> f98937e;

    /* renamed from: f, reason: collision with root package name */
    public final z0.a<?, Float> f98938f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.a<?, Float> f98939g;

    public v(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        this.f98933a = shapeTrimPath.c();
        this.f98934b = shapeTrimPath.g();
        this.f98936d = shapeTrimPath.f();
        z0.a<Float, Float> k11 = shapeTrimPath.e().k();
        this.f98937e = k11;
        z0.a<Float, Float> k12 = shapeTrimPath.b().k();
        this.f98938f = k12;
        z0.a<Float, Float> k13 = shapeTrimPath.d().k();
        this.f98939g = k13;
        aVar.i(k11);
        aVar.i(k12);
        aVar.i(k13);
        k11.a(this);
        k12.a(this);
        k13.a(this);
    }

    public void b(a.b bVar) {
        this.f98935c.add(bVar);
    }

    public z0.a<?, Float> c() {
        return this.f98938f;
    }

    @Override // z0.a.b
    public void e() {
        for (int i11 = 0; i11 < this.f98935c.size(); i11++) {
            this.f98935c.get(i11).e();
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98933a;
    }

    public z0.a<?, Float> h() {
        return this.f98939g;
    }

    public z0.a<?, Float> i() {
        return this.f98937e;
    }

    public ShapeTrimPath.Type j() {
        return this.f98936d;
    }

    public boolean k() {
        return this.f98934b;
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
    }
}

package d1;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    public final List<k1.a<PointF>> f46993a;

    public e(List<k1.a<PointF>> list) {
        this.f46993a = list;
    }

    @Override // d1.m
    public boolean j() {
        return this.f46993a.size() == 1 && this.f46993a.get(0).h();
    }

    @Override // d1.m
    public z0.a<PointF, PointF> k() {
        return this.f46993a.get(0).h() ? new z0.k(this.f46993a) : new z0.j(this.f46993a);
    }

    @Override // d1.m
    public List<k1.a<PointF>> l() {
        return this.f46993a;
    }
}

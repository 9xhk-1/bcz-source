package d1;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    public final b f46994a;

    /* renamed from: b, reason: collision with root package name */
    public final b f46995b;

    public i(b bVar, b bVar2) {
        this.f46994a = bVar;
        this.f46995b = bVar2;
    }

    @Override // d1.m
    public boolean j() {
        return this.f46994a.j() && this.f46995b.j();
    }

    @Override // d1.m
    public z0.a<PointF, PointF> k() {
        return new z0.n(this.f46994a.k(), this.f46995b.k());
    }

    @Override // d1.m
    public List<k1.a<PointF>> l() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}

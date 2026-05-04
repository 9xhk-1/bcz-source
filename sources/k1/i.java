package k1;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends j<PointF> {

    /* renamed from: d, reason: collision with root package name */
    public final PointF f64902d;

    public i() {
        this.f64902d = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF e(b<PointF> bVar) {
        T t11 = this.f64905c;
        if (t11 != 0) {
            return (PointF) t11;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // k1.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final PointF a(b<PointF> bVar) {
        this.f64902d.set(j1.i.k(bVar.g().x, bVar.b().x, bVar.c()), j1.i.k(bVar.g().y, bVar.b().y, bVar.c()));
        PointF e11 = e(bVar);
        this.f64902d.offset(e11.x, e11.y);
        return this.f64902d;
    }

    public i(@NonNull PointF pointF) {
        super(pointF);
        this.f64902d = new PointF();
    }
}

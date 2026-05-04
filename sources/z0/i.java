package z0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends k1.a<PointF> {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public Path f100504s;

    /* renamed from: t, reason: collision with root package name */
    public final k1.a<PointF> f100505t;

    public i(com.airbnb.lottie.k kVar, k1.a<PointF> aVar) {
        super(kVar, aVar.f64876b, aVar.f64877c, aVar.f64878d, aVar.f64879e, aVar.f64880f, aVar.f64881g, aVar.f64882h);
        this.f100505t = aVar;
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        T t11;
        T t12;
        T t13 = this.f64877c;
        boolean z11 = (t13 == 0 || (t12 = this.f64876b) == 0 || !((PointF) t12).equals(((PointF) t13).x, ((PointF) t13).y)) ? false : true;
        T t14 = this.f64876b;
        if (t14 == 0 || (t11 = this.f64877c) == 0 || z11) {
            return;
        }
        k1.a<PointF> aVar = this.f100505t;
        this.f100504s = j1.j.d((PointF) t14, (PointF) t11, aVar.f64889o, aVar.f64890p);
    }

    @Nullable
    public Path j() {
        return this.f100504s;
    }
}

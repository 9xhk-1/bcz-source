package xf;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f98038b = "QuizLearningSimpleStore";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f98039c = "q_d_";

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f98037a = new f();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c0 f98040d = e0.c(new x00.a() { // from class: xf.e
        @Override // x00.a
        public final Object invoke() {
            nc.a d11;
            d11 = f.d();
            return d11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    public static final int f98041e = 8;

    public static final nc.a d() {
        return nc.b.c(f98038b);
    }

    public final nc.a b() {
        return (nc.a) f98040d.getValue();
    }

    public final int c(int i11) {
        return b().getInt(f98039c + i11, 0);
    }

    public final void e(int i11, int i12) {
        b().m(f98039c + i11, i12);
    }
}

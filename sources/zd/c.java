package zd;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import m80.k;
import ma.l;
import ma.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static long f102554b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f102553a = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final int f102555c = 8;

    public final void a() {
        f102554b = System.currentTimeMillis();
    }

    public final long b() {
        return f102554b;
    }

    public final void c() {
        if (f102554b == 0) {
            return;
        }
        f102554b = System.currentTimeMillis() - f102554b;
        HashMap hashMap = new HashMap();
        hashMap.put("id", a.f102549a.b());
        hashMap.put(ma.b.f72963z, Long.valueOf(f102554b));
        g2 g2Var = g2.f100423a;
        l.e(t.f73020s, ma.a.Y1, hashMap);
        f102554b = 0L;
    }

    public final void d(long j11) {
        f102554b = j11;
    }
}

package ed;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import m80.k;
import q9.x;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f49645b = "LearningTest";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f49646c = "LearningTest_test_flag";

    /* renamed from: d, reason: collision with root package name */
    public static int f49647d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f49644a = new a();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Map<Integer, String> f49648e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final int f49649f = 8;

    @k
    public final Map<Integer, String> a() {
        return f49648e;
    }

    public final int b() {
        int i11 = nc.b.b().getInt(f49646c, 0);
        f49647d = i11;
        return i11;
    }

    public final void c() {
        f49648e.clear();
        try {
            e();
        } catch (Exception e11) {
            c.c(f49645b, "", e11);
        }
    }

    public final boolean d() {
        int l11 = x.r().l();
        return (l11 == 16 || l11 == 24 || l11 == 403 || l11 == 404 || l11 == 409 || l11 == 410) && (f49644a.b() & 4) > 0;
    }

    public final void f(int i11) {
        nc.b.b().m(f49646c, i11);
        f49647d = i11;
    }

    public final void e() {
    }
}

package i9;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.online.user_study_api.ExamPreparation;
import java.util.List;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f60350b = "ExamExperimentalManager";

    /* renamed from: c, reason: collision with root package name */
    public static final int f60351c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f60352d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f60353e = 3;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f60354f = "exam_mode";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f60355g = "key_exam_pre_data";

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public static ExamPreparation f60357i;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e f60349a = new e();

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final List<Integer> f60356h = h0.Q(559, 590, 563, 564, 565, 575, 5);

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final c0 f60358j = e0.c(new x00.a() { // from class: i9.d
        @Override // x00.a
        public final Object invoke() {
            nc.a f11;
            f11 = e.f();
            return f11;
        }
    });

    /* renamed from: k, reason: collision with root package name */
    public static final int f60359k = 8;

    public static final nc.a f() {
        return nc.b.c(f60354f);
    }

    @m80.l
    public final ExamPreparation b() {
        ExamPreparation examPreparation = f60357i;
        if (examPreparation != null) {
            return examPreparation;
        }
        ExamPreparation examPreparation2 = (ExamPreparation) BczJson.fromJson(c().getString(f60355g, ""), ExamPreparation.class);
        f60357i = examPreparation2;
        qb.c.i(f60350b, "get exam AB flag:" + examPreparation2, new Object[0]);
        return f60357i;
    }

    @m80.k
    public final nc.a c() {
        Object value = f60358j.getValue();
        g0.o(value, "getValue(...)");
        return (nc.a) value;
    }

    public final boolean d(int i11) {
        ExamPreparation b11 = b();
        return b11 != null && b11.userType == 1 && f60356h.contains(Integer.valueOf(i11));
    }

    public final boolean e(int i11) {
        g10.l lVar = new g10.l(1, 2);
        ExamPreparation b11 = b();
        Integer valueOf = b11 != null ? Integer.valueOf(b11.userType) : null;
        return valueOf != null && lVar.k(valueOf.intValue()) && f60356h.contains(Integer.valueOf(i11));
    }

    public final void g(@m80.l ExamPreparation examPreparation) {
        qb.c.i(f60350b, "update exam AB flag:" + examPreparation, new Object[0]);
        f60357i = examPreparation;
        c().p(f60355g, BczJson.toJson(f60357i));
    }
}

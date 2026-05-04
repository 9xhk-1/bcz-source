package ji;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class s1 implements PreviewParameterProvider<n1> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f64189b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q30.m<n1> f64190a;

    /* JADX WARN: Multi-variable type inference failed */
    public s1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final g2 e() {
        return g2.f100423a;
    }

    public static final g2 f() {
        return g2.f100423a;
    }

    public static final g2 g() {
        return g2.f100423a;
    }

    public static final g2 h() {
        return g2.f100423a;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @m80.k
    public q30.m<n1> getValues() {
        return this.f64190a;
    }

    public s1(@m80.k q30.m<n1> values) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f64190a = values;
    }

    public /* synthetic */ s1(q30.m mVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? q30.x.C(new n1("名称", "说明", null, null, 12, null), new n1("名称很长名称很长名称很长名称很长名称很长", "说明", null, null, 12, null), new n1("名称", "说明很长说明很长说明很长说明很长说明很长", null, null, 12, null), new n1("名称", "说明", null, new x00.a() { // from class: ji.o1
            @Override // x00.a
            public final Object invoke() {
                g2 e11;
                e11 = s1.e();
                return e11;
            }
        }, 4, null), new n1("名称很长名称很长名称很长名称很长名称很长", "说明", null, new x00.a() { // from class: ji.p1
            @Override // x00.a
            public final Object invoke() {
                g2 f11;
                f11 = s1.f();
                return f11;
            }
        }, 4, null), new n1("名称", "说明", "", new x00.a() { // from class: ji.q1
            @Override // x00.a
            public final Object invoke() {
                g2 g11;
                g11 = s1.g();
                return g11;
            }
        }), new n1("名称", "说明", "升级", new x00.a() { // from class: ji.r1
            @Override // x00.a
            public final Object invoke() {
                g2 h11;
                h11 = s1.h();
                return h11;
            }
        })) : mVar);
    }
}

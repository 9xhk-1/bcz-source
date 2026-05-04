package yg;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.baicizhan.main.plusreview.activity.DefaultPreloadActivity;
import fd.w4;
import fd.z4;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTrainingModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingCreatorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2Kt\n*L\n1#1,379:1\n1#2:380\n144#3:381\n144#3:382\n*S KotlinDebug\n*F\n+ 1 TrainingModel.kt\ncom/baicizhan/main/model/TrainingCreatorImpl\n*L\n96#1:381\n98#1:382\n*E\n"})
/* loaded from: classes4.dex */
public final class k1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f100040a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.p<Integer, Integer, Boolean> f100041b;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(@m80.k Context context, @m80.k x00.p<? super Integer, ? super Integer, Boolean> controller) {
        kotlin.jvm.internal.g0.p(context, "context");
        kotlin.jvm.internal.g0.p(controller, "controller");
        this.f100040a = context;
        this.f100041b = controller;
    }

    public static final yz.g2 e(k1 k1Var, int i11, int i12, AppCompatActivity appCompatActivity) {
        String str;
        if (k1Var.f100041b.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
            DefaultPreloadActivity.Z0(appCompatActivity, i12);
            if (i12 == 3) {
                str = ma.a.P0;
            } else if (i12 == 4) {
                str = ma.a.U0;
            } else if (i12 != 5) {
                switch (i12) {
                    case 21:
                        str = ma.a.S0;
                        break;
                    case 22:
                        str = ma.a.T0;
                        break;
                    case 23:
                        str = ma.a.R0;
                        break;
                    case 24:
                        str = ma.a.Q0;
                        break;
                    default:
                        return yz.g2.f100423a;
                }
            } else {
                str = ma.a.V0;
            }
            ma.l.a(ma.t.f73011j, str);
        } else {
            gi.a.e(appCompatActivity, "当前词书暂不支持！", 0, 2, null);
        }
        return yz.g2.f100423a;
    }

    @Override // yg.i1
    @m80.k
    public z4 a(@m80.k final AppCompatActivity activity, @m80.k String title, final int i11, final int i12, @m80.k String description, int i13) {
        int i14;
        kotlin.jvm.internal.g0.p(activity, "activity");
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        int a11 = gi.m.a(i12, i13);
        int t11 = q9.x.r().t(sh.f.g(i11, i12));
        if (t11 <= a11 || a11 == 0) {
            i14 = t11;
        } else {
            Integer valueOf = Integer.valueOf(t11 % a11);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            i14 = valueOf != null ? valueOf.intValue() : a11;
        }
        String simpleName = k1.class.getSimpleName();
        kotlin.jvm.internal.g0.o(simpleName, "getSimpleName(...)");
        qb.c.b(simpleName, i12 + " -> [" + t11 + " -> " + i14 + org.junit.jupiter.api.j2.O + a11 + "]", new Object[0]);
        if (i14 > a11) {
            String simpleName2 = k1.class.getSimpleName();
            kotlin.jvm.internal.g0.o(simpleName2, "getSimpleName(...)");
            qb.c.i(simpleName2, "set min current", new Object[0]);
            i14 = a11;
        }
        return new z4(title, description, new Pair(Integer.valueOf(i14), Integer.valueOf(a11)), new x00.a() { // from class: yg.j1
            @Override // x00.a
            public final Object invoke() {
                yz.g2 e11;
                e11 = k1.e(k1.this, i11, i12, activity);
                return e11;
            }
        });
    }

    @Override // yg.i1
    @m80.k
    public w4 b(int i11) {
        String o11 = new pg.l0().d().o();
        Integer valueOf = Integer.valueOf(new pg.l0().d().p());
        if (valueOf.intValue() <= 0 && pg.j0.f80472b.getStatus().compareTo(LearnCardStatus.CAKE_LEARNING) > 0) {
            valueOf = null;
        }
        return new w4(o11, valueOf != null ? valueOf.intValue() : pg.j0.f80472b.c(), ((i11 != 16 && i11 != 31 && i11 != 409) || DeviceUtil.isDuoQin() || 0 == i9.f.f(this.f100040a, i9.f.N)) ? false : true);
    }
}

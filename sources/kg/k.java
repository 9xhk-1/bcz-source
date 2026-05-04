package kg;

import android.view.View;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.StorageUtils;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.home.experiment.HomeActivity;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.jiongji.andriod.card.R;
import gi.v;
import kc.d;
import kc.u;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q9.x;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHomeEnvironment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeEnvironment.kt\ncom/baicizhan/main/home/HomeEnvironmentKt\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,127:1\n18#2,3:128\n*S KotlinDebug\n*F\n+ 1 HomeEnvironment.kt\ncom/baicizhan/main/home/HomeEnvironmentKt\n*L\n63#1:128,3\n*E\n"})
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public static qb0.h f66517a = null;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public static qb0.h f66518b = null;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f66519c = "HomeEnvironment";

    public static final <T extends ComposeBaseActivity> void j(@m80.k T t11, @m80.k x00.l<? super Boolean, g2> onFresh) {
        g0.p(t11, "<this>");
        g0.p(onFresh, "onFresh");
        boolean z11 = v.c(4096) && v.d();
        if (z11) {
            v.a(4096);
            i9.f.j(t11, jg.d.f64079c, true);
        }
        onFresh.invoke(Boolean.valueOf(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ComposeBaseActivity & a> void k(@m80.k T t11) {
        g0.p(t11, "<this>");
        qb0.h hVar = f66517a;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        rx.c<SchedulePrepareObservables.f0> I3 = SchedulePrepareObservables.F(t11, 32).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: kg.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l11;
                l11 = k.l((SchedulePrepareObservables.f0) obj);
                return l11;
            }
        };
        f66517a = I3.v5(new wb0.b() { // from class: kg.c
            @Override // wb0.b
            public final void call(Object obj) {
                k.m(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: kg.d
            @Override // wb0.b
            public final void call(Object obj) {
                k.n((Throwable) obj);
            }
        }, new wb0.a() { // from class: kg.e
            @Override // wb0.a
            public final void call() {
                k.o();
            }
        });
        if (f66518b == null) {
            rx.c<Boolean> I32 = th.e.i(t11).I3(tb0.a.a());
            final x00.l lVar2 = new x00.l() { // from class: kg.f
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 p11;
                    p11 = k.p((Boolean) obj);
                    return p11;
                }
            };
            f66518b = I32.u5(new wb0.b() { // from class: kg.g
                @Override // wb0.b
                public final void call(Object obj) {
                    k.q(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: kg.h
                @Override // wb0.b
                public final void call(Object obj) {
                    k.r((Throwable) obj);
                }
            });
        }
    }

    public static final g2 l(SchedulePrepareObservables.f0 f0Var) {
        qb.c.b(f66519c, "compatibleUglyRefresh: " + f0Var.f24849b + " - " + f0Var.f24848a, new Object[0]);
        return g2.f100423a;
    }

    public static final void m(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void n(Throwable th2) {
        qb.c.c(f66519c, "compatibleUglyRefresh: ", th2);
        f66517a = null;
    }

    public static final void o() {
        f66517a = null;
    }

    public static final g2 p(Boolean bool) {
        qb.c.b(f66519c, "oneTimeStrictTaskSubscription: " + bool, new Object[0]);
        pg.u0.f80487a.y();
        return g2.f100423a;
    }

    public static final void q(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void r(Throwable th2) {
        qb.c.c(f66519c, "", th2);
        f66518b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ComposeBaseActivity & a> void s(@m80.k final T t11) {
        long j11;
        g0.p(t11, "<this>");
        String h11 = i9.j.h(i9.j.f60412c);
        if (h11 == null || h11.length() == 0) {
            return;
        }
        try {
            j11 = StorageUtils.getAvailableBytes(h11);
        } catch (Exception e11) {
            qb.c.c(HomeActivity.f21020o, "", e11);
            j11 = 104857600;
        }
        Pair a11 = j11 < gi.e.f53744c ? h1.a(Integer.valueOf(R.string.main_insufficient_storage_space), Long.valueOf(gi.e.f53744c)) : j11 < gi.e.f53746e ? h1.a(Integer.valueOf(R.string.main_warning_insufficient_storage_space), Long.valueOf(gi.e.f53746e)) : null;
        if (a11 == null) {
            return;
        }
        final int intValue = ((Number) a11.component1()).intValue();
        final long longValue = ((Number) a11.component2()).longValue();
        mc.a.j(t11, "no-space-exit", null, new x00.l() { // from class: kg.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 t12;
                t12 = k.t(ComposeBaseActivity.this, intValue, longValue, (u.a) obj);
                return t12;
            }
        }, 2, null);
    }

    public static final g2 t(final ComposeBaseActivity composeBaseActivity, int i11, long j11, u.a prompt) {
        g0.p(prompt, "$this$prompt");
        prompt.L(R.string.attention);
        prompt.V(composeBaseActivity.getString(i11, Long.valueOf(j11)));
        prompt.b0(ButtonType.SINGLE_POSITIVE);
        d.a.J(prompt, null, null, new x00.l() { // from class: kg.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = k.u(ComposeBaseActivity.this, (View) obj);
                return u11;
            }
        }, 3, null);
        return g2.f100423a;
    }

    public static final g2 u(ComposeBaseActivity composeBaseActivity, View it) {
        g0.p(it, "it");
        v(composeBaseActivity);
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ComposeBaseActivity & a> void v(@m80.k T t11) {
        g0.p(t11, "<this>");
        x.r().d();
        x.r().e();
        t11.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ComposeBaseActivity & a> void w(@m80.k T t11) {
        g0.p(t11, "<this>");
        UserRecord p11 = x.r().p();
        if (p11 != null) {
            uf.b.g(String.valueOf(p11.getUniqueId()));
        }
        x.r().f0((x.a) t11);
        t11.setVolumeControlStream(3);
        c9.a.m(null);
        s(t11);
        i80.c.f().v(t11);
        ai.d.g(t11);
    }
}

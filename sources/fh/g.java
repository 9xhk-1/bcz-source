package fh;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.baicizhan.online.user_study_api.UserStudyMode;
import h10.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nReviewRecallSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewRecallSwitch.kt\ncom/baicizhan/main/pattern/review/ReviewRecallSwitch\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,53:1\n33#2,3:54\n*S KotlinDebug\n*F\n+ 1 ReviewRecallSwitch.kt\ncom/baicizhan/main/pattern/review/ReviewRecallSwitch\n*L\n-1#1:54,3\n*E\n"})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f51867c = "ReviewRecallSwitch";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f51868d = "key_review_recall_switch";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d10.f f51869e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f51870f;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f51866b = {o0.k(new MutablePropertyReference1Impl(g.class, "switchRecall", "getSwitchRecall()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f51865a = new g();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 ReviewRecallSwitch.kt\ncom/baicizhan/main/pattern/review/ReviewRecallSwitch\n*L\n1#1,73:1\n28#2,2:74\n*E\n"})
    public static final class a extends d10.c<Boolean> {
        public a(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public void afterChange(n<?> property, Boolean bool, Boolean bool2) {
            g0.p(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            nc.b.b().j(g.f51868d, booleanValue);
        }
    }

    static {
        d10.a aVar = d10.a.f47010a;
        f51869e = new a(Boolean.valueOf(nc.b.b().getBoolean(f51868d, false)));
        f51870f = 8;
    }

    public static final UserStudyMode h(UserStudyApiService.Client client) {
        UserStudyMode userStudyMode = client.get_user_study_mode();
        if (userStudyMode == null) {
            return null;
        }
        f51865a.n(userStudyMode.getReview_mode() == 1);
        return userStudyMode;
    }

    public static final UserStudyMode i(l lVar, Object obj) {
        return (UserStudyMode) lVar.invoke(obj);
    }

    public static final g2 j(UserStudyMode userStudyMode) {
        qb.c.i(f51867c, "get switch result:" + (userStudyMode != null ? userStudyMode.toString() : null), new Object[0]);
        return g2.f100423a;
    }

    public static final void k(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void l(Throwable th2) {
        qb.c.d(f51867c, "get switch error:" + th2.getMessage(), new Object[0]);
    }

    public final boolean f() {
        return ((Boolean) f51869e.getValue(this, f51866b[0])).booleanValue();
    }

    public final void g() {
        rx.c a11 = p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study"));
        final l lVar = new l() { // from class: fh.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                UserStudyMode h11;
                h11 = g.h((UserStudyApiService.Client) obj);
                return h11;
            }
        };
        rx.c w52 = a11.c3(new wb0.p() { // from class: fh.c
            @Override // wb0.p
            public final Object call(Object obj) {
                UserStudyMode i11;
                i11 = g.i(l.this, obj);
                return i11;
            }
        }).w5(bc0.c.e());
        final l lVar2 = new l() { // from class: fh.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j11;
                j11 = g.j((UserStudyMode) obj);
                return j11;
            }
        };
        w52.u5(new wb0.b() { // from class: fh.e
            @Override // wb0.b
            public final void call(Object obj) {
                g.k(l.this, obj);
            }
        }, new wb0.b() { // from class: fh.f
            @Override // wb0.b
            public final void call(Object obj) {
                g.l((Throwable) obj);
            }
        });
    }

    public final void m() {
        n(false);
    }

    public final void n(boolean z11) {
        f51869e.setValue(this, f51866b[0], Boolean.valueOf(z11));
    }
}

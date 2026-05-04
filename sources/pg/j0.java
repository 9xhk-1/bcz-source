package pg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nLearnInfoModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnInfoModule.kt\ncom/baicizhan/main/home/plan/module/LearnInfoModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes4.dex */
public final class j0 extends e0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f80473c = "LearnInfoTAG";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final j0 f80472b = new j0();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static LearnCardStatus f80474d = LearnCardStatus.LOADING;

    /* renamed from: e, reason: collision with root package name */
    public static final int f80475e = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80476a;

        static {
            int[] iArr = new int[LearnCardStatus.values().length];
            try {
                iArr[LearnCardStatus.CAKE_LEARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LearnCardStatus.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LearnCardStatus.FINISHING_REVIEW_TODAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LearnCardStatus.CAKE_FINISHING_LEARNING_TODAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LearnCardStatus.LEARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LearnCardStatus.FINISHING_LEARNING_TOADY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f80476a = iArr;
        }
    }

    @Override // pg.g0
    public int a() {
        return h() - LearnRecordManager.A().H();
    }

    @Override // pg.g0
    public int c() {
        int i11 = a.f80476a[getStatus().ordinal()];
        if (i11 != 2 && i11 != 3) {
            return q9.x.r().A();
        }
        ad.c u11 = q9.x.r().s().u();
        if (u11 != null) {
            return u11.o();
        }
        return 0;
    }

    @Override // pg.g0
    public void d(@m80.k LearnCardStatus learnCardStatus) {
        kotlin.jvm.internal.g0.p(learnCardStatus, "<set-?>");
        f80474d = learnCardStatus;
    }

    @Override // pg.g0
    public int e() {
        return (int) ((((g() * 21) + (f() * 3.2f)) + 59) / 60);
    }

    @Override // pg.g0
    public int f() {
        if (a.f80476a[getStatus().ordinal()] == 1) {
            return LearnRecordManager.A().G();
        }
        ad.c u11 = q9.x.r().s().u();
        if (u11 != null) {
            return u11.a();
        }
        return 0;
    }

    @Override // pg.g0
    public int g() {
        ad.c u11 = q9.x.r().s().u();
        if (u11 != null) {
            return u11.d();
        }
        return 0;
    }

    @Override // pg.g0
    @m80.k
    public LearnCardStatus getStatus() {
        return f80474d;
    }

    @Override // pg.g0
    public int h() {
        return LearnRecordManager.A().I();
    }

    @Override // pg.g0
    public int i() {
        int i11;
        BookRecord k11 = q9.x.r().k();
        if (k11 != null) {
            j0 j0Var = f80472b;
            qb.c.i(f80473c, "%s %s , %d", j0Var.getStatus(), k11.toString(), Integer.valueOf(k11.hashCode()));
            int i12 = a.f80476a[j0Var.getStatus().ordinal()];
            i11 = (i12 == 2 || i12 == 3) ? k11.reviewCount : k11.dailyCount;
        } else {
            i11 = 15;
        }
        Integer valueOf = Integer.valueOf(i11);
        int intValue = valueOf.intValue();
        if (q9.x.r().A() > 0) {
            int A = q9.x.r().A();
            qb.c.i(f80473c, "%d, %d", Integer.valueOf(intValue), Integer.valueOf(A));
            g2 g2Var = g2.f100423a;
            if (intValue > A) {
                valueOf = null;
            }
        }
        return valueOf != null ? valueOf.intValue() : q9.x.r().A();
    }

    @Override // pg.g0
    public int k() {
        ad.c u11;
        ad.a s11 = q9.x.r().s();
        if (s11 == null || (u11 = s11.u()) == null) {
            return 0;
        }
        return u11.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // pg.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            r3 = this;
            q9.x r0 = q9.x.r()
            ad.a r0 = r0.s()
            ad.c r0 = r0.u()
            if (r0 == 0) goto L26
            q9.x r1 = q9.x.r()
            com.baicizhan.client.business.dataset.models.BookRecord r1 = r1.k()
            if (r1 == 0) goto L23
            pg.j0 r2 = pg.j0.f80472b
            pg.h0 r2 = r2.q()
            com.baicizhan.main.home.plan.data.LearnCardStatus r0 = r2.a(r1, r0)
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L28
        L26:
            com.baicizhan.main.home.plan.data.LearnCardStatus r0 = com.baicizhan.main.home.plan.data.LearnCardStatus.ERROR
        L28:
            r3.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.j0.m():void");
    }

    @Override // pg.g0
    public int n() {
        int c11 = c() - p();
        int i11 = a.f80476a[getStatus().ordinal()];
        return ((c11 + ((i11 == 1 || i11 == 4 || i11 == 5 || i11 == 6) ? LearnRecordManager.A().H() : 0)) + (i() - 1)) / i();
    }

    @Override // pg.g0
    public int p() {
        int i11 = a.f80476a[getStatus().ordinal()];
        if (i11 != 2 && i11 != 3) {
            return LearnRecordManager.A().y();
        }
        ad.c u11 = q9.x.r().s().u();
        if (u11 != null) {
            return u11.f();
        }
        return 0;
    }

    public final h0 q() {
        return hi.e.e(pb.a.a()) ? new f0() : new y0();
    }
}

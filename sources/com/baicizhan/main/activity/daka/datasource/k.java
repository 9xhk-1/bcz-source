package com.baicizhan.main.activity.daka.datasource;

import com.baicizhan.online.user_study_api.UserStudyConfig;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18384a = "DakaShareHelper";

    public static void c() {
        i9.j.a(i9.j.f60418i);
    }

    public static boolean d() {
        return false;
    }

    public static void e(final boolean classical) {
        boolean d11 = d();
        i9.j.n(i9.j.f60418i, classical);
        th.e.k(null, th.b.f90577b, classical ? 2 : 1).w5(bc0.c.a()).I3(tb0.a.a()).r5(new a(d11));
    }

    public static void f(boolean daka) {
        e(daka);
    }

    public static void g(boolean daka) {
        i9.j.n(i9.j.f60418i, daka);
    }

    public static rx.c<Boolean> h(boolean classical) {
        final boolean d11 = d();
        i9.j.n(i9.j.f60418i, classical);
        return th.e.k(null, th.b.f90577b, classical ? 2 : 1).c3(new p() { // from class: com.baicizhan.main.activity.daka.datasource.i
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean bool;
                bool = Boolean.TRUE;
                return bool;
            }
        }).K1(new wb0.b() { // from class: com.baicizhan.main.activity.daka.datasource.j
            @Override // wb0.b
            public final void call(Object obj) {
                i9.j.n(i9.j.f60418i, d11);
            }
        }).w5(bc0.c.a()).I3(tb0.a.a());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<UserStudyConfig> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f18385a;

        public a(final boolean val$temp) {
            this.f18385a = val$temp;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(k.f18384a, "Daka mode failed. " + e11, new Object[0]);
            i9.j.n(i9.j.f60418i, this.f18385a);
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(UserStudyConfig config) {
        }
    }
}

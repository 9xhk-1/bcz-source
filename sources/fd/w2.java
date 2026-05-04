package fd;

import com.baicizhan.main.activity.MainTabActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class w2 implements nu.g<MainTabActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<qg.l0> f51780a;

    public w2(tv.t<qg.l0> mExamJsMgrProvider) {
        this.f51780a = mExamJsMgrProvider;
    }

    public static nu.g<MainTabActivity> a(tv.t<qg.l0> mExamJsMgrProvider) {
        return new w2(mExamJsMgrProvider);
    }

    @tv.k("com.baicizhan.main.activity.MainTabActivity.mExamJsMgr")
    public static void b(MainTabActivity instance, qg.l0 mExamJsMgr) {
        instance.E = mExamJsMgr;
    }

    @Override // nu.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(MainTabActivity instance) {
        b(instance, this.f51780a.get());
    }
}

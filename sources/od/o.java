package od;

import android.content.Context;
import com.baicizhan.client.business.managers.LearnRecordManager;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"dagger.hilt.android.qualifiers.ApplicationContext"})
@x
@tv.e
/* loaded from: classes4.dex */
public final class o implements tv.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<Context> f76830a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<com.baicizhan.client.business.managers.winningstreak.a> f76831b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<LearnRecordManager> f76832c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<u9.d> f76833d;

    public o(tv.t<Context> contextProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> winProvider, tv.t<LearnRecordManager> recordMgrProvider, tv.t<u9.d> iExperienceRepoProvider) {
        this.f76830a = contextProvider;
        this.f76831b = winProvider;
        this.f76832c = recordMgrProvider;
        this.f76833d = iExperienceRepoProvider;
    }

    public static o a(tv.t<Context> contextProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> winProvider, tv.t<LearnRecordManager> recordMgrProvider, tv.t<u9.d> iExperienceRepoProvider) {
        return new o(contextProvider, winProvider, recordMgrProvider, iExperienceRepoProvider);
    }

    public static n c(Context context, com.baicizhan.client.business.managers.winningstreak.a win, LearnRecordManager recordMgr, u9.d iExperienceRepo) {
        return new n(context, win, recordMgr, iExperienceRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f76830a.get(), this.f76831b.get(), this.f76832c.get(), this.f76833d.get());
    }
}

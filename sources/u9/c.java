package u9;

import tv.t;
import tv.w;
import tv.x;
import w9.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes4.dex */
public final class c implements tv.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final t<q9.x> f92046a;

    /* renamed from: b, reason: collision with root package name */
    public final t<w9.a> f92047b;

    /* renamed from: c, reason: collision with root package name */
    public final t<k> f92048c;

    /* renamed from: d, reason: collision with root package name */
    public final t<com.baicizhan.client.business.managers.experience.data.remote.b> f92049d;

    /* renamed from: e, reason: collision with root package name */
    public final t<aa.a> f92050e;

    public c(t<q9.x> studyMgrProvider, t<w9.a> assembleDaoProvider, t<k> studyBehaviourDaoProvider, t<com.baicizhan.client.business.managers.experience.data.remote.b> expRemoteProvider, t<aa.a> timeProvider) {
        this.f92046a = studyMgrProvider;
        this.f92047b = assembleDaoProvider;
        this.f92048c = studyBehaviourDaoProvider;
        this.f92049d = expRemoteProvider;
        this.f92050e = timeProvider;
    }

    public static c a(t<q9.x> studyMgrProvider, t<w9.a> assembleDaoProvider, t<k> studyBehaviourDaoProvider, t<com.baicizhan.client.business.managers.experience.data.remote.b> expRemoteProvider, t<aa.a> timeProvider) {
        return new c(studyMgrProvider, assembleDaoProvider, studyBehaviourDaoProvider, expRemoteProvider, timeProvider);
    }

    public static b c(q9.x studyMgr, w9.a assembleDao, k studyBehaviourDao, com.baicizhan.client.business.managers.experience.data.remote.b expRemote, aa.a time) {
        return new b(studyMgr, assembleDao, studyBehaviourDao, expRemote, time);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f92046a.get(), this.f92047b.get(), this.f92048c.get(), this.f92049d.get(), this.f92050e.get());
    }
}

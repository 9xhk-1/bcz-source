package n6;

import h5.m0;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y5.a f74496a;

    public d(@m80.k y5.a settingRepo) {
        g0.p(settingRepo, "settingRepo");
        this.f74496a = settingRepo;
    }

    public final <T> T a(@m80.k m0<T> def) {
        g0.p(def, "def");
        return def.b(this.f74496a.c().get(def.getKey()));
    }
}

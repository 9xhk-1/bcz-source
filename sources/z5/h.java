package z5;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f.class})
/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public String f100846a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public List<Long> f100847b;

    @Override // z5.f
    @m80.k
    public List<Long> a(@m80.k String gameId) {
        g0.p(gameId, "gameId");
        if (!g0.g(gameId, this.f100846a)) {
            return h0.J();
        }
        List<Long> list = this.f100847b;
        return list == null ? h0.J() : list;
    }

    @Override // z5.f
    public void b(@m80.k String gameId, @m80.k List<Long> topicIds) {
        g0.p(gameId, "gameId");
        g0.p(topicIds, "topicIds");
        this.f100846a = gameId;
        this.f100847b = topicIds;
    }
}

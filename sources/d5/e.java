package d5;

import com.heytap.mcssdk.constant.IntentConstant;
import k50.l0;
import k50.o;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f47248a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k50.a f47249b;

    public e(@m80.k g registry, @m80.k k50.a json) {
        g0.p(registry, "registry");
        g0.p(json, "json");
        this.f47248a = registry;
        this.f47249b = json;
    }

    @m80.k
    public final j a(@m80.k String data) {
        g0.p(data, "data");
        return (j) this.f47249b.c(l.f47259a, data);
    }

    @m80.k
    public final String b(@m80.k m rsp) {
        g0.p(rsp, "rsp");
        return this.f47249b.a(m.Companion.serializer(), rsp);
    }

    public final boolean c(@m80.k String msgStr) {
        l0 y11;
        String o11;
        g0.p(msgStr, "msgStr");
        k50.k kVar = (k50.k) o.x(k50.a.f65901d.l(msgStr)).get(IntentConstant.COMMAND);
        return (kVar == null || (y11 = o.y(kVar)) == null || (o11 = o.o(y11)) == null || !this.f47248a.a(o11)) ? false : true;
    }
}

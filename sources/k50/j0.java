package k50;

import java.util.LinkedHashMap;
import java.util.Map;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, k> f65966a = new LinkedHashMap();

    @v0
    public j0() {
    }

    @v0
    @m80.k
    public final i0 a() {
        return new i0(this.f65966a);
    }

    @m80.l
    public final k b(@m80.k String key, @m80.k k element) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(element, "element");
        return this.f65966a.put(key, element);
    }
}

package ox;

import a00.h0;
import a00.r0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, List<String>> f78478a;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k Map<String, ? extends List<String>> mapping) {
        g0.p(mapping, "mapping");
        this.f78478a = mapping;
    }

    public final boolean a(@m80.k String key) {
        g0.p(key, "key");
        return this.f78478a.containsKey(key);
    }

    @m80.l
    public final String b(@m80.k String key) {
        g0.p(key, "key");
        List<String> list = this.f78478a.get(key);
        if (list != null) {
            return (String) r0.L2(list);
        }
        return null;
    }

    @m80.k
    public final List<String> c(@m80.k String key) {
        g0.p(key, "key");
        List<String> list = this.f78478a.get(key);
        return list == null ? h0.J() : list;
    }
}

package l10;

import java.util.Map;

/* loaded from: classes8.dex */
public class b implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f69121a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f69122b;

    public b(Class cls, Map map) {
        this.f69121a = cls;
        this.f69122b = map;
    }

    @Override // x00.a
    public Object invoke() {
        String l11;
        l11 = e.l(this.f69121a, this.f69122b);
        return l11;
    }
}

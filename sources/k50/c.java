package k50;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<k> f65911a = new ArrayList();

    @v0
    public c() {
    }

    public final boolean a(@m80.k k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        this.f65911a.add(element);
        return true;
    }

    @f50.f
    public final boolean b(@m80.k Collection<? extends k> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return this.f65911a.addAll(elements);
    }

    @v0
    @m80.k
    public final b c() {
        return new b(this.f65911a);
    }
}

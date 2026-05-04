package y;

import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j<E> extends g<E> implements Set<E>, y00.h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public Set<E> f98784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@k Set<E> set) {
        super(set);
        g0.p(set, "set");
        this.f98784b = set;
    }

    @k
    public final Set<E> g() {
        return this.f98784b;
    }

    public final void h(@k Set<E> set) {
        g0.p(set, "<set-?>");
        this.f98784b = set;
    }
}

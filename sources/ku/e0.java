package ku;

import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f68700a;

    public e0(b2 b2Var) {
        this.f68700a = b2Var;
    }

    @Override // ku.a
    public Collection<b2> a() {
        return Collections.singletonList(this.f68700a);
    }

    public b2 c() {
        return this.f68700a;
    }
}

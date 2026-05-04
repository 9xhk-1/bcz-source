package s20;

import e30.r0;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 extends b {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r0 f87438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k List<? extends g<?>> value, @m80.k r0 type) {
        super(value, new z(type));
        g0.p(value, "value");
        g0.p(type, "type");
        this.f87438c = type;
    }

    public static final r0 c(r0 r0Var, p10.a0 it) {
        g0.p(it, "it");
        return r0Var;
    }

    @m80.k
    public final r0 e() {
        return this.f87438c;
    }
}

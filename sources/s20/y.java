package s20;

import e30.c1;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@m80.k String value) {
        super(value);
        g0.p(value, "value");
    }

    @Override // s20.g
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 a(@m80.k p10.a0 module) {
        g0.p(module, "module");
        c1 W = module.q().W();
        g0.o(W, "getStringType(...)");
        return W;
    }

    @Override // s20.g
    @m80.k
    public String toString() {
        return '\"' + b() + '\"';
    }
}

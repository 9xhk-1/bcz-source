package a90;

import java.util.Map;
import java.util.Objects;
import org.junit.jupiter.api.k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t1 implements p80.u {
    @Override // p80.u
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public k3 u(p80.t parameterContext, final p80.n extensionContext) {
        Objects.requireNonNull(extensionContext);
        return new k3() { // from class: a90.s1
            @Override // org.junit.jupiter.api.k3
            public final void a(Map map) {
                p80.n.this.S(map);
            }
        };
    }

    @Override // p80.u
    public boolean a(p80.t parameterContext, p80.n extensionContext) {
        Class type;
        type = parameterContext.b().getType();
        return type == k3.class;
    }
}

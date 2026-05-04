package ju;

import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class w implements i {
    @Override // ju.i
    public a a(final o oVar) {
        return com.typesafe.config.a.H(oVar).orElseGet(new Supplier() { // from class: ju.v
            @Override // java.util.function.Supplier
            public final Object get() {
                a d02;
                d02 = com.typesafe.config.a.d0("application", o.this);
                return d02;
            }
        });
    }
}

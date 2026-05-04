package o80;

import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q extends s1<n> {
    public q() {
        super(n.class, new Function() { // from class: o80.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((n) obj).value();
            }
        }, new Function() { // from class: o80.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((n) obj).disabledReason();
            }
        });
    }

    @Override // o80.s1
    public boolean a0(boolean methodResult) {
        return !methodResult;
    }
}

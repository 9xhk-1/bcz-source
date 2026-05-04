package x80;

import ba0.g4;
import java.lang.reflect.Method;
import org.junit.jupiter.api.k2;
import w80.d3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q0 extends a<Method> implements k2 {
    public q0(d3 testDescriptor) {
        super(testDescriptor, testDescriptor.c0());
    }

    @Override // org.junit.jupiter.api.k2
    public final Method getMethod() {
        return b();
    }

    public String toString() {
        return new g4(this).a("method", getMethod().toGenericString()).toString();
    }
}

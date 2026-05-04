package w80;

import java.util.Optional;
import java.util.function.Function;
import org.junit.platform.engine.TestDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final /* synthetic */ class z4 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return (TestDescriptor) ((Optional) obj).get();
    }
}

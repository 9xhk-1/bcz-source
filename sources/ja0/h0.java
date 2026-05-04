package ja0;

import java.util.Optional;
import java.util.function.Function;
import org.junit.platform.engine.TestDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final /* synthetic */ class h0 implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.junit.platform.engine.support.hierarchical.g f63959a;

    public /* synthetic */ h0(org.junit.platform.engine.support.hierarchical.g gVar) {
        this.f63959a = gVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional e11;
        e11 = this.f63959a.e((TestDescriptor) obj);
        return e11;
    }
}

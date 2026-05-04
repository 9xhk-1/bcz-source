package ja0;

import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Node f63964a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Node {
    }

    public static <C extends p> Node<C> a(TestDescriptor testDescriptor) {
        return testDescriptor instanceof Node ? (Node) testDescriptor : f63964a;
    }
}

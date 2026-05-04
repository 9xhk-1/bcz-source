package q10;

import e30.r0;
import java.util.Map;
import kotlin.jvm.internal.u0;
import p10.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDescriptor.kt\norg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    public static final class a {
        @m80.l
        public static n20.c a(@m80.k c cVar) {
            p10.b l11 = u20.e.l(cVar);
            if (l11 != null) {
                if (g30.i.m(l11)) {
                    l11 = null;
                }
                if (l11 != null) {
                    return u20.e.k(l11);
                }
            }
            return null;
        }
    }

    @m80.k
    Map<n20.f, s20.g<?>> a();

    @m80.l
    n20.c d();

    @m80.k
    x0 getSource();

    @m80.k
    r0 getType();
}

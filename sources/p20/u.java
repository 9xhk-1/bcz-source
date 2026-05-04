package p20;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface u {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static boolean a(@m80.k u uVar) {
            return uVar.e().getIncludeAnnotationArguments();
        }

        public static boolean b(@m80.k u uVar) {
            return uVar.e().getIncludeEmptyAnnotationArguments();
        }
    }

    void a(@m80.k ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    boolean b();

    @m80.k
    Set<n20.c> c();

    boolean d();

    @m80.k
    AnnotationArgumentsRenderingPolicy e();

    void f(@m80.k Set<n20.c> set);

    void g(@m80.k Set<? extends DescriptorRendererModifier> set);

    void h(boolean z11);

    void i(boolean z11);

    boolean j();

    void k(boolean z11);

    boolean l();

    void m(boolean z11);

    void n(boolean z11);

    void o(boolean z11);

    void p(boolean z11);

    void q(@m80.k RenderingFormat renderingFormat);

    void r(@m80.k AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    void s(@m80.k p20.a aVar);

    void t(boolean z11);
}

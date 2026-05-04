package p20;

import a00.w1;
import e30.a2;
import e30.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import org.junit.jupiter.api.j2;
import p10.b1;
import p10.j1;
import p20.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f78740a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78741b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78742c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78743d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78744e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78745f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78746g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78747h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78748i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78749j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78750k;

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f78751l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: p20.m$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0970a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f78752a;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f78752a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final String a(@m80.k p10.e classifier) {
            g0.p(classifier, "classifier");
            if (classifier instanceof b1) {
                return "typealias";
            }
            if (!(classifier instanceof p10.b)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            p10.b bVar = (p10.b) classifier;
            if (bVar.m0()) {
                return "companion object";
            }
            switch (C0970a.f78752a[bVar.getKind().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @m80.k
        public final m b(@m80.k x00.l<? super u, g2> changeOptions) {
            g0.p(changeOptions, "changeOptions");
            x xVar = new x();
            changeOptions.invoke(xVar);
            xVar.s0();
            return new t(xVar);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f78753a = new a();

            @Override // p20.m.b
            public void a(@m80.k j1 parameter, int i11, int i12, @m80.k StringBuilder builder) {
                g0.p(parameter, "parameter");
                g0.p(builder, "builder");
                if (i11 != i12 - 1) {
                    builder.append(j2.O);
                }
            }

            @Override // p20.m.b
            public void b(int i11, @m80.k StringBuilder builder) {
                g0.p(builder, "builder");
                builder.append(pn.j.f81006c);
            }

            @Override // p20.m.b
            public void c(int i11, @m80.k StringBuilder builder) {
                g0.p(builder, "builder");
                builder.append(pn.j.f81007d);
            }

            @Override // p20.m.b
            public void d(@m80.k j1 parameter, int i11, int i12, @m80.k StringBuilder builder) {
                g0.p(parameter, "parameter");
                g0.p(builder, "builder");
            }
        }

        void a(@m80.k j1 j1Var, int i11, int i12, @m80.k StringBuilder sb2);

        void b(int i11, @m80.k StringBuilder sb2);

        void c(int i11, @m80.k StringBuilder sb2);

        void d(@m80.k j1 j1Var, int i11, int i12, @m80.k StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f78740a = aVar;
        f78741b = aVar.b(p20.b.f78729a);
        f78742c = aVar.b(d.f78731a);
        f78743d = aVar.b(e.f78732a);
        f78744e = aVar.b(f.f78733a);
        f78745f = aVar.b(g.f78734a);
        f78746g = aVar.b(h.f78735a);
        f78747h = aVar.b(i.f78736a);
        f78748i = aVar.b(j.f78737a);
        f78749j = aVar.b(k.f78738a);
        f78750k = aVar.b(l.f78739a);
        f78751l = aVar.b(c.f78730a);
    }

    public static final g2 A(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.g(DescriptorRendererModifier.ALL);
        return g2.f100423a;
    }

    public static final g2 B(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.q(RenderingFormat.HTML);
        withOptions.g(DescriptorRendererModifier.ALL);
        return g2.f100423a;
    }

    public static final g2 C(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.n(false);
        withOptions.g(w1.k());
        withOptions.s(a.b.f78727a);
        withOptions.k(true);
        withOptions.a(ParameterNameRenderingPolicy.NONE);
        withOptions.p(true);
        withOptions.t(true);
        withOptions.o(true);
        withOptions.m(true);
        return g2.f100423a;
    }

    public static final g2 D(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.s(a.b.f78727a);
        withOptions.a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return g2.f100423a;
    }

    public static final g2 E(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.g(w1.k());
        return g2.f100423a;
    }

    public static /* synthetic */ String S(m mVar, q10.c cVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i11 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return mVar.R(cVar, annotationUseSiteTarget);
    }

    public static final g2 u(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.n(false);
        withOptions.g(w1.k());
        return g2.f100423a;
    }

    public static final g2 v(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.n(false);
        withOptions.g(w1.k());
        withOptions.o(true);
        return g2.f100423a;
    }

    public static final g2 w(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.n(false);
        return g2.f100423a;
    }

    public static final g2 x(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.g(w1.k());
        withOptions.s(a.b.f78727a);
        withOptions.a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return g2.f100423a;
    }

    public static final g2 y(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.i(true);
        withOptions.s(a.C0969a.f78726a);
        withOptions.g(DescriptorRendererModifier.ALL);
        return g2.f100423a;
    }

    public static final g2 z(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.g(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        return g2.f100423a;
    }

    @m80.k
    public abstract String Q(@m80.k p10.h hVar);

    @m80.k
    public abstract String R(@m80.k q10.c cVar, @m80.l AnnotationUseSiteTarget annotationUseSiteTarget);

    @m80.k
    public abstract String T(@m80.k String str, @m80.k String str2, @m80.k n10.j jVar);

    @m80.k
    public abstract String U(@m80.k n20.d dVar);

    @m80.k
    public abstract String V(@m80.k n20.f fVar, boolean z11);

    @m80.k
    public abstract String W(@m80.k r0 r0Var);

    @m80.k
    public abstract String X(@m80.k a2 a2Var);

    @m80.k
    public final m Y(@m80.k x00.l<? super u, g2> changeOptions) {
        g0.p(changeOptions, "changeOptions");
        g0.n(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        x w11 = ((t) this).M0().w();
        changeOptions.invoke(w11);
        w11.s0();
        return new t(w11);
    }
}

package h50;

import a00.a0;
import a00.h0;
import androidx.exifinterface.media.ExifInterface;
import h10.r;
import h50.n;
import j50.q0;
import j50.s0;
import j50.u2;
import j50.w2;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"})
/* loaded from: classes8.dex */
public final class l {
    @m80.k
    public static final f c(@m80.k String serialName, @m80.k e kind) {
        g0.p(serialName, "serialName");
        g0.p(kind, "kind");
        if (k0.O3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return u2.a(serialName, kind);
    }

    @m80.k
    public static final f d(@m80.k String serialName, @m80.k f original) {
        g0.p(serialName, "serialName");
        g0.p(original, "original");
        if (k0.O3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (!g0.g(serialName, original.k())) {
            if (original.getKind() instanceof e) {
                u2.d(serialName);
            }
            return new o(serialName, original);
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.k() + ')').toString());
    }

    @m80.k
    public static final f e(@m80.k String serialName, @m80.k f[] typeParameters, @m80.k x00.l<? super a, g2> builderAction) {
        g0.p(serialName, "serialName");
        g0.p(typeParameters, "typeParameters");
        g0.p(builderAction, "builderAction");
        if (k0.O3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new h(serialName, n.a.f58541a, aVar.g().size(), a0.dz(typeParameters), aVar);
    }

    public static /* synthetic */ f f(String str, f[] fVarArr, x00.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: h50.j
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 g11;
                    g11 = l.g((a) obj2);
                    return g11;
                }
            };
        }
        return e(str, fVarArr, lVar);
    }

    public static final g2 g(a aVar) {
        g0.p(aVar, "<this>");
        return g2.f100423a;
    }

    @f50.h
    @m80.k
    public static final f h(@m80.k String serialName, @m80.k m kind, @m80.k f[] typeParameters, @m80.k x00.l<? super a, g2> builder) {
        g0.p(serialName, "serialName");
        g0.p(kind, "kind");
        g0.p(typeParameters, "typeParameters");
        g0.p(builder, "builder");
        if (k0.O3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (g0.g(kind, n.a.f58541a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new h(serialName, kind, aVar.g().size(), a0.dz(typeParameters), aVar);
    }

    public static /* synthetic */ f i(String str, m mVar, f[] fVarArr, x00.l lVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: h50.k
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 j11;
                    j11 = l.j((a) obj2);
                    return j11;
                }
            };
        }
        return h(str, mVar, fVarArr, lVar);
    }

    public static final g2 j(a aVar) {
        g0.p(aVar, "<this>");
        return g2.f100423a;
    }

    public static final /* synthetic */ <T> void k(a aVar, String elementName, List<? extends Annotation> annotations, boolean z11) {
        g0.p(aVar, "<this>");
        g0.p(elementName, "elementName");
        g0.p(annotations, "annotations");
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        aVar.a(elementName, f50.k0.j(null).a(), annotations, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(a aVar, String elementName, List annotations, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            annotations = h0.J();
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        g0.p(aVar, "<this>");
        g0.p(elementName, "elementName");
        g0.p(annotations, "annotations");
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        aVar.a(elementName, f50.k0.j(null).a(), annotations, z11);
    }

    @m80.k
    public static final f m(@m80.k f fVar) {
        g0.p(fVar, "<this>");
        return fVar instanceof w2 ? ((w2) fVar).m() : fVar;
    }

    @m80.k
    public static final f o(@m80.k f fVar) {
        g0.p(fVar, "<this>");
        return fVar.b() ? fVar : new w2(fVar);
    }

    @f50.f
    public static final /* synthetic */ <T> f q() {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        return r(f50.k0.j(null).a());
    }

    @f50.f
    @m80.k
    public static final f r(@m80.k f elementDescriptor) {
        g0.p(elementDescriptor, "elementDescriptor");
        return new j50.e(elementDescriptor);
    }

    @f50.f
    public static final /* synthetic */ <K, V> f s() {
        g0.y(6, "K");
        l0.n("kotlinx.serialization.serializer.simple");
        f a11 = f50.k0.j(null).a();
        g0.y(6, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        l0.n("kotlinx.serialization.serializer.simple");
        return t(a11, f50.k0.j(null).a());
    }

    @f50.f
    @m80.k
    public static final f t(@m80.k f keyDescriptor, @m80.k f valueDescriptor) {
        g0.p(keyDescriptor, "keyDescriptor");
        g0.p(valueDescriptor, "valueDescriptor");
        return new q0(keyDescriptor, valueDescriptor);
    }

    public static final /* synthetic */ <T> f u() {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        return f50.k0.j(null).a();
    }

    @m80.k
    public static final f v(@m80.k r type) {
        g0.p(type, "type");
        return f50.k0.j(type).a();
    }

    @f50.f
    public static final /* synthetic */ <T> f w() {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        return x(f50.k0.j(null).a());
    }

    @f50.f
    @m80.k
    public static final f x(@m80.k f elementDescriptor) {
        g0.p(elementDescriptor, "elementDescriptor");
        return new s0(elementDescriptor);
    }

    @f50.f
    public static /* synthetic */ void n(f fVar) {
    }

    public static /* synthetic */ void p(f fVar) {
    }
}

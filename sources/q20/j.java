package q20;

import e30.r0;
import java.util.Comparator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import p10.b1;
import p10.c1;
import p10.j1;
import p10.q0;
import p10.t0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j implements Comparator<p10.h> {

    /* renamed from: a, reason: collision with root package name */
    public static final j f81473a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final p20.m f81474b = p20.m.f78740a.b(new a());

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ boolean f81475c = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements x00.l<p20.u, g2> {
        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2 invoke(p20.u uVar) {
            uVar.n(false);
            uVar.h(true);
            uVar.r(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            uVar.g(DescriptorRendererModifier.ALL);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Comparator<p10.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f81476a = new b();

        @m80.l
        public static Integer c(p10.h hVar, p10.h hVar2) {
            int d11 = d(hVar2) - d(hVar);
            if (d11 != 0) {
                return Integer.valueOf(d11);
            }
            if (h.B(hVar) && h.B(hVar2)) {
                return 0;
            }
            int compareTo = hVar.getName().compareTo(hVar2.getName());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return null;
        }

        public static int d(p10.h hVar) {
            if (h.B(hVar)) {
                return 8;
            }
            if (hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                return 7;
            }
            if (hVar instanceof q0) {
                return ((q0) hVar).f0() == null ? 6 : 5;
            }
            if (hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.e) hVar).f0() == null ? 4 : 3;
            }
            if (hVar instanceof p10.b) {
                return 2;
            }
            return hVar instanceof b1 ? 1 : 0;
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(p10.h hVar, p10.h hVar2) {
            Integer c11 = c(hVar, hVar2);
            if (c11 != null) {
                return c11.intValue();
            }
            return 0;
        }
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(p10.h hVar, p10.h hVar2) {
        Integer c11 = b.c(hVar, hVar2);
        if (c11 != null) {
            return c11.intValue();
        }
        if ((hVar instanceof b1) && (hVar2 instanceof b1)) {
            p20.m mVar = f81474b;
            int compareTo = mVar.W(((b1) hVar).x0()).compareTo(mVar.W(((b1) hVar2).x0()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if ((hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (hVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) hVar;
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) hVar2;
            t0 f02 = aVar.f0();
            t0 f03 = aVar2.f0();
            if (f02 != null) {
                p20.m mVar2 = f81474b;
                int compareTo2 = mVar2.W(f02.getType()).compareTo(mVar2.W(f03.getType()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List<j1> g11 = aVar.g();
            List<j1> g12 = aVar2.g();
            for (int i11 = 0; i11 < Math.min(g11.size(), g12.size()); i11++) {
                p20.m mVar3 = f81474b;
                int compareTo3 = mVar3.W(g11.get(i11).getType()).compareTo(mVar3.W(g12.get(i11).getType()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            int size = g11.size() - g12.size();
            if (size != 0) {
                return size;
            }
            List<c1> typeParameters = aVar.getTypeParameters();
            List<c1> typeParameters2 = aVar2.getTypeParameters();
            for (int i12 = 0; i12 < Math.min(typeParameters.size(), typeParameters2.size()); i12++) {
                List<r0> upperBounds = typeParameters.get(i12).getUpperBounds();
                List<r0> upperBounds2 = typeParameters2.get(i12).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i13 = 0; i13 < upperBounds.size(); i13++) {
                    p20.m mVar4 = f81474b;
                    int compareTo4 = mVar4.W(upperBounds.get(i13)).compareTo(mVar4.W(upperBounds2.get(i13)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof CallableMemberDescriptor)) {
                int ordinal = ((CallableMemberDescriptor) aVar).getKind().ordinal() - ((CallableMemberDescriptor) aVar2).getKind().ordinal();
                if (ordinal != 0) {
                    return ordinal;
                }
            }
        } else {
            if (!(hVar instanceof p10.b) || !(hVar2 instanceof p10.b)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", hVar, hVar.getClass(), hVar2, hVar2.getClass()));
            }
            p10.b bVar = (p10.b) hVar;
            p10.b bVar2 = (p10.b) hVar2;
            if (bVar.getKind().ordinal() != bVar2.getKind().ordinal()) {
                return bVar.getKind().ordinal() - bVar2.getKind().ordinal();
            }
            if (bVar.m0() != bVar2.m0()) {
                return bVar.m0() ? 1 : -1;
            }
        }
        p20.m mVar5 = f81474b;
        int compareTo5 = mVar5.Q(hVar).compareTo(mVar5.Q(hVar2));
        return compareTo5 != 0 ? compareTo5 : h.g(hVar).getName().compareTo(h.g(hVar2).getName());
    }
}

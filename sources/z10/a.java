package z10;

import a30.v;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p10.j1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: z10.a$a, reason: collision with other inner class name */
    public static class C1376a extends q20.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f100593a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f100594b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f100595c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: z10.a$a$a, reason: collision with other inner class name */
        public class C1377a implements x00.l<CallableMemberDescriptor, g2> {
            public C1377a() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // x00.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g2 invoke(@m80.k CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    a(0);
                }
                C1376a.this.f100593a.a(callableMemberDescriptor);
                return g2.f100423a;
            }
        }

        public C1376a(v vVar, Set set, boolean z11) {
            this.f100593a = vVar;
            this.f100594b = set;
            this.f100595c = z11;
        }

        private static /* synthetic */ void f(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "fromSuper";
            } else if (i11 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i11 == 3) {
                objArr[0] = "member";
            } else if (i11 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "conflict";
            } else if (i11 == 3 || i11 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // q20.l
        public void a(@m80.k CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                f(0);
            }
            OverridingUtil.K(callableMemberDescriptor, new C1377a());
            this.f100594b.add(callableMemberDescriptor);
        }

        @Override // q20.l
        public void d(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k Collection<? extends CallableMemberDescriptor> collection) {
            if (callableMemberDescriptor == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f100595c || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                super.d(callableMemberDescriptor, collection);
            }
        }

        @Override // q20.k
        public void e(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                f(1);
            }
            if (callableMemberDescriptor2 == null) {
                f(2);
            }
        }
    }

    public static /* synthetic */ void a(int i11) {
        String str = i11 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 18 ? 3 : 2];
        switch (i11) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 == 18) {
            throw new IllegalStateException(format);
        }
    }

    @m80.l
    public static j1 b(@m80.k n20.f fVar, @m80.k p10.b bVar) {
        if (fVar == null) {
            a(19);
        }
        if (bVar == null) {
            a(20);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f11 = bVar.f();
        if (f11.size() != 1) {
            return null;
        }
        for (j1 j1Var : f11.iterator().next().g()) {
            if (j1Var.getName().equals(fVar)) {
                return j1Var;
            }
        }
        return null;
    }

    @m80.k
    public static <D extends CallableMemberDescriptor> Collection<D> c(@m80.k n20.f fVar, @m80.k Collection<D> collection, @m80.k Collection<D> collection2, @m80.k p10.b bVar, @m80.k v vVar, @m80.k OverridingUtil overridingUtil, boolean z11) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (bVar == null) {
            a(15);
        }
        if (vVar == null) {
            a(16);
        }
        if (overridingUtil == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.v(fVar, collection, collection2, bVar, new C1376a(vVar, linkedHashSet, z11));
        return linkedHashSet;
    }

    @m80.k
    public static <D extends CallableMemberDescriptor> Collection<D> d(@m80.k n20.f fVar, @m80.k Collection<D> collection, @m80.k Collection<D> collection2, @m80.k p10.b bVar, @m80.k v vVar, @m80.k OverridingUtil overridingUtil) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (bVar == null) {
            a(3);
        }
        if (vVar == null) {
            a(4);
        }
        if (overridingUtil == null) {
            a(5);
        }
        return c(fVar, collection, collection2, bVar, vVar, overridingUtil, false);
    }

    @m80.k
    public static <D extends CallableMemberDescriptor> Collection<D> e(@m80.k n20.f fVar, @m80.k Collection<D> collection, @m80.k Collection<D> collection2, @m80.k p10.b bVar, @m80.k v vVar, @m80.k OverridingUtil overridingUtil) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (bVar == null) {
            a(9);
        }
        if (vVar == null) {
            a(10);
        }
        if (overridingUtil == null) {
            a(11);
        }
        return c(fVar, collection, collection2, bVar, vVar, overridingUtil, true);
    }
}

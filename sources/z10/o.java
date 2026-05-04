package z10;

import e30.r0;
import f20.r;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p10.c1;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f100625a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements o {
        public static /* synthetic */ void c(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i11 == 5 || i11 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // z10.o
        public void a(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k List<String> list) {
            if (callableMemberDescriptor == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // z10.o
        @m80.k
        public b b(@m80.k r rVar, @m80.k p10.b bVar, @m80.k r0 r0Var, @m80.l r0 r0Var2, @m80.k List<j1> list, @m80.k List<c1> list2) {
            if (rVar == null) {
                c(0);
            }
            if (bVar == null) {
                c(1);
            }
            if (r0Var == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(r0Var, r0Var2, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final r0 f100626a;

        /* renamed from: b, reason: collision with root package name */
        public final r0 f100627b;

        /* renamed from: c, reason: collision with root package name */
        public final List<j1> f100628c;

        /* renamed from: d, reason: collision with root package name */
        public final List<c1> f100629d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f100630e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f100631f;

        public b(@m80.k r0 r0Var, @m80.l r0 r0Var2, @m80.k List<j1> list, @m80.k List<c1> list2, @m80.k List<String> list3, boolean z11) {
            if (r0Var == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f100626a = r0Var;
            this.f100627b = r0Var2;
            this.f100628c = list;
            this.f100629d = list2;
            this.f100630e = list3;
            this.f100631f = z11;
        }

        public static /* synthetic */ void a(int i11) {
            String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
            switch (i11) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i11 == 4) {
                objArr[1] = "getReturnType";
            } else if (i11 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i11 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i11 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @m80.k
        public List<String> b() {
            List<String> list = this.f100630e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        @m80.l
        public r0 c() {
            return this.f100627b;
        }

        @m80.k
        public r0 d() {
            r0 r0Var = this.f100626a;
            if (r0Var == null) {
                a(4);
            }
            return r0Var;
        }

        @m80.k
        public List<c1> e() {
            List<c1> list = this.f100629d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        @m80.k
        public List<j1> f() {
            List<j1> list = this.f100628c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f100631f;
        }
    }

    void a(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k List<String> list);

    @m80.k
    b b(@m80.k r rVar, @m80.k p10.b bVar, @m80.k r0 r0Var, @m80.l r0 r0Var2, @m80.k List<j1> list, @m80.k List<c1> list2);
}

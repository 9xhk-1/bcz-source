package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import a00.r0;
import d30.i;
import d30.m;
import h10.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import n10.j;
import o10.e;
import o10.f;
import o10.g;
import p10.a0;
import s10.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,103:1\n1#2:104\n19#3:105\n*S KotlinDebug\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n*L\n80#1:105\n*E\n"})
/* loaded from: classes8.dex */
public final class JvmBuiltIns extends j {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f67214l = {o0.u(new PropertyReference1Impl(o0.d(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Kind f67215i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public x00.a<a> f67216j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final i f67217k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Kind {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind FROM_DEPENDENCIES = new Kind("FROM_DEPENDENCIES", 0);
        public static final Kind FROM_CLASS_LOADER = new Kind("FROM_CLASS_LOADER", 1);
        public static final Kind FALLBACK = new Kind("FALLBACK", 2);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Kind(String str, int i11) {
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final a0 f67218a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67219b;

        public a(@k a0 ownerModuleDescriptor, boolean z11) {
            g0.p(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f67218a = ownerModuleDescriptor;
            this.f67219b = z11;
        }

        @k
        public final a0 a() {
            return this.f67218a;
        }

        public final boolean b() {
            return this.f67219b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67220a;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67220a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@k d30.n storageManager, @k Kind kind) {
        super(storageManager);
        g0.p(storageManager, "storageManager");
        g0.p(kind, "kind");
        this.f67215i = kind;
        this.f67217k = storageManager.f(new e(this, storageManager));
        int i11 = b.f67220a[kind.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                f(false);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f(true);
            }
        }
    }

    public static final d I0(JvmBuiltIns jvmBuiltIns, d30.n nVar) {
        f0 r11 = jvmBuiltIns.r();
        g0.o(r11, "getBuiltInsModule(...)");
        return new d(r11, nVar, new g(jvmBuiltIns));
    }

    public static final a J0(JvmBuiltIns jvmBuiltIns) {
        x00.a<a> aVar = jvmBuiltIns.f67216j;
        if (aVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        a invoke = aVar.invoke();
        jvmBuiltIns.f67216j = null;
        return invoke;
    }

    public static final a N0(a0 a0Var, boolean z11) {
        return new a(a0Var, z11);
    }

    @Override // n10.j
    @k
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public List<r10.b> v() {
        Iterable<r10.b> v11 = super.v();
        g0.o(v11, "getClassDescriptorFactories(...)");
        d30.n U = U();
        g0.o(U, "getStorageManager(...)");
        f0 r11 = r();
        g0.o(r11, "getBuiltInsModule(...)");
        return r0.F4(v11, new c(U, r11, null, 4, null));
    }

    @k
    public final d L0() {
        return (d) m.a(this.f67217k, this, f67214l[0]);
    }

    @Override // n10.j
    @k
    public r10.c M() {
        return L0();
    }

    public final void M0(@k a0 moduleDescriptor, boolean z11) {
        g0.p(moduleDescriptor, "moduleDescriptor");
        O0(new f(moduleDescriptor, z11));
    }

    public final void O0(@k x00.a<a> computation) {
        g0.p(computation, "computation");
        this.f67216j = computation;
    }

    @Override // n10.j
    @k
    public r10.a g() {
        return L0();
    }
}

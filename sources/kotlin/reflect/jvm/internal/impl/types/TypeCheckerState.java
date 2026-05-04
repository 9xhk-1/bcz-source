package kotlin.reflect.jvm.internal.impl.types;

import e30.p;
import e30.q;
import i30.g;
import i30.h;
import i30.o;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,860:1\n1#2:861\n*E\n"})
/* loaded from: classes8.dex */
public class TypeCheckerState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67652a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67653b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67654c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final o f67655d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final p f67656e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final q f67657f;

    /* renamed from: g, reason: collision with root package name */
    public int f67658g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f67659h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public ArrayDeque<h> f67660i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public Set<h> f67661j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LowerCapturedTypePolicy {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ LowerCapturedTypePolicy[] $VALUES;
        public static final LowerCapturedTypePolicy CHECK_ONLY_LOWER = new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);
        public static final LowerCapturedTypePolicy CHECK_SUBTYPE_AND_LOWER = new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);
        public static final LowerCapturedTypePolicy SKIP_LOWER = new LowerCapturedTypePolicy("SKIP_LOWER", 2);

        private static final /* synthetic */ LowerCapturedTypePolicy[] $values() {
            return new LowerCapturedTypePolicy[]{CHECK_ONLY_LOWER, CHECK_SUBTYPE_AND_LOWER, SKIP_LOWER};
        }

        static {
            LowerCapturedTypePolicy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private LowerCapturedTypePolicy(String str, int i11) {
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a, reason: collision with other inner class name */
        public static final class C0801a implements a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f67662a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a
            public void a(@k x00.a<Boolean> block) {
                g0.p(block, "block");
                if (this.f67662a) {
                    return;
                }
                this.f67662a = block.invoke().booleanValue();
            }

            public final boolean b() {
                return this.f67662a;
            }
        }

        void a(@k x00.a<Boolean> aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class a extends b {
            public a() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$LowerIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,860:1\n1#2:861\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b, reason: collision with other inner class name */
        public static final class C0802b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0802b f67663a = new C0802b();

            public C0802b() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @k
            public h a(@k TypeCheckerState state, @k g type) {
                g0.p(state, "state");
                g0.p(type, "type");
                return state.j().G0(type);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f67664a = new c();

            public c() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            public /* bridge */ /* synthetic */ h a(TypeCheckerState typeCheckerState, g gVar) {
                return (h) b(typeCheckerState, gVar);
            }

            @k
            public Void b(@k TypeCheckerState state, @k g type) {
                g0.p(state, "state");
                g0.p(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$UpperIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,860:1\n1#2:861\n*E\n"})
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f67665a = new d();

            public d() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @k
            public h a(@k TypeCheckerState state, @k g type) {
                g0.p(state, "state");
                g0.p(type, "type");
                return state.j().z(type);
            }
        }

        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public abstract h a(@k TypeCheckerState typeCheckerState, @k g gVar);

        public b() {
        }
    }

    public TypeCheckerState(boolean z11, boolean z12, boolean z13, @k o typeSystemContext, @k p kotlinTypePreparator, @k q kotlinTypeRefiner) {
        g0.p(typeSystemContext, "typeSystemContext");
        g0.p(kotlinTypePreparator, "kotlinTypePreparator");
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f67652a = z11;
        this.f67653b = z12;
        this.f67654c = z13;
        this.f67655d = typeSystemContext;
        this.f67656e = kotlinTypePreparator;
        this.f67657f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(TypeCheckerState typeCheckerState, g gVar, g gVar2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return typeCheckerState.c(gVar, gVar2, z11);
    }

    @l
    public Boolean c(@k g subType, @k g superType, boolean z11) {
        g0.p(subType, "subType");
        g0.p(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque<h> arrayDeque = this.f67660i;
        g0.m(arrayDeque);
        arrayDeque.clear();
        Set<h> set = this.f67661j;
        g0.m(set);
        set.clear();
        this.f67659h = false;
    }

    public boolean f(@k g subType, @k g superType) {
        g0.p(subType, "subType");
        g0.p(superType, "superType");
        return true;
    }

    @k
    public LowerCapturedTypePolicy g(@k h subType, @k i30.b superType) {
        g0.p(subType, "subType");
        g0.p(superType, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @l
    public final ArrayDeque<h> h() {
        return this.f67660i;
    }

    @l
    public final Set<h> i() {
        return this.f67661j;
    }

    @k
    public final o j() {
        return this.f67655d;
    }

    public final void k() {
        this.f67659h = true;
        if (this.f67660i == null) {
            this.f67660i = new ArrayDeque<>(4);
        }
        if (this.f67661j == null) {
            this.f67661j = o30.l.f75704c.a();
        }
    }

    public final boolean l(@k g type) {
        g0.p(type, "type");
        return this.f67654c && this.f67655d.n0(type);
    }

    public final boolean m() {
        return this.f67652a;
    }

    public final boolean n() {
        return this.f67653b;
    }

    @k
    public final g o(@k g type) {
        g0.p(type, "type");
        return this.f67656e.a(type);
    }

    @k
    public final g p(@k g type) {
        g0.p(type, "type");
        return this.f67657f.a(type);
    }

    public boolean q(@k x00.l<? super a, g2> block) {
        g0.p(block, "block");
        a.C0801a c0801a = new a.C0801a();
        block.invoke(c0801a);
        return c0801a.b();
    }
}

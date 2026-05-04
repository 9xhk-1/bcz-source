package h20;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f58142a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final d f58143b = new d(JvmPrimitiveType.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final d f58144c = new d(JvmPrimitiveType.CHAR);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final d f58145d = new d(JvmPrimitiveType.BYTE);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final d f58146e = new d(JvmPrimitiveType.SHORT);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final d f58147f = new d(JvmPrimitiveType.INT);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final d f58148g = new d(JvmPrimitiveType.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final d f58149h = new d(JvmPrimitiveType.LONG);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final d f58150i = new d(JvmPrimitiveType.DOUBLE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends s {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final s f58151j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k s elementType) {
            super(null);
            kotlin.jvm.internal.g0.p(elementType, "elementType");
            this.f58151j = elementType;
        }

        @m80.k
        public final s i() {
            return this.f58151j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final d a() {
            return s.f58143b;
        }

        @m80.k
        public final d b() {
            return s.f58145d;
        }

        @m80.k
        public final d c() {
            return s.f58144c;
        }

        @m80.k
        public final d d() {
            return s.f58150i;
        }

        @m80.k
        public final d e() {
            return s.f58148g;
        }

        @m80.k
        public final d f() {
            return s.f58147f;
        }

        @m80.k
        public final d g() {
            return s.f58149h;
        }

        @m80.k
        public final d h() {
            return s.f58146e;
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends s {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final String f58152j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k String internalName) {
            super(null);
            kotlin.jvm.internal.g0.p(internalName, "internalName");
            this.f58152j = internalName;
        }

        @m80.k
        public final String i() {
            return this.f58152j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends s {

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public final JvmPrimitiveType f58153j;

        public d(@m80.l JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f58153j = jvmPrimitiveType;
        }

        @m80.l
        public final JvmPrimitiveType i() {
            return this.f58153j;
        }
    }

    public /* synthetic */ s(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public String toString() {
        return u.f58154a.e(this);
    }

    public s() {
    }
}

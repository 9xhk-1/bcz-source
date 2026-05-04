package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import h20.x;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import m80.k;
import m80.l;
import n6.m;
import p10.x0;
import s20.f;
import y10.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a implements x.c {

    /* renamed from: j, reason: collision with root package name */
    public static boolean f67285j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<n20.b, KotlinClassHeader.Kind> f67286k;

    /* renamed from: a, reason: collision with root package name */
    public int[] f67287a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f67288b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f67289c = 0;

    /* renamed from: d, reason: collision with root package name */
    public String f67290d = null;

    /* renamed from: e, reason: collision with root package name */
    public String[] f67291e = null;

    /* renamed from: f, reason: collision with root package name */
    public String[] f67292f = null;

    /* renamed from: g, reason: collision with root package name */
    public String[] f67293g = null;

    /* renamed from: h, reason: collision with root package name */
    public KotlinClassHeader.Kind f67294h = null;

    /* renamed from: i, reason: collision with root package name */
    public String[] f67295i = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b implements x.b {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f67296a = new ArrayList();

        private static /* synthetic */ void f(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i11 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i11 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i11 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i11 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // h20.x.b
        public void a() {
            g((String[]) this.f67296a.toArray(new String[0]));
        }

        @Override // h20.x.b
        public void b(@k f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        @Override // h20.x.b
        public void c(@l Object obj) {
            if (obj instanceof String) {
                this.f67296a.add((String) obj);
            }
        }

        @Override // h20.x.b
        @l
        public x.a d(@k n20.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // h20.x.b
        public void e(@k n20.b bVar, @k n20.f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        public abstract void g(@k String[] strArr);
    }

    static {
        try {
            f67285j = m.f74525c.equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f67285j = false;
        }
        HashMap hashMap = new HashMap();
        f67286k = hashMap;
        hashMap.put(n20.b.k(new n20.c("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(n20.b.k(new n20.c("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(n20.b.k(new n20.c("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(n20.b.k(new n20.c("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(n20.b.k(new n20.c("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public static /* synthetic */ void d(int i11) {
        Object[] objArr = new Object[3];
        if (i11 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // h20.x.c
    @l
    public x.a c(@k n20.b bVar, @k x0 x0Var) {
        KotlinClassHeader.Kind kind;
        if (bVar == null) {
            d(0);
        }
        if (x0Var == null) {
            d(1);
        }
        n20.c a11 = bVar.a();
        if (a11.equals(e0.f99030a)) {
            return new c();
        }
        if (a11.equals(e0.f99049t)) {
            return new d();
        }
        if (f67285j || this.f67294h != null || (kind = f67286k.get(bVar)) == null) {
            return null;
        }
        this.f67294h = kind;
        return new e();
    }

    @l
    public KotlinClassHeader m(m20.e eVar) {
        if (this.f67294h == null || this.f67287a == null) {
            return null;
        }
        m20.e eVar2 = new m20.e(this.f67287a, (this.f67289c & 8) != 0);
        if (!eVar2.h(eVar)) {
            this.f67293g = this.f67291e;
            this.f67291e = null;
        } else if (o() && this.f67291e == null) {
            return null;
        }
        String[] strArr = this.f67295i;
        return new KotlinClassHeader(this.f67294h, eVar2, this.f67291e, this.f67293g, this.f67292f, this.f67288b, this.f67289c, this.f67290d, strArr != null ? m20.a.e(strArr) : null);
    }

    @l
    public KotlinClassHeader n() {
        return m(m20.e.f71807i);
    }

    public final boolean o() {
        KotlinClassHeader.Kind kind = this.f67294h;
        return kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements x.a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$a, reason: collision with other inner class name */
        public class C0795a extends b {
            public C0795a() {
            }

            public static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            public void g(@k String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                a.this.f67291e = strArr;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends b {
            public b() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            public void g(@k String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                a.this.f67292f = strArr;
            }
        }

        public c() {
        }

        public static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumClassId";
            } else if (i11 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i11 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "visitEnum";
            } else if (i11 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // h20.x.a
        public void b(@l n20.f fVar, @k f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // h20.x.a
        @l
        public x.b c(@l n20.f fVar) {
            String b11 = fVar != null ? fVar.b() : null;
            if ("d1".equals(b11)) {
                return h();
            }
            if ("d2".equals(b11)) {
                return i();
            }
            return null;
        }

        @Override // h20.x.a
        @l
        public x.a d(@l n20.f fVar, @k n20.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // h20.x.a
        public void e(@l n20.f fVar, @k n20.b bVar, @k n20.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // h20.x.a
        public void f(@l n20.f fVar, @l Object obj) {
            if (fVar == null) {
                return;
            }
            String b11 = fVar.b();
            if ("k".equals(b11)) {
                if (obj instanceof Integer) {
                    a.this.f67294h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(b11)) {
                if (obj instanceof int[]) {
                    a.this.f67287a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(b11)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    a.this.f67288b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(b11)) {
                if (obj instanceof Integer) {
                    a.this.f67289c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(b11) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                a.this.f67290d = str2;
            }
        }

        @k
        public final x.b h() {
            return new C0795a();
        }

        @k
        public final x.b i() {
            return new b();
        }

        @Override // h20.x.a
        public void a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements x.a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d$a, reason: collision with other inner class name */
        public class C0796a extends b {
            public C0796a() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            public void g(@k String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                a.this.f67295i = strArr;
            }
        }

        public d() {
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumClassId";
            } else if (i11 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i11 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "visitEnum";
            } else if (i11 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // h20.x.a
        public void b(@l n20.f fVar, @k f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // h20.x.a
        @l
        public x.b c(@l n20.f fVar) {
            if (yr.e.f100279a.equals(fVar != null ? fVar.b() : null)) {
                return h();
            }
            return null;
        }

        @Override // h20.x.a
        @l
        public x.a d(@l n20.f fVar, @k n20.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // h20.x.a
        public void e(@l n20.f fVar, @k n20.b bVar, @k n20.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @k
        public final x.b h() {
            return new C0796a();
        }

        @Override // h20.x.a
        public void a() {
        }

        @Override // h20.x.a
        public void f(@l n20.f fVar, @l Object obj) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements x.a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$a, reason: collision with other inner class name */
        public class C0797a extends b {
            public C0797a() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            public void g(@k String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                a.this.f67291e = strArr;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends b {
            public b() {
            }

            private static /* synthetic */ void f(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            public void g(@k String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                a.this.f67292f = strArr;
            }
        }

        public e() {
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumClassId";
            } else if (i11 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i11 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "visitEnum";
            } else if (i11 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @k
        private x.b h() {
            return new C0797a();
        }

        @k
        private x.b i() {
            return new b();
        }

        @Override // h20.x.a
        public void b(@l n20.f fVar, @k f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // h20.x.a
        @l
        public x.b c(@l n20.f fVar) {
            String b11 = fVar != null ? fVar.b() : null;
            if ("data".equals(b11) || "filePartClassNames".equals(b11)) {
                return h();
            }
            if ("strings".equals(b11)) {
                return i();
            }
            return null;
        }

        @Override // h20.x.a
        @l
        public x.a d(@l n20.f fVar, @k n20.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // h20.x.a
        public void e(@l n20.f fVar, @k n20.b bVar, @k n20.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // h20.x.a
        public void f(@l n20.f fVar, @l Object obj) {
            if (fVar == null) {
                return;
            }
            String b11 = fVar.b();
            if ("version".equals(b11)) {
                if (obj instanceof int[]) {
                    a.this.f67287a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(b11)) {
                a.this.f67288b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // h20.x.a
        public void a() {
        }
    }

    @Override // h20.x.c
    public void a() {
    }
}

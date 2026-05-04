package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import a00.h0;
import a00.k1;
import a00.q;
import g10.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m20.e;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: classes8.dex */
public final class KotlinClassHeader {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Kind f67275a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f67276b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String[] f67277c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String[] f67278d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String[] f67279e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f67280f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67281g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f67282h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final byte[] f67283i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,75:1\n8641#2,2:76\n8901#2,4:78\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:76,2\n34#1:78,4\n*E\n"})
    public static final class Kind {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        @k
        public static final a Companion;

        @k
        private static final Map<Integer, Kind> entryById;

        /* renamed from: id, reason: collision with root package name */
        private final int f67284id;
        public static final Kind UNKNOWN = new Kind("UNKNOWN", 0, 0);
        public static final Kind CLASS = new Kind("CLASS", 1, 1);
        public static final Kind FILE_FACADE = new Kind("FILE_FACADE", 2, 2);
        public static final Kind SYNTHETIC_CLASS = new Kind("SYNTHETIC_CLASS", 3, 3);
        public static final Kind MULTIFILE_CLASS = new Kind("MULTIFILE_CLASS", 4, 4);
        public static final Kind MULTIFILE_CLASS_PART = new Kind("MULTIFILE_CLASS_PART", 5, 5);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public /* synthetic */ a(v vVar) {
                this();
            }

            @o
            @k
            public final Kind a(int i11) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i11));
                return kind == null ? Kind.UNKNOWN : kind;
            }

            public a() {
            }
        }

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
            Companion = new a(null);
            Kind[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(values.length), 16));
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.f67284id), kind);
            }
            entryById = linkedHashMap;
        }

        private Kind(String str, int i11, int i12) {
            this.f67284id = i12;
        }

        @o
        @k
        public static final Kind getById(int i11) {
            return Companion.a(i11);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public KotlinClassHeader(@k Kind kind, @k e metadataVersion, @l String[] strArr, @l String[] strArr2, @l String[] strArr3, @l String str, int i11, @l String str2, @l byte[] bArr) {
        g0.p(kind, "kind");
        g0.p(metadataVersion, "metadataVersion");
        this.f67275a = kind;
        this.f67276b = metadataVersion;
        this.f67277c = strArr;
        this.f67278d = strArr2;
        this.f67279e = strArr3;
        this.f67280f = str;
        this.f67281g = i11;
        this.f67282h = str2;
        this.f67283i = bArr;
    }

    @l
    public final String[] a() {
        return this.f67277c;
    }

    @l
    public final String[] b() {
        return this.f67278d;
    }

    @k
    public final Kind c() {
        return this.f67275a;
    }

    @k
    public final e d() {
        return this.f67276b;
    }

    @l
    public final String e() {
        String str = this.f67280f;
        if (this.f67275a == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @k
    public final List<String> f() {
        String[] strArr = this.f67277c;
        if (this.f67275a != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> t11 = strArr != null ? q.t(strArr) : null;
        return t11 == null ? h0.J() : t11;
    }

    @l
    public final String[] g() {
        return this.f67279e;
    }

    public final boolean h(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public final boolean i() {
        return h(this.f67281g, 2);
    }

    public final boolean j() {
        return h(this.f67281g, 16) && !h(this.f67281g, 32);
    }

    @k
    public String toString() {
        return this.f67275a + " version=" + this.f67276b;
    }
}

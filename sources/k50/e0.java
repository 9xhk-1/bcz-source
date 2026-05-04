package k50;

import kotlin.jvm.internal.u0;
import u30.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.f
/* loaded from: classes8.dex */
public interface e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f65938a = a.f65939a;

    @m80.k
    String a(@m80.k h50.f fVar, int i11, @m80.k String str);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1179#2:179\n1180#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    @f50.f
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f65939a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final e0 f65940b = new b();

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final e0 f65941c = new C0759a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: k50.e0$a$a, reason: collision with other inner class name */
        public static final class C0759a implements e0 {
            @Override // k50.e0
            public String a(h50.f descriptor, int i11, String serialName) {
                kotlin.jvm.internal.g0.p(descriptor, "descriptor");
                kotlin.jvm.internal.g0.p(serialName, "serialName");
                return a.f65939a.b(serialName, '-');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b implements e0 {
            @Override // k50.e0
            public String a(h50.f descriptor, int i11, String serialName) {
                kotlin.jvm.internal.g0.p(descriptor, "descriptor");
                kotlin.jvm.internal.g0.p(serialName, "serialName");
                return a.f65939a.b(serialName, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        }

        public final String b(String str, char c11) {
            StringBuilder sb2 = new StringBuilder(str.length() * 2);
            Character ch2 = null;
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
                if (Character.isUpperCase(charAt)) {
                    if (i11 == 0 && sb2.length() > 0 && r0.W7(sb2) != c11) {
                        sb2.append(c11);
                    }
                    if (ch2 != null) {
                        sb2.append(ch2.charValue());
                    }
                    i11++;
                    ch2 = Character.valueOf(Character.toLowerCase(charAt));
                } else {
                    if (ch2 != null) {
                        if (i11 > 1 && Character.isLetter(charAt)) {
                            sb2.append(c11);
                        }
                        sb2.append(ch2.charValue());
                        ch2 = null;
                        i11 = 0;
                    }
                    sb2.append(charAt);
                }
            }
            if (ch2 != null) {
                sb2.append(ch2.charValue());
            }
            return sb2.toString();
        }

        @m80.k
        public final e0 c() {
            return f65941c;
        }

        @m80.k
        public final e0 e() {
            return f65940b;
        }

        @f50.f
        public static /* synthetic */ void d() {
        }

        @f50.f
        public static /* synthetic */ void f() {
        }
    }
}

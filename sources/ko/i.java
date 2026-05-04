package ko;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f66901a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends d {
        @Override // ko.d, ko.h
        public String b(String string) {
            return (String) Preconditions.checkNotNull(string);
        }

        @Override // ko.d
        @CheckForNull
        public char[] c(char c11) {
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Character, String> f66902a;

        /* renamed from: b, reason: collision with root package name */
        public char f66903b;

        /* renamed from: c, reason: collision with root package name */
        public char f66904c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public String f66905d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends ko.a {

            /* renamed from: g, reason: collision with root package name */
            @CheckForNull
            public final char[] f66906g;

            public a(Map replacementMap, char safeMin, char safeMax) {
                super((Map<Character, String>) replacementMap, safeMin, safeMax);
                this.f66906g = b.this.f66905d != null ? b.this.f66905d.toCharArray() : null;
            }

            @Override // ko.a
            @CheckForNull
            public char[] f(char c11) {
                return this.f66906g;
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @uo.a
        public b b(char c11, String replacement) {
            Preconditions.checkNotNull(replacement);
            this.f66902a.put(Character.valueOf(c11), replacement);
            return this;
        }

        public h c() {
            return new a(this.f66902a, this.f66903b, this.f66904c);
        }

        @uo.a
        public b d(char safeMin, char safeMax) {
            this.f66903b = safeMin;
            this.f66904c = safeMax;
            return this;
        }

        @uo.a
        public b e(String unsafeReplacement) {
            this.f66905d = unsafeReplacement;
            return this;
        }

        public b() {
            this.f66902a = new HashMap();
            this.f66903b = (char) 0;
            this.f66904c = q.f67020c;
            this.f66905d = null;
        }
    }

    public static b a() {
        return new b(null);
    }

    @CheckForNull
    public static String b(d escaper, char c11) {
        return e(escaper.c(c11));
    }

    @CheckForNull
    public static String c(l escaper, int cp2) {
        return e(escaper.d(cp2));
    }

    public static h d() {
        return f66901a;
    }

    @CheckForNull
    public static String e(@CheckForNull char[] in2) {
        if (in2 == null) {
            return null;
        }
        return new String(in2);
    }
}

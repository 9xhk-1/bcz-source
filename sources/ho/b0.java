package ho;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class b0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f59528a;

        /* renamed from: b, reason: collision with root package name */
        public final C0676b f59529b;

        /* renamed from: c, reason: collision with root package name */
        public C0676b f59530c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f59531d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f59532e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends C0676b {
            public a() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ho.b0$b$b, reason: collision with other inner class name */
        public static class C0676b {

            /* renamed from: a, reason: collision with root package name */
            @CheckForNull
            public String f59533a;

            /* renamed from: b, reason: collision with root package name */
            @CheckForNull
            public Object f59534b;

            /* renamed from: c, reason: collision with root package name */
            @CheckForNull
            public C0676b f59535c;
        }

        public static boolean u(Object value) {
            return value instanceof CharSequence ? ((CharSequence) value).length() == 0 : value instanceof Collection ? ((Collection) value).isEmpty() : value instanceof Map ? ((Map) value).isEmpty() : value instanceof Optional ? !((Optional) value).isPresent() : value.getClass().isArray() && Array.getLength(value) == 0;
        }

        @uo.a
        public b a(String name, char value) {
            return m(name, String.valueOf(value));
        }

        @uo.a
        public b b(String name, double value) {
            return m(name, String.valueOf(value));
        }

        @uo.a
        public b c(String name, float value) {
            return m(name, String.valueOf(value));
        }

        @uo.a
        public b d(String name, int value) {
            return m(name, String.valueOf(value));
        }

        @uo.a
        public b e(String name, long value) {
            return m(name, String.valueOf(value));
        }

        @uo.a
        public b f(String name, @CheckForNull Object value) {
            return j(name, value);
        }

        @uo.a
        public b g(String name, boolean value) {
            return m(name, String.valueOf(value));
        }

        public final C0676b h() {
            C0676b c0676b = new C0676b();
            this.f59530c.f59535c = c0676b;
            this.f59530c = c0676b;
            return c0676b;
        }

        @uo.a
        public final b i(@CheckForNull Object value) {
            h().f59534b = value;
            return this;
        }

        @uo.a
        public final b j(String name, @CheckForNull Object value) {
            C0676b h11 = h();
            h11.f59534b = value;
            h11.f59533a = (String) Preconditions.checkNotNull(name);
            return this;
        }

        public final a k() {
            a aVar = new a();
            this.f59530c.f59535c = aVar;
            this.f59530c = aVar;
            return aVar;
        }

        @uo.a
        public final b l(Object value) {
            k().f59534b = value;
            return this;
        }

        @uo.a
        public final b m(String name, Object value) {
            a k11 = k();
            k11.f59534b = value;
            k11.f59533a = (String) Preconditions.checkNotNull(name);
            return this;
        }

        @uo.a
        public b n(char value) {
            return l(String.valueOf(value));
        }

        @uo.a
        public b o(double value) {
            return l(String.valueOf(value));
        }

        @uo.a
        public b p(float value) {
            return l(String.valueOf(value));
        }

        @uo.a
        public b q(int value) {
            return l(String.valueOf(value));
        }

        @uo.a
        public b r(long value) {
            return l(String.valueOf(value));
        }

        @uo.a
        public b s(@CheckForNull Object value) {
            return i(value);
        }

        @uo.a
        public b t(boolean value) {
            return l(String.valueOf(value));
        }

        public String toString() {
            boolean z11 = this.f59531d;
            boolean z12 = this.f59532e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f59528a);
            sb2.append(l50.b.f69927i);
            String str = "";
            for (C0676b c0676b = this.f59529b.f59535c; c0676b != null; c0676b = c0676b.f59535c) {
                Object obj = c0676b.f59534b;
                if (!(c0676b instanceof a)) {
                    if (obj == null) {
                        if (z11) {
                        }
                    } else if (z12 && u(obj)) {
                    }
                }
                sb2.append(str);
                String str2 = c0676b.f59533a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = j2.O;
            }
            sb2.append(l50.b.f69928j);
            return sb2.toString();
        }

        @uo.a
        public b v() {
            this.f59531d = true;
            return this;
        }

        public b(String className) {
            C0676b c0676b = new C0676b();
            this.f59529b = c0676b;
            this.f59530c = c0676b;
            this.f59531d = false;
            this.f59532e = false;
            this.f59528a = (String) Preconditions.checkNotNull(className);
        }
    }

    public static <T> T a(@CheckForNull T first, @CheckForNull T second) {
        if (first != null) {
            return first;
        }
        if (second != null) {
            return second;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> clazz) {
        return new b(clazz.getSimpleName());
    }

    public static b c(Object self) {
        return new b(self.getClass().getSimpleName());
    }

    public static b d(String className) {
        return new b(className);
    }
}

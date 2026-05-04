package lb0;

import com.badlogic.gdx.Net;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import lb0.o;
import okhttp3.h;
import okhttp3.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Method f70985a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.i f70986b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70987c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f70988d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final okhttp3.h f70989e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final okhttp3.j f70990f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f70991g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f70992h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f70993i;

    /* renamed from: j, reason: collision with root package name */
    public final o<?>[] f70994j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f70995k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final z f70999a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f71000b;

        /* renamed from: c, reason: collision with root package name */
        public final Annotation[] f71001c;

        /* renamed from: d, reason: collision with root package name */
        public final Annotation[][] f71002d;

        /* renamed from: e, reason: collision with root package name */
        public final Type[] f71003e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f71004f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f71005g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f71006h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f71007i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f71008j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f71009k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f71010l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f71011m;

        /* renamed from: n, reason: collision with root package name */
        @Nullable
        public String f71012n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f71013o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f71014p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f71015q;

        /* renamed from: r, reason: collision with root package name */
        @Nullable
        public String f71016r;

        /* renamed from: s, reason: collision with root package name */
        @Nullable
        public okhttp3.h f71017s;

        /* renamed from: t, reason: collision with root package name */
        @Nullable
        public okhttp3.j f71018t;

        /* renamed from: u, reason: collision with root package name */
        @Nullable
        public Set<String> f71019u;

        /* renamed from: v, reason: collision with root package name */
        @Nullable
        public o<?>[] f71020v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f71021w;

        /* renamed from: y, reason: collision with root package name */
        public static final Pattern f70997y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: x, reason: collision with root package name */
        public static final String f70996x = "[a-zA-Z][a-zA-Z0-9_-]*";

        /* renamed from: z, reason: collision with root package name */
        public static final Pattern f70998z = Pattern.compile(f70996x);

        public a(z zVar, Method method) {
            this.f70999a = zVar;
            this.f71000b = method;
            this.f71001c = method.getAnnotations();
            this.f71003e = method.getGenericParameterTypes();
            this.f71002d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = f70997y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public x b() {
            for (Annotation annotation : this.f71001c) {
                e(annotation);
            }
            if (this.f71012n == null) {
                throw d0.m(this.f71000b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f71013o) {
                if (this.f71015q) {
                    throw d0.m(this.f71000b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f71014p) {
                    throw d0.m(this.f71000b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f71002d.length;
            this.f71020v = new o[length];
            int i11 = length - 1;
            int i12 = 0;
            while (i12 < length) {
                this.f71020v[i12] = f(i12, this.f71003e[i12], this.f71002d[i12], i12 == i11);
                i12++;
            }
            if (this.f71016r == null && !this.f71011m) {
                throw d0.m(this.f71000b, "Missing either @%s URL or @Url parameter.", this.f71012n);
            }
            boolean z11 = this.f71014p;
            if (!z11 && !this.f71015q && !this.f71013o && this.f71006h) {
                throw d0.m(this.f71000b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z11 && !this.f71004f) {
                throw d0.m(this.f71000b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f71015q || this.f71005g) {
                return new x(this);
            }
            throw d0.m(this.f71000b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final okhttp3.h c(String[] strArr) {
            h.a aVar = new h.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw d0.m(this.f71000b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f71018t = okhttp3.j.h(trim);
                    } catch (IllegalArgumentException e11) {
                        throw d0.n(this.f71000b, e11, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.b(substring, trim);
                }
            }
            return aVar.i();
        }

        public final void d(String str, String str2, boolean z11) {
            String str3 = this.f71012n;
            if (str3 != null) {
                throw d0.m(this.f71000b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f71012n = str;
            this.f71013o = z11;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f70997y.matcher(substring).find()) {
                    throw d0.m(this.f71000b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f71016r = str2;
            this.f71019u = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof ob0.b) {
                d(Net.a.f11467f, ((ob0.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof ob0.f) {
                d("GET", ((ob0.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof ob0.g) {
                d(Net.a.f11462a, ((ob0.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof ob0.n) {
                d("PATCH", ((ob0.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof ob0.o) {
                d("POST", ((ob0.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof ob0.p) {
                d(Net.a.f11465d, ((ob0.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof ob0.m) {
                d("OPTIONS", ((ob0.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof ob0.h) {
                ob0.h hVar = (ob0.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof ob0.k) {
                String[] value = ((ob0.k) annotation).value();
                if (value.length == 0) {
                    throw d0.m(this.f71000b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f71017s = c(value);
                return;
            }
            if (annotation instanceof ob0.l) {
                if (this.f71014p) {
                    throw d0.m(this.f71000b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f71015q = true;
            } else if (annotation instanceof ob0.e) {
                if (this.f71015q) {
                    throw d0.m(this.f71000b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f71014p = true;
            }
        }

        @Nullable
        public final o<?> f(int i11, Type type, @Nullable Annotation[] annotationArr, boolean z11) {
            o<?> oVar;
            if (annotationArr != null) {
                oVar = null;
                for (Annotation annotation : annotationArr) {
                    o<?> g11 = g(i11, type, annotationArr, annotation);
                    if (g11 != null) {
                        if (oVar != null) {
                            throw d0.o(this.f71000b, i11, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        oVar = g11;
                    }
                }
            } else {
                oVar = null;
            }
            if (oVar != null) {
                return oVar;
            }
            if (z11) {
                try {
                    if (d0.h(type) == j00.c.class) {
                        this.f71021w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw d0.o(this.f71000b, i11, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        public final o<?> g(int i11, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof ob0.y) {
                j(i11, type);
                if (this.f71011m) {
                    throw d0.o(this.f71000b, i11, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f71007i) {
                    throw d0.o(this.f71000b, i11, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f71008j) {
                    throw d0.o(this.f71000b, i11, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f71009k) {
                    throw d0.o(this.f71000b, i11, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f71010l) {
                    throw d0.o(this.f71000b, i11, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f71016r != null) {
                    throw d0.o(this.f71000b, i11, "@Url cannot be used with @%s URL", this.f71012n);
                }
                this.f71011m = true;
                if (type == okhttp3.i.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new o.p(this.f71000b, i11);
                }
                throw d0.o(this.f71000b, i11, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof ob0.s) {
                j(i11, type);
                if (this.f71008j) {
                    throw d0.o(this.f71000b, i11, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f71009k) {
                    throw d0.o(this.f71000b, i11, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f71010l) {
                    throw d0.o(this.f71000b, i11, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f71011m) {
                    throw d0.o(this.f71000b, i11, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f71016r == null) {
                    throw d0.o(this.f71000b, i11, "@Path can only be used with relative url on @%s", this.f71012n);
                }
                this.f71007i = true;
                ob0.s sVar = (ob0.s) annotation;
                String value = sVar.value();
                i(i11, value);
                return new o.k(this.f71000b, i11, value, this.f70999a.o(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof ob0.t) {
                j(i11, type);
                ob0.t tVar = (ob0.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h11 = d0.h(type);
                this.f71008j = true;
                if (!Iterable.class.isAssignableFrom(h11)) {
                    if (!h11.isArray()) {
                        return new o.l(value2, this.f70999a.o(type, annotationArr), encoded);
                    }
                    return new o.l(value2, this.f70999a.o(a(h11.getComponentType()), annotationArr), encoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.l(value2, this.f70999a.o(d0.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                }
                throw d0.o(this.f71000b, i11, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ob0.v) {
                j(i11, type);
                boolean encoded2 = ((ob0.v) annotation).encoded();
                Class<?> h12 = d0.h(type);
                this.f71009k = true;
                if (!Iterable.class.isAssignableFrom(h12)) {
                    if (!h12.isArray()) {
                        return new o.n(this.f70999a.o(type, annotationArr), encoded2);
                    }
                    return new o.n(this.f70999a.o(a(h12.getComponentType()), annotationArr), encoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.n(this.f70999a.o(d0.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                }
                throw d0.o(this.f71000b, i11, h12.getSimpleName() + " must include generic type (e.g., " + h12.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ob0.u) {
                j(i11, type);
                Class<?> h13 = d0.h(type);
                this.f71010l = true;
                if (!Map.class.isAssignableFrom(h13)) {
                    throw d0.o(this.f71000b, i11, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type i12 = d0.i(type, h13, Map.class);
                if (!(i12 instanceof ParameterizedType)) {
                    throw d0.o(this.f71000b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) i12;
                Type g11 = d0.g(0, parameterizedType);
                if (String.class == g11) {
                    return new o.m(this.f71000b, i11, this.f70999a.o(d0.g(1, parameterizedType), annotationArr), ((ob0.u) annotation).encoded());
                }
                throw d0.o(this.f71000b, i11, "@QueryMap keys must be of type String: " + g11, new Object[0]);
            }
            if (annotation instanceof ob0.i) {
                j(i11, type);
                String value3 = ((ob0.i) annotation).value();
                Class<?> h14 = d0.h(type);
                if (!Iterable.class.isAssignableFrom(h14)) {
                    if (!h14.isArray()) {
                        return new o.f(value3, this.f70999a.o(type, annotationArr));
                    }
                    return new o.f(value3, this.f70999a.o(a(h14.getComponentType()), annotationArr)).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.f(value3, this.f70999a.o(d0.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw d0.o(this.f71000b, i11, h14.getSimpleName() + " must include generic type (e.g., " + h14.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ob0.j) {
                if (type == okhttp3.h.class) {
                    return new o.h(this.f71000b, i11);
                }
                j(i11, type);
                Class<?> h15 = d0.h(type);
                if (!Map.class.isAssignableFrom(h15)) {
                    throw d0.o(this.f71000b, i11, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type i13 = d0.i(type, h15, Map.class);
                if (!(i13 instanceof ParameterizedType)) {
                    throw d0.o(this.f71000b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) i13;
                Type g12 = d0.g(0, parameterizedType2);
                if (String.class == g12) {
                    return new o.g(this.f71000b, i11, this.f70999a.o(d0.g(1, parameterizedType2), annotationArr));
                }
                throw d0.o(this.f71000b, i11, "@HeaderMap keys must be of type String: " + g12, new Object[0]);
            }
            if (annotation instanceof ob0.c) {
                j(i11, type);
                if (!this.f71014p) {
                    throw d0.o(this.f71000b, i11, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                ob0.c cVar = (ob0.c) annotation;
                String value4 = cVar.value();
                boolean encoded3 = cVar.encoded();
                this.f71004f = true;
                Class<?> h16 = d0.h(type);
                if (!Iterable.class.isAssignableFrom(h16)) {
                    if (!h16.isArray()) {
                        return new o.d(value4, this.f70999a.o(type, annotationArr), encoded3);
                    }
                    return new o.d(value4, this.f70999a.o(a(h16.getComponentType()), annotationArr), encoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.d(value4, this.f70999a.o(d0.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                }
                throw d0.o(this.f71000b, i11, h16.getSimpleName() + " must include generic type (e.g., " + h16.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ob0.d) {
                j(i11, type);
                if (!this.f71014p) {
                    throw d0.o(this.f71000b, i11, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> h17 = d0.h(type);
                if (!Map.class.isAssignableFrom(h17)) {
                    throw d0.o(this.f71000b, i11, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type i14 = d0.i(type, h17, Map.class);
                if (!(i14 instanceof ParameterizedType)) {
                    throw d0.o(this.f71000b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) i14;
                Type g13 = d0.g(0, parameterizedType3);
                if (String.class == g13) {
                    f o11 = this.f70999a.o(d0.g(1, parameterizedType3), annotationArr);
                    this.f71004f = true;
                    return new o.e(this.f71000b, i11, o11, ((ob0.d) annotation).encoded());
                }
                throw d0.o(this.f71000b, i11, "@FieldMap keys must be of type String: " + g13, new Object[0]);
            }
            if (!(annotation instanceof ob0.q)) {
                if (annotation instanceof ob0.r) {
                    j(i11, type);
                    if (!this.f71015q) {
                        throw d0.o(this.f71000b, i11, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f71005g = true;
                    Class<?> h18 = d0.h(type);
                    if (!Map.class.isAssignableFrom(h18)) {
                        throw d0.o(this.f71000b, i11, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type i15 = d0.i(type, h18, Map.class);
                    if (!(i15 instanceof ParameterizedType)) {
                        throw d0.o(this.f71000b, i11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) i15;
                    Type g14 = d0.g(0, parameterizedType4);
                    if (String.class == g14) {
                        Type g15 = d0.g(1, parameterizedType4);
                        if (k.c.class.isAssignableFrom(d0.h(g15))) {
                            throw d0.o(this.f71000b, i11, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new o.j(this.f71000b, i11, this.f70999a.m(g15, annotationArr, this.f71001c), ((ob0.r) annotation).encoding());
                    }
                    throw d0.o(this.f71000b, i11, "@PartMap keys must be of type String: " + g14, new Object[0]);
                }
                if (annotation instanceof ob0.a) {
                    j(i11, type);
                    if (this.f71014p || this.f71015q) {
                        throw d0.o(this.f71000b, i11, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f71006h) {
                        throw d0.o(this.f71000b, i11, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        f m11 = this.f70999a.m(type, annotationArr, this.f71001c);
                        this.f71006h = true;
                        return new o.c(this.f71000b, i11, m11);
                    } catch (RuntimeException e11) {
                        throw d0.p(this.f71000b, e11, i11, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof ob0.x)) {
                    return null;
                }
                j(i11, type);
                Class<?> h19 = d0.h(type);
                for (int i16 = i11 - 1; i16 >= 0; i16--) {
                    o<?> oVar = this.f71020v[i16];
                    if ((oVar instanceof o.q) && ((o.q) oVar).f70964a.equals(h19)) {
                        throw d0.o(this.f71000b, i11, "@Tag type " + h19.getName() + " is duplicate of parameter #" + (i16 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new o.q(h19);
            }
            j(i11, type);
            if (!this.f71015q) {
                throw d0.o(this.f71000b, i11, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            ob0.q qVar = (ob0.q) annotation;
            this.f71005g = true;
            String value5 = qVar.value();
            Class<?> h21 = d0.h(type);
            if (value5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(h21)) {
                    if (h21.isArray()) {
                        if (k.c.class.isAssignableFrom(h21.getComponentType())) {
                            return o.C0852o.f70961a.b();
                        }
                        throw d0.o(this.f71000b, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (k.c.class.isAssignableFrom(h21)) {
                        return o.C0852o.f70961a;
                    }
                    throw d0.o(this.f71000b, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (k.c.class.isAssignableFrom(d0.h(d0.g(0, (ParameterizedType) type)))) {
                        return o.C0852o.f70961a.c();
                    }
                    throw d0.o(this.f71000b, i11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw d0.o(this.f71000b, i11, h21.getSimpleName() + " must include generic type (e.g., " + h21.getSimpleName() + "<String>)", new Object[0]);
            }
            okhttp3.h m12 = okhttp3.h.m("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(h21)) {
                if (!h21.isArray()) {
                    if (k.c.class.isAssignableFrom(h21)) {
                        throw d0.o(this.f71000b, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new o.i(this.f71000b, i11, m12, this.f70999a.m(type, annotationArr, this.f71001c));
                }
                Class<?> a11 = a(h21.getComponentType());
                if (k.c.class.isAssignableFrom(a11)) {
                    throw d0.o(this.f71000b, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new o.i(this.f71000b, i11, m12, this.f70999a.m(a11, annotationArr, this.f71001c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type g16 = d0.g(0, (ParameterizedType) type);
                if (k.c.class.isAssignableFrom(d0.h(g16))) {
                    throw d0.o(this.f71000b, i11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new o.i(this.f71000b, i11, m12, this.f70999a.m(g16, annotationArr, this.f71001c)).c();
            }
            throw d0.o(this.f71000b, i11, h21.getSimpleName() + " must include generic type (e.g., " + h21.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void i(int i11, String str) {
            if (!f70998z.matcher(str).matches()) {
                throw d0.o(this.f71000b, i11, "@Path parameter name must match %s. Found: %s", f70997y.pattern(), str);
            }
            if (!this.f71019u.contains(str)) {
                throw d0.o(this.f71000b, i11, "URL \"%s\" does not contain \"{%s}\".", this.f71016r, str);
            }
        }

        public final void j(int i11, Type type) {
            if (d0.j(type)) {
                throw d0.o(this.f71000b, i11, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public x(a aVar) {
        this.f70985a = aVar.f71000b;
        this.f70986b = aVar.f70999a.f71027c;
        this.f70987c = aVar.f71012n;
        this.f70988d = aVar.f71016r;
        this.f70989e = aVar.f71017s;
        this.f70990f = aVar.f71018t;
        this.f70991g = aVar.f71013o;
        this.f70992h = aVar.f71014p;
        this.f70993i = aVar.f71015q;
        this.f70994j = aVar.f71020v;
        this.f70995k = aVar.f71021w;
    }

    public static x b(z zVar, Method method) {
        return new a(zVar, method).b();
    }

    public okhttp3.l a(Object[] objArr) throws IOException {
        o<?>[] oVarArr = this.f70994j;
        int length = objArr.length;
        if (length != oVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + oVarArr.length + pn.j.f81007d);
        }
        w wVar = new w(this.f70987c, this.f70986b, this.f70988d, this.f70989e, this.f70990f, this.f70991g, this.f70992h, this.f70993i);
        if (this.f70995k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
            oVarArr[i11].a(wVar, objArr[i11]);
        }
        return wVar.k().z(k.class, new k(this.f70985a, arrayList)).b();
    }
}

package lb0;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import lb0.a;
import lb0.c;
import lb0.f;
import t50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Method, a0<?>> f71025a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final b.a f71026b;

    /* renamed from: c, reason: collision with root package name */
    public final okhttp3.i f71027c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f.a> f71028d;

    /* renamed from: e, reason: collision with root package name */
    public final List<c.a> f71029e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final Executor f71030f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f71031g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final v f71032a = v.g();

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f71033b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f71034c;

        public a(Class cls) {
            this.f71034c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f71033b;
            }
            return this.f71032a.i(method) ? this.f71032a.h(method, this.f71034c, obj, objArr) : z.this.h(method).a(objArr);
        }
    }

    public z(b.a aVar, okhttp3.i iVar, List<f.a> list, List<c.a> list2, @Nullable Executor executor, boolean z11) {
        this.f71026b = aVar;
        this.f71027c = iVar;
        this.f71028d = list;
        this.f71029e = list2;
        this.f71030f = executor;
        this.f71031g = z11;
    }

    public okhttp3.i a() {
        return this.f71027c;
    }

    public c<?, ?> b(Type type, Annotation[] annotationArr) {
        return j(null, type, annotationArr);
    }

    public List<c.a> c() {
        return this.f71029e;
    }

    public b.a d() {
        return this.f71026b;
    }

    @Nullable
    public Executor e() {
        return this.f71030f;
    }

    public List<f.a> f() {
        return this.f71028d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public a0<?> h(Method method) {
        a0<?> a0Var;
        a0<?> a0Var2 = this.f71025a.get(method);
        if (a0Var2 != null) {
            return a0Var2;
        }
        synchronized (this.f71025a) {
            try {
                a0Var = this.f71025a.get(method);
                if (a0Var == null) {
                    a0Var = a0.b(this, method);
                    this.f71025a.put(method, a0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0Var;
    }

    public b i() {
        return new b(this);
    }

    public c<?, ?> j(@Nullable c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f71029e.indexOf(aVar) + 1;
        int size = this.f71029e.size();
        for (int i11 = indexOf; i11 < size; i11++) {
            c<?, ?> a11 = this.f71029e.get(i11).a(type, annotationArr, this);
            if (a11 != null) {
                return a11;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < indexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f71029e.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f71029e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f71029e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, okhttp3.m> k(@Nullable f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f71028d.indexOf(aVar) + 1;
        int size = this.f71028d.size();
        for (int i11 = indexOf; i11 < size; i11++) {
            f<T, okhttp3.m> fVar = (f<T, okhttp3.m>) this.f71028d.get(i11).c(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < indexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f71028d.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f71028d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f71028d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<okhttp3.o, T> l(@Nullable f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f71028d.indexOf(aVar) + 1;
        int size = this.f71028d.size();
        for (int i11 = indexOf; i11 < size; i11++) {
            f<okhttp3.o, T> fVar = (f<okhttp3.o, T>) this.f71028d.get(i11).d(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < indexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f71028d.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f71028d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f71028d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, okhttp3.m> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k(null, type, annotationArr, annotationArr2);
    }

    public <T> f<okhttp3.o, T> n(Type type, Annotation[] annotationArr) {
        return l(null, type, annotationArr);
    }

    public <T> f<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f71028d.size();
        for (int i11 = 0; i11 < size; i11++) {
            f<T, String> fVar = (f<T, String>) this.f71028d.get(i11).e(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return a.d.f70849a;
    }

    public final void p(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f71031g) {
            v g11 = v.g();
            for (Method method : cls.getDeclaredMethods()) {
                if (!g11.i(method) && !Modifier.isStatic(method.getModifiers())) {
                    h(method);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final v f71036a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public b.a f71037b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public okhttp3.i f71038c;

        /* renamed from: d, reason: collision with root package name */
        public final List<f.a> f71039d;

        /* renamed from: e, reason: collision with root package name */
        public final List<c.a> f71040e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public Executor f71041f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f71042g;

        public b(v vVar) {
            this.f71039d = new ArrayList();
            this.f71040e = new ArrayList();
            this.f71036a = vVar;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.f71040e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(f.a aVar) {
            List<f.a> list = this.f71039d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return e(okhttp3.i.C(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return e(okhttp3.i.C(url.toString()));
        }

        public b e(okhttp3.i iVar) {
            Objects.requireNonNull(iVar, "baseUrl == null");
            if ("".equals(iVar.L().get(r0.size() - 1))) {
                this.f71038c = iVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + iVar);
        }

        public z f() {
            if (this.f71038c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            b.a aVar = this.f71037b;
            if (aVar == null) {
                aVar = new t50.q();
            }
            b.a aVar2 = aVar;
            Executor executor = this.f71041f;
            if (executor == null) {
                executor = this.f71036a.c();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.f71040e);
            arrayList.addAll(this.f71036a.a(executor2));
            ArrayList arrayList2 = new ArrayList(this.f71039d.size() + 1 + this.f71036a.e());
            arrayList2.add(new lb0.a());
            arrayList2.addAll(this.f71039d);
            arrayList2.addAll(this.f71036a.d());
            return new z(aVar2, this.f71038c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f71042g);
        }

        public List<c.a> g() {
            return this.f71040e;
        }

        public b h(b.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f71037b = aVar;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f71041f = executor;
            return this;
        }

        public b j(t50.q qVar) {
            Objects.requireNonNull(qVar, "client == null");
            return h(qVar);
        }

        public List<f.a> k() {
            return this.f71039d;
        }

        public b l(boolean z11) {
            this.f71042g = z11;
            return this;
        }

        public b() {
            this(v.g());
        }

        public b(z zVar) {
            this.f71039d = new ArrayList();
            this.f71040e = new ArrayList();
            v g11 = v.g();
            this.f71036a = g11;
            this.f71037b = zVar.f71026b;
            this.f71038c = zVar.f71027c;
            int size = zVar.f71028d.size() - g11.e();
            for (int i11 = 1; i11 < size; i11++) {
                this.f71039d.add(zVar.f71028d.get(i11));
            }
            int size2 = zVar.f71029e.size() - this.f71036a.b();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f71040e.add(zVar.f71029e.get(i12));
            }
            this.f71041f = zVar.f71030f;
            this.f71042g = zVar.f71031g;
        }
    }
}

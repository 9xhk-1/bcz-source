package lb0;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class o<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends o<Iterable<T>> {
        public a() {
        }

        @Override // lb0.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                o.this.a(wVar, it.next());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends o<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lb0.o
        public void a(w wVar, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i11 = 0; i11 < length; i11++) {
                o.this.a(wVar, Array.get(obj, i11));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70922a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70923b;

        /* renamed from: c, reason: collision with root package name */
        public final lb0.f<T, okhttp3.m> f70924c;

        public c(Method method, int i11, lb0.f<T, okhttp3.m> fVar) {
            this.f70922a = method;
            this.f70923b = i11;
            this.f70924c = fVar;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) {
            if (t11 == null) {
                throw d0.o(this.f70922a, this.f70923b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                wVar.l(this.f70924c.convert(t11));
            } catch (IOException e11) {
                throw d0.p(this.f70922a, e11, this.f70923b, "Unable to convert " + t11 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f70925a;

        /* renamed from: b, reason: collision with root package name */
        public final lb0.f<T, String> f70926b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f70927c;

        public d(String str, lb0.f<T, String> fVar, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.f70925a = str;
            this.f70926b = fVar;
            this.f70927c = z11;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) throws IOException {
            String convert;
            if (t11 == null || (convert = this.f70926b.convert(t11)) == null) {
                return;
            }
            wVar.a(this.f70925a, convert, this.f70927c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70928a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70929b;

        /* renamed from: c, reason: collision with root package name */
        public final lb0.f<T, String> f70930c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f70931d;

        public e(Method method, int i11, lb0.f<T, String> fVar, boolean z11) {
            this.f70928a = method;
            this.f70929b = i11;
            this.f70930c = fVar;
            this.f70931d = z11;
        }

        @Override // lb0.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw d0.o(this.f70928a, this.f70929b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.o(this.f70928a, this.f70929b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.o(this.f70928a, this.f70929b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String convert = this.f70930c.convert(value);
                if (convert == null) {
                    throw d0.o(this.f70928a, this.f70929b, "Field map value '" + value + "' converted to null by " + this.f70930c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                wVar.a(key, convert, this.f70931d);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f70932a;

        /* renamed from: b, reason: collision with root package name */
        public final lb0.f<T, String> f70933b;

        public f(String str, lb0.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f70932a = str;
            this.f70933b = fVar;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) throws IOException {
            String convert;
            if (t11 == null || (convert = this.f70933b.convert(t11)) == null) {
                return;
            }
            wVar.b(this.f70932a, convert);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70934a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70935b;

        /* renamed from: c, reason: collision with root package name */
        public final lb0.f<T, String> f70936c;

        public g(Method method, int i11, lb0.f<T, String> fVar) {
            this.f70934a = method;
            this.f70935b = i11;
            this.f70936c = fVar;
        }

        @Override // lb0.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw d0.o(this.f70934a, this.f70935b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.o(this.f70934a, this.f70935b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.o(this.f70934a, this.f70935b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                wVar.b(key, this.f70936c.convert(value));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends o<okhttp3.h> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70937a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70938b;

        public h(Method method, int i11) {
            this.f70937a = method;
            this.f70938b = i11;
        }

        @Override // lb0.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, @Nullable okhttp3.h hVar) {
            if (hVar == null) {
                throw d0.o(this.f70937a, this.f70938b, "Headers parameter must not be null.", new Object[0]);
            }
            wVar.c(hVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70939a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70940b;

        /* renamed from: c, reason: collision with root package name */
        public final okhttp3.h f70941c;

        /* renamed from: d, reason: collision with root package name */
        public final lb0.f<T, okhttp3.m> f70942d;

        public i(Method method, int i11, okhttp3.h hVar, lb0.f<T, okhttp3.m> fVar) {
            this.f70939a = method;
            this.f70940b = i11;
            this.f70941c = hVar;
            this.f70942d = fVar;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) {
            if (t11 == null) {
                return;
            }
            try {
                wVar.d(this.f70941c, this.f70942d.convert(t11));
            } catch (IOException e11) {
                throw d0.o(this.f70939a, this.f70940b, "Unable to convert " + t11 + " to RequestBody", e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70943a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70944b;

        /* renamed from: c, reason: collision with root package name */
        public final lb0.f<T, okhttp3.m> f70945c;

        /* renamed from: d, reason: collision with root package name */
        public final String f70946d;

        public j(Method method, int i11, lb0.f<T, okhttp3.m> fVar, String str) {
            this.f70943a = method;
            this.f70944b = i11;
            this.f70945c = fVar;
            this.f70946d = str;
        }

        @Override // lb0.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw d0.o(this.f70943a, this.f70944b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.o(this.f70943a, this.f70944b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.o(this.f70943a, this.f70944b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                wVar.d(okhttp3.h.m("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f70946d), this.f70945c.convert(value));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70947a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70948b;

        /* renamed from: c, reason: collision with root package name */
        public final String f70949c;

        /* renamed from: d, reason: collision with root package name */
        public final lb0.f<T, String> f70950d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f70951e;

        public k(Method method, int i11, String str, lb0.f<T, String> fVar, boolean z11) {
            this.f70947a = method;
            this.f70948b = i11;
            Objects.requireNonNull(str, "name == null");
            this.f70949c = str;
            this.f70950d = fVar;
            this.f70951e = z11;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) throws IOException {
            if (t11 != null) {
                wVar.f(this.f70949c, this.f70950d.convert(t11), this.f70951e);
                return;
            }
            throw d0.o(this.f70947a, this.f70948b, "Path parameter \"" + this.f70949c + "\" value must not be null.", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f70952a;

        /* renamed from: b, reason: collision with root package name */
        public final lb0.f<T, String> f70953b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f70954c;

        public l(String str, lb0.f<T, String> fVar, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.f70952a = str;
            this.f70953b = fVar;
            this.f70954c = z11;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) throws IOException {
            String convert;
            if (t11 == null || (convert = this.f70953b.convert(t11)) == null) {
                return;
            }
            wVar.g(this.f70952a, convert, this.f70954c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70955a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70956b;

        /* renamed from: c, reason: collision with root package name */
        public final lb0.f<T, String> f70957c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f70958d;

        public m(Method method, int i11, lb0.f<T, String> fVar, boolean z11) {
            this.f70955a = method;
            this.f70956b = i11;
            this.f70957c = fVar;
            this.f70958d = z11;
        }

        @Override // lb0.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw d0.o(this.f70955a, this.f70956b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw d0.o(this.f70955a, this.f70956b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw d0.o(this.f70955a, this.f70956b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String convert = this.f70957c.convert(value);
                if (convert == null) {
                    throw d0.o(this.f70955a, this.f70956b, "Query map value '" + value + "' converted to null by " + this.f70957c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                wVar.g(key, convert, this.f70958d);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final lb0.f<T, String> f70959a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f70960b;

        public n(lb0.f<T, String> fVar, boolean z11) {
            this.f70959a = fVar;
            this.f70960b = z11;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) throws IOException {
            if (t11 == null) {
                return;
            }
            wVar.g(this.f70959a.convert(t11), null, this.f70960b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: lb0.o$o, reason: collision with other inner class name */
    public static final class C0852o extends o<k.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0852o f70961a = new C0852o();

        @Override // lb0.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, @Nullable k.c cVar) {
            if (cVar != null) {
                wVar.e(cVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends o<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f70962a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70963b;

        public p(Method method, int i11) {
            this.f70962a = method;
            this.f70963b = i11;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable Object obj) {
            if (obj == null) {
                throw d0.o(this.f70962a, this.f70963b, "@Url parameter is null.", new Object[0]);
            }
            wVar.m(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f70964a;

        public q(Class<T> cls) {
            this.f70964a = cls;
        }

        @Override // lb0.o
        public void a(w wVar, @Nullable T t11) {
            wVar.h(this.f70964a, t11);
        }
    }

    public abstract void a(w wVar, @Nullable T t11) throws IOException;

    public final o<Object> b() {
        return new b();
    }

    public final o<Iterable<T>> c() {
        return new a();
    }
}

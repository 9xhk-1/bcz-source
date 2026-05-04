package v10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class e0 implements f20.x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f92833a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final e0 a(@m80.k Type type) {
            kotlin.jvm.internal.g0.p(type, "type");
            boolean z11 = type instanceof Class;
            if (z11) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new c0(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z11 && ((Class) type).isArray())) ? new m(type) : type instanceof WildcardType ? new h0((WildcardType) type) : new s(type);
        }

        public a() {
        }
    }

    @m80.k
    public abstract Type O();

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof e0) && kotlin.jvm.internal.g0.g(O(), ((e0) obj).O());
    }

    public int hashCode() {
        return O().hashCode();
    }

    @Override // f20.d
    @m80.l
    public f20.a i(n20.c fqName) {
        Object obj;
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            n20.b a11 = ((f20.a) next).a();
            if (kotlin.jvm.internal.g0.g(a11 != null ? a11.a() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (f20.a) obj;
    }

    @m80.k
    public String toString() {
        return getClass().getName() + ": " + O();
    }
}

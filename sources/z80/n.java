package z80;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Optional;
import org.apiguardian.api.API;
import p80.q;
import z80.n;
import z80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f102392a = new o();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<E extends Executable, T> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: z80.n$a$a, reason: collision with other inner class name */
        public interface InterfaceC1389a {
            void a(p80.q interceptor, q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext) throws Throwable;
        }

        static /* synthetic */ Void b(InterfaceC1389a interfaceC1389a, p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar) {
            interfaceC1389a.a(qVar, aVar, vVar, nVar);
            return null;
        }

        static a<Method, Void> c(final InterfaceC1389a call) {
            return new a() { // from class: z80.m
                @Override // z80.n.a
                public final Object a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar) {
                    return n.a.b(n.a.InterfaceC1389a.this, qVar, aVar, vVar, nVar);
                }
            };
        }

        T a(p80.q interceptor, q.a<T> invocation, p80.v<E> invocationContext, p80.n extensionContext) throws Throwable;
    }

    public <T> T b(Constructor<T> constructor, Optional<Object> optional, p80.n nVar, a90.o oVar, a<Constructor<T>, T> aVar) {
        g gVar = new g(constructor, k0.e(constructor, Optional.empty(), optional, nVar, oVar));
        return (T) d(gVar, gVar, nVar, oVar, aVar);
    }

    public <T> T c(Method method, Object obj, p80.n nVar, a90.o oVar, a<Method, T> aVar) {
        Optional ofNullable = obj instanceof Optional ? (Optional) obj : Optional.ofNullable(obj);
        w wVar = new w(method, ofNullable, k0.f(method, ofNullable, nVar, oVar));
        return (T) d(wVar, wVar, nVar, oVar, aVar);
    }

    public final <E extends Executable, T> T d(q.a<T> aVar, final p80.v<E> vVar, final p80.n nVar, a90.o oVar, final a<E, T> aVar2) {
        return (T) f102392a.c(aVar, oVar, new o.b() { // from class: z80.l
            @Override // z80.o.b
            public final Object a(p80.q qVar, q.a aVar3) {
                Object a11;
                a11 = n.a.this.a(qVar, aVar3, vVar, nVar);
                return a11;
            }
        });
    }
}

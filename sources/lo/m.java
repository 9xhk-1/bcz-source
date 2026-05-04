package lo;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import com.google.common.collect.d7;
import com.google.common.collect.l6;
import com.google.common.collect.q6;
import com.google.common.collect.u6;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.j2objc.annotations.Weak;
import ho.b0;
import ho.d0;
import ho.t0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final jo.i<Class<?>, ImmutableList<Method>> f71570c = com.google.common.cache.b.F().Q().b(new a());

    /* renamed from: d, reason: collision with root package name */
    public static final jo.i<Class<?>, ImmutableSet<Class<?>>> f71571d = com.google.common.cache.b.F().Q().b(new b());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, CopyOnWriteArraySet<j>> f71572a = u6.V();

    /* renamed from: b, reason: collision with root package name */
    @Weak
    public final f f71573b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends CacheLoader<Class<?>, ImmutableList<Method>> {
        @Override // com.google.common.cache.CacheLoader
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public ImmutableList<Method> d(Class<?> concreteClass) throws Exception {
            return m.e(concreteClass);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends CacheLoader<Class<?>, ImmutableSet<Class<?>>> {
        @Override // com.google.common.cache.CacheLoader
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<Class<?>> d(Class<?> concreteClass) {
            return ImmutableSet.copyOf((Collection) TypeToken.of((Class) concreteClass).getTypes().rawTypes());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f71574a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Class<?>> f71575b;

        public c(Method method) {
            this.f71574a = method.getName();
            this.f71575b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@CheckForNull Object o11) {
            if (o11 instanceof c) {
                c cVar = (c) o11;
                if (this.f71574a.equals(cVar.f71574a) && this.f71575b.equals(cVar.f71575b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f71574a, this.f71575b);
        }
    }

    public m(f bus) {
        this.f71573b = (f) Preconditions.checkNotNull(bus);
    }

    @go.e
    public static ImmutableSet<Class<?>> c(Class<?> concreteClass) {
        try {
            return f71571d.s(concreteClass);
        } catch (UncheckedExecutionException e11) {
            throw t0.q(e11.getCause());
        }
    }

    public static ImmutableList<Method> d(Class<?> clazz) {
        try {
            return f71570c.s(clazz);
        } catch (UncheckedExecutionException e11) {
            t0.w(e11.getCause());
            throw e11;
        }
    }

    public static ImmutableList<Method> e(Class<?> clazz) {
        Set rawTypes = TypeToken.of((Class) clazz).getTypes().rawTypes();
        HashMap Y = u6.Y();
        Iterator it = rawTypes.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(h.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Preconditions.checkArgument(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", (Object) method, parameterTypes.length);
                    Preconditions.checkArgument(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), ro.n.f(parameterTypes[0]).getSimpleName());
                    c cVar = new c(method);
                    if (!Y.containsKey(cVar)) {
                        Y.put(cVar, method);
                    }
                }
            }
        }
        return ImmutableList.copyOf(Y.values());
    }

    public final d7<Class<?>, j> b(Object listener) {
        HashMultimap create = HashMultimap.create();
        aa<Method> it = d(listener.getClass()).iterator();
        while (it.hasNext()) {
            Method next = it.next();
            create.put(next.getParameterTypes()[0], j.c(this.f71573b, listener, next));
        }
        return create;
    }

    public Iterator<j> f(Object event) {
        ImmutableSet<Class<?>> c11 = c(event.getClass());
        ArrayList u11 = q6.u(c11.size());
        aa<Class<?>> it = c11.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f71572a.get(it.next());
            if (copyOnWriteArraySet != null) {
                u11.add(copyOnWriteArraySet.iterator());
            }
        }
        return l6.h(u11.iterator());
    }

    @go.e
    public Set<j> g(Class<?> eventType) {
        return (Set) b0.a(this.f71572a.get(eventType), ImmutableSet.of());
    }

    public void h(Object listener) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(listener).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f71572a.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<j> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) b0.a(this.f71572a.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    public void i(Object listener) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(listener).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f71572a.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + listener + " registered?");
            }
        }
    }
}

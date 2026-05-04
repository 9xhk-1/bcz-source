package lb0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import lb0.c;
import lb0.f;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f70965c = f();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f70966a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final Constructor<MethodHandles.Lookup> f70967b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends v {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lb0.v$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0853a implements Executor {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f70968a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f70968a.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        @Override // lb0.v
        public Executor c() {
            return new ExecutorC0853a();
        }

        @Override // lb0.v
        @Nullable
        public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public v(boolean z11) {
        this.f70966a = z11;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z11) {
            try {
                constructor = p.a().getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f70967b = constructor;
    }

    public static v f() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new v(true);
    }

    public static v g() {
        return f70965c;
    }

    public List<? extends c.a> a(@Nullable Executor executor) {
        g gVar = new g(executor);
        return this.f70966a ? Arrays.asList(e.f70860a, gVar) : Collections.singletonList(gVar);
    }

    public int b() {
        return this.f70966a ? 2 : 1;
    }

    @Nullable
    public Executor c() {
        return null;
    }

    public List<? extends f.a> d() {
        return this.f70966a ? Collections.singletonList(n.f70918a) : Collections.EMPTY_LIST;
    }

    public int e() {
        return this.f70966a ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = this.f70967b;
        unreflectSpecial = (constructor != null ? q.a(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    @IgnoreJRERequirement
    public boolean i(Method method) {
        return this.f70966a && method.isDefault();
    }
}

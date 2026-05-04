package javax.validation;

import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.WeakHashMap;
import javax.validation.bootstrap.GenericBootstrap;
import javax.validation.bootstrap.ProviderSpecificBootstrap;
import javax.validation.spi.BootstrapState;
import javax.validation.spi.ValidationProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class Validation {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements ValidationProviderResolver {
        public b() {
        }

        @Override // javax.validation.ValidationProviderResolver
        public List<ValidationProvider<?>> a() {
            return d.c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements GenericBootstrap, BootstrapState {

        /* renamed from: a, reason: collision with root package name */
        public ValidationProviderResolver f63996a;

        /* renamed from: b, reason: collision with root package name */
        public ValidationProviderResolver f63997b;

        public c() {
        }

        @Override // javax.validation.bootstrap.GenericBootstrap
        public GenericBootstrap a(ValidationProviderResolver validationProviderResolver) {
            this.f63996a = validationProviderResolver;
            return this;
        }

        @Override // javax.validation.bootstrap.GenericBootstrap
        public Configuration<?> b() {
            ValidationProviderResolver validationProviderResolver = this.f63996a;
            if (validationProviderResolver == null) {
                validationProviderResolver = c();
            }
            try {
                if (validationProviderResolver.a().size() == 0) {
                    throw new ValidationException("Unable to create a Configuration, because no Bean Validation provider could be found. Add a provider like Hibernate Validator (RI) to your classpath.");
                }
                try {
                    return validationProviderResolver.a().get(0).b(this);
                } catch (RuntimeException e11) {
                    throw new ValidationException("Unable to instantiate Configuration.", e11);
                }
            } catch (ValidationException e12) {
                throw e12;
            } catch (RuntimeException e13) {
                throw new ValidationException("Unable to get available provider resolvers.", e13);
            }
        }

        @Override // javax.validation.spi.BootstrapState
        public ValidationProviderResolver c() {
            if (this.f63997b == null) {
                this.f63997b = new b();
            }
            return this.f63997b;
        }

        @Override // javax.validation.spi.BootstrapState
        public ValidationProviderResolver d() {
            return this.f63996a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements PrivilegedAction<List<ValidationProvider<?>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final WeakHashMap<ClassLoader, SoftReference<List<ValidationProvider<?>>>> f63998a = new WeakHashMap<>();

        public static List<ValidationProvider<?>> c() {
            d dVar = new d();
            return System.getSecurityManager() != null ? (List) AccessController.doPrivileged(dVar) : dVar.run();
        }

        public final synchronized void a(ClassLoader classLoader, List<ValidationProvider<?>> list) {
            f63998a.put(classLoader, new SoftReference<>(list));
        }

        public final synchronized List<ValidationProvider<?>> b(ClassLoader classLoader) {
            SoftReference<List<ValidationProvider<?>>> softReference;
            softReference = f63998a.get(classLoader);
            return softReference != null ? softReference.get() : null;
        }

        public final List<ValidationProvider<?>> d(ClassLoader classLoader) {
            Iterator it = ServiceLoader.load(ValidationProvider.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(it.next());
                } catch (ServiceConfigurationError unused) {
                }
            }
            return arrayList;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<ValidationProvider<?>> run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            List<ValidationProvider<?>> b11 = b(contextClassLoader);
            if (b11 != null) {
                return b11;
            }
            List<ValidationProvider<?>> d11 = d(contextClassLoader);
            if (d11.isEmpty()) {
                contextClassLoader = b.class.getClassLoader();
                List<ValidationProvider<?>> b12 = b(contextClassLoader);
                if (b12 != null) {
                    return b12;
                }
                d11 = d(contextClassLoader);
            }
            a(contextClassLoader, d11);
            return d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<T extends Configuration<T>, U extends ValidationProvider<T>> implements ProviderSpecificBootstrap<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<U> f63999a;

        /* renamed from: b, reason: collision with root package name */
        public ValidationProviderResolver f64000b;

        public e(Class<U> cls) {
            this.f63999a = cls;
        }

        @Override // javax.validation.bootstrap.ProviderSpecificBootstrap
        public ProviderSpecificBootstrap<T> a(ValidationProviderResolver validationProviderResolver) {
            this.f64000b = validationProviderResolver;
            return this;
        }

        @Override // javax.validation.bootstrap.ProviderSpecificBootstrap
        public T b() {
            if (this.f63999a == null) {
                throw new ValidationException("builder is mandatory. Use Validation.byDefaultProvider() to use the generic provider discovery mechanism");
            }
            c cVar = new c();
            ValidationProviderResolver validationProviderResolver = this.f64000b;
            if (validationProviderResolver == null) {
                this.f64000b = cVar.c();
            } else {
                cVar.a(validationProviderResolver);
            }
            try {
                for (ValidationProvider<?> validationProvider : this.f64000b.a()) {
                    if (this.f63999a.isAssignableFrom(validationProvider.getClass())) {
                        return (T) this.f63999a.cast(validationProvider).a(cVar);
                    }
                }
                throw new ValidationException("Unable to find provider: " + this.f63999a);
            } catch (RuntimeException e11) {
                throw new ValidationException("Unable to get available provider resolvers.", e11);
            }
        }
    }

    public static ValidatorFactory a() {
        return b().b().e();
    }

    public static GenericBootstrap b() {
        return new c();
    }

    public static <T extends Configuration<T>, U extends ValidationProvider<T>> ProviderSpecificBootstrap<T> c(Class<U> cls) {
        return new e(cls);
    }
}

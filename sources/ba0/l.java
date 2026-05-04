package ba0;

import java.util.function.Predicate;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.1", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class l implements Predicate<Class<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Predicate<String> f6572a;

    /* renamed from: b, reason: collision with root package name */
    public final Predicate<Class<?>> f6573b;

    public l(Predicate<String> namePredicate, Predicate<Class<?>> classPredicate) {
        this.f6572a = (Predicate) c2.r(namePredicate, "name predicate must not be null");
        this.f6573b = (Predicate) c2.r(classPredicate, "class predicate must not be null");
    }

    public static /* synthetic */ boolean a(String str) {
        return true;
    }

    public static l d(Predicate<Class<?>> classPredicate) {
        return e(new Predicate() { // from class: ba0.k
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l.a((String) obj);
            }
        }, classPredicate);
    }

    public static l e(Predicate<String> namePredicate, Predicate<Class<?>> classPredicate) {
        return new l(namePredicate, classPredicate);
    }

    public boolean b(Class<?> type) {
        return this.f6573b.test(type);
    }

    public boolean c(String name) {
        return this.f6572a.test(name);
    }

    @Override // java.util.function.Predicate
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean test(Class<?> type) {
        return c(type.getName()) && b(type);
    }
}

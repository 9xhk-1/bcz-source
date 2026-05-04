package y80;

import java.lang.reflect.Method;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.1", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class d implements Predicate<Class<?>> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f99674a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f99675b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f99676c;

    /* renamed from: d, reason: collision with root package name */
    public static final Predicate<Method> f99677d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f99678e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f99679f;

    static {
        f fVar = new f();
        f99674a = fVar;
        e eVar = new e();
        f99675b = eVar;
        g gVar = new g();
        f99676c = gVar;
        f99677d = fVar.or(eVar).or(gVar);
        f99678e = new c();
        f99679f = new b();
    }

    public final boolean a(Class<?> candidate) {
        return !ReflectionUtils.m0(candidate, f99679f).isEmpty();
    }

    public final boolean b(Class<?> candidate) {
        return ReflectionUtils.Z0(candidate, f99677d);
    }

    @Override // java.util.function.Predicate
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean test(Class<?> candidate) {
        if (f99678e.test(candidate)) {
            return b(candidate) || a(candidate);
        }
        return false;
    }
}

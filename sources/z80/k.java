package z80;

import ba0.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.4", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class k implements p80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<Object> f102386a;

    public k(List<Object> instances) {
        this.f102386a = (List) c2.m(instances, "instances must not be empty");
    }

    public static k e(Object instance) {
        return new k(Collections.singletonList(instance));
    }

    public static k f(p80.f0 testInstances, Object instance) {
        ArrayList arrayList = new ArrayList(testInstances.a());
        arrayList.add(instance);
        return new k(Collections.unmodifiableList(arrayList));
    }

    @Override // p80.f0
    public List<Object> a() {
        return this.f102386a;
    }

    @Override // p80.f0
    public List<Object> b() {
        return this.f102386a.subList(0, r0.size() - 1);
    }

    @Override // p80.f0
    public <T> Optional<T> c(Class<T> requiredType) {
        c2.r(requiredType, "requiredType must not be null");
        List<Object> list = this.f102386a;
        ListIterator<Object> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            if (requiredType.isInstance(previous)) {
                return Optional.of(requiredType.cast(previous));
            }
        }
        return Optional.empty();
    }

    @Override // p80.f0
    public Object d() {
        return this.f102386a.get(r0.size() - 1);
    }
}

package ba0;

import java.util.ArrayList;
import java.util.List;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class g4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6544a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f6545b;

    public g4(Object obj) {
        this(c2.r(obj, "Object must not be null").getClass().getSimpleName());
    }

    public g4 a(String name, Object value) {
        c2.k(name, "Name must not be null or blank");
        this.f6545b.add(name + " = " + b(value));
        return this;
    }

    public final String b(Object obj) {
        if (!(obj instanceof CharSequence)) {
            return e4.i(obj);
        }
        return "'" + obj + "'";
    }

    public String toString() {
        return this.f6544a + " [" + androidx.camera.core.impl.u.a(org.junit.jupiter.api.j2.O, this.f6545b) + "]";
    }

    public g4(Class<?> type) {
        this(((Class) c2.r(type, "Class must not be null")).getSimpleName());
    }

    @API(since = "1.7", status = API.Status.INTERNAL)
    public g4(String typeName) {
        this.f6545b = new ArrayList();
        this.f6544a = (String) c2.r(typeName, "Type name must not be null");
    }
}

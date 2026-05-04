package v60;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, I> f93135a = new HashMap();

    public static <I> e<I> b() {
        return new e<>();
    }

    public d<I> a() {
        return new d<>(this.f93135a);
    }

    public e<I> c(String str, I i11) {
        e80.a.f(str, "ID");
        e80.a.j(i11, "Item");
        this.f93135a.put(str.toLowerCase(Locale.ROOT), i11);
        return this;
    }

    public String toString() {
        return this.f93135a.toString();
    }
}

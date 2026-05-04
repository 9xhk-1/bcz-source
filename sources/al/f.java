package al;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ik.g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<a<?>> f2680a = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f2681a;

        /* renamed from: b, reason: collision with root package name */
        public final g<T> f2682b;

        public a(@NonNull Class<T> cls, @NonNull g<T> gVar) {
            this.f2681a = cls;
            this.f2682b = gVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f2681a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull g<Z> gVar) {
        this.f2680a.add(new a<>(cls, gVar));
    }

    @Nullable
    public synchronized <Z> g<Z> b(@NonNull Class<Z> cls) {
        int size = this.f2680a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a<?> aVar = this.f2680a.get(i11);
            if (aVar.a(cls)) {
                return (g<Z>) aVar.f2682b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@NonNull Class<Z> cls, @NonNull g<Z> gVar) {
        this.f2680a.add(0, new a<>(cls, gVar));
    }
}

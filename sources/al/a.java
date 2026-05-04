package al;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<C0020a<?>> f2666a = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: al.a$a, reason: collision with other inner class name */
    public static final class C0020a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f2667a;

        /* renamed from: b, reason: collision with root package name */
        public final ik.a<T> f2668b;

        public C0020a(@NonNull Class<T> cls, @NonNull ik.a<T> aVar) {
            this.f2667a = cls;
            this.f2668b = aVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f2667a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull ik.a<T> aVar) {
        this.f2666a.add(new C0020a<>(cls, aVar));
    }

    @Nullable
    public synchronized <T> ik.a<T> b(@NonNull Class<T> cls) {
        for (C0020a<?> c0020a : this.f2666a) {
            if (c0020a.a(cls)) {
                return (ik.a<T>) c0020a.f2668b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@NonNull Class<T> cls, @NonNull ik.a<T> aVar) {
        this.f2666a.add(0, new C0020a<>(cls, aVar));
    }
}

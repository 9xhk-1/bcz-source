package al;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import fl.l;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<l> f2673a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayMap<l, List<Class<?>>> f2674b = new ArrayMap<>();

    public void a() {
        synchronized (this.f2674b) {
            this.f2674b.clear();
        }
    }

    @Nullable
    public List<Class<?>> b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        l andSet = this.f2673a.getAndSet(null);
        if (andSet == null) {
            andSet = new l(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f2674b) {
            list = this.f2674b.get(andSet);
        }
        this.f2673a.set(andSet);
        return list;
    }

    public void c(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f2674b) {
            this.f2674b.put(new l(cls, cls2, cls3), list);
        }
    }
}

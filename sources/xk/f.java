package xk;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<a<?, ?>> f98134a = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Z> f98135a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f98136b;

        /* renamed from: c, reason: collision with root package name */
        public final e<Z, R> f98137c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
            this.f98135a = cls;
            this.f98136b = cls2;
            this.f98137c = eVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f98135a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f98136b);
        }
    }

    @NonNull
    public synchronized <Z, R> e<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f98134a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f98137c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f98134a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f98136b)) {
                arrayList.add(aVar.f98136b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
        this.f98134a.add(new a<>(cls, cls2, eVar));
    }
}

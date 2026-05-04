package al;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import fl.l;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import kk.i;
import kk.s;
import xk.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final s<?, ?, ?> f2670c = new s<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayMap<l, s<?, ?, ?>> f2671a = new ArrayMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<l> f2672b = new AtomicReference<>();

    @Nullable
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s<Data, TResource, Transcode> sVar;
        l b11 = b(cls, cls2, cls3);
        synchronized (this.f2671a) {
            sVar = (s) this.f2671a.get(b11);
        }
        this.f2672b.set(b11);
        return sVar;
    }

    public final l b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        l andSet = this.f2672b.getAndSet(null);
        if (andSet == null) {
            andSet = new l();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(@Nullable s<?, ?, ?> sVar) {
        return f2670c.equals(sVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable s<?, ?, ?> sVar) {
        synchronized (this.f2671a) {
            ArrayMap<l, s<?, ?, ?>> arrayMap = this.f2671a;
            l lVar = new l(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f2670c;
            }
            arrayMap.put(lVar, sVar);
        }
    }
}

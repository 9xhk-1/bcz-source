package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e.a<?> f28741b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f28742a = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<Object> a(@NonNull Object obj) {
            return new b(obj);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    @NonNull
    public synchronized <T> e<T> a(@NonNull T t11) {
        e.a<?> aVar;
        try {
            fl.m.e(t11);
            aVar = this.f28742a.get(t11.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = this.f28742a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.getDataClass().isAssignableFrom(t11.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f28741b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (e<T>) aVar.a(t11);
    }

    public synchronized void b(@NonNull e.a<?> aVar) {
        this.f28742a.put(aVar.getDataClass(), aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f28743a;

        public b(@NonNull Object obj) {
            this.f28743a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @NonNull
        public Object a() {
            return this.f28743a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void cleanup() {
        }
    }
}

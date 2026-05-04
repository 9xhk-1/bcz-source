package com.bumptech.glide;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, b> f28686a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, b> f28687a = new HashMap();

        public a b(b bVar) {
            this.f28687a.put(bVar.getClass(), bVar);
            return this;
        }

        public f c() {
            return new f(this);
        }

        public a d(b bVar, boolean z11) {
            if (z11) {
                b(bVar);
                return this;
            }
            this.f28687a.remove(bVar.getClass());
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
    }

    public f(a aVar) {
        this.f28686a = Collections.unmodifiableMap(new HashMap(aVar.f28687a));
    }

    @Nullable
    public <T extends b> T a(Class<T> cls) {
        return (T) this.f28686a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.f28686a.containsKey(cls);
    }
}

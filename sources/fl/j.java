package fl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<T, a<Y>> f52008a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f52009b;

    /* renamed from: c, reason: collision with root package name */
    public long f52010c;

    /* renamed from: d, reason: collision with root package name */
    public long f52011d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        public final Y f52012a;

        /* renamed from: b, reason: collision with root package name */
        public final int f52013b;

        public a(Y y11, int i11) {
            this.f52012a = y11;
            this.f52013b = i11;
        }
    }

    public j(long j11) {
        this.f52009b = j11;
        this.f52010c = j11;
    }

    public synchronized long a() {
        return this.f52010c;
    }

    public void c() {
        p(0L);
    }

    public synchronized void d(float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f52010c = Math.round(this.f52009b * f11);
        i();
    }

    public synchronized long getCurrentSize() {
        return this.f52011d;
    }

    public synchronized boolean h(@NonNull T t11) {
        return this.f52008a.containsKey(t11);
    }

    public final void i() {
        p(this.f52010c);
    }

    @Nullable
    public synchronized Y j(@NonNull T t11) {
        a<Y> aVar;
        aVar = this.f52008a.get(t11);
        return aVar != null ? aVar.f52012a : null;
    }

    public synchronized int k() {
        return this.f52008a.size();
    }

    public int l(@Nullable Y y11) {
        return 1;
    }

    @Nullable
    public synchronized Y n(@NonNull T t11, @Nullable Y y11) {
        int l11 = l(y11);
        long j11 = l11;
        if (j11 >= this.f52010c) {
            m(t11, y11);
            return null;
        }
        if (y11 != null) {
            this.f52011d += j11;
        }
        a<Y> put = this.f52008a.put(t11, y11 == null ? null : new a<>(y11, l11));
        if (put != null) {
            this.f52011d -= put.f52013b;
            if (!put.f52012a.equals(y11)) {
                m(t11, put.f52012a);
            }
        }
        i();
        return put != null ? put.f52012a : null;
    }

    @Nullable
    public synchronized Y o(@NonNull T t11) {
        a<Y> remove = this.f52008a.remove(t11);
        if (remove == null) {
            return null;
        }
        this.f52011d -= remove.f52013b;
        return remove.f52012a;
    }

    public synchronized void p(long j11) {
        while (this.f52011d > j11) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f52008a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f52011d -= value.f52013b;
            T key = next.getKey();
            it.remove();
            m(key, value.f52012a);
        }
    }

    public void m(@NonNull T t11, @Nullable Y y11) {
    }
}

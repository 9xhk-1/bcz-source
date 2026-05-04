package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i extends j {

    /* renamed from: e, reason: collision with root package name */
    public final n f67577e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry<K, i> f67578a;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f67578a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            i value = this.f67578a.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof n) {
                return this.f67578a.getValue().d((n) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, i> entry) {
            this.f67578a = entry;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f67579a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f67579a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f67579a.next();
            return next.getValue() instanceof i ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67579a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f67579a.remove();
        }
    }

    public n e() {
        return c(this.f67577e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}

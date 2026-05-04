package a00;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u0 implements Map, Serializable, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u0 f1154a = new u0();
    private static final long serialVersionUID = 8246714829545688274L;

    private final Object readResolve() {
        return f1154a;
    }

    public boolean b(@m80.k Void value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@m80.l Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return b((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    @m80.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void get(@m80.l Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return g();
    }

    @Override // java.util.Map
    public boolean equals(@m80.l Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @m80.k
    public Set<Map.Entry> g() {
        return EmptySet.INSTANCE;
    }

    @m80.k
    public Set<Object> h() {
        return EmptySet.INSTANCE;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    public int j() {
        return 0;
    }

    @m80.k
    public Collection k() {
        return EmptyList.INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return h();
    }

    public Void l(Object obj, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return j();
    }

    @m80.k
    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return k();
    }
}

package k50;

import a00.r0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import l50.q1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0(with = k0.class)
/* loaded from: classes8.dex */
public final class i0 extends k implements Map<String, k>, y00.a {

    @m80.k
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, k> f65965a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public a() {
        }

        @m80.k
        public final f50.i<i0> serializer() {
            return k0.f65967a;
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(@m80.k Map<String, ? extends k> content) {
        super(null);
        kotlin.jvm.internal.g0.p(content, "content");
        this.f65965a = content;
    }

    public static final CharSequence y(Map.Entry entry) {
        kotlin.jvm.internal.g0.p(entry, "<destruct>");
        String str = (String) entry.getKey();
        k kVar = (k) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        q1.d(sb2, str);
        sb2.append(':');
        sb2.append(kVar);
        return sb2.toString();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k compute(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k computeIfAbsent(String str, Function<? super String, ? extends k> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k computeIfPresent(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return j((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof k) {
            return k((k) obj);
        }
        return false;
    }

    public k d(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, k>> entrySet() {
        return n();
    }

    @Override // java.util.Map
    public boolean equals(@m80.l Object obj) {
        return kotlin.jvm.internal.g0.g(this.f65965a, obj);
    }

    public k g(String str, Function<? super String, ? extends k> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k get(Object obj) {
        if (obj instanceof String) {
            return m((String) obj);
        }
        return null;
    }

    public k h(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f65965a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f65965a.isEmpty();
    }

    public boolean j(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f65965a.containsKey(key);
    }

    public boolean k(@m80.k k value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return this.f65965a.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return o();
    }

    public final /* bridge */ k l(Object obj) {
        if (obj instanceof String) {
            return m((String) obj);
        }
        return null;
    }

    @m80.l
    public k m(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f65965a.get(key);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k merge(String str, k kVar, BiFunction<? super k, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @m80.k
    public Set<Map.Entry<String, k>> n() {
        return this.f65965a.entrySet();
    }

    @m80.k
    public Set<String> o() {
        return this.f65965a.keySet();
    }

    public int p() {
        return this.f65965a.size();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k put(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends k> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k putIfAbsent(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @m80.k
    public Collection<k> r() {
        return this.f65965a.values();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k replace(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public k s(String str, k kVar, BiFunction<? super k, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return p();
    }

    public k t(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @m80.k
    public String toString() {
        return r0.r3(this.f65965a.entrySet(), ",", "{", com.alipay.sdk.m.u.i.f11099d, 0, null, new x00.l() { // from class: k50.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence y11;
                y11 = i0.y((Map.Entry) obj);
                return y11;
            }
        }, 24, null);
    }

    public k u(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public k remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<k> values() {
        return r();
    }

    public k w(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean x(String str, k kVar, k kVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, k kVar, k kVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

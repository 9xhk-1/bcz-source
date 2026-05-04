package xy;

import java.util.Map;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o0<Key, Value> implements Map.Entry<Key, Value>, g.a {

    /* renamed from: a, reason: collision with root package name */
    public final Key f98626a;

    /* renamed from: b, reason: collision with root package name */
    public Value f98627b;

    public o0(Key key, Value value) {
        this.f98626a = key;
        this.f98627b = value;
    }

    public void a(Value value) {
        this.f98627b = value;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@m80.l Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.g0.g(entry.getKey(), getKey()) && kotlin.jvm.internal.g0.g(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Key getKey() {
        return this.f98626a;
    }

    @Override // java.util.Map.Entry
    public Value getValue() {
        return this.f98627b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Key key = getKey();
        kotlin.jvm.internal.g0.m(key);
        int hashCode = key.hashCode() + 527;
        Value value = getValue();
        kotlin.jvm.internal.g0.m(value);
        return hashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Value setValue(Value value) {
        a(value);
        return getValue();
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}

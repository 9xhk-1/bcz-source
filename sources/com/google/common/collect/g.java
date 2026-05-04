package com.google.common.collect;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class g<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(@CheckForNull Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            if (ho.d0.a(getKey(), entry.getKey()) && ho.d0.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    @t7
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @t7
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    @t7
    public V setValue(@t7 V value) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }
}

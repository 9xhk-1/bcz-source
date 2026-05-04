package com.google.common.collect;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class x4<K, V> extends c5 implements Map.Entry<K, V> {
    public boolean equals(@CheckForNull Object object) {
        return delegate().equals(object);
    }

    @Override // java.util.Map.Entry
    @t7
    public K getKey() {
        return delegate().getKey();
    }

    @t7
    public V getValue() {
        return delegate().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    @t7
    @uo.a
    public V setValue(@t7 V value) {
        return delegate().setValue(value);
    }

    public boolean standardEquals(@CheckForNull Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            if (ho.d0.a(getKey(), entry.getKey()) && ho.d0.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public int standardHashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public String standardToString() {
        return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
    }

    @Override // com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry<K, V> delegate();
}

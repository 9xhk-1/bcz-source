package com.google.common.cache;

import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@jo.e
@go.b
/* loaded from: classes7.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    private RemovalNotification(@CheckForNull K key, @CheckForNull V value, RemovalCause cause) {
        super(key, value);
        this.cause = (RemovalCause) Preconditions.checkNotNull(cause);
    }

    public static <K, V> RemovalNotification<K, V> create(@CheckForNull K key, @CheckForNull V value, RemovalCause cause) {
        return new RemovalNotification<>(key, value, cause);
    }

    public RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}

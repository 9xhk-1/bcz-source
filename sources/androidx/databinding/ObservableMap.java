package androidx.databinding;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ObservableMap<K, V> extends Map<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class OnMapChangedCallback<T extends ObservableMap<K, V>, K, V> {
        public abstract void onMapChanged(T sender, K key);
    }

    void addOnMapChangedCallback(OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> callback);

    void removeOnMapChangedCallback(OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> callback);
}

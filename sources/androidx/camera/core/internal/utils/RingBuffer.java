package androidx.camera.core.internal.utils;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface RingBuffer<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnRemoveCallback<T> {
        void onRemove(@NonNull T t11);
    }

    @NonNull
    T dequeue();

    void enqueue(@NonNull T t11);

    int getMaxCapacity();

    boolean isEmpty();
}

package androidx.camera.core.internal.utils;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.internal.utils.RingBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ArrayRingBuffer<T> implements RingBuffer<T> {
    private static final String TAG = "ZslRingBuffer";

    @GuardedBy("mLock")
    private final ArrayDeque<T> mBuffer;
    private final Object mLock;

    @Nullable
    final RingBuffer.OnRemoveCallback<T> mOnRemoveCallback;
    private final int mRingBufferCapacity;

    public ArrayRingBuffer(int i11) {
        this(i11, null);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    @NonNull
    public T dequeue() {
        T removeLast;
        synchronized (this.mLock) {
            removeLast = this.mBuffer.removeLast();
        }
        return removeLast;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(@NonNull T t11) {
        T dequeue;
        synchronized (this.mLock) {
            try {
                dequeue = this.mBuffer.size() >= this.mRingBufferCapacity ? dequeue() : null;
                this.mBuffer.addFirst(t11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RingBuffer.OnRemoveCallback<T> onRemoveCallback = this.mOnRemoveCallback;
        if (onRemoveCallback == null || dequeue == null) {
            return;
        }
        onRemoveCallback.onRemove(dequeue);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public int getMaxCapacity() {
        return this.mRingBufferCapacity;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.mLock) {
            isEmpty = this.mBuffer.isEmpty();
        }
        return isEmpty;
    }

    public ArrayRingBuffer(int i11, @Nullable RingBuffer.OnRemoveCallback<T> onRemoveCallback) {
        this.mLock = new Object();
        this.mRingBufferCapacity = i11;
        this.mBuffer = new ArrayDeque<>(i11);
        this.mOnRemoveCallback = onRemoveCallback;
    }
}

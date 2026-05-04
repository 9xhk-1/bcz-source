package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    private static final String TAG = "CallbackRegistry";
    private List<C> mCallbacks = new ArrayList();
    private long mFirst64Removed = 0;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C callback, T sender, int arg, A arg2);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifier) {
        this.mNotifier = notifier;
    }

    private boolean isRemoved(int index) {
        int i11;
        if (index < 64) {
            return ((1 << index) & this.mFirst64Removed) != 0;
        }
        long[] jArr = this.mRemainderRemoved;
        if (jArr != null && (i11 = (index / 64) - 1) < jArr.length) {
            return ((1 << (index % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T sender, int arg, A arg2) {
        notifyCallbacks(sender, arg, arg2, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
    }

    private void notifyRecurse(T sender, int arg, A arg2) {
        int size = this.mCallbacks.size();
        int length = this.mRemainderRemoved == null ? -1 : r0.length - 1;
        notifyRemainder(sender, arg, arg2, length);
        notifyCallbacks(sender, arg, arg2, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T sender, int arg, A arg2, int remainderIndex) {
        if (remainderIndex < 0) {
            notifyFirst64(sender, arg, arg2);
            return;
        }
        long j11 = this.mRemainderRemoved[remainderIndex];
        int i11 = (remainderIndex + 1) * 64;
        int min = Math.min(this.mCallbacks.size(), i11 + 64);
        notifyRemainder(sender, arg, arg2, remainderIndex - 1);
        notifyCallbacks(sender, arg, arg2, i11, min, j11);
    }

    private void removeRemovedCallbacks(int startIndex, long removed) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = startIndex + 63; i11 >= startIndex; i11--) {
            if ((removed & j11) != 0) {
                this.mCallbacks.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    private void setRemovalBit(int index) {
        if (index < 64) {
            this.mFirst64Removed = (1 << index) | this.mFirst64Removed;
            return;
        }
        int i11 = (index / 64) - 1;
        long[] jArr = this.mRemainderRemoved;
        if (jArr == null) {
            this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[this.mCallbacks.size() / 64];
            long[] jArr3 = this.mRemainderRemoved;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.mRemainderRemoved = jArr2;
        }
        long j11 = 1 << (index % 64);
        long[] jArr4 = this.mRemainderRemoved;
        jArr4[i11] = j11 | jArr4[i11];
    }

    public synchronized void add(C callback) {
        try {
            if (callback == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int lastIndexOf = this.mCallbacks.lastIndexOf(callback);
            if (lastIndexOf >= 0) {
                if (isRemoved(lastIndexOf)) {
                }
            }
            this.mCallbacks.add(callback);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clear() {
        try {
            if (this.mNotificationLevel == 0) {
                this.mCallbacks.clear();
            } else if (!this.mCallbacks.isEmpty()) {
                for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                    setRemovalBit(size);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.mCallbacks.size());
        int size = this.mCallbacks.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!isRemoved(i11)) {
                arrayList.add(this.mCallbacks.get(i11));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        if (this.mCallbacks.isEmpty()) {
            return true;
        }
        if (this.mNotificationLevel == 0) {
            return false;
        }
        int size = this.mCallbacks.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!isRemoved(i11)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T sender, int arg, A arg2) {
        try {
            this.mNotificationLevel++;
            notifyRecurse(sender, arg, arg2);
            int i11 = this.mNotificationLevel - 1;
            this.mNotificationLevel = i11;
            if (i11 == 0) {
                long[] jArr = this.mRemainderRemoved;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j11 = this.mRemainderRemoved[length];
                        if (j11 != 0) {
                            removeRemovedCallbacks((length + 1) * 64, j11);
                            this.mRemainderRemoved[length] = 0;
                        }
                    }
                }
                long j12 = this.mFirst64Removed;
                if (j12 != 0) {
                    removeRemovedCallbacks(0, j12);
                    this.mFirst64Removed = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void remove(C callback) {
        try {
            if (this.mNotificationLevel == 0) {
                this.mCallbacks.remove(callback);
            } else {
                int lastIndexOf = this.mCallbacks.lastIndexOf(callback);
                if (lastIndexOf >= 0) {
                    setRemovalBit(lastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized CallbackRegistry<C, T, A> m5606clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e11;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
        } catch (CloneNotSupportedException e12) {
            callbackRegistry = null;
            e11 = e12;
        }
        try {
            callbackRegistry.mFirst64Removed = 0L;
            callbackRegistry.mRemainderRemoved = null;
            callbackRegistry.mNotificationLevel = 0;
            callbackRegistry.mCallbacks = new ArrayList();
            int size = this.mCallbacks.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!isRemoved(i11)) {
                    callbackRegistry.mCallbacks.add(this.mCallbacks.get(i11));
                }
            }
        } catch (CloneNotSupportedException e13) {
            e11 = e13;
            e11.printStackTrace();
            return callbackRegistry;
        }
        return callbackRegistry;
    }

    public synchronized void copyCallbacks(List<C> callbacks) {
        callbacks.clear();
        int size = this.mCallbacks.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!isRemoved(i11)) {
                callbacks.add(this.mCallbacks.get(i11));
            }
        }
    }

    private void notifyCallbacks(T t11, int i11, A a11, int i12, int i13, long j11) {
        long j12 = 1;
        while (i12 < i13) {
            if ((j11 & j12) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i12), t11, i11, a11);
            }
            j12 <<= 1;
            i12++;
        }
    }
}

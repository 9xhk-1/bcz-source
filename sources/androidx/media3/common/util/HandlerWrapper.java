package androidx.media3.common.util;

import android.os.Looper;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface HandlerWrapper {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Message {
        HandlerWrapper getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i11);

    Message obtainMessage(int i11);

    Message obtainMessage(int i11, int i12, int i13);

    Message obtainMessage(int i11, int i12, int i13, @Nullable Object obj);

    Message obtainMessage(int i11, @Nullable Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j11);

    void removeCallbacksAndMessages(@Nullable Object obj);

    void removeMessages(int i11);

    boolean sendEmptyMessage(int i11);

    boolean sendEmptyMessageAtTime(int i11, long j11);

    boolean sendEmptyMessageDelayed(int i11, int i12);

    boolean sendMessageAtFrontOfQueue(Message message);
}

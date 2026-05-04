package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.HandlerWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;

    @GuardedBy("messagePool")
    private static final List<SystemMessage> messagePool = new ArrayList(50);
    private final Handler handler;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SystemMessage implements HandlerWrapper.Message {

        @Nullable
        private SystemHandlerWrapper handler;

        @Nullable
        private Message message;

        private SystemMessage() {
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            SystemHandlerWrapper.recycleMessage(this);
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper) Assertions.checkNotNull(this.handler);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(this.message));
            recycle();
            return sendMessageAtFrontOfQueue;
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((Message) Assertions.checkNotNull(this.message)).sendToTarget();
            recycle();
        }

        @uo.a
        public SystemMessage setMessage(Message message, SystemHandlerWrapper systemHandlerWrapper) {
            this.message = message;
            this.handler = systemHandlerWrapper;
            return this;
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    private static SystemMessage obtainSystemMessage() {
        SystemMessage systemMessage;
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                systemMessage = list.isEmpty() ? new SystemMessage() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return systemMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(SystemMessage systemMessage) {
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(systemMessage);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean hasMessages(int i11) {
        Assertions.checkArgument(i11 != 0);
        return this.handler.hasMessages(i11);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i11) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i11), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j11) {
        return this.handler.postDelayed(runnable, j11);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeMessages(int i11) {
        Assertions.checkArgument(i11 != 0);
        this.handler.removeMessages(i11);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessage(int i11) {
        return this.handler.sendEmptyMessage(i11);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i11, long j11) {
        return this.handler.sendEmptyMessageAtTime(i11, j11);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i11, int i12) {
        return this.handler.sendEmptyMessageDelayed(i11, i12);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((SystemMessage) message).sendAtFrontOfQueue(this.handler);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i11, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i11, obj), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i11, int i12, int i13) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i11, i12, i13), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i11, int i12, int i13, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i11, i12, i13, obj), this);
    }
}

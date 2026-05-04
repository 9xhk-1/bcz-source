package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() { // from class: androidx.datastore.preferences.protobuf.BufferAllocator.1
        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int capacity) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(capacity));
        }

        @Override // androidx.datastore.preferences.protobuf.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int capacity) {
            return AllocatedBuffer.wrap(new byte[capacity]);
        }
    };

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int capacity);

    public abstract AllocatedBuffer allocateHeapBuffer(int capacity);
}

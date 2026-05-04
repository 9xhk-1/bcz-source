package org.conscrypt;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() { // from class: org.conscrypt.BufferAllocator.1
        @Override // org.conscrypt.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i11) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i11));
        }
    };

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i11);
}

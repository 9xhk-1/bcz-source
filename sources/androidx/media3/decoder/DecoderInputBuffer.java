package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo;

    @Nullable
    public ByteBuffer data;

    @Nullable
    public Format format;
    private final int paddingSize;

    @Nullable
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i11, int i12) {
            super("Buffer too small (" + i11 + " < " + i12 + j.f81007d);
            this.currentCapacity = i11;
            this.requiredCapacity = i12;
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.decoder");
    }

    public DecoderInputBuffer(int i11) {
        this(i11, 0);
    }

    private ByteBuffer createReplacementByteBuffer(int i11) {
        int i12 = this.bufferReplacementMode;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.data;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i11);
    }

    public static DecoderInputBuffer newNoDataInstance() {
        return new DecoderInputBuffer(0);
    }

    @Override // androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i11) {
        int i12 = i11 + this.paddingSize;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i12);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i13 = i12 + position;
        if (capacity >= i13) {
            this.data = byteBuffer;
            return;
        }
        ByteBuffer createReplacementByteBuffer = createReplacementByteBuffer(i13);
        createReplacementByteBuffer.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            createReplacementByteBuffer.put(byteBuffer);
        }
        this.data = createReplacementByteBuffer;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i11) {
        ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            this.supplementalData = ByteBuffer.allocate(i11);
        } else {
            this.supplementalData.clear();
        }
    }

    public DecoderInputBuffer(int i11, int i12) {
        this.cryptoInfo = new CryptoInfo();
        this.bufferReplacementMode = i11;
        this.paddingSize = i12;
    }
}

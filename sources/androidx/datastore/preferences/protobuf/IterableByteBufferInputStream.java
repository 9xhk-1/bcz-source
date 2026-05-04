package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class IterableByteBufferInputStream extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    public IterableByteBufferInputStream(Iterable<ByteBuffer> data) {
        this.iterator = data.iterator();
        for (ByteBuffer byteBuffer : data) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (!this.iterator.hasNext()) {
            return false;
        }
        ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.currentByteBufferPos = next.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int numberOfBytesRead) {
        int i11 = this.currentByteBufferPos + numberOfBytesRead;
        this.currentByteBufferPos = i11;
        if (i11 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i11 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & 255;
            updateCurrentByteBufferPos(1);
            return i11;
        }
        int i12 = UnsafeUtil.getByte(this.currentByteBufferPos + this.currentAddress) & 255;
        updateCurrentByteBufferPos(1);
        return i12;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int limit = this.currentByteBuffer.limit();
        int i11 = this.currentByteBufferPos;
        int i12 = limit - i11;
        if (length > i12) {
            length = i12;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i11 + this.currentArrayOffset, output, offset, length);
            updateCurrentByteBufferPos(length);
            return length;
        }
        int position = this.currentByteBuffer.position();
        Java8Compatibility.position(this.currentByteBuffer, this.currentByteBufferPos);
        this.currentByteBuffer.get(output, offset, length);
        Java8Compatibility.position(this.currentByteBuffer, position);
        updateCurrentByteBufferPos(length);
        return length;
    }
}

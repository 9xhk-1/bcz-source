package org.apache.thrift.transport;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TFileTransport extends TTransport {
    protected TSeekableFile inputFile_;
    private boolean readOnly_;
    TailPolicy currentPolicy_ = TailPolicy.NOWAIT;
    protected OutputStream outputStream_ = null;
    Event currentEvent_ = null;
    InputStream inputStream_ = null;

    /* renamed from: cs, reason: collision with root package name */
    ChunkState f77769cs = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Event {
        private byte[] buf_;
        private int navailable_ = 0;
        private int nread_ = 0;

        public Event(byte[] bArr) {
            this.buf_ = bArr;
        }

        public int emit(byte[] bArr, int i11, int i12) {
            if (i12 == 0 || i12 > getRemaining()) {
                i12 = getRemaining();
            }
            if (i12 <= 0) {
                return i12;
            }
            System.arraycopy(this.buf_, this.nread_, bArr, i11, i12);
            this.nread_ += i12;
            return i12;
        }

        public byte[] getBuf() {
            return this.buf_;
        }

        public int getRemaining() {
            return this.navailable_ - this.nread_;
        }

        public int getSize() {
            return this.buf_.length;
        }

        public void setAvailable(int i11) {
            this.nread_ = 0;
            this.navailable_ = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TailPolicy {
        NOWAIT(0, 0),
        WAIT_FOREVER(500, -1);

        public final int retries_;
        public final int timeout_;

        TailPolicy(int i11, int i12) {
            this.timeout_ = i11;
            this.retries_ = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TruncableBufferedInputStream extends BufferedInputStream {
        public TruncableBufferedInputStream(InputStream inputStream) {
            super(inputStream);
        }

        public void trunc() {
            ((BufferedInputStream) this).count = 0;
            ((BufferedInputStream) this).pos = 0;
        }

        public TruncableBufferedInputStream(InputStream inputStream, int i11) {
            super(inputStream, i11);
        }
    }

    public TFileTransport(String str, boolean z11) throws IOException {
        this.inputFile_ = null;
        this.readOnly_ = false;
        this.inputFile_ = new TStandardFile(str);
        this.readOnly_ = z11;
    }

    private InputStream createInputStream() throws TTransportException {
        try {
            InputStream inputStream = this.inputStream_;
            if (inputStream == null) {
                return new TruncableBufferedInputStream(this.inputFile_.getInputStream());
            }
            ((TruncableBufferedInputStream) inputStream).trunc();
            return this.inputStream_;
        } catch (IOException e11) {
            System.err.println("createInputStream: " + e11.getMessage());
            throw new TTransportException(e11.getMessage(), e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void main(java.lang.String[] r11) throws java.lang.Exception {
        /*
            int r0 = r11.length
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L23
            r0 = r11[r1]
            java.lang.String r3 = "--help"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L23
            r0 = r11[r1]
            java.lang.String r3 = "-h"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L23
            r0 = r11[r1]
            java.lang.String r3 = "-?"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L26
        L23:
            printUsage()
        L26:
            int r0 = r11.length
            if (r0 <= r2) goto L4b
            r0 = r11[r2]     // Catch: java.lang.Exception -> L30
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L30
            goto L4d
        L30:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot parse "
            r3.append(r4)
            r4 = r11[r2]
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.println(r3)
            printUsage()
        L4b:
            r0 = 10
        L4d:
            org.apache.thrift.transport.TFileTransport r3 = new org.apache.thrift.transport.TFileTransport
            r11 = r11[r1]
            r3.<init>(r11, r2)
            r3.open()
            java.io.PrintStream r11 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NumChunks="
            r4.append(r5)
            int r5 = r3.getNumChunks()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r11.println(r4)
            java.util.Random r11 = new java.util.Random
            r11.<init>()
            r4 = r1
        L77:
            if (r4 >= r0) goto Lab
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r5]
            int r7 = r3.getNumChunks()
            int r7 = r7 - r2
            int r7 = r11.nextInt(r7)
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Reading chunk "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.println(r9)
            r3.seekToChunk(r7)
            r7 = r1
        La0:
            if (r7 >= r5) goto La8
            r3.read(r6, r1, r5)
            int r7 = r7 + 1
            goto La0
        La8:
            int r4 = r4 + 1
            goto L77
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.thrift.transport.TFileTransport.main(java.lang.String[]):void");
    }

    private boolean performRecovery() throws TTransportException {
        int numChunks = getNumChunks();
        int chunkNum = this.f77769cs.getChunkNum();
        if (chunkNum >= numChunks - 1) {
            return false;
        }
        seekToChunk(chunkNum + 1);
        return true;
    }

    private static void printUsage() {
        System.err.println("Usage: TFileTransport <filename> [num_chunks]");
        System.err.println("       (Opens and reads num_chunks chunks from file randomly)");
        System.exit(1);
    }

    private boolean readEvent() throws TTransportException {
        TFileTransport tFileTransport;
        int i11;
        byte[] bArr = new byte[4];
        do {
            int remaining = this.f77769cs.getRemaining();
            if (remaining < 4) {
                tFileTransport = this;
                if (tFileTransport.tailRead(this.inputStream_, bArr, 0, remaining, this.currentPolicy_) != remaining) {
                    return false;
                }
            } else {
                tFileTransport = this;
            }
            if (tFileTransport.tailRead(tFileTransport.inputStream_, bArr, 0, 4, tFileTransport.currentPolicy_) != 4) {
                return false;
            }
            i11 = 0;
            for (int i12 = 3; i12 >= 0; i12--) {
                i11 |= (bArr[i12] & 255) << (i12 * 8);
            }
            if (i11 > tFileTransport.f77769cs.getRemaining()) {
                throw new TTransportException("FileTransport error: bad event size");
            }
        } while (i11 == 0);
        if (tFileTransport.currentEvent_.getSize() < i11) {
            tFileTransport.currentEvent_ = new Event(new byte[i11]);
        }
        if (tFileTransport.tailRead(tFileTransport.inputStream_, tFileTransport.currentEvent_.getBuf(), 0, i11, tFileTransport.currentPolicy_) != i11) {
            return false;
        }
        tFileTransport.currentEvent_.setAvailable(i11);
        return true;
    }

    private int tailRead(InputStream inputStream, byte[] bArr, int i11, int i12, TailPolicy tailPolicy) throws TTransportException {
        int read;
        int i13 = i12;
        while (true) {
            int i14 = 0;
            while (i13 > 0) {
                try {
                    read = inputStream.read(bArr, i11, i13);
                    if (read > 0) {
                        break;
                    }
                    if (read != -1) {
                        throw new TTransportException("Unexpected return from InputStream.read = " + read);
                    }
                    i14++;
                    int i15 = tailPolicy.retries_;
                    if (i15 != -1 && i15 < i14) {
                        return i12 - i13;
                    }
                    int i16 = tailPolicy.timeout_;
                    if (i16 > 0) {
                        try {
                            Thread.sleep(i16);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (IOException e11) {
                    throw new TTransportException(e11.getMessage(), e11);
                }
            }
            return i12 - i13;
            i11 += read;
            i13 -= read;
            this.f77769cs.skip(read);
        }
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        TSeekableFile tSeekableFile = this.inputFile_;
        if (tSeekableFile != null) {
            try {
                tSeekableFile.close();
            } catch (IOException e11) {
                System.err.println("WARNING: Error closing input file: " + e11.getMessage());
            }
            this.inputFile_ = null;
        }
        OutputStream outputStream = this.outputStream_;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e12) {
                System.err.println("WARNING: Error closing output stream: " + e12.getMessage());
            }
            this.outputStream_ = null;
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void flush() throws TTransportException {
        throw new TTransportException("Not Supported");
    }

    public int getCurChunk() throws TTransportException {
        if (isOpen()) {
            return this.f77769cs.getChunkNum();
        }
        throw new TTransportException(1, "Must open before getCurChunk");
    }

    public int getNumChunks() throws TTransportException {
        if (!isOpen()) {
            throw new TTransportException(1, "Must open before getNumChunks");
        }
        try {
            long length = this.inputFile_.length();
            if (length == 0) {
                return 0;
            }
            return ((int) (length / this.f77769cs.getChunkSize())) + 1;
        } catch (IOException e11) {
            throw new TTransportException(e11.getMessage(), e11);
        }
    }

    public TailPolicy getTailPolicy() {
        return this.currentPolicy_;
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        if (this.inputStream_ != null) {
            return this.readOnly_ || this.outputStream_ != null;
        }
        return false;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        if (isOpen()) {
            throw new TTransportException(2);
        }
        try {
            this.inputStream_ = createInputStream();
            this.f77769cs = new ChunkState();
            this.currentEvent_ = new Event(new byte[256]);
            if (this.readOnly_) {
                return;
            }
            this.outputStream_ = new BufferedOutputStream(this.inputFile_.getOutputStream(), 8192);
        } catch (IOException e11) {
            throw new TTransportException(1, e11);
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        if (!isOpen()) {
            throw new TTransportException(1, "Must open before reading");
        }
        if (this.currentEvent_.getRemaining() != 0 || readEvent()) {
            return this.currentEvent_.emit(bArr, i11, i12);
        }
        return 0;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int readAll(byte[] bArr, int i11, int i12) throws TTransportException {
        int i13 = 0;
        while (i13 < i12) {
            int read = read(bArr, i11 + i13, i12 - i13);
            if (read < 0) {
                throw new TTransportException("Error in reading from file");
            }
            if (read == 0) {
                throw new TTransportException(4, "End of File reached");
            }
            i13 += read;
        }
        return i13;
    }

    public void seekToChunk(int i11) throws TTransportException {
        long j11;
        if (!isOpen()) {
            throw new TTransportException(1, "Must open before seeking");
        }
        int numChunks = getNumChunks();
        if (numChunks == 0) {
            return;
        }
        if (i11 < 0) {
            i11 += numChunks;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        boolean z11 = i11 >= numChunks;
        if (z11) {
            i11--;
            try {
                j11 = this.inputFile_.length();
            } catch (IOException e11) {
                throw new TTransportException(e11.getMessage(), e11);
            }
        } else {
            j11 = 0;
        }
        if (this.f77769cs.getChunkSize() * i11 != this.f77769cs.getOffset()) {
            try {
                long j12 = i11;
                this.inputFile_.seek(this.f77769cs.getChunkSize() * j12);
                this.f77769cs.seek(j12 * r10.getChunkSize());
                this.currentEvent_.setAvailable(0);
                this.inputStream_ = createInputStream();
            } catch (IOException e12) {
                System.err.println("createInputStream: " + e12.getMessage());
                throw new TTransportException("Seek to chunk " + i11 + " " + e12.getMessage(), e12);
            }
        }
        if (z11) {
            TailPolicy tailPolicy = setTailPolicy(TailPolicy.WAIT_FOREVER);
            while (this.f77769cs.getOffset() < j11) {
                readEvent();
            }
            this.currentEvent_.setAvailable(0);
            setTailPolicy(tailPolicy);
        }
    }

    public void seekToEnd() throws TTransportException {
        if (!isOpen()) {
            throw new TTransportException(1, "Must open before seeking");
        }
        seekToChunk(getNumChunks());
    }

    public TailPolicy setTailPolicy(TailPolicy tailPolicy) {
        TailPolicy tailPolicy2 = this.currentPolicy_;
        this.currentPolicy_ = tailPolicy;
        return tailPolicy2;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        throw new TTransportException("Not Supported");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChunkState {
        public static final int DEFAULT_CHUNK_SIZE = 16777216;
        private int chunk_size_;
        private long offset_;

        public ChunkState() {
            this.chunk_size_ = 16777216;
            this.offset_ = 0L;
        }

        public int getChunkNum() {
            return (int) (this.offset_ / this.chunk_size_);
        }

        public int getChunkSize() {
            return this.chunk_size_;
        }

        public long getOffset() {
            return this.offset_;
        }

        public int getRemaining() {
            int i11 = this.chunk_size_;
            return i11 - ((int) (this.offset_ % i11));
        }

        public void seek(long j11) {
            this.offset_ = j11;
        }

        public void skip(int i11) {
            this.offset_ += i11;
        }

        public ChunkState(int i11) {
            this.offset_ = 0L;
            this.chunk_size_ = i11;
        }
    }

    public TFileTransport(TSeekableFile tSeekableFile, boolean z11) {
        this.inputFile_ = tSeekableFile;
        this.readOnly_ = z11;
    }
}

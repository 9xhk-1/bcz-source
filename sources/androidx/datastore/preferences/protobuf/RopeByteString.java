package androidx.datastore.preferences.protobuf;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.ByteString;
import com.jiongji.andriod.card.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, R.styleable.Theme_drawable_tab_lecture, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Balancer {
        private final ArrayDeque<ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString balance(ByteString left, ByteString right) {
            doBalance(left);
            doBalance(right);
            ByteString pop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                pop = new RopeByteString(this.prefixesStack.pop(), pop);
            }
            return pop;
        }

        private void doBalance(ByteString root) {
            if (root.isBalanced()) {
                insert(root);
                return;
            }
            if (root instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) root;
                doBalance(ropeByteString.left);
                doBalance(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private int getDepthBinForLength(int length) {
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, length);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void insert(ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int minLength = RopeByteString.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength) {
                this.prefixesStack.push(byteString);
                return;
            }
            int minLength2 = RopeByteString.minLength(depthBinForLength);
            ByteString pop = this.prefixesStack.pop();
            while (true) {
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength2) {
                    break;
                } else {
                    pop = new RopeByteString(this.prefixesStack.pop(), pop);
                }
            }
            RopeByteString ropeByteString = new RopeByteString(pop, byteString);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= RopeByteString.minLength(getDepthBinForLength(ropeByteString.size()) + 1)) {
                    break;
                } else {
                    ropeByteString = new RopeByteString(this.prefixesStack.pop(), ropeByteString);
                }
            }
            this.prefixesStack.push(ropeByteString);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {
        private final ArrayDeque<RopeByteString> breadCrumbs;
        private ByteString.LeafByteString next;

        private ByteString.LeafByteString getLeafByLeft(ByteString root) {
            while (root instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) root;
                this.breadCrumbs.push(ropeByteString);
                root = ropeByteString.left;
            }
            return (ByteString.LeafByteString) root;
        }

        private ByteString.LeafByteString getNextNonEmptyLeaf() {
            ByteString.LeafByteString leafByLeft;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private PieceIterator(ByteString root) {
            if (!(root instanceof RopeByteString)) {
                this.breadCrumbs = null;
                this.next = (ByteString.LeafByteString) root;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) root;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(ropeByteString);
            this.next = getLeafByLeft(ropeByteString.left);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.next;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return leafByteString;
        }
    }

    public static ByteString concatenate(ByteString left, ByteString right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return concatenateBytes(left, right);
        }
        if (left instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) left;
            if (ropeByteString.right.size() + right.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, right));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > right.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, right));
            }
        }
        return size >= minLength(Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1) ? new RopeByteString(left, right) : new Balancer().balance(left, right);
    }

    private static ByteString concatenateBytes(ByteString left, ByteString right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.copyTo(bArr, 0, 0, size);
        right.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        PieceIterator pieceIterator = new PieceIterator(this);
        ByteString.LeafByteString next = pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString);
        ByteString.LeafByteString next2 = pieceIterator2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = next.size() - i11;
            int size2 = next2.size() - i12;
            int min = Math.min(size, size2);
            if (!(i11 == 0 ? next.equalsRange(next2, i12, min) : next2.equalsRange(next, i11, min))) {
                return false;
            }
            i13 += min;
            int i14 = this.totalLength;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i11 = 0;
                next = pieceIterator.next();
            } else {
                i11 += min;
                next = next;
            }
            if (min == size2) {
                next2 = pieceIterator2.next();
                i12 = 0;
            } else {
                i12 += min;
            }
        }
    }

    public static int minLength(int depth) {
        int[] iArr = minLengthByDepth;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    public static RopeByteString newInstanceForTest(ByteString left, ByteString right) {
        return new RopeByteString(left, right);
    }

    private void readObject(ObjectInputStream in2) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int index) {
        ByteString.checkIndex(index, this.totalLength);
        return internalByteAt(index);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(ByteBuffer target) {
        this.left.copyTo(target);
        this.right.copyTo(target);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i11 = sourceOffset + numberToCopy;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            this.left.copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i12) {
                this.right.copyToInternal(target, sourceOffset - i12, targetOffset, numberToCopy);
                return;
            }
            int i13 = i12 - sourceOffset;
            this.left.copyToInternal(target, sourceOffset, targetOffset, i13);
            this.right.copyToInternal(target, 0, targetOffset + i13, numberToCopy - i13);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) other;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
            return equalsFragments(byteString);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int index) {
        int i11 = this.leftLength;
        return index < i11 ? this.left.internalByteAt(index) : this.right.internalByteAt(index - i11);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream newInput() {
        return new RopeInputStream();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialHash(int h11, int offset, int length) {
        int i11 = offset + length;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            return this.left.partialHash(h11, offset, length);
        }
        if (offset >= i12) {
            return this.right.partialHash(h11, offset - i12, length);
        }
        int i13 = i12 - offset;
        return this.right.partialHash(this.left.partialHash(h11, offset, i13), 0, length - i13);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialIsValidUtf8(int state, int offset, int length) {
        int i11 = offset + length;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            return this.left.partialIsValidUtf8(state, offset, length);
        }
        if (offset >= i12) {
            return this.right.partialIsValidUtf8(state, offset - i12, length);
        }
        int i13 = i12 - offset;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(state, offset, i13), 0, length - i13);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString substring(int beginIndex, int endIndex) {
        int checkRange = ByteString.checkRange(beginIndex, endIndex, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i11 = this.leftLength;
        return endIndex <= i11 ? this.left.substring(beginIndex, endIndex) : beginIndex >= i11 ? this.right.substring(beginIndex - i11, endIndex - i11) : new RopeByteString(this.left.substring(beginIndex), this.right.substring(0, endIndex - this.leftLength));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        int i11 = sourceOffset + numberToWrite;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            this.left.writeToInternal(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i12) {
                this.right.writeToInternal(out, sourceOffset - i12, numberToWrite);
                return;
            }
            int i13 = i12 - sourceOffset;
            this.left.writeToInternal(out, sourceOffset, i13);
            this.right.writeToInternal(out, 0, numberToWrite - i13);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToReverse(ByteOutput output) throws IOException {
        this.right.writeToReverse(output);
        this.left.writeToReverse(output);
    }

    private RopeByteString(ByteString left, ByteString right) {
        this.left = left;
        this.right = right;
        int size = left.size();
        this.leftLength = size;
        this.totalLength = size + right.size();
        this.treeDepth = Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new ByteString.AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.RopeByteString.1
            ByteString.ByteIterator current = nextPiece();
            final PieceIterator pieces;

            {
                this.pieces = new PieceIterator(RopeByteString.this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            private ByteString.ByteIterator nextPiece() {
                if (this.pieces.hasNext()) {
                    return this.pieces.next().iterator2();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.current != null;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                ByteString.ByteIterator byteIterator = this.current;
                if (byteIterator == null) {
                    throw new NoSuchElementException();
                }
                byte nextByte = byteIterator.nextByte();
                if (!this.current.hasNext()) {
                    this.current = nextPiece();
                }
                return nextByte;
            }
        };
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(ByteOutput output) throws IOException {
        this.left.writeTo(output);
        this.right.writeTo(output);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class RopeInputStream extends InputStream {
        private ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private PieceIterator pieceIterator;

        public RopeInputStream() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i11 = this.currentPieceIndex;
                int i12 = this.currentPieceSize;
                if (i11 == i12) {
                    this.currentPieceOffsetInRope += i12;
                    this.currentPieceIndex = 0;
                    if (!this.pieceIterator.hasNext()) {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    } else {
                        ByteString.LeafByteString next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            PieceIterator pieceIterator = new PieceIterator(RopeByteString.this);
            this.pieceIterator = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private int readSkipInternal(byte[] b11, int offset, int length) {
            int i11 = length;
            while (i11 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i11);
                if (b11 != null) {
                    this.currentPiece.copyTo(b11, this.currentPieceIndex, offset, min);
                    offset += min;
                }
                this.currentPieceIndex += min;
                i11 -= min;
            }
            return length - i11;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int readAheadLimit) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] b11, int offset, int length) {
            b11.getClass();
            if (offset < 0 || length < 0 || length > b11.length - offset) {
                throw new IndexOutOfBoundsException();
            }
            int readSkipInternal = readSkipInternal(b11, offset, length);
            if (readSkipInternal != 0) {
                return readSkipInternal;
            }
            if (length > 0 || availableInternal() == 0) {
                return -1;
            }
            return readSkipInternal;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        @Override // java.io.InputStream
        public long skip(long length) {
            if (length < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (length > SieveCacheKt.NodeLinkMask) {
                length = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) length);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            ByteString.LeafByteString leafByteString = this.currentPiece;
            if (leafByteString == null) {
                return -1;
            }
            int i11 = this.currentPieceIndex;
            this.currentPieceIndex = i11 + 1;
            return leafByteString.byteAt(i11) & 255;
        }
    }
}

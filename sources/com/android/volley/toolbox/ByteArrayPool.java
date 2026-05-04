package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ByteArrayPool {
    protected static final Comparator<byte[]> BUF_COMPARATOR = new Comparator<byte[]>() { // from class: com.android.volley.toolbox.ByteArrayPool.1
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private final List<byte[]> mBuffersByLastUse = new ArrayList();
    private final List<byte[]> mBuffersBySize = new ArrayList(64);
    private int mCurrentSize = 0;
    private final int mSizeLimit;

    public ByteArrayPool(int i11) {
        this.mSizeLimit = i11;
    }

    private synchronized void trim() {
        while (this.mCurrentSize > this.mSizeLimit) {
            byte[] remove = this.mBuffersByLastUse.remove(0);
            this.mBuffersBySize.remove(remove);
            this.mCurrentSize -= remove.length;
        }
    }

    public synchronized byte[] getBuf(int i11) {
        for (int i12 = 0; i12 < this.mBuffersBySize.size(); i12++) {
            byte[] bArr = this.mBuffersBySize.get(i12);
            if (bArr.length >= i11) {
                this.mCurrentSize -= bArr.length;
                this.mBuffersBySize.remove(i12);
                this.mBuffersByLastUse.remove(bArr);
                return bArr;
            }
        }
        return new byte[i11];
    }

    public synchronized void returnBuf(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.mSizeLimit) {
                this.mBuffersByLastUse.add(bArr);
                int binarySearch = Collections.binarySearch(this.mBuffersBySize, bArr, BUF_COMPARATOR);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.mBuffersBySize.add(binarySearch, bArr);
                this.mCurrentSize += bArr.length;
                trim();
            }
        }
    }
}

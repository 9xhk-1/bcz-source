package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DBInnerIter<O> implements Iterator<O> {
    protected final DataBuffer<O> dataBuffer;
    protected int index = -1;

    public DBInnerIter(DataBuffer<O> dataBuffer) {
        Preconditions.checkNotNull(dataBuffer, "dataBuffer cannot be null");
        this.dataBuffer = dataBuffer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index + 1 < this.dataBuffer.getCount();
    }

    @Override // java.util.Iterator
    public O next() {
        if (!hasNext()) {
            return null;
        }
        DataBuffer<O> dataBuffer = this.dataBuffer;
        int i11 = this.index + 1;
        this.index = i11;
        return dataBuffer.get(i11);
    }
}

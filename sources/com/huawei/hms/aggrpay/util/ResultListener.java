package com.huawei.hms.aggrpay.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class ResultListener implements Parcelable {
    public static final Parcelable.Creator<ResultListener> CREATOR = new a();
    private static final int PARCEL_MAX_ARRAY_LEN = 1024;
    private long mThreadId;
    private WeakReference<Thread> mThreadWeakReference;

    public class a implements Parcelable.Creator<ResultListener> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultListener createFromParcel(Parcel parcel) {
            return new ResultListener(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultListener[] newArray(int i11) {
            return (i11 < 0 || i11 > 1024) ? new ResultListener[0] : new ResultListener[i11];
        }
    }

    public ResultListener(Parcel parcel) {
        this.mThreadId = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getThreadId() {
        return this.mThreadId;
    }

    public WeakReference<Thread> getThreadWeakReference() {
        return this.mThreadWeakReference;
    }

    public void setThread(Thread thread) {
        this.mThreadWeakReference = new WeakReference<>(thread);
    }

    public void setThreadId(long j11) {
        this.mThreadId = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.mThreadId);
    }

    public ResultListener(Thread thread, long j11) {
        this.mThreadId = j11;
        this.mThreadWeakReference = new WeakReference<>(thread);
    }

    public void notifyResult(String str, Object obj) {
    }
}

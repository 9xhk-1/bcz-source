package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SharedCounter {

    @k
    public static final Factory Factory = new Factory(null);

    @k
    private static final NativeSharedCounter nativeSharedCounter = new NativeSharedCounter();
    private final long mappedAddress;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory {
        public /* synthetic */ Factory(v vVar) {
            this();
        }

        private final SharedCounter createCounterFromFd(ParcelFileDescriptor parcelFileDescriptor) {
            int fd2 = parcelFileDescriptor.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long nativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd2);
            if (nativeCreateSharedCounter >= 0) {
                return new SharedCounter(nativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        @k
        public final SharedCounter create$datastore_core_release(@k x00.a<? extends File> produceFile) {
            ParcelFileDescriptor parcelFileDescriptor;
            g0.p(produceFile, "produceFile");
            try {
                parcelFileDescriptor = ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
                try {
                    SharedCounter createCounterFromFd = createCounterFromFd(parcelFileDescriptor);
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    return createCounterFromFd;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptor = null;
            }
        }

        @k
        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return SharedCounter.nativeSharedCounter;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }

        private Factory() {
        }
    }

    public /* synthetic */ SharedCounter(long j11, v vVar) {
        this(j11);
    }

    public final int getValue() {
        return nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
    }

    public final int incrementAndGetValue() {
        return nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }

    private SharedCounter(long j11) {
        this.mappedAddress = j11;
    }
}

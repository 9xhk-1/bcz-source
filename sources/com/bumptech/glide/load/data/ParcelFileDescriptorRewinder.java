package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final InternalRewinder f28731a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f28732a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f28732a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f28732a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f28732a;
            } catch (ErrnoException e11) {
                throw new IOException(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<ParcelFileDescriptor> a(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<ParcelFileDescriptor> getDataClass() {
            return ParcelFileDescriptor.class;
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f28731a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean b() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    @RequiresApi(21)
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() throws IOException {
        return this.f28731a.rewind();
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}

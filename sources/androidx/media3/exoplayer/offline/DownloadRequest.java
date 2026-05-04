package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i11) {
            return new DownloadRequest[i11];
        }
    };

    @Nullable
    public final ByteRange byteRange;

    @Nullable
    public final String customCacheKey;
    public final byte[] data;

    /* renamed from: id, reason: collision with root package name */
    public final String f4987id;

    @Nullable
    public final byte[] keySetId;

    @Nullable
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final Uri uri;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {

        @Nullable
        private ByteRange byteRange = null;

        @Nullable
        private String customCacheKey;

        @Nullable
        private byte[] data;

        /* renamed from: id, reason: collision with root package name */
        private final String f4988id;

        @Nullable
        private byte[] keySetId;

        @Nullable
        private String mimeType;

        @Nullable
        private List<StreamKey> streamKeys;
        private final Uri uri;

        public Builder(String str, Uri uri) {
            this.f4988id = str;
            this.uri = uri;
        }

        public DownloadRequest build() {
            String str = this.f4988id;
            Uri uri = this.uri;
            String str2 = this.mimeType;
            List list = this.streamKeys;
            if (list == null) {
                list = ImmutableList.of();
            }
            return new DownloadRequest(str, uri, str2, list, this.keySetId, this.customCacheKey, this.data, this.byteRange);
        }

        @uo.a
        public Builder setByteRange(long j11, long j12) {
            this.byteRange = new ByteRange(j11, j12);
            return this;
        }

        @uo.a
        public Builder setCustomCacheKey(@Nullable String str) {
            this.customCacheKey = str;
            return this;
        }

        @uo.a
        public Builder setData(@Nullable byte[] bArr) {
            this.data = bArr;
            return this;
        }

        @uo.a
        public Builder setKeySetId(@Nullable byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        @uo.a
        public Builder setMimeType(@Nullable String str) {
            this.mimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        @uo.a
        public Builder setStreamKeys(@Nullable List<StreamKey> list) {
            this.streamKeys = list;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data, this.byteRange);
    }

    public DownloadRequest copyWithKeySetId(@Nullable byte[] bArr) {
        return new DownloadRequest(this.f4987id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data, this.byteRange);
    }

    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        List list;
        Assertions.checkArgument(this.f4987id.equals(downloadRequest.f4987id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            list = new ArrayList(this.streamKeys);
            for (int i11 = 0; i11 < downloadRequest.streamKeys.size(); i11++) {
                StreamKey streamKey = downloadRequest.streamKeys.get(i11);
                if (!list.contains(streamKey)) {
                    list.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f4987id, downloadRequest.uri, downloadRequest.mimeType, list, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data, downloadRequest.byteRange);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f4987id.equals(downloadRequest.f4987id) && this.uri.equals(downloadRequest.uri) && Objects.equals(this.mimeType, downloadRequest.mimeType) && this.streamKeys.equals(downloadRequest.streamKeys) && Arrays.equals(this.keySetId, downloadRequest.keySetId) && Objects.equals(this.customCacheKey, downloadRequest.customCacheKey) && Arrays.equals(this.data, downloadRequest.data) && Objects.equals(this.byteRange, downloadRequest.byteRange);
    }

    public int hashCode() {
        int hashCode = ((this.f4987id.hashCode() * 961) + this.uri.hashCode()) * 31;
        String str = this.mimeType;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.streamKeys.hashCode()) * 31) + Arrays.hashCode(this.keySetId)) * 31;
        String str2 = this.customCacheKey;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.data)) * 31;
        ByteRange byteRange = this.byteRange;
        return hashCode3 + (byteRange != null ? byteRange.hashCode() : 0);
    }

    public MediaItem toMediaItem() {
        return new MediaItem.Builder().setMediaId(this.f4987id).setUri(this.uri).setCustomCacheKey(this.customCacheKey).setMimeType(this.mimeType).setStreamKeys(this.streamKeys).build();
    }

    public String toString() {
        return this.mimeType + ":" + this.f4987id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f4987id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i12 = 0; i12 < this.streamKeys.size(); i12++) {
            parcel.writeParcelable(this.streamKeys.get(i12), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
        parcel.writeParcelable(this.byteRange, 0);
    }

    private DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2, @Nullable ByteRange byteRange) {
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(uri, str2);
        if (inferContentTypeForUriAndMimeType == 0 || inferContentTypeForUriAndMimeType == 2 || inferContentTypeForUriAndMimeType == 1) {
            Assertions.checkArgument(str3 == null, "customCacheKey must be null for type: " + inferContentTypeForUriAndMimeType);
            this.byteRange = null;
        } else {
            this.byteRange = byteRange;
        }
        this.f4987id = str;
        this.uri = uri;
        this.mimeType = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : Util.EMPTY_BYTE_ARRAY;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new Parcelable.Creator<ByteRange>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.ByteRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ByteRange[] newArray(int i11) {
                return new ByteRange[i11];
            }
        };
        public final long length;
        public final long offset;

        public ByteRange(long j11, long j12) {
            Assertions.checkArgument(j11 >= 0);
            Assertions.checkArgument(j12 >= 0 || j12 == -1);
            this.offset = j11;
            this.length = j12;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.offset == byteRange.offset && this.length == byteRange.length;
        }

        public int hashCode() {
            return (((int) this.offset) * 961) + ((int) this.length);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.offset);
            parcel.writeLong(this.length);
        }

        public ByteRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    public DownloadRequest(Parcel parcel) {
        this.f4987id = (String) Util.castNonNull(parcel.readString());
        this.uri = Uri.parse((String) Util.castNonNull(parcel.readString()));
        this.mimeType = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
        this.byteRange = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
    }
}

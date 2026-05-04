package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import ho.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ro.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final byte AUXILIARY_TRACKS_SAMPLES_INTERLEAVED = 1;
    public static final byte AUXILIARY_TRACKS_SAMPLES_NOT_INTERLEAVED = 0;
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final String KEY_AUXILIARY_TRACKS_INTERLEAVED = "auxiliary.tracks.interleaved";
    public static final String KEY_AUXILIARY_TRACKS_LENGTH = "auxiliary.tracks.length";
    public static final String KEY_AUXILIARY_TRACKS_MAP = "auxiliary.tracks.map";
    public static final String KEY_AUXILIARY_TRACKS_OFFSET = "auxiliary.tracks.offset";
    public static final int TYPE_INDICATOR_8_BIT_UNSIGNED_INT = 75;
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_RESERVED = 0;
    public static final int TYPE_INDICATOR_STRING = 1;
    public static final int TYPE_INDICATOR_UNSIGNED_INT64 = 78;
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(String str, byte[] bArr, int i11) {
        this(str, bArr, 0, i11);
    }

    private static String getFormattedValueForAuxiliaryTracksMap(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        a0.o(',').f(sb2, list);
        return sb2.toString();
    }

    private static void validateData(String str, byte[] bArr, int i11) {
        boolean z11;
        byte b11;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b11 = bArr[0]) == 0 || b11 == 1)) {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                break;
            case "auxiliary.tracks.map":
                Assertions.checkArgument(i11 == 0);
                break;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getAuxiliaryTrackTypesFromMap() {
        Assertions.checkState(this.key.equals(KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte b11 = this.value[1];
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < b11; i11++) {
            arrayList.add(Integer.valueOf(this.value[i11 + 2]));
        }
        return arrayList;
    }

    public int hashCode() {
        return ((((((527 + this.key.hashCode()) * 31) + Arrays.hashCode(this.value)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    public String toString() {
        String formattedValueForAuxiliaryTracksMap;
        int i11 = this.typeIndicator;
        if (i11 == 0) {
            if (this.key.equals(KEY_AUXILIARY_TRACKS_MAP)) {
                formattedValueForAuxiliaryTracksMap = getFormattedValueForAuxiliaryTracksMap(getAuxiliaryTrackTypesFromMap());
            }
            formattedValueForAuxiliaryTracksMap = Util.toHexString(this.value);
        } else if (i11 == 1) {
            formattedValueForAuxiliaryTracksMap = Util.fromUtf8Bytes(this.value);
        } else if (i11 == 23) {
            formattedValueForAuxiliaryTracksMap = String.valueOf(Float.intBitsToFloat(i.k(this.value)));
        } else if (i11 == 67) {
            formattedValueForAuxiliaryTracksMap = String.valueOf(i.k(this.value));
        } else if (i11 != 75) {
            if (i11 == 78) {
                formattedValueForAuxiliaryTracksMap = String.valueOf(new ParsableByteArray(this.value).readUnsignedLongToLong());
            }
            formattedValueForAuxiliaryTracksMap = Util.toHexString(this.value);
        } else {
            formattedValueForAuxiliaryTracksMap = String.valueOf(a.a(this.value[0]));
        }
        return "mdta: key=" + this.key + ", value=" + formattedValueForAuxiliaryTracksMap;
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i11, int i12) {
        validateData(str, bArr, i12);
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i11;
        this.typeIndicator = i12;
    }
}

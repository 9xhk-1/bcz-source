package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final List<Format> closedCaptionFormats;
    private final int flags;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        return new SeiReader(getClosedCaptionFormats(esInfo), MimeTypes.VIDEO_MP2T);
    }

    private UserDataReader buildUserDataReader(TsPayloadReader.EsInfo esInfo) {
        return new UserDataReader(getClosedCaptionFormats(esInfo), MimeTypes.VIDEO_MP2T);
    }

    private List<Format> getClosedCaptionFormats(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i11;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        List<Format> list = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (readUnsignedByte == 134) {
                list = new ArrayList<>();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i12 = 0; i12 < readUnsignedByte2; i12++) {
                    String readString = parsableByteArray.readString(3);
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z11 = (readUnsignedByte3 & 128) != 0;
                    if (z11) {
                        i11 = readUnsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i11 = 1;
                    }
                    byte readUnsignedByte4 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    list.add(new Format.Builder().setSampleMimeType(str).setLanguage(readString).setAccessibilityChannel(i11).setInitializationData(z11 ? CodecSpecificDataUtil.buildCea708InitializationData((readUnsignedByte4 & 64) != 0) : null).build());
                }
            }
            parsableByteArray.setPosition(position);
        }
        return list;
    }

    private boolean isSet(int i11) {
        return (i11 & this.flags) != 0;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    public SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.extractor.ts.TsPayloadReader createPayloadReader(int r6, androidx.media3.extractor.ts.TsPayloadReader.EsInfo r7) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory.createPayloadReader(int, androidx.media3.extractor.ts.TsPayloadReader$EsInfo):androidx.media3.extractor.ts.TsPayloadReader");
    }

    public DefaultTsPayloadReaderFactory(int i11) {
        this(i11, ImmutableList.of());
    }

    public DefaultTsPayloadReaderFactory(int i11, List<Format> list) {
        this.flags = i11;
        this.closedCaptionFormats = list;
    }
}

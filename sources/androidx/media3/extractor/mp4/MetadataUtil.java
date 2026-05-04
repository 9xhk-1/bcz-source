package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    private static final String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    private MetadataUtil() {
    }

    @Nullable
    public static MdtaMetadataEntry findMdtaMetadataEntryWithKey(Metadata metadata, String str) {
        for (int i11 = 0; i11 < metadata.length(); i11++) {
            Metadata.Entry entry = metadata.get(i11);
            if (entry instanceof MdtaMetadataEntry) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                if (mdtaMetadataEntry.key.equals(str)) {
                    return mdtaMetadataEntry;
                }
            }
        }
        return null;
    }

    @Nullable
    private static CommentFrame parseCommentAttribute(int i11, ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString(readInt - 16);
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, readNullTerminatedString, readNullTerminatedString);
        }
        Log.w(TAG, "Failed to parse comment attribute: " + Mp4Box.getBoxTypeString(i11));
        return null;
    }

    @Nullable
    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w(TAG, "Failed to parse cover art attribute");
            return null;
        }
        int parseFullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        String str = parseFullBoxFlags == 13 ? "image/jpeg" : parseFullBoxFlags == 14 ? MimeTypes.IMAGE_PNG : null;
        if (str == null) {
            Log.w(TAG, "Unrecognized cover art flags: " + parseFullBoxFlags);
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i11 = readInt - 16;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition() + parsableByteArray.readInt();
        int readInt = parsableByteArray.readInt();
        int i11 = (readInt >> 24) & 255;
        try {
            if (i11 == 169 || i11 == 253) {
                int i12 = 16777215 & readInt;
                if (i12 == SHORT_TYPE_COMMENT) {
                    return parseCommentAttribute(readInt, parsableByteArray);
                }
                if (i12 == SHORT_TYPE_NAME_1 || i12 == SHORT_TYPE_NAME_2) {
                    return parseTextAttribute(readInt, "TIT2", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_COMPOSER_1 || i12 == SHORT_TYPE_COMPOSER_2) {
                    return parseTextAttribute(readInt, "TCOM", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_YEAR) {
                    return parseTextAttribute(readInt, "TDRC", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_ARTIST) {
                    return parseTextAttribute(readInt, "TPE1", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_ENCODER) {
                    return parseTextAttribute(readInt, "TSSE", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_ALBUM) {
                    return parseTextAttribute(readInt, "TALB", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_LYRICS) {
                    return parseTextAttribute(readInt, "USLT", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_GENRE) {
                    return parseTextAttribute(readInt, "TCON", parsableByteArray);
                }
                if (i12 == TYPE_GROUPING) {
                    return parseTextAttribute(readInt, "TIT1", parsableByteArray);
                }
            } else {
                if (readInt == TYPE_GENRE) {
                    return parseStandardGenreAttribute(parsableByteArray);
                }
                if (readInt == TYPE_DISK_NUMBER) {
                    return parseIndexAndCountAttribute(readInt, "TPOS", parsableByteArray);
                }
                if (readInt == TYPE_TRACK_NUMBER) {
                    return parseIndexAndCountAttribute(readInt, "TRCK", parsableByteArray);
                }
                if (readInt == TYPE_TEMPO) {
                    return parseIntegerAttribute(readInt, "TBPM", parsableByteArray, true, false);
                }
                if (readInt == TYPE_COMPILATION) {
                    return parseIntegerAttribute(readInt, "TCMP", parsableByteArray, true, true);
                }
                if (readInt == TYPE_COVER_ART) {
                    return parseCoverArt(parsableByteArray);
                }
                if (readInt == TYPE_ALBUM_ARTIST) {
                    return parseTextAttribute(readInt, "TPE2", parsableByteArray);
                }
                if (readInt == TYPE_SORT_TRACK_NAME) {
                    return parseTextAttribute(readInt, "TSOT", parsableByteArray);
                }
                if (readInt == TYPE_SORT_ALBUM) {
                    return parseTextAttribute(readInt, "TSOA", parsableByteArray);
                }
                if (readInt == TYPE_SORT_ARTIST) {
                    return parseTextAttribute(readInt, "TSOP", parsableByteArray);
                }
                if (readInt == TYPE_SORT_ALBUM_ARTIST) {
                    return parseTextAttribute(readInt, "TSO2", parsableByteArray);
                }
                if (readInt == TYPE_SORT_COMPOSER) {
                    return parseTextAttribute(readInt, "TSOC", parsableByteArray);
                }
                if (readInt == TYPE_RATING) {
                    return parseIntegerAttribute(readInt, "ITUNESADVISORY", parsableByteArray, false, false);
                }
                if (readInt == TYPE_GAPLESS_ALBUM) {
                    return parseIntegerAttribute(readInt, "ITUNESGAPLESS", parsableByteArray, false, true);
                }
                if (readInt == TYPE_TV_SORT_SHOW) {
                    return parseTextAttribute(readInt, "TVSHOWSORT", parsableByteArray);
                }
                if (readInt == TYPE_TV_SHOW) {
                    return parseTextAttribute(readInt, "TVSHOW", parsableByteArray);
                }
                if (readInt == TYPE_INTERNAL) {
                    return parseInternalAttribute(parsableByteArray, position);
                }
            }
            Log.d(TAG, "Skipped unknown metadata entry: " + Mp4Box.getBoxTypeString(readInt));
            parsableByteArray.setPosition(position);
            return null;
        } finally {
            parsableByteArray.setPosition(position);
        }
    }

    @Nullable
    private static TextInformationFrame parseIndexAndCountAttribute(int i11, String str, ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && readInt >= 22) {
            parsableByteArray.skipBytes(10);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            if (readUnsignedShort > 0) {
                String str2 = "" + readUnsignedShort;
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    str2 = str2 + "/" + readUnsignedShort2;
                }
                return new TextInformationFrame(str, (String) null, ImmutableList.of(str2));
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: " + Mp4Box.getBoxTypeString(i11));
        return null;
    }

    @Nullable
    private static Id3Frame parseIntegerAttribute(int i11, String str, ParsableByteArray parsableByteArray, boolean z11, boolean z12) {
        int parseIntegerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z12) {
            parseIntegerAttribute = Math.min(1, parseIntegerAttribute);
        }
        if (parseIntegerAttribute >= 0) {
            return z11 ? new TextInformationFrame(str, (String) null, ImmutableList.of(Integer.toString(parseIntegerAttribute))) : new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(parseIntegerAttribute));
        }
        Log.w(TAG, "Failed to parse uint8 attribute: " + Mp4Box.getBoxTypeString(i11));
        return null;
    }

    @Nullable
    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i11) {
        String str = null;
        String str2 = null;
        int i12 = -1;
        int i13 = -1;
        while (parsableByteArray.getPosition() < i11) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (readInt2 == 1835360622) {
                str = parsableByteArray.readNullTerminatedString(readInt - 12);
            } else if (readInt2 == 1851878757) {
                str2 = parsableByteArray.readNullTerminatedString(readInt - 12);
            } else {
                if (readInt2 == 1684108385) {
                    i12 = position;
                    i13 = readInt;
                }
                parsableByteArray.skipBytes(readInt - 12);
            }
        }
        if (str == null || str2 == null || i12 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i12);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(str, str2, parsableByteArray.readNullTerminatedString(i13 - 16));
    }

    @Nullable
    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ParsableByteArray parsableByteArray, int i11, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i11) {
                return null;
            }
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int readInt2 = parsableByteArray.readInt();
                int readInt3 = parsableByteArray.readInt();
                int i12 = readInt - 16;
                byte[] bArr = new byte[i12];
                parsableByteArray.readBytes(bArr, 0, i12);
                return new MdtaMetadataEntry(str, bArr, readInt3, readInt2);
            }
            parsableByteArray.setPosition(position + readInt);
        }
    }

    @Nullable
    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String resolveV1Genre = Id3Util.resolveV1Genre(parseIntegerAttribute(parsableByteArray) - 1);
        if (resolveV1Genre != null) {
            return new TextInformationFrame("TCON", (String) null, ImmutableList.of(resolveV1Genre));
        }
        Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    private static TextInformationFrame parseTextAttribute(int i11, String str, ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, (String) null, ImmutableList.of(parsableByteArray.readNullTerminatedString(readInt - 16)));
        }
        Log.w(TAG, "Failed to parse text attribute: " + Mp4Box.getBoxTypeString(i11));
        return null;
    }

    public static void setFormatGaplessInfo(int i11, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i11 == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    public static void setFormatMetadata(int i11, @Nullable Metadata metadata, Format.Builder builder, @Nullable Metadata metadata2, Metadata... metadataArr) {
        if (metadata2 == null) {
            metadata2 = new Metadata(new Metadata.Entry[0]);
        }
        if (metadata != null) {
            for (int i12 = 0; i12 < metadata.length(); i12++) {
                Metadata.Entry entry = metadata.get(i12);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (!mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    } else if (i11 == 2) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.length() > 0) {
            builder.setMetadata(metadata2);
        }
    }

    private static int parseIntegerAttribute(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i11 = readInt - 16;
            if (i11 == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i11 == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i11 != 3) {
                if (i11 == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                    return parsableByteArray.readUnsignedIntToInt();
                }
            } else {
                return parsableByteArray.readUnsignedInt24();
            }
        }
        Log.w(TAG, "Failed to parse data atom to int");
        return -1;
    }
}

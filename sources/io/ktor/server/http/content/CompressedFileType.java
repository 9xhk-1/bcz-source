package io.ktor.server.http.content;

import kotlin.jvm.internal.v;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class CompressedFileType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CompressedFileType[] $VALUES;
    public static final CompressedFileType BROTLI = new CompressedFileType("BROTLI", 0, "br", null, 2, null);
    public static final CompressedFileType GZIP = new CompressedFileType("GZIP", 1, "gz", "gzip");

    @k
    private final String encoding;

    @k
    private final String extension;

    private static final /* synthetic */ CompressedFileType[] $values() {
        return new CompressedFileType[]{BROTLI, GZIP};
    }

    static {
        CompressedFileType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private CompressedFileType(String str, int i11, String str2, String str3) {
        this.extension = str2;
        this.encoding = str3;
    }

    @k
    public static a<CompressedFileType> getEntries() {
        return $ENTRIES;
    }

    public static CompressedFileType valueOf(String str) {
        return (CompressedFileType) Enum.valueOf(CompressedFileType.class, str);
    }

    public static CompressedFileType[] values() {
        return (CompressedFileType[]) $VALUES.clone();
    }

    @k
    public final String getEncoding() {
        return this.encoding;
    }

    @k
    public final String getExtension() {
        return this.extension;
    }

    public /* synthetic */ CompressedFileType(String str, int i11, String str2, String str3, int i12, v vVar) {
        this(str, i11, str2, (i12 & 2) != 0 ? str2 : str3);
    }
}

package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ExtractorUtil {
    private ExtractorUtil() {
    }

    @Pure
    public static void checkContainerInput(boolean z11, @Nullable String str) throws ParserException {
        if (!z11) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        try {
            return extractorInput.peekFully(bArr, i11, i12, z11);
        } catch (EOFException e11) {
            if (z11) {
                return false;
            }
            throw e11;
        }
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        while (i13 < i12) {
            int peek = extractorInput.peek(bArr, i11 + i13, i12 - i13);
            if (peek == -1) {
                break;
            }
            i13 += peek;
        }
        return i13;
    }

    public static boolean readFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i11, int i12) throws IOException {
        try {
            extractorInput.readFully(bArr, i11, i12);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput extractorInput, int i11) throws IOException {
        try {
            extractorInput.skipFully(i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

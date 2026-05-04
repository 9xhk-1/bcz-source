package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    private static final Set<String> SAMSUNG_DEVICES = new HashSet(Arrays.asList("A24"));

    private boolean canParseSosMarker(@NonNull byte[] bArr) {
        byte b11;
        int i11 = 2;
        while (i11 + 4 <= bArr.length && (b11 = bArr[i11]) == -1) {
            if (b11 == -1 && bArr[i11 + 1] == -38) {
                return true;
            }
            i11 += (((bArr[i11 + 2] & 255) << 8) | (bArr[i11 + 3] & 255)) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(@NonNull byte[] bArr) {
        int i11 = 2;
        while (true) {
            int i12 = i11 + 1;
            if (i12 > bArr.length) {
                return -1;
            }
            if (bArr[i11] == -1 && bArr[i12] == -40) {
                return i11;
            }
            i11 = i12;
        }
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DEVICES.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean load() {
        return isSamsungProblematicDevice();
    }

    @NonNull
    public byte[] jpegImageToJpegByteArray(@NonNull ImageProxy imageProxy) {
        int i11 = 0;
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return (canParseSosMarker(bArr) || (i11 = findSecondFfd8Position(bArr)) != -1) ? Arrays.copyOfRange(bArr, i11, buffer.limit()) : bArr;
    }
}

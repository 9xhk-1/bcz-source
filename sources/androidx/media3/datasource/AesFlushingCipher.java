package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i11, byte[] bArr, @Nullable String str, long j11) {
        this(i11, bArr, getFNV64Hash(str), j11);
    }

    private static long getFNV64Hash(@Nullable String str) {
        long j11 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            long charAt = j11 ^ str.charAt(i11);
            j11 = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j11;
    }

    private byte[] getInitializationVector(long j11, long j12) {
        return ByteBuffer.allocate(16).putLong(j11).putLong(j12).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        try {
            return this.cipher.update(bArr, i11, i12, bArr2, i13);
        } catch (ShortBufferException e11) {
            throw new RuntimeException(e11);
        }
    }

    public void update(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = i11;
        int i15 = i12;
        int i16 = i13;
        do {
            int i17 = this.pendingXorBytes;
            if (i17 <= 0) {
                int nonFlushingUpdate = nonFlushingUpdate(bArr, i14, i15, bArr2, i16);
                if (i15 == nonFlushingUpdate) {
                    return;
                }
                int i18 = i15 - nonFlushingUpdate;
                int i19 = 0;
                Assertions.checkState(i18 < this.blockSize);
                int i21 = i16 + nonFlushingUpdate;
                int i22 = this.blockSize - i18;
                this.pendingXorBytes = i22;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i22, this.flushedBlock, 0) == this.blockSize);
                while (i19 < i18) {
                    bArr2[i21] = this.flushedBlock[i19];
                    i19++;
                    i21++;
                }
                return;
            }
            bArr2[i16] = (byte) (bArr[i14] ^ this.flushedBlock[this.blockSize - i17]);
            i16++;
            i14++;
            this.pendingXorBytes = i17 - 1;
            i15--;
        } while (i15 != 0);
    }

    public void updateInPlace(byte[] bArr, int i11, int i12) {
        update(bArr, i11, i12, bArr, i11);
    }

    public AesFlushingCipher(int i11, byte[] bArr, long j11, long j12) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j13 = j12 / blockSize;
            int i12 = (int) (j12 % blockSize);
            cipher.init(i11, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j11, j13)));
            if (i12 != 0) {
                updateInPlace(new byte[i12], 0, i12);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }
}

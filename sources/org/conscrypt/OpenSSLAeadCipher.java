package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import org.conscrypt.OpenSSLCipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class OpenSSLAeadCipher extends OpenSSLCipher {
    static final int DEFAULT_TAG_SIZE_BITS = 128;
    private static final boolean ENABLE_BYTEBUFFER_OPTIMIZATIONS = true;
    private static int lastGlobalMessageSize = 32;
    private byte[] aad;
    byte[] buf;
    int bufCount;
    long evpAead;
    private boolean mustInitialize;
    private byte[] previousIv;
    private byte[] previousKey;
    int tagLengthInBytes;

    public OpenSSLAeadCipher(OpenSSLCipher.Mode mode) {
        super(mode, OpenSSLCipher.Padding.NOPADDING);
    }

    private boolean arraysAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i11 |= bArr[i12] ^ bArr2[i12];
        }
        return i11 == 0;
    }

    private void checkInitialization() {
        if (this.mustInitialize) {
            throw new IllegalStateException("Cannot re-use same key and IV for multiple encryptions");
        }
    }

    private void expand(int i11) {
        int i12 = this.bufCount;
        int i13 = i12 + i11;
        byte[] bArr = this.buf;
        if (i13 <= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[(i11 + i12) * 2];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        this.buf = bArr2;
    }

    private void reset() {
        this.aad = null;
        int i11 = lastGlobalMessageSize;
        byte[] bArr = this.buf;
        if (bArr == null) {
            this.buf = new byte[i11];
        } else {
            int i12 = this.bufCount;
            if (i12 > 0 && i12 != i11) {
                lastGlobalMessageSize = i12;
                if (bArr.length != i12) {
                    this.buf = new byte[i12];
                }
            }
        }
        this.bufCount = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void throwAEADBadTagExceptionIfAvailable(java.lang.String r3, java.lang.Throwable r4) throws javax.crypto.BadPaddingException {
        /*
            r2 = this;
            java.lang.String r0 = "javax.crypto.AEADBadTagException"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L38
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L38
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Exception -> L38
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L33
            java.lang.Object r3 = r0.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L33
            javax.crypto.BadPaddingException r3 = (javax.crypto.BadPaddingException) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L33
            r3.initCause(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L21
            goto L34
        L1f:
            r3 = move-exception
            goto L23
        L21:
            r1 = r3
            goto L33
        L23:
            javax.crypto.BadPaddingException r4 = new javax.crypto.BadPaddingException
            r4.<init>()
            java.lang.Throwable r3 = r3.getTargetException()
            java.lang.Throwable r3 = r4.initCause(r3)
            javax.crypto.BadPaddingException r3 = (javax.crypto.BadPaddingException) r3
            throw r3
        L33:
            r3 = r1
        L34:
            if (r3 != 0) goto L37
            goto L38
        L37:
            throw r3
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.conscrypt.OpenSSLAeadCipher.throwAEADBadTagExceptionIfAvailable(java.lang.String, java.lang.Throwable):void");
    }

    public boolean allowsNonceReuse() {
        return false;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding for AEAD ciphers");
        }
    }

    public void checkSupportedTagLength(int i11) throws InvalidAlgorithmParameterException {
        if (i11 % 8 == 0) {
            return;
        }
        throw new InvalidAlgorithmParameterException("Tag length must be a multiple of 8; was " + i11);
    }

    public int doFinalInternal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        checkInitialization();
        try {
            int EVP_AEAD_CTX_seal_buf = isEncrypting() ? NativeCrypto.EVP_AEAD_CTX_seal_buf(this.evpAead, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.f77776iv, byteBuffer, this.aad) : NativeCrypto.EVP_AEAD_CTX_open_buf(this.evpAead, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.f77776iv, byteBuffer, this.aad);
            if (isEncrypting()) {
                this.mustInitialize = true;
            }
            return EVP_AEAD_CTX_seal_buf;
        } catch (BadPaddingException e11) {
            throwAEADBadTagExceptionIfAvailable(e11.getMessage(), e11.getCause());
            throw e11;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new NullPointerException("Null ByteBuffer Error");
        }
        if (getOutputSizeForFinal(byteBuffer.remaining()) > byteBuffer2.remaining()) {
            throw new ShortBufferWithoutStackTraceException("Insufficient Bytes for Output Buffer");
        }
        if (byteBuffer2.isReadOnly()) {
            throw new IllegalArgumentException("Cannot write to Read Only ByteBuffer");
        }
        if (this.bufCount != 0) {
            return super.engineDoFinal(byteBuffer, byteBuffer2);
        }
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            allocateDirect.mark();
            allocateDirect.put(byteBuffer);
            allocateDirect.reset();
            byteBuffer = allocateDirect;
        }
        if (byteBuffer2.isDirect()) {
            int doFinalInternal = doFinalInternal(byteBuffer, byteBuffer2);
            byteBuffer2.position(byteBuffer2.position() + doFinalInternal);
            byteBuffer.position(byteBuffer.limit());
            return doFinalInternal;
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(getOutputSizeForFinal(byteBuffer.remaining()));
        int doFinalInternal2 = doFinalInternal(byteBuffer, allocateDirect2);
        byteBuffer2.put(allocateDirect2);
        byteBuffer.position(byteBuffer.limit());
        return doFinalInternal2;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = null;
        int i11 = 128;
        if (algorithmParameterSpec != null) {
            GCMParameters fromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
            if (fromGCMParameterSpec != null) {
                bArr2 = fromGCMParameterSpec.getIV();
                i11 = fromGCMParameterSpec.getTLen();
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                bArr2 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            }
        }
        checkSupportedTagLength(i11);
        this.tagLengthInBytes = i11 / 8;
        boolean isEncrypting = isEncrypting();
        long evp_aead = getEVP_AEAD(bArr.length);
        this.evpAead = evp_aead;
        int EVP_AEAD_nonce_length = NativeCrypto.EVP_AEAD_nonce_length(evp_aead);
        if (bArr2 != null || EVP_AEAD_nonce_length == 0) {
            if (EVP_AEAD_nonce_length == 0 && bArr2 != null) {
                throw new InvalidAlgorithmParameterException("IV not used in " + this.mode + " mode");
            }
            if (bArr2 != null && bArr2.length != EVP_AEAD_nonce_length) {
                throw new InvalidAlgorithmParameterException("Expected IV length of " + EVP_AEAD_nonce_length + " but was " + bArr2.length);
            }
        } else {
            if (!isEncrypting) {
                throw new InvalidAlgorithmParameterException("IV must be specified in " + this.mode + " mode");
            }
            bArr2 = new byte[EVP_AEAD_nonce_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(bArr2);
            } else {
                NativeCrypto.RAND_bytes(bArr2);
            }
        }
        if (isEncrypting() && bArr2 != null && !allowsNonceReuse()) {
            byte[] bArr3 = this.previousKey;
            if (bArr3 != null && this.previousIv != null && arraysAreEqual(bArr3, bArr) && arraysAreEqual(this.previousIv, bArr2)) {
                this.mustInitialize = true;
                throw new InvalidAlgorithmParameterException("When using AEAD key and IV must not be re-used");
            }
            this.previousKey = bArr;
            this.previousIv = bArr2;
        }
        this.mustInitialize = false;
        this.f77776iv = bArr2;
        reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(byte[] bArr, int i11, int i12) {
        checkInitialization();
        byte[] bArr2 = this.aad;
        if (bArr2 == null) {
            this.aad = Arrays.copyOfRange(bArr, i11, i12 + i11);
            return;
        }
        byte[] bArr3 = new byte[bArr2.length + i12];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i11, bArr3, this.aad.length, i12);
        this.aad = bArr3;
    }

    public abstract long getEVP_AEAD(int i11) throws InvalidKeyException;

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i11) {
        return this.bufCount + i11 + (isEncrypting() ? NativeCrypto.EVP_AEAD_max_overhead(this.evpAead) : 0);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i11) {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) throws ShortBufferException {
        checkInitialization();
        if (this.buf == null) {
            throw new IllegalStateException("Cipher not initialized");
        }
        ArrayUtils.checkOffsetAndCount(bArr.length, i11, i12);
        if (i12 <= 0) {
            return 0;
        }
        expand(i12);
        System.arraycopy(bArr, i11, this.buf, this.bufCount, i12);
        this.bufCount += i12;
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int doFinalInternal(byte[] bArr, int i11, int i12) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        int EVP_AEAD_CTX_open;
        checkInitialization();
        try {
            if (isEncrypting()) {
                EVP_AEAD_CTX_open = NativeCrypto.EVP_AEAD_CTX_seal(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr, i11, this.f77776iv, this.buf, 0, this.bufCount, this.aad);
            } else {
                EVP_AEAD_CTX_open = NativeCrypto.EVP_AEAD_CTX_open(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr, i11, this.f77776iv, this.buf, 0, this.bufCount, this.aad);
            }
            if (isEncrypting()) {
                this.mustInitialize = true;
            }
            reset();
            return EVP_AEAD_CTX_open;
        } catch (BadPaddingException e11) {
            throwAEADBadTagExceptionIfAvailable(e11.getMessage(), e11.getCause());
            throw e11;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        checkInitialization();
        byte[] bArr = this.aad;
        if (bArr == null) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            this.aad = bArr2;
            byteBuffer.get(bArr2);
        } else {
            byte[] bArr3 = new byte[bArr.length + byteBuffer.remaining()];
            byte[] bArr4 = this.aad;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            byteBuffer.get(bArr3, this.aad.length, byteBuffer.remaining());
            this.aad = bArr3;
        }
    }

    @Override // org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        if (bArr2 != null && getOutputSizeForFinal(i12) > bArr2.length - i13) {
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        return super.engineDoFinal(bArr, i11, i12, bArr2, i13);
    }
}

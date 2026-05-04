package org.conscrypt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
abstract class NativeRef {
    final long address;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EC_GROUP extends NativeRef {
        public EC_GROUP(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.EC_GROUP_clear_free(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EC_POINT extends NativeRef {
        public EC_POINT(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.EC_POINT_clear_free(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EVP_CIPHER_CTX extends NativeRef {
        public EVP_CIPHER_CTX(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.EVP_CIPHER_CTX_free(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EVP_MD_CTX extends NativeRef {
        public EVP_MD_CTX(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.EVP_MD_CTX_destroy(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EVP_PKEY extends NativeRef {
        public EVP_PKEY(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.EVP_PKEY_free(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EVP_PKEY_CTX extends NativeRef {
        public EVP_PKEY_CTX(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.EVP_PKEY_CTX_free(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HMAC_CTX extends NativeRef {
        public HMAC_CTX(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.HMAC_CTX_free(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SSL_SESSION extends NativeRef {
        public SSL_SESSION(long j11) {
            super(j11);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j11) {
            NativeCrypto.SSL_SESSION_free(j11);
        }
    }

    public NativeRef(long j11) {
        if (j11 == 0) {
            throw new NullPointerException("address == 0");
        }
        this.address = j11;
    }

    public abstract void doFree(long j11);

    public boolean equals(Object obj) {
        return (obj instanceof NativeRef) && ((NativeRef) obj).address == this.address;
    }

    public void finalize() throws Throwable {
        try {
            long j11 = this.address;
            if (j11 != 0) {
                doFree(j11);
            }
        } finally {
            super.finalize();
        }
    }

    public int hashCode() {
        long j11 = this.address;
        return (int) (j11 ^ (j11 >>> 32));
    }
}

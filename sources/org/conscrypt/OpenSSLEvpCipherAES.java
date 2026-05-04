package org.conscrypt;

import com.xiaomi.mipush.sdk.Constants;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;
import org.conscrypt.OpenSSLCipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class OpenSSLEvpCipherAES extends OpenSSLEvpCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: org.conscrypt.OpenSSLEvpCipherAES$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Mode;
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Padding;

        static {
            int[] iArr = new int[OpenSSLCipher.Padding.values().length];
            $SwitchMap$org$conscrypt$OpenSSLCipher$Padding = iArr;
            try {
                iArr[OpenSSLCipher.Padding.NOPADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Padding[OpenSSLCipher.Padding.PKCS5PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OpenSSLCipher.Mode.values().length];
            $SwitchMap$org$conscrypt$OpenSSLCipher$Mode = iArr2;
            try {
                iArr2[OpenSSLCipher.Mode.CBC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Mode[OpenSSLCipher.Mode.CTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Mode[OpenSSLCipher.Mode.ECB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AES extends OpenSSLEvpCipherAES {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class CBC extends AES {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class NoPadding extends CBC {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class PKCS5Padding extends CBC {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public CBC(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.CBC, padding);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class CTR extends AES {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ECB extends AES {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedKeySize(int i11) throws InvalidKeyException {
            if (i11 == 16 || i11 == 24 || i11 == 32) {
                return;
            }
            throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AES_128 extends OpenSSLEvpCipherAES {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class CBC extends AES_128 {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class NoPadding extends CBC {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class PKCS5Padding extends CBC {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public CBC(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.CBC, padding);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class CTR extends AES_128 {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ECB extends AES_128 {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES_128(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedKeySize(int i11) throws InvalidKeyException {
            if (i11 == 16) {
                return;
            }
            throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AES_256 extends OpenSSLEvpCipherAES {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class CBC extends AES_256 {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class NoPadding extends CBC {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class PKCS5Padding extends CBC {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public CBC(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.CBC, padding);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class CTR extends AES_256 {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ECB extends AES_256 {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES_256(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedKeySize(int i11) throws InvalidKeyException {
            if (i11 == 32) {
                return;
            }
            throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes");
        }
    }

    public OpenSSLEvpCipherAES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        int i11 = AnonymousClass1.$SwitchMap$org$conscrypt$OpenSSLCipher$Mode[mode.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return;
        }
        throw new NoSuchAlgorithmException("Unsupported mode " + mode.toString());
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        int i11 = AnonymousClass1.$SwitchMap$org$conscrypt$OpenSSLCipher$Padding[padding.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return;
        }
        throw new NoSuchPaddingException("Unsupported padding " + padding.toString());
    }

    @Override // org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "AES";
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 16;
    }

    @Override // org.conscrypt.OpenSSLEvpCipher
    public String getCipherName(int i11, OpenSSLCipher.Mode mode) {
        return "aes-" + (i11 * 8) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + mode.toString().toLowerCase(Locale.US);
    }
}

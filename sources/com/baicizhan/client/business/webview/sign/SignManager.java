package com.baicizhan.client.business.webview.sign;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Base64;
import com.baicizhan.client.business.util.FileUtils;
import java.io.DataInputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SignManager {
    private static final String RSA_ALGORITHM = "RSA";
    private static final String RSA_ECB_PKCS1PADDING_ALGORITHM = "RSA/ECB/PKCS1Padding";
    public static final String TAG = "SignManager";
    private static final String WEBVIEW_RSA_PUBLIC_KEY_ASSET_PATH = "sign/webview_rsa_public.der";
    private static SignManager sInstance;
    private volatile PublicKey webviewRSAPublicKey;

    private SignManager() {
    }

    public static SignManager getInstance() {
        if (sInstance == null) {
            synchronized (SignManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SignManager();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    public byte[] decryptByWebviewRSAPublicKey(String base64Encrypt) {
        return decryptByWebviewRSAPublicKey(Base64.decode(base64Encrypt, 0));
    }

    public c<Boolean> rxInit(final Context context) {
        return c.z2(new Callable<Boolean>() { // from class: com.baicizhan.client.business.webview.sign.SignManager.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                DataInputStream dataInputStream;
                if (SignManager.this.webviewRSAPublicKey != null) {
                    return Boolean.TRUE;
                }
                AssetManager assets = context.getAssets();
                InputStream inputStream = null;
                try {
                    InputStream open = assets.open(SignManager.WEBVIEW_RSA_PUBLIC_KEY_ASSET_PATH);
                    try {
                        dataInputStream = new DataInputStream(open);
                        try {
                            byte[] bArr = new byte[(int) assets.openFd(SignManager.WEBVIEW_RSA_PUBLIC_KEY_ASSET_PATH).getLength()];
                            dataInputStream.readFully(bArr);
                            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
                            SignManager.this.webviewRSAPublicKey = KeyFactory.getInstance("RSA").generatePublic(x509EncodedKeySpec);
                            FileUtils.closeQuietly(open);
                            FileUtils.closeQuietly(dataInputStream);
                            return Boolean.TRUE;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = open;
                            FileUtils.closeQuietly(inputStream);
                            FileUtils.closeQuietly(dataInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        dataInputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dataInputStream = null;
                }
            }
        }).w5(bc0.c.e());
    }

    public byte[] decryptByWebviewRSAPublicKey(byte[] encryptData) {
        if (this.webviewRSAPublicKey == null) {
            return encryptData;
        }
        try {
            Cipher cipher = Cipher.getInstance(RSA_ECB_PKCS1PADDING_ALGORITHM);
            cipher.init(2, this.webviewRSAPublicKey);
            return cipher.doFinal(encryptData);
        } catch (Exception e11) {
            e11.printStackTrace();
            qb.c.c(TAG, "decryptByWebviewRSAPublicKey error. ", e11);
            return encryptData;
        }
    }
}

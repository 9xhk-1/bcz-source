package com.getui.gtc.base.crypt;

import android.content.Context;
import com.getui.gtc.base.util.io.IOUtils;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    KeyPair f29789a;

    /* renamed from: b, reason: collision with root package name */
    private b f29790b;

    /* renamed from: c, reason: collision with root package name */
    private File f29791c;

    public c(Context context, KeyPair keyPair) throws NoSuchAlgorithmException {
        this.f29791c = context.getFilesDir();
        this.f29789a = keyPair;
        if (keyPair == null) {
            this.f29790b = new b(context.getPackageName());
        }
    }

    public final SecretKey a(String str) throws InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, NoSuchPaddingException, IOException, InvalidAlgorithmParameterException {
        return a(str, true, this.f29789a);
    }

    public final IvParameterSpec b(String str, boolean z11, KeyPair keyPair) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, IOException, InvalidAlgorithmParameterException {
        byte[] b11;
        File file = new File(this.f29791c, str);
        if (!file.exists() && z11) {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            KeyPair keyPair2 = this.f29789a;
            IOUtils.saveToFile(keyPair2 != null ? CryptTools.encrypt("RSA/ECB/PKCS1Padding", keyPair2.getPublic(), bArr) : this.f29790b.a(bArr), new File(this.f29791c, str));
            return new IvParameterSpec(bArr);
        }
        try {
            byte[] readFile = IOUtils.readFile(file);
            if (keyPair == null && (keyPair = this.f29789a) == null) {
                b11 = this.f29790b.b(readFile);
                return new IvParameterSpec(b11);
            }
            b11 = CryptTools.decrypt("RSA/ECB/PKCS1Padding", keyPair.getPrivate(), readFile);
            return new IvParameterSpec(b11);
        } catch (IOException | InvalidAlgorithmParameterException unused) {
            return null;
        }
    }

    public final SecretKey a(String str, boolean z11, KeyPair keyPair) throws InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, NoSuchPaddingException, IOException, InvalidAlgorithmParameterException {
        byte[] b11;
        File file = new File(this.f29791c, str);
        if (!file.exists() && z11) {
            SecretKey generateKey = CryptTools.generateKey("AES", 128);
            byte[] encoded = generateKey.getEncoded();
            KeyPair keyPair2 = this.f29789a;
            IOUtils.saveToFile(keyPair2 != null ? CryptTools.encrypt("RSA/ECB/PKCS1Padding", keyPair2.getPublic(), encoded) : this.f29790b.a(encoded), new File(this.f29791c, str));
            return generateKey;
        }
        try {
            byte[] readFile = IOUtils.readFile(file);
            if (keyPair == null && (keyPair = this.f29789a) == null) {
                b11 = this.f29790b.b(readFile);
                return CryptTools.wrapperKey("AES", b11);
            }
            b11 = CryptTools.decrypt("RSA/ECB/PKCS1Padding", keyPair.getPrivate(), readFile);
            return CryptTools.wrapperKey("AES", b11);
        } catch (IOException | InvalidAlgorithmParameterException unused) {
            return null;
        }
    }
}

package com.getui.gtc.base.crypt;

import android.content.Context;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public class SecureCryptTools {
    private static final String CIPHER_FLAG_FIRST = "First";
    private static final String CIPHER_FLAG_SECOND = "Second";
    private static final String CIPHER_FLAG_SEPARATOR = "-";
    private static final String CIPHER_FLAG_STARTER = ":::";
    private volatile boolean initInvoked;
    private ReentrantLock lock;
    private d secureKeyStore;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SecureCryptTools f29785a = new SecureCryptTools();
    }

    private SecureCryptTools() {
        this.lock = new ReentrantLock();
        try {
            init(GtcProvider.context());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized byte[] doDecrypt(byte[] bArr) throws CryptException {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        InputStream inputStream4;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        String cipherFlag = getCipherFlag(bArr);
        if (cipherFlag == null) {
            throw new CryptException("Cipher flag not found in cipher text!");
        }
        String[] split = cipherFlag.split("-");
        if (split.length < 2) {
            throw new CryptException("Cipher flag is wrong in cipher text!");
        }
        String str = split[0];
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, (bArr.length - cipherFlag.length()) - 3);
        InputStream inputStream5 = null;
        if (cipherFlag.endsWith(CIPHER_FLAG_FIRST)) {
            try {
                byteArrayInputStream = new ByteArrayInputStream(copyOfRange);
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    inputStream5 = CryptTools.decrypt(rr.a.f84533c, this.secureKeyStore.a(str), this.secureKeyStore.c(str), byteArrayInputStream);
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int read = inputStream5.read(bArr2);
                        if (read == -1) {
                            byteArrayOutputStream2.flush();
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            IOUtils.safeClose(inputStream5);
                            IOUtils.safeClose(byteArrayInputStream);
                            IOUtils.safeClose(byteArrayOutputStream2);
                            return byteArray;
                        }
                        byteArrayOutputStream2.write(bArr2, 0, read);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = byteArrayOutputStream2;
                    inputStream = inputStream5;
                    inputStream5 = byteArrayInputStream;
                    try {
                        throw new CryptException("decrypt failed!", th);
                    } finally {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                inputStream5 = byteArrayInputStream;
                inputStream2 = inputStream;
                throw new CryptException("decrypt failed!", th);
            }
        } else {
            if (!cipherFlag.endsWith(CIPHER_FLAG_SECOND)) {
                throw new CryptException("Cipher flag not found in cipher text!");
            }
            try {
                byteArrayInputStream2 = new ByteArrayInputStream(copyOfRange);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th5) {
                    th = th5;
                    inputStream3 = null;
                    inputStream5 = byteArrayInputStream2;
                    inputStream4 = inputStream3;
                    try {
                        throw new CryptException("decrypt failed!", th);
                    } finally {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                inputStream3 = null;
            }
            try {
                inputStream5 = CryptTools.decrypt(rr.a.f84533c, this.secureKeyStore.b(str), this.secureKeyStore.c(str), byteArrayInputStream2);
                byte[] bArr3 = new byte[256];
                while (true) {
                    int read2 = inputStream5.read(bArr3);
                    if (read2 == -1) {
                        byteArrayOutputStream.flush();
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        IOUtils.safeClose(inputStream5);
                        IOUtils.safeClose(byteArrayInputStream2);
                        IOUtils.safeClose(byteArrayOutputStream);
                        return byteArray2;
                    }
                    byteArrayOutputStream.write(bArr3, 0, read2);
                }
            } catch (Throwable th7) {
                th = th7;
                inputStream4 = byteArrayOutputStream;
                inputStream3 = inputStream5;
                inputStream5 = byteArrayInputStream2;
                throw new CryptException("decrypt failed!", th);
            }
        }
    }

    private byte[] doEncrypt(byte[] bArr) throws CryptException {
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        if (this.secureKeyStore.f29794c != null) {
            try {
                ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        d dVar = this.secureKeyStore;
                        byteArrayOutputStream3 = CryptTools.encrypt(rr.a.f84533c, dVar.a(dVar.f29798g), this.secureKeyStore.b(), byteArrayInputStream3);
                        byte[] bArr2 = new byte[256];
                        while (true) {
                            int read = byteArrayOutputStream3.read(bArr2);
                            if (read == -1) {
                                byteArrayOutputStream.flush();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byte[] bytes = (CIPHER_FLAG_STARTER + this.secureKeyStore.f29798g + "-First").getBytes();
                                int length = bytes.length;
                                byte[] bArr3 = new byte[byteArray.length + length];
                                System.arraycopy(byteArray, 0, bArr3, 0, byteArray.length);
                                System.arraycopy(bytes, 0, bArr3, byteArray.length, length);
                                IOUtils.safeClose(byteArrayOutputStream3);
                                IOUtils.safeClose(byteArrayInputStream3);
                                IOUtils.safeClose(byteArrayOutputStream);
                                return bArr3;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                    } catch (Throwable unused) {
                        InputStream inputStream3 = byteArrayOutputStream3;
                        byteArrayOutputStream3 = byteArrayInputStream3;
                        inputStream2 = inputStream3;
                        try {
                            byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                            try {
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            inputStream2 = CryptTools.encrypt(rr.a.f84533c, this.secureKeyStore.a(), this.secureKeyStore.b(), byteArrayInputStream2);
                            byte[] bArr4 = new byte[256];
                            while (true) {
                                int read2 = inputStream2.read(bArr4);
                                if (read2 == -1) {
                                    byteArrayOutputStream2.flush();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    byte[] bytes2 = (CIPHER_FLAG_STARTER + this.secureKeyStore.f29798g + "-Second").getBytes();
                                    int length2 = bytes2.length;
                                    byte[] bArr5 = new byte[byteArray2.length + length2];
                                    System.arraycopy(byteArray2, 0, bArr5, 0, byteArray2.length);
                                    System.arraycopy(bytes2, 0, bArr5, byteArray2.length, length2);
                                    IOUtils.safeClose(inputStream2);
                                    IOUtils.safeClose(byteArrayInputStream2);
                                    IOUtils.safeClose(byteArrayOutputStream2);
                                    return bArr5;
                                }
                                byteArrayOutputStream2.write(bArr4, 0, read2);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            byteArrayOutputStream3 = byteArrayInputStream2;
                            try {
                                throw new CryptException("encrypt failed", th);
                            } catch (Throwable th5) {
                                IOUtils.safeClose(inputStream2);
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable unused2) {
                    byteArrayOutputStream = null;
                    byteArrayOutputStream3 = byteArrayInputStream3;
                    inputStream2 = null;
                }
            } catch (Throwable unused3) {
                inputStream2 = null;
                byteArrayOutputStream = null;
            }
        } else {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                byteArrayOutputStream3 = CryptTools.encrypt(rr.a.f84533c, this.secureKeyStore.a(), this.secureKeyStore.b(), byteArrayInputStream);
                byte[] bArr6 = new byte[256];
                while (true) {
                    int read3 = byteArrayOutputStream3.read(bArr6);
                    if (read3 == -1) {
                        byteArrayOutputStream4.flush();
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byte[] bytes3 = (CIPHER_FLAG_STARTER + this.secureKeyStore.f29798g + "-Second").getBytes();
                        int length3 = bytes3.length;
                        byte[] bArr7 = new byte[byteArray3.length + length3];
                        System.arraycopy(byteArray3, 0, bArr7, 0, byteArray3.length);
                        System.arraycopy(bytes3, 0, bArr7, byteArray3.length, length3);
                        IOUtils.safeClose(byteArrayOutputStream3);
                        IOUtils.safeClose(byteArrayInputStream);
                        return bArr7;
                    }
                    byteArrayOutputStream4.write(bArr6, 0, read3);
                }
            } catch (Throwable th7) {
                th = th7;
                InputStream inputStream4 = byteArrayOutputStream3;
                byteArrayOutputStream3 = byteArrayInputStream;
                inputStream = inputStream4;
                try {
                    throw new CryptException("encrypt failed", th);
                } finally {
                    IOUtils.safeClose(inputStream);
                    IOUtils.safeClose(byteArrayOutputStream3);
                }
            }
        }
    }

    private String getCipherFlag(byte[] bArr) {
        String str = new String(bArr);
        int lastIndexOf = str.lastIndexOf(CIPHER_FLAG_STARTER);
        if (lastIndexOf < 0) {
            return null;
        }
        return str.substring(lastIndexOf + 3);
    }

    public static SecureCryptTools getInstance() {
        return a.f29785a;
    }

    private List<CryptException> init(Context context) throws CryptException {
        List<CryptException> a11;
        try {
            this.lock.lock();
            if (this.initInvoked) {
                a11 = Collections.EMPTY_LIST;
            } else {
                this.initInvoked = true;
                d dVar = new d();
                this.secureKeyStore = dVar;
                a11 = dVar.a(context);
            }
            return a11;
        } finally {
            this.lock.unlock();
        }
    }

    public byte[] decrypt(byte[] bArr) throws CryptException {
        if (!this.initInvoked) {
            throw new CryptException("SecureCryptTools: please init firstly!");
        }
        try {
            try {
                this.lock.tryLock(3000L, TimeUnit.MILLISECONDS);
                return doDecrypt(bArr);
            } catch (InterruptedException unused) {
                throw new CryptException("SecureCryptTools: wait init time out!");
            }
        } finally {
            if (this.lock.isLocked()) {
                this.lock.unlock();
            }
        }
    }

    public byte[] encrypt(byte[] bArr) throws CryptException {
        if (!this.initInvoked) {
            throw new CryptException("SecureCryptTools: please init firstly!");
        }
        try {
            try {
                this.lock.tryLock(3000L, TimeUnit.MILLISECONDS);
                return doEncrypt(bArr);
            } catch (InterruptedException unused) {
                throw new CryptException("SecureCryptTools: wait init time out!");
            }
        } finally {
            if (this.lock.isLocked()) {
                this.lock.unlock();
            }
        }
    }
}

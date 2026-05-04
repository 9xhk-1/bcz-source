package com.getui.gtc.a.a;

import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public f f29679a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f29680b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29681c = false;

    /* renamed from: d, reason: collision with root package name */
    private SecretKeySpec f29682d;

    public b(f fVar) {
        this.f29679a = fVar;
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        this.f29682d = new SecretKeySpec(bArr, "AES/CFB/NoPadding");
    }

    private void a() {
        HttpURLConnection httpURLConnection = this.f29680b;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f29680b = null;
            } catch (Throwable th2) {
                com.getui.gtc.i.c.a.c(th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b3, code lost:
    
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0 A[Catch: all -> 0x01a4, TryCatch #2 {all -> 0x01a4, blocks: (B:71:0x019c, B:73:0x01a0, B:74:0x01a6), top: B:70:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.TargetApi(21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.a.a.b.b(java.util.Map):byte[]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
            if (this.f29681c) {
                return;
            }
            this.f29681c = false;
            f fVar = this.f29679a;
            if (fVar != null && !TextUtils.isEmpty(fVar.f29693a)) {
                HashMap hashMap = new HashMap();
                byte[] b11 = this.f29679a.f29694b == null ? b(hashMap) : a(hashMap);
                if (b11 != null) {
                    this.f29679a.a(hashMap, b11);
                }
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        throw new java.lang.SecurityException("sdk config response error, error code is ".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] a(java.net.HttpURLConnection r6, byte[] r7) {
        /*
            r5 = this;
            com.getui.gtc.a.a.f r0 = r5.f29679a     // Catch: java.lang.Throwable -> L13
            boolean r1 = r0.f29696d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L17
            boolean r6 = r0.f29699g     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L16
            byte[] r6 = com.getui.gtc.a.a.c.a(r7)     // Catch: java.lang.Throwable -> L13
            byte[] r6 = com.getui.gtc.a.a.p.b(r6)     // Catch: java.lang.Throwable -> L13
            return r6
        L13:
            r6 = move-exception
            goto Lb3
        L16:
            return r7
        L17:
            java.lang.String r0 = "GT_ERR"
            java.lang.String r0 = r6.getHeaderField(r0)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L9d
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L28
            goto L9d
        L28:
            java.lang.String r0 = "GT_T"
            java.lang.String r0 = r6.getHeaderField(r0)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L95
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L13
            r1.update(r0)     // Catch: java.lang.Throwable -> L13
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L13
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L13
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "GT_C_S"
            java.lang.String r6 = r6.getHeaderField(r1)     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L8d
            r1 = 2
            byte[] r6 = android.util.Base64.decode(r6, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "AES/CFB/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Throwable -> L13
            javax.crypto.spec.SecretKeySpec r4 = r5.f29682d     // Catch: java.lang.Throwable -> L13
            r3.init(r1, r4, r2)     // Catch: java.lang.Throwable -> L13
            byte[] r7 = r3.doFinal(r7)     // Catch: java.lang.Throwable -> L13
            int r1 = r7.length     // Catch: java.lang.Throwable -> L13
            int r2 = r0.length     // Catch: java.lang.Throwable -> L13
            int r1 = r1 + r2
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L13
            int r2 = r0.length     // Catch: java.lang.Throwable -> L13
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)     // Catch: java.lang.Throwable -> L13
            int r0 = r0.length     // Catch: java.lang.Throwable -> L13
            int r2 = r7.length     // Catch: java.lang.Throwable -> L13
            java.lang.System.arraycopy(r7, r3, r1, r0, r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L13
            r0.update(r1)     // Catch: java.lang.Throwable -> L13
            byte[] r0 = r0.digest()     // Catch: java.lang.Throwable -> L13
            boolean r6 = java.util.Arrays.equals(r0, r6)     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L85
            return r7
        L85:
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = "sdk config response error, response body sign check failed"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L13
            throw r6     // Catch: java.lang.Throwable -> L13
        L8d:
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = "sdk config response error, GT_C_S header not found"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L13
            throw r6     // Catch: java.lang.Throwable -> L13
        L95:
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = "sdk config response error, GT_T header not found"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L13
            throw r6     // Catch: java.lang.Throwable -> L13
        L9d:
            if (r0 == 0) goto Lab
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = "sdk config response error, error code is "
            java.lang.String r7 = r7.concat(r0)     // Catch: java.lang.Throwable -> L13
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L13
            throw r6     // Catch: java.lang.Throwable -> L13
        Lab:
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = "sdk config response error, GT_ERR header not found"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L13
            throw r6     // Catch: java.lang.Throwable -> L13
        Lb3:
            com.getui.gtc.i.c.a.c(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.a.a.b.a(java.net.HttpURLConnection, byte[]):byte[]");
    }

    private byte[] a(Map<String, List<String>> map) {
        InputStream inputStream;
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f29679a.f29693a).openConnection();
                this.f29680b = httpURLConnection;
                httpURLConnection.setConnectTimeout(this.f29679a.f29700h);
                this.f29680b.setReadTimeout(this.f29679a.f29701i);
                this.f29680b.setDoInput(this.f29679a.f29703k);
                this.f29680b.setDoOutput(this.f29679a.f29702j);
                this.f29680b.setRequestMethod("POST");
                this.f29680b.setUseCaches(this.f29679a.f29704l);
                this.f29680b.setInstanceFollowRedirects(this.f29679a.f29705m);
                for (String str : this.f29679a.f29706n.keySet()) {
                    this.f29680b.setRequestProperty(str, this.f29679a.f29706n.get(str));
                }
                f fVar = this.f29679a;
                bArr = fVar.f29694b;
                if (fVar.f29696d) {
                    bArr = a(bArr);
                } else if (fVar.f29698f) {
                    bArr = p.a(bArr);
                }
            } catch (Throwable th2) {
                com.getui.gtc.i.c.a.c(th2);
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            dataOutputStream = null;
            byteArrayOutputStream = null;
        }
        if (bArr == null) {
            a();
            return null;
        }
        this.f29680b.connect();
        DataOutputStream dataOutputStream2 = new DataOutputStream(this.f29680b.getOutputStream());
        try {
            dataOutputStream2.write(bArr, 0, bArr.length);
            dataOutputStream2.flush();
            if (this.f29680b.getResponseCode() == 200) {
                if (this.f29680b.getHeaderFields() != null) {
                    map.putAll(this.f29680b.getHeaderFields());
                }
                inputStream2 = this.f29680b.getInputStream();
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = inputStream2.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr2, 0, read);
                        }
                        if (byteArrayOutputStream2.toByteArray() != null) {
                            byte[] a11 = a(this.f29680b, byteArrayOutputStream2.toByteArray());
                            try {
                                dataOutputStream2.close();
                            } catch (Throwable th4) {
                                com.getui.gtc.i.c.a.c(th4);
                            }
                            try {
                                inputStream2.close();
                            } catch (Throwable th5) {
                                com.getui.gtc.i.c.a.c(th5);
                            }
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Throwable th6) {
                                com.getui.gtc.i.c.a.c(th6);
                            }
                            a();
                            return a11;
                        }
                    } catch (Throwable th7) {
                        inputStream = inputStream2;
                        th = th7;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        dataOutputStream = dataOutputStream2;
                        try {
                            f fVar2 = this.f29679a;
                            if (fVar2 != null) {
                                fVar2.a();
                            }
                            com.getui.gtc.i.c.a.d(th.toString());
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                } catch (Throwable th8) {
                                    com.getui.gtc.i.c.a.c(th8);
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th9) {
                                    com.getui.gtc.i.c.a.c(th9);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            a();
                            return null;
                        } finally {
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                } catch (Throwable th10) {
                                    com.getui.gtc.i.c.a.c(th10);
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th11) {
                                    com.getui.gtc.i.c.a.c(th11);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th12) {
                                    com.getui.gtc.i.c.a.c(th12);
                                }
                            }
                            a();
                        }
                    }
                } catch (Throwable th13) {
                    inputStream = inputStream2;
                    th = th13;
                    dataOutputStream = dataOutputStream2;
                    byteArrayOutputStream = null;
                }
            } else {
                f fVar3 = this.f29679a;
                if (fVar3 != null) {
                    fVar3.a(this.f29680b.getResponseCode());
                }
                inputStream2 = null;
                byteArrayOutputStream2 = null;
            }
            try {
                dataOutputStream2.close();
            } catch (Throwable th14) {
                com.getui.gtc.i.c.a.c(th14);
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th15) {
                    com.getui.gtc.i.c.a.c(th15);
                }
            }
        } catch (Throwable th16) {
            th = th16;
            byteArrayOutputStream = null;
            dataOutputStream = dataOutputStream2;
            inputStream = null;
        }
        if (byteArrayOutputStream2 != null) {
            byteArrayOutputStream2.close();
        }
        a();
        return null;
    }

    private byte[] a(byte[] bArr) {
        try {
            byte[] a11 = g.a(bArr);
            byte[] bArr2 = new byte[0];
            if (a11 == null) {
                a11 = bArr2;
            }
            String valueOf = String.valueOf(System.currentTimeMillis());
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(com.igexin.push.a.f37299k, 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, generatePublic);
            byte[] doFinal = cipher.doFinal(this.f29682d.getEncoded());
            byte[] bArr4 = new byte[doFinal.length + 16];
            System.arraycopy(bArr3, 0, bArr4, 0, 16);
            System.arraycopy(doFinal, 0, bArr4, 16, doFinal.length);
            String encodeToString = Base64.encodeToString(bArr4, 2);
            byte[] bytes = valueOf.getBytes();
            byte[] bArr5 = new byte[bytes.length + a11.length];
            System.arraycopy(bytes, 0, bArr5, 0, bytes.length);
            System.arraycopy(a11, 0, bArr5, bytes.length, a11.length);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bArr5);
            String encodeToString2 = Base64.encodeToString(messageDigest.digest(), 2);
            MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
            messageDigest2.update(encodeToString2.getBytes());
            IvParameterSpec ivParameterSpec = new IvParameterSpec(messageDigest2.digest());
            Cipher cipher2 = Cipher.getInstance("AES/CFB/NoPadding");
            cipher2.init(1, this.f29682d, ivParameterSpec);
            byte[] doFinal2 = cipher2.doFinal(a11);
            this.f29680b.addRequestProperty("GT_T", valueOf);
            this.f29680b.addRequestProperty("GT_C_T", "1");
            this.f29680b.addRequestProperty("GT_C_K", com.igexin.push.a.f37298j);
            this.f29680b.addRequestProperty("GT_C_V", encodeToString);
            this.f29680b.addRequestProperty("GT_C_S", encodeToString2);
            return doFinal2;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return null;
        }
    }
}

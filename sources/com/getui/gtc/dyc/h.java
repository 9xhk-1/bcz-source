package com.getui.gtc.dyc;

import android.util.Base64;
import com.getui.gtc.base.crypt.SecureCryptTools;
import com.getui.gtc.base.util.io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes6.dex */
public class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f30016a;

    /* renamed from: c, reason: collision with root package name */
    private long f30017c;

    /* renamed from: d, reason: collision with root package name */
    private String f30018d;

    /* renamed from: e, reason: collision with root package name */
    private String f30019e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f30020f;

    public static h e(String str) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(SecureCryptTools.getInstance().decrypt(Base64.decode(str.getBytes(), 0))));
                try {
                    h hVar = (h) objectInputStream.readObject();
                    IOUtils.safeClose(objectInputStream);
                    return hVar;
                } catch (IOException e11) {
                    e = e11;
                    com.getui.gtc.dyc.a.a.a.a(e);
                    IOUtils.safeClose(objectInputStream);
                    return null;
                } catch (ClassNotFoundException e12) {
                    e = e12;
                    com.getui.gtc.dyc.a.a.a.a(e);
                    IOUtils.safeClose(objectInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                th2 = th3;
                IOUtils.safeClose(null);
                throw th2;
            }
        } catch (IOException e13) {
            e = e13;
            objectInputStream = null;
            com.getui.gtc.dyc.a.a.a.a(e);
            IOUtils.safeClose(objectInputStream);
            return null;
        } catch (ClassNotFoundException e14) {
            e = e14;
            objectInputStream = null;
            com.getui.gtc.dyc.a.a.a.a(e);
            IOUtils.safeClose(objectInputStream);
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            IOUtils.safeClose(null);
            throw th2;
        }
    }

    public String a() {
        return this.f30016a;
    }

    public long c() {
        return this.f30017c;
    }

    public String d() {
        return this.f30019e;
    }

    public Map<String, String> f() {
        return this.f30020f;
    }

    public String g() throws Throwable {
        ObjectOutputStream objectOutputStream;
        IOException e11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(this);
                } catch (IOException e12) {
                    e11 = e12;
                    com.getui.gtc.dyc.a.a.a.a(e11);
                    IOUtils.safeClose(objectOutputStream);
                    return Base64.encodeToString(SecureCryptTools.getInstance().encrypt(byteArrayOutputStream.toByteArray()), 0);
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                IOUtils.safeClose(objectOutputStream2);
                throw th;
            }
        } catch (IOException e13) {
            objectOutputStream = null;
            e11 = e13;
        } catch (Throwable th3) {
            th = th3;
            IOUtils.safeClose(objectOutputStream2);
            throw th;
        }
        IOUtils.safeClose(objectOutputStream);
        return Base64.encodeToString(SecureCryptTools.getInstance().encrypt(byteArrayOutputStream.toByteArray()), 0);
    }

    public void a(long j11) {
        this.f30017c = j11;
    }

    public void c(String str) {
        this.f30019e = str;
    }

    public void d(String str) {
        this.f30018d = str;
    }

    public String e() {
        return this.f30018d;
    }

    public void a(String str) {
        this.f30016a = str;
    }

    public void a(Map<String, String> map) {
        this.f30020f = map;
    }
}

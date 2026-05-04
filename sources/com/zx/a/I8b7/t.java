package com.zx.a.I8b7;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public Object f46688a;

    public t(String str, String str2, String str3) throws Exception {
        Cipher a11 = a();
        Object invoke = Class.class.getMethod(a(a11, "e9uUVEzVoVWhlVZ8sn1SxQ=="), null).invoke(t.class, null);
        this.f46688a = Class.forName(a(a11, "xQCe3P4Nvo89QAc9u/pHAX2XPV4G/jFlxbQMn2JZQJc=")).getConstructor(String.class, String.class, String.class, Class.forName(a(a11, "BXR/YZEsZikKgydkACAIi9ZlpwlaFcVU0svFCdqK+9k="))).newInstance(str, str2, null, invoke);
    }

    public final Cipher a() throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(Base64.decode("4A4l6BZlmqOanvxq+udGBw==", 2), "AES"), new IvParameterSpec(Base64.decode("PmwJuXddVGbC+te23VrmEA==", 2)));
        return cipher;
    }

    public Class b() throws Exception {
        Cipher a11 = a();
        String a12 = a(a11, "l4Kd4/MbY9AEp4YDnYjHmKacfKJJ9a3waN7VR+soAx/A/LcgDPs74QgTnx2q/91S");
        return (Class) Class.class.getMethod(a(a11, "zVquUq9GnBlh+JZR3JyQWw=="), String.class, Boolean.TYPE, Class.forName(a(a11, "BXR/YZEsZikKgydkACAIi9ZlpwlaFcVU0svFCdqK+9k="))).invoke(Class.class, a12, Boolean.TRUE, this.f46688a);
    }

    public final String a(Cipher cipher, String str) throws Exception {
        return new String(cipher.doFinal(Base64.decode(str, 2)), "UTF-8");
    }
}

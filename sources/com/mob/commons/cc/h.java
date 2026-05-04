package com.mob.commons.cc;

import android.text.TextUtils;
import com.mob.commons.cc.i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class h implements i {
    public String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, bArr.length);
            String a11 = a(byteArrayInputStream);
            byteArrayInputStream.close();
            return a11;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b11 : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b11)));
        }
        return stringBuffer.toString();
    }

    public String a(InputStream inputStream) {
        byte[] bArr = null;
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr2 = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            int read = inputStream.read(bArr2);
            while (read != -1) {
                messageDigest.update(bArr2, 0, read);
                read = inputStream.read(bArr2);
            }
            bArr = messageDigest.digest();
        } catch (Throwable unused) {
        }
        return b(bArr);
    }

    public ArrayList<HashMap<String, String>> a(ArrayList<HashMap<String, String>> arrayList, ArrayList<HashMap<String, String>> arrayList2, String str) {
        ArrayList<HashMap<String, String>> arrayList3 = new ArrayList<>();
        Iterator<HashMap<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            HashMap<String, String> next = it.next();
            String str2 = next.get(str);
            if (!TextUtils.isEmpty(str2)) {
                Iterator<HashMap<String, String>> it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (str2.equals(it2.next().get(str))) {
                            break;
                        }
                    } else {
                        arrayList3.add(next);
                        break;
                    }
                }
            }
        }
        return arrayList3;
    }

    @Override // com.mob.commons.cc.i
    public i.b a(i.a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        i.b bVar = new i.b();
        try {
            if ("bm5".equals(aVar.f40232a)) {
                Object[] objArr = aVar.f40233b;
                if (objArr.length == 1 && (obj3 = objArr[0]) != null && (obj3 instanceof byte[])) {
                    bVar.f40236a = a((byte[]) obj3);
                    return bVar;
                }
            }
            if ("sm5".equals(aVar.f40232a)) {
                Object[] objArr2 = aVar.f40233b;
                if (objArr2.length == 1 && (obj2 = objArr2[0]) != null && (obj2 instanceof InputStream)) {
                    bVar.f40236a = a((InputStream) obj2);
                    return bVar;
                }
            }
            if ("thx".equals(aVar.f40232a)) {
                Object[] objArr3 = aVar.f40233b;
                if (objArr3.length == 1 && (obj = objArr3[0]) != null && (obj instanceof byte[])) {
                    bVar.f40236a = b((byte[]) obj);
                    return bVar;
                }
            }
            if ("fnil".equals(aVar.f40232a)) {
                Object[] objArr4 = aVar.f40233b;
                if (objArr4.length == 3) {
                    bVar.f40236a = a((ArrayList) objArr4[0], (ArrayList) objArr4[1], (String) objArr4[2]);
                    return bVar;
                }
            }
            bVar.f40238c = new NoSuchMethodException("method name: " + aVar.f40232a + " at line: " + aVar.f40234c + pn.j.f81006c + aVar.f40235d + pn.j.f81007d);
            return bVar;
        } catch (Throwable th2) {
            bVar.f40238c = th2;
            return bVar;
        }
    }
}

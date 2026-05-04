package com.igexin.push.d.c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class i extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38473a = 4;

    /* renamed from: b, reason: collision with root package name */
    public long f38474b;

    /* renamed from: c, reason: collision with root package name */
    public byte f38475c;

    /* renamed from: d, reason: collision with root package name */
    public int f38476d;

    /* renamed from: e, reason: collision with root package name */
    public String f38477e;

    /* renamed from: f, reason: collision with root package name */
    public List<j> f38478f;

    public i() {
        this.f38438m = 4;
        this.f38439n = (byte) 20;
    }

    private static String a(byte[] bArr, int i11, int i12) {
        try {
            return new String(bArr, i11, i12, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        int i11;
        int i12;
        List<j> list = this.f38478f;
        byte[] bArr = null;
        if (list != null && list.size() > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator<j> it = this.f38478f.iterator();
            while (it.hasNext()) {
                try {
                    byteArrayOutputStream.write(it.next().b());
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e11) {
                    com.igexin.c.a.c.a.a(e11);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                com.igexin.c.a.c.a.a(e12);
            }
        }
        if (bArr != null) {
            i11 = bArr.length;
            i12 = i11 + 1;
        } else {
            i11 = 0;
            i12 = 1;
        }
        byte[] bArr2 = new byte[i12 + 12 + this.f38477e.getBytes().length + 1];
        com.igexin.c.a.b.g.a(this.f38474b, bArr2, 0);
        com.igexin.c.a.b.g.a(((this.f38475c & 255) << 24) | this.f38476d, bArr2, 8);
        bArr2[12] = (byte) i11;
        int a11 = i11 > 0 ? 13 + com.igexin.c.a.b.g.a(bArr, bArr2, 13, i11) : 13;
        byte[] bytes = this.f38477e.getBytes();
        bArr2[a11] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr2, a11 + 1, bytes.length);
        return bArr2;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        this.f38474b = com.igexin.c.a.b.g.d(bArr, 0);
        this.f38475c = bArr[8];
        this.f38476d = com.igexin.c.a.b.g.c(bArr, 9);
        int i11 = 13;
        if (bArr.length > 13) {
            int i12 = bArr[13] & 255;
            i11 = 14;
            if (i12 > 0) {
                this.f38478f = new ArrayList();
                int i13 = i12 + 14;
                while (i11 < i13) {
                    j jVar = new j();
                    this.f38478f.add(jVar);
                    int i14 = i11 + 1;
                    int i15 = bArr[i11] & 255;
                    int i16 = i11 + 2;
                    int i17 = bArr[i14] & 255;
                    jVar.f38479a = (byte) i15;
                    if ((i15 == 1 || i15 == 4) && i17 > 0) {
                        try {
                            jVar.f38480b = new String(bArr, i16, i17, "UTF-8");
                        } catch (Exception e11) {
                            com.igexin.c.a.c.a.a(e11);
                        }
                    }
                    i11 = i16 + i17;
                }
            }
        }
        if (bArr.length > i11) {
            this.f38477e = a(bArr, i11 + 1, bArr[i11] & 255);
        }
    }
}

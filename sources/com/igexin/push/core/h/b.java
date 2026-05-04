package com.igexin.push.core.h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.igexin.push.core.b.l;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.g.j;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes7.dex */
public final class b extends com.igexin.push.f.a.d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38168a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f38169b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final int f38170c = 65557;

    /* renamed from: d, reason: collision with root package name */
    private static final String f38171d = "EXT-DownloadImgPlugin";

    /* renamed from: n, reason: collision with root package name */
    private String f38172n;

    /* renamed from: o, reason: collision with root package name */
    private BaseActionBean f38173o;

    /* renamed from: p, reason: collision with root package name */
    private int f38174p;

    /* renamed from: q, reason: collision with root package name */
    private d f38175q;

    /* renamed from: r, reason: collision with root package name */
    private String f38176r;

    public b(String str, String str2, String str3, BaseActionBean baseActionBean, int i11, d dVar) {
        super(str);
        this.f38173o = baseActionBean;
        this.f38172n = str3;
        this.f38174p = i11;
        this.f38175q = dVar;
        this.f38176r = str2;
        this.f38535l = false;
    }

    private static void b() {
        File file = new File(j.f38712f);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Override // com.igexin.push.f.a.d
    public final void a(Exception exc) {
        d dVar = this.f38175q;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return f38170c;
    }

    private void a(String str) {
        int i11 = this.f38174p;
        if (i11 == 2) {
            ((l) this.f38173o).D = str;
        } else {
            if (i11 != 8) {
                return;
            }
            ((l) this.f38173o).E = str;
        }
    }

    @Override // com.igexin.push.f.a.d
    public final void a(byte[] bArr) {
        this.f38536m = false;
        try {
            File file = new File(j.f38712f);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = j.f38712f + com.igexin.assist.util.a.a(this.f38176r) + ".bin";
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (decodeByteArray != null) {
                decodeByteArray.compress(compressFormat, 100, fileOutputStream);
                fileOutputStream.close();
                decodeByteArray.recycle();
                int i11 = this.f38174p;
                if (i11 == 2) {
                    ((l) this.f38173o).D = str;
                } else if (i11 == 8) {
                    ((l) this.f38173o).E = str;
                }
                this.f38536m = true;
            } else {
                fileOutputStream.close();
                this.f38536m = false;
            }
            d dVar = this.f38175q;
            if (dVar != null) {
                if (this.f38536m) {
                    dVar.a(this.f38173o);
                } else {
                    new Exception("no target existed or downloading bitmap failed!");
                    dVar.a();
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }
}

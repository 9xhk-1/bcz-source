package com.igexin.push.core.i.a;

import android.graphics.Bitmap;
import com.igexin.push.core.i.a.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class c implements d.a {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Bitmap> f38192a = null;

    /* renamed from: b, reason: collision with root package name */
    private final String f38193b = "GifBitmapProvider";

    @Override // com.igexin.push.core.i.a.d.a
    public final Bitmap a(int i11, int i12, Bitmap.Config config, int i13) {
        if (this.f38192a == null) {
            ArrayList<Bitmap> arrayList = new ArrayList<>(2);
            this.f38192a = arrayList;
            arrayList.add(0, Bitmap.createBitmap(i11, i12, config));
            this.f38192a.add(1, Bitmap.createBitmap(i11, i12, config));
        }
        return this.f38192a.get(i13 % 2);
    }

    @Override // com.igexin.push.core.i.a.d.a
    public final void b() {
    }

    @Override // com.igexin.push.core.i.a.d.a
    public final void a() {
        ArrayList<Bitmap> arrayList = this.f38192a;
        if (arrayList != null) {
            Iterator<Bitmap> it = arrayList.iterator();
            while (it.hasNext()) {
                Bitmap next = it.next();
                if (next != null) {
                    next.recycle();
                }
            }
            this.f38192a = null;
        }
    }

    @Override // com.igexin.push.core.i.a.d.a
    public final int[] b(int i11) {
        return new int[i11];
    }

    @Override // com.igexin.push.core.i.a.d.a
    public final void a(Bitmap bitmap) {
        com.igexin.c.a.c.a.b("GifBitmapProvider", "release bitmap  ");
        bitmap.recycle();
    }

    @Override // com.igexin.push.core.i.a.d.a
    public final byte[] a(int i11) {
        return new byte[i11];
    }

    @Override // com.igexin.push.core.i.a.d.a
    public final void c() {
    }
}

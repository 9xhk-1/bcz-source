package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import ix.l1;
import java.io.IOException;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f41936b = {"orientation"};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);


        /* renamed from: a, reason: collision with root package name */
        public final int f41941a;

        /* renamed from: b, reason: collision with root package name */
        public final int f41942b;

        /* renamed from: c, reason: collision with root package name */
        public final int f41943c;

        a(int i11, int i12, int i13) {
            this.f41941a = i11;
            this.f41942b = i12;
            this.f41943c = i13;
        }
    }

    public r(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.r.f41936b     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L21
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            if (r8 != 0) goto L16
            goto L21
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2d
            r1.close()
            return r8
        L1e:
            r0 = move-exception
            r8 = r0
            goto L27
        L21:
            if (r1 == 0) goto L26
            r1.close()
        L26:
            return r0
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r8
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.r.b(android.content.ContentResolver, android.net.Uri):int");
    }

    public static a c(int i11, int i12) {
        a aVar = a.MICRO;
        if (i11 <= aVar.f41942b && i12 <= aVar.f41943c) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i11 > aVar2.f41942b || i12 > aVar2.f41943c) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.a0
    public boolean canHandleRequest(y yVar) {
        Uri uri = yVar.f41978d;
        return "content".equals(uri.getScheme()) && l1.a.f62928f.equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.a0
    public a0.a load(y yVar, int i11) throws IOException {
        y yVar2;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f41858a.getContentResolver();
        int b11 = b(contentResolver, yVar.f41978d);
        String type = contentResolver.getType(yVar.f41978d);
        boolean z11 = type != null && type.startsWith("video/");
        if (yVar.d()) {
            a c11 = c(yVar.f41982h, yVar.f41983i);
            if (!z11 && c11 == a.FULL) {
                return new a0.a(null, r0.v(a(yVar)), Picasso.LoadedFrom.DISK, b11);
            }
            long parseId = ContentUris.parseId(yVar.f41978d);
            BitmapFactory.Options createBitmapOptions = a0.createBitmapOptions(yVar);
            createBitmapOptions.inJustDecodeBounds = true;
            yVar2 = yVar;
            a0.calculateInSampleSize(yVar.f41982h, yVar.f41983i, c11.f41942b, c11.f41943c, createBitmapOptions, yVar2);
            if (z11) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, c11 != a.FULL ? c11.f41941a : 1, createBitmapOptions);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, c11.f41941a, createBitmapOptions);
            }
            if (thumbnail != null) {
                return new a0.a(thumbnail, null, Picasso.LoadedFrom.DISK, b11);
            }
        } else {
            yVar2 = yVar;
        }
        return new a0.a(null, r0.v(a(yVar2)), Picasso.LoadedFrom.DISK, b11);
    }
}

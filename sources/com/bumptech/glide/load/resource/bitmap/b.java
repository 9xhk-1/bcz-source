package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import fl.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import sk.o0;
import sk.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final k f28842a;

        /* renamed from: b, reason: collision with root package name */
        public final lk.b f28843b;

        /* renamed from: c, reason: collision with root package name */
        public final List<ImageHeaderParser> f28844c;

        public d(InputStream inputStream, List<ImageHeaderParser> list, lk.b bVar) {
            this.f28843b = (lk.b) m.e(bVar);
            this.f28844c = (List) m.e(list);
            this.f28842a = new k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public boolean a() throws IOException {
            return com.bumptech.glide.load.a.j(this.f28844c, this.f28842a.a(), this.f28843b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void b() {
            this.f28842a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int c() throws IOException {
            return com.bumptech.glide.load.a.b(this.f28844c, this.f28842a.a(), this.f28843b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap d(BitmapFactory.Options options) throws IOException {
            return o0.c(this.f28842a.a(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.f(this.f28844c, this.f28842a.a(), this.f28843b);
        }
    }

    boolean a() throws IOException;

    void b();

    int c() throws IOException;

    @Nullable
    Bitmap d(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType e() throws IOException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f28833a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f28834b;

        /* renamed from: c, reason: collision with root package name */
        public final lk.b f28835c;

        public a(byte[] bArr, List<ImageHeaderParser> list, lk.b bVar) {
            this.f28833a = bArr;
            this.f28834b = list;
            this.f28835c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public boolean a() throws IOException {
            return com.bumptech.glide.load.a.k(this.f28834b, ByteBuffer.wrap(this.f28833a), this.f28835c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int c() throws IOException {
            return com.bumptech.glide.load.a.c(this.f28834b, ByteBuffer.wrap(this.f28833a), this.f28835c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap d(BitmapFactory.Options options) {
            return o0.a(this.f28833a, options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.g(this.f28834b, ByteBuffer.wrap(this.f28833a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b, reason: collision with other inner class name */
    public static final class C0339b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28836a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f28837b;

        /* renamed from: c, reason: collision with root package name */
        public final lk.b f28838c;

        public C0339b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, lk.b bVar) {
            this.f28836a = byteBuffer;
            this.f28837b = list;
            this.f28838c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public boolean a() throws IOException {
            return com.bumptech.glide.load.a.k(this.f28837b, fl.a.d(this.f28836a), this.f28838c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int c() throws IOException {
            return com.bumptech.glide.load.a.c(this.f28837b, fl.a.d(this.f28836a), this.f28838c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap d(BitmapFactory.Options options) {
            return o0.c(f(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.g(this.f28837b, fl.a.d(this.f28836a));
        }

        public final InputStream f() {
            return fl.a.g(fl.a.d(this.f28836a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final File f28839a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f28840b;

        /* renamed from: c, reason: collision with root package name */
        public final lk.b f28841c;

        public c(File file, List<ImageHeaderParser> list, lk.b bVar) {
            this.f28839a = file;
            this.f28840b = list;
            this.f28841c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public boolean a() throws IOException {
            FileInputStream fileInputStream;
            Throwable th2;
            try {
                fileInputStream = new FileInputStream(this.f28839a);
                try {
                    boolean j11 = com.bumptech.glide.load.a.j(this.f28840b, fileInputStream, this.f28841c);
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    return j11;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int c() throws IOException {
            v0 v0Var;
            Throwable th2;
            try {
                v0Var = new v0(new FileInputStream(this.f28839a), this.f28841c);
                try {
                    int b11 = com.bumptech.glide.load.a.b(this.f28840b, v0Var, this.f28841c);
                    try {
                        v0Var.close();
                    } catch (IOException unused) {
                    }
                    return b11;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (v0Var != null) {
                        try {
                            v0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                v0Var = null;
                th2 = th4;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap d(BitmapFactory.Options options) throws FileNotFoundException {
            v0 v0Var = null;
            try {
                v0 v0Var2 = new v0(new FileInputStream(this.f28839a), this.f28841c);
                try {
                    Bitmap c11 = o0.c(v0Var2, options, this);
                    try {
                        v0Var2.close();
                    } catch (IOException unused) {
                    }
                    return c11;
                } catch (Throwable th2) {
                    th = th2;
                    v0Var = v0Var2;
                    if (v0Var != null) {
                        try {
                            v0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType e() throws IOException {
            v0 v0Var;
            Throwable th2;
            try {
                v0Var = new v0(new FileInputStream(this.f28839a), this.f28841c);
                try {
                    ImageHeaderParser.ImageType f11 = com.bumptech.glide.load.a.f(this.f28840b, v0Var, this.f28841c);
                    try {
                        v0Var.close();
                    } catch (IOException unused) {
                    }
                    return f11;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (v0Var != null) {
                        try {
                            v0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                v0Var = null;
                th2 = th4;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final lk.b f28845a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f28846b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f28847c;

        public e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, lk.b bVar) {
            this.f28845a = (lk.b) m.e(bVar);
            this.f28846b = (List) m.e(list);
            this.f28847c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public boolean a() throws IOException {
            return com.bumptech.glide.load.a.i(this.f28846b, this.f28847c, this.f28845a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int c() throws IOException {
            return com.bumptech.glide.load.a.a(this.f28846b, this.f28847c, this.f28845a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap d(BitmapFactory.Options options) throws IOException {
            return o0.b(this.f28847c.a().getFileDescriptor(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.e(this.f28846b, this.f28847c, this.f28845a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void b() {
        }
    }
}

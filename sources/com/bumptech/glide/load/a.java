package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import sk.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f28714a = 5242880;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    public class C0337a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f28715a;

        public C0337a(InputStream inputStream) {
            this.f28715a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f28715a);
            } finally {
                this.f28715a.reset();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f28716a;

        public b(ByteBuffer byteBuffer) {
            this.f28716a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.e(this.f28716a);
            } finally {
                fl.a.d(this.f28716a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f28717a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lk.b f28718b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, lk.b bVar) {
            this.f28717a = parcelFileDescriptorRewinder;
            this.f28718b = bVar;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            v0 v0Var = null;
            try {
                v0 v0Var2 = new v0(new FileInputStream(this.f28717a.a().getFileDescriptor()), this.f28718b);
                try {
                    ImageHeaderParser.ImageType c11 = imageHeaderParser.c(v0Var2);
                    v0Var2.release();
                    this.f28717a.a();
                    return c11;
                } catch (Throwable th2) {
                    th = th2;
                    v0Var = v0Var2;
                    if (v0Var != null) {
                        v0Var.release();
                    }
                    this.f28717a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f28719a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lk.b f28720b;

        public d(ByteBuffer byteBuffer, lk.b bVar) {
            this.f28719a = byteBuffer;
            this.f28720b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f28719a, this.f28720b);
            } finally {
                fl.a.d(this.f28719a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f28721a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lk.b f28722b;

        public e(InputStream inputStream, lk.b bVar) {
            this.f28721a = inputStream;
            this.f28722b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f28721a, this.f28722b);
            } finally {
                this.f28721a.reset();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f28723a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lk.b f28724b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, lk.b bVar) {
            this.f28723a = parcelFileDescriptorRewinder;
            this.f28724b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            v0 v0Var = null;
            try {
                v0 v0Var2 = new v0(new FileInputStream(this.f28723a.a().getFileDescriptor()), this.f28724b);
                try {
                    int d11 = imageHeaderParser.d(v0Var2, this.f28724b);
                    v0Var2.release();
                    this.f28723a.a();
                    return d11;
                } catch (Throwable th2) {
                    th = th2;
                    v0Var = v0Var2;
                    if (v0Var != null) {
                        v0Var.release();
                    }
                    this.f28723a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f28725a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lk.b f28726b;

        public g(ByteBuffer byteBuffer, lk.b bVar) {
            this.f28725a = byteBuffer;
            this.f28726b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f28725a, this.f28726b);
            } finally {
                fl.a.d(this.f28725a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f28727a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lk.b f28728b;

        public h(InputStream inputStream, lk.b bVar) {
            this.f28727a = inputStream;
            this.f28728b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.f(this.f28727a, this.f28728b);
            } finally {
                this.f28727a.reset();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f28729a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lk.b f28730b;

        public i(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, lk.b bVar) {
            this.f28729a = parcelFileDescriptorRewinder;
            this.f28730b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            v0 v0Var = null;
            try {
                v0 v0Var2 = new v0(new FileInputStream(this.f28729a.a().getFileDescriptor()), this.f28730b);
                try {
                    boolean f11 = imageHeaderParser.f(v0Var2, this.f28730b);
                    v0Var2.release();
                    this.f28729a.a();
                    return f11;
                } catch (Throwable th2) {
                    th = th2;
                    v0Var = v0Var2;
                    if (v0Var != null) {
                        v0Var.release();
                    }
                    this.f28729a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j {
        boolean a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface l {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @RequiresApi(21)
    public static int a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull lk.b bVar) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull lk.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer, @NonNull lk.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    public static int d(@NonNull List<ImageHeaderParser> list, k kVar) throws IOException {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int a11 = kVar.a(list.get(i11));
            if (a11 != -1) {
                return a11;
            }
        }
        return -1;
    }

    @NonNull
    @RequiresApi(21)
    public static ImageHeaderParser.ImageType e(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull lk.b bVar) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull lk.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0337a(inputStream));
    }

    @NonNull
    public static ImageHeaderParser.ImageType g(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    @NonNull
    public static ImageHeaderParser.ImageType h(@NonNull List<ImageHeaderParser> list, l lVar) throws IOException {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ImageHeaderParser.ImageType a11 = lVar.a(list.get(i11));
            if (a11 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a11;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @RequiresApi(21)
    public static boolean i(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull lk.b bVar) throws IOException {
        return l(list, new i(parcelFileDescriptorRewinder, bVar));
    }

    public static boolean j(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull lk.b bVar) throws IOException {
        if (inputStream == null) {
            return false;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return l(list, new h(inputStream, bVar));
    }

    public static boolean k(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer, @NonNull lk.b bVar) throws IOException {
        if (byteBuffer == null) {
            return false;
        }
        return l(list, new g(byteBuffer, bVar));
    }

    public static boolean l(@NonNull List<ImageHeaderParser> list, j jVar) throws IOException {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (jVar.a(list.get(i11))) {
                return true;
            }
        }
        return false;
    }
}

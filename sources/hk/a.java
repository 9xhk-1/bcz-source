package hk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f59408a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f59409b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f59410c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f59411d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f59412e = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: hk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0675a {
        @NonNull
        byte[] a(int i11);

        @NonNull
        Bitmap b(int i11, int i12, @NonNull Bitmap.Config config);

        void c(@NonNull Bitmap bitmap);

        @NonNull
        int[] d(int i11);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a(@NonNull c cVar, @NonNull byte[] bArr);

    void b(@NonNull Bitmap.Config config);

    @Deprecated
    int c();

    void clear();

    void d(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i11);

    void e();

    int f();

    int g(@Nullable InputStream inputStream, int i11);

    @NonNull
    ByteBuffer getData();

    int getHeight();

    int getStatus();

    int getWidth();

    int h();

    @Nullable
    Bitmap i();

    void j();

    int k();

    int l(int i11);

    void m(@NonNull c cVar, @NonNull ByteBuffer byteBuffer);

    int n();

    int o();

    int p();

    int read(@Nullable byte[] bArr);
}

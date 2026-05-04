package com.igexin.push.core.i.a;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38194a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f38195b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f38196c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f38197d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f38198e = 0;

    public interface a {
        Bitmap a(int i11, int i12, Bitmap.Config config, int i13);

        void a();

        void a(Bitmap bitmap);

        byte[] a(int i11);

        void b();

        int[] b(int i11);

        void c();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a();

    int a(int i11);

    int a(InputStream inputStream, int i11);

    int a(byte[] bArr);

    void a(Bitmap.Config config);

    void a(i iVar, ByteBuffer byteBuffer);

    void a(i iVar, ByteBuffer byteBuffer, int i11);

    void a(i iVar, byte[] bArr);

    int b();

    ByteBuffer c();

    int d();

    void e();

    int f();

    int g();

    int h();

    void i();

    @Deprecated
    int j();

    int k();

    int l();

    int m();

    Bitmap n();

    void o();
}

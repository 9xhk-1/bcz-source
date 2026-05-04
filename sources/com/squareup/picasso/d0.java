package com.squareup.picasso;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f41837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41838b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41839c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41840d;

    /* renamed from: e, reason: collision with root package name */
    public final long f41841e;

    /* renamed from: f, reason: collision with root package name */
    public final long f41842f;

    /* renamed from: g, reason: collision with root package name */
    public final long f41843g;

    /* renamed from: h, reason: collision with root package name */
    public final long f41844h;

    /* renamed from: i, reason: collision with root package name */
    public final long f41845i;

    /* renamed from: j, reason: collision with root package name */
    public final long f41846j;

    /* renamed from: k, reason: collision with root package name */
    public final int f41847k;

    /* renamed from: l, reason: collision with root package name */
    public final int f41848l;

    /* renamed from: m, reason: collision with root package name */
    public final int f41849m;

    /* renamed from: n, reason: collision with root package name */
    public final long f41850n;

    public d0(int i11, int i12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i13, int i14, int i15, long j19) {
        this.f41837a = i11;
        this.f41838b = i12;
        this.f41839c = j11;
        this.f41840d = j12;
        this.f41841e = j13;
        this.f41842f = j14;
        this.f41843g = j15;
        this.f41844h = j16;
        this.f41845i = j17;
        this.f41846j = j18;
        this.f41847k = i13;
        this.f41848l = i14;
        this.f41849m = i15;
        this.f41850n = j19;
    }

    public void a() {
        StringWriter stringWriter = new StringWriter();
        b(new PrintWriter(stringWriter));
        Log.i(Picasso.f41723p, stringWriter.toString());
    }

    public void b(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f41837a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f41838b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f41838b / this.f41837a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f41839c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f41840d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f41847k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f41841e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f41844h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f41848l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f41842f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f41849m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f41843g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f41845i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f41846j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f41837a + ", size=" + this.f41838b + ", cacheHits=" + this.f41839c + ", cacheMisses=" + this.f41840d + ", downloadCount=" + this.f41847k + ", totalDownloadSize=" + this.f41841e + ", averageDownloadSize=" + this.f41844h + ", totalOriginalBitmapSize=" + this.f41842f + ", totalTransformedBitmapSize=" + this.f41843g + ", averageOriginalBitmapSize=" + this.f41845i + ", averageTransformedBitmapSize=" + this.f41846j + ", originalBitmapCount=" + this.f41848l + ", transformedBitmapCount=" + this.f41849m + ", timeStamp=" + this.f41850n + l50.b.f69928j;
    }
}

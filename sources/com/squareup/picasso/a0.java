package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import l60.g1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Picasso.LoadedFrom f41770a;

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f41771b;

        /* renamed from: c, reason: collision with root package name */
        public final g1 f41772c;

        /* renamed from: d, reason: collision with root package name */
        public final int f41773d;

        public a(@NonNull Bitmap bitmap, @NonNull Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) h0.e(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        @Nullable
        public Bitmap a() {
            return this.f41771b;
        }

        public int b() {
            return this.f41773d;
        }

        @NonNull
        public Picasso.LoadedFrom c() {
            return this.f41770a;
        }

        @Nullable
        public g1 d() {
            return this.f41772c;
        }

        public a(@NonNull g1 g1Var, @NonNull Picasso.LoadedFrom loadedFrom) {
            this(null, (g1) h0.e(g1Var, "source == null"), loadedFrom, 0);
        }

        public a(@Nullable Bitmap bitmap, @Nullable g1 g1Var, @NonNull Picasso.LoadedFrom loadedFrom, int i11) {
            if ((bitmap != null) != (g1Var != null)) {
                this.f41771b = bitmap;
                this.f41772c = g1Var;
                this.f41770a = (Picasso.LoadedFrom) h0.e(loadedFrom, "loadedFrom == null");
                this.f41773d = i11;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void calculateInSampleSize(int i11, int i12, BitmapFactory.Options options, y yVar) {
        calculateInSampleSize(i11, i12, options.outWidth, options.outHeight, options, yVar);
    }

    public static BitmapFactory.Options createBitmapOptions(y yVar) {
        boolean d11 = yVar.d();
        boolean z11 = yVar.f41993s != null;
        if (!d11 && !z11 && !yVar.f41992r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = d11;
        boolean z12 = yVar.f41992r;
        options.inInputShareable = z12;
        options.inPurgeable = z12;
        if (z11) {
            options.inPreferredConfig = yVar.f41993s;
        }
        return options;
    }

    public static boolean requiresInSampleSize(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(y yVar);

    public int getRetryCount() {
        return 0;
    }

    @Nullable
    public abstract a load(y yVar, int i11) throws IOException;

    public boolean shouldRetry(boolean z11, NetworkInfo networkInfo) {
        return false;
    }

    public boolean supportsReplay() {
        return false;
    }

    public static void calculateInSampleSize(int i11, int i12, int i13, int i14, BitmapFactory.Options options, y yVar) {
        int max;
        double floor;
        if (i14 > i12 || i13 > i11) {
            if (i12 == 0) {
                floor = Math.floor(i13 / i11);
            } else if (i11 == 0) {
                floor = Math.floor(i14 / i12);
            } else {
                int floor2 = (int) Math.floor(i14 / i12);
                int floor3 = (int) Math.floor(i13 / i11);
                max = yVar.f41986l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }
}

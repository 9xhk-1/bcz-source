package com.baicizhan.client.business.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ZpkPicassoRequestHandler extends com.squareup.picasso.a0 implements ZpkConfig {
    public static final String TAG = "ZpkPicassoRequestHandler";

    public static void calculateInSampleSize(int reqWidth, int reqHeight, BitmapFactory.Options options, com.squareup.picasso.y request) {
        calculateInSampleSize(reqWidth, reqHeight, options.outWidth, options.outHeight, options, request);
    }

    public static BitmapFactory.Options createBitmapOptions(com.squareup.picasso.y data) {
        boolean d11 = data.d();
        boolean z11 = data.f41993s != null;
        if (!d11 && !z11) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = d11;
        if (z11) {
            options.inPreferredConfig = data.f41993s;
        }
        return options;
    }

    public static boolean requiresInSampleSize(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    @Override // com.squareup.picasso.a0
    public boolean canHandleRequest(com.squareup.picasso.y request) {
        return match(request.f41978d);
    }

    public Bitmap decodeContentStream(com.squareup.picasso.y data) throws IOException {
        BitmapFactory.Options createBitmapOptions = createBitmapOptions(data);
        String path = data.f41978d.getPath();
        String query = data.f41978d.getQuery();
        ya.e eVar = new ya.e(path, 1);
        if (requiresInSampleSize(createBitmapOptions)) {
            InputStream t11 = eVar.t(query);
            try {
                BitmapFactory.decodeStream(t11, null, createBitmapOptions);
                calculateInSampleSize(data.f41982h, data.f41983i, createBitmapOptions, data);
            } finally {
                try {
                    t11.close();
                } catch (IOException e11) {
                    qb.c.c(TAG, "", e11);
                }
            }
        }
        InputStream t12 = eVar.t(query);
        try {
            return BitmapFactory.decodeStream(t12, null, createBitmapOptions);
        } finally {
            try {
                eVar.d();
                t12.close();
            } catch (IOException e12) {
                qb.c.c(TAG, "", e12);
            }
        }
    }

    @Override // com.squareup.picasso.a0
    @Nullable
    public a0.a load(com.squareup.picasso.y request, int networkPolicy) throws IOException {
        return new a0.a(decodeContentStream(request), Picasso.LoadedFrom.DISK);
    }

    public static void calculateInSampleSize(int reqWidth, int reqHeight, int width, int height, BitmapFactory.Options options, com.squareup.picasso.y request) {
        int max;
        double floor;
        if (height > reqHeight || width > reqWidth) {
            if (reqHeight == 0) {
                floor = Math.floor(width / reqWidth);
            } else if (reqWidth == 0) {
                floor = Math.floor(height / reqHeight);
            } else {
                int floor2 = (int) Math.floor(height / reqHeight);
                int floor3 = (int) Math.floor(width / reqWidth);
                max = request.f41986l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }
}

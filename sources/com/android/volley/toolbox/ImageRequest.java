package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ImageRequest extends Request<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;

    @Nullable
    @GuardedBy("mLock")
    private Response.Listener<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public ImageRequest(String str, Response.Listener<Bitmap> listener, int i11, int i12, ImageView.ScaleType scaleType, Bitmap.Config config, @Nullable Response.ErrorListener errorListener) {
        super(0, str, errorListener);
        this.mLock = new Object();
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0f));
        this.mListener = listener;
        this.mDecodeConfig = config;
        this.mMaxWidth = i11;
        this.mMaxHeight = i12;
        this.mScaleType = scaleType;
    }

    private Response<Bitmap> doParse(NetworkResponse networkResponse) {
        Bitmap decodeByteArray;
        byte[] bArr = networkResponse.data;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i11 = options.outWidth;
            int i12 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i11, i12, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i12, i11, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i11, i12, resizedDimension, resizedDimension2);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > resizedDimension || decodeByteArray.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, resizedDimension, resizedDimension2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        return decodeByteArray == null ? Response.error(new ParseError(networkResponse)) : Response.success(decodeByteArray, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    @VisibleForTesting
    public static int findBestSampleSize(int i11, int i12, int i13, int i14) {
        double min = Math.min(i11 / i13, i12 / i14);
        float f11 = 1.0f;
        while (true) {
            float f12 = 2.0f * f11;
            if (f12 > min) {
                return (int) f11;
            }
            f11 = f12;
        }
    }

    private static int getResizedDimension(int i11, int i12, int i13, int i14, ImageView.ScaleType scaleType) {
        if (i11 != 0 || i12 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i11 == 0) {
                    return (int) (i13 * (i12 / i14));
                }
                if (i12 == 0) {
                    return i11;
                }
                double d11 = i14 / i13;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d12 = i12;
                    return ((double) i11) * d11 < d12 ? (int) (d12 / d11) : i11;
                }
                double d13 = i12;
                return ((double) i11) * d11 > d13 ? (int) (d13 / d11) : i11;
            }
            if (i11 != 0) {
                return i11;
            }
        }
        return i13;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    @Override // com.android.volley.Request
    public Response<Bitmap> parseNetworkResponse(NetworkResponse networkResponse) {
        Response<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    doParse = doParse(networkResponse);
                } catch (OutOfMemoryError e11) {
                    VolleyLog.e("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.data.length), getUrl());
                    return Response.error(new ParseError(e11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return doParse;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(Bitmap bitmap) {
        Response.Listener<Bitmap> listener;
        synchronized (this.mLock) {
            listener = this.mListener;
        }
        if (listener != null) {
            listener.onResponse(bitmap);
        }
    }

    @Deprecated
    public ImageRequest(String str, Response.Listener<Bitmap> listener, int i11, int i12, Bitmap.Config config, Response.ErrorListener errorListener) {
        this(str, listener, i11, i12, ImageView.ScaleType.CENTER_INSIDE, config, errorListener);
    }
}

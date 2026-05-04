package com.mob.tools.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.opengl.GLES10;
import android.text.TextUtils;
import android.view.View;
import com.alipay.sdk.m.u.i;
import com.baicizhan.main.activity.GuideActivity;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.utils.FileUtil;
import com.malmstein.fenster.videorender.gles.GeneratedTexture;
import com.mob.commons.j;
import com.mob.tools.MobLog;
import com.mob.tools.network.HttpConnection;
import com.mob.tools.network.HttpResponseCallback;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.PublicMemberKeeper;
import ix.g;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class BitmapHelper implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static int f41376a;

    /* renamed from: b, reason: collision with root package name */
    private static int f41377b;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(com.badlogic.gdx.graphics.f.V0, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        f41376a = max;
        f41377b = max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(HttpConnection httpConnection, String str) throws Throwable {
        String str2;
        List<String> list;
        int lastIndexOf;
        List<String> list2;
        Map<String, List<String>> headerFields = httpConnection.getHeaderFields();
        if (headerFields == null || (list2 = headerFields.get("Content-Disposition")) == null || list2.size() <= 0) {
            str2 = null;
        } else {
            str2 = null;
            for (String str3 : list2.get(0).split(i.f11097b)) {
                if (str3.trim().startsWith(g.b.f62788b)) {
                    String[] split = str3.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split.length >= 2) {
                        str2 = split[1];
                        if (!TextUtils.isEmpty(str2) && str2.startsWith("\"") && str2.endsWith("\"")) {
                            str2 = str2.substring(1, str2.length() - 1);
                        }
                    }
                }
            }
        }
        if (str2 != null) {
            return str2;
        }
        String MD5 = Data.MD5(str);
        if (headerFields != null && (list = headerFields.get("Content-Type")) != null && list.size() > 0) {
            String str4 = list.get(0);
            String trim = str4 == null ? "" : str4.trim();
            if (trim.startsWith("image/")) {
                String substring = trim.substring(6);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(MD5);
                sb2.append(".");
                if ("jpeg".equals(substring)) {
                    substring = "jpg";
                }
                sb2.append(substring);
                return sb2.toString();
            }
            int lastIndexOf2 = str.lastIndexOf(47);
            String substring2 = lastIndexOf2 > 0 ? str.substring(lastIndexOf2 + 1) : null;
            if (substring2 != null && substring2.length() > 0 && (lastIndexOf = substring2.lastIndexOf(46)) > 0 && substring2.length() - lastIndexOf < 10) {
                return MD5 + substring2.substring(lastIndexOf);
            }
        }
        return MD5;
    }

    public static Bitmap blur(Bitmap bitmap, int i11, int i12) {
        float f11 = i12;
        int i13 = (int) ((i11 / f11) + 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap((int) ((bitmap.getWidth() / f11) + 0.5f), (int) ((bitmap.getHeight() / f11) + 0.5f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f12 = 1.0f / f11;
        canvas.scale(f12, f12);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        a(createBitmap, i13, true);
        return createBitmap;
    }

    public static Bitmap captureView(View view, int i11, int i12) throws Throwable {
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i11) {
        return compressByQuality(bitmap, i11, false);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i11, int i12, int i13, int i14) throws Throwable {
        int width = (bitmap.getWidth() - i11) - i13;
        int height = (bitmap.getHeight() - i12) - i14;
        if (width == bitmap.getWidth() && height == bitmap.getHeight()) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, -i11, -i12, new Paint());
        return createBitmap;
    }

    public static String downloadBitmap(Context context, final String str) throws Throwable {
        final String cachePath = ResHelper.getCachePath(context, "images");
        File file = new File(cachePath, Data.MD5(str));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        final HashMap hashMap = new HashMap();
        new NetworkHelper().rawGet(str, new HttpResponseCallback() { // from class: com.mob.tools.utils.BitmapHelper.1
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                int responseCode = httpConnection.getResponseCode();
                if (responseCode != 200) {
                    StringBuilder sb2 = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8")));
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        if (sb2.length() > 0) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                    }
                    bufferedReader.close();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(j.a("005gBbfbfcabf"), sb2.toString());
                    hashMap2.put(j.a("0063deWb!bd8b$bade"), Integer.valueOf(responseCode));
                    throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                }
                String b11 = BitmapHelper.b(httpConnection, str);
                File file2 = new File(cachePath, b11);
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                if (file2.exists()) {
                    file2.delete();
                }
                try {
                    Bitmap bitmap = BitmapHelper.getBitmap(new FilterInputStream(httpConnection.getInputStream()) { // from class: com.mob.tools.utils.BitmapHelper.1.1
                        @Override // java.io.FilterInputStream, java.io.InputStream
                        public long skip(long j11) throws IOException {
                            long j12 = 0;
                            while (j12 < j11) {
                                long skip = ((FilterInputStream) this).in.skip(j11 - j12);
                                if (skip == 0) {
                                    break;
                                }
                                j12 += skip;
                            }
                            return j12;
                        }
                    }, 1);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    if (b11.toLowerCase().endsWith(".gif") || b11.toLowerCase().endsWith(GuideActivity.f17949k)) {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    } else {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    hashMap.put("bitmap", file2.getAbsolutePath());
                } catch (Throwable th2) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    throw th2;
                }
            }
        }, (NetworkHelper.NetworkTimeOut) null);
        return (String) hashMap.get("bitmap");
    }

    public static int[] fixRect(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[2];
        int i11 = iArr[0];
        int i12 = iArr[1];
        float f11 = i11 / i12;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        if (f11 > i13 / i14) {
            iArr3[0] = i13;
            iArr3[1] = (int) (((i12 * iArr2[0]) / iArr[0]) + 0.5f);
            return iArr3;
        }
        iArr3[1] = i14;
        iArr3[0] = (int) (((i11 * iArr2[1]) / iArr[1]) + 0.5f);
        return iArr3;
    }

    public static int[] fixRect_2(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[2];
        int i11 = iArr[0];
        int i12 = iArr[1];
        float f11 = i11 / i12;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        if (f11 > i13 / i14) {
            iArr3[1] = i14;
            iArr3[0] = (int) (((i11 * iArr2[1]) / iArr[1]) + 0.5f);
            return iArr3;
        }
        iArr3[0] = i13;
        iArr3[1] = (int) (((i12 * iArr2[0]) / iArr[0]) + 0.5f);
        return iArr3;
    }

    public static Bitmap getBitmap(String str, int i11) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getBitmap(new File(str), i11);
    }

    public static Bitmap getBitmapByCompressQuality(String str, int i11, int i12, int i13, long j11) throws Throwable {
        Bitmap bitmapByCompressSize = getBitmapByCompressSize(str, i11, i12);
        if (i13 < 10 || i13 > 100) {
            i13 = 100;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat bmpFormat = getBmpFormat(str);
        bitmapByCompressSize.compress(bmpFormat, i13, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (j11 < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused) {
            }
            return decodeByteArray;
        }
        while (byteArray.length > j11 && i13 >= 11) {
            byteArrayOutputStream.reset();
            i13 -= 6;
            bitmapByCompressSize.compress(bmpFormat, i13, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (i13 != 100) {
            bitmapByCompressSize = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable unused2) {
        }
        return bitmapByCompressSize;
    }

    public static Bitmap getBitmapByCompressSize(String str, int i11, int i12) throws Throwable {
        int i13;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i14 = options.outWidth;
        int i15 = options.outHeight;
        if (i11 <= 1 || i12 <= 1) {
            i13 = 1;
        } else {
            float f11 = 1.0f;
            float min = (Math.min(i14, i15) * 1.0f) / Math.min(i11, i12);
            float max = (Math.max(i14, i15) * 1.0f) / Math.max(i11, i12);
            float f12 = i14 / i15;
            if (f12 <= 2.0f && f12 >= 0.5d) {
                float min2 = Math.min(min, max);
                while (true) {
                    float f13 = f11 * 2.0f;
                    if (f13 > min2) {
                        break;
                    }
                    f11 = f13;
                }
            } else {
                while (true) {
                    float f14 = f11 * 2.0f;
                    if (f14 > min) {
                        break;
                    }
                    f11 = f14;
                }
            }
            i13 = (int) f11;
        }
        int i16 = i13 >= 1 ? i13 : 1;
        while (true) {
            if (i14 / i16 <= f41376a && i15 / i16 <= f41377b) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inPreferredConfig = Bitmap.Config.RGB_565;
                options2.inSampleSize = i16;
                return BitmapFactory.decodeFile(str, options2);
            }
            i16++;
        }
    }

    public static Bitmap.CompressFormat getBmpFormat(byte[] bArr) {
        String a11 = a(bArr);
        return (a11 == null || !(a11.endsWith("png") || a11.endsWith("gif"))) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
    }

    public static String getMime(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[8];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return a(bArr);
        } catch (Exception e11) {
            MobLog.getInstance().w(e11);
            return "";
        }
    }

    public static boolean isBlackBitmap(Bitmap bitmap) throws Throwable {
        if (bitmap == null || bitmap.isRecycled()) {
            return true;
        }
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= width) {
                break;
            }
            if ((iArr[i11] & 16777215) != 0) {
                z11 = true;
                break;
            }
            i11++;
        }
        return !z11;
    }

    public static int mixAlpha(int i11, int i12) {
        int i13 = i11 >>> 24;
        int i14 = 255 - i13;
        return ((((((i11 & GeneratedTexture.f39227d) >>> 16) * i13) + (((16711680 & i12) >>> 16) * i14)) / 255) << 16) | (-16777216) | ((((((i11 & 65280) >>> 8) * i13) + (((65280 & i12) >>> 8) * i14)) / 255) << 8) | (((i13 * (i11 & 255)) + (i14 * (i12 & 255))) / 255);
    }

    public static Bitmap roundBitmap(Bitmap bitmap, int i11, int i12, float f11, float f12, float f13, float f14) throws Throwable {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = new Rect(0, 0, width, height);
        Bitmap createBitmap = (width == i11 && height == i12) ? Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect2 = new Rect(0, 0, i11, i12);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        float[] fArr = {f11, f11, f12, f12, f13, f13, f14, f14};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr));
        shapeDrawable.setBounds(rect2);
        shapeDrawable.draw(canvas);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, FileUtils.getFileByPath(str), compressFormat, false);
    }

    public static String saveBitmap(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11) throws Throwable {
        File file = new File(ResHelper.getCachePath(context, "images"), String.valueOf(System.currentTimeMillis()) + (compressFormat == Bitmap.CompressFormat.PNG ? GuideActivity.f17949k : ".jpg"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(compressFormat, i11, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file.getAbsolutePath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x000c, code lost:
    
        if (r8 < 10) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String saveBitmapByCompress(java.lang.String r5, int r6, int r7, int r8) throws java.lang.Throwable {
        /*
            android.graphics.Bitmap r6 = getBitmapByCompressSize(r5, r6, r7)
            r7 = 100
            if (r8 <= r7) goto La
        L8:
            r8 = r7
            goto Lf
        La:
            r7 = 10
            if (r8 >= r7) goto Lf
            goto L8
        Lf:
            android.graphics.Bitmap$CompressFormat r7 = getBmpFormat(r5)
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            if (r7 != r0) goto L1a
            java.lang.String r0 = ".png"
            goto L1c
        L1a:
            java.lang.String r0 = ".jpg"
        L1c:
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            java.lang.String r5 = r2.getParent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r5, r0)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r1)
            r6.compress(r7, r8, r5)
            r5.flush()
            r5.close()
            java.lang.String r5 = r1.getAbsolutePath()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.BitmapHelper.saveBitmapByCompress(java.lang.String, int, int, int):java.lang.String");
    }

    public static String saveViewToImage(View view) throws Throwable {
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return saveViewToImage(view, width, height);
    }

    public static Bitmap scaleBitmapByHeight(Context context, int i11, int i12) throws Throwable {
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i11);
        boolean z11 = i12 != decodeResource.getHeight();
        Bitmap scaleBitmapByHeight = scaleBitmapByHeight(decodeResource, i12);
        if (z11) {
            decodeResource.recycle();
        }
        return scaleBitmapByHeight;
    }

    private static Bitmap a(Bitmap bitmap, int i11, boolean z11) {
        int i12;
        int i13 = i11;
        Bitmap copy = z11 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i13 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i15 = width - 1;
        int i16 = height - 1;
        int i17 = i13 + i13;
        int i18 = i17 + 1;
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[Math.max(width, height)];
        int i19 = (i17 + 2) >> 1;
        int i21 = i19 * i19;
        int i22 = i21 * 256;
        int[] iArr6 = new int[i22];
        int i23 = 0;
        for (int i24 = 0; i24 < i22; i24++) {
            iArr6[i24] = i24 / i21;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i18, 3);
        int i25 = i13 + 1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < height) {
            int[] iArr8 = iArr6;
            int i29 = -i13;
            int i31 = i23;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            int i37 = i36;
            int i38 = i37;
            int i39 = i38;
            while (i29 <= i13) {
                int[] iArr9 = iArr4;
                Bitmap bitmap2 = copy;
                int i41 = i23;
                int i42 = iArr[i27 + Math.min(i15, Math.max(i29, i41))];
                int[] iArr10 = iArr7[i29 + i13];
                iArr10[i41] = (i42 & GeneratedTexture.f39227d) >> 16;
                iArr10[1] = (i42 & 65280) >> 8;
                iArr10[2] = i42 & 255;
                int abs = i25 - Math.abs(i29);
                int i43 = iArr10[i41];
                i39 += i43 * abs;
                int i44 = iArr10[1];
                i31 += i44 * abs;
                int i45 = iArr10[2];
                i32 += abs * i45;
                if (i29 > 0) {
                    i36 += i43;
                    i37 += i44;
                    i38 += i45;
                } else {
                    i33 += i43;
                    i34 += i44;
                    i35 += i45;
                }
                i29++;
                iArr4 = iArr9;
                copy = bitmap2;
                i23 = 0;
            }
            int[] iArr11 = iArr4;
            Bitmap bitmap3 = copy;
            int i46 = i13;
            int i47 = 0;
            while (i47 < width) {
                iArr2[i27] = iArr8[i39];
                iArr3[i27] = iArr8[i31];
                iArr11[i27] = iArr8[i32];
                int i48 = i39 - i33;
                int i49 = i31 - i34;
                int i51 = i32 - i35;
                int[] iArr12 = iArr7[((i46 - i13) + i18) % i18];
                int i52 = i33 - iArr12[0];
                int i53 = i34 - iArr12[1];
                int i54 = i35 - iArr12[2];
                if (i26 == 0) {
                    i12 = i47;
                    iArr5[i12] = Math.min(i47 + i13 + 1, i15);
                } else {
                    i12 = i47;
                }
                int i55 = iArr[i28 + iArr5[i12]];
                int i56 = (i55 & GeneratedTexture.f39227d) >> 16;
                iArr12[0] = i56;
                int i57 = (i55 & 65280) >> 8;
                iArr12[1] = i57;
                int i58 = i55 & 255;
                iArr12[2] = i58;
                int i59 = i36 + i56;
                int i61 = i37 + i57;
                int i62 = i38 + i58;
                i39 = i48 + i59;
                i31 = i49 + i61;
                i32 = i51 + i62;
                i46 = (i46 + 1) % i18;
                int[] iArr13 = iArr7[i46 % i18];
                int i63 = iArr13[0];
                i33 = i52 + i63;
                int i64 = iArr13[1];
                i34 = i53 + i64;
                int i65 = iArr13[2];
                i35 = i54 + i65;
                i36 = i59 - i63;
                i37 = i61 - i64;
                i38 = i62 - i65;
                i27++;
                i47 = i12 + 1;
            }
            i28 += width;
            i26++;
            iArr6 = iArr8;
            iArr4 = iArr11;
            copy = bitmap3;
            i23 = 0;
        }
        int[] iArr14 = iArr6;
        int[] iArr15 = iArr4;
        Bitmap bitmap4 = copy;
        int i66 = 0;
        while (i66 < width) {
            int i67 = -i13;
            int i68 = i66;
            int i69 = i67 * width;
            int i71 = 0;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            int i79 = 0;
            while (i67 <= i13) {
                int max = Math.max(0, i69) + i68;
                int[] iArr16 = iArr7[i67 + i11];
                iArr16[0] = iArr2[max];
                iArr16[1] = iArr3[max];
                iArr16[2] = iArr15[max];
                int abs2 = i25 - Math.abs(i67);
                i79 += iArr2[max] * abs2;
                i71 += iArr3[max] * abs2;
                i72 += iArr15[max] * abs2;
                if (i67 > 0) {
                    i76 += iArr16[0];
                    i77 += iArr16[1];
                    i78 += iArr16[2];
                } else {
                    i73 += iArr16[0];
                    i74 += iArr16[1];
                    i75 += iArr16[2];
                }
                if (i67 < i16) {
                    i69 += width;
                }
                i67++;
                i13 = i11;
            }
            int i81 = i79;
            int i82 = i68;
            int i83 = i11;
            for (int i84 = 0; i84 < height; i84++) {
                iArr[i82] = (iArr[i82] & (-16777216)) | (iArr14[i81] << 16) | (iArr14[i71] << 8) | iArr14[i72];
                int i85 = i81 - i73;
                int i86 = i71 - i74;
                int i87 = i72 - i75;
                int[] iArr17 = iArr7[((i83 - i11) + i18) % i18];
                int i88 = i73 - iArr17[0];
                int i89 = i74 - iArr17[1];
                int i91 = i75 - iArr17[2];
                int i92 = i82;
                if (i68 == 0) {
                    iArr5[i84] = Math.min(i84 + i25, i16) * width;
                }
                int i93 = i68 + iArr5[i84];
                int i94 = iArr2[i93];
                iArr17[0] = i94;
                int i95 = iArr3[i93];
                iArr17[1] = i95;
                int i96 = iArr15[i93];
                iArr17[2] = i96;
                int i97 = i76 + i94;
                int i98 = i77 + i95;
                int i99 = i78 + i96;
                i81 = i85 + i97;
                i71 = i86 + i98;
                i72 = i87 + i99;
                i83 = (i83 + 1) % i18;
                int[] iArr18 = iArr7[i83];
                int i100 = iArr18[0];
                i73 = i88 + i100;
                int i101 = iArr18[1];
                i74 = i89 + i101;
                int i102 = iArr18[2];
                i75 = i91 + i102;
                i76 = i97 - i100;
                i77 = i98 - i101;
                i78 = i99 - i102;
                i82 = i92 + width;
            }
            i66 = i68 + 1;
            i13 = i11;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i11, boolean z11) {
        if (a(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z11 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z11) {
        boolean z12;
        if (a(bitmap) || !FileUtils.createFileByDeleteOldFile(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                z12 = bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                if (z11) {
                    try {
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        try {
                            MobLog.getInstance().d(th);
                            FileUtils.closeIO(bufferedOutputStream);
                            return z12;
                        } catch (Throwable th3) {
                            FileUtils.closeIO(bufferedOutputStream);
                            throw th3;
                        }
                    }
                }
                FileUtils.closeIO(bufferedOutputStream2);
                return z12;
            } catch (Throwable th4) {
                th = th4;
                z12 = false;
            }
        } catch (Throwable th5) {
            th = th5;
            z12 = false;
        }
    }

    public static Bitmap getBitmap(File file, int i11) throws Throwable {
        if (file == null || !file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        Bitmap bitmap = getBitmap(fileInputStream, i11);
        fileInputStream.close();
        return bitmap;
    }

    public static String saveViewToImage(View view, int i11, int i12) throws Throwable {
        Bitmap captureView = captureView(view, i11, i12);
        if (captureView == null || captureView.isRecycled()) {
            return null;
        }
        File file = new File(ResHelper.getCachePath(view.getContext(), "screenshot"), String.valueOf(System.currentTimeMillis()) + ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        captureView.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file.getAbsolutePath();
    }

    public static Bitmap.CompressFormat getBmpFormat(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("png") && !lowerCase.endsWith("gif")) {
            if (!lowerCase.endsWith("jpg") && !lowerCase.endsWith("jpeg") && !lowerCase.endsWith("bmp") && !lowerCase.endsWith("tif")) {
                String mime = getMime(str);
                if (!mime.endsWith("png") && !mime.endsWith("gif")) {
                    return Bitmap.CompressFormat.JPEG;
                }
                return Bitmap.CompressFormat.PNG;
            }
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.PNG;
    }

    public static Bitmap scaleBitmapByHeight(Bitmap bitmap, int i11) throws Throwable {
        return Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * i11) / bitmap.getHeight(), i11, true);
    }

    public static Bitmap getBitmap(InputStream inputStream, int i11) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i11;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j11) {
        return compressByQuality(bitmap, j11, false);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j11, boolean z11) {
        byte[] byteArray;
        if (a(bitmap) || j11 <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i11 = 100;
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j11) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArrayOutputStream.reset();
            bitmap.compress(compressFormat, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= j11) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    i13 = (i12 + i11) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i13, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j11) {
                        break;
                    }
                    if (size > j11) {
                        i11 = i13 - 1;
                    } else {
                        i12 = i13 + 1;
                    }
                }
                if (i11 == i13 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        if (z11 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static String saveBitmap(Context context, Bitmap bitmap) throws Throwable {
        return saveBitmap(context, bitmap, Bitmap.CompressFormat.JPEG, 80);
    }

    public static Bitmap getBitmap(String str) throws Throwable {
        return getBitmap(str, 1);
    }

    public static Bitmap getBitmap(Context context, String str) throws Throwable {
        return getBitmap(downloadBitmap(context, str));
    }

    private static String a(byte[] bArr) {
        byte[] bArr2 = {-1, -40, -1, -31};
        if (!a(bArr, new byte[]{-1, -40, -1, ws.c.f96768m}) && !a(bArr, bArr2)) {
            if (a(bArr, new byte[]{-119, 80, 78, 71})) {
                return "png";
            }
            if (a(bArr, "GIF".getBytes())) {
                return "gif";
            }
            if (a(bArr, "BM".getBytes())) {
                return "bmp";
            }
            byte[] bArr3 = {77, 77, 42};
            if (!a(bArr, new byte[]{73, 73, 42}) && !a(bArr, bArr3)) {
                return "";
            }
            return "tif";
        }
        return "jpg";
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }
}

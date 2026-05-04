package com.mob.tools.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mob.MobSDK;
import com.mob.commons.j;
import com.mob.commons.r;
import com.mob.tools.MobLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import u30.u0;

/* loaded from: classes7.dex */
public class ResHelper implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static float f41404a;

    /* renamed from: b, reason: collision with root package name */
    private static int f41405b;

    /* renamed from: c, reason: collision with root package name */
    private static Uri f41406c;

    public static void clearCache(Context context) throws Throwable {
        deleteFileAndFolder(new File(getCachePath(context, null)));
    }

    public static void closeIOs(Closeable... closeableArr) {
        if (closeableArr == null || closeableArr.length <= 0) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
    }

    public static boolean copyFile(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        try {
            copyFile(new FileInputStream(str), new FileOutputStream(str2));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Deprecated
    public static long dateStrToLong(String str) {
        return new SimpleDateFormat("yyyy-MM-dd").parse(str, new ParsePosition(0)).getTime();
    }

    @Deprecated
    public static long dateToLong(String str) {
        try {
            Date date = new Date(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.getTimeInMillis();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return 0L;
        }
    }

    @Deprecated
    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split.length < 2 || split[1] == null) {
                    bundle.putString(URLDecoder.decode(split[0]), "");
                } else {
                    bundle.putString(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
                }
            }
        }
        return bundle;
    }

    public static void deleteFileAndFolder(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            file.delete();
            return;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                deleteFileAndFolder(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public static int designToDevice(Context context, int i11, int i12) {
        if (f41405b == 0) {
            int[] screenSize = getScreenSize(context);
            int i13 = screenSize[0];
            int i14 = screenSize[1];
            if (i13 >= i14) {
                i13 = i14;
            }
            f41405b = i13;
        }
        return (int) (((i12 * f41405b) / i11) + 0.5f);
    }

    public static int dipToPx(Context context, int i11) {
        if (f41404a <= 0.0f) {
            f41404a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((i11 * f41404a) + 0.5f);
    }

    @Deprecated
    public static String encodeUrl(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "";
            }
            if (z11) {
                z11 = false;
            } else {
                sb2.append("&");
            }
            sb2.append(Data.urlEncode(str) + ContainerUtils.KEY_VALUE_DELIMITER + Data.urlEncode(String.valueOf(obj)));
        }
        return sb2.toString();
    }

    public static <T> T forceCast(Object obj) {
        return (T) forceCast(obj, null);
    }

    public static int getAnimRes(Context context, String str) {
        return getResId(context, "anim", str);
    }

    public static int getBitmapRes(Context context, String str) {
        int resId = getResId(context, "drawable", str);
        return resId <= 0 ? getResId(context, "mipmap", str) : resId;
    }

    public static String getCachePath(Context context, String str) {
        String str2 = context.getFilesDir().getAbsolutePath() + j.a("001e") + "MobSDK" + j.a("007e4bebdbeBage");
        DeviceHelper deviceHelper = DeviceHelper.getInstance(context);
        try {
            String sdcardPath = deviceHelper.getSdcardPath();
            if (sdcardPath != null) {
                str2 = sdcardPath + j.a("001e") + "MobSDK" + j.a("001e") + deviceHelper.getPackageName() + j.a("007e7bebdbe)age");
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + str + j.a("001e");
        }
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return str2;
    }

    public static String getCacheRoot(Context context) {
        return getCacheRoot(context, false);
    }

    public static File getCacheRootFile(Context context, String str) {
        try {
            String cacheRoot = getCacheRoot(context);
            if (cacheRoot == null) {
                return null;
            }
            File file = new File(cacheRoot, str);
            if (file.getParentFile().exists() && file.getParentFile().isDirectory()) {
                return file;
            }
            file.getParentFile().delete();
            file.getParentFile().mkdirs();
            return file;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static int getColorRes(Context context, String str) {
        return getResId(context, "color", str);
    }

    public static String getDataCache(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + j.a("001e") + "MobSDK";
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            return str;
        }
        file.delete();
        file.mkdirs();
        return str;
    }

    public static File getDataCacheFile(Context context, String str) {
        return new File(getDataCache(context), str);
    }

    public static float getDensity(Context context) {
        if (f41404a <= 0.0f) {
            f41404a = context.getResources().getDisplayMetrics().density;
        }
        return f41404a;
    }

    public static int getDensityDpi(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static float[] getDensityXYDpi(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new float[]{displayMetrics.xdpi, displayMetrics.ydpi};
    }

    @Deprecated
    public static long getFileSize(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return getFileSize(new File(str));
    }

    public static int getIdRes(Context context, String str) {
        return getResId(context, j.a("002<bc=f"), str);
    }

    public static String getImageCachePath(Context context) {
        return getCachePath(context, "images");
    }

    public static int getLayoutRes(Context context, String str) {
        return getResId(context, j.a("006Zcbbdbgcaba'b"), str);
    }

    @Deprecated
    public static synchronized Uri getMediaUri(Context context, String str, String str2) {
        Uri uri;
        synchronized (ResHelper.class) {
            final Object obj = new Object();
            f41406c = null;
            MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{str2}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.mob.tools.utils.ResHelper.1
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str3, Uri uri2) {
                    Uri unused = ResHelper.f41406c = uri2;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            });
            try {
                if (f41406c == null) {
                    synchronized (obj) {
                        obj.wait(10000L);
                    }
                }
            } catch (Throwable unused) {
            }
            uri = f41406c;
            f41406c = null;
        }
        return uri;
    }

    public static int getRawRes(Context context, String str) {
        return getResId(context, "raw", str);
    }

    public static int getResId(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier(str2, str, packageName);
        if (identifier <= 0) {
            identifier = context.getResources().getIdentifier(str2.toLowerCase(), str, packageName);
        }
        if (identifier <= 0) {
            MobLog.getInstance().w("failed to parse " + str + " resource \"" + str2 + "\"");
        }
        return identifier;
    }

    public static int getScreenHeight(Context context) {
        return getScreenSize(context)[1];
    }

    public static int[] getScreenSize(Context context) {
        WindowManager windowManager;
        Display display = null;
        try {
            windowManager = (WindowManager) DeviceHelper.getInstance(context).getSystemServiceSafe("window");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            windowManager = null;
        }
        if (windowManager == null) {
            return new int[]{0, 0};
        }
        try {
            display = windowManager.getDefaultDisplay();
        } catch (Throwable th3) {
            MobLog.getInstance().w(th3);
        }
        if (display == null) {
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
            } catch (Throwable th4) {
                MobLog.getInstance().w(th4);
                return new int[]{0, 0};
            }
        }
        try {
            Point point = new Point();
            Method method = display.getClass().getMethod(j.a("011Vdd4gb.ebOg!bdcbcfbcdjOg"), Point.class);
            method.setAccessible(true);
            method.invoke(display, point);
            return new int[]{point.x, point.y};
        } catch (Throwable th5) {
            MobLog.getInstance().w(th5);
            return new int[]{0, 0};
        }
    }

    public static int getScreenWidth(Context context) {
        return getScreenSize(context)[0];
    }

    public static int getStringArrayRes(Context context, String str) {
        return getResId(context, "array", str);
    }

    public static int getStringRes(Context context, String str) {
        return getResId(context, TypedValues.Custom.S_STRING, str);
    }

    public static int getStyleRes(Context context, String str) {
        return getResId(context, "style", str);
    }

    public static int[] getStyleableRes(Context context, String str) {
        try {
            Object staticField = ReflectHelper.getStaticField(ReflectHelper.importClass(context.getPackageName() + ".R$styleable"), str);
            return staticField == null ? new int[0] : staticField.getClass().isArray() ? (int[]) staticField : new int[]{((Integer) staticField).intValue()};
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return new int[0];
        }
    }

    public static <T> boolean isEqual(T t11, T t12) {
        return !((t11 == null && t12 != null) || !(t11 == null || t11.equals(t12)));
    }

    @Deprecated
    public static int parseInt(String str) throws Throwable {
        return parseInt(str, 10);
    }

    @Deprecated
    public static long parseLong(String str) throws Throwable {
        return parseLong(str, 10);
    }

    @Deprecated
    public static Uri pathToContentUri(Context context, String str) {
        try {
            if (!DeviceHelper.getInstance(context).checkPermission(j.a("040%bdbi2f-bfcabc(fJcj@cg:bfFj6bcdedebccabicjebeachdgbbeafecgeaebcdchcibbcfcgdiebchfiea"))) {
                return null;
            }
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Cursor query = contentResolver.query(uri, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
            if (query == null || !query.moveToFirst()) {
                if (!new File(str).exists()) {
                    return null;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("_data", str);
                return context.getContentResolver().insert(uri, contentValues);
            }
            int i11 = query.getInt(query.getColumnIndex("_id"));
            return Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i11);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static int pxToDip(Context context, int i11) {
        if (f41404a <= 0.0f) {
            f41404a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((i11 / f41404a) + 0.5f);
    }

    public static ArrayList<HashMap<String, String>> readArrayListFromFile(String str) {
        return readArrayListFromFile(str, false);
    }

    public static <T> T readEncodedData(String str, Class<T> cls) {
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str);
        if (!dataCacheFile.exists()) {
            return null;
        }
        try {
            return (T) HashonHelper.fromJson(Data.AES128Decode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), (byte[]) readObjectFromFile(dataCacheFile.getAbsolutePath())), cls);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public static long readLongFromFile(String str) {
        Throwable th2;
        DataInputStream dataInputStream;
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str);
        if (!dataCacheFile.exists()) {
            return 0L;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(dataCacheFile));
            try {
                long readLong = dataInputStream.readLong();
                r.a(dataInputStream);
                return readLong;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    MobLog.getInstance().d(th2);
                    r.a(dataInputStream);
                    return 0L;
                } catch (Throwable th4) {
                    r.a(dataInputStream);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            dataInputStream = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r0.exists() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object readObjectFromFile(java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto L71
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L13
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L13
            boolean r9 = r0.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 != 0) goto L1c
            goto L1b
        L13:
            r9 = move-exception
            com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
            r0.d(r9)
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L71
            r9 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4d
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L49
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r7 = r6.readObject()     // Catch: java.lang.Throwable -> L44
            r6.close()     // Catch: java.lang.Throwable -> L44
            java.io.Closeable[] r1 = new java.io.Closeable[r4]
            r1[r3] = r6
            r1[r2] = r0
            r1[r9] = r5
            closeIOs(r1)
            return r7
        L44:
            r7 = move-exception
            goto L51
        L46:
            r7 = move-exception
            r6 = r1
            goto L51
        L49:
            r7 = move-exception
            r0 = r1
            r6 = r0
            goto L51
        L4d:
            r7 = move-exception
            r0 = r1
            r5 = r0
            r6 = r5
        L51:
            com.mob.tools.log.NLog r8 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L64
            r8.d(r7)     // Catch: java.lang.Throwable -> L64
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r3] = r6
            r4[r2] = r0
            r4[r9] = r5
            closeIOs(r4)
            goto L71
        L64:
            r1 = move-exception
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r3] = r6
            r4[r2] = r0
            r4[r9] = r5
            closeIOs(r4)
            throw r1
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.ResHelper.readObjectFromFile(java.lang.String):java.lang.Object");
    }

    public static boolean saveAndEncodeData(String str, Object obj) {
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str);
        try {
            if (obj == null) {
                dataCacheFile.delete();
                return true;
            }
            return saveObjectToFile(dataCacheFile.getAbsolutePath(), Data.AES128Encode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), HashonHelper.fromObject(obj)));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    public static void saveArrayListToFile(ArrayList<HashMap<String, String>> arrayList, String str) {
        saveArrayListToFile(arrayList, str, false);
    }

    public static boolean saveLongToFile(long j11, String str) {
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(getDataCacheFile(MobSDK.getContext(), str)));
            try {
                dataOutputStream2.writeLong(j11);
                dataOutputStream2.flush();
                r.a(dataOutputStream2);
                return true;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                try {
                    MobLog.getInstance().d(th);
                    r.a(dataOutputStream);
                    return false;
                } catch (Throwable th3) {
                    r.a(dataOutputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean saveObjectToFile(String str, Object obj) {
        File file;
        GZIPOutputStream gZIPOutputStream;
        ObjectOutputStream objectOutputStream;
        if (!TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream = null;
            try {
                file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                file = null;
            }
            if (obj == null) {
                return true;
            }
            if (!file.getParentFile().exists() || !file.getParentFile().isDirectory()) {
                file.getParentFile().delete();
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            if (file != null) {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(fileOutputStream2);
                        try {
                            objectOutputStream = new ObjectOutputStream(gZIPOutputStream);
                            try {
                                objectOutputStream.writeObject(obj);
                                objectOutputStream.flush();
                                objectOutputStream.close();
                                closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream2);
                                return true;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = fileOutputStream2;
                                try {
                                    MobLog.getInstance().d(th);
                                    closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream);
                                    return false;
                                } catch (Throwable th4) {
                                    closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            objectOutputStream = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        gZIPOutputStream = null;
                        objectOutputStream = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    gZIPOutputStream = null;
                    objectOutputStream = null;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static long strToDate(String str) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str, new ParsePosition(0)).getTime();
    }

    @Deprecated
    public static Bundle urlToBundle(String str) {
        String str2;
        int indexOf = str.indexOf("://");
        if (indexOf >= 0) {
            str2 = j.a("007abbcdee") + str.substring(indexOf + 1);
        } else {
            str2 = j.a("007abbcdee") + str;
        }
        try {
            URL url = new URL(str2);
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return new Bundle();
        }
    }

    @Deprecated
    public static Uri videoPathToContentUri(Context context, String str) {
        try {
            if (!DeviceHelper.getInstance(context).checkPermission(j.a("0401bdbiIf>bfcabc%f4cjTcg0bfFj7bcdedebccabicjebeachdgbbeafecgeaebcdchcibbcfcgdiebchfiea"))) {
                return null;
            }
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            Cursor query = contentResolver.query(uri, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
            if (query == null || !query.moveToFirst()) {
                if (!new File(str).exists()) {
                    return null;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("_data", str);
                return context.getContentResolver().insert(uri, contentValues);
            }
            int i11 = query.getInt(query.getColumnIndex("_id"));
            return Uri.withAppendedPath(Uri.parse("content://media/external/video/media"), "" + i11);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T forceCast(Object obj, T t11) {
        if (obj != 0) {
            try {
                if (obj instanceof Integer) {
                    return t11 instanceof Long ? (T) Long.valueOf(((Integer) obj).intValue()) : obj;
                }
                return obj;
            } catch (Throwable unused) {
            }
        }
        return t11;
    }

    public static String getCacheRoot(Context context, boolean z11) {
        String dataCache;
        if (z11) {
            dataCache = null;
        } else {
            try {
                dataCache = getDataCache(context);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                return null;
            }
        }
        String sdcardPath = DeviceHelper.getInstance(context).getSdcardPath();
        if (sdcardPath != null) {
            dataCache = sdcardPath + j.a("001e") + "MobSDK";
        }
        if (TextUtils.isEmpty(dataCache)) {
            return null;
        }
        File file = new File(dataCache);
        if (file.exists() && file.isDirectory()) {
            return dataCache;
        }
        file.delete();
        file.mkdirs();
        return dataCache;
    }

    @Deprecated
    public static int parseInt(String str, int i11) throws Throwable {
        return Integer.parseInt(str, i11);
    }

    @Deprecated
    public static long parseLong(String str, int i11) throws Throwable {
        return Long.parseLong(str, i11);
    }

    public static ArrayList<HashMap<String, String>> readArrayListFromFile(String str, boolean z11) {
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str);
        if (dataCacheFile.exists()) {
            BufferedReader bufferedReader = null;
            try {
                ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(dataCacheFile)), "utf-8"));
                try {
                    String readLine = bufferedReader2.readLine();
                    while (readLine != null) {
                        if (z11) {
                            readLine = new String(Base64.decode(readLine, 2), "utf-8");
                        }
                        arrayList.add(HashonHelper.fromJson(readLine));
                        readLine = bufferedReader2.readLine();
                    }
                    closeIOs(bufferedReader2);
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        MobLog.getInstance().d(th);
                        closeIOs(bufferedReader);
                        return new ArrayList<>();
                    } catch (Throwable th3) {
                        closeIOs(bufferedReader);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return new ArrayList<>();
    }

    public static void saveArrayListToFile(ArrayList<HashMap<String, String>> arrayList, String str, boolean z11) {
        OutputStreamWriter outputStreamWriter = null;
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(getDataCacheFile(MobSDK.getContext(), str))), "utf-8");
            try {
                Iterator<HashMap<String, String>> it = arrayList.iterator();
                while (it.hasNext()) {
                    String fromHashMap = HashonHelper.fromHashMap(it.next());
                    if (z11) {
                        fromHashMap = new String(Base64.encode(fromHashMap.getBytes("utf-8"), 2), "utf-8");
                    }
                    outputStreamWriter2.append((CharSequence) fromHashMap).append('\n');
                }
                closeIOs(outputStreamWriter2);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = outputStreamWriter2;
                try {
                    MobLog.getInstance().d(th);
                    closeIOs(outputStreamWriter);
                } catch (Throwable th3) {
                    closeIOs(outputStreamWriter);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Deprecated
    public static long getFileSize(File file) throws Throwable {
        if (!file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            int i11 = 0;
            for (String str : file.list()) {
                i11 = (int) (i11 + getFileSize(new File(file, str)));
            }
            return i11;
        }
        return file.length();
    }

    public static int designToDevice(Context context, float f11, int i11) {
        if (f41404a <= 0.0f) {
            f41404a = context.getResources().getDisplayMetrics().density;
        }
        return (int) (((i11 * f41404a) / f11) + 0.5f);
    }

    public static void copyFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws Throwable {
        byte[] bArr = new byte[65536];
        int read = fileInputStream.read(bArr);
        while (read > 0) {
            fileOutputStream.write(bArr, 0, read);
            read = fileInputStream.read(bArr);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    @Deprecated
    public static String encodeUrl(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<KVPair<String>> it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            if (i11 > 0) {
                sb2.append(u0.f91708d);
            }
            String str = next.name;
            String str2 = next.value;
            if (str != null) {
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(Data.urlEncode(str) + ContainerUtils.KEY_VALUE_DELIMITER + Data.urlEncode(str2));
                i11++;
            }
        }
        return sb2.toString();
    }
}

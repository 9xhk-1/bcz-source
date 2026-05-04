package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    private static final int ASHMEM_MODE = 8;
    private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final Set<Long> checkedHandleSet;
    private static MMKVHandler gCallbackHandler;
    private static MMKVContentChangeNotification gContentChangeNotify;
    private static boolean gWantLogReDirecting;
    private static final MMKVLogLevel[] index2LogLevel;
    private static final EnumMap<MMKVLogLevel, Integer> logLevel2Index;
    private static final HashMap<String, Parcelable.Creator<?>> mCreators;
    private static final EnumMap<MMKVRecoverStrategic, Integer> recoverIndex;
    private static String rootDir;
    private final long nativeHandle;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.mmkv.MMKV$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mmkv$MMKVLogLevel;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            $SwitchMap$com$tencent$mmkv$MMKVLogLevel = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface LibLoader {
        void loadLibrary(String str);
    }

    static {
        EnumMap<MMKVRecoverStrategic, Integer> enumMap = new EnumMap<>((Class<MMKVRecoverStrategic>) MMKVRecoverStrategic.class);
        recoverIndex = enumMap;
        enumMap.put((EnumMap<MMKVRecoverStrategic, Integer>) MMKVRecoverStrategic.OnErrorDiscard, (MMKVRecoverStrategic) 0);
        enumMap.put((EnumMap<MMKVRecoverStrategic, Integer>) MMKVRecoverStrategic.OnErrorRecover, (MMKVRecoverStrategic) 1);
        EnumMap<MMKVLogLevel, Integer> enumMap2 = new EnumMap<>((Class<MMKVLogLevel>) MMKVLogLevel.class);
        logLevel2Index = enumMap2;
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelDebug;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel, (MMKVLogLevel) 0);
        MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel2, (MMKVLogLevel) 1);
        MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelWarning;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel3, (MMKVLogLevel) 2);
        MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.LevelError;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel4, (MMKVLogLevel) 3);
        MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.LevelNone;
        enumMap2.put((EnumMap<MMKVLogLevel, Integer>) mMKVLogLevel5, (MMKVLogLevel) 4);
        index2LogLevel = new MMKVLogLevel[]{mMKVLogLevel, mMKVLogLevel2, mMKVLogLevel3, mMKVLogLevel4, mMKVLogLevel5};
        checkedHandleSet = Collections.synchronizedSet(new HashSet());
        rootDir = null;
        mCreators = new HashMap<>();
        gWantLogReDirecting = false;
    }

    private MMKV(long j11) {
        this.nativeHandle = j11;
    }

    @Nullable
    private static MMKV checkProcessMode(long j11, String str, int i11) {
        String str2;
        if (j11 == 0) {
            return null;
        }
        Set<Long> set = checkedHandleSet;
        if (!set.contains(Long.valueOf(j11))) {
            if (!checkProcessMode(j11)) {
                if (i11 == 1) {
                    str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                } else {
                    str2 = ("Opening a MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                }
                throw new IllegalArgumentException(str2);
            }
            set.add(Long.valueOf(j11));
        }
        return new MMKV(j11);
    }

    private static native boolean checkProcessMode(long j11);

    private native boolean containsKey(long j11, String str);

    private native long count(long j11);

    private static native long createNB(int i11);

    public static NativeBuffer createNativeBuffer(int i11) {
        long createNB = createNB(i11);
        if (createNB <= 0) {
            return null;
        }
        return new NativeBuffer(createNB, i11);
    }

    private native boolean decodeBool(long j11, String str, boolean z11);

    @Nullable
    private native byte[] decodeBytes(long j11, String str);

    private native double decodeDouble(long j11, String str, double d11);

    private native float decodeFloat(long j11, String str, float f11);

    private native int decodeInt(long j11, String str, int i11);

    private native long decodeLong(long j11, String str, long j12);

    @Nullable
    private native String decodeString(long j11, String str, @Nullable String str2);

    @Nullable
    private native String[] decodeStringSet(long j11, String str);

    @Nullable
    public static MMKV defaultMMKV() {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(1, null), "DefaultMMKV", 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static native void destroyNB(long j11, int i11);

    public static void destroyNativeBuffer(NativeBuffer nativeBuffer) {
        destroyNB(nativeBuffer.pointer, nativeBuffer.size);
    }

    private native boolean encodeBool(long j11, String str, boolean z11);

    private native boolean encodeBytes(long j11, String str, @Nullable byte[] bArr);

    private native boolean encodeDouble(long j11, String str, double d11);

    private native boolean encodeFloat(long j11, String str, float f11);

    private native boolean encodeInt(long j11, String str, int i11);

    private native boolean encodeLong(long j11, String str, long j12);

    private native boolean encodeSet(long j11, String str, @Nullable String[] strArr);

    private native boolean encodeString(long j11, String str, @Nullable String str2);

    private static native long getDefaultMMKV(int i11, @Nullable String str);

    private static native long getMMKVWithAshmemFD(String str, int i11, int i12, @Nullable String str2);

    private static native long getMMKVWithID(String str, int i11, @Nullable String str2, @Nullable String str3);

    private static native long getMMKVWithIDAndSize(String str, int i11, int i12, @Nullable String str2);

    public static String getRootDir() {
        return rootDir;
    }

    public static String initialize(Context context) {
        return initialize(context.getFilesDir().getAbsolutePath() + "/mmkv", (LibLoader) null, MMKVLogLevel.LevelInfo);
    }

    public static native boolean isFileValid(String str);

    private static native void jniInitialize(String str, int i11);

    private static int logLevel2Int(MMKVLogLevel mMKVLogLevel) {
        int i11 = AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[mMKVLogLevel.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        int i12 = 2;
        if (i11 != 2) {
            i12 = 3;
            if (i11 != 3) {
                i12 = 4;
                if (i11 != 4) {
                    return 1;
                }
            }
        }
        return i12;
    }

    private static void mmkvLogImp(int i11, String str, int i12, String str2, String str3) {
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null && gWantLogReDirecting) {
            mMKVHandler.mmkvLog(index2LogLevel[i11], str, i12, str2, str3);
            return;
        }
        int i13 = AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[index2LogLevel[i11].ordinal()];
        if (i13 == 1) {
            Log.d("MMKV", str3);
            return;
        }
        if (i13 == 2) {
            Log.w("MMKV", str3);
        } else if (i13 == 3) {
            Log.e("MMKV", str3);
        } else {
            if (i13 != 5) {
                return;
            }
            Log.i("MMKV", str3);
        }
    }

    public static MMKV mmkvWithAshmemFD(String str, int i11, int i12, String str2) {
        return new MMKV(getMMKVWithAshmemFD(str, i11, i12, str2));
    }

    @Nullable
    public static MMKV mmkvWithAshmemID(Context context, String str, int i11, int i12, @Nullable String str2) {
        if (rootDir == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        String processNameByPID = MMKVContentProvider.getProcessNameByPID(context, Process.myPid());
        if (processNameByPID == null || processNameByPID.length() == 0) {
            simpleLog(MMKVLogLevel.LevelError, "process name detect fail, try again later");
            return null;
        }
        if (!processNameByPID.contains(":")) {
            simpleLog(MMKVLogLevel.LevelInfo, "getting mmkv in main process");
            return new MMKV(getMMKVWithIDAndSize(str, i11, i12 | 8, str2));
        }
        Uri contentUri = MMKVContentProvider.contentUri(context);
        if (contentUri == null) {
            simpleLog(MMKVLogLevel.LevelError, "MMKVContentProvider has invalid authority");
            return null;
        }
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
        simpleLog(mMKVLogLevel, "getting parcelable mmkv in process, Uri = " + contentUri);
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SIZE", i11);
        bundle.putInt("KEY_MODE", i12);
        if (str2 != null) {
            bundle.putString("KEY_CRYPT", str2);
        }
        Bundle call = context.getContentResolver().call(contentUri, "mmkvFromAshmemID", str, bundle);
        if (call != null) {
            call.setClassLoader(ParcelableMMKV.class.getClassLoader());
            ParcelableMMKV parcelableMMKV = (ParcelableMMKV) call.getParcelable(a.h.C0249a.f16196a);
            if (parcelableMMKV != null) {
                MMKV mmkv = parcelableMMKV.toMMKV();
                if (mmkv != null) {
                    simpleLog(mMKVLogLevel, mmkv.mmapID() + " fd = " + mmkv.ashmemFD() + ", meta fd = " + mmkv.ashmemMetaFD());
                }
                return mmkv;
            }
        }
        return null;
    }

    @Nullable
    public static MMKV mmkvWithID(String str) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, 1, null, null), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static void onContentChangedByOuterProcess(String str) {
        MMKVContentChangeNotification mMKVContentChangeNotification = gContentChangeNotify;
        if (mMKVContentChangeNotification != null) {
            mMKVContentChangeNotification.onContentChangedByOuterProcess(str);
        }
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategic = mMKVHandler.onMMKVCRCCheckFail(str);
        }
        simpleLog(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = recoverIndex.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategic = mMKVHandler.onMMKVFileLengthError(str);
        }
        simpleLog(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = recoverIndex.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static void registerContentChangeNotify(MMKVContentChangeNotification mMKVContentChangeNotification) {
        gContentChangeNotify = mMKVContentChangeNotification;
        setWantsContentChangeNotify(mMKVContentChangeNotification != null);
    }

    public static void registerHandler(MMKVHandler mMKVHandler) {
        gCallbackHandler = mMKVHandler;
        if (mMKVHandler.wantLogRedirecting()) {
            setCallbackHandler(true, true);
            gWantLogReDirecting = true;
        } else {
            setCallbackHandler(false, true);
            gWantLogReDirecting = false;
        }
    }

    private native void removeValueForKey(long j11, String str);

    private static native void setCallbackHandler(boolean z11, boolean z12);

    private static native void setLogLevel(int i11);

    public static void setLogLevel(MMKVLogLevel mMKVLogLevel) {
        setLogLevel(logLevel2Int(mMKVLogLevel));
    }

    private static native void setWantsContentChangeNotify(boolean z11);

    private static void simpleLog(MMKVLogLevel mMKVLogLevel, String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = logLevel2Index.get(mMKVLogLevel);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private native void sync(boolean z11);

    private native long totalSize(long j11);

    public static void unregisterContentChangeNotify() {
        gContentChangeNotify = null;
        setWantsContentChangeNotify(false);
    }

    public static void unregisterHandler() {
        gCallbackHandler = null;
        setCallbackHandler(false, false);
        gWantLogReDirecting = false;
    }

    private native int valueSize(long j11, String str, boolean z11);

    public static native String version();

    private native int writeValueToNB(long j11, String str, long j12, int i11);

    @Nullable
    public native String[] allKeys();

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public void async() {
        sync(false);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@Nullable String str);

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return containsKey(str);
    }

    public boolean containsKey(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public long count() {
        return count(this.nativeHandle);
    }

    @Nullable
    public native String cryptKey();

    public boolean decodeBool(String str) {
        return decodeBool(this.nativeHandle, str, false);
    }

    @Nullable
    public byte[] decodeBytes(String str) {
        return decodeBytes(str, (byte[]) null);
    }

    public double decodeDouble(String str) {
        return decodeDouble(this.nativeHandle, str, 0.0d);
    }

    public float decodeFloat(String str) {
        return decodeFloat(this.nativeHandle, str, 0.0f);
    }

    public int decodeInt(String str) {
        return decodeInt(this.nativeHandle, str, 0);
    }

    public long decodeLong(String str) {
        return decodeLong(this.nativeHandle, str, 0L);
    }

    @Nullable
    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls) {
        return (T) decodeParcelable(str, cls, null);
    }

    @Nullable
    public String decodeString(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    @Nullable
    public Set<String> decodeStringSet(String str) {
        return decodeStringSet(str, (Set<String>) null);
    }

    public boolean encode(String str, boolean z11) {
        return encodeBool(this.nativeHandle, str, z11);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z11) {
        return decodeBool(this.nativeHandle, str, z11);
    }

    public byte[] getBytes(String str, @Nullable byte[] bArr) {
        return decodeBytes(str, bArr);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f11) {
        return decodeFloat(this.nativeHandle, str, f11);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i11) {
        return decodeInt(this.nativeHandle, str, i11);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j11) {
        return decodeLong(this.nativeHandle, str, j11);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return decodeStringSet(str, set);
    }

    public int getValueActualSize(String str) {
        return valueSize(this.nativeHandle, str, true);
    }

    public int getValueSize(String str) {
        return valueSize(this.nativeHandle, str, false);
    }

    public int importFromSharedPreferences(SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null) {
                if (value != null) {
                    if (value instanceof Boolean) {
                        encodeBool(this.nativeHandle, key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        encodeInt(this.nativeHandle, key, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        encodeLong(this.nativeHandle, key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        encodeFloat(this.nativeHandle, key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        encodeDouble(this.nativeHandle, key, ((Double) value).doubleValue());
                    } else if (value instanceof String) {
                        encodeString(this.nativeHandle, key, (String) value);
                    } else if (value instanceof Set) {
                        encode(key, (Set<String>) value);
                    } else {
                        simpleLog(MMKVLogLevel.LevelError, "unknown type: " + value.getClass());
                    }
                }
            }
        }
        return all.size();
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z11) {
        encodeBool(this.nativeHandle, str, z11);
        return this;
    }

    public SharedPreferences.Editor putBytes(String str, @Nullable byte[] bArr) {
        encode(str, bArr);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f11) {
        encodeFloat(this.nativeHandle, str, f11);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i11) {
        encodeInt(this.nativeHandle, str, i11);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j11) {
        encodeLong(this.nativeHandle, str, j11);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, @Nullable String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        encode(str, set);
        return this;
    }

    public native boolean reKey(@Nullable String str);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        removeValueForKey(str);
        return this;
    }

    public void removeValueForKey(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native void removeValuesForKeys(String[] strArr);

    public void sync() {
        sync(true);
    }

    public long totalSize() {
        return totalSize(this.nativeHandle);
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public int writeValueToNativeBuffer(String str, NativeBuffer nativeBuffer) {
        return writeValueToNB(this.nativeHandle, str, nativeBuffer.pointer, nativeBuffer.size);
    }

    public boolean decodeBool(String str, boolean z11) {
        return decodeBool(this.nativeHandle, str, z11);
    }

    @Nullable
    public byte[] decodeBytes(String str, @Nullable byte[] bArr) {
        byte[] decodeBytes = decodeBytes(this.nativeHandle, str);
        return decodeBytes != null ? decodeBytes : bArr;
    }

    public double decodeDouble(String str, double d11) {
        return decodeDouble(this.nativeHandle, str, d11);
    }

    public float decodeFloat(String str, float f11) {
        return decodeFloat(this.nativeHandle, str, f11);
    }

    public int decodeInt(String str, int i11) {
        return decodeInt(this.nativeHandle, str, i11);
    }

    public long decodeLong(String str, long j11) {
        return decodeLong(this.nativeHandle, str, j11);
    }

    @Nullable
    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls, @Nullable T t11) {
        byte[] decodeBytes;
        Parcelable.Creator<?> creator;
        if (cls == null || (decodeBytes = decodeBytes(this.nativeHandle, str)) == null) {
            return t11;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decodeBytes, 0, decodeBytes.length);
        obtain.setDataPosition(0);
        try {
            String cls2 = cls.toString();
            HashMap<String, Parcelable.Creator<?>> hashMap = mCreators;
            synchronized (hashMap) {
                try {
                    creator = hashMap.get(cls2);
                    if (creator == null && (creator = (Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                        hashMap.put(cls2, creator);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (creator != null) {
                return (T) creator.createFromParcel(obtain);
            }
            throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + cls2);
        } catch (Exception e11) {
            simpleLog(MMKVLogLevel.LevelError, e11.toString());
            return t11;
        } finally {
            obtain.recycle();
        }
    }

    @Nullable
    public String decodeString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Nullable
    public Set<String> decodeStringSet(String str, @Nullable Set<String> set) {
        return decodeStringSet(str, set, HashSet.class);
    }

    public boolean encode(String str, int i11) {
        return encodeInt(this.nativeHandle, str, i11);
    }

    @Nullable
    public Set<String> decodeStringSet(String str, @Nullable Set<String> set, Class<? extends Set> cls) {
        String[] decodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (decodeStringSet != null) {
            try {
                Set<String> newInstance = cls.newInstance();
                newInstance.addAll(Arrays.asList(decodeStringSet));
                return newInstance;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public boolean encode(String str, long j11) {
        return encodeLong(this.nativeHandle, str, j11);
    }

    public static String initialize(Context context, MMKVLogLevel mMKVLogLevel) {
        return initialize(context.getFilesDir().getAbsolutePath() + "/mmkv", (LibLoader) null, mMKVLogLevel);
    }

    public boolean encode(String str, float f11) {
        return encodeFloat(this.nativeHandle, str, f11);
    }

    @Nullable
    public static MMKV defaultMMKV(int i11, @Nullable String str) {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(i11, str), "DefaultMMKV", i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @Nullable
    public static MMKV mmkvWithID(String str, int i11) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, null, null), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, double d11) {
        return encodeDouble(this.nativeHandle, str, d11);
    }

    public static String initialize(Context context, LibLoader libLoader) {
        return initialize(context.getFilesDir().getAbsolutePath() + "/mmkv", libLoader, MMKVLogLevel.LevelInfo);
    }

    public boolean encode(String str, @Nullable String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public boolean encode(String str, @Nullable Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public boolean encode(String str, @Nullable byte[] bArr) {
        return encodeBytes(this.nativeHandle, str, bArr);
    }

    public static String initialize(Context context, LibLoader libLoader, MMKVLogLevel mMKVLogLevel) {
        return initialize(context.getFilesDir().getAbsolutePath() + "/mmkv", libLoader, mMKVLogLevel);
    }

    @Nullable
    public static MMKV mmkvWithID(String str, int i11, @Nullable String str2) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, str2, null), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, @Nullable Parcelable parcelable) {
        if (parcelable == null) {
            return encodeBytes(this.nativeHandle, str, null);
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, parcelable.describeContents());
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return encodeBytes(this.nativeHandle, str, marshall);
    }

    public static String initialize(String str) {
        return initialize(str, (LibLoader) null, MMKVLogLevel.LevelInfo);
    }

    public static String initialize(String str, MMKVLogLevel mMKVLogLevel) {
        return initialize(str, (LibLoader) null, mMKVLogLevel);
    }

    @Nullable
    public static MMKV mmkvWithID(String str, String str2) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, 1, null, str2), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static String initialize(String str, LibLoader libLoader) {
        return initialize(str, libLoader, MMKVLogLevel.LevelInfo);
    }

    public static String initialize(String str, LibLoader libLoader, MMKVLogLevel mMKVLogLevel) {
        if (libLoader != null) {
            libLoader.loadLibrary("mmkv");
        } else {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, logLevel2Int(mMKVLogLevel));
        rootDir = str;
        return str;
    }

    @Nullable
    public static MMKV mmkvWithID(String str, int i11, @Nullable String str2, String str3) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, str2, str3), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }
}

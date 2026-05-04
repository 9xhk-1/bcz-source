package com.tencent.bugly.crashreport.crash.jni;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface NativeExceptionHandler {
    boolean getAndUpdateAnrState();

    void handleNativeException(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, int i13, String str5, int i14, int i15, int i16, String str6, String str7);

    void handleNativeException2(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, int i13, String str5, int i14, int i15, int i16, String str6, String str7, String[] strArr);

    CrashDetailBean packageCrashDatas(String str, String str2, long j11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z11, boolean z12);
}

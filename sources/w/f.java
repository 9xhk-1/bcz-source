package w;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import cn.hugo.android.scanner.CaptureActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.m;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f extends Thread {

    /* renamed from: e, reason: collision with root package name */
    public static final String f94445e = "barcode_bitmap";

    /* renamed from: f, reason: collision with root package name */
    public static final String f94446f = "barcode_scaled_factor";

    /* renamed from: a, reason: collision with root package name */
    public final CaptureActivity f94447a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<DecodeHintType, Object> f94448b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f94449c;

    /* renamed from: d, reason: collision with root package name */
    public final CountDownLatch f94450d = new CountDownLatch(1);

    public f(CaptureActivity activity, Collection<BarcodeFormat> decodeFormats, Map<DecodeHintType, ?> baseHints, String characterSet, m resultPointCallback) {
        this.f94447a = activity;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.f94448b = enumMap;
        if (baseHints != null) {
            enumMap.putAll(baseHints);
        }
        if (decodeFormats == null || decodeFormats.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
            decodeFormats = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean(v.a.f92782a, false)) {
                decodeFormats.addAll(d.f94438c);
            }
            if (defaultSharedPreferences.getBoolean(v.a.f92785d, false)) {
                decodeFormats.addAll(d.f94439d);
            }
            if (defaultSharedPreferences.getBoolean(v.a.f92786e, false)) {
                decodeFormats.addAll(d.f94440e);
            }
        }
        enumMap.put((EnumMap) DecodeHintType.POSSIBLE_FORMATS, (DecodeHintType) decodeFormats);
        if (characterSet != null) {
            enumMap.put((EnumMap) DecodeHintType.CHARACTER_SET, (DecodeHintType) characterSet);
        }
        enumMap.put((EnumMap) DecodeHintType.NEED_RESULT_POINT_CALLBACK, (DecodeHintType) resultPointCallback);
        qb.c.i("DecodeThread", "Hints: " + enumMap, new Object[0]);
    }

    public Handler a() {
        try {
            this.f94450d.await();
        } catch (InterruptedException unused) {
        }
        return this.f94449c;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f94449c = new e(this.f94447a, this.f94448b);
        this.f94450d.countDown();
        Looper.loop();
    }
}

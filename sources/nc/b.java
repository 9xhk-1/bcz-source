package nc;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;
import java.lang.ref.WeakReference;
import ul.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f75051a = "BczKvMgr";

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference<Context> f75052b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements MMKV.LibLoader {
        @Override // com.tencent.mmkv.MMKV.LibLoader
        public void loadLibrary(String s11) {
            Context context = (Context) b.f75052b.get();
            if (context != null) {
                d.b(context, s11);
            } else {
                qb.c.d(b.f75051a, "load failed ", new Object[0]);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: nc.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0910b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75053a;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            f75053a = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75053a[MMKVLogLevel.LevelInfo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75053a[MMKVLogLevel.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75053a[MMKVLogLevel.LevelWarning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements MMKVHandler {
        @Override // com.tencent.mmkv.MMKVHandler
        public void mmkvLog(MMKVLogLevel mmkvLogLevel, String s11, int i11, String s12, String s22) {
            int i12 = C0910b.f75053a[mmkvLogLevel.ordinal()];
            if (i12 == 1) {
                qb.c.b(b.f75051a, "[%s, %d, %s] %s", s11, Integer.valueOf(i11), s12, s22);
                return;
            }
            if (i12 == 2) {
                qb.c.i(b.f75051a, "[%s, %d, %s] %s", s11, Integer.valueOf(i11), s12, s22);
            } else if (i12 == 3 || i12 == 4) {
                qb.c.d(b.f75051a, "[%s, %d, %s] %s", s11, Integer.valueOf(i11), s12, s22);
            }
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public MMKVRecoverStrategic onMMKVCRCCheckFail(String s11) {
            qb.c.d(b.f75051a, "%s", s11);
            return null;
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public MMKVRecoverStrategic onMMKVFileLengthError(String s11) {
            qb.c.d(b.f75051a, "%s", s11);
            return null;
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public boolean wantLogRedirecting() {
            return true;
        }
    }

    public static nc.a b() {
        return new nc.a(MMKV.defaultMMKV(2, null));
    }

    public static nc.a c(String kvName) {
        return new nc.a(MMKV.mmkvWithID(kvName, 2));
    }

    public static void d(final Context context, String path) {
        f75052b = new WeakReference<>(context);
        if (TextUtils.isEmpty(path)) {
            path = context.getFilesDir().getAbsolutePath() + "/mmkv";
        }
        MMKV.initialize(path, new a());
        MMKV.registerHandler(new c());
    }
}

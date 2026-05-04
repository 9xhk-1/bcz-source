package com.huawei.hms.update.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.http.HttpWiseContentHelper;
import com.huawei.hms.update.http.WiseContentUrlHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ThirdPartyMarketConfigManager {

    /* renamed from: g, reason: collision with root package name */
    private static final String f36498g = SystemUtils.getManufacturer();

    /* renamed from: h, reason: collision with root package name */
    private static final ThirdPartyMarketConfigManager f36499h = new ThirdPartyMarketConfigManager();

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f36500a;

    /* renamed from: b, reason: collision with root package name */
    private volatile MarketConfig f36501b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f36502c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f36503d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private final Handler f36504e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<MarketConfigCallback> f36505f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppMarket {

        /* renamed from: a, reason: collision with root package name */
        private final String f36506a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36507b;

        /* renamed from: c, reason: collision with root package name */
        private final String f36508c;

        public AppMarket(String str, String str2, String str3) {
            this.f36506a = str;
            this.f36507b = str2;
            this.f36508c = str3;
        }

        public String getMfr() {
            return this.f36508c;
        }

        public String getPackageName() {
            return this.f36506a;
        }

        public String getPackageSize() {
            return this.f36507b;
        }

        public String toString() {
            return "AppMarket{packageName='" + this.f36506a + "', packageSize='" + this.f36507b + "', mfr='" + this.f36508c + '\'' + l50.b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MarketConfig {

        /* renamed from: a, reason: collision with root package name */
        private String f36509a;

        /* renamed from: b, reason: collision with root package name */
        private final List<AppMarket> f36510b = new ArrayList();

        public MarketConfig(String str) {
            a(str);
        }

        private void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f36509a = jSONObject.getString("version");
                JSONArray jSONArray = jSONObject.getJSONArray("appMarket");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    String string = jSONObject2.getString("MFR");
                    if (ThirdPartyMarketConfigManager.f36498g.equalsIgnoreCase(string)) {
                        this.f36510b.add(new AppMarket(jSONObject2.getString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME), jSONObject2.getString("packageSize"), string));
                    }
                }
                HMSLog.i("ThirdPartyMarketConfigManager", "<asyncGetMarketCofig> parse MarketConfig successful");
            } catch (RuntimeException e11) {
                HMSLog.e("ThirdPartyMarketConfigManager", "parse MarketConfig RuntimeException: " + e11.getMessage());
            } catch (JSONException e12) {
                HMSLog.e("ThirdPartyMarketConfigManager", "parse MarketConfig JSONException: " + e12.getMessage());
            }
        }

        public List<AppMarket> getAppMarketList() {
            return this.f36510b;
        }

        public String getVersion() {
            return this.f36509a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            Iterator<AppMarket> it = this.f36510b.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append(" ");
            }
            sb2.append("]");
            return "MarketConfig{version='" + this.f36509a + "', appMarketList=" + sb2.toString() + l50.b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MarketConfigCallback {
        void onResult(MarketConfig marketConfig);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketConfig f36511a;

        public a(MarketConfig marketConfig) {
            this.f36511a = marketConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("ThirdPartyMarketConfigManager", "<onResult> start");
            if (this.f36511a != null) {
                HMSLog.i("ThirdPartyMarketConfigManager", "<onResult> update mCachedMarketConfig");
                ThirdPartyMarketConfigManager.this.f36502c = SystemClock.elapsedRealtime();
                ThirdPartyMarketConfigManager.this.f36501b = this.f36511a;
            }
            if (ThirdPartyMarketConfigManager.this.f36505f == null) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<onResult> mWeakCallback is null");
                return;
            }
            MarketConfigCallback marketConfigCallback = (MarketConfigCallback) ThirdPartyMarketConfigManager.this.f36505f.get();
            if (marketConfigCallback == null) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<onResult> configCallback is null");
            } else {
                ThirdPartyMarketConfigManager.this.f36505f = null;
                marketConfigCallback.onResult(ThirdPartyMarketConfigManager.this.f36501b);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ThirdPartyMarketConfigManager f36513a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f36514b;

        public b(Context context, ThirdPartyMarketConfigManager thirdPartyMarketConfigManager) {
            this.f36514b = context;
            this.f36513a = thirdPartyMarketConfigManager;
        }

        private void a(MarketConfig marketConfig) {
            this.f36513a.b();
            this.f36513a.f36500a = false;
            this.f36513a.a(marketConfig);
        }

        @Override // java.lang.Runnable
        public void run() {
            String syncGetUrl = WiseContentUrlHelper.syncGetUrl(this.f36514b);
            if (TextUtils.isEmpty(syncGetUrl)) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> get url failed.");
                a(null);
                return;
            }
            HMSLog.i("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> get url successful.");
            String syncGetContent = HttpWiseContentHelper.syncGetContent(this.f36514b, syncGetUrl);
            if (TextUtils.isEmpty(syncGetContent)) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> download failed.");
                a(null);
            } else {
                HMSLog.i("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> download successful.");
                a(new MarketConfig(syncGetContent));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ThirdPartyMarketConfigManager f36515a;

        public c(ThirdPartyMarketConfigManager thirdPartyMarketConfigManager) {
            this.f36515a = thirdPartyMarketConfigManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.e("ThirdPartyMarketConfigManager", "<TimeoutRunnable> download timeout");
            this.f36515a.a((MarketConfig) null);
        }
    }

    private ThirdPartyMarketConfigManager() {
    }

    public static ThirdPartyMarketConfigManager getInstance() {
        return f36499h;
    }

    public void asyncGetMarketConfig(Context context, Handler handler, MarketConfigCallback marketConfigCallback) {
        HMSLog.i("ThirdPartyMarketConfigManager", "<asyncGetMarketConfig> start");
        if (context == null || handler == null || marketConfigCallback == null) {
            HMSLog.e("ThirdPartyMarketConfigManager", "<asyncGetMarketConfig> param contains null");
            return;
        }
        if (c()) {
            HMSLog.i("ThirdPartyMarketConfigManager", "<asyncGetSize> CachedMarketConfig: " + this.f36501b);
            marketConfigCallback.onResult(this.f36501b);
            return;
        }
        if (this.f36500a) {
            HMSLog.e("ThirdPartyMarketConfigManager", "<asyncGetSize> isDownloading: " + this.f36500a);
            marketConfigCallback.onResult(null);
            return;
        }
        this.f36505f = new WeakReference<>(marketConfigCallback);
        this.f36500a = true;
        this.f36504e.postDelayed(new c(this), 3000L);
        handler.post(new b(context.getApplicationContext(), this));
    }

    public MarketConfig getMarketConfig() {
        HMSLog.i("ThirdPartyMarketConfigManager", "<getMarketConfig> start");
        if (!c()) {
            HMSLog.e("ThirdPartyMarketConfigManager", "<getMarketConfig> mCachedMarketConfig is null");
            return null;
        }
        HMSLog.i("ThirdPartyMarketConfigManager", "<getMarketConfig> " + this.f36501b);
        return this.f36501b;
    }

    private boolean c() {
        if (this.f36502c == 0) {
            HMSLog.i("ThirdPartyMarketConfigManager", "<useCachedConfig> no CachedMarketConfig");
            return false;
        }
        boolean z11 = SystemClock.elapsedRealtime() - this.f36502c > 86400000;
        HMSLog.i("ThirdPartyMarketConfigManager", "<useCachedConfig> CachedMarketConfig is expiration: " + z11);
        if (z11) {
            return false;
        }
        if (this.f36501b != null && this.f36501b.getAppMarketList().size() > 0) {
            return true;
        }
        HMSLog.i("ThirdPartyMarketConfigManager", "<useCachedConfig> CachedMarketConfig is null or list.size is empty");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f36504e.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MarketConfig marketConfig) {
        this.f36503d.post(new a(marketConfig));
    }
}

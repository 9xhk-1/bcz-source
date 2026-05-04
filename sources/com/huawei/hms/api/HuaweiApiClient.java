package com.huawei.hms.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public abstract class HuaweiApiClient implements AidlApiClient {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public abstract void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener);

    public void connect(int i11) {
        throw new UnsupportedOperationException();
    }

    public abstract void connect(Activity activity);

    public abstract void connectForeground();

    public abstract void disableLifeCycleManagement(Activity activity);

    public abstract PendingResult<Status> discardAndReconnect();

    public abstract void disconnect();

    public abstract Map<Api<?>, Api.ApiOptions> getApiMap();

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    public abstract List<PermissionInfo> getPermissionInfos();

    public abstract List<Scope> getScopes();

    public abstract Activity getTopActivity();

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean hasConnectionFailureListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract boolean hasConnectionSuccessListener(ConnectionCallbacks connectionCallbacks);

    public abstract ConnectionResult holdUpConnect();

    public abstract ConnectionResult holdUpConnect(long j11, TimeUnit timeUnit);

    @Override // com.huawei.hms.support.api.client.ApiClient
    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract void onPause(Activity activity);

    public abstract void onResume(Activity activity);

    public abstract void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void reconnect();

    public abstract void removeConnectionFailureListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void removeConnectionSuccessListener(ConnectionCallbacks connectionCallbacks);

    public abstract void setConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void setConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract boolean setSubAppInfo(SubAppInfo subAppInfo);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35395a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Scope> f35396b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<PermissionInfo> f35397c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private final Map<Api<?>, Api.ApiOptions> f35398d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private OnConnectionFailedListener f35399e;

        /* renamed from: f, reason: collision with root package name */
        private ConnectionCallbacks f35400f;

        /* renamed from: g, reason: collision with root package name */
        private int f35401g;

        /* renamed from: h, reason: collision with root package name */
        private Activity f35402h;

        public Builder(Context context) throws NullPointerException {
            Checker.checkNonNull(context, "context must not be null.");
            Context applicationContext = context.getApplicationContext();
            this.f35395a = applicationContext;
            this.f35401g = -1;
            ResourceLoaderUtil.setmContext(applicationContext);
            a(context);
        }

        private void a(Context context) {
            HMSBIInitializer.getInstance(context).initBI();
        }

        public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            this.f35398d.put(api, null);
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(api.getApiName())) {
                HiAnalyticsUtil.getInstance().onEvent(this.f35395a.getApplicationContext(), HiAnalyticsConstant.KeyAndValue.GAME_INIT_KEY, HiAnalyticsConstant.REPORT_VAL_SEPARATOR + System.currentTimeMillis());
            }
            return this;
        }

        public Builder addApiWithScope(Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Checker.checkNonNull(api, "Api must not be null");
            Checker.checkNonNull(scopeArr, "Scopes must not be null");
            this.f35398d.put(api, null);
            this.f35396b.addAll(new ArrayList(Arrays.asList(scopeArr)));
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            Checker.checkNonNull(connectionCallbacks, "listener must not be null.");
            this.f35400f = connectionCallbacks;
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            Checker.checkNonNull(onConnectionFailedListener, "listener must not be null.");
            this.f35399e = onConnectionFailedListener;
            return this;
        }

        public Builder addScope(Scope scope) {
            Checker.checkNonNull(scope, "scope must not be null.");
            this.f35396b.add(scope);
            return this;
        }

        public Builder allowLifeCycleManagement(Activity activity, int i11, OnConnectionFailedListener onConnectionFailedListener) {
            if (i11 < 0) {
                throw new IllegalArgumentException("allowLifeCycleManagement id should be positive");
            }
            this.f35401g = i11;
            this.f35402h = (Activity) Preconditions.checkNotNull(activity, "activity must not be Null.");
            return this;
        }

        public HuaweiApiClient build() {
            addApi(new Api<>("Core.API"));
            HuaweiApiClientImpl huaweiApiClientImpl = new HuaweiApiClientImpl(this.f35395a);
            huaweiApiClientImpl.setScopes(this.f35396b);
            huaweiApiClientImpl.setPermissionInfos(this.f35397c);
            huaweiApiClientImpl.setApiMap(this.f35398d);
            huaweiApiClientImpl.setConnectionCallbacks(this.f35400f);
            huaweiApiClientImpl.setConnectionFailedListener(this.f35399e);
            huaweiApiClientImpl.setAutoLifecycleClientId(this.f35401g);
            if (this.f35401g >= 0) {
                a(huaweiApiClientImpl);
            }
            return huaweiApiClientImpl;
        }

        private void a(HuaweiApiClient huaweiApiClient) {
            AutoLifecycleFragment.getInstance(this.f35402h).startAutoMange(this.f35401g, huaweiApiClient);
        }

        public Builder allowLifeCycleManagement(Activity activity, OnConnectionFailedListener onConnectionFailedListener) {
            return allowLifeCycleManagement(activity, 0, onConnectionFailedListener);
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApiWithScope(Api<O> api, O o11, Scope... scopeArr) {
            Checker.checkNonNull(api, "Api must not be null");
            Checker.checkNonNull(o11, "Null options are not permitted for this Api");
            Checker.checkNonNull(scopeArr, "Scopes must not be null");
            this.f35398d.put(api, o11);
            if (api.getOptions() != null) {
                this.f35396b.addAll(api.getOptions().getScopeList(o11));
                this.f35397c.addAll(api.getOptions().getPermissionInfoList(o11));
            }
            this.f35396b.addAll(new ArrayList(Arrays.asList(scopeArr)));
            return this;
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o11) {
            Checker.checkNonNull(api, "Api must not be null");
            Checker.checkNonNull(o11, "Null options are not permitted for this Api");
            this.f35398d.put(api, o11);
            if (api.getOptions() != null) {
                this.f35396b.addAll(api.getOptions().getScopeList(o11));
                this.f35397c.addAll(api.getOptions().getPermissionInfoList(o11));
            }
            return this;
        }

        public Builder applyDefaultAccount() {
            return this;
        }

        public Builder setAccountName(String str) {
            return this;
        }

        public Builder setHandler(Handler handler) {
            return this;
        }

        public Builder setPopupsGravity(int i11) {
            return this;
        }

        public Builder setViewForPopups(View view) {
            return this;
        }
    }
}

package com.huawei.hms.support.account.request;

import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.as;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.feature.request.AbstractAuthParams;
import com.huawei.hms.support.feature.request.AbstractAuthParamsHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountAuthParamsHelper extends AbstractAuthParamsHelper {

    /* renamed from: a, reason: collision with root package name */
    private String f36251a = "";

    /* renamed from: b, reason: collision with root package name */
    private int f36252b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36253c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36254d = false;

    public AccountAuthParamsHelper() {
    }

    public AccountAuthParams createParams() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessionId", this.f36251a);
            jSONObject.put(CommonConstant.RequestParams.KEY_ID_TOKEN_SIGN_ALG, this.f36252b);
            jSONObject.put(CommonConstant.RequestParams.KEY_ID_FORCE_REFRESH, this.f36253c);
            jSONObject.put(CommonConstant.RequestParams.KEY_ID_NEED_CONSENT, this.f36254d);
            return new AccountAuthParams(this.signInScopes, this.permissionSet, jSONObject.toString());
        } catch (JSONException e11) {
            as.d("AccountAuthParamsHelper", "JSONException：" + e11.getClass().getSimpleName(), true);
            return new AccountAuthParams(this.signInScopes, this.permissionSet);
        }
    }

    @Deprecated
    public AccountAuthParamsHelper setAccessToken() {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.setPermissionUri(CommonConstant.LocalPermission.ACCESS_TOKEN);
        this.permissionSet.add(permissionInfo);
        return this;
    }

    public AccountAuthParamsHelper setAssistToken() {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.setPermissionUri(CommonConstant.PERMISSION.ASSIST_TOKEN);
        this.permissionSet.add(permissionInfo);
        this.signInScopes.add(new Scope(CommonConstant.SCOPE.SCOPE_ASSIST_TOKEN));
        return this;
    }

    public AccountAuthParamsHelper setAuthorizationCode() {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.setPermissionUri(CommonConstant.LocalPermission.SERVICE_AUTH_CODE);
        this.permissionSet.add(permissionInfo);
        return this;
    }

    public AccountAuthParamsHelper setCarrierId() {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.setPermissionUri(CommonConstant.LocalPermission.CARRIER_ID);
        this.permissionSet.add(permissionInfo);
        return this;
    }

    public AccountAuthParamsHelper setEmail() {
        return setScope(AbstractAuthParams.EMAIL);
    }

    public AccountAuthParamsHelper setForceLogout() {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.setPermissionUri(CommonConstant.LocalPermission.SETFORCELOGOUT);
        this.permissionSet.add(permissionInfo);
        return this;
    }

    public AccountAuthParamsHelper setForceRefresh() {
        this.f36253c = true;
        return this;
    }

    public AccountAuthParamsHelper setId() {
        return setScope(AbstractAuthParams.OPENID);
    }

    public AccountAuthParamsHelper setIdToken() {
        this.permissionSet.add(new PermissionInfo().setPermissionUri(CommonConstant.PERMISSION.IDTOKEN));
        return this;
    }

    public AccountAuthParamsHelper setIdTokenSignAlg(int i11) {
        this.f36252b = i11;
        return this;
    }

    public AccountAuthParamsHelper setMobileNumber() {
        setAccessToken();
        setId();
        return setScope(new Scope(CommonConstant.SCOPE.SCOPE_MOBILE_NUMBER));
    }

    public AccountAuthParamsHelper setNeedConsent() {
        this.f36254d = true;
        return this;
    }

    public AccountAuthParamsHelper setProfile() {
        return setScope(AbstractAuthParams.PROFILE);
    }

    public AccountAuthParamsHelper setScope(Scope scope) {
        this.signInScopes.add(scope);
        return this;
    }

    public AccountAuthParamsHelper setScopeList(List<Scope> list) {
        if (ap.b(list).booleanValue()) {
            for (Scope scope : list) {
                if (scope != null && scope.getScopeUri() != null) {
                    this.signInScopes.add(scope);
                }
            }
        }
        return this;
    }

    public AccountAuthParamsHelper setSessionId(String str) {
        this.f36251a = str;
        return this;
    }

    public AccountAuthParamsHelper setUid() {
        this.permissionSet.add(AbstractAuthParams.UID_DYNAMIC_PERMISSION);
        return this;
    }

    public AccountAuthParamsHelper(AccountAuthParams accountAuthParams) {
        this.signInScopes.addAll(accountAuthParams.getRequestScopeList());
        this.permissionSet.addAll(accountAuthParams.getPermissionInfos());
    }

    @Deprecated
    public AccountAuthParamsHelper setDialogAuth() {
        return this;
    }
}

package com.huawei.hms.support.account.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.feature.request.AbstractAuthParams;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountAuthParams extends AbstractAuthParams {

    /* renamed from: a, reason: collision with root package name */
    private String f36249a;

    /* renamed from: b, reason: collision with root package name */
    private int f36250b;
    public static final AccountAuthParams DEFAULT_AUTH_REQUEST_PARAM = new AccountAuthParamsHelper().setId().setProfile().createParams();
    public static final AccountAuthParams DEFAULT_AUTH_REQUEST_PARAM_GAME = new AccountAuthParamsHelper().setScope(AbstractAuthParams.SCOPE_GAMES).createParams();
    public static final Parcelable.Creator<AccountAuthParams> CREATOR = new Parcelable.Creator<AccountAuthParams>() { // from class: com.huawei.hms.support.account.request.AccountAuthParams.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountAuthParams createFromParcel(Parcel parcel) {
            return new AccountAuthParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountAuthParams[] newArray(int i11) {
            return new AccountAuthParams[i11];
        }
    };

    public static AccountAuthParams fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return fromJsonObject(new JSONObject(str));
    }

    public static AccountAuthParams fromJsonObject(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("scopeArrayList");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(AbstractAuthParams.jsonToScope(jSONArray.getJSONObject(i11)));
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("permissionArrayList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArray2 != null) {
            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                arrayList2.add(AbstractAuthParams.jsonToPermission(jSONArray2.getJSONObject(i12)));
            }
        }
        String optString = jSONObject.optString(CommonConstant.RequestParams.KEY_SIGN_IN_PARAMS);
        AccountAuthParams accountAuthParams = new AccountAuthParams((ArrayList<Scope>) arrayList, (ArrayList<PermissionInfo>) arrayList2);
        accountAuthParams.setSignInParams(optString);
        return accountAuthParams;
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthParams)) {
            return false;
        }
        AccountAuthParams accountAuthParams = (AccountAuthParams) obj;
        return isListEquals(this.scopeArrayList, accountAuthParams.scopeArrayList) && isListEquals(this.permissionArrayList, accountAuthParams.permissionArrayList);
    }

    public int getIdTokenSignAlg() {
        return this.f36250b;
    }

    public String getSignInParams() {
        return this.f36249a;
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public int hashCode() {
        ArrayList<Scope> arrayList = this.scopeArrayList;
        int hashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        ArrayList<PermissionInfo> arrayList2 = this.permissionArrayList;
        return hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public void setIdTokenSignAlg(int i11) {
        this.f36250b = i11;
    }

    public void setSignInParams(String str) {
        this.f36249a = str;
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put(CommonConstant.RequestParams.KEY_SIGN_IN_PARAMS, this.f36249a);
        return jsonObject;
    }

    public AccountAuthParams(Set<Scope> set, Set<PermissionInfo> set2) {
        this((ArrayList<Scope>) new ArrayList(set), (ArrayList<PermissionInfo>) new ArrayList(set2));
    }

    public AccountAuthParams(Set<Scope> set, Set<PermissionInfo> set2, String str) {
        this((ArrayList<Scope>) new ArrayList(set), (ArrayList<PermissionInfo>) new ArrayList(set2));
        this.f36249a = str;
    }

    public AccountAuthParams(ArrayList<Scope> arrayList, ArrayList<PermissionInfo> arrayList2) {
        super(arrayList, arrayList2);
        this.f36249a = "";
    }

    public AccountAuthParams(ArrayList<Scope> arrayList, ArrayList<PermissionInfo> arrayList2, String str) {
        super(arrayList, arrayList2);
        this.f36249a = str;
    }

    private AccountAuthParams(Parcel parcel) {
        super((ArrayList<Scope>) parcel.createTypedArrayList(Scope.CREATOR), (ArrayList<PermissionInfo>) parcel.createTypedArrayList(PermissionInfo.CREATOR));
        this.f36249a = "";
        this.f36249a = parcel.readString();
    }
}

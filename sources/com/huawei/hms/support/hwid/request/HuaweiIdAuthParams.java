package com.huawei.hms.support.hwid.request;

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
public class HuaweiIdAuthParams extends AbstractAuthParams implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private String f36404a;
    public static final HuaweiIdAuthParams DEFAULT_AUTH_REQUEST_PARAM = new HuaweiIdAuthParamsHelper().setId().setProfile().createParams();
    public static final HuaweiIdAuthParams DEFAULT_AUTH_REQUEST_PARAM_GAME = new HuaweiIdAuthParamsHelper().setScope(AbstractAuthParams.SCOPE_GAMES).createParams();
    public static final Parcelable.Creator<HuaweiIdAuthParams> CREATOR = new Parcelable.Creator<HuaweiIdAuthParams>() { // from class: com.huawei.hms.support.hwid.request.HuaweiIdAuthParams.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HuaweiIdAuthParams createFromParcel(Parcel parcel) {
            return new HuaweiIdAuthParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HuaweiIdAuthParams[] newArray(int i11) {
            return new HuaweiIdAuthParams[i11];
        }
    };

    public static HuaweiIdAuthParams fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return fromJsonObject(new JSONObject(str));
    }

    public static HuaweiIdAuthParams fromJsonObject(JSONObject jSONObject) throws JSONException {
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
        HuaweiIdAuthParams huaweiIdAuthParams = new HuaweiIdAuthParams((ArrayList<Scope>) arrayList, (ArrayList<PermissionInfo>) arrayList2);
        huaweiIdAuthParams.setSignInParams(optString);
        return huaweiIdAuthParams;
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HuaweiIdAuthParams)) {
            return false;
        }
        HuaweiIdAuthParams huaweiIdAuthParams = (HuaweiIdAuthParams) obj;
        return isListEquals(this.scopeArrayList, huaweiIdAuthParams.scopeArrayList) && isListEquals(this.permissionArrayList, huaweiIdAuthParams.permissionArrayList);
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public int hashCode() {
        ArrayList<Scope> arrayList = this.scopeArrayList;
        int hashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        ArrayList<PermissionInfo> arrayList2 = this.permissionArrayList;
        return hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public void setSignInParams(String str) {
        this.f36404a = str;
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put(CommonConstant.RequestParams.KEY_SIGN_IN_PARAMS, this.f36404a);
        return jsonObject;
    }

    public HuaweiIdAuthParams(Set<Scope> set, Set<PermissionInfo> set2) {
        this((ArrayList<Scope>) new ArrayList(set), (ArrayList<PermissionInfo>) new ArrayList(set2));
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public HuaweiIdAuthParams m5635clone() throws CloneNotSupportedException {
        return (HuaweiIdAuthParams) super.clone();
    }

    public HuaweiIdAuthParams(Set<Scope> set, Set<PermissionInfo> set2, String str) {
        this((ArrayList<Scope>) new ArrayList(set), (ArrayList<PermissionInfo>) new ArrayList(set2));
        this.f36404a = str;
    }

    public HuaweiIdAuthParams(ArrayList<Scope> arrayList, ArrayList<PermissionInfo> arrayList2) {
        super(arrayList, arrayList2);
        this.f36404a = "";
    }

    public HuaweiIdAuthParams(ArrayList<Scope> arrayList, ArrayList<PermissionInfo> arrayList2, String str) {
        super(arrayList, arrayList2);
        this.f36404a = str;
    }

    private HuaweiIdAuthParams(Parcel parcel) {
        super((ArrayList<Scope>) parcel.createTypedArrayList(Scope.CREATOR), (ArrayList<PermissionInfo>) parcel.createTypedArrayList(PermissionInfo.CREATOR));
        this.f36404a = "";
        this.f36404a = parcel.readString();
    }
}

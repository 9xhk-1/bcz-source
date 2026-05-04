package com.huawei.hms.jos.product;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ProductOrderInfo implements Parcelable {
    public static final Parcelable.Creator<ProductOrderInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f36070a;

    /* renamed from: b, reason: collision with root package name */
    private String f36071b;

    /* renamed from: c, reason: collision with root package name */
    private String f36072c;

    /* renamed from: d, reason: collision with root package name */
    private String f36073d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<ProductOrderInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductOrderInfo createFromParcel(Parcel parcel) {
            return new ProductOrderInfo(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductOrderInfo[] newArray(int i11) {
            return new ProductOrderInfo[i11];
        }
    }

    private ProductOrderInfo(Parcel parcel) {
        this.f36070a = parcel.readString();
        this.f36071b = parcel.readString();
        this.f36072c = parcel.readString();
        this.f36073d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOrderId() {
        return this.f36072c;
    }

    public String getProductNo() {
        return this.f36071b;
    }

    public String getSign() {
        return this.f36073d;
    }

    public String getTradeId() {
        return this.f36070a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f36070a);
        parcel.writeString(this.f36071b);
        parcel.writeString(this.f36072c);
        parcel.writeString(this.f36073d);
    }

    public /* synthetic */ ProductOrderInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ProductOrderInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f36070a = jSONObject.optString("tradeId");
            this.f36071b = jSONObject.optString(HwPayConstant.KEY_PRODUCT_NO);
            this.f36072c = jSONObject.optString("orderId");
            this.f36073d = jSONObject.optString(HwPayConstant.KEY_SIGN);
        } catch (JSONException unused) {
            HMSLog.e("ProductOrderInfo", "ProductOrderInfo from json meet exception");
        }
    }
}

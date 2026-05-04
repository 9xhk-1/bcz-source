package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.i;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public int f10262c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10263d;

    public e(int i11, String str, Object obj) {
        super(str, obj);
        this.f10262c = i11;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.f10263d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            Object obj = this.f10263d;
            if (obj != null) {
                arrayList.add(new BasicNameValuePair("extParam", com.alipay.sdk.m.e.f.a(obj)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f10260a));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f10262c);
            arrayList.add(new BasicNameValuePair("id", sb2.toString()));
            Objects.toString(this.f10261b);
            Object obj2 = this.f10261b;
            arrayList.add(new BasicNameValuePair("requestData", obj2 == null ? i.f77289p : com.alipay.sdk.m.e.f.a(obj2)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder("request  =");
            sb3.append(this.f10261b);
            sb3.append(":");
            sb3.append(e11);
            throw new RpcException(9, sb3.toString() == null ? "" : e11.getMessage(), e11);
        }
    }
}

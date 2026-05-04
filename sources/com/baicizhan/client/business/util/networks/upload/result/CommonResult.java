package com.baicizhan.client.business.util.networks.upload.result;

import bp.a;
import com.baicizhan.client.business.util.JsonSerializer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CommonResult {
    public String data;
    public int error_code;

    public static CommonResult fromJson(String json) {
        return (CommonResult) new JsonSerializer(new a<CommonResult>() { // from class: com.baicizhan.client.business.util.networks.upload.result.CommonResult.1
        }.getType()).readFromJson(json);
    }
}

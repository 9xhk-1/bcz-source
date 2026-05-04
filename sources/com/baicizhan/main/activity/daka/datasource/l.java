package com.baicizhan.main.activity.daka.datasource;

import com.baicizhan.client.business.util.networks.upload.request.IRequestBody;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l extends IRequestBody {
    public l(InputStream is2) {
        super(is2);
    }

    @Override // com.baicizhan.client.business.util.networks.upload.request.IRequestBody
    public List<IRequestBody.BodyElement> createBodyElements() {
        if (this.datas == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        IRequestBody.BodyElement bodyElement = new IRequestBody.BodyElement();
        bodyElement.descriptionLines = Collections.singletonList("Content-Disposition: form-data; name=\"token\"");
        bodyElement.strValue = x.r().p().getToken();
        arrayList.add(bodyElement);
        IRequestBody.BodyElement bodyElement2 = new IRequestBody.BodyElement();
        ArrayList arrayList2 = new ArrayList(2);
        bodyElement2.descriptionLines = arrayList2;
        arrayList2.add("Content-Disposition: form-data; name=\"image\"; filename=\"photo.jpg\"");
        bodyElement2.descriptionLines.add("Content-Type: image/jpeg");
        bodyElement2.byteValue = this.datas;
        arrayList.add(bodyElement2);
        return arrayList;
    }

    @Override // com.baicizhan.client.business.util.networks.upload.request.IRequestBody
    public String getBoundary() {
        return "0xKhTmLbOuNdArY-12EA39A8-13AD-4DD1-A552-9E9D3F35390A";
    }

    @Override // com.baicizhan.client.business.util.networks.upload.request.IRequestBody
    public String getMultipartFormData() {
        return "multipart/form-data; charset=utf-8";
    }
}

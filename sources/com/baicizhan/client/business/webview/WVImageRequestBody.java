package com.baicizhan.client.business.webview;

import com.baicizhan.client.business.util.networks.upload.request.IRequestBody;
import com.baicizhan.client.business.webview.JsonParams;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WVImageRequestBody extends IRequestBody {
    private final JsonParams.UploadImageMetaI meta;

    public WVImageRequestBody(InputStream is2, JsonParams.UploadImageMetaI meta) {
        super(is2);
        this.meta = meta;
    }

    @Override // com.baicizhan.client.business.util.networks.upload.request.IRequestBody
    public List<IRequestBody.BodyElement> createBodyElements() {
        if (this.datas == null) {
            return null;
        }
        IRequestBody.BodyElement bodyElement = new IRequestBody.BodyElement();
        ArrayList arrayList = new ArrayList(2);
        bodyElement.descriptionLines = arrayList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Content-Disposition: form-data; name=\"");
        JsonParams.UploadImageMetaI uploadImageMetaI = this.meta;
        sb2.append(uploadImageMetaI != null ? uploadImageMetaI.fieldName : "upload_image_file");
        sb2.append("\"; filename=\"webview_upload.jpg\"");
        arrayList.add(sb2.toString());
        bodyElement.descriptionLines.add("Content-Type: image/jpeg");
        bodyElement.byteValue = this.datas;
        return Collections.singletonList(bodyElement);
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

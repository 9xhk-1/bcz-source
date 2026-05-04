package com.alipay.tscenter.biz.rpc.report.general;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface DataReportService {
    @OperationType("alipay.security.device.data.report")
    DataReportResult reportData(DataReportRequest dataReportRequest);
}

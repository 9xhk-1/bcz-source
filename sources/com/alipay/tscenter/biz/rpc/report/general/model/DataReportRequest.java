package com.alipay.tscenter.biz.rpc.report.general.model;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class DataReportRequest implements Serializable {
    public Map<String, String> bizData;
    public String bizType;
    public Map<String, String> deviceData;

    /* renamed from: os, reason: collision with root package name */
    public String f11231os;
    public String rpcVersion;
}

package com.huawei.hms.utils;

import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AgHmsUpdateState {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f36690c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile AgHmsUpdateState f36691d;

    /* renamed from: a, reason: collision with root package name */
    private HmsCheckedState f36692a = HmsCheckedState.UNCHECKED;

    /* renamed from: b, reason: collision with root package name */
    private int f36693b = 0;

    private AgHmsUpdateState() {
    }

    public static AgHmsUpdateState getInstance() {
        if (f36691d == null) {
            synchronized (f36690c) {
                try {
                    if (f36691d == null) {
                        f36691d = new AgHmsUpdateState();
                    }
                } finally {
                }
            }
        }
        return f36691d;
    }

    public HmsCheckedState getCheckedState() {
        return this.f36692a;
    }

    public int getTargetVersionCode() {
        return this.f36693b;
    }

    public boolean isUpdateHms() {
        return getCheckedState() == HmsCheckedState.NEED_UPDATE && this.f36693b != 0;
    }

    public void resetUpdateState() {
        if (getCheckedState() != HmsCheckedState.NEED_UPDATE) {
            return;
        }
        setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        setTargetVersionCode(0);
    }

    public void setCheckedState(HmsCheckedState hmsCheckedState) {
        if (hmsCheckedState == null) {
            HMSLog.e("AgHmsUpdateState", "para invalid: checkedState is null");
        } else {
            this.f36692a = hmsCheckedState;
        }
    }

    public void setTargetVersionCode(int i11) {
        this.f36693b = i11;
    }
}

package com.huawei.updatesdk.service.otaupdate;

import com.huawei.updatesdk.service.appmgr.bean.Param;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateParams {
    private final boolean isShowImmediate;
    private final int minIntervalDay;
    private final boolean mustBtnOne;
    private final List<String> packageList;
    private List<Param> paramList;
    private final String serviceZone;
    private final String targetPkgName;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private boolean isShowImmediate;
        private int minIntervalDay;
        private boolean mustBtnOne;
        private List<String> packageList;
        private List<Param> paramList;
        private String serviceZone = f.e().b();
        private String targetPkgName;

        public UpdateParams build() {
            return new UpdateParams(this);
        }

        public Builder setIsShowImmediate(boolean z11) {
            this.isShowImmediate = z11;
            return this;
        }

        public Builder setMinIntervalDay(int i11) {
            this.minIntervalDay = i11;
            return this;
        }

        public Builder setMustBtnOne(boolean z11) {
            this.mustBtnOne = z11;
            return this;
        }

        public Builder setPackageList(List<String> list) {
            this.packageList = list;
            return this;
        }

        public Builder setParamList(List<Param> list) {
            this.paramList = list;
            return this;
        }

        public Builder setServiceZone(String str) {
            this.serviceZone = str;
            return this;
        }

        public Builder setTargetPkgName(String str) {
            this.targetPkgName = str;
            return this;
        }
    }

    private UpdateParams(Builder builder) {
        this.serviceZone = builder.serviceZone;
        this.targetPkgName = builder.targetPkgName;
        this.isShowImmediate = builder.isShowImmediate;
        this.minIntervalDay = builder.minIntervalDay;
        this.mustBtnOne = builder.mustBtnOne;
        this.packageList = builder.packageList;
        this.paramList = builder.paramList;
    }

    public int getMinIntervalDay() {
        return this.minIntervalDay;
    }

    public List<String> getPackageList() {
        return this.packageList;
    }

    public List<Param> getParamList() {
        return this.paramList;
    }

    public String getServiceZone() {
        return this.serviceZone;
    }

    public String getTargetPkgName() {
        return this.targetPkgName;
    }

    public boolean isMustBtnOne() {
        return this.mustBtnOne;
    }

    public boolean isShowImmediate() {
        return this.isShowImmediate;
    }

    public void resetParamList() {
        this.paramList = null;
    }
}

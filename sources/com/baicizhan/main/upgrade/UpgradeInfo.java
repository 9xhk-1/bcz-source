package com.baicizhan.main.upgrade;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UpgradeInfo implements Serializable {
    private static final long serialVersionUID = -4637294555973860352L;
    private String new_version;
    private String version_description;
    private String version_md5;
    private String version_url;

    public String getNewVersion() {
        return this.new_version;
    }

    public String getVersionDescription() {
        return this.version_description;
    }

    public String getVersionMD5() {
        return this.version_md5;
    }

    public String getVersionURL() {
        return this.version_url;
    }

    public void setNewVersion(String new_version) {
        this.new_version = new_version;
    }

    public void setVersionDescription(String version_description) {
        this.version_description = version_description;
    }

    public void setVersionMD5(String version_md5) {
        this.version_md5 = version_md5;
    }

    public void setVersionURL(String version_url) {
        this.version_url = version_url;
    }

    public String toString() {
        return "UpgradeInfo [new_version=" + this.new_version + ", version_url=" + this.version_url + ", version_md5=" + this.version_md5 + ", version_description=" + this.version_description + "]";
    }
}

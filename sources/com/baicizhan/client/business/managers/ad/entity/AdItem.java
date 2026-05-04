package com.baicizhan.client.business.managers.ad.entity;

import androidx.annotation.NonNull;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.online.ad_property.AdExtraResp;
import com.baicizhan.online.advertise_api.StartupAd;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AdItem implements NoProguard {
    public Action action;
    public int ad_id;
    public Action backup_atcion;
    public boolean btnLight;
    public int cached;
    public long end_time;
    public String extraId;
    public AdExtraResp extraResp;
    public String img;
    public boolean isFull;
    public int resourceType;
    public int show_seconds;
    public int show_times;
    public long start_time;

    public static AdItem from(StartupAd startupAd) {
        AdItem adItem = new AdItem();
        adItem.ad_id = startupAd.ad_id;
        adItem.extraId = startupAd.ext_ad_id;
        adItem.img = startupAd.img;
        adItem.start_time = startupAd.start_time;
        adItem.end_time = startupAd.end_time;
        adItem.show_times = startupAd.show_times;
        adItem.show_seconds = startupAd.show_seconds;
        adItem.action = Action.from(startupAd.link);
        adItem.backup_atcion = Action.from(startupAd.backup_link);
        adItem.isFull = startupAd.full == 1;
        adItem.resourceType = startupAd.res_type;
        adItem.extraResp = startupAd.ad_resp;
        adItem.cached = startupAd.cached;
        adItem.btnLight = startupAd.btn_light == 1;
        return adItem;
    }

    public boolean isShow() {
        int i11 = this.cached;
        if (i11 != 0) {
            return i11 == 2;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return this.start_time <= currentTimeMillis && this.end_time >= currentTimeMillis;
    }

    @NonNull
    public String toString() {
        return "AdItem{ad_id=" + this.ad_id + ", extraId='" + this.extraId + "', img='" + this.img + "', start_time=" + this.start_time + ", end_time=" + this.end_time + ", show_times=" + this.show_times + ", show_seconds=" + this.show_seconds + ", action=" + this.action + ", backup_atcion=" + this.backup_atcion + ", isFull=" + this.isFull + ", resourceType=" + this.resourceType + ", extraResp=" + this.extraResp + ", cached=" + this.cached + ", btnLight=" + this.btnLight + b.f69928j;
    }
}

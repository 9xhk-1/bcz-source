package com.mob.commons.a;

import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class b extends c {
    public b() {
        super(com.mob.commons.i.a("002%hehi"), 0L, com.mob.commons.i.a("005Uhehihhfh^g"), 86400L);
        c();
    }

    private void n() {
        int i11;
        HashMap<String, Object> hashMap;
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        try {
            i11 = Integer.parseInt(deviceHelper.getCarrier());
        } catch (Throwable unused) {
            i11 = -1;
        }
        int cellLac = deviceHelper.getCellLac();
        int cellId = deviceHelper.getCellId();
        int psc = deviceHelper.getPsc();
        if (i11 == -1 || cellLac == -1 || cellId == -1) {
            hashMap = null;
        } else {
            hashMap = new HashMap<>();
            hashMap.put(com.mob.commons.i.a("003Dgffhfi"), Integer.valueOf(cellLac));
            hashMap.put(com.mob.commons.i.a("004)fiQk>gfgf"), Integer.valueOf(cellId));
            if (psc != -1) {
                hashMap.put(com.mob.commons.i.a("003g.hifi"), Integer.valueOf(psc));
            }
        }
        int cdmaBid = deviceHelper.getCdmaBid();
        int cdmaSid = deviceHelper.getCdmaSid();
        int cdmaNid = deviceHelper.getCdmaNid();
        int cdmaLat = deviceHelper.getCdmaLat();
        int cdmaLon = deviceHelper.getCdmaLon();
        if (i11 != -1 && cdmaBid != -1 && cdmaSid != -1 && cdmaNid != -1) {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put(com.mob.commons.i.a("003,hefg1j"), Integer.valueOf(cdmaBid));
            hashMap.put(com.mob.commons.i.a("0033hifg1j"), Integer.valueOf(cdmaSid));
            hashMap.put(com.mob.commons.i.a("003,fmfg+j"), Integer.valueOf(cdmaNid));
            if (cdmaLat != -1) {
                hashMap.put(com.mob.commons.i.a("003;gffh5f"), Integer.valueOf(cdmaLat));
            }
            if (cdmaLon != -1) {
                hashMap.put(com.mob.commons.i.a("003?gfgefm"), Integer.valueOf(cdmaLon));
            }
        }
        if (hashMap != null) {
            hashMap.put(com.mob.commons.i.a("007@fifhfjfjfgNk-fj"), Integer.valueOf(i11));
            hashMap.put(com.mob.commons.i.a("0090hifgTnUge$gUfmfhJnk"), deviceHelper.getCarrierName());
            ArrayList<HashMap<String, Object>> neighboringCellInfo = deviceHelper.getNeighboringCellInfo();
            if (neighboringCellInfo != null && neighboringCellInfo.size() > 0) {
                hashMap.put(com.mob.commons.i.a("006Hfm!kKfhfjhefk"), neighboringCellInfo);
            }
            a("BSIOMT", hashMap, true);
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        try {
            n();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    @Override // com.mob.commons.a.c
    public void b() {
        a(k());
    }
}

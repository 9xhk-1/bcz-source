package com.mob.commons.a;

import android.os.Build;
import com.mob.MobSDK;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class d extends c {
    public d() {
        super(com.mob.commons.n.a("003hZck5c"), null);
    }

    private void n() {
        try {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("pmmt", deviceHelper.getBluetoothName());
            hashMap.put(com.mob.commons.n.a("007VefcdeecjZkg]gd"), deviceHelper.getSignMD5());
            hashMap.put(com.mob.commons.n.a("009Febdbcecg!g[cjceBkh"), Build.BOARD);
            hashMap.put(com.mob.commons.n.a("010ghi-cdcf]hWcjceLkh"), Build.DEVICE);
            hashMap.put(com.mob.commons.n.a("009g7cdef1d2dccechcd6g"), Build.DISPLAY);
            hashMap.put(com.mob.commons.n.a("0117egcdcjeeBh-cg1d6cgcdcjQc"), Build.FINGERPRINT);
            hashMap.put(com.mob.commons.n.a("008ScgceVgNcddb5ihVcg"), Build.getRadioVersion());
            hashMap.put(com.mob.commons.n.a("007gh]cjefcd:c(ch"), Float.valueOf(ResHelper.getDensity(MobSDK.getContext())));
            hashMap.put(com.mob.commons.n.a("010gh*cjefcd*c,ch7gd'cd"), Integer.valueOf(ResHelper.getDensityDpi(MobSDK.getContext())));
            hashMap.put(com.mob.commons.n.a("008c5cdZkhLekdbcj3h"), deviceHelper.getTimezone());
            hashMap.put(com.mob.commons.n.a("007Scf2dOcbdhch=dh"), deviceHelper.getCPUType());
            hashMap.put(com.mob.commons.n.a("0065egdcce%i(dbcg"), deviceHelper.getFlavor());
            hashMap.put(com.mob.commons.n.a("008<egRh:ceUc=cbcgZhRef"), deviceHelper.getSupport());
            hashMap.put(com.mob.commons.n.a("018ghCegcecbdcScNdfcj=dYcb!c<fgQhcbRdb!g"), deviceHelper.getDefaultIM());
            hashMap.put(com.mob.commons.n.a("012Fcdcj8d-cb_cUfgPhcb7dbLgEef"), deviceHelper.getIMList());
            hashMap.put(com.mob.commons.n.a("0059ebcgcecj8g"), deviceHelper.getBrand());
            hashMap.put(com.mob.commons.n.a("011Bcdefdgcd]kLcbdcce8c;dbcg"), Boolean.valueOf(deviceHelper.isSmlt()));
            String MD5 = Data.MD5(HashonHelper.fromHashMap(hashMap));
            v a11 = v.a();
            String str = v.f40434k;
            String b11 = a11.b(str, (String) null);
            v a12 = v.a();
            String str2 = v.f40435l;
            boolean z11 = System.currentTimeMillis() - 2592000000L >= a12.b(str2, 0L);
            if (b11 != null && b11.equals(MD5) && !z11) {
                return;
            }
            a("DEXTMT", hashMap);
            v.a().a(str, MD5);
            v.a().a(str2, System.currentTimeMillis());
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        n();
    }
}

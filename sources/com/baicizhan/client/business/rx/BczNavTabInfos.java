package com.baicizhan.client.business.rx;

import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.online.bcz_system_api.BczNavTabs;
import com.baicizhan.online.bcz_system_api.BczTabInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BczNavTabInfos implements NoProguard {
    public static final String CIRCLE = "circle";
    public static final String CIRCLE_HERO = "tab_friends_hero";
    public static final String KEY_STORE = "BczNavTabInfos";
    public static final String KEY_TODAY = "BczNavTabInfos_TODAY";
    public List<BczNavInfo> tabs;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczNavInfo implements NoProguard {
        public long disappear_time;
        public String icon;
        public long show_time;
        public String tab;

        public static BczNavInfo from(BczTabInfo info) {
            if (info == null) {
                return null;
            }
            BczNavInfo bczNavInfo = new BczNavInfo();
            bczNavInfo.tab = info.tab;
            bczNavInfo.icon = info.icon;
            bczNavInfo.show_time = info.show_time;
            bczNavInfo.disappear_time = info.disappear_time;
            return bczNavInfo;
        }
    }

    public static BczNavTabInfos from(BczNavTabs info) {
        List<BczTabInfo> list;
        if (info == null || (list = info.tabs) == null || list.isEmpty()) {
            return null;
        }
        BczNavTabInfos bczNavTabInfos = new BczNavTabInfos();
        bczNavTabInfos.tabs = new ArrayList();
        Iterator<BczTabInfo> it = info.tabs.iterator();
        while (it.hasNext()) {
            bczNavTabInfos.tabs.add(BczNavInfo.from(it.next()));
        }
        return bczNavTabInfos;
    }
}

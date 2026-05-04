package com.baicizhan.client.friend.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.RandomStringCreator;
import com.baicizhan.client.business.webview.BczWebDirector;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.JsonParams;
import com.baicizhan.online.user_assistant_api.ExplorationItem;
import com.baicizhan.online.user_assistant_api.UserAssistantApiService;
import com.jiongji.andriod.card.R;
import ia.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ma.l;
import ma.t;
import org.apache.thrift.TException;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DiscoveryAppItem {
    public static final String TAG = "DiscoveryAppItem";
    public static final String TAG_ZHANJIA = "zhan_campaign";

    @DrawableRes
    public int iconRes;
    public String iconUrl;
    public Class<? extends Activity> jumpActivity;
    public IJumpTo jumpTo;
    public String jumpUrl;
    public String statTag;
    public String subtitle;
    public String title;
    public static final IJumpTo DEFAULT_URL_JUMP = new IJumpTo() { // from class: com.baicizhan.client.friend.model.DiscoveryAppItem.1
        @Override // com.baicizhan.client.friend.model.DiscoveryAppItem.IJumpTo
        public void jumpto(Context context, DiscoveryAppItem item, Bundle extras) {
            if (TextUtils.isEmpty(item.jumpUrl)) {
                c.d(DiscoveryAppItem.TAG, "jumpto failed for empty jump url.", new Object[0]);
            } else {
                new BczWebDirector.Builder().setDefaultUrl(item.jumpUrl).setTitle(item.title).setUrlStrategy(0).setNeedCache(item.needCache).build().goToWeb(context);
            }
        }
    };
    public static final IJumpTo DEFAULT_ACTIVITY_JUMP = new IJumpTo() { // from class: com.baicizhan.client.friend.model.DiscoveryAppItem.2
        @Override // com.baicizhan.client.friend.model.DiscoveryAppItem.IJumpTo
        public void jumpto(Context context, DiscoveryAppItem item, Bundle extras) {
            if (item.jumpActivity == null) {
                c.d(DiscoveryAppItem.TAG, "jumpto failed for jump activity is null.", new Object[0]);
                return;
            }
            Intent intent = new Intent(context, item.jumpActivity);
            if (extras != null) {
                intent.putExtras(extras);
            }
            context.startActivity(intent);
        }
    };
    private static final String[] DEPRECATED_LIST = {"http://hobby.baicizhan.com/hobby_index"};
    public boolean needCache = false;
    public boolean hasNew = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface IJumpTo {
        void jumpto(Context context, DiscoveryAppItem item, Bundle extras);
    }

    public static boolean checkNewOfZhanjia() {
        int c11 = a.c(a.f60470u);
        int sCampaignUpdateTime = BczWebHelperKt.getSCampaignUpdateTime();
        return sCampaignUpdateTime > c11 && sCampaignUpdateTime > 0;
    }

    public static List<DiscoveryAppItem> loadDefaultItems(Context context) {
        ArrayList arrayList = new ArrayList(4);
        HashMap hashMap = new HashMap();
        hashMap.put("id", "1");
        DiscoveryAppItem discoveryAppItem = new DiscoveryAppItem();
        discoveryAppItem.iconRes = R.drawable.ic_discovery_tutorials;
        discoveryAppItem.title = "小讲堂";
        discoveryAppItem.subtitle = "有趣的英语知识点";
        Locale locale = Locale.US;
        discoveryAppItem.jumpUrl = String.format(locale, "%s/little_class?device_name=%s&night_mode=%s", PathUtil.getDataDns(), "android", "false");
        IJumpTo iJumpTo = DEFAULT_URL_JUMP;
        discoveryAppItem.jumpTo = iJumpTo;
        discoveryAppItem.statTag = JsonParams.WebActivityIntentI.TYPE_LITTLE_CLASS;
        discoveryAppItem.needCache = true;
        arrayList.add(discoveryAppItem);
        hashMap.put("tag", discoveryAppItem.statTag);
        hashMap.put("adv_id", discoveryAppItem.statTag);
        l.e(t.f73020s, ma.a.X1, hashMap);
        DiscoveryAppItem discoveryAppItem2 = new DiscoveryAppItem();
        discoveryAppItem2.iconRes = R.drawable.ic_discovery_class;
        discoveryAppItem2.title = "学习小班";
        discoveryAppItem2.subtitle = "一起结伴背单词";
        discoveryAppItem2.jumpUrl = String.format(locale, context.getResources().getString(R.string.url_friend_group), RandomStringCreator.bornNumCharString());
        discoveryAppItem2.jumpTo = iJumpTo;
        discoveryAppItem2.statTag = "subcompartment";
        discoveryAppItem2.needCache = true;
        arrayList.add(discoveryAppItem2);
        hashMap.put("tag", discoveryAppItem2.statTag);
        hashMap.put("adv_id", discoveryAppItem2.statTag);
        l.e(t.f73020s, ma.a.X1, hashMap);
        DiscoveryAppItem discoveryAppItem3 = new DiscoveryAppItem();
        discoveryAppItem3.iconRes = R.drawable.ic_discovery_pk;
        discoveryAppItem3.title = "单词对战";
        discoveryAppItem3.subtitle = "排位赛 & 练习赛";
        discoveryAppItem3.jumpTo = new IJumpTo() { // from class: com.baicizhan.client.friend.model.DiscoveryAppItem.4
            @Override // com.baicizhan.client.friend.model.DiscoveryAppItem.IJumpTo
            public void jumpto(Context context2, DiscoveryAppItem item, Bundle extras) {
                BczWebExecutorKt.startNormalWeb(context2, BczWebExecutorKt.URL_PK, "单词对战");
            }
        };
        discoveryAppItem3.statTag = "pk";
        arrayList.add(discoveryAppItem3);
        hashMap.put("tag", discoveryAppItem3.statTag);
        hashMap.put("adv_id", discoveryAppItem3.statTag);
        l.e(t.f73020s, ma.a.X1, hashMap);
        DiscoveryAppItem discoveryAppItem4 = new DiscoveryAppItem();
        discoveryAppItem4.iconRes = R.drawable.ic_discovery_campaign;
        discoveryAppItem4.title = "斩家活动";
        discoveryAppItem4.subtitle = "参与活动赢铜板";
        discoveryAppItem4.jumpTo = new IJumpTo() { // from class: com.baicizhan.client.friend.model.DiscoveryAppItem.5
            @Override // com.baicizhan.client.friend.model.DiscoveryAppItem.IJumpTo
            public void jumpto(Context context2, DiscoveryAppItem item, Bundle extras) {
                BczWebHelperKt.startCampaign(context2);
            }
        };
        discoveryAppItem4.statTag = TAG_ZHANJIA;
        discoveryAppItem4.hasNew = checkNewOfZhanjia();
        arrayList.add(discoveryAppItem4);
        hashMap.put("tag", discoveryAppItem4.statTag);
        hashMap.put("adv_id", discoveryAppItem4.statTag);
        l.e(t.f73020s, ma.a.X1, hashMap);
        return arrayList;
    }

    public static rx.c<List<DiscoveryAppItem>> loadItems(Context context) {
        return loadOnlineItems(context);
    }

    public static rx.c<List<DiscoveryAppItem>> loadOnlineItems(final Context context) {
        return p.a(new com.baicizhan.client.business.thrift.l("/rpc/assistant")).b2(new wb0.p<UserAssistantApiService.Client, rx.c<List<ExplorationItem>>>() { // from class: com.baicizhan.client.friend.model.DiscoveryAppItem.7
            @Override // wb0.p
            public rx.c<List<ExplorationItem>> call(UserAssistantApiService.Client client) {
                try {
                    return rx.c.M2(client.get_exploration_items());
                } catch (TException e11) {
                    c.d(DiscoveryAppItem.TAG, "loadOnlineItems failed. " + e11, new Object[0]);
                    return rx.c.T1(e11);
                }
            }
        }).c3(new wb0.p<List<ExplorationItem>, List<DiscoveryAppItem>>() { // from class: com.baicizhan.client.friend.model.DiscoveryAppItem.6
            @Override // wb0.p
            public List<DiscoveryAppItem> call(List<ExplorationItem> bbExplorationItems) {
                if (bbExplorationItems == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(bbExplorationItems.size());
                HashMap hashMap = new HashMap();
                hashMap.put("id", "1");
                for (ExplorationItem explorationItem : bbExplorationItems) {
                    String[] strArr = DiscoveryAppItem.DEPRECATED_LIST;
                    int length = strArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            DiscoveryAppItem discoveryAppItem = new DiscoveryAppItem();
                            discoveryAppItem.iconUrl = explorationItem.icon_url;
                            discoveryAppItem.title = explorationItem.title;
                            discoveryAppItem.subtitle = explorationItem.subtitle;
                            discoveryAppItem.jumpUrl = explorationItem.jump_url;
                            String str = explorationItem.item_tag;
                            discoveryAppItem.statTag = str;
                            discoveryAppItem.jumpTo = DiscoveryAppItem.DEFAULT_URL_JUMP;
                            hashMap.put("tag", str);
                            hashMap.put("adv_id", discoveryAppItem.statTag);
                            l.e(t.f73020s, ma.a.X1, hashMap);
                            arrayList.add(discoveryAppItem);
                            break;
                        }
                        if (TextUtils.equals(strArr[i11], explorationItem.jump_url)) {
                            break;
                        }
                        i11++;
                    }
                }
                return arrayList;
            }
        }).w5(bc0.c.e());
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 instanceof DiscoveryAppItem) {
            return Objects.equals(this.statTag, ((DiscoveryAppItem) o11).statTag);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.statTag);
    }

    public String toString() {
        return new JsonSerializer(new bp.a<DiscoveryAppItem>() { // from class: com.baicizhan.client.friend.model.DiscoveryAppItem.3
        }.getType()).writeToJson(this);
    }
}

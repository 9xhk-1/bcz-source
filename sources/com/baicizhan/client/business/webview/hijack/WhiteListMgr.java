package com.baicizhan.client.business.webview.hijack;

import android.text.TextUtils;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.webview.hijack.WhiteListMgr;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import rx.c;
import vb0.a;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WhiteListMgr {
    public static final String TAG = "WhiteListMgr";
    private static WhiteListMgr msInstance;
    private List<String> mWiteList;

    private WhiteListMgr() {
        defaultList();
    }

    private void defaultList() {
        ArrayList arrayList = new ArrayList(64);
        arrayList.add("^(https?://)?([a-z0-9_-]+\\.)*baicizhan.((com)|(org))((/|\\?).*)?");
        arrayList.add("^(https?://)?([a-z0-9_-]+\\.)*bczcdn.com((/|\\?).*)?");
        arrayList.add("^.*bczeducation\\.cn.*$");
        arrayList.add("^.*\\.qlogo.cn((/|\\?).*)?");
        arrayList.add("^.*\\.sinaimg.cn((/|\\?).*)?");
        arrayList.add("^.*jinshuju.net((/|\\?).*)?");
        arrayList.add("^.*jinshuju\\.com.*$");
        arrayList.add("^.*jinshujucdn.com((/|\\?).*)?");
        arrayList.add("^.*jinshujufiles\\.com.*$");
        arrayList.add("^.*nr-data\\.net.*$");
        arrayList.add("^.*newrelic\\.com.*$");
        arrayList.add("^.*taobao\\.com.*$");
        arrayList.add("^.*tmall\\.com.*$");
        arrayList.add("^.*wap\\.cmpassport\\.com.*$");
        arrayList.add("^.*ms\\.zzx9\\.cn.*$");
        arrayList.add("^.*e\\.189\\.cn.*$");
        arrayList.add("^.*id.189.cn.*$");
        arrayList.add("^.*www\\.wjx\\.cn.*$");
        arrayList.add("^.*qlogo\\.cn.*$");
        arrayList.add("^.*aliyuncs\\.com.*$");
        arrayList.add("^.*qpic\\.cn.*$");
        arrayList.add("^.*qq\\.com.*$");
        arrayList.add("^.*aliyun\\.com.*$");
        arrayList.add("^.*frientor\\.cn.*$");
        arrayList.add("^.*beian.miit.gov\\.cn.*$");
        arrayList.add("^.*duiba\\.com.*$");
        arrayList.add("^.*alipay\\.com.*$");
        arrayList.add("^.*tenpay\\.com.*$");
        arrayList.add("^.*songzhaopian\\.com.*$");
        arrayList.add("^.*songzhaopian\\.cn.*$");
        arrayList.add("^.*huatu\\.com.*$");
        arrayList.add("^.*youku\\.com.*$");
        arrayList.add("^.*bilibili\\.com.*$");
        arrayList.add("^.*eeext\\.com.*$");
        arrayList.add("^.*dushu365\\.com.*$");
        arrayList.add("^.*meitu\\.com.*$");
        arrayList.add("^.*amap\\.com.*$");
        arrayList.add("^.*youzan\\.com.*$");
        arrayList.add("^.*gotokeep\\.com.*$");
        arrayList.add("^.*htexam\\.com.*$");
        arrayList.add("^.*alicdn\\.com.*$");
        arrayList.add("^.*hdslb\\.com.*$");
        arrayList.add("^.*jsdelivr\\.net.*$");
        arrayList.add("^.*bdimg\\.com.*$");
        arrayList.add("^.*alipayobjects\\.com.*$");
        arrayList.add("^.*yzcdn\\.cn.*$");
        arrayList.add("^.*127\\.net.*$");
        arrayList.add("^.*126\\.net.*$");
        arrayList.add("^.*163\\.com.*$");
        arrayList.add("^.*163\\.org.*$");
        arrayList.add("^.*yinge\\.cn.*$");
        arrayList.add("^.*yinge\\.cc.*$");
        arrayList.add("^.*mmstat\\.com.*$");
        arrayList.add("^.*alibaba\\.com.*$");
        arrayList.add("^.*aliapp\\.org.*$");
        arrayList.add("^.*fengkongcloud\\.com.*$");
        arrayList.add("^.*portal101\\.cn.*$");
        arrayList.add("^.*bdstatic\\.com.*$");
        arrayList.add("^.*youzanyun\\.com.*$");
        arrayList.add("^.*keepcdn\\.com.*$");
        arrayList.add("^.*cloud\\.ssapi\\.cn.*$");
        this.mWiteList = arrayList;
    }

    public static WhiteListMgr inst() {
        if (msInstance == null) {
            synchronized (WhiteListMgr.class) {
                try {
                    if (msInstance == null) {
                        msInstance = new WhiteListMgr();
                    }
                } finally {
                }
            }
        }
        return msInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$requestWhiteList$0(BczSystemApiService.Client client) {
        try {
            this.mWiteList = client.get_domain_whitelist();
            return Boolean.TRUE;
        } catch (Exception e11) {
            throw a.c(e11);
        }
    }

    public boolean inWhiteList(String url) {
        if ((DebugConfig.getsIntance().enable && !DebugConfig.getsIntance().webWhiteListEnable) || e.h(this.mWiteList) || TextUtils.isEmpty(url)) {
            return true;
        }
        Iterator<String> it = this.mWiteList.iterator();
        while (it.hasNext()) {
            if (Pattern.compile(it.next(), 2).matcher(url).matches()) {
                return true;
            }
        }
        return false;
    }

    public c<Boolean> requestWhiteList() {
        return p.a(new l("/rpc/bcz_system")).c3(new wb0.p() { // from class: ua.a
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean lambda$requestWhiteList$0;
                lambda$requestWhiteList$0 = WhiteListMgr.this.lambda$requestWhiteList$0((BczSystemApiService.Client) obj);
                return lambda$requestWhiteList$0;
            }
        }).w5(bc0.c.e());
    }
}

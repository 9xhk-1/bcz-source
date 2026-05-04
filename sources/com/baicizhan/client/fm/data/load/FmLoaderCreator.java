package com.baicizhan.client.fm.data.load;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.fm.data.FmList;
import com.baicizhan.client.fm.data.FmMidList;
import com.baicizhan.client.fm.data.db.FmDBAccessObservables;
import com.baicizhan.client.fm.data.load.FmListLoader;
import com.baicizhan.online.resource_api.ResourceService;
import i9.o;
import java.util.List;
import qb.c;
import rb.d;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmLoaderCreator {
    public static final int ERR_META_MISSED = -8;
    public static final int ERR_MOBILE_NET = -6;
    public static final int ERR_MOBILE_NET_HAS_OFFLINE = -7;
    public static final int ERR_NETWORKS = -5;
    public static final int ERR_NOFM = -3;
    public static final int ERR_OFFLINE = -1;
    public static final int ERR_OFFLINE_NO_FM = -2;
    public static final int ERR_USR_CANCEL = -4;
    public static final int NO_ERR = 0;
    public static final String TAG = "FmLoaderCreator";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FmMetaData {
        public int errCode;
        public FmLoader<FmList> fmloader;
        public FmLoader<FmMidList> midloader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int adaptErrCode(Context context, FmList list, int origCode) {
        if (list == null || list.isEmpty()) {
            return -3;
        }
        boolean hasOfflineFms = hasOfflineFms(list);
        int b11 = d.b(context);
        c.i(TAG, "current hasOfflineFms:" + hasOfflineFms + "netType:" + b11, new Object[0]);
        return b11 != 0 ? (b11 == 1 || b11 == 2 || b11 == 3 || b11 == 4) ? hasOfflineFms ? -7 : -6 : hasOfflineFms ? -1 : -2 : origCode;
    }

    public static rx.c<FmMetaData> create(final Context context, final int bookId, int playCount) {
        return FmListLoader.loadFmList(context, bookId, playCount).b2(new p<FmListLoader.FmListParams, rx.c<FmMetaData>>() { // from class: com.baicizhan.client.fm.data.load.FmLoaderCreator.2
            @Override // wb0.p
            public rx.c<FmMetaData> call(FmListLoader.FmListParams params) {
                return FmLoaderCreator.getFmMetaData(context, bookId, params);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static rx.c<FmMetaData> getFmMetaData(final Context context, final int bookId, final FmListLoader.FmListParams params) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/resource_api").c(1).b(3000).d(3000)).w5(bc0.c.e()).c3(new p<ResourceService.Client, FmMetaData>() { // from class: com.baicizhan.client.fm.data.load.FmLoaderCreator.3
            @Override // wb0.p
            public FmMetaData call(ResourceService.Client client) {
                FmMetaData fmMetaData = new FmMetaData();
                FmLoader<FmList> fmLoader = new FmLoader<>();
                fmMetaData.fmloader = fmLoader;
                fmLoader.mTargets = FmListLoader.FmListParams.this.list;
                FmLoader<FmMidList> fmLoader2 = new FmLoader<>();
                fmMetaData.midloader = fmLoader2;
                FmListLoader.FmListParams fmListParams = FmListLoader.FmListParams.this;
                fmLoader2.mTargets = fmListParams.midlist;
                FmList fmList = fmListParams.list;
                if (fmList == null || fmList.isEmpty()) {
                    fmMetaData.errCode = o.s(context, bookId) ? -8 : -3;
                    return fmMetaData;
                }
                List<String> born = fmMetaData.fmloader.mTargets.born();
                if (born != null && !born.isEmpty()) {
                    try {
                        List<WordMediaRecord> h11 = j9.a.h(l9.a.a(born), client);
                        o.r(context, bookId, h11);
                        FmList fmList2 = fmMetaData.fmloader.mTargets;
                        if (fmList2 != null) {
                            fmList2.completeBorn(h11);
                            c.i(FmLoaderCreator.TAG, "get fm list, after inserted and complete born [%s]", fmMetaData.fmloader.mTargets.toString());
                            if (fmMetaData.fmloader.mTargets.isEmpty()) {
                                fmMetaData.errCode = -3;
                            }
                        } else {
                            fmMetaData.errCode = -3;
                        }
                    } catch (Exception unused) {
                        fmMetaData.errCode = -5;
                    }
                }
                fmMetaData.errCode = FmLoaderCreator.adaptErrCode(context, fmMetaData.fmloader.mTargets, fmMetaData.errCode);
                c.i(FmLoaderCreator.TAG, "getFmMetaData metaData errCode:" + fmMetaData.errCode, new Object[0]);
                return fmMetaData;
            }
        });
    }

    private static boolean hasOfflineFms(FmList list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (list.getLocalPath(i11) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static rx.c<FmMetaData> updateAndCreate(final Context context, final int bookId, final FmList updateList, final int playCount) {
        return FmDBAccessObservables.updateFmLearnRecords(context, bookId, updateList).b2(new p<Boolean, rx.c<FmMetaData>>() { // from class: com.baicizhan.client.fm.data.load.FmLoaderCreator.1
            @Override // wb0.p
            public rx.c<FmMetaData> call(Boolean aBoolean) {
                return FmLoaderCreator.create(context, bookId, playCount);
            }
        });
    }
}

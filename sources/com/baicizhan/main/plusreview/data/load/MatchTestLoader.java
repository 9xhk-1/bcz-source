package com.baicizhan.main.plusreview.data.load;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.main.plusreview.data.MatchTestlib;
import com.baicizhan.main.plusreview.data.db.MatchResultHelper;
import com.baicizhan.main.plusreview.data.db.MatchResultRecord;
import com.baicizhan.online.bs_users.BSUsers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import q9.x;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MatchTestLoader {
    private static final String DATA_LOCAL_PATH_BASE = "phrase_match_test";
    public static final int ERR_DB = -3;
    public static final int ERR_NET = -1;
    public static final int ERR_NO_DATA = -2;
    public static final int NO_ERR = 0;
    private Context mContext;
    private OnDataSyncListener mDataSyncListener;
    private OnDownloadListener mLoadListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LoadRequest extends ThriftRequest<BSUsers.Client, MatchTestlib> {
        final boolean retry;
        final WeakReference<MatchTestLoader> weakLoader;

        public LoadRequest(MatchTestLoader loader, boolean retry) {
            super("/rpc/users");
            this.weakLoader = new WeakReference<>(loader);
            this.retry = retry;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            MatchTestLoader matchTestLoader = this.weakLoader.get();
            if (matchTestLoader == null) {
                return;
            }
            Log.d("whiz", "get match data err: " + exception);
            if (matchTestLoader.mLoadListener == null || matchTestLoader.mContext == null) {
                return;
            }
            if (exception instanceof SQLiteException) {
                matchTestLoader.mLoadListener.onTestlibLoaded(false, null, -3);
            } else {
                matchTestLoader.mLoadListener.onTestlibLoaded(false, null, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.baicizhan.main.plusreview.data.MatchTestlib doInBackground(com.baicizhan.online.bs_users.BSUsers.Client r11) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.plusreview.data.load.MatchTestLoader.LoadRequest.doInBackground(com.baicizhan.online.bs_users.BSUsers$Client):com.baicizhan.main.plusreview.data.MatchTestlib");
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onResult(MatchTestlib result) {
            MatchTestLoader matchTestLoader = this.weakLoader.get();
            if (matchTestLoader == null || matchTestLoader.mLoadListener == null || matchTestLoader.mContext == null) {
                return;
            }
            if (result != null && !result.isEmpty()) {
                matchTestLoader.mLoadListener.onTestlibLoaded(true, result, 0);
            } else if (!this.retry) {
                matchTestLoader.mLoadListener.onTestlibLoaded(false, null, -2);
            } else {
                c.i("", "phrase match data getting retry.", new Object[0]);
                matchTestLoader.load(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnDataSyncListener {
        void onTestDataSynced(boolean success, int errCode);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnDownloadListener {
        void onTestlibLoaded(boolean success, MatchTestlib data, int errCode);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SyncRequest extends ThriftRequest<BSUsers.Client, Boolean> {
        private int mErr;
        final Map<Integer, MatchResultRecord> results;
        final WeakReference<MatchTestLoader> weakLoader;

        public SyncRequest(MatchTestLoader loader, Map<Integer, MatchResultRecord> results) {
            super("/rpc/users");
            this.mErr = 0;
            this.weakLoader = new WeakReference<>(loader);
            this.results = results;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            MatchTestLoader matchTestLoader = this.weakLoader.get();
            if (matchTestLoader == null) {
                return;
            }
            Log.d("whiz", "sync match data err: " + exception);
            if (matchTestLoader.mDataSyncListener == null || matchTestLoader.mContext == null) {
                return;
            }
            matchTestLoader.mDataSyncListener.onTestDataSynced(false, -1);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public Boolean doInBackground(BSUsers.Client client) throws Exception {
            MatchTestLoader matchTestLoader = this.weakLoader.get();
            if (matchTestLoader == null) {
                return Boolean.FALSE;
            }
            Map<Integer, MatchResultRecord> map = this.results;
            if (map == null || map.isEmpty()) {
                this.mErr = -2;
                return Boolean.FALSE;
            }
            int l11 = x.r().l();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<Integer, MatchResultRecord>> it = this.results.entrySet().iterator();
            while (it.hasNext()) {
                MatchResultRecord value = it.next().getValue();
                if (value.getResult() != 0) {
                    arrayList.add(Integer.valueOf(value.getTopicId()));
                }
                arrayList2.add(value);
            }
            if (!arrayList.isEmpty()) {
                client.save_word_friend_done_record(l11, arrayList);
            }
            MatchResultHelper.refreshResults(matchTestLoader.mContext, l11, arrayList2);
            this.mErr = 0;
            return Boolean.TRUE;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onResult(Boolean result) {
            MatchTestLoader matchTestLoader = this.weakLoader.get();
            if (matchTestLoader == null || matchTestLoader.mDataSyncListener == null || matchTestLoader.mContext == null) {
                return;
            }
            if (result.booleanValue()) {
                matchTestLoader.mDataSyncListener.onTestDataSynced(true, this.mErr);
            } else {
                matchTestLoader.mDataSyncListener.onTestDataSynced(false, this.mErr);
            }
        }
    }

    private MatchTestLoader() {
    }

    public static MatchTestLoader createInstance(Context context, OnDownloadListener dnL) {
        return createInstance(context, dnL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDataLocalPath(int bookId) {
        return String.format(Locale.US, "%s_%02d.json", DATA_LOCAL_PATH_BASE, Integer.valueOf(bookId));
    }

    public void destroy() {
        this.mContext = null;
    }

    public void load() {
        load(true);
    }

    public void sync(final Map<Integer, MatchResultRecord> results) {
        com.baicizhan.client.business.thrift.c.b().a(new SyncRequest(this, results));
    }

    public static MatchTestLoader createInstance(Context context, OnDataSyncListener syncL) {
        return createInstance(context, null, syncL);
    }

    public void load(final boolean retry) {
        com.baicizhan.client.business.thrift.c.b().a(new LoadRequest(this, retry));
    }

    public static MatchTestLoader createInstance(Context context, OnDownloadListener dnL, OnDataSyncListener syncL) {
        MatchTestLoader matchTestLoader = new MatchTestLoader();
        matchTestLoader.mContext = context;
        matchTestLoader.mLoadListener = dnL;
        matchTestLoader.mDataSyncListener = syncL;
        return matchTestLoader;
    }
}

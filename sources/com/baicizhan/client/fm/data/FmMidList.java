package com.baicizhan.client.fm.data;

import android.text.TextUtils;
import com.baicizhan.client.business.util.PathUtil;
import gb.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmMidList implements ITargetList<String> {
    private List<String> mDatas;
    private String mHome = PathUtil.getBaicizhanAppRoot();

    public FmMidList(List<String> datas) {
        this.mDatas = datas;
    }

    private String getLocalPathFromData(String data) {
        if (data == null) {
            return null;
        }
        String c11 = d.c(this.mHome + data);
        if (c11 == null) {
            return null;
        }
        File file = new File(c11);
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public void clear() {
        List<String> list = this.mDatas;
        if (list == null) {
            return;
        }
        list.clear();
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public void extractOfflines() {
        if (this.mDatas == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.mDatas) {
            if (!TextUtils.isEmpty(getLocalPathFromData(str))) {
                arrayList.add(str);
            }
        }
        this.mDatas = arrayList;
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public String getLocalPath(int index) {
        return getLocalPathFromData(get(index));
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public String getPath(int index, boolean high) {
        return get(index);
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public String getSavedPath(int index, boolean high) {
        return d.c(this.mHome + getPath(index, high));
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public boolean isEmpty() {
        List<String> list = this.mDatas;
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    public void setDatas(List<String> datas) {
        this.mDatas = datas;
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public int size() {
        List<String> list = this.mDatas;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public String get(int index) {
        List<String> list = this.mDatas;
        if (list == null) {
            return null;
        }
        return list.get(index);
    }
}

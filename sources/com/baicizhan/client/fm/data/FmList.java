package com.baicizhan.client.fm.data;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.fm.data.db.WordInfoRecord;
import gb.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmList implements ITargetList<FmData> {
    private LinkedHashMap<String, FmData> mDatas;
    private String mHome = PathUtil.getBaicizhanAppRoot();
    private Map<String, TopicLearnRecord> mLearnRecordMap;
    private List<String> mSequenceIds;
    private Map<String, FmData> mUnbornDatas;
    private Map<String, WordInfoRecord> mWordInfoRecordMap;
    private Map<String, WordMediaRecord> mWordMediaRecordMap;

    private String getLocalPathFromData(FmData data) {
        if (data == null) {
            return null;
        }
        String c11 = d.c(this.mHome + data.hdpath);
        if (c11 == null) {
            return null;
        }
        File file = new File(c11);
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        String c12 = d.c(this.mHome + data.path);
        if (c12 == null) {
            return null;
        }
        File file2 = new File(c12);
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        return null;
    }

    public boolean adapt() {
        TopicLearnRecord topicLearnRecord;
        List<String> list = this.mSequenceIds;
        if (list == null || list.isEmpty() || this.mWordMediaRecordMap == null) {
            return false;
        }
        this.mDatas = new LinkedHashMap<>(this.mSequenceIds.size());
        this.mUnbornDatas = new HashMap();
        for (String str : this.mSequenceIds) {
            FmData fmData = new FmData();
            fmData.wordid = str;
            Map<String, TopicLearnRecord> map = this.mLearnRecordMap;
            if (map != null && (topicLearnRecord = map.get(str)) != null && 1 == topicLearnRecord.radioPostState) {
                fmData.viewed = topicLearnRecord.radioState;
                fmData.skipped = topicLearnRecord.radioSkipState;
            }
            WordMediaRecord wordMediaRecord = this.mWordMediaRecordMap.get(str);
            if (wordMediaRecord == null) {
                this.mUnbornDatas.put(str, fmData);
            } else if (wordMediaRecord.getFmupdate() > 0) {
                fmData.word = wordMediaRecord.getWord();
                fmData.wordtype = wordMediaRecord.getWordtype();
                fmData.cnmean = wordMediaRecord.getCnmean();
                fmData.example = wordMediaRecord.getExample();
                fmData.path = wordMediaRecord.getFmpath();
                fmData.hdpath = wordMediaRecord.getHighfmpath();
            }
            fmData.setInitedOne(fmData);
            this.mDatas.put(str, fmData);
        }
        return true;
    }

    public List<String> born() {
        if (needBorn()) {
            return new ArrayList(this.mUnbornDatas.keySet());
        }
        return null;
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public void clear() {
        LinkedHashMap<String, FmData> linkedHashMap = this.mDatas;
        if (linkedHashMap == null) {
            return;
        }
        linkedHashMap.clear();
        this.mDatas = null;
        Map<String, FmData> map = this.mUnbornDatas;
        if (map != null) {
            map.clear();
            this.mUnbornDatas = null;
        }
        List<String> list = this.mSequenceIds;
        if (list != null) {
            list.clear();
            this.mSequenceIds = null;
        }
        Map<String, WordInfoRecord> map2 = this.mWordInfoRecordMap;
        if (map2 != null) {
            map2.clear();
            this.mWordInfoRecordMap = null;
        }
        Map<String, WordMediaRecord> map3 = this.mWordMediaRecordMap;
        if (map3 != null) {
            map3.clear();
            this.mWordMediaRecordMap = null;
        }
    }

    public void completeBorn(List<WordMediaRecord> records) {
        int i11;
        c.b("whiz", "complete born before, datas: " + this.mDatas.size(), new Object[0]);
        if (needBorn()) {
            if (records != null) {
                i11 = 0;
                for (WordMediaRecord wordMediaRecord : records) {
                    FmData fmData = this.mUnbornDatas.get(wordMediaRecord.getWordid());
                    if (fmData == null) {
                        c.d("", "an invalid record is put to born [%s]", wordMediaRecord.toString());
                    } else {
                        fmData.path = wordMediaRecord.getFmpath();
                        fmData.hdpath = wordMediaRecord.getHighfmpath();
                        this.mDatas.put(wordMediaRecord.getWordid(), fmData);
                        i11++;
                    }
                }
            } else {
                i11 = 0;
            }
            if (i11 < this.mUnbornDatas.size()) {
                c.d("", "fm data borned failed, some was lost.", new Object[0]);
                for (Map.Entry<String, FmData> entry : this.mUnbornDatas.entrySet()) {
                    FmData value = entry.getValue();
                    if (TextUtils.isEmpty(value.getPath()) && TextUtils.isEmpty(value.getHdpath())) {
                        c.d("", "unborned fm word id: " + ((Object) entry.getKey()), new Object[0]);
                        this.mDatas.remove(entry.getKey());
                    }
                }
            }
            this.mUnbornDatas.clear();
            c.b("whiz", "complete born after, datas: " + this.mDatas.size(), new Object[0]);
        }
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public void extractOfflines() {
        if (this.mDatas == null) {
            return;
        }
        LinkedHashMap<String, FmData> linkedHashMap = new LinkedHashMap<>();
        Iterator<Map.Entry<String, FmData>> it = this.mDatas.entrySet().iterator();
        while (it.hasNext()) {
            FmData value = it.next().getValue();
            if (!TextUtils.isEmpty(getLocalPathFromData(value))) {
                linkedHashMap.put(value.wordid, value);
            }
        }
        this.mDatas = linkedHashMap;
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public String getLocalPath(int index) {
        return getLocalPathFromData(get(index));
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public String getPath(int index, boolean high) {
        FmData fmData = get(index);
        if (fmData == null) {
            return null;
        }
        return high ? fmData.hdpath : fmData.path;
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public String getSavedPath(int index, boolean high) {
        return d.c(this.mHome + getPath(index, high));
    }

    public void injectLearnRecords(List<TopicLearnRecord> records) {
        if (records == null || records.isEmpty()) {
            this.mLearnRecordMap = new HashMap(0);
            return;
        }
        this.mLearnRecordMap = new HashMap(records.size());
        for (TopicLearnRecord topicLearnRecord : records) {
            this.mLearnRecordMap.put(String.valueOf(topicLearnRecord.topicId), topicLearnRecord);
        }
    }

    public void injectSequenceIds(List<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return;
        }
        this.mSequenceIds = new ArrayList(ids);
    }

    public void injectWordInfoRecords(List<WordInfoRecord> records) {
        if (records == null || records.isEmpty()) {
            this.mWordInfoRecordMap = new HashMap(0);
            return;
        }
        this.mWordInfoRecordMap = new HashMap(records.size());
        for (WordInfoRecord wordInfoRecord : records) {
            this.mWordInfoRecordMap.put(wordInfoRecord.getWordid(), wordInfoRecord);
        }
    }

    public void injectWordMediaRecords(List<WordMediaRecord> records) {
        if (records == null || records.isEmpty()) {
            this.mWordMediaRecordMap = new HashMap(0);
            return;
        }
        this.mWordMediaRecordMap = new HashMap(records.size());
        for (WordMediaRecord wordMediaRecord : records) {
            this.mWordMediaRecordMap.put(wordMediaRecord.getWordid(), wordMediaRecord);
        }
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public boolean isEmpty() {
        LinkedHashMap<String, FmData> linkedHashMap = this.mDatas;
        if (linkedHashMap == null) {
            return true;
        }
        return linkedHashMap.isEmpty();
    }

    public boolean needBorn() {
        c.b("whiz", "un born datas: " + this.mUnbornDatas, new Object[0]);
        Map<String, FmData> map = this.mUnbornDatas;
        return (map == null || map.isEmpty()) ? false : true;
    }

    @Override // com.baicizhan.client.fm.data.ITargetList
    public int size() {
        LinkedHashMap<String, FmData> linkedHashMap = this.mDatas;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public String toString() {
        LinkedHashMap<String, FmData> linkedHashMap = this.mDatas;
        return linkedHashMap != null ? linkedHashMap.toString() : super.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baicizhan.client.fm.data.ITargetList
    public FmData get(int index) {
        LinkedHashMap<String, FmData> linkedHashMap = this.mDatas;
        if (linkedHashMap == null) {
            c.b("whiz", "fm list is null", new Object[0]);
            return null;
        }
        int i11 = 0;
        for (Map.Entry<String, FmData> entry : linkedHashMap.entrySet()) {
            if (i11 == index) {
                FmData value = entry.getValue();
                if (value == null) {
                    c.b("whiz", "fm list get null data, just null shit, i: " + i11 + "; index: " + index + "; size: " + this.mDatas.size(), new Object[0]);
                }
                return value;
            }
            i11++;
        }
        c.b("whiz", "fm list get null data, i: " + i11 + "; index: " + index + "; size: " + this.mDatas.size(), new Object[0]);
        return null;
    }
}
